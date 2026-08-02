package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactFontManager;
import java.text.Bidi;
import java.util.ArrayList;
import lb.C5444x;

/* loaded from: classes3.dex */
public class b0 extends o0 {

    /* renamed from: q, reason: collision with root package name */
    public Path f38797q;

    /* renamed from: r, reason: collision with root package name */
    public String f38798r;

    /* renamed from: s, reason: collision with root package name */
    public c0 f38799s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f38800t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f38801u;

    /* renamed from: v, reason: collision with root package name */
    public final AssetManager f38802v;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust;

        static {
            int[] iArr = new int[d0.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline = iArr;
            try {
                iArr[d0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[d0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[j0.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust = iArr2;
            try {
                iArr2[j0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[j0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[h0.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = iArr3;
            try {
                iArr3[h0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[h0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[h0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public b0(ReactContext reactContext) {
        super(reactContext);
        this.f38800t = new ArrayList();
        this.f38801u = new ArrayList();
        this.f38802v = this.mContext.getResources().getAssets();
    }

    public static String Z(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            bArr[i10] = (byte) bidi.getRunLevel(i10);
            numArr[i10] = Integer.valueOf(i10);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < runCount; i11++) {
            int intValue = numArr[i11].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb2.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    @Override // com.horcrux.svg.o0
    public double C(Paint paint) {
        if (!Double.isNaN(this.f38909p)) {
            return this.f38909p;
        }
        String str = this.f38798r;
        double d10 = 0.0d;
        if (str == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof o0) {
                    d10 += ((o0) childAt).C(paint);
                }
            }
            this.f38909p = d10;
            return d10;
        }
        if (str.length() == 0) {
            this.f38909p = 0.0d;
            return 0.0d;
        }
        C3546x b10 = s().b();
        R(paint, b10);
        Q(paint, b10);
        double measureText = paint.measureText(str);
        this.f38909p = measureText;
        return measureText;
    }

    public final void Q(Paint paint, C3546x c3546x) {
        int i10 = Build.VERSION.SDK_INT;
        double d10 = c3546x.f38970n;
        paint.setLetterSpacing((float) (d10 / (c3546x.f38957a * this.mScale)));
        if (d10 == 0.0d && c3546x.f38965i == f0.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c3546x.f38963g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c3546x.f38963g);
        }
        if (i10 >= 26) {
            paint.setFontVariationSettings("'wght' " + c3546x.f38962f + c3546x.f38964h);
        }
    }

    public final void R(Paint paint, C3546x c3546x) {
        int i10 = 0;
        boolean z10 = c3546x.f38961e == g0.Bold || c3546x.f38962f >= 550;
        boolean z11 = c3546x.f38959c == e0.italic;
        if (z10 && z11) {
            i10 = 3;
        } else if (z10) {
            i10 = 1;
        } else if (z11) {
            i10 = 2;
        }
        int i11 = c3546x.f38962f;
        String str = c3546x.f38958b;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                a0.a();
                Typeface.Builder a10 = Z.a(this.f38802v, str2);
                a10.setFontVariationSettings("'wght' " + i11 + c3546x.f38964h);
                a10.setWeight(i11);
                a10.setItalic(z11);
                typeface = a10.build();
                if (typeface == null) {
                    a0.a();
                    Typeface.Builder a11 = Z.a(this.f38802v, str3);
                    a11.setFontVariationSettings("'wght' " + i11 + c3546x.f38964h);
                    a11.setWeight(i11);
                    a11.setItalic(z11);
                    typeface = a11.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f38802v, str2), i10);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f38802v, str3), i10);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i10, this.f38802v);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i11, z11);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (c3546x.f38957a * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    public final void S(Canvas canvas, Paint paint) {
        C3548z s10 = s();
        u();
        C3546x b10 = s10.b();
        TextPaint textPaint = new TextPaint(paint);
        R(textPaint, b10);
        Q(textPaint, b10);
        double c10 = s10.c();
        int i10 = a.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[b10.f38966j.ordinal()];
        StaticLayout V10 = V(textPaint, i10 != 2 ? i10 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, true, new SpannableString(this.f38798r), (int) M.a(this.f38899f, canvas.getWidth(), 0.0d, this.mScale, c10));
        int lineAscent = V10.getLineAscent(0);
        float l10 = (float) s10.l(0.0d);
        float m10 = (float) (s10.m() + lineAscent);
        t();
        canvas.save();
        canvas.translate(l10, m10);
        V10.draw(canvas);
        canvas.restore();
    }

    public final double T(SVGLength sVGLength, double d10, double d11) {
        return M.a(sVGLength, d10, 0.0d, this.mScale, d11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Path U(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z10;
        double d10;
        C3548z c3548z;
        boolean z11;
        int i10;
        double d11;
        b0 b0Var;
        double d12;
        boolean z12;
        C3548z c3548z2;
        double d13;
        boolean z13;
        A a10;
        float[] fArr;
        boolean[] zArr;
        double d14;
        double d15;
        double d16;
        int i11;
        boolean z14;
        double d17;
        SVGLength sVGLength;
        String A10;
        d0 z15;
        char c10;
        double d18;
        int i12;
        boolean z16;
        float f10;
        boolean z17;
        double d19;
        float[] fArr2;
        Canvas canvas2;
        int i13;
        C3548z c3548z3;
        A a11;
        Matrix matrix;
        b0 b0Var2;
        Paint paint2;
        float[] fArr3;
        Path path;
        char c11;
        double d20;
        A a12;
        float f11;
        double d21;
        char c12;
        double d22;
        float[] fArr4;
        int i14;
        String str2;
        Path b10;
        int i15;
        int i16;
        double d23;
        Paint paint3 = paint;
        Canvas canvas3 = canvas;
        int length = str.length();
        Path path2 = new Path();
        this.f38800t.clear();
        this.f38801u.clear();
        if (length != 0) {
            boolean z18 = this.f38799s != null;
            if (z18) {
                pathMeasure = new PathMeasure(this.f38799s.T(canvas3, paint3), false);
                d10 = pathMeasure.getLength();
                boolean isClosed = pathMeasure.isClosed();
                if (d10 != 0.0d) {
                    z10 = isClosed;
                }
            } else {
                pathMeasure = null;
                z10 = false;
                d10 = 0.0d;
            }
            PathMeasure pathMeasure2 = pathMeasure;
            C3548z s10 = s();
            C3546x b11 = s10.b();
            R(paint3, b11);
            A a13 = new A(paint3);
            boolean[] zArr2 = new boolean[length];
            char[] charArray = str.toCharArray();
            double d24 = b11.f38968l;
            double d25 = b11.f38969m;
            double d26 = b11.f38970n;
            boolean z19 = b11.f38971o;
            if (d26 == 0.0d) {
                c3548z = s10;
                if (b11.f38965i == f0.normal) {
                    z11 = true;
                    i10 = Build.VERSION.SDK_INT;
                    if (z11) {
                        d11 = d10;
                        paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + b11.f38963g);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        d11 = d10;
                        sb2.append("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ");
                        sb2.append(b11.f38963g);
                        paint3.setFontFeatureSettings(sb2.toString());
                    }
                    if (i10 >= 26) {
                        paint3.setFontVariationSettings("'wght' " + b11.f38962f + b11.f38964h);
                    }
                    ReadableMap readableMap = b11.f38960d;
                    float[] fArr5 = new float[length];
                    paint3.getTextWidths(str, fArr5);
                    h0 h0Var = b11.f38966j;
                    double C10 = D().C(paint3);
                    double W10 = W(h0Var, C10);
                    double c13 = c3548z.c();
                    char c14 = 65535;
                    if (z18) {
                        b0Var = this;
                        d12 = C10;
                        z12 = z19;
                        c3548z2 = c3548z;
                        d13 = c13;
                        z13 = z18;
                        a10 = a13;
                        double d27 = d11;
                        fArr = fArr5;
                        zArr = zArr2;
                        d14 = d27;
                        d15 = 0.0d;
                        d16 = W10;
                        i11 = 1;
                        z14 = false;
                    } else {
                        boolean z20 = this.f38799s.Q() == l0.sharp;
                        int i17 = this.f38799s.R() == m0.right ? -1 : 1;
                        d12 = C10;
                        z12 = z19;
                        c3548z2 = c3548z;
                        double d28 = d11;
                        fArr = fArr5;
                        z13 = z18;
                        zArr = zArr2;
                        a10 = a13;
                        double T10 = T(this.f38799s.S(), d28, c13);
                        b0Var = this;
                        d14 = d28;
                        double d29 = W10 + T10;
                        d13 = c13;
                        if (z10) {
                            double d30 = T10 + (h0Var == h0.middle ? -(d14 / 2.0d) : 0.0d);
                            d16 = d29;
                            d15 = d30;
                            z14 = z20;
                            d17 = d30 + d14;
                            i11 = i17;
                            sVGLength = b0Var.f38900g;
                            double d31 = 1.0d;
                            if (sVGLength != null) {
                                double a14 = M.a(sVGLength, canvas3.getWidth(), 0.0d, b0Var.mScale, d13);
                                if (a14 < 0.0d) {
                                    throw new IllegalArgumentException("Negative textLength value");
                                }
                                if (a.$SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[b0Var.f38902i.ordinal()] != 2) {
                                    d26 += (a14 - d12) / (length - 1);
                                } else {
                                    d31 = a14 / d12;
                                }
                            }
                            double d32 = i11;
                            boolean z21 = z14;
                            Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                            int i18 = i11;
                            double d33 = d31 * d32;
                            double d34 = fontMetrics.descent;
                            float f12 = fontMetrics.leading;
                            double d35 = d14;
                            double d36 = f12 + d34;
                            double d37 = (-fontMetrics.ascent) + f12;
                            double d38 = -fontMetrics.top;
                            double d39 = d38 + d36;
                            A10 = b0Var.A();
                            z15 = b0Var.z();
                            if (z15 != null) {
                                switch (a.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[z15.ordinal()]) {
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 6:
                                        c10 = 0;
                                        d37 = -d34;
                                        break;
                                    case 5:
                                        break;
                                    case 7:
                                        c10 = 0;
                                        paint3.getTextBounds(C5444x.f55808b, 0, 1, new Rect());
                                        d37 = r0.height() / 2.0d;
                                        break;
                                    case 8:
                                        d37 = (d37 - d34) / 2.0d;
                                        c10 = 0;
                                        break;
                                    case 9:
                                        d23 = 0.5d;
                                        d37 *= d23;
                                        c10 = 0;
                                        break;
                                    case 10:
                                        d23 = 0.8d;
                                        d37 *= d23;
                                        c10 = 0;
                                        break;
                                    case 11:
                                    case 12:
                                    case 13:
                                        c10 = 0;
                                        break;
                                    case 14:
                                        d37 = d36;
                                        c10 = 0;
                                        break;
                                    case 15:
                                        d37 = d39 / 2.0d;
                                        c10 = 0;
                                        break;
                                    case 16:
                                        d37 = d38;
                                        c10 = 0;
                                        break;
                                    default:
                                        d37 = 0.0d;
                                        c10 = 0;
                                        break;
                                }
                                if (A10 != null && !A10.isEmpty() && (i16 = a.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[z15.ordinal()]) != 14 && i16 != 16) {
                                    switch (A10.hashCode()) {
                                        case -1720785339:
                                            if (A10.equals("baseline")) {
                                                c14 = c10;
                                                break;
                                            }
                                            break;
                                        case 114240:
                                            if (A10.equals("sub")) {
                                                c14 = 1;
                                                break;
                                            }
                                            break;
                                        case 109801339:
                                            if (A10.equals("super")) {
                                                c14 = 2;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c14) {
                                        case 0:
                                            break;
                                        case 1:
                                            d18 = d37;
                                            if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                                int i19 = readableMap.getInt("unitsPerEm");
                                                ReadableMap map = readableMap.getMap("tables");
                                                if (map.hasKey("os2")) {
                                                    ReadableMap map2 = map.getMap("os2");
                                                    if (map2.hasKey("ySubscriptYOffset")) {
                                                        d37 = d18 + (((b0Var.mScale * d13) * map2.getDouble("ySubscriptYOffset")) / i19);
                                                        break;
                                                    }
                                                }
                                                d37 = d18;
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                                int i20 = readableMap.getInt("unitsPerEm");
                                                ReadableMap map3 = readableMap.getMap("tables");
                                                if (map3.hasKey("os2")) {
                                                    ReadableMap map4 = map3.getMap("os2");
                                                    if (map4.hasKey("ySuperscriptYOffset")) {
                                                        d37 -= ((b0Var.mScale * d13) * map4.getDouble("ySuperscriptYOffset")) / i20;
                                                        break;
                                                    }
                                                }
                                                d18 = d37;
                                                d37 = d18;
                                                break;
                                            }
                                            break;
                                        default:
                                            float f13 = b0Var.mScale;
                                            d37 -= M.b(A10, f13 * d13, f13, d13);
                                            break;
                                    }
                                    Matrix matrix2 = new Matrix();
                                    Matrix matrix3 = new Matrix();
                                    Matrix matrix4 = new Matrix();
                                    float[] fArr6 = new float[9];
                                    float[] fArr7 = new float[9];
                                    i12 = 0;
                                    while (i12 < length) {
                                        char c15 = charArray[i12];
                                        String valueOf = String.valueOf(c15);
                                        boolean z22 = zArr[i12];
                                        if (z22) {
                                            valueOf = "";
                                            z16 = false;
                                            f10 = 0.0f;
                                        } else {
                                            int i21 = i12;
                                            z16 = false;
                                            f10 = 0.0f;
                                            while (true) {
                                                int i22 = i21 + 1;
                                                if (i22 < length && fArr[i22] <= 0.0f) {
                                                    valueOf = valueOf + charArray[i22];
                                                    zArr[i22] = true;
                                                    i21 = i22;
                                                    z16 = true;
                                                }
                                            }
                                        }
                                        int i23 = i12;
                                        double measureText = paint3.measureText(valueOf) * d31;
                                        if (!z12) {
                                            d24 = (fArr[i23] * d31) - measureText;
                                        }
                                        boolean z23 = c15 == ' ';
                                        double d40 = measureText + (z23 ? d25 : 0.0d) + d26;
                                        if (z22) {
                                            z17 = z23;
                                            d19 = 0.0d;
                                        } else {
                                            z17 = z23;
                                            d19 = d24 + d40;
                                        }
                                        double l10 = c3548z2.l(d19);
                                        double m10 = c3548z2.m();
                                        double i24 = c3548z2.i();
                                        double j10 = c3548z2.j();
                                        String str3 = valueOf;
                                        double k10 = c3548z2.k();
                                        if (z22 || z17) {
                                            fArr2 = fArr7;
                                            canvas2 = canvas3;
                                            i13 = length;
                                            c3548z3 = c3548z2;
                                            a11 = a10;
                                            matrix = matrix3;
                                            b0Var2 = this;
                                            paint2 = paint;
                                            fArr3 = fArr6;
                                            path = path2;
                                        } else {
                                            double d41 = measureText * d32;
                                            i13 = length;
                                            Path path3 = path2;
                                            double d42 = (d16 + ((l10 + i24) * d32)) - (d40 * d32);
                                            if (z13) {
                                                c11 = c15;
                                                d20 = k10;
                                                double d43 = d42 + d41;
                                                double d44 = d41 / 2.0d;
                                                double d45 = d42 + d44;
                                                if (d45 <= d17 && d45 >= d15) {
                                                    c3548z3 = c3548z2;
                                                    if (z21) {
                                                        pathMeasure2.getMatrix((float) d45, matrix3, 3);
                                                        fArr2 = fArr7;
                                                        a12 = a10;
                                                        matrix = matrix3;
                                                        d22 = d35;
                                                        c12 = 2;
                                                        fArr4 = fArr6;
                                                    } else {
                                                        if (d42 < 0.0d) {
                                                            a12 = a10;
                                                            float f14 = f10;
                                                            pathMeasure2.getMatrix(f14, matrix2, 3);
                                                            matrix2.preTranslate((float) d42, f14);
                                                            i15 = 1;
                                                        } else {
                                                            a12 = a10;
                                                            i15 = 1;
                                                            pathMeasure2.getMatrix((float) d42, matrix2, 1);
                                                        }
                                                        pathMeasure2.getMatrix((float) d45, matrix3, i15);
                                                        if (d43 > d35) {
                                                            d22 = d35;
                                                            pathMeasure2.getMatrix((float) d22, matrix4, 3);
                                                            matrix4.preTranslate((float) (d43 - d22), 0.0f);
                                                        } else {
                                                            d22 = d35;
                                                            pathMeasure2.getMatrix((float) d43, matrix4, i15);
                                                        }
                                                        matrix2.getValues(fArr6);
                                                        matrix4.getValues(fArr7);
                                                        c12 = 2;
                                                        fArr2 = fArr7;
                                                        fArr4 = fArr6;
                                                        matrix = matrix3;
                                                        matrix.preRotate((float) (Math.atan2(fArr7[5] - fArr6[5], fArr7[2] - fArr6[2]) * 57.29577951308232d * d32));
                                                    }
                                                    matrix.preTranslate((float) (-d44), (float) (j10 + d18));
                                                    d21 = d33;
                                                    i14 = i18;
                                                    matrix.preScale((float) d21, i14);
                                                    f11 = 0.0f;
                                                    matrix.postTranslate(0.0f, (float) m10);
                                                } else {
                                                    b0Var2 = this;
                                                    canvas2 = canvas;
                                                    fArr2 = fArr7;
                                                    fArr3 = fArr6;
                                                    c3548z3 = c3548z2;
                                                    a11 = a10;
                                                    matrix = matrix3;
                                                    path = path3;
                                                    paint2 = paint;
                                                }
                                            } else {
                                                fArr2 = fArr7;
                                                c11 = c15;
                                                d20 = k10;
                                                c3548z3 = c3548z2;
                                                a12 = a10;
                                                matrix = matrix3;
                                                f11 = f10;
                                                d21 = d33;
                                                c12 = 2;
                                                d22 = d35;
                                                fArr4 = fArr6;
                                                i14 = i18;
                                                matrix.setTranslate((float) d42, (float) (m10 + j10 + d18));
                                            }
                                            matrix.preRotate((float) d20);
                                            if (z16) {
                                                b10 = new Path();
                                                d33 = d21;
                                                fArr3 = fArr4;
                                                d35 = d22;
                                                b0Var2 = this;
                                                paint2 = paint;
                                                i18 = i14;
                                                str2 = str3;
                                                paint2.getTextPath(str2, 0, str3.length(), 0.0f, 0.0f, b10);
                                                a11 = a12;
                                            } else {
                                                b0Var2 = this;
                                                paint2 = paint;
                                                i18 = i14;
                                                d33 = d21;
                                                fArr3 = fArr4;
                                                str2 = str3;
                                                d35 = d22;
                                                a11 = a12;
                                                b10 = a11.b(c11, str2);
                                            }
                                            RectF rectF = new RectF();
                                            b10.computeBounds(rectF, true);
                                            if (rectF.width() == f11) {
                                                canvas.save();
                                                canvas2 = canvas;
                                                canvas2.concat(matrix);
                                                b0Var2.f38800t.add(str2);
                                                b0Var2.f38801u.add(new Matrix(matrix));
                                                canvas2.drawText(str2, f11, f11, paint2);
                                                canvas2.restore();
                                                path = path3;
                                            } else {
                                                canvas2 = canvas;
                                                b10.transform(matrix);
                                                path = path3;
                                                path.addPath(b10);
                                            }
                                        }
                                        paint3 = paint2;
                                        path2 = path;
                                        a10 = a11;
                                        b0Var = b0Var2;
                                        fArr6 = fArr3;
                                        matrix3 = matrix;
                                        length = i13;
                                        c3548z2 = c3548z3;
                                        fArr7 = fArr2;
                                        canvas3 = canvas2;
                                        i12 = i23 + 1;
                                    }
                                    return path2;
                                }
                                d18 = d37;
                                Matrix matrix22 = new Matrix();
                                Matrix matrix32 = new Matrix();
                                Matrix matrix42 = new Matrix();
                                float[] fArr62 = new float[9];
                                float[] fArr72 = new float[9];
                                i12 = 0;
                                while (i12 < length) {
                                }
                                return path2;
                            }
                            c10 = 0;
                            d37 = 0.0d;
                            if (A10 != null) {
                                switch (A10.hashCode()) {
                                    case -1720785339:
                                        break;
                                    case 114240:
                                        break;
                                    case 109801339:
                                        break;
                                }
                                switch (c14) {
                                }
                                Matrix matrix222 = new Matrix();
                                Matrix matrix322 = new Matrix();
                                Matrix matrix422 = new Matrix();
                                float[] fArr622 = new float[9];
                                float[] fArr722 = new float[9];
                                i12 = 0;
                                while (i12 < length) {
                                }
                                return path2;
                            }
                            d18 = d37;
                            Matrix matrix2222 = new Matrix();
                            Matrix matrix3222 = new Matrix();
                            Matrix matrix4222 = new Matrix();
                            float[] fArr6222 = new float[9];
                            float[] fArr7222 = new float[9];
                            i12 = 0;
                            while (i12 < length) {
                            }
                            return path2;
                        }
                        d15 = 0.0d;
                        d16 = d29;
                        z14 = z20;
                        i11 = i17;
                    }
                    d17 = d14;
                    sVGLength = b0Var.f38900g;
                    double d312 = 1.0d;
                    if (sVGLength != null) {
                    }
                    double d322 = i11;
                    boolean z212 = z14;
                    Paint.FontMetrics fontMetrics2 = paint3.getFontMetrics();
                    int i182 = i11;
                    double d332 = d312 * d322;
                    double d342 = fontMetrics2.descent;
                    float f122 = fontMetrics2.leading;
                    double d352 = d14;
                    double d362 = f122 + d342;
                    double d372 = (-fontMetrics2.ascent) + f122;
                    double d382 = -fontMetrics2.top;
                    double d392 = d382 + d362;
                    A10 = b0Var.A();
                    z15 = b0Var.z();
                    if (z15 != null) {
                    }
                    c10 = 0;
                    d372 = 0.0d;
                    if (A10 != null) {
                    }
                    d18 = d372;
                    Matrix matrix22222 = new Matrix();
                    Matrix matrix32222 = new Matrix();
                    Matrix matrix42222 = new Matrix();
                    float[] fArr62222 = new float[9];
                    float[] fArr72222 = new float[9];
                    i12 = 0;
                    while (i12 < length) {
                    }
                    return path2;
                }
            } else {
                c3548z = s10;
            }
            z11 = false;
            i10 = Build.VERSION.SDK_INT;
            if (z11) {
            }
            if (i10 >= 26) {
            }
            ReadableMap readableMap2 = b11.f38960d;
            float[] fArr52 = new float[length];
            paint3.getTextWidths(str, fArr52);
            h0 h0Var2 = b11.f38966j;
            double C102 = D().C(paint3);
            double W102 = W(h0Var2, C102);
            double c132 = c3548z.c();
            char c142 = 65535;
            if (z18) {
            }
            d17 = d14;
            sVGLength = b0Var.f38900g;
            double d3122 = 1.0d;
            if (sVGLength != null) {
            }
            double d3222 = i11;
            boolean z2122 = z14;
            Paint.FontMetrics fontMetrics22 = paint3.getFontMetrics();
            int i1822 = i11;
            double d3322 = d3122 * d3222;
            double d3422 = fontMetrics22.descent;
            float f1222 = fontMetrics22.leading;
            double d3522 = d14;
            double d3622 = f1222 + d3422;
            double d3722 = (-fontMetrics22.ascent) + f1222;
            double d3822 = -fontMetrics22.top;
            double d3922 = d3822 + d3622;
            A10 = b0Var.A();
            z15 = b0Var.z();
            if (z15 != null) {
            }
            c10 = 0;
            d3722 = 0.0d;
            if (A10 != null) {
            }
            d18 = d3722;
            Matrix matrix222222 = new Matrix();
            Matrix matrix322222 = new Matrix();
            Matrix matrix422222 = new Matrix();
            float[] fArr622222 = new float[9];
            float[] fArr722222 = new float[9];
            i12 = 0;
            while (i12 < length) {
            }
            return path2;
        }
        return path2;
    }

    public final StaticLayout V(TextPaint textPaint, Layout.Alignment alignment, boolean z10, SpannableString spannableString, int i10) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    public final double W(h0 h0Var, double d10) {
        int i10 = a.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[h0Var.ordinal()];
        if (i10 == 2) {
            return (-d10) / 2.0d;
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return -d10;
    }

    public void X(String str) {
        this.f38798r = str;
        invalidate();
    }

    public final void Y() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == c0.class) {
                this.f38799s = (c0) parent;
                return;
            } else {
                if (!(parent instanceof o0)) {
                    return;
                }
            }
        }
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f38797q = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f38798r == null) {
            clip(canvas, paint);
            o(canvas, paint, f10);
            return;
        }
        SVGLength sVGLength = this.f38899f;
        if (sVGLength != null && sVGLength.f38736a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f10)) {
                S(canvas, paint);
            }
            if (setupStrokePaint(paint, f10 * this.strokeOpacity)) {
                S(canvas, paint);
                return;
            }
            return;
        }
        int size = this.f38800t.size();
        if (size > 0) {
            R(paint, s().b());
            for (int i10 = 0; i10 < size; i10++) {
                String str = (String) this.f38800t.get(i10);
                Matrix matrix = (Matrix) this.f38801u.get(i10);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        p(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f38797q;
        if (path != null) {
            return path;
        }
        if (this.f38798r == null) {
            Path B10 = B(canvas, paint);
            this.f38797q = B10;
            return B10;
        }
        Y();
        u();
        this.f38797q = U(Z(this.f38798r), paint, canvas);
        t();
        return this.f38797q;
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        if (this.f38798r == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.mStrokeRegion) != null && region.contains(round, round2))) {
                if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.o0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f38797q = null;
        super.invalidate();
    }
}
