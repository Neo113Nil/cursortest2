package org.chromium.base.power_monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface BatteryPowerStatus {
    public static final int BATTERY_POWER = 1;
    public static final int EXTERNAL_POWER = 2;
    public static final int UNKNOWN = 0;
}
