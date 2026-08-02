package l1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7843t {

    /* renamed from: l1.t$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72279a;

        static {
            BlendMode[] values;
            int ordinal;
            int ordinal2;
            int ordinal3;
            int ordinal4;
            int ordinal5;
            int ordinal6;
            int ordinal7;
            int ordinal8;
            int ordinal9;
            int ordinal10;
            int ordinal11;
            int ordinal12;
            int ordinal13;
            int ordinal14;
            int ordinal15;
            int ordinal16;
            int ordinal17;
            int ordinal18;
            int ordinal19;
            int ordinal20;
            int ordinal21;
            int ordinal22;
            int ordinal23;
            int ordinal24;
            int ordinal25;
            int ordinal26;
            int ordinal27;
            int ordinal28;
            int ordinal29;
            BlendMode unused;
            BlendMode unused2;
            BlendMode unused3;
            BlendMode unused4;
            BlendMode unused5;
            BlendMode unused6;
            BlendMode unused7;
            BlendMode unused8;
            BlendMode unused9;
            BlendMode unused10;
            BlendMode unused11;
            BlendMode unused12;
            BlendMode unused13;
            BlendMode unused14;
            BlendMode unused15;
            BlendMode unused16;
            BlendMode unused17;
            BlendMode unused18;
            BlendMode unused19;
            BlendMode unused20;
            BlendMode unused21;
            BlendMode unused22;
            BlendMode unused23;
            BlendMode unused24;
            BlendMode unused25;
            BlendMode unused26;
            BlendMode unused27;
            BlendMode unused28;
            BlendMode unused29;
            values = BlendMode.values();
            int[] iArr = new int[values.length];
            try {
                unused = BlendMode.CLEAR;
                ordinal29 = BlendMode.CLEAR.ordinal();
                iArr[ordinal29] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                unused2 = BlendMode.SRC;
                ordinal28 = BlendMode.SRC.ordinal();
                iArr[ordinal28] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                unused3 = BlendMode.DST;
                ordinal27 = BlendMode.DST.ordinal();
                iArr[ordinal27] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                unused4 = BlendMode.SRC_OVER;
                ordinal26 = BlendMode.SRC_OVER.ordinal();
                iArr[ordinal26] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                unused5 = BlendMode.DST_OVER;
                ordinal25 = BlendMode.DST_OVER.ordinal();
                iArr[ordinal25] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                unused6 = BlendMode.SRC_IN;
                ordinal24 = BlendMode.SRC_IN.ordinal();
                iArr[ordinal24] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                unused7 = BlendMode.DST_IN;
                ordinal23 = BlendMode.DST_IN.ordinal();
                iArr[ordinal23] = 7;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                unused8 = BlendMode.SRC_OUT;
                ordinal22 = BlendMode.SRC_OUT.ordinal();
                iArr[ordinal22] = 8;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                unused9 = BlendMode.DST_OUT;
                ordinal21 = BlendMode.DST_OUT.ordinal();
                iArr[ordinal21] = 9;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                unused10 = BlendMode.SRC_ATOP;
                ordinal20 = BlendMode.SRC_ATOP.ordinal();
                iArr[ordinal20] = 10;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                unused11 = BlendMode.DST_ATOP;
                ordinal19 = BlendMode.DST_ATOP.ordinal();
                iArr[ordinal19] = 11;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                unused12 = BlendMode.XOR;
                ordinal18 = BlendMode.XOR.ordinal();
                iArr[ordinal18] = 12;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                unused13 = BlendMode.PLUS;
                ordinal17 = BlendMode.PLUS.ordinal();
                iArr[ordinal17] = 13;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                unused14 = BlendMode.MODULATE;
                ordinal16 = BlendMode.MODULATE.ordinal();
                iArr[ordinal16] = 14;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                unused15 = BlendMode.SCREEN;
                ordinal15 = BlendMode.SCREEN.ordinal();
                iArr[ordinal15] = 15;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                unused16 = BlendMode.OVERLAY;
                ordinal14 = BlendMode.OVERLAY.ordinal();
                iArr[ordinal14] = 16;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                unused17 = BlendMode.DARKEN;
                ordinal13 = BlendMode.DARKEN.ordinal();
                iArr[ordinal13] = 17;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                unused18 = BlendMode.LIGHTEN;
                ordinal12 = BlendMode.LIGHTEN.ordinal();
                iArr[ordinal12] = 18;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                unused19 = BlendMode.COLOR_DODGE;
                ordinal11 = BlendMode.COLOR_DODGE.ordinal();
                iArr[ordinal11] = 19;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                unused20 = BlendMode.COLOR_BURN;
                ordinal10 = BlendMode.COLOR_BURN.ordinal();
                iArr[ordinal10] = 20;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                unused21 = BlendMode.HARD_LIGHT;
                ordinal9 = BlendMode.HARD_LIGHT.ordinal();
                iArr[ordinal9] = 21;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                unused22 = BlendMode.SOFT_LIGHT;
                ordinal8 = BlendMode.SOFT_LIGHT.ordinal();
                iArr[ordinal8] = 22;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                unused23 = BlendMode.DIFFERENCE;
                ordinal7 = BlendMode.DIFFERENCE.ordinal();
                iArr[ordinal7] = 23;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                unused24 = BlendMode.EXCLUSION;
                ordinal6 = BlendMode.EXCLUSION.ordinal();
                iArr[ordinal6] = 24;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                unused25 = BlendMode.MULTIPLY;
                ordinal5 = BlendMode.MULTIPLY.ordinal();
                iArr[ordinal5] = 25;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                unused26 = BlendMode.HUE;
                ordinal4 = BlendMode.HUE.ordinal();
                iArr[ordinal4] = 26;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                unused27 = BlendMode.SATURATION;
                ordinal3 = BlendMode.SATURATION.ordinal();
                iArr[ordinal3] = 27;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                unused28 = BlendMode.COLOR;
                ordinal2 = BlendMode.COLOR.ordinal();
                iArr[ordinal2] = 28;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                unused29 = BlendMode.LUMINOSITY;
                ordinal = BlendMode.LUMINOSITY.ordinal();
                iArr[ordinal] = 29;
            } catch (NoSuchFieldError unused58) {
            }
            f72279a = iArr;
        }
    }

    @NotNull
    public static final BlendMode a(int i11) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i11 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i11 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i11 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i11 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i11 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i11 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i11 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i11 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i11 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i11 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i11 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i11 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i11 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i11 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i11 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i11 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i11 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i11 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i11 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i11 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i11 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i11 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i11 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i11 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i11 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i11 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i11 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i11 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i11 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    @NotNull
    public static final PorterDuff.Mode b(int i11) {
        return i11 == 0 ? PorterDuff.Mode.CLEAR : i11 == 1 ? PorterDuff.Mode.SRC : i11 == 2 ? PorterDuff.Mode.DST : i11 == 3 ? PorterDuff.Mode.SRC_OVER : i11 == 4 ? PorterDuff.Mode.DST_OVER : i11 == 5 ? PorterDuff.Mode.SRC_IN : i11 == 6 ? PorterDuff.Mode.DST_IN : i11 == 7 ? PorterDuff.Mode.SRC_OUT : i11 == 8 ? PorterDuff.Mode.DST_OUT : i11 == 9 ? PorterDuff.Mode.SRC_ATOP : i11 == 10 ? PorterDuff.Mode.DST_ATOP : i11 == 11 ? PorterDuff.Mode.XOR : i11 == 12 ? PorterDuff.Mode.ADD : i11 == 14 ? PorterDuff.Mode.SCREEN : i11 == 15 ? PorterDuff.Mode.OVERLAY : i11 == 16 ? PorterDuff.Mode.DARKEN : i11 == 17 ? PorterDuff.Mode.LIGHTEN : i11 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
