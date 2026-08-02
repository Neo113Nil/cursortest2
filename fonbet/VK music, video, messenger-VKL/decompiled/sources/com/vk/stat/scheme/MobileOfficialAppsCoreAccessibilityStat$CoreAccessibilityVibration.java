package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration {

    @pmi0("is_haptic_vibration_enabled")
    private final Boolean isHapticVibrationEnabled;

    @pmi0("is_notification_vibration_enabled")
    private final Boolean isNotificationVibrationEnabled;

    @pmi0("is_ringing_vibration_enabled")
    private final Boolean isRingingVibrationEnabled;

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration = (MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration) obj;
        return epx.f(this.isRingingVibrationEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration.isRingingVibrationEnabled) && epx.f(this.isNotificationVibrationEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration.isNotificationVibrationEnabled) && epx.f(this.isHapticVibrationEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration.isHapticVibrationEnabled);
    }

    public final int hashCode() {
        Boolean bool = this.isRingingVibrationEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isNotificationVibrationEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isHapticVibrationEnabled;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreAccessibilityVibration(isRingingVibrationEnabled=");
        sb.append(this.isRingingVibrationEnabled);
        sb.append(", isNotificationVibrationEnabled=");
        sb.append(this.isNotificationVibrationEnabled);
        sb.append(", isHapticVibrationEnabled=");
        return tn.a(sb, this.isHapticVibrationEnabled, ')');
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(Boolean bool, Boolean bool2, Boolean bool3) {
        this.isRingingVibrationEnabled = bool;
        this.isNotificationVibrationEnabled = bool2;
        this.isHapticVibrationEnabled = bool3;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration(Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
