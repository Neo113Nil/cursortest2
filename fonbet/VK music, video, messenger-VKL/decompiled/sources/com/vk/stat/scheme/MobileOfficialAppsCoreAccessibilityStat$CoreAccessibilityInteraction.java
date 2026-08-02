package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction {

    @pmi0("is_accessibility_menu_enabled")
    private final Boolean isAccessibilityMenuEnabled;

    @pmi0("is_big_mouse_pointer_enabled")
    private final Boolean isBigMousePointerEnabled;

    @pmi0("is_magnification_enabled")
    private final Boolean isMagnificationEnabled;

    @pmi0("is_one_hand_mode_enabled")
    private final Boolean isOneHandModeEnabled;

    @pmi0("is_select_to_speak_enabled")
    private final Boolean isSelectToSpeakEnabled;

    @pmi0("is_switch_access_enabled")
    private final Boolean isSwitchAccessEnabled;

    @pmi0("is_talkback_enabled")
    private final Boolean isTalkbackEnabled;

    @pmi0("vibration")
    private final MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration vibration;

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction = (MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction) obj;
        return epx.f(this.isMagnificationEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.isMagnificationEnabled) && epx.f(this.isSelectToSpeakEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.isSelectToSpeakEnabled) && epx.f(this.isSwitchAccessEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.isSwitchAccessEnabled) && epx.f(this.isBigMousePointerEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.isBigMousePointerEnabled) && epx.f(this.isAccessibilityMenuEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.isAccessibilityMenuEnabled) && epx.f(this.isTalkbackEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.isTalkbackEnabled) && epx.f(this.isOneHandModeEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.isOneHandModeEnabled) && epx.f(this.vibration, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.vibration);
    }

    public final int hashCode() {
        Boolean bool = this.isMagnificationEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isSelectToSpeakEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSwitchAccessEnabled;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBigMousePointerEnabled;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isAccessibilityMenuEnabled;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isTalkbackEnabled;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isOneHandModeEnabled;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration = this.vibration;
        return hashCode7 + (mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration != null ? mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration.hashCode() : 0);
    }

    public final String toString() {
        return "CoreAccessibilityInteraction(isMagnificationEnabled=" + this.isMagnificationEnabled + ", isSelectToSpeakEnabled=" + this.isSelectToSpeakEnabled + ", isSwitchAccessEnabled=" + this.isSwitchAccessEnabled + ", isBigMousePointerEnabled=" + this.isBigMousePointerEnabled + ", isAccessibilityMenuEnabled=" + this.isAccessibilityMenuEnabled + ", isTalkbackEnabled=" + this.isTalkbackEnabled + ", isOneHandModeEnabled=" + this.isOneHandModeEnabled + ", vibration=" + this.vibration + ')';
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration) {
        this.isMagnificationEnabled = bool;
        this.isSelectToSpeakEnabled = bool2;
        this.isSwitchAccessEnabled = bool3;
        this.isBigMousePointerEnabled = bool4;
        this.isAccessibilityMenuEnabled = bool5;
        this.isTalkbackEnabled = bool6;
        this.isOneHandModeEnabled = bool7;
        this.vibration = mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityVibration);
    }
}
