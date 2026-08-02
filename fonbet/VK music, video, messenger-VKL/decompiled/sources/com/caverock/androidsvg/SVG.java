package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.util.Log;
import com.caverock.androidsvg.a;
import com.caverock.androidsvg.b;
import com.coremedia.iso.boxes.TrackReferenceBox;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.zip.GZIPInputStream;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import xsna.i5s;
import xsna.shy;

/* loaded from: classes12.dex */
public final class SVG {
    public e0 a;
    public a.q b;
    public HashMap c;

    public static class Style implements Cloneable {
        public String A;
        public Boolean B;
        public Boolean C;
        public n0 D;
        public Float E;
        public String F;
        public FillRule G;
        public String H;
        public n0 I;
        public Float J;
        public n0 K;
        public Float L;
        public VectorEffect M;
        public RenderQuality N;
        public long b = 0;
        public n0 c;
        public FillRule d;
        public Float e;
        public n0 f;
        public Float g;
        public p h;
        public LineCap i;
        public LineJoin j;
        public Float k;
        public p[] l;
        public p m;
        public Float n;
        public f o;
        public ArrayList p;
        public p q;
        public Integer r;
        public FontStyle s;
        public TextDecoration t;
        public TextDirection u;
        public TextAnchor v;
        public Boolean w;
        public c x;
        public String y;
        public String z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FillRule {
            private static final /* synthetic */ FillRule[] $VALUES;
            public static final FillRule EvenOdd;
            public static final FillRule NonZero;

            static {
                FillRule fillRule = new FillRule("NonZero", 0);
                NonZero = fillRule;
                FillRule fillRule2 = new FillRule("EvenOdd", 1);
                EvenOdd = fillRule2;
                $VALUES = new FillRule[]{fillRule, fillRule2};
            }

            public FillRule() {
                throw null;
            }

            public static FillRule valueOf(String str) {
                return (FillRule) Enum.valueOf(FillRule.class, str);
            }

            public static FillRule[] values() {
                return (FillRule[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FontStyle {
            private static final /* synthetic */ FontStyle[] $VALUES;
            public static final FontStyle Italic;
            public static final FontStyle Normal;
            public static final FontStyle Oblique;

            static {
                FontStyle fontStyle = new FontStyle("Normal", 0);
                Normal = fontStyle;
                FontStyle fontStyle2 = new FontStyle("Italic", 1);
                Italic = fontStyle2;
                FontStyle fontStyle3 = new FontStyle("Oblique", 2);
                Oblique = fontStyle3;
                $VALUES = new FontStyle[]{fontStyle, fontStyle2, fontStyle3};
            }

            public FontStyle() {
                throw null;
            }

            public static FontStyle valueOf(String str) {
                return (FontStyle) Enum.valueOf(FontStyle.class, str);
            }

            public static FontStyle[] values() {
                return (FontStyle[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class LineCap {
            private static final /* synthetic */ LineCap[] $VALUES;
            public static final LineCap Butt;
            public static final LineCap Round;
            public static final LineCap Square;

            static {
                LineCap lineCap = new LineCap("Butt", 0);
                Butt = lineCap;
                LineCap lineCap2 = new LineCap("Round", 1);
                Round = lineCap2;
                LineCap lineCap3 = new LineCap("Square", 2);
                Square = lineCap3;
                $VALUES = new LineCap[]{lineCap, lineCap2, lineCap3};
            }

            public LineCap() {
                throw null;
            }

            public static LineCap valueOf(String str) {
                return (LineCap) Enum.valueOf(LineCap.class, str);
            }

            public static LineCap[] values() {
                return (LineCap[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class LineJoin {
            private static final /* synthetic */ LineJoin[] $VALUES;
            public static final LineJoin Bevel;
            public static final LineJoin Miter;
            public static final LineJoin Round;

            static {
                LineJoin lineJoin = new LineJoin("Miter", 0);
                Miter = lineJoin;
                LineJoin lineJoin2 = new LineJoin("Round", 1);
                Round = lineJoin2;
                LineJoin lineJoin3 = new LineJoin("Bevel", 2);
                Bevel = lineJoin3;
                $VALUES = new LineJoin[]{lineJoin, lineJoin2, lineJoin3};
            }

            public LineJoin() {
                throw null;
            }

            public static LineJoin valueOf(String str) {
                return (LineJoin) Enum.valueOf(LineJoin.class, str);
            }

            public static LineJoin[] values() {
                return (LineJoin[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class RenderQuality {
            private static final /* synthetic */ RenderQuality[] $VALUES;
            public static final RenderQuality auto;
            public static final RenderQuality optimizeQuality;
            public static final RenderQuality optimizeSpeed;

            static {
                RenderQuality renderQuality = new RenderQuality("auto", 0);
                auto = renderQuality;
                RenderQuality renderQuality2 = new RenderQuality("optimizeQuality", 1);
                optimizeQuality = renderQuality2;
                RenderQuality renderQuality3 = new RenderQuality("optimizeSpeed", 2);
                optimizeSpeed = renderQuality3;
                $VALUES = new RenderQuality[]{renderQuality, renderQuality2, renderQuality3};
            }

            public RenderQuality() {
                throw null;
            }

            public static RenderQuality valueOf(String str) {
                return (RenderQuality) Enum.valueOf(RenderQuality.class, str);
            }

            public static RenderQuality[] values() {
                return (RenderQuality[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextAnchor {
            private static final /* synthetic */ TextAnchor[] $VALUES;
            public static final TextAnchor End;
            public static final TextAnchor Middle;
            public static final TextAnchor Start;

            static {
                TextAnchor textAnchor = new TextAnchor("Start", 0);
                Start = textAnchor;
                TextAnchor textAnchor2 = new TextAnchor("Middle", 1);
                Middle = textAnchor2;
                TextAnchor textAnchor3 = new TextAnchor("End", 2);
                End = textAnchor3;
                $VALUES = new TextAnchor[]{textAnchor, textAnchor2, textAnchor3};
            }

            public TextAnchor() {
                throw null;
            }

            public static TextAnchor valueOf(String str) {
                return (TextAnchor) Enum.valueOf(TextAnchor.class, str);
            }

            public static TextAnchor[] values() {
                return (TextAnchor[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextDecoration {
            private static final /* synthetic */ TextDecoration[] $VALUES;
            public static final TextDecoration Blink;
            public static final TextDecoration LineThrough;
            public static final TextDecoration None;
            public static final TextDecoration Overline;
            public static final TextDecoration Underline;

            static {
                TextDecoration textDecoration = new TextDecoration("None", 0);
                None = textDecoration;
                TextDecoration textDecoration2 = new TextDecoration("Underline", 1);
                Underline = textDecoration2;
                TextDecoration textDecoration3 = new TextDecoration("Overline", 2);
                Overline = textDecoration3;
                TextDecoration textDecoration4 = new TextDecoration("LineThrough", 3);
                LineThrough = textDecoration4;
                TextDecoration textDecoration5 = new TextDecoration("Blink", 4);
                Blink = textDecoration5;
                $VALUES = new TextDecoration[]{textDecoration, textDecoration2, textDecoration3, textDecoration4, textDecoration5};
            }

            public TextDecoration() {
                throw null;
            }

            public static TextDecoration valueOf(String str) {
                return (TextDecoration) Enum.valueOf(TextDecoration.class, str);
            }

            public static TextDecoration[] values() {
                return (TextDecoration[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextDirection {
            private static final /* synthetic */ TextDirection[] $VALUES;
            public static final TextDirection LTR;
            public static final TextDirection RTL;

            static {
                TextDirection textDirection = new TextDirection("LTR", 0);
                LTR = textDirection;
                TextDirection textDirection2 = new TextDirection("RTL", 1);
                RTL = textDirection2;
                $VALUES = new TextDirection[]{textDirection, textDirection2};
            }

            public TextDirection() {
                throw null;
            }

            public static TextDirection valueOf(String str) {
                return (TextDirection) Enum.valueOf(TextDirection.class, str);
            }

            public static TextDirection[] values() {
                return (TextDirection[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class VectorEffect {
            private static final /* synthetic */ VectorEffect[] $VALUES;
            public static final VectorEffect NonScalingStroke;
            public static final VectorEffect None;

            static {
                VectorEffect vectorEffect = new VectorEffect("None", 0);
                None = vectorEffect;
                VectorEffect vectorEffect2 = new VectorEffect("NonScalingStroke", 1);
                NonScalingStroke = vectorEffect2;
                $VALUES = new VectorEffect[]{vectorEffect, vectorEffect2};
            }

            public VectorEffect() {
                throw null;
            }

            public static VectorEffect valueOf(String str) {
                return (VectorEffect) Enum.valueOf(VectorEffect.class, str);
            }

            public static VectorEffect[] values() {
                return (VectorEffect[]) $VALUES.clone();
            }
        }

        public static Style a() {
            Style style = new Style();
            style.b = -1L;
            f fVar = f.c;
            style.c = fVar;
            FillRule fillRule = FillRule.NonZero;
            style.d = fillRule;
            Float valueOf = Float.valueOf(1.0f);
            style.e = valueOf;
            style.f = null;
            style.g = valueOf;
            style.h = new p(1.0f);
            style.i = LineCap.Butt;
            style.j = LineJoin.Miter;
            style.k = Float.valueOf(4.0f);
            style.l = null;
            style.m = new p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            style.n = valueOf;
            style.o = fVar;
            style.p = null;
            style.q = new p(12.0f, c1.pt);
            style.r = 400;
            style.s = FontStyle.Normal;
            style.t = TextDecoration.None;
            style.u = TextDirection.LTR;
            style.v = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.w = bool;
            style.x = null;
            style.y = null;
            style.z = null;
            style.A = null;
            style.B = bool;
            style.C = bool;
            style.D = fVar;
            style.E = valueOf;
            style.F = null;
            style.G = fillRule;
            style.H = null;
            style.I = null;
            style.J = valueOf;
            style.K = null;
            style.L = valueOf;
            style.M = VectorEffect.None;
            style.N = RenderQuality.auto;
            return style;
        }

        public final Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            p[] pVarArr = this.l;
            if (pVarArr != null) {
                style.l = (p[]) pVarArr.clone();
            }
            return style;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c1.values().length];
            a = iArr;
            try {
                iArr[c1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends z {
        @Override // com.caverock.androidsvg.SVG.z, com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "polygon";
        }
    }

    public interface a1 {
    }

    public static class b0 extends l {
        public p o;
        public p p;
        public p q;
        public p r;
        public p s;
        public p t;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "rect";
        }
    }

    public static class b1 extends m0 implements w0 {
        public String c;

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 a() {
            return null;
        }

        public final String toString() {
            return i5s.a(new StringBuilder("TextChild: '"), this.c, "'");
        }
    }

    public static class c {
        public p a;
        public p b;
        public p c;
        public p d;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c1 {
        private static final /* synthetic */ c1[] $VALUES;
        public static final c1 cm;
        public static final c1 em;
        public static final c1 ex;
        public static final c1 in;
        public static final c1 mm;
        public static final c1 pc;
        public static final c1 percent;
        public static final c1 pt;
        public static final c1 px;

        static {
            c1 c1Var = new c1("px", 0);
            px = c1Var;
            c1 c1Var2 = new c1("em", 1);
            em = c1Var2;
            c1 c1Var3 = new c1("ex", 2);
            ex = c1Var3;
            c1 c1Var4 = new c1("in", 3);
            in = c1Var4;
            c1 c1Var5 = new c1("cm", 4);
            cm = c1Var5;
            c1 c1Var6 = new c1("mm", 5);
            mm = c1Var6;
            c1 c1Var7 = new c1("pt", 6);
            pt = c1Var7;
            c1 c1Var8 = new c1("pc", 7);
            pc = c1Var8;
            c1 c1Var9 = new c1("percent", 8);
            percent = c1Var9;
            $VALUES = new c1[]{c1Var, c1Var2, c1Var3, c1Var4, c1Var5, c1Var6, c1Var7, c1Var8, c1Var9};
        }

        public c1() {
            throw null;
        }

        public static c1 valueOf(String str) {
            return (c1) Enum.valueOf(c1.class, str);
        }

        public static c1[] values() {
            return (c1[]) $VALUES.clone();
        }
    }

    public static class d extends l {
        public p o;
        public p p;
        public p q;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "circle";
        }
    }

    public static class d1 extends m {
        public String o;
        public p p;
        public p q;
        public p r;
        public p s;

        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String m() {
            return MLFeatureConfigProviderBase.ENABLED_KEY;
        }
    }

    public static class e extends m implements t {
        public Boolean o;

        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "clipPath";
        }
    }

    public static class e0 extends q0 {
        public p p;
        public p q;
        public p r;
        public p s;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "svg";
        }
    }

    public static class e1 extends q0 implements t {
        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW;
        }
    }

    public static class f extends n0 {
        public static final f c = new f(-16777216);
        public static final f d = new f(0);
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.b));
        }
    }

    public interface f0 {
        void b(HashSet hashSet);

        void c(HashSet hashSet);

        Set<String> d();

        void e(String str);

        String f();

        Set<String> g();

        Set<String> h();

        void i(HashSet hashSet);

        void j(HashSet hashSet);

        Set<String> l();
    }

    public static class g extends n0 {
        public static final g b = new g();
    }

    public static class h extends m implements t {
        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "defs";
        }
    }

    public static abstract class h0 extends j0 implements f0 {
        public HashSet i;
        public String j;
        public HashSet k;
        public HashSet l;
        public HashSet m;

        @Override // com.caverock.androidsvg.SVG.f0
        public final void b(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void c(HashSet hashSet) {
            this.i = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> d() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void e(String str) {
            this.j = str;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final String f() {
            return this.j;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> g() {
            return this.l;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> h() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void i(HashSet hashSet) {
            this.k = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void j(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> l() {
            return this.m;
        }
    }

    public static class i extends l {
        public p o;
        public p p;
        public p q;
        public p r;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "ellipse";
        }
    }

    public interface i0 {
        List<m0> n();

        void o(m0 m0Var) throws SVGParseException;
    }

    public static abstract class j extends k0 implements i0 {
        public List<m0> h = new ArrayList();
        public Boolean i;
        public Matrix j;
        public k k;
        public String l;

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> n() {
            return this.h;
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final void o(m0 m0Var) throws SVGParseException {
            if (m0Var instanceof d0) {
                this.h.add(m0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + m0Var + " elements.");
        }
    }

    public static abstract class j0 extends k0 {
        public b h = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class k {
        private static final /* synthetic */ k[] $VALUES;
        public static final k pad;
        public static final k reflect;
        public static final k repeat;

        static {
            k kVar = new k("pad", 0);
            pad = kVar;
            k kVar2 = new k("reflect", 1);
            reflect = kVar2;
            k kVar3 = new k("repeat", 2);
            repeat = kVar3;
            $VALUES = new k[]{kVar, kVar2, kVar3};
        }

        public k() {
            throw null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) $VALUES.clone();
        }
    }

    public static abstract class k0 extends m0 {
        public String c = null;
        public Boolean d = null;
        public Style e = null;
        public Style f = null;
        public ArrayList g = null;

        public final String toString() {
            return m();
        }
    }

    public static abstract class l extends h0 implements n {
        public Matrix n;

        public l() {
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
        }

        @Override // com.caverock.androidsvg.SVG.n
        public final void k(Matrix matrix) {
            this.n = matrix;
        }
    }

    public static class l0 extends j {
        public p m;
        public p n;
        public p o;
        public p p;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "linearGradient";
        }
    }

    public static class m extends g0 implements n {
        public Matrix n;

        @Override // com.caverock.androidsvg.SVG.n
        public final void k(Matrix matrix) {
            this.n = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.m0
        public String m() {
            return "group";
        }
    }

    public static class m0 {
        public SVG a;
        public i0 b;

        public String m() {
            return "";
        }
    }

    public interface n {
        void k(Matrix matrix);
    }

    public static abstract class n0 implements Cloneable {
    }

    public static class o extends o0 implements n {
        public String o;
        public p p;
        public p q;
        public p r;
        public p s;
        public Matrix t;

        @Override // com.caverock.androidsvg.SVG.n
        public final void k(Matrix matrix) {
            this.t = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "image";
        }
    }

    public static abstract class o0 extends g0 {
        public PreserveAspectRatio n = null;
    }

    public static class p0 extends j {
        public p m;
        public p n;
        public p o;
        public p p;
        public p q;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "radialGradient";
        }
    }

    public static class q extends l {
        public p o;
        public p p;
        public p q;
        public p r;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "line";
        }
    }

    public static abstract class q0 extends o0 {
        public b o;
    }

    public static class r extends q0 implements t {
        public boolean p;
        public p q;
        public p r;
        public p s;
        public p t;
        public Float u;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "marker";
        }
    }

    public static class r0 extends m {
        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "switch";
        }
    }

    public static class s extends g0 implements t {
        public Boolean n;
        public Boolean o;
        public p p;
        public p q;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "mask";
        }
    }

    public static class s0 extends q0 implements t {
        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "symbol";
        }
    }

    public interface t {
    }

    public static class t0 extends x0 implements w0 {
        public String n;
        public a1 o;

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 a() {
            return this.o;
        }

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return TrackReferenceBox.TYPE;
        }
    }

    public static class u extends n0 {
        public final String b;
        public final n0 c;

        public u(String str, n0 n0Var) {
            this.b = str;
            this.c = n0Var;
        }

        public final String toString() {
            return this.b + " " + this.c;
        }
    }

    public static class u0 extends z0 implements w0 {
        public a1 r;

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 a() {
            return this.r;
        }

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "tspan";
        }
    }

    public static class v extends l {
        public w o;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "path";
        }
    }

    public static class v0 extends z0 implements a1, n {
        public Matrix r;

        @Override // com.caverock.androidsvg.SVG.n
        public final void k(Matrix matrix) {
            this.r = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "text";
        }
    }

    public static class w implements x {
        public byte[] a;
        public int b;
        public float[] c;
        public int d;

        @Override // com.caverock.androidsvg.SVG.x
        public final void a(float f, float f2) {
            f((byte) 0);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
            f((byte) 2);
            g(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void c(float f, float f2) {
            f((byte) 1);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void close() {
            f((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            f((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            g(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void e(float f, float f2, float f3, float f4) {
            f((byte) 3);
            g(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        public final void f(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        public final void g(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        public final void h(x xVar) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i2];
                if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    xVar.a(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    xVar.c(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    xVar.b(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.c;
                    float f3 = fArr4[i];
                    float f4 = fArr4[i + 1];
                    int i5 = i + 3;
                    float f5 = fArr4[i + 2];
                    i += 4;
                    xVar.e(f3, f4, f5, fArr4[i5]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.c;
                    xVar.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    xVar.close();
                }
            }
        }
    }

    public interface w0 {
        a1 a();
    }

    public interface x {
        void a(float f, float f2);

        void b(float f, float f2, float f3, float f4, float f5, float f6);

        void c(float f, float f2);

        void close();

        void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void e(float f, float f2, float f3, float f4);
    }

    public static abstract class x0 extends g0 {
        @Override // com.caverock.androidsvg.SVG.g0, com.caverock.androidsvg.SVG.i0
        public final void o(m0 m0Var) throws SVGParseException {
            if (m0Var instanceof w0) {
                this.i.add(m0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + m0Var + " elements.");
        }
    }

    public static class y extends q0 implements t {
        public Boolean p;
        public Boolean q;
        public Matrix r;
        public p s;
        public p t;
        public p u;
        public p v;
        public String w;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "pattern";
        }
    }

    public static class y0 extends x0 implements w0 {
        public String n;
        public p o;
        public a1 p;

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 a() {
            return this.p;
        }

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "textPath";
        }
    }

    public static class z extends l {
        public float[] o;

        @Override // com.caverock.androidsvg.SVG.m0
        public String m() {
            return "polyline";
        }
    }

    public static abstract class z0 extends x0 {
        public ArrayList n;
        public ArrayList o;
        public ArrayList p;
        public ArrayList q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k0 b(i0 i0Var, String str) {
        k0 b2;
        k0 k0Var = (k0) i0Var;
        if (str.equals(k0Var.c)) {
            return k0Var;
        }
        for (Object obj : i0Var.n()) {
            if (obj instanceof k0) {
                k0 k0Var2 = (k0) obj;
                if (str.equals(k0Var2.c)) {
                    return k0Var2;
                }
                if ((obj instanceof i0) && (b2 = b((i0) obj, str)) != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    public static SVG c(InputStream inputStream) throws SVGParseException {
        com.caverock.androidsvg.c cVar = new com.caverock.androidsvg.c();
        cVar.a = null;
        cVar.b = null;
        cVar.c = false;
        cVar.e = false;
        cVar.f = null;
        cVar.g = null;
        cVar.h = false;
        cVar.i = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            cVar.B(inputStream);
            return cVar.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public final b a() {
        c1 c1Var;
        c1 c1Var2;
        c1 c1Var3;
        c1 c1Var4;
        float f2;
        c1 c1Var5;
        e0 e0Var = this.a;
        p pVar = e0Var.r;
        p pVar2 = e0Var.s;
        if (pVar == null || pVar.j() || (c1Var = pVar.c) == (c1Var2 = c1.percent) || c1Var == (c1Var3 = c1.em) || c1Var == (c1Var4 = c1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float e2 = pVar.e();
        if (pVar2 == null) {
            b bVar = this.a.o;
            f2 = bVar != null ? (bVar.d * e2) / bVar.c : e2;
        } else {
            if (pVar2.j() || (c1Var5 = pVar2.c) == c1Var2 || c1Var5 == c1Var3 || c1Var5 == c1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f2 = pVar2.e();
        }
        return new b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e2, f2);
    }

    public final Picture d() {
        p pVar;
        e0 e0Var = this.a;
        b bVar = e0Var.o;
        p pVar2 = e0Var.r;
        if (pVar2 != null) {
            c1 c1Var = pVar2.c;
            c1 c1Var2 = c1.percent;
            if (c1Var != c1Var2 && (pVar = e0Var.s) != null && pVar.c != c1Var2) {
                return e((int) Math.ceil(pVar2.e()), (int) Math.ceil(this.a.s.e()));
            }
        }
        if (pVar2 != null && bVar != null) {
            return e((int) Math.ceil(pVar2.e()), (int) Math.ceil((bVar.d * r0) / bVar.c));
        }
        p pVar3 = e0Var.s;
        if (pVar3 == null || bVar == null) {
            return e(512, 512);
        }
        return e((int) Math.ceil((bVar.c * r0) / bVar.d), (int) Math.ceil(pVar3.e()));
    }

    public final Picture e(int i2, int i3) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i2, i3);
        b bVar = new b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, i3);
        com.caverock.androidsvg.b bVar2 = new com.caverock.androidsvg.b();
        bVar2.a = beginRecording;
        bVar2.b = this;
        e0 e0Var = this.a;
        if (e0Var != null) {
            b bVar3 = e0Var.o;
            PreserveAspectRatio preserveAspectRatio = e0Var.n;
            bVar2.c = new b.h();
            bVar2.d = new Stack<>();
            bVar2.S(bVar2.c, Style.a());
            b.h hVar = bVar2.c;
            hVar.f = null;
            hVar.h = false;
            bVar2.d.push(new b.h(hVar));
            bVar2.f = new Stack<>();
            bVar2.e = new Stack<>();
            Boolean bool = e0Var.d;
            if (bool != null) {
                bVar2.c.h = bool.booleanValue();
            }
            bVar2.P();
            b bVar4 = new b(bVar);
            p pVar = e0Var.r;
            if (pVar != null) {
                bVar4.c = pVar.b(bVar2, bVar4.c);
            }
            p pVar2 = e0Var.s;
            if (pVar2 != null) {
                bVar4.d = pVar2.b(bVar2, bVar4.d);
            }
            bVar2.G(e0Var, bVar4, bVar3, preserveAspectRatio);
            bVar2.O();
        }
        picture.endRecording();
        return picture;
    }

    public final k0 f(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        String substring = replace.substring(1);
        HashMap hashMap = this.c;
        if (substring == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.a.c)) {
            return this.a;
        }
        if (hashMap.containsKey(substring)) {
            return (k0) hashMap.get(substring);
        }
        k0 b2 = b(this.a, substring);
        hashMap.put(substring, b2);
        return b2;
    }

    public static class p implements Cloneable {
        public final float b;
        public final c1 c;

        public p(float f, c1 c1Var) {
            this.b = f;
            this.c = c1Var;
        }

        public final float a(com.caverock.androidsvg.b bVar) {
            float sqrt;
            if (this.c != c1.percent) {
                return f(bVar);
            }
            b.h hVar = bVar.c;
            b bVar2 = hVar.g;
            if (bVar2 == null) {
                bVar2 = hVar.f;
            }
            float f = this.b;
            if (bVar2 == null) {
                return f;
            }
            float f2 = bVar2.c;
            if (f2 == bVar2.d) {
                sqrt = f * f2;
            } else {
                sqrt = f * ((float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d));
            }
            return sqrt / 100.0f;
        }

        public final float b(com.caverock.androidsvg.b bVar, float f) {
            return this.c == c1.percent ? (this.b * f) / 100.0f : f(bVar);
        }

        public final float e() {
            float f;
            float f2;
            int i = a.a[this.c.ordinal()];
            float f3 = this.b;
            if (i == 1) {
                return f3;
            }
            switch (i) {
                case 4:
                    return f3 * 96.0f;
                case 5:
                    f = f3 * 96.0f;
                    f2 = 2.54f;
                    break;
                case 6:
                    f = f3 * 96.0f;
                    f2 = 25.4f;
                    break;
                case 7:
                    f = f3 * 96.0f;
                    f2 = 72.0f;
                    break;
                case 8:
                    f = f3 * 96.0f;
                    f2 = 6.0f;
                    break;
                default:
                    return f3;
            }
            return f / f2;
        }

        public final float f(com.caverock.androidsvg.b bVar) {
            float textSize;
            int i = a.a[this.c.ordinal()];
            float f = this.b;
            switch (i) {
                case 2:
                    textSize = bVar.c.d.getTextSize();
                    break;
                case 3:
                    textSize = bVar.c.d.getTextSize() / 2.0f;
                    break;
                case 4:
                    bVar.getClass();
                    return f * 96.0f;
                case 5:
                    bVar.getClass();
                    return (f * 96.0f) / 2.54f;
                case 6:
                    bVar.getClass();
                    return (f * 96.0f) / 25.4f;
                case 7:
                    bVar.getClass();
                    return (f * 96.0f) / 72.0f;
                case 8:
                    bVar.getClass();
                    return (f * 96.0f) / 6.0f;
                case 9:
                    b.h hVar = bVar.c;
                    b bVar2 = hVar.g;
                    if (bVar2 == null) {
                        bVar2 = hVar.f;
                    }
                    if (bVar2 != null) {
                        return (f * bVar2.c) / 100.0f;
                    }
                default:
                    return f;
            }
            return textSize * f;
        }

        public final float g(com.caverock.androidsvg.b bVar) {
            if (this.c != c1.percent) {
                return f(bVar);
            }
            b.h hVar = bVar.c;
            b bVar2 = hVar.g;
            if (bVar2 == null) {
                bVar2 = hVar.f;
            }
            float f = this.b;
            return bVar2 == null ? f : (f * bVar2.d) / 100.0f;
        }

        public final boolean i() {
            return this.b < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final boolean j() {
            return this.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final String toString() {
            return String.valueOf(this.b) + this.c;
        }

        public p(float f) {
            this.b = f;
            this.c = c1.px;
        }
    }

    public static class b {
        public float a;
        public float b;
        public float c;
        public float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final float a() {
            return this.a + this.c;
        }

        public final float b() {
            return this.b + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(X3.j.d);
            sb.append(this.a);
            sb.append(" ");
            sb.append(this.b);
            sb.append(" ");
            sb.append(this.c);
            sb.append(" ");
            return shy.c(this.d, X3.j.e, sb);
        }

        public b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
        }
    }

    public static class c0 extends k0 implements i0 {
        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "solidColor";
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> n() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final void o(m0 m0Var) {
        }
    }

    public static class d0 extends k0 implements i0 {
        public Float h;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String m() {
            return "stop";
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> n() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final void o(m0 m0Var) {
        }
    }

    public static abstract class g0 extends j0 implements i0, f0 {
        public List<m0> i = new ArrayList();
        public HashSet j = null;
        public String k = null;
        public HashSet l = null;
        public HashSet m = null;

        @Override // com.caverock.androidsvg.SVG.f0
        public final void b(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void c(HashSet hashSet) {
            this.j = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> d() {
            return this.j;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void e(String str) {
            this.k = str;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final String f() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> g() {
            return this.l;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> h() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void j(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> l() {
            return this.m;
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> n() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public void o(m0 m0Var) throws SVGParseException {
            this.i.add(m0Var);
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void i(HashSet hashSet) {
        }
    }
}
