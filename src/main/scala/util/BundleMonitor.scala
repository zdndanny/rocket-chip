// See LICENSE.Berkeley for license details.
// See LICENSE.SiFive for license details.

package freechips.rocketchip.util

import freechips.rocketchip.config._
import Chisel._

// Monitor object is used to mark bundles which can
// be observed in simulation.

// The actual implementation of this mechanism is not
// specified. Usually it is specific for a particular
// combination of a generator and a simulator.

// Generator can provide a monitor driver by 
// changing the monitor_driver field.

case object BundleMonitorKey extends Field[Option[(String, Bundle) => Unit]] (None)
