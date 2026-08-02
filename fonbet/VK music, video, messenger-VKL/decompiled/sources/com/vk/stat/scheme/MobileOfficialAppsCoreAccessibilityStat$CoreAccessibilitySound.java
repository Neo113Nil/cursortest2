package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound {

    @pmi0("is_captions_enabled")
    private final Boolean isCaptionsEnabled;

    @pmi0("is_hearing_aid_enabled")
    private final Boolean isHearingAidEnabled;

    @pmi0("is_mono_sound_enabled")
    private final Boolean isMonoSoundEnabled;

    @pmi0("sound_balance")
    private final Float soundBalance;

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound = (MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound) obj;
        return epx.f(this.isMonoSoundEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound.isMonoSoundEnabled) && epx.f(this.soundBalance, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound.soundBalance) && epx.f(this.isHearingAidEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound.isHearingAidEnabled) && epx.f(this.isCaptionsEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound.isCaptionsEnabled);
    }

    public final int hashCode() {
        Boolean bool = this.isMonoSoundEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Float f = this.soundBalance;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool2 = this.isHearingAidEnabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCaptionsEnabled;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreAccessibilitySound(isMonoSoundEnabled=");
        sb.append(this.isMonoSoundEnabled);
        sb.append(", soundBalance=");
        sb.append(this.soundBalance);
        sb.append(", isHearingAidEnabled=");
        sb.append(this.isHearingAidEnabled);
        sb.append(", isCaptionsEnabled=");
        return tn.a(sb, this.isCaptionsEnabled, ')');
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(Boolean bool, Float f, Boolean bool2, Boolean bool3) {
        this.isMonoSoundEnabled = bool;
        this.soundBalance = f;
        this.isHearingAidEnabled = bool2;
        this.isCaptionsEnabled = bool3;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound(Boolean bool, Float f, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3);
    }
}
