package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: m, reason: collision with root package name */
    public static final d f35814m = new l(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public e f35815a;

    /* renamed from: b, reason: collision with root package name */
    public e f35816b;

    /* renamed from: c, reason: collision with root package name */
    public e f35817c;

    /* renamed from: d, reason: collision with root package name */
    public e f35818d;

    /* renamed from: e, reason: collision with root package name */
    public d f35819e;

    /* renamed from: f, reason: collision with root package name */
    public d f35820f;

    /* renamed from: g, reason: collision with root package name */
    public d f35821g;

    /* renamed from: h, reason: collision with root package name */
    public d f35822h;

    /* renamed from: i, reason: collision with root package name */
    public g f35823i;

    /* renamed from: j, reason: collision with root package name */
    public g f35824j;

    /* renamed from: k, reason: collision with root package name */
    public g f35825k;

    /* renamed from: l, reason: collision with root package name */
    public g f35826l;

    public interface c {
        d a(d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    public static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new com.google.android.material.shape.a(i12));
    }

    public static b d(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ia.m.ShapeAppearance);
        try {
            int i12 = obtainStyledAttributes.getInt(ia.m.f49056v5, 0);
            int i13 = obtainStyledAttributes.getInt(ia.m.f49086y5, i12);
            int i14 = obtainStyledAttributes.getInt(ia.m.f49096z5, i12);
            int i15 = obtainStyledAttributes.getInt(ia.m.f49076x5, i12);
            int i16 = obtainStyledAttributes.getInt(ia.m.f49066w5, i12);
            d m10 = m(obtainStyledAttributes, ia.m.f48594A5, dVar);
            d m11 = m(obtainStyledAttributes, ia.m.f48624D5, m10);
            d m12 = m(obtainStyledAttributes, ia.m.f48634E5, m10);
            d m13 = m(obtainStyledAttributes, ia.m.f48614C5, m10);
            return new b().C(i13, m11).H(i14, m12).x(i15, m13).t(i16, m(obtainStyledAttributes, ia.m.f48604B5, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new com.google.android.material.shape.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ia.m.MaterialShape, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(ia.m.f48975n4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(ia.m.f48985o4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static d m(TypedArray typedArray, int i10, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            int i11 = peekValue.type;
            if (i11 == 5) {
                return new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new l(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g h() {
        return this.f35825k;
    }

    public e i() {
        return this.f35818d;
    }

    public d j() {
        return this.f35822h;
    }

    public e k() {
        return this.f35817c;
    }

    public d l() {
        return this.f35821g;
    }

    public g n() {
        return this.f35826l;
    }

    public g o() {
        return this.f35824j;
    }

    public g p() {
        return this.f35823i;
    }

    public e q() {
        return this.f35815a;
    }

    public d r() {
        return this.f35819e;
    }

    public e s() {
        return this.f35816b;
    }

    public d t() {
        return this.f35820f;
    }

    public String toString() {
        return "[" + r() + ", " + t() + ", " + l() + ", " + j() + "]";
    }

    public boolean u() {
        return (this.f35816b instanceof m) && (this.f35815a instanceof m) && (this.f35817c instanceof m) && (this.f35818d instanceof m);
    }

    public boolean v(RectF rectF) {
        boolean z10 = this.f35826l.getClass().equals(g.class) && this.f35824j.getClass().equals(g.class) && this.f35823i.getClass().equals(g.class) && this.f35825k.getClass().equals(g.class);
        float a10 = this.f35819e.a(rectF);
        return z10 && ((this.f35820f.a(rectF) > a10 ? 1 : (this.f35820f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f35822h.a(rectF) > a10 ? 1 : (this.f35822h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f35821g.a(rectF) > a10 ? 1 : (this.f35821g.a(rectF) == a10 ? 0 : -1)) == 0) && u();
    }

    public b w() {
        return new b(this);
    }

    public n x(float f10) {
        return w().o(f10).m();
    }

    public n y(d dVar) {
        return w().p(dVar).m();
    }

    public n z(c cVar) {
        return w().F(cVar.a(r())).K(cVar.a(t())).w(cVar.a(j())).A(cVar.a(l())).m();
    }

    public n(b bVar) {
        this.f35815a = bVar.f35827a;
        this.f35816b = bVar.f35828b;
        this.f35817c = bVar.f35829c;
        this.f35818d = bVar.f35830d;
        this.f35819e = bVar.f35831e;
        this.f35820f = bVar.f35832f;
        this.f35821g = bVar.f35833g;
        this.f35822h = bVar.f35834h;
        this.f35823i = bVar.f35835i;
        this.f35824j = bVar.f35836j;
        this.f35825k = bVar.f35837k;
        this.f35826l = bVar.f35838l;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public e f35827a;

        /* renamed from: b, reason: collision with root package name */
        public e f35828b;

        /* renamed from: c, reason: collision with root package name */
        public e f35829c;

        /* renamed from: d, reason: collision with root package name */
        public e f35830d;

        /* renamed from: e, reason: collision with root package name */
        public d f35831e;

        /* renamed from: f, reason: collision with root package name */
        public d f35832f;

        /* renamed from: g, reason: collision with root package name */
        public d f35833g;

        /* renamed from: h, reason: collision with root package name */
        public d f35834h;

        /* renamed from: i, reason: collision with root package name */
        public g f35835i;

        /* renamed from: j, reason: collision with root package name */
        public g f35836j;

        /* renamed from: k, reason: collision with root package name */
        public g f35837k;

        /* renamed from: l, reason: collision with root package name */
        public g f35838l;

        public b() {
            this.f35827a = j.b();
            this.f35828b = j.b();
            this.f35829c = j.b();
            this.f35830d = j.b();
            this.f35831e = new com.google.android.material.shape.a(0.0f);
            this.f35832f = new com.google.android.material.shape.a(0.0f);
            this.f35833g = new com.google.android.material.shape.a(0.0f);
            this.f35834h = new com.google.android.material.shape.a(0.0f);
            this.f35835i = j.c();
            this.f35836j = j.c();
            this.f35837k = j.c();
            this.f35838l = j.c();
        }

        public static float n(e eVar) {
            if (eVar instanceof m) {
                return ((m) eVar).f35813a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f35753a;
            }
            return -1.0f;
        }

        public b A(d dVar) {
            this.f35833g = dVar;
            return this;
        }

        public b B(int i10, float f10) {
            return D(j.a(i10)).E(f10);
        }

        public b C(int i10, d dVar) {
            return D(j.a(i10)).F(dVar);
        }

        public b D(e eVar) {
            this.f35827a = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                E(n10);
            }
            return this;
        }

        public b E(float f10) {
            this.f35831e = new com.google.android.material.shape.a(f10);
            return this;
        }

        public b F(d dVar) {
            this.f35831e = dVar;
            return this;
        }

        public b G(int i10, float f10) {
            return I(j.a(i10)).J(f10);
        }

        public b H(int i10, d dVar) {
            return I(j.a(i10)).K(dVar);
        }

        public b I(e eVar) {
            this.f35828b = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                J(n10);
            }
            return this;
        }

        public b J(float f10) {
            this.f35832f = new com.google.android.material.shape.a(f10);
            return this;
        }

        public b K(d dVar) {
            this.f35832f = dVar;
            return this;
        }

        public n m() {
            return new n(this);
        }

        public b o(float f10) {
            return E(f10).J(f10).z(f10).v(f10);
        }

        public b p(d dVar) {
            return F(dVar).K(dVar).A(dVar).w(dVar);
        }

        public b q(int i10, float f10) {
            return r(j.a(i10)).o(f10);
        }

        public b r(e eVar) {
            return D(eVar).I(eVar).y(eVar).u(eVar);
        }

        public b s(g gVar) {
            this.f35837k = gVar;
            return this;
        }

        public b t(int i10, d dVar) {
            return u(j.a(i10)).w(dVar);
        }

        public b u(e eVar) {
            this.f35830d = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                v(n10);
            }
            return this;
        }

        public b v(float f10) {
            this.f35834h = new com.google.android.material.shape.a(f10);
            return this;
        }

        public b w(d dVar) {
            this.f35834h = dVar;
            return this;
        }

        public b x(int i10, d dVar) {
            return y(j.a(i10)).A(dVar);
        }

        public b y(e eVar) {
            this.f35829c = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                z(n10);
            }
            return this;
        }

        public b z(float f10) {
            this.f35833g = new com.google.android.material.shape.a(f10);
            return this;
        }

        public b(n nVar) {
            this.f35827a = j.b();
            this.f35828b = j.b();
            this.f35829c = j.b();
            this.f35830d = j.b();
            this.f35831e = new com.google.android.material.shape.a(0.0f);
            this.f35832f = new com.google.android.material.shape.a(0.0f);
            this.f35833g = new com.google.android.material.shape.a(0.0f);
            this.f35834h = new com.google.android.material.shape.a(0.0f);
            this.f35835i = j.c();
            this.f35836j = j.c();
            this.f35837k = j.c();
            this.f35838l = j.c();
            this.f35827a = nVar.f35815a;
            this.f35828b = nVar.f35816b;
            this.f35829c = nVar.f35817c;
            this.f35830d = nVar.f35818d;
            this.f35831e = nVar.f35819e;
            this.f35832f = nVar.f35820f;
            this.f35833g = nVar.f35821g;
            this.f35834h = nVar.f35822h;
            this.f35835i = nVar.f35823i;
            this.f35836j = nVar.f35824j;
            this.f35837k = nVar.f35825k;
            this.f35838l = nVar.f35826l;
        }
    }

    public n() {
        this.f35815a = j.b();
        this.f35816b = j.b();
        this.f35817c = j.b();
        this.f35818d = j.b();
        this.f35819e = new com.google.android.material.shape.a(0.0f);
        this.f35820f = new com.google.android.material.shape.a(0.0f);
        this.f35821g = new com.google.android.material.shape.a(0.0f);
        this.f35822h = new com.google.android.material.shape.a(0.0f);
        this.f35823i = j.c();
        this.f35824j = j.c();
        this.f35825k = j.c();
        this.f35826l = j.c();
    }
}
