package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection {

    @pmi0("bright_color")
    private final Boolean brightColor;

    @pmi0("color_mode")
    private final ColorMode colorMode;

    @pmi0("daltonizer_enabled")
    private final Boolean daltonizerEnabled;

    @pmi0("daltonizer_mode")
    private final DaltonizerMode daltonizerMode;

    @pmi0("inverse")
    private final Boolean inverse;

    @pmi0("night_mode_activated")
    private final Boolean nightModeActivated;

    @pmi0("night_mode_auto_enabled")
    private final Boolean nightModeAutoEnabled;

    @pmi0("white_balance")
    private final Boolean whiteBalance;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
    public static final class ColorMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorMode[] $VALUES;

        @pmi0("automatic")
        public static final ColorMode AUTOMATIC;

        @pmi0("boosted")
        public static final ColorMode BOOSTED;

        @pmi0("natural")
        public static final ColorMode NATURAL;

        @pmi0("saturated")
        public static final ColorMode SATURATED;

        static {
            ColorMode colorMode = new ColorMode("NATURAL", 0);
            NATURAL = colorMode;
            ColorMode colorMode2 = new ColorMode("BOOSTED", 1);
            BOOSTED = colorMode2;
            ColorMode colorMode3 = new ColorMode("SATURATED", 2);
            SATURATED = colorMode3;
            ColorMode colorMode4 = new ColorMode("AUTOMATIC", 3);
            AUTOMATIC = colorMode4;
            ColorMode[] colorModeArr = {colorMode, colorMode2, colorMode3, colorMode4};
            $VALUES = colorModeArr;
            $ENTRIES = new asp(colorModeArr);
        }

        private ColorMode(String str, int i) {
        }

        public static ColorMode valueOf(String str) {
            return (ColorMode) Enum.valueOf(ColorMode.class, str);
        }

        public static ColorMode[] values() {
            return (ColorMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
    public static final class DaltonizerMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DaltonizerMode[] $VALUES;

        @pmi0("deuteranomaly")
        public static final DaltonizerMode DEUTERANOMALY;

        @pmi0("protanomaly")
        public static final DaltonizerMode PROTANOMALY;

        @pmi0("tritanomaly")
        public static final DaltonizerMode TRITANOMALY;

        static {
            DaltonizerMode daltonizerMode = new DaltonizerMode("PROTANOMALY", 0);
            PROTANOMALY = daltonizerMode;
            DaltonizerMode daltonizerMode2 = new DaltonizerMode("DEUTERANOMALY", 1);
            DEUTERANOMALY = daltonizerMode2;
            DaltonizerMode daltonizerMode3 = new DaltonizerMode("TRITANOMALY", 2);
            TRITANOMALY = daltonizerMode3;
            DaltonizerMode[] daltonizerModeArr = {daltonizerMode, daltonizerMode2, daltonizerMode3};
            $VALUES = daltonizerModeArr;
            $ENTRIES = new asp(daltonizerModeArr);
        }

        private DaltonizerMode(String str, int i) {
        }

        public static DaltonizerMode valueOf(String str) {
            return (DaltonizerMode) Enum.valueOf(DaltonizerMode.class, str);
        }

        public static DaltonizerMode[] values() {
            return (DaltonizerMode[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection = (MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection) obj;
        return epx.f(this.inverse, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.inverse) && epx.f(this.nightModeActivated, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.nightModeActivated) && epx.f(this.nightModeAutoEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.nightModeAutoEnabled) && this.colorMode == mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.colorMode && epx.f(this.whiteBalance, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.whiteBalance) && epx.f(this.daltonizerEnabled, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.daltonizerEnabled) && this.daltonizerMode == mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.daltonizerMode && epx.f(this.brightColor, mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection.brightColor);
    }

    public final int hashCode() {
        Boolean bool = this.inverse;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.nightModeActivated;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.nightModeAutoEnabled;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ColorMode colorMode = this.colorMode;
        int hashCode4 = (hashCode3 + (colorMode == null ? 0 : colorMode.hashCode())) * 31;
        Boolean bool4 = this.whiteBalance;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.daltonizerEnabled;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        DaltonizerMode daltonizerMode = this.daltonizerMode;
        int hashCode7 = (hashCode6 + (daltonizerMode == null ? 0 : daltonizerMode.hashCode())) * 31;
        Boolean bool6 = this.brightColor;
        return hashCode7 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreAccessibilityColorCorrection(inverse=");
        sb.append(this.inverse);
        sb.append(", nightModeActivated=");
        sb.append(this.nightModeActivated);
        sb.append(", nightModeAutoEnabled=");
        sb.append(this.nightModeAutoEnabled);
        sb.append(", colorMode=");
        sb.append(this.colorMode);
        sb.append(", whiteBalance=");
        sb.append(this.whiteBalance);
        sb.append(", daltonizerEnabled=");
        sb.append(this.daltonizerEnabled);
        sb.append(", daltonizerMode=");
        sb.append(this.daltonizerMode);
        sb.append(", brightColor=");
        return tn.a(sb, this.brightColor, ')');
    }

    public MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(Boolean bool, Boolean bool2, Boolean bool3, ColorMode colorMode, Boolean bool4, Boolean bool5, DaltonizerMode daltonizerMode, Boolean bool6) {
        this.inverse = bool;
        this.nightModeActivated = bool2;
        this.nightModeAutoEnabled = bool3;
        this.colorMode = colorMode;
        this.whiteBalance = bool4;
        this.daltonizerEnabled = bool5;
        this.daltonizerMode = daltonizerMode;
        this.brightColor = bool6;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityColorCorrection(Boolean bool, Boolean bool2, Boolean bool3, ColorMode colorMode, Boolean bool4, Boolean bool5, DaltonizerMode daltonizerMode, Boolean bool6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : colorMode, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : daltonizerMode, (i & 128) != 0 ? null : bool6);
    }
}
