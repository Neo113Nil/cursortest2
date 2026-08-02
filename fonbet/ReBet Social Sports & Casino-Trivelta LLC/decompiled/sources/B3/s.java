package B3;

import B3.a;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.S;
import com.airbnb.lottie.utils.y;
import java.util.Collections;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f670b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f671c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f672d;

    /* renamed from: k, reason: collision with root package name */
    public a f679k;

    /* renamed from: l, reason: collision with root package name */
    public a f680l;

    /* renamed from: m, reason: collision with root package name */
    public a f681m;

    /* renamed from: n, reason: collision with root package name */
    public a f682n;

    /* renamed from: o, reason: collision with root package name */
    public a f683o;

    /* renamed from: p, reason: collision with root package name */
    public d f684p;

    /* renamed from: q, reason: collision with root package name */
    public d f685q;

    /* renamed from: r, reason: collision with root package name */
    public d f686r;

    /* renamed from: s, reason: collision with root package name */
    public d f687s;
    private final float[] skewValues;

    /* renamed from: t, reason: collision with root package name */
    public d f688t;

    /* renamed from: u, reason: collision with root package name */
    public a f689u;

    /* renamed from: v, reason: collision with root package name */
    public a f690v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f691w;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f669a = new Matrix();

    /* renamed from: e, reason: collision with root package name */
    public float f673e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public float f674f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f675g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f676h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f677i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f678j = true;

    public s(F3.n nVar) {
        this.f679k = nVar.c() == null ? null : nVar.c().a();
        this.f680l = nVar.f() == null ? null : nVar.f().a();
        this.f681m = nVar.k() == null ? null : nVar.k().a();
        this.f682n = nVar.g() == null ? null : nVar.g().a();
        this.f684p = nVar.l() == null ? null : nVar.l().a();
        this.f691w = nVar.o();
        this.f686r = nVar.h() == null ? null : nVar.h().a();
        this.f687s = nVar.i() == null ? null : nVar.i().a();
        this.f688t = nVar.j() == null ? null : nVar.j().a();
        if (this.f684p != null) {
            this.f670b = new Matrix();
            this.f671c = new Matrix();
            this.f672d = new Matrix();
            this.skewValues = new float[9];
        } else {
            this.f670b = null;
            this.f671c = null;
            this.f672d = null;
            this.skewValues = null;
        }
        this.f685q = nVar.m() == null ? null : nVar.m().a();
        if (nVar.e() != null) {
            this.f683o = nVar.e().a();
        }
        if (nVar.n() != null) {
            this.f689u = nVar.n().a();
        } else {
            this.f689u = null;
        }
        if (nVar.d() != null) {
            this.f690v = nVar.d().a();
        } else {
            this.f690v = null;
        }
    }

    public void d(com.airbnb.lottie.model.layer.b bVar) {
        bVar.j(this.f683o);
        bVar.j(this.f689u);
        bVar.j(this.f690v);
        bVar.j(this.f679k);
        bVar.j(this.f680l);
        bVar.j(this.f681m);
        bVar.j(this.f682n);
        bVar.j(this.f684p);
        bVar.j(this.f685q);
        bVar.j(this.f686r);
        bVar.j(this.f687s);
        bVar.j(this.f688t);
    }

    public void e(a.b bVar) {
        a aVar = this.f683o;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a aVar2 = this.f689u;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a aVar3 = this.f690v;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a aVar4 = this.f679k;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a aVar5 = this.f680l;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a aVar6 = this.f681m;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a aVar7 = this.f682n;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f684p;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f685q;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
        d dVar3 = this.f686r;
        if (dVar3 != null) {
            dVar3.a(bVar);
            this.f686r.a(new a.b() { // from class: B3.p
                @Override // B3.a.b
                public final void a() {
                    s.this.f678j = true;
                }
            });
        }
        d dVar4 = this.f687s;
        if (dVar4 != null) {
            dVar4.a(bVar);
            this.f687s.a(new a.b() { // from class: B3.q
                @Override // B3.a.b
                public final void a() {
                    s.this.f678j = true;
                }
            });
        }
        d dVar5 = this.f688t;
        if (dVar5 != null) {
            dVar5.a(bVar);
            this.f688t.a(new a.b() { // from class: B3.r
                @Override // B3.a.b
                public final void a() {
                    s.this.f678j = true;
                }
            });
        }
    }

    public boolean f(Object obj, G3.c cVar) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (obj == S.f28463f) {
            a aVar = this.f679k;
            if (aVar == null) {
                this.f679k = new t(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (obj == S.f28464g) {
            a aVar2 = this.f680l;
            if (aVar2 == null) {
                this.f680l = new t(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (obj == S.f28465h) {
            a aVar3 = this.f680l;
            if (aVar3 instanceof n) {
                ((n) aVar3).t(cVar);
                return true;
            }
        }
        if (obj == S.f28466i) {
            a aVar4 = this.f680l;
            if (aVar4 instanceof n) {
                ((n) aVar4).u(cVar);
                return true;
            }
        }
        if (obj == S.f28472o) {
            a aVar5 = this.f681m;
            if (aVar5 == null) {
                this.f681m = new t(cVar, new G3.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (obj == S.f28473p) {
            a aVar6 = this.f682n;
            if (aVar6 == null) {
                this.f682n = new t(cVar, valueOf2);
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (obj == S.f28460c) {
            a aVar7 = this.f683o;
            if (aVar7 == null) {
                this.f683o = new t(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (obj == S.f28445F) {
            a aVar8 = this.f689u;
            if (aVar8 == null) {
                this.f689u = new t(cVar, valueOf);
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (obj == S.f28446G) {
            a aVar9 = this.f690v;
            if (aVar9 == null) {
                this.f690v = new t(cVar, valueOf);
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (obj == S.f28477t) {
            if (this.f684p == null) {
                this.f684p = new d(Collections.singletonList(new G3.a(valueOf2)));
            }
            this.f684p.o(cVar);
            return true;
        }
        if (obj == S.f28478u) {
            if (this.f685q == null) {
                this.f685q = new d(Collections.singletonList(new G3.a(valueOf2)));
            }
            this.f685q.o(cVar);
            return true;
        }
        if (obj == S.f28474q) {
            if (this.f686r == null) {
                this.f686r = new d(Collections.singletonList(new G3.a(valueOf2)));
            }
            this.f686r.o(cVar);
            return true;
        }
        if (obj == S.f28475r) {
            if (this.f687s == null) {
                this.f687s = new d(Collections.singletonList(new G3.a(valueOf2)));
            }
            this.f687s.o(cVar);
            return true;
        }
        if (obj != S.f28476s) {
            return false;
        }
        if (this.f688t == null) {
            this.f688t = new d(Collections.singletonList(new G3.a(valueOf2)));
        }
        this.f688t.o(cVar);
        return true;
    }

    public final void g() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.skewValues[i10] = 0.0f;
        }
    }

    public a h() {
        return this.f690v;
    }

    public Matrix i() {
        d dVar;
        d dVar2;
        PointF pointF;
        G3.d dVar3;
        PointF pointF2;
        this.f669a.reset();
        d dVar4 = this.f686r;
        if ((dVar4 != null && dVar4.r() != 0.0f) || (((dVar = this.f687s) != null && dVar.r() != 0.0f) || ((dVar2 = this.f688t) != null && dVar2.r() != 0.0f))) {
            d dVar5 = this.f686r;
            float r10 = dVar5 != null ? dVar5.r() : 0.0f;
            d dVar6 = this.f687s;
            float r11 = dVar6 != null ? dVar6.r() : 0.0f;
            d dVar7 = this.f688t;
            float r12 = dVar7 != null ? dVar7.r() : 0.0f;
            if (this.f678j || r10 != this.f673e || r11 != this.f674f || r12 != this.f675g) {
                this.f673e = r10;
                this.f674f = r11;
                this.f675g = r12;
                if (r10 != 0.0f) {
                    this.f676h = (float) Math.cos(Math.toRadians(r10));
                } else {
                    this.f676h = 1.0f;
                }
                if (r11 != 0.0f) {
                    this.f677i = (float) Math.cos(Math.toRadians(r11));
                } else {
                    this.f677i = 1.0f;
                }
                this.f678j = false;
            }
            a aVar = this.f679k;
            PointF pointF3 = aVar == null ? null : (PointF) aVar.h();
            a aVar2 = this.f680l;
            PointF pointF4 = aVar2 == null ? null : (PointF) aVar2.h();
            a aVar3 = this.f681m;
            G3.d dVar8 = aVar3 != null ? (G3.d) aVar3.h() : null;
            y.b(this.f669a, pointF3, pointF4, dVar8 != null ? dVar8.b() : 1.0f, dVar8 != null ? dVar8.c() : 1.0f, r10, r11, r12, this.f676h, this.f677i);
            return this.f669a;
        }
        a aVar4 = this.f680l;
        if (aVar4 != null && (pointF2 = (PointF) aVar4.h()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                this.f669a.preTranslate(f10, pointF2.y);
            }
        }
        if (!this.f691w) {
            a aVar5 = this.f682n;
            if (aVar5 != null) {
                float floatValue = aVar5 instanceof t ? ((Float) aVar5.h()).floatValue() : ((d) aVar5).r();
                if (floatValue != 0.0f) {
                    this.f669a.preRotate(floatValue);
                }
            }
        } else if (aVar4 != null) {
            float f11 = aVar4.f();
            PointF pointF5 = (PointF) aVar4.h();
            float f12 = pointF5.x;
            float f13 = pointF5.y;
            aVar4.n(1.0E-4f + f11);
            PointF pointF6 = (PointF) aVar4.h();
            aVar4.n(f11);
            this.f669a.preRotate((float) Math.toDegrees(Math.atan2(pointF6.y - f13, pointF6.x - f12)));
        }
        if (this.f684p != null) {
            float cos = this.f685q == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.r()) + 90.0f));
            float sin = this.f685q == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.r()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.r()));
            g();
            float[] fArr = this.skewValues;
            fArr[0] = cos;
            fArr[1] = sin;
            float f14 = -sin;
            fArr[3] = f14;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f670b.setValues(fArr);
            g();
            float[] fArr2 = this.skewValues;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f671c.setValues(fArr2);
            g();
            float[] fArr3 = this.skewValues;
            fArr3[0] = cos;
            fArr3[1] = f14;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f672d.setValues(fArr3);
            this.f671c.preConcat(this.f670b);
            this.f672d.preConcat(this.f671c);
            this.f669a.preConcat(this.f672d);
        }
        a aVar6 = this.f681m;
        if (aVar6 != null && (dVar3 = (G3.d) aVar6.h()) != null && (dVar3.b() != 1.0f || dVar3.c() != 1.0f)) {
            this.f669a.preScale(dVar3.b(), dVar3.c());
        }
        a aVar7 = this.f679k;
        if (aVar7 != null && (pointF = (PointF) aVar7.h()) != null) {
            float f15 = pointF.x;
            if (f15 != 0.0f || pointF.y != 0.0f) {
                this.f669a.preTranslate(-f15, -pointF.y);
            }
        }
        return this.f669a;
    }

    public Matrix j(float f10) {
        a aVar = this.f680l;
        PointF pointF = aVar == null ? null : (PointF) aVar.h();
        a aVar2 = this.f681m;
        G3.d dVar = aVar2 == null ? null : (G3.d) aVar2.h();
        a aVar3 = this.f679k;
        PointF pointF2 = aVar3 != null ? (PointF) aVar3.h() : null;
        this.f669a.reset();
        if (pointF != null) {
            this.f669a.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        d dVar2 = this.f686r;
        float r10 = dVar2 != null ? dVar2.r() * f10 : 0.0f;
        d dVar3 = this.f687s;
        float r11 = dVar3 != null ? dVar3.r() * f10 : 0.0f;
        d dVar4 = this.f688t;
        float r12 = dVar4 != null ? dVar4.r() * f10 : 0.0f;
        if (r10 == 0.0f && r11 == 0.0f && r12 == 0.0f) {
            a aVar4 = this.f682n;
            if (aVar4 != null) {
                this.f669a.preRotate(((Float) aVar4.h()).floatValue() * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float cos = r10 != 0.0f ? (float) Math.cos(Math.toRadians(r10)) : 1.0f;
            float cos2 = r11 != 0.0f ? (float) Math.cos(Math.toRadians(r11)) : 1.0f;
            if (r12 != 0.0f) {
                this.f669a.preRotate(r12, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            y.a(this.f669a, r10, r11, 0.0f, cos, cos2);
        }
        if (dVar != null) {
            double d10 = f10;
            this.f669a.preScale((float) Math.pow(dVar.b(), d10), (float) Math.pow(dVar.c(), d10));
        }
        return this.f669a;
    }

    public a k() {
        return this.f683o;
    }

    public a l() {
        return this.f689u;
    }

    public void m(float f10) {
        a aVar = this.f683o;
        if (aVar != null) {
            aVar.n(f10);
        }
        a aVar2 = this.f689u;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a aVar3 = this.f690v;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a aVar4 = this.f679k;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a aVar5 = this.f680l;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a aVar6 = this.f681m;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a aVar7 = this.f682n;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f684p;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f685q;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
        d dVar3 = this.f686r;
        if (dVar3 != null) {
            dVar3.n(f10);
        }
        d dVar4 = this.f687s;
        if (dVar4 != null) {
            dVar4.n(f10);
        }
        d dVar5 = this.f688t;
        if (dVar5 != null) {
            dVar5.n(f10);
        }
    }
}
