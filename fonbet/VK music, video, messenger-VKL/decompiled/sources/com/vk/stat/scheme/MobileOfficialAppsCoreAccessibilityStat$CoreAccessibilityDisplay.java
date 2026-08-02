package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay {

    @pmi0("animations")
    private final Boolean animations;

    @pmi0("brightness")
    private final MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness brightness;

    @pmi0("color_correction")
    private final MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection colorCorrection;

    @pmi0("scale")
    private final Float scale;

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay = (MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay) obj;
        return epx.f(this.brightness, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay.brightness) && epx.f(this.scale, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay.scale) && epx.f(this.animations, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay.animations) && epx.f(this.colorCorrection, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay.colorCorrection);
    }

    public final int hashCode() {
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness = this.brightness;
        int hashCode = (mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness == null ? 0 : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness.hashCode()) * 31;
        Float f = this.scale;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.animations;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection = this.colorCorrection;
        return hashCode3 + (mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection != null ? mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.hashCode() : 0);
    }

    public final String toString() {
        return "CoreAccessibilityDisplay(brightness=" + this.brightness + ", scale=" + this.scale + ", animations=" + this.animations + ", colorCorrection=" + this.colorCorrection + ')';
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness, Float f, Boolean bool, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection) {
        this.brightness = mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness;
        this.scale = f;
        this.animations = bool;
        this.colorCorrection = mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay(MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness, Float f, Boolean bool, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityBrightness, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection);
    }
}
