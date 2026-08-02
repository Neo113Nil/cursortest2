package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont {

    @pmi0("app_font_scale")
    private final Float appFontScale;

    @pmi0("is_high_contrast_text_enabled")
    private final Boolean isHighContrastTextEnabled;

    @pmi0("system_font_scale")
    private final Float systemFontScale;

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont = (MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont) obj;
        return epx.f(this.appFontScale, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont.appFontScale) && epx.f(this.systemFontScale, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont.systemFontScale) && epx.f(this.isHighContrastTextEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont.isHighContrastTextEnabled);
    }

    public final int hashCode() {
        Float f = this.appFontScale;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.systemFontScale;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool = this.isHighContrastTextEnabled;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreAccessibilityFont(appFontScale=");
        sb.append(this.appFontScale);
        sb.append(", systemFontScale=");
        sb.append(this.systemFontScale);
        sb.append(", isHighContrastTextEnabled=");
        return tn.a(sb, this.isHighContrastTextEnabled, ')');
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(Float f, Float f2, Boolean bool) {
        this.appFontScale = f;
        this.systemFontScale = f2;
        this.isHighContrastTextEnabled = bool;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont(Float f, Float f2, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : bool);
    }
}
