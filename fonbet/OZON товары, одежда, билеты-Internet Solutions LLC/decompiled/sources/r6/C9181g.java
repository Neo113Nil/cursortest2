package r6;

import C.o0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import r6.C9176b;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

/* renamed from: r6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9181g {

    /* renamed from: a, reason: collision with root package name */
    private F f82940a = null;

    /* renamed from: b, reason: collision with root package name */
    private C9176b.q f82941b = new C9176b.q();

    /* renamed from: c, reason: collision with root package name */
    private HashMap f82942c = new HashMap();

    /* renamed from: r6.g$A */
    /* loaded from: classes8.dex */
    static class A extends C9206z {
        A() {
        }

        @Override // r6.C9181g.C9206z, r6.C9181g.N
        final String n() {
            return "polygon";
        }
    }

    /* renamed from: r6.g$B */
    /* loaded from: classes8.dex */
    static class B extends AbstractC9192l {

        /* renamed from: o, reason: collision with root package name */
        C9196p f82943o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f82944p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f82945q;

        /* renamed from: r, reason: collision with root package name */
        C9196p f82946r;

        /* renamed from: s, reason: collision with root package name */
        C9196p f82947s;

        /* renamed from: t, reason: collision with root package name */
        C9196p f82948t;

        B() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "rect";
        }
    }

    /* renamed from: r6.g$C */
    /* loaded from: classes8.dex */
    static class C extends L implements J {
        C() {
        }

        @Override // r6.C9181g.J
        public final List<N> d() {
            return Collections.EMPTY_LIST;
        }

        @Override // r6.C9181g.J
        public final void i(N n11) {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "solidColor";
        }
    }

    /* renamed from: r6.g$D */
    /* loaded from: classes8.dex */
    static class D extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        Float f82949h;

        D() {
        }

        @Override // r6.C9181g.J
        public final List<N> d() {
            return Collections.EMPTY_LIST;
        }

        @Override // r6.C9181g.J
        public final void i(N n11) {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "stop";
        }
    }

    /* renamed from: r6.g$E */
    /* loaded from: classes8.dex */
    static class E implements Cloneable {

        /* renamed from: A, reason: collision with root package name */
        Boolean f82950A;

        /* renamed from: B, reason: collision with root package name */
        Boolean f82951B;

        /* renamed from: C, reason: collision with root package name */
        O f82952C;

        /* renamed from: D, reason: collision with root package name */
        Float f82953D;

        /* renamed from: E, reason: collision with root package name */
        String f82954E;

        /* renamed from: F, reason: collision with root package name */
        a f82955F;

        /* renamed from: G, reason: collision with root package name */
        String f82956G;

        /* renamed from: H, reason: collision with root package name */
        O f82957H;

        /* renamed from: I, reason: collision with root package name */
        Float f82958I;

        /* renamed from: J, reason: collision with root package name */
        O f82959J;

        /* renamed from: K, reason: collision with root package name */
        Float f82960K;

        /* renamed from: L, reason: collision with root package name */
        i f82961L;

        /* renamed from: M, reason: collision with root package name */
        e f82962M;

        /* renamed from: a, reason: collision with root package name */
        long f82963a = 0;

        /* renamed from: b, reason: collision with root package name */
        O f82964b;

        /* renamed from: c, reason: collision with root package name */
        a f82965c;

        /* renamed from: d, reason: collision with root package name */
        Float f82966d;

        /* renamed from: e, reason: collision with root package name */
        O f82967e;

        /* renamed from: f, reason: collision with root package name */
        Float f82968f;

        /* renamed from: g, reason: collision with root package name */
        C9196p f82969g;

        /* renamed from: h, reason: collision with root package name */
        c f82970h;

        /* renamed from: i, reason: collision with root package name */
        d f82971i;

        /* renamed from: j, reason: collision with root package name */
        Float f82972j;

        /* renamed from: k, reason: collision with root package name */
        C9196p[] f82973k;

        /* renamed from: l, reason: collision with root package name */
        C9196p f82974l;

        /* renamed from: m, reason: collision with root package name */
        Float f82975m;

        /* renamed from: n, reason: collision with root package name */
        C9187f f82976n;

        /* renamed from: o, reason: collision with root package name */
        ArrayList f82977o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f82978p;

        /* renamed from: q, reason: collision with root package name */
        Integer f82979q;

        /* renamed from: r, reason: collision with root package name */
        b f82980r;

        /* renamed from: s, reason: collision with root package name */
        EnumC1411g f82981s;

        /* renamed from: t, reason: collision with root package name */
        h f82982t;

        /* renamed from: u, reason: collision with root package name */
        f f82983u;

        /* renamed from: v, reason: collision with root package name */
        Boolean f82984v;

        /* renamed from: w, reason: collision with root package name */
        C9184c f82985w;

        /* renamed from: x, reason: collision with root package name */
        String f82986x;

        /* renamed from: y, reason: collision with root package name */
        String f82987y;

        /* renamed from: z, reason: collision with root package name */
        String f82988z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$a */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES;
            public static final a EvenOdd;
            public static final a NonZero;

            static {
                a aVar = new a("NonZero", 0);
                NonZero = aVar;
                a aVar2 = new a("EvenOdd", 1);
                EvenOdd = aVar2;
                $VALUES = new a[]{aVar, aVar2};
            }

            private a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$b */
        public static final class b {
            private static final /* synthetic */ b[] $VALUES;
            public static final b Italic;
            public static final b Normal;
            public static final b Oblique;

            static {
                b bVar = new b("Normal", 0);
                Normal = bVar;
                b bVar2 = new b("Italic", 1);
                Italic = bVar2;
                b bVar3 = new b("Oblique", 2);
                Oblique = bVar3;
                $VALUES = new b[]{bVar, bVar2, bVar3};
            }

            private b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$c */
        public static final class c {
            private static final /* synthetic */ c[] $VALUES;
            public static final c Butt;
            public static final c Round;
            public static final c Square;

            static {
                c cVar = new c("Butt", 0);
                Butt = cVar;
                c cVar2 = new c("Round", 1);
                Round = cVar2;
                c cVar3 = new c("Square", 2);
                Square = cVar3;
                $VALUES = new c[]{cVar, cVar2, cVar3};
            }

            private c() {
                throw null;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$d */
        public static final class d {
            private static final /* synthetic */ d[] $VALUES;
            public static final d Bevel;
            public static final d Miter;
            public static final d Round;

            static {
                d dVar = new d("Miter", 0);
                Miter = dVar;
                d dVar2 = new d("Round", 1);
                Round = dVar2;
                d dVar3 = new d("Bevel", 2);
                Bevel = dVar3;
                $VALUES = new d[]{dVar, dVar2, dVar3};
            }

            private d() {
                throw null;
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$e */
        public static final class e {
            private static final /* synthetic */ e[] $VALUES;
            public static final e auto;
            public static final e optimizeQuality;
            public static final e optimizeSpeed;

            static {
                e eVar = new e("auto", 0);
                auto = eVar;
                e eVar2 = new e("optimizeQuality", 1);
                optimizeQuality = eVar2;
                e eVar3 = new e("optimizeSpeed", 2);
                optimizeSpeed = eVar3;
                $VALUES = new e[]{eVar, eVar2, eVar3};
            }

            private e() {
                throw null;
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$f */
        public static final class f {
            private static final /* synthetic */ f[] $VALUES;
            public static final f End;
            public static final f Middle;
            public static final f Start;

            static {
                f fVar = new f("Start", 0);
                Start = fVar;
                f fVar2 = new f("Middle", 1);
                Middle = fVar2;
                f fVar3 = new f("End", 2);
                End = fVar3;
                $VALUES = new f[]{fVar, fVar2, fVar3};
            }

            private f() {
                throw null;
            }

            public static f valueOf(String str) {
                return (f) Enum.valueOf(f.class, str);
            }

            public static f[] values() {
                return (f[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$g, reason: collision with other inner class name */
        public static final class EnumC1411g {
            private static final /* synthetic */ EnumC1411g[] $VALUES;
            public static final EnumC1411g Blink;
            public static final EnumC1411g LineThrough;
            public static final EnumC1411g None;
            public static final EnumC1411g Overline;
            public static final EnumC1411g Underline;

            static {
                EnumC1411g enumC1411g = new EnumC1411g("None", 0);
                None = enumC1411g;
                EnumC1411g enumC1411g2 = new EnumC1411g("Underline", 1);
                Underline = enumC1411g2;
                EnumC1411g enumC1411g3 = new EnumC1411g("Overline", 2);
                Overline = enumC1411g3;
                EnumC1411g enumC1411g4 = new EnumC1411g("LineThrough", 3);
                LineThrough = enumC1411g4;
                EnumC1411g enumC1411g5 = new EnumC1411g("Blink", 4);
                Blink = enumC1411g5;
                $VALUES = new EnumC1411g[]{enumC1411g, enumC1411g2, enumC1411g3, enumC1411g4, enumC1411g5};
            }

            private EnumC1411g() {
                throw null;
            }

            public static EnumC1411g valueOf(String str) {
                return (EnumC1411g) Enum.valueOf(EnumC1411g.class, str);
            }

            public static EnumC1411g[] values() {
                return (EnumC1411g[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$h */
        public static final class h {
            private static final /* synthetic */ h[] $VALUES;
            public static final h LTR;
            public static final h RTL;

            static {
                h hVar = new h("LTR", 0);
                LTR = hVar;
                h hVar2 = new h("RTL", 1);
                RTL = hVar2;
                $VALUES = new h[]{hVar, hVar2};
            }

            private h() {
                throw null;
            }

            public static h valueOf(String str) {
                return (h) Enum.valueOf(h.class, str);
            }

            public static h[] values() {
                return (h[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: r6.g$E$i */
        public static final class i {
            private static final /* synthetic */ i[] $VALUES;
            public static final i NonScalingStroke;
            public static final i None;

            static {
                i iVar = new i("None", 0);
                None = iVar;
                i iVar2 = new i("NonScalingStroke", 1);
                NonScalingStroke = iVar2;
                $VALUES = new i[]{iVar, iVar2};
            }

            private i() {
                throw null;
            }

            public static i valueOf(String str) {
                return (i) Enum.valueOf(i.class, str);
            }

            public static i[] values() {
                return (i[]) $VALUES.clone();
            }
        }

        E() {
        }

        static E a() {
            E e11 = new E();
            e11.f82963a = -1L;
            C9187f c9187f = C9187f.f83053b;
            e11.f82964b = c9187f;
            a aVar = a.NonZero;
            e11.f82965c = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e11.f82966d = valueOf;
            e11.f82967e = null;
            e11.f82968f = valueOf;
            e11.f82969g = new C9196p(1.0f);
            e11.f82970h = c.Butt;
            e11.f82971i = d.Miter;
            e11.f82972j = Float.valueOf(4.0f);
            e11.f82973k = null;
            e11.f82974l = new C9196p(0.0f);
            e11.f82975m = valueOf;
            e11.f82976n = c9187f;
            e11.f82977o = null;
            e11.f82978p = new C9196p(12.0f, d0.pt);
            e11.f82979q = 400;
            e11.f82980r = b.Normal;
            e11.f82981s = EnumC1411g.None;
            e11.f82982t = h.LTR;
            e11.f82983u = f.Start;
            Boolean bool = Boolean.TRUE;
            e11.f82984v = bool;
            e11.f82985w = null;
            e11.f82986x = null;
            e11.f82987y = null;
            e11.f82988z = null;
            e11.f82950A = bool;
            e11.f82951B = bool;
            e11.f82952C = c9187f;
            e11.f82953D = valueOf;
            e11.f82954E = null;
            e11.f82955F = aVar;
            e11.f82956G = null;
            e11.f82957H = null;
            e11.f82958I = valueOf;
            e11.f82959J = null;
            e11.f82960K = valueOf;
            e11.f82961L = i.None;
            e11.f82962M = e.auto;
            return e11;
        }

        protected final Object clone() throws CloneNotSupportedException {
            E e11 = (E) super.clone();
            C9196p[] c9196pArr = this.f82973k;
            if (c9196pArr != null) {
                e11.f82973k = (C9196p[]) c9196pArr.clone();
            }
            return e11;
        }
    }

    /* renamed from: r6.g$F */
    /* loaded from: classes8.dex */
    static class F extends R {

        /* renamed from: p, reason: collision with root package name */
        C9196p f82989p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f82990q;

        /* renamed from: r, reason: collision with root package name */
        C9196p f82991r;

        /* renamed from: s, reason: collision with root package name */
        C9196p f82992s;

        F() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "svg";
        }
    }

    /* renamed from: r6.g$G */
    /* loaded from: classes8.dex */
    interface G {
        String a();

        void c(HashSet hashSet);

        Set<String> e();

        Set<String> f();

        void g(HashSet hashSet);

        Set<String> getRequiredFeatures();

        void h(HashSet hashSet);

        void j(HashSet hashSet);

        void k(String str);

        Set<String> m();
    }

    /* renamed from: r6.g$H */
    /* loaded from: classes8.dex */
    static abstract class H extends K implements J, G {

        /* renamed from: i, reason: collision with root package name */
        ArrayList f82993i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        HashSet f82994j = null;

        /* renamed from: k, reason: collision with root package name */
        String f82995k = null;

        /* renamed from: l, reason: collision with root package name */
        HashSet f82996l = null;

        /* renamed from: m, reason: collision with root package name */
        HashSet f82997m = null;

        H() {
        }

        @Override // r6.C9181g.G
        public final String a() {
            return this.f82995k;
        }

        @Override // r6.C9181g.G
        public final void c(HashSet hashSet) {
            this.f82996l = hashSet;
        }

        @Override // r6.C9181g.J
        public final List<N> d() {
            return this.f82993i;
        }

        @Override // r6.C9181g.G
        public final Set<String> e() {
            return this.f82996l;
        }

        @Override // r6.C9181g.G
        public final Set<String> f() {
            return null;
        }

        @Override // r6.C9181g.G
        public final void g(HashSet hashSet) {
            this.f82994j = hashSet;
        }

        @Override // r6.C9181g.G
        public final Set<String> getRequiredFeatures() {
            return this.f82994j;
        }

        @Override // r6.C9181g.G
        public final void h(HashSet hashSet) {
        }

        @Override // r6.C9181g.J
        public void i(N n11) throws C9208i {
            this.f82993i.add(n11);
        }

        @Override // r6.C9181g.G
        public final void j(HashSet hashSet) {
            this.f82997m = hashSet;
        }

        @Override // r6.C9181g.G
        public final void k(String str) {
            this.f82995k = str;
        }

        @Override // r6.C9181g.G
        public final Set<String> m() {
            return this.f82997m;
        }
    }

    /* renamed from: r6.g$I */
    /* loaded from: classes8.dex */
    static abstract class I extends K implements G {

        /* renamed from: i, reason: collision with root package name */
        HashSet f82998i;

        /* renamed from: j, reason: collision with root package name */
        String f82999j;

        /* renamed from: k, reason: collision with root package name */
        HashSet f83000k;

        /* renamed from: l, reason: collision with root package name */
        HashSet f83001l;

        /* renamed from: m, reason: collision with root package name */
        HashSet f83002m;

        @Override // r6.C9181g.G
        public final String a() {
            return this.f82999j;
        }

        @Override // r6.C9181g.G
        public final void c(HashSet hashSet) {
            this.f83001l = hashSet;
        }

        @Override // r6.C9181g.G
        public final Set<String> e() {
            return this.f83001l;
        }

        @Override // r6.C9181g.G
        public final Set<String> f() {
            return this.f83000k;
        }

        @Override // r6.C9181g.G
        public final void g(HashSet hashSet) {
            this.f82998i = hashSet;
        }

        @Override // r6.C9181g.G
        public final Set<String> getRequiredFeatures() {
            return this.f82998i;
        }

        @Override // r6.C9181g.G
        public final void h(HashSet hashSet) {
            this.f83000k = hashSet;
        }

        @Override // r6.C9181g.G
        public final void j(HashSet hashSet) {
            this.f83002m = hashSet;
        }

        @Override // r6.C9181g.G
        public final void k(String str) {
            this.f82999j = str;
        }

        @Override // r6.C9181g.G
        public final Set<String> m() {
            return this.f83002m;
        }
    }

    /* renamed from: r6.g$J */
    /* loaded from: classes8.dex */
    interface J {
        List<N> d();

        void i(N n11) throws C9208i;
    }

    /* renamed from: r6.g$K */
    /* loaded from: classes8.dex */
    static abstract class K extends L {

        /* renamed from: h, reason: collision with root package name */
        C9183b f83003h = null;

        K() {
        }
    }

    /* renamed from: r6.g$L */
    /* loaded from: classes8.dex */
    static abstract class L extends N {

        /* renamed from: c, reason: collision with root package name */
        String f83004c = null;

        /* renamed from: d, reason: collision with root package name */
        Boolean f83005d = null;

        /* renamed from: e, reason: collision with root package name */
        E f83006e = null;

        /* renamed from: f, reason: collision with root package name */
        E f83007f = null;

        /* renamed from: g, reason: collision with root package name */
        ArrayList f83008g = null;

        L() {
        }

        public final String toString() {
            return n();
        }
    }

    /* renamed from: r6.g$M */
    /* loaded from: classes8.dex */
    static class M extends AbstractC9190j {

        /* renamed from: m, reason: collision with root package name */
        C9196p f83009m;

        /* renamed from: n, reason: collision with root package name */
        C9196p f83010n;

        /* renamed from: o, reason: collision with root package name */
        C9196p f83011o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83012p;

        M() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "linearGradient";
        }
    }

    /* renamed from: r6.g$N */
    /* loaded from: classes8.dex */
    static class N {

        /* renamed from: a, reason: collision with root package name */
        C9181g f83013a;

        /* renamed from: b, reason: collision with root package name */
        J f83014b;

        N() {
        }

        String n() {
            return "";
        }
    }

    /* renamed from: r6.g$O */
    /* loaded from: classes8.dex */
    static abstract class O implements Cloneable {
    }

    /* renamed from: r6.g$P */
    /* loaded from: classes8.dex */
    static abstract class P extends H {

        /* renamed from: n, reason: collision with root package name */
        C9179e f83015n = null;

        P() {
        }
    }

    /* renamed from: r6.g$Q */
    /* loaded from: classes8.dex */
    static class Q extends AbstractC9190j {

        /* renamed from: m, reason: collision with root package name */
        C9196p f83016m;

        /* renamed from: n, reason: collision with root package name */
        C9196p f83017n;

        /* renamed from: o, reason: collision with root package name */
        C9196p f83018o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83019p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83020q;

        Q() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "radialGradient";
        }
    }

    /* renamed from: r6.g$R */
    /* loaded from: classes8.dex */
    static abstract class R extends P {

        /* renamed from: o, reason: collision with root package name */
        C9183b f83021o;
    }

    /* renamed from: r6.g$S */
    /* loaded from: classes8.dex */
    static class S extends C9193m {
        S() {
        }

        @Override // r6.C9181g.C9193m, r6.C9181g.N
        final String n() {
            return "switch";
        }
    }

    /* renamed from: r6.g$T */
    /* loaded from: classes8.dex */
    static class T extends R implements InterfaceC9200t {
        T() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "symbol";
        }
    }

    /* renamed from: r6.g$U */
    /* loaded from: classes8.dex */
    static class U extends Y implements X {

        /* renamed from: n, reason: collision with root package name */
        String f83022n;

        /* renamed from: o, reason: collision with root package name */
        private b0 f83023o;

        U() {
        }

        @Override // r6.C9181g.X
        public final b0 b() {
            return this.f83023o;
        }

        @Override // r6.C9181g.N
        final String n() {
            return "tref";
        }

        public final void o(b0 b0Var) {
            this.f83023o = b0Var;
        }
    }

    /* renamed from: r6.g$V */
    /* loaded from: classes8.dex */
    static class V extends a0 implements X {

        /* renamed from: r, reason: collision with root package name */
        private b0 f83024r;

        V() {
        }

        @Override // r6.C9181g.X
        public final b0 b() {
            return this.f83024r;
        }

        @Override // r6.C9181g.N
        final String n() {
            return "tspan";
        }

        public final void o(b0 b0Var) {
            this.f83024r = b0Var;
        }
    }

    /* renamed from: r6.g$W */
    /* loaded from: classes8.dex */
    static class W extends a0 implements b0, InterfaceC9194n {

        /* renamed from: r, reason: collision with root package name */
        Matrix f83025r;

        W() {
        }

        @Override // r6.C9181g.InterfaceC9194n
        public final void l(Matrix matrix) {
            this.f83025r = matrix;
        }

        @Override // r6.C9181g.N
        final String n() {
            return "text";
        }
    }

    /* renamed from: r6.g$X */
    /* loaded from: classes8.dex */
    interface X {
        b0 b();
    }

    /* renamed from: r6.g$Y */
    /* loaded from: classes8.dex */
    static abstract class Y extends H {
        Y() {
        }

        @Override // r6.C9181g.H, r6.C9181g.J
        public final void i(N n11) throws C9208i {
            if (n11 instanceof X) {
                this.f82993i.add(n11);
                return;
            }
            throw new C9208i("Text content elements cannot contain " + n11 + " elements.");
        }
    }

    /* renamed from: r6.g$Z */
    /* loaded from: classes8.dex */
    static class Z extends Y implements X {

        /* renamed from: n, reason: collision with root package name */
        String f83026n;

        /* renamed from: o, reason: collision with root package name */
        C9196p f83027o;

        /* renamed from: p, reason: collision with root package name */
        private b0 f83028p;

        Z() {
        }

        @Override // r6.C9181g.X
        public final b0 b() {
            return this.f83028p;
        }

        @Override // r6.C9181g.N
        final String n() {
            return "textPath";
        }

        public final void o(b0 b0Var) {
            this.f83028p = b0Var;
        }
    }

    /* renamed from: r6.g$a, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static /* synthetic */ class C9182a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83029a;

        static {
            int[] iArr = new int[d0.values().length];
            f83029a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83029a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83029a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83029a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83029a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83029a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f83029a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83029a[d0.f83046pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83029a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: r6.g$a0 */
    /* loaded from: classes8.dex */
    static abstract class a0 extends Y {

        /* renamed from: n, reason: collision with root package name */
        ArrayList f83030n;

        /* renamed from: o, reason: collision with root package name */
        ArrayList f83031o;

        /* renamed from: p, reason: collision with root package name */
        ArrayList f83032p;

        /* renamed from: q, reason: collision with root package name */
        ArrayList f83033q;
    }

    /* renamed from: r6.g$b0 */
    /* loaded from: classes8.dex */
    interface b0 {
    }

    /* renamed from: r6.g$c, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9184c {

        /* renamed from: a, reason: collision with root package name */
        C9196p f83038a;

        /* renamed from: b, reason: collision with root package name */
        C9196p f83039b;

        /* renamed from: c, reason: collision with root package name */
        C9196p f83040c;

        /* renamed from: d, reason: collision with root package name */
        C9196p f83041d;
    }

    /* renamed from: r6.g$c0 */
    /* loaded from: classes8.dex */
    static class c0 extends N implements X {

        /* renamed from: c, reason: collision with root package name */
        String f83042c;

        @Override // r6.C9181g.X
        public final b0 b() {
            return null;
        }

        public final String toString() {
            return o0.c(new StringBuilder("TextChild: '"), this.f83042c, "'");
        }
    }

    /* renamed from: r6.g$d, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9185d extends AbstractC9192l {

        /* renamed from: o, reason: collision with root package name */
        C9196p f83043o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83044p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83045q;

        C9185d() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "circle";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.g$d0 */
    /* loaded from: classes8.dex */
    static final class d0 {
        private static final /* synthetic */ d0[] $VALUES;
        public static final d0 cm;
        public static final d0 em;
        public static final d0 ex;
        public static final d0 in;
        public static final d0 mm;

        /* renamed from: pc, reason: collision with root package name */
        public static final d0 f83046pc;
        public static final d0 percent;
        public static final d0 pt;
        public static final d0 px;

        static {
            d0 d0Var = new d0("px", 0);
            px = d0Var;
            d0 d0Var2 = new d0("em", 1);
            em = d0Var2;
            d0 d0Var3 = new d0("ex", 2);
            ex = d0Var3;
            d0 d0Var4 = new d0("in", 3);
            in = d0Var4;
            d0 d0Var5 = new d0("cm", 4);
            cm = d0Var5;
            d0 d0Var6 = new d0("mm", 5);
            mm = d0Var6;
            d0 d0Var7 = new d0("pt", 6);
            pt = d0Var7;
            d0 d0Var8 = new d0("pc", 7);
            f83046pc = d0Var8;
            d0 d0Var9 = new d0("percent", 8);
            percent = d0Var9;
            $VALUES = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9};
        }

        private d0() {
            throw null;
        }

        public static d0 valueOf(String str) {
            return (d0) Enum.valueOf(d0.class, str);
        }

        public static d0[] values() {
            return (d0[]) $VALUES.clone();
        }
    }

    /* renamed from: r6.g$e, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9186e extends C9193m implements InterfaceC9200t {

        /* renamed from: o, reason: collision with root package name */
        Boolean f83047o;

        C9186e() {
        }

        @Override // r6.C9181g.C9193m, r6.C9181g.N
        final String n() {
            return "clipPath";
        }
    }

    /* renamed from: r6.g$e0 */
    /* loaded from: classes8.dex */
    static class e0 extends C9193m {

        /* renamed from: o, reason: collision with root package name */
        String f83048o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83049p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83050q;

        /* renamed from: r, reason: collision with root package name */
        C9196p f83051r;

        /* renamed from: s, reason: collision with root package name */
        C9196p f83052s;

        e0() {
        }

        @Override // r6.C9181g.C9193m, r6.C9181g.N
        final String n() {
            return "use";
        }
    }

    /* renamed from: r6.g$f, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9187f extends O {

        /* renamed from: b, reason: collision with root package name */
        static final C9187f f83053b = new C9187f(-16777216);

        /* renamed from: c, reason: collision with root package name */
        static final C9187f f83054c = new C9187f(0);

        /* renamed from: a, reason: collision with root package name */
        int f83055a;

        C9187f(int i11) {
            this.f83055a = i11;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.f83055a));
        }
    }

    /* renamed from: r6.g$f0 */
    /* loaded from: classes8.dex */
    static class f0 extends R implements InterfaceC9200t {
        @Override // r6.C9181g.N
        final String n() {
            return "view";
        }
    }

    /* renamed from: r6.g$g, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static class C1412g extends O {

        /* renamed from: a, reason: collision with root package name */
        private static C1412g f83056a = new C1412g();

        static C1412g a() {
            return f83056a;
        }
    }

    /* renamed from: r6.g$h, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9188h extends C9193m implements InterfaceC9200t {
        @Override // r6.C9181g.C9193m, r6.C9181g.N
        final String n() {
            return "defs";
        }
    }

    /* renamed from: r6.g$i, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9189i extends AbstractC9192l {

        /* renamed from: o, reason: collision with root package name */
        C9196p f83057o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83058p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83059q;

        /* renamed from: r, reason: collision with root package name */
        C9196p f83060r;

        C9189i() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "ellipse";
        }
    }

    /* renamed from: r6.g$j, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static abstract class AbstractC9190j extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        ArrayList f83061h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        Boolean f83062i;

        /* renamed from: j, reason: collision with root package name */
        Matrix f83063j;

        /* renamed from: k, reason: collision with root package name */
        EnumC9191k f83064k;

        /* renamed from: l, reason: collision with root package name */
        String f83065l;

        AbstractC9190j() {
        }

        @Override // r6.C9181g.J
        public final List<N> d() {
            return this.f83061h;
        }

        @Override // r6.C9181g.J
        public final void i(N n11) throws C9208i {
            if (n11 instanceof D) {
                this.f83061h.add(n11);
                return;
            }
            throw new C9208i("Gradient elements cannot contain " + n11 + " elements.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.g$k, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static final class EnumC9191k {
        private static final /* synthetic */ EnumC9191k[] $VALUES;
        public static final EnumC9191k pad;
        public static final EnumC9191k reflect;
        public static final EnumC9191k repeat;

        static {
            EnumC9191k enumC9191k = new EnumC9191k("pad", 0);
            pad = enumC9191k;
            EnumC9191k enumC9191k2 = new EnumC9191k("reflect", 1);
            reflect = enumC9191k2;
            EnumC9191k enumC9191k3 = new EnumC9191k("repeat", 2);
            repeat = enumC9191k3;
            $VALUES = new EnumC9191k[]{enumC9191k, enumC9191k2, enumC9191k3};
        }

        private EnumC9191k() {
            throw null;
        }

        public static EnumC9191k valueOf(String str) {
            return (EnumC9191k) Enum.valueOf(EnumC9191k.class, str);
        }

        public static EnumC9191k[] values() {
            return (EnumC9191k[]) $VALUES.clone();
        }
    }

    /* renamed from: r6.g$l, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static abstract class AbstractC9192l extends I implements InterfaceC9194n {

        /* renamed from: n, reason: collision with root package name */
        Matrix f83066n;

        AbstractC9192l() {
            this.f82998i = null;
            this.f82999j = null;
            this.f83000k = null;
            this.f83001l = null;
            this.f83002m = null;
        }

        @Override // r6.C9181g.InterfaceC9194n
        public final void l(Matrix matrix) {
            this.f83066n = matrix;
        }
    }

    /* renamed from: r6.g$m, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9193m extends H implements InterfaceC9194n {

        /* renamed from: n, reason: collision with root package name */
        Matrix f83067n;

        C9193m() {
        }

        @Override // r6.C9181g.InterfaceC9194n
        public final void l(Matrix matrix) {
            this.f83067n = matrix;
        }

        @Override // r6.C9181g.N
        String n() {
            return "group";
        }
    }

    /* renamed from: r6.g$n, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    interface InterfaceC9194n {
        void l(Matrix matrix);
    }

    /* renamed from: r6.g$o, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9195o extends P implements InterfaceC9194n {

        /* renamed from: o, reason: collision with root package name */
        String f83068o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83069p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83070q;

        /* renamed from: r, reason: collision with root package name */
        C9196p f83071r;

        /* renamed from: s, reason: collision with root package name */
        C9196p f83072s;

        /* renamed from: t, reason: collision with root package name */
        Matrix f83073t;

        C9195o() {
        }

        @Override // r6.C9181g.InterfaceC9194n
        public final void l(Matrix matrix) {
            this.f83073t = matrix;
        }

        @Override // r6.C9181g.N
        final String n() {
            return "image";
        }
    }

    /* renamed from: r6.g$q, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9197q extends AbstractC9192l {

        /* renamed from: o, reason: collision with root package name */
        C9196p f83076o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83077p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83078q;

        /* renamed from: r, reason: collision with root package name */
        C9196p f83079r;

        C9197q() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "line";
        }
    }

    /* renamed from: r6.g$r, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9198r extends R implements InterfaceC9200t {

        /* renamed from: p, reason: collision with root package name */
        boolean f83080p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83081q;

        /* renamed from: r, reason: collision with root package name */
        C9196p f83082r;

        /* renamed from: s, reason: collision with root package name */
        C9196p f83083s;

        /* renamed from: t, reason: collision with root package name */
        C9196p f83084t;

        /* renamed from: u, reason: collision with root package name */
        Float f83085u;

        C9198r() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "marker";
        }
    }

    /* renamed from: r6.g$s, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9199s extends H implements InterfaceC9200t {

        /* renamed from: n, reason: collision with root package name */
        Boolean f83086n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f83087o;

        /* renamed from: p, reason: collision with root package name */
        C9196p f83088p;

        /* renamed from: q, reason: collision with root package name */
        C9196p f83089q;

        C9199s() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return FormPageDTO.Field.FIELD_TYPE_MASK;
        }
    }

    /* renamed from: r6.g$t, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    interface InterfaceC9200t {
    }

    /* renamed from: r6.g$u, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9201u extends O {

        /* renamed from: a, reason: collision with root package name */
        String f83090a;

        /* renamed from: b, reason: collision with root package name */
        O f83091b;

        C9201u(String str, O o11) {
            this.f83090a = str;
            this.f83091b = o11;
        }

        public final String toString() {
            return this.f83090a + " " + this.f83091b;
        }
    }

    /* renamed from: r6.g$v, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9202v extends AbstractC9192l {

        /* renamed from: o, reason: collision with root package name */
        C9203w f83092o;

        C9202v() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "path";
        }
    }

    /* renamed from: r6.g$w, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9203w implements InterfaceC9204x {

        /* renamed from: b, reason: collision with root package name */
        private int f83094b = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f83096d = 0;

        /* renamed from: a, reason: collision with root package name */
        private byte[] f83093a = new byte[8];

        /* renamed from: c, reason: collision with root package name */
        private float[] f83095c = new float[16];

        C9203w() {
        }

        private void f(byte b11) {
            int i11 = this.f83094b;
            byte[] bArr = this.f83093a;
            if (i11 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f83093a = bArr2;
            }
            byte[] bArr3 = this.f83093a;
            int i12 = this.f83094b;
            this.f83094b = i12 + 1;
            bArr3[i12] = b11;
        }

        private void g(int i11) {
            float[] fArr = this.f83095c;
            if (fArr.length < this.f83096d + i11) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f83095c = fArr2;
            }
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void a(float f7, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f83095c;
            int i11 = this.f83096d;
            int i12 = i11 + 1;
            this.f83096d = i12;
            fArr[i11] = f7;
            this.f83096d = i11 + 2;
            fArr[i12] = f11;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void b(float f7, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f83095c;
            int i11 = this.f83096d;
            int i12 = i11 + 1;
            this.f83096d = i12;
            fArr[i11] = f7;
            this.f83096d = i11 + 2;
            fArr[i12] = f11;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void c(float f7, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f83095c;
            int i11 = this.f83096d;
            int i12 = i11 + 1;
            this.f83096d = i12;
            fArr[i11] = f7;
            int i13 = i11 + 2;
            this.f83096d = i13;
            fArr[i12] = f11;
            int i14 = i11 + 3;
            this.f83096d = i14;
            fArr[i13] = f12;
            int i15 = i11 + 4;
            this.f83096d = i15;
            fArr[i14] = f13;
            int i16 = i11 + 5;
            this.f83096d = i16;
            fArr[i15] = f14;
            this.f83096d = i11 + 6;
            fArr[i16] = f15;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void close() {
            f((byte) 8);
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void d(float f7, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f83095c;
            int i11 = this.f83096d;
            int i12 = i11 + 1;
            this.f83096d = i12;
            fArr[i11] = f7;
            int i13 = i11 + 2;
            this.f83096d = i13;
            fArr[i12] = f11;
            int i14 = i11 + 3;
            this.f83096d = i14;
            fArr[i13] = f12;
            this.f83096d = i11 + 4;
            fArr[i14] = f13;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void e(float f7, float f11, float f12, boolean z11, boolean z12, float f13, float f14) {
            f((byte) ((z11 ? 2 : 0) | 4 | (z12 ? 1 : 0)));
            g(5);
            float[] fArr = this.f83095c;
            int i11 = this.f83096d;
            int i12 = i11 + 1;
            this.f83096d = i12;
            fArr[i11] = f7;
            int i13 = i11 + 2;
            this.f83096d = i13;
            fArr[i12] = f11;
            int i14 = i11 + 3;
            this.f83096d = i14;
            fArr[i13] = f12;
            int i15 = i11 + 4;
            this.f83096d = i15;
            fArr[i14] = f13;
            this.f83096d = i11 + 5;
            fArr[i15] = f14;
        }

        final void h(InterfaceC9204x interfaceC9204x) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f83094b; i12++) {
                byte b11 = this.f83093a[i12];
                if (b11 == 0) {
                    float[] fArr = this.f83095c;
                    int i13 = i11 + 1;
                    float f7 = fArr[i11];
                    i11 += 2;
                    interfaceC9204x.a(f7, fArr[i13]);
                } else if (b11 == 1) {
                    float[] fArr2 = this.f83095c;
                    int i14 = i11 + 1;
                    float f11 = fArr2[i11];
                    i11 += 2;
                    interfaceC9204x.b(f11, fArr2[i14]);
                } else if (b11 == 2) {
                    float[] fArr3 = this.f83095c;
                    interfaceC9204x.c(fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3], fArr3[i11 + 4], fArr3[i11 + 5]);
                    i11 += 6;
                } else if (b11 == 3) {
                    float[] fArr4 = this.f83095c;
                    float f12 = fArr4[i11];
                    float f13 = fArr4[i11 + 1];
                    int i15 = i11 + 3;
                    float f14 = fArr4[i11 + 2];
                    i11 += 4;
                    interfaceC9204x.d(f12, f13, f14, fArr4[i15]);
                } else if (b11 != 8) {
                    boolean z11 = (b11 & 2) != 0;
                    boolean z12 = (b11 & 1) != 0;
                    float[] fArr5 = this.f83095c;
                    interfaceC9204x.e(fArr5[i11], fArr5[i11 + 1], fArr5[i11 + 2], z11, z12, fArr5[i11 + 3], fArr5[i11 + 4]);
                    i11 += 5;
                } else {
                    interfaceC9204x.close();
                }
            }
        }

        final boolean i() {
            return this.f83094b == 0;
        }
    }

    /* renamed from: r6.g$x, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    interface InterfaceC9204x {
        void a(float f7, float f11);

        void b(float f7, float f11);

        void c(float f7, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f7, float f11, float f12, float f13);

        void e(float f7, float f11, float f12, boolean z11, boolean z12, float f13, float f14);
    }

    /* renamed from: r6.g$y, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9205y extends R implements InterfaceC9200t {

        /* renamed from: p, reason: collision with root package name */
        Boolean f83097p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f83098q;

        /* renamed from: r, reason: collision with root package name */
        Matrix f83099r;

        /* renamed from: s, reason: collision with root package name */
        C9196p f83100s;

        /* renamed from: t, reason: collision with root package name */
        C9196p f83101t;

        /* renamed from: u, reason: collision with root package name */
        C9196p f83102u;

        /* renamed from: v, reason: collision with root package name */
        C9196p f83103v;

        /* renamed from: w, reason: collision with root package name */
        String f83104w;

        C9205y() {
        }

        @Override // r6.C9181g.N
        final String n() {
            return "pattern";
        }
    }

    /* renamed from: r6.g$z, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9206z extends AbstractC9192l {

        /* renamed from: o, reason: collision with root package name */
        float[] f83105o;

        C9206z() {
        }

        @Override // r6.C9181g.N
        String n() {
            return "polyline";
        }
    }

    C9181g() {
    }

    private C9183b d() {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float f7;
        d0 d0Var5;
        F f11 = this.f82940a;
        C9196p c9196p = f11.f82991r;
        C9196p c9196p2 = f11.f82992s;
        if (c9196p == null || c9196p.g() || (d0Var2 = c9196p.f83075b) == (d0Var = d0.percent) || d0Var2 == (d0Var3 = d0.em) || d0Var2 == (d0Var4 = d0.ex)) {
            return new C9183b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float c11 = c9196p.c();
        if (c9196p2 == null) {
            C9183b c9183b = this.f82940a.f83021o;
            f7 = c9183b != null ? (c9183b.f83037d * c11) / c9183b.f83036c : c11;
        } else {
            if (c9196p2.g() || (d0Var5 = c9196p2.f83075b) == d0Var || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C9183b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f7 = c9196p2.c();
        }
        return new C9183b(0.0f, 0.0f, c11, f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static L h(J j11, String str) {
        L h11;
        L l11 = (L) j11;
        if (str.equals(l11.f83004c)) {
            return l11;
        }
        for (Object obj : j11.d()) {
            if (obj instanceof L) {
                L l12 = (L) obj;
                if (str.equals(l12.f83004c)) {
                    return l12;
                }
                if ((obj instanceof J) && (h11 = h((J) obj, str)) != null) {
                    return h11;
                }
            }
        }
        return null;
    }

    public static C9181g i(InputStream inputStream) throws C9208i {
        return new C9209j().k(inputStream);
    }

    final void a(C9176b.q qVar) {
        this.f82941b.b(qVar);
    }

    final void b() {
        this.f82941b.e(C9176b.t.RenderOptions);
    }

    final List<C9176b.p> c() {
        return this.f82941b.c();
    }

    public final float e() {
        if (this.f82940a != null) {
            return d().f83037d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final RectF f() {
        F f7 = this.f82940a;
        if (f7 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C9183b c9183b = f7.f83021o;
        if (c9183b == null) {
            return null;
        }
        return c9183b.c();
    }

    public final float g() {
        if (this.f82940a != null) {
            return d().f83036c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    final F j() {
        return this.f82940a;
    }

    final boolean k() {
        return !this.f82941b.d();
    }

    public final void l(Canvas canvas) {
        C9180f c9180f = new C9180f();
        if (!c9180f.a()) {
            c9180f.b(canvas.getWidth(), canvas.getHeight());
        }
        new C9207h(canvas).Q(this, c9180f);
    }

    final L m(String str) {
        String substring;
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String replace = str.replace("\\\n", "").replace("\\A", "\n");
            if (replace.length() > 1 && replace.startsWith("#") && (substring = replace.substring(1)) != null && substring.length() != 0) {
                if (substring.equals(this.f82940a.f83004c)) {
                    return this.f82940a;
                }
                HashMap hashMap = this.f82942c;
                if (hashMap.containsKey(substring)) {
                    return (L) hashMap.get(substring);
                }
                L h11 = h(this.f82940a, substring);
                hashMap.put(substring, h11);
                return h11;
            }
        }
        return null;
    }

    public final void n() throws C9208i {
        F f7 = this.f82940a;
        if (f7 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f7.f82992s = C9209j.y("100%");
    }

    public final void o(float f7, float f11) {
        F f12 = this.f82940a;
        if (f12 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f12.f83021o = new C9183b(0.0f, 0.0f, f7, f11);
    }

    public final void p() throws C9208i {
        F f7 = this.f82940a;
        if (f7 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f7.f82991r = C9209j.y("100%");
    }

    final void q(F f7) {
        this.f82940a = f7;
    }

    /* renamed from: r6.g$p, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9196p implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        float f83074a;

        /* renamed from: b, reason: collision with root package name */
        d0 f83075b;

        C9196p(float f7, d0 d0Var) {
            this.f83074a = f7;
            this.f83075b = d0Var;
        }

        final float a(C9207h c9207h) {
            float sqrt;
            if (this.f83075b != d0.percent) {
                return d(c9207h);
            }
            C9183b D11 = c9207h.D();
            float f7 = this.f83074a;
            if (D11 == null) {
                return f7;
            }
            float f11 = D11.f83036c;
            if (f11 == D11.f83037d) {
                sqrt = f7 * f11;
            } else {
                sqrt = f7 * ((float) (Math.sqrt((r7 * r7) + (f11 * f11)) / 1.414213562373095d));
            }
            return sqrt / 100.0f;
        }

        final float b(C9207h c9207h, float f7) {
            return this.f83075b == d0.percent ? (this.f83074a * f7) / 100.0f : d(c9207h);
        }

        final float c() {
            float f7;
            float f11;
            int i11 = C9182a.f83029a[this.f83075b.ordinal()];
            float f12 = this.f83074a;
            if (i11 == 1) {
                return f12;
            }
            switch (i11) {
                case 4:
                    return f12 * 96.0f;
                case 5:
                    f7 = f12 * 96.0f;
                    f11 = 2.54f;
                    break;
                case 6:
                    f7 = f12 * 96.0f;
                    f11 = 25.4f;
                    break;
                case 7:
                    f7 = f12 * 96.0f;
                    f11 = 72.0f;
                    break;
                case 8:
                    f7 = f12 * 96.0f;
                    f11 = 6.0f;
                    break;
                default:
                    return f12;
            }
            return f7 / f11;
        }

        final float d(C9207h c9207h) {
            int i11 = C9182a.f83029a[this.f83075b.ordinal()];
            float f7 = this.f83074a;
            switch (i11) {
                case 2:
                    return f7 * c9207h.B();
                case 3:
                    return f7 * c9207h.C();
                case 4:
                    c9207h.getClass();
                    return f7 * 96.0f;
                case 5:
                    c9207h.getClass();
                    return (f7 * 96.0f) / 2.54f;
                case 6:
                    c9207h.getClass();
                    return (f7 * 96.0f) / 25.4f;
                case 7:
                    c9207h.getClass();
                    return (f7 * 96.0f) / 72.0f;
                case 8:
                    c9207h.getClass();
                    return (f7 * 96.0f) / 6.0f;
                case 9:
                    C9183b D11 = c9207h.D();
                    if (D11 != null) {
                        return (f7 * D11.f83036c) / 100.0f;
                    }
                default:
                    return f7;
            }
        }

        final float e(C9207h c9207h) {
            if (this.f83075b != d0.percent) {
                return d(c9207h);
            }
            C9183b D11 = c9207h.D();
            float f7 = this.f83074a;
            return D11 == null ? f7 : (f7 * D11.f83037d) / 100.0f;
        }

        final boolean f() {
            return this.f83074a < 0.0f;
        }

        final boolean g() {
            return this.f83074a == 0.0f;
        }

        public final String toString() {
            return String.valueOf(this.f83074a) + this.f83075b;
        }

        C9196p(float f7) {
            this.f83074a = f7;
            this.f83075b = d0.px;
        }
    }

    /* renamed from: r6.g$b, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    static class C9183b {

        /* renamed from: a, reason: collision with root package name */
        float f83034a;

        /* renamed from: b, reason: collision with root package name */
        float f83035b;

        /* renamed from: c, reason: collision with root package name */
        float f83036c;

        /* renamed from: d, reason: collision with root package name */
        float f83037d;

        C9183b(float f7, float f11, float f12, float f13) {
            this.f83034a = f7;
            this.f83035b = f11;
            this.f83036c = f12;
            this.f83037d = f13;
        }

        final float a() {
            return this.f83034a + this.f83036c;
        }

        final float b() {
            return this.f83035b + this.f83037d;
        }

        final RectF c() {
            return new RectF(this.f83034a, this.f83035b, a(), b());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f83034a);
            sb2.append(" ");
            sb2.append(this.f83035b);
            sb2.append(" ");
            sb2.append(this.f83036c);
            sb2.append(" ");
            return B4.V.b(this.f83037d, "]", sb2);
        }

        C9183b(C9183b c9183b) {
            this.f83034a = c9183b.f83034a;
            this.f83035b = c9183b.f83035b;
            this.f83036c = c9183b.f83036c;
            this.f83037d = c9183b.f83037d;
        }
    }
}
