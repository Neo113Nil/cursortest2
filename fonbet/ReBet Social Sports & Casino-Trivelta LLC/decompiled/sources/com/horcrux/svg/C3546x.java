package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.ViewProps;
import io.agora.rtc2.video.FaceShapeAreaOptions;

/* renamed from: com.horcrux.svg.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3546x {

    /* renamed from: p, reason: collision with root package name */
    public static final C3546x f38956p = new C3546x();

    /* renamed from: a, reason: collision with root package name */
    public final double f38957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38958b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f38959c;

    /* renamed from: d, reason: collision with root package name */
    public final ReadableMap f38960d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f38961e;

    /* renamed from: f, reason: collision with root package name */
    public int f38962f;

    /* renamed from: g, reason: collision with root package name */
    public final String f38963g;

    /* renamed from: h, reason: collision with root package name */
    public final String f38964h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f38965i;

    /* renamed from: j, reason: collision with root package name */
    public final h0 f38966j;

    /* renamed from: k, reason: collision with root package name */
    public final i0 f38967k;

    /* renamed from: l, reason: collision with root package name */
    public final double f38968l;

    /* renamed from: m, reason: collision with root package name */
    public final double f38969m;

    /* renamed from: n, reason: collision with root package name */
    public final double f38970n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f38971o;

    /* renamed from: com.horcrux.svg.x$a */
    public static class a {
        private static final g0[] WEIGHTS;
        private static final int[] absoluteFontWeights;

        static {
            g0 g0Var = g0.w100;
            g0 g0Var2 = g0.w200;
            g0 g0Var3 = g0.w300;
            g0 g0Var4 = g0.Normal;
            g0 g0Var5 = g0.w500;
            g0 g0Var6 = g0.w600;
            g0 g0Var7 = g0.Bold;
            g0 g0Var8 = g0.w800;
            g0 g0Var9 = g0.w900;
            WEIGHTS = new g0[]{g0Var, g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var9};
            absoluteFontWeights = new int[]{400, ReactFontManager.TypefaceStyle.BOLD, 100, 200, 300, 400, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, 600, ReactFontManager.TypefaceStyle.BOLD, 800, 900};
        }

        public static int a(int i10) {
            if (i10 < 350) {
                return 400;
            }
            if (i10 < 550) {
                return ReactFontManager.TypefaceStyle.BOLD;
            }
            if (i10 < 900) {
                return 900;
            }
            return i10;
        }

        public static int b(g0 g0Var, C3546x c3546x) {
            return g0Var == g0.Bolder ? a(c3546x.f38962f) : g0Var == g0.Lighter ? c(c3546x.f38962f) : absoluteFontWeights[g0Var.ordinal()];
        }

        public static int c(int i10) {
            if (i10 < 100) {
                return i10;
            }
            if (i10 < 550) {
                return 100;
            }
            if (i10 < 750) {
                return 400;
            }
            return ReactFontManager.TypefaceStyle.BOLD;
        }

        public static g0 d(int i10) {
            return WEIGHTS[Math.round(i10 / 100.0f)];
        }
    }

    public C3546x() {
        this.f38960d = null;
        this.f38958b = "";
        this.f38959c = e0.normal;
        this.f38961e = g0.Normal;
        this.f38962f = 400;
        this.f38963g = "";
        this.f38964h = "";
        this.f38965i = f0.normal;
        this.f38966j = h0.start;
        this.f38967k = i0.None;
        this.f38971o = false;
        this.f38968l = 0.0d;
        this.f38957a = 12.0d;
        this.f38969m = 0.0d;
        this.f38970n = 0.0d;
    }

    public final void a(C3546x c3546x, double d10) {
        long round = Math.round(d10);
        if (round < 1 || round > 1000) {
            b(c3546x);
            return;
        }
        int i10 = (int) round;
        this.f38962f = i10;
        this.f38961e = a.d(i10);
    }

    public final void b(C3546x c3546x) {
        this.f38962f = c3546x.f38962f;
        this.f38961e = c3546x.f38961e;
    }

    public final double c(ReadableMap readableMap, String str, double d10, double d11, double d12) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) * d10 : M.b(readableMap.getString(str), d12, d10, d11);
    }

    public C3546x(ReadableMap readableMap, C3546x c3546x, double d10) {
        String str;
        String str2;
        f0 f0Var;
        h0 h0Var;
        i0 i0Var;
        double d11;
        double d12;
        double d13 = c3546x.f38957a;
        if (readableMap.hasKey(ViewProps.FONT_SIZE)) {
            this.f38957a = c(readableMap, ViewProps.FONT_SIZE, 1.0d, d13, d13);
        } else {
            this.f38957a = d13;
        }
        if (readableMap.hasKey(ViewProps.FONT_WEIGHT)) {
            if (readableMap.getType(ViewProps.FONT_WEIGHT) == ReadableType.Number) {
                a(c3546x, readableMap.getDouble(ViewProps.FONT_WEIGHT));
            } else {
                String string = readableMap.getString(ViewProps.FONT_WEIGHT);
                if (g0.c(string)) {
                    int b10 = a.b(g0.b(string), c3546x);
                    this.f38962f = b10;
                    this.f38961e = a.d(b10);
                } else if (string != null) {
                    a(c3546x, Double.parseDouble(string));
                } else {
                    b(c3546x);
                }
            }
        } else {
            b(c3546x);
        }
        this.f38960d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c3546x.f38960d;
        this.f38958b = readableMap.hasKey(ViewProps.FONT_FAMILY) ? readableMap.getString(ViewProps.FONT_FAMILY) : c3546x.f38958b;
        this.f38959c = readableMap.hasKey(ViewProps.FONT_STYLE) ? e0.valueOf(readableMap.getString(ViewProps.FONT_STYLE)) : c3546x.f38959c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            str = readableMap.getString("fontFeatureSettings");
        } else {
            str = c3546x.f38963g;
        }
        this.f38963g = str;
        if (readableMap.hasKey("fontVariationSettings")) {
            str2 = readableMap.getString("fontVariationSettings");
        } else {
            str2 = c3546x.f38964h;
        }
        this.f38964h = str2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            f0Var = f0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            f0Var = c3546x.f38965i;
        }
        this.f38965i = f0Var;
        if (readableMap.hasKey("textAnchor")) {
            h0Var = h0.valueOf(readableMap.getString("textAnchor"));
        } else {
            h0Var = c3546x.f38966j;
        }
        this.f38966j = h0Var;
        if (readableMap.hasKey("textDecoration")) {
            i0Var = i0.b(readableMap.getString("textDecoration"));
        } else {
            i0Var = c3546x.f38967k;
        }
        this.f38967k = i0Var;
        boolean hasKey = readableMap.hasKey("kerning");
        this.f38971o = hasKey || c3546x.f38971o;
        this.f38968l = hasKey ? c(readableMap, "kerning", d10, this.f38957a, 0.0d) : c3546x.f38968l;
        if (readableMap.hasKey("wordSpacing")) {
            d11 = c(readableMap, "wordSpacing", d10, this.f38957a, 0.0d);
        } else {
            d11 = c3546x.f38969m;
        }
        this.f38969m = d11;
        if (readableMap.hasKey(ViewProps.LETTER_SPACING)) {
            d12 = c(readableMap, ViewProps.LETTER_SPACING, d10, this.f38957a, 0.0d);
        } else {
            d12 = c3546x.f38970n;
        }
        this.f38970n = d12;
    }
}
