package r1;

import F3.G;
import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f82737a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f82738b;

    public static final class a extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82739c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82740d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82741e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f82742f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f82743g;

        /* renamed from: h, reason: collision with root package name */
        private final float f82744h;

        /* renamed from: i, reason: collision with root package name */
        private final float f82745i;

        public a(float f7, float f11, float f12, boolean z11, boolean z12, float f13, float f14) {
            super(3);
            this.f82739c = f7;
            this.f82740d = f11;
            this.f82741e = f12;
            this.f82742f = z11;
            this.f82743g = z12;
            this.f82744h = f13;
            this.f82745i = f14;
        }

        public final float c() {
            return this.f82744h;
        }

        public final float d() {
            return this.f82745i;
        }

        public final float e() {
            return this.f82739c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f82739c, aVar.f82739c) == 0 && Float.compare(this.f82740d, aVar.f82740d) == 0 && Float.compare(this.f82741e, aVar.f82741e) == 0 && this.f82742f == aVar.f82742f && this.f82743g == aVar.f82743g && Float.compare(this.f82744h, aVar.f82744h) == 0 && Float.compare(this.f82745i, aVar.f82745i) == 0;
        }

        public final float f() {
            return this.f82741e;
        }

        public final float g() {
            return this.f82740d;
        }

        public final boolean h() {
            return this.f82742f;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82745i) + Pk0.b.a(this.f82744h, C3532b.a(C3532b.a(Pk0.b.a(this.f82741e, Pk0.b.a(this.f82740d, Float.hashCode(this.f82739c) * 31, 31), 31), 31, this.f82742f), 31, this.f82743g), 31);
        }

        public final boolean i() {
            return this.f82743g;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb2.append(this.f82739c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f82740d);
            sb2.append(", theta=");
            sb2.append(this.f82741e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f82742f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f82743g);
            sb2.append(", arcStartX=");
            sb2.append(this.f82744h);
            sb2.append(", arcStartY=");
            return G.a(sb2, this.f82745i, ')');
        }
    }

    public static final class b extends g {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f82746c = new b(3);
    }

    public static final class c extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82747c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82748d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82749e;

        /* renamed from: f, reason: collision with root package name */
        private final float f82750f;

        /* renamed from: g, reason: collision with root package name */
        private final float f82751g;

        /* renamed from: h, reason: collision with root package name */
        private final float f82752h;

        public c(float f7, float f11, float f12, float f13, float f14, float f15) {
            super(2);
            this.f82747c = f7;
            this.f82748d = f11;
            this.f82749e = f12;
            this.f82750f = f13;
            this.f82751g = f14;
            this.f82752h = f15;
        }

        public final float c() {
            return this.f82747c;
        }

        public final float d() {
            return this.f82749e;
        }

        public final float e() {
            return this.f82751g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f82747c, cVar.f82747c) == 0 && Float.compare(this.f82748d, cVar.f82748d) == 0 && Float.compare(this.f82749e, cVar.f82749e) == 0 && Float.compare(this.f82750f, cVar.f82750f) == 0 && Float.compare(this.f82751g, cVar.f82751g) == 0 && Float.compare(this.f82752h, cVar.f82752h) == 0;
        }

        public final float f() {
            return this.f82748d;
        }

        public final float g() {
            return this.f82750f;
        }

        public final float h() {
            return this.f82752h;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82752h) + Pk0.b.a(this.f82751g, Pk0.b.a(this.f82750f, Pk0.b.a(this.f82749e, Pk0.b.a(this.f82748d, Float.hashCode(this.f82747c) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
            sb2.append(this.f82747c);
            sb2.append(", y1=");
            sb2.append(this.f82748d);
            sb2.append(", x2=");
            sb2.append(this.f82749e);
            sb2.append(", y2=");
            sb2.append(this.f82750f);
            sb2.append(", x3=");
            sb2.append(this.f82751g);
            sb2.append(", y3=");
            return G.a(sb2, this.f82752h, ')');
        }
    }

    public static final class d extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82753c;

        public d(float f7) {
            super(3);
            this.f82753c = f7;
        }

        public final float c() {
            return this.f82753c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f82753c, ((d) obj).f82753c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82753c);
        }

        @NotNull
        public final String toString() {
            return G.a(new StringBuilder("HorizontalTo(x="), this.f82753c, ')');
        }
    }

    public static final class e extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82754c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82755d;

        public e(float f7, float f11) {
            super(3);
            this.f82754c = f7;
            this.f82755d = f11;
        }

        public final float c() {
            return this.f82754c;
        }

        public final float d() {
            return this.f82755d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f82754c, eVar.f82754c) == 0 && Float.compare(this.f82755d, eVar.f82755d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82755d) + (Float.hashCode(this.f82754c) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LineTo(x=");
            sb2.append(this.f82754c);
            sb2.append(", y=");
            return G.a(sb2, this.f82755d, ')');
        }
    }

    public static final class f extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82756c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82757d;

        public f(float f7, float f11) {
            super(3);
            this.f82756c = f7;
            this.f82757d = f11;
        }

        public final float c() {
            return this.f82756c;
        }

        public final float d() {
            return this.f82757d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f82756c, fVar.f82756c) == 0 && Float.compare(this.f82757d, fVar.f82757d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82757d) + (Float.hashCode(this.f82756c) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoveTo(x=");
            sb2.append(this.f82756c);
            sb2.append(", y=");
            return G.a(sb2, this.f82757d, ')');
        }
    }

    /* renamed from: r1.g$g, reason: collision with other inner class name */
    public static final class C1408g extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82758c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82759d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82760e;

        /* renamed from: f, reason: collision with root package name */
        private final float f82761f;

        public C1408g(float f7, float f11, float f12, float f13) {
            super(1);
            this.f82758c = f7;
            this.f82759d = f11;
            this.f82760e = f12;
            this.f82761f = f13;
        }

        public final float c() {
            return this.f82758c;
        }

        public final float d() {
            return this.f82760e;
        }

        public final float e() {
            return this.f82759d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1408g)) {
                return false;
            }
            C1408g c1408g = (C1408g) obj;
            return Float.compare(this.f82758c, c1408g.f82758c) == 0 && Float.compare(this.f82759d, c1408g.f82759d) == 0 && Float.compare(this.f82760e, c1408g.f82760e) == 0 && Float.compare(this.f82761f, c1408g.f82761f) == 0;
        }

        public final float f() {
            return this.f82761f;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82761f) + Pk0.b.a(this.f82760e, Pk0.b.a(this.f82759d, Float.hashCode(this.f82758c) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
            sb2.append(this.f82758c);
            sb2.append(", y1=");
            sb2.append(this.f82759d);
            sb2.append(", x2=");
            sb2.append(this.f82760e);
            sb2.append(", y2=");
            return G.a(sb2, this.f82761f, ')');
        }
    }

    public static final class h extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82762c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82763d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82764e;

        /* renamed from: f, reason: collision with root package name */
        private final float f82765f;

        public h(float f7, float f11, float f12, float f13) {
            super(2);
            this.f82762c = f7;
            this.f82763d = f11;
            this.f82764e = f12;
            this.f82765f = f13;
        }

        public final float c() {
            return this.f82762c;
        }

        public final float d() {
            return this.f82764e;
        }

        public final float e() {
            return this.f82763d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f82762c, hVar.f82762c) == 0 && Float.compare(this.f82763d, hVar.f82763d) == 0 && Float.compare(this.f82764e, hVar.f82764e) == 0 && Float.compare(this.f82765f, hVar.f82765f) == 0;
        }

        public final float f() {
            return this.f82765f;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82765f) + Pk0.b.a(this.f82764e, Pk0.b.a(this.f82763d, Float.hashCode(this.f82762c) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb2.append(this.f82762c);
            sb2.append(", y1=");
            sb2.append(this.f82763d);
            sb2.append(", x2=");
            sb2.append(this.f82764e);
            sb2.append(", y2=");
            return G.a(sb2, this.f82765f, ')');
        }
    }

    public static final class i extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82766c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82767d;

        public i(float f7, float f11) {
            super(1);
            this.f82766c = f7;
            this.f82767d = f11;
        }

        public final float c() {
            return this.f82766c;
        }

        public final float d() {
            return this.f82767d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f82766c, iVar.f82766c) == 0 && Float.compare(this.f82767d, iVar.f82767d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82767d) + (Float.hashCode(this.f82766c) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
            sb2.append(this.f82766c);
            sb2.append(", y=");
            return G.a(sb2, this.f82767d, ')');
        }
    }

    public static final class j extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82768c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82769d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82770e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f82771f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f82772g;

        /* renamed from: h, reason: collision with root package name */
        private final float f82773h;

        /* renamed from: i, reason: collision with root package name */
        private final float f82774i;

        public j(float f7, float f11, float f12, boolean z11, boolean z12, float f13, float f14) {
            super(3);
            this.f82768c = f7;
            this.f82769d = f11;
            this.f82770e = f12;
            this.f82771f = z11;
            this.f82772g = z12;
            this.f82773h = f13;
            this.f82774i = f14;
        }

        public final float c() {
            return this.f82773h;
        }

        public final float d() {
            return this.f82774i;
        }

        public final float e() {
            return this.f82768c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f82768c, jVar.f82768c) == 0 && Float.compare(this.f82769d, jVar.f82769d) == 0 && Float.compare(this.f82770e, jVar.f82770e) == 0 && this.f82771f == jVar.f82771f && this.f82772g == jVar.f82772g && Float.compare(this.f82773h, jVar.f82773h) == 0 && Float.compare(this.f82774i, jVar.f82774i) == 0;
        }

        public final float f() {
            return this.f82770e;
        }

        public final float g() {
            return this.f82769d;
        }

        public final boolean h() {
            return this.f82771f;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82774i) + Pk0.b.a(this.f82773h, C3532b.a(C3532b.a(Pk0.b.a(this.f82770e, Pk0.b.a(this.f82769d, Float.hashCode(this.f82768c) * 31, 31), 31), 31, this.f82771f), 31, this.f82772g), 31);
        }

        public final boolean i() {
            return this.f82772g;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb2.append(this.f82768c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f82769d);
            sb2.append(", theta=");
            sb2.append(this.f82770e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f82771f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f82772g);
            sb2.append(", arcStartDx=");
            sb2.append(this.f82773h);
            sb2.append(", arcStartDy=");
            return G.a(sb2, this.f82774i, ')');
        }
    }

    public static final class k extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82775c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82776d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82777e;

        /* renamed from: f, reason: collision with root package name */
        private final float f82778f;

        /* renamed from: g, reason: collision with root package name */
        private final float f82779g;

        /* renamed from: h, reason: collision with root package name */
        private final float f82780h;

        public k(float f7, float f11, float f12, float f13, float f14, float f15) {
            super(2);
            this.f82775c = f7;
            this.f82776d = f11;
            this.f82777e = f12;
            this.f82778f = f13;
            this.f82779g = f14;
            this.f82780h = f15;
        }

        public final float c() {
            return this.f82775c;
        }

        public final float d() {
            return this.f82777e;
        }

        public final float e() {
            return this.f82779g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f82775c, kVar.f82775c) == 0 && Float.compare(this.f82776d, kVar.f82776d) == 0 && Float.compare(this.f82777e, kVar.f82777e) == 0 && Float.compare(this.f82778f, kVar.f82778f) == 0 && Float.compare(this.f82779g, kVar.f82779g) == 0 && Float.compare(this.f82780h, kVar.f82780h) == 0;
        }

        public final float f() {
            return this.f82776d;
        }

        public final float g() {
            return this.f82778f;
        }

        public final float h() {
            return this.f82780h;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82780h) + Pk0.b.a(this.f82779g, Pk0.b.a(this.f82778f, Pk0.b.a(this.f82777e, Pk0.b.a(this.f82776d, Float.hashCode(this.f82775c) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
            sb2.append(this.f82775c);
            sb2.append(", dy1=");
            sb2.append(this.f82776d);
            sb2.append(", dx2=");
            sb2.append(this.f82777e);
            sb2.append(", dy2=");
            sb2.append(this.f82778f);
            sb2.append(", dx3=");
            sb2.append(this.f82779g);
            sb2.append(", dy3=");
            return G.a(sb2, this.f82780h, ')');
        }
    }

    public static final class l extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82781c;

        public l(float f7) {
            super(3);
            this.f82781c = f7;
        }

        public final float c() {
            return this.f82781c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f82781c, ((l) obj).f82781c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82781c);
        }

        @NotNull
        public final String toString() {
            return G.a(new StringBuilder("RelativeHorizontalTo(dx="), this.f82781c, ')');
        }
    }

    public static final class m extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82782c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82783d;

        public m(float f7, float f11) {
            super(3);
            this.f82782c = f7;
            this.f82783d = f11;
        }

        public final float c() {
            return this.f82782c;
        }

        public final float d() {
            return this.f82783d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f82782c, mVar.f82782c) == 0 && Float.compare(this.f82783d, mVar.f82783d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82783d) + (Float.hashCode(this.f82782c) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
            sb2.append(this.f82782c);
            sb2.append(", dy=");
            return G.a(sb2, this.f82783d, ')');
        }
    }

    public static final class n extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82784c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82785d;

        public n(float f7, float f11) {
            super(3);
            this.f82784c = f7;
            this.f82785d = f11;
        }

        public final float c() {
            return this.f82784c;
        }

        public final float d() {
            return this.f82785d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f82784c, nVar.f82784c) == 0 && Float.compare(this.f82785d, nVar.f82785d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82785d) + (Float.hashCode(this.f82784c) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
            sb2.append(this.f82784c);
            sb2.append(", dy=");
            return G.a(sb2, this.f82785d, ')');
        }
    }

    public static final class o extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82786c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82787d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82788e;

        /* renamed from: f, reason: collision with root package name */
        private final float f82789f;

        public o(float f7, float f11, float f12, float f13) {
            super(1);
            this.f82786c = f7;
            this.f82787d = f11;
            this.f82788e = f12;
            this.f82789f = f13;
        }

        public final float c() {
            return this.f82786c;
        }

        public final float d() {
            return this.f82788e;
        }

        public final float e() {
            return this.f82787d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f82786c, oVar.f82786c) == 0 && Float.compare(this.f82787d, oVar.f82787d) == 0 && Float.compare(this.f82788e, oVar.f82788e) == 0 && Float.compare(this.f82789f, oVar.f82789f) == 0;
        }

        public final float f() {
            return this.f82789f;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82789f) + Pk0.b.a(this.f82788e, Pk0.b.a(this.f82787d, Float.hashCode(this.f82786c) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
            sb2.append(this.f82786c);
            sb2.append(", dy1=");
            sb2.append(this.f82787d);
            sb2.append(", dx2=");
            sb2.append(this.f82788e);
            sb2.append(", dy2=");
            return G.a(sb2, this.f82789f, ')');
        }
    }

    public static final class p extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82790c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82791d;

        /* renamed from: e, reason: collision with root package name */
        private final float f82792e;

        /* renamed from: f, reason: collision with root package name */
        private final float f82793f;

        public p(float f7, float f11, float f12, float f13) {
            super(2);
            this.f82790c = f7;
            this.f82791d = f11;
            this.f82792e = f12;
            this.f82793f = f13;
        }

        public final float c() {
            return this.f82790c;
        }

        public final float d() {
            return this.f82792e;
        }

        public final float e() {
            return this.f82791d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f82790c, pVar.f82790c) == 0 && Float.compare(this.f82791d, pVar.f82791d) == 0 && Float.compare(this.f82792e, pVar.f82792e) == 0 && Float.compare(this.f82793f, pVar.f82793f) == 0;
        }

        public final float f() {
            return this.f82793f;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82793f) + Pk0.b.a(this.f82792e, Pk0.b.a(this.f82791d, Float.hashCode(this.f82790c) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb2.append(this.f82790c);
            sb2.append(", dy1=");
            sb2.append(this.f82791d);
            sb2.append(", dx2=");
            sb2.append(this.f82792e);
            sb2.append(", dy2=");
            return G.a(sb2, this.f82793f, ')');
        }
    }

    public static final class q extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82794c;

        /* renamed from: d, reason: collision with root package name */
        private final float f82795d;

        public q(float f7, float f11) {
            super(1);
            this.f82794c = f7;
            this.f82795d = f11;
        }

        public final float c() {
            return this.f82794c;
        }

        public final float d() {
            return this.f82795d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f82794c, qVar.f82794c) == 0 && Float.compare(this.f82795d, qVar.f82795d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82795d) + (Float.hashCode(this.f82794c) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb2.append(this.f82794c);
            sb2.append(", dy=");
            return G.a(sb2, this.f82795d, ')');
        }
    }

    public static final class r extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82796c;

        public r(float f7) {
            super(3);
            this.f82796c = f7;
        }

        public final float c() {
            return this.f82796c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f82796c, ((r) obj).f82796c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82796c);
        }

        @NotNull
        public final String toString() {
            return G.a(new StringBuilder("RelativeVerticalTo(dy="), this.f82796c, ')');
        }
    }

    public static final class s extends g {

        /* renamed from: c, reason: collision with root package name */
        private final float f82797c;

        public s(float f7) {
            super(3);
            this.f82797c = f7;
        }

        public final float c() {
            return this.f82797c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f82797c, ((s) obj).f82797c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f82797c);
        }

        @NotNull
        public final String toString() {
            return G.a(new StringBuilder("VerticalTo(y="), this.f82797c, ')');
        }
    }

    public g(int i11) {
        boolean z11 = (i11 & 1) == 0;
        boolean z12 = (i11 & 2) == 0;
        this.f82737a = z11;
        this.f82738b = z12;
    }

    public final boolean a() {
        return this.f82737a;
    }

    public final boolean b() {
        return this.f82738b;
    }
}
