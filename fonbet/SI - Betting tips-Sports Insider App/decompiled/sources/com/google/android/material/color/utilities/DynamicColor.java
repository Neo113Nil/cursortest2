package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z5, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, DynamicColor> function4, ContrastCurve contrastCurve, Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z5;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public static double enableLightForeground(double d10) {
        if (!tonePrefersLightForeground(d10) || toneAllowsLightForeground(d10)) {
            return d10;
        }
        return 49.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double foregroundTone(double d10, double d11) {
        double lighterUnsafe = Contrast.lighterUnsafe(d10, d11);
        double darkerUnsafe = Contrast.darkerUnsafe(d10, d11);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d10);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d10);
        if (tonePrefersLightForeground(d10)) {
            return (ratioOfTones >= d11 || ratioOfTones >= ratioOfTones2 || ((Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d11 ? 1 : (ratioOfTones == d11 ? 0 : -1)) < 0 && (ratioOfTones2 > d11 ? 1 : (ratioOfTones2 == d11 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        if (ratioOfTones2 >= d11 || ratioOfTones2 >= ratioOfTones) {
        }
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i5) {
        return fromPalette(str, new a(0, TonalPalette.fromInt(i5)), new a(1, Hct.fromInt(i5)));
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public static boolean toneAllowsLightForeground(double d10) {
        return Math.round(d10) <= 49;
    }

    public static boolean tonePrefersLightForeground(double d10) {
        return Math.round(d10) < 60;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        int i5 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i5;
        }
        return (MathUtils.clampInt(0, KotlinVersion.MAX_COMPONENT_VALUE, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i5 & 16777215);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(@NonNull DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        double min;
        boolean z5 = false;
        boolean z7 = dynamicScheme.contrastLevel < 0.0d;
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function == null) {
            boolean z10 = z7;
            double doubleValue = this.tone.apply(dynamicScheme).doubleValue();
            Function<DynamicScheme, DynamicColor> function2 = this.background;
            if (function2 == null) {
                return doubleValue;
            }
            double tone = function2.apply(dynamicScheme).getTone(dynamicScheme);
            double d12 = this.contrastCurve.get(dynamicScheme.contrastLevel);
            if (Contrast.ratioOfTones(tone, doubleValue) < d12) {
                doubleValue = foregroundTone(tone, d12);
            }
            if (z10) {
                doubleValue = foregroundTone(tone, d12);
            }
            if (!this.isBackground || 50.0d > doubleValue || doubleValue >= 60.0d) {
                d10 = doubleValue;
            } else {
                d10 = 49.0d;
                if (Contrast.ratioOfTones(49.0d, tone) < d12) {
                    d10 = 60.0d;
                }
            }
            if (this.secondBackground != null) {
                double tone2 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
                double tone3 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
                double max = Math.max(tone2, tone3);
                double min2 = Math.min(tone2, tone3);
                if (Contrast.ratioOfTones(max, d10) < d12 || Contrast.ratioOfTones(min2, d10) < d12) {
                    double lighter = Contrast.lighter(max, d12);
                    double darker = Contrast.darker(min2, d12);
                    ArrayList arrayList = new ArrayList();
                    if (lighter != -1.0d) {
                        arrayList.add(Double.valueOf(lighter));
                    }
                    if (darker != -1.0d) {
                        arrayList.add(Double.valueOf(darker));
                    }
                    if (tonePrefersLightForeground(tone2) || tonePrefersLightForeground(tone3)) {
                        if (lighter == -1.0d) {
                            return 100.0d;
                        }
                        return lighter;
                    }
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (darker == -1.0d) {
                        return 0.0d;
                    }
                    return darker;
                }
            }
            return d10;
        }
        ToneDeltaPair apply = function.apply(dynamicScheme);
        DynamicColor roleA = apply.getRoleA();
        DynamicColor roleB = apply.getRoleB();
        double delta = apply.getDelta();
        TonePolarity polarity = apply.getPolarity();
        boolean stayTogether = apply.getStayTogether();
        double tone4 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
        if (polarity == TonePolarity.NEARER || ((polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark))) {
            z5 = true;
        }
        DynamicColor dynamicColor = z5 ? roleA : roleB;
        DynamicColor dynamicColor2 = z5 ? roleB : roleA;
        boolean equals = this.name.equals(dynamicColor.name);
        double d13 = dynamicScheme.isDark ? 1.0d : -1.0d;
        double d14 = dynamicColor.contrastCurve.get(dynamicScheme.contrastLevel);
        double d15 = dynamicColor2.contrastCurve.get(dynamicScheme.contrastLevel);
        double doubleValue2 = dynamicColor.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, doubleValue2) < d14) {
            doubleValue2 = foregroundTone(tone4, d14);
        }
        boolean z11 = z7;
        double doubleValue3 = dynamicColor2.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, doubleValue3) < d15) {
            doubleValue3 = foregroundTone(tone4, d15);
        }
        if (z11) {
            doubleValue2 = foregroundTone(tone4, d14);
            doubleValue3 = foregroundTone(tone4, d15);
        }
        if ((doubleValue3 - doubleValue2) * d13 < delta) {
            double d16 = delta * d13;
            double clampDouble = MathUtils.clampDouble(0.0d, 100.0d, doubleValue2 + d16);
            if ((clampDouble - doubleValue2) * d13 < delta) {
                doubleValue2 = MathUtils.clampDouble(0.0d, 100.0d, clampDouble - d16);
            }
            doubleValue3 = clampDouble;
        }
        if (50.0d > doubleValue2 || doubleValue2 >= 60.0d) {
            if (50.0d > doubleValue3 || doubleValue3 >= 60.0d) {
                d11 = doubleValue3;
            } else if (!stayTogether) {
                d11 = d13 > 0.0d ? 60.0d : 49.0d;
            } else if (d13 > 0.0d) {
                d11 = Math.max(doubleValue3, (delta * d13) + 60.0d);
                doubleValue2 = 60.0d;
            } else {
                min = Math.min(doubleValue3, (delta * d13) + 49.0d);
                d11 = min;
                doubleValue2 = 49.0d;
            }
        } else if (d13 > 0.0d) {
            d11 = Math.max(doubleValue3, (delta * d13) + 60.0d);
            doubleValue2 = 60.0d;
        } else {
            min = Math.min(doubleValue3, (delta * d13) + 49.0d);
            d11 = min;
            doubleValue2 = 49.0d;
        }
        return equals ? doubleValue2 : d11;
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z5) {
        return new DynamicColor(str, function, function2, z5, null, null, null, null);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z5, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, DynamicColor> function4, ContrastCurve contrastCurve, Function<DynamicScheme, ToneDeltaPair> function5, Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z5;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }
}
