package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public float f35852a;

    /* renamed from: b, reason: collision with root package name */
    public float f35853b;

    /* renamed from: c, reason: collision with root package name */
    public float f35854c;

    /* renamed from: d, reason: collision with root package name */
    public float f35855d;

    /* renamed from: e, reason: collision with root package name */
    public float f35856e;

    /* renamed from: f, reason: collision with root package name */
    public float f35857f;

    /* renamed from: g, reason: collision with root package name */
    public final List f35858g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final List f35859h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f35860i;

    public class a extends g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f35861c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f35862d;

        public a(List list, Matrix matrix) {
            this.f35861c = list;
            this.f35862d = matrix;
        }

        @Override // com.google.android.material.shape.p.g
        public void b(Matrix matrix, Ea.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f35861c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f35862d, aVar, i10, canvas);
            }
        }
    }

    public static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        public final d f35864c;

        public b(d dVar) {
            this.f35864c = dVar;
        }

        @Override // com.google.android.material.shape.p.g
        public void b(Matrix matrix, Ea.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f35864c.k(), this.f35864c.o(), this.f35864c.l(), this.f35864c.j()), i10, this.f35864c.m(), this.f35864c.n());
        }
    }

    public static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        public final e f35865c;

        /* renamed from: d, reason: collision with root package name */
        public final float f35866d;

        /* renamed from: e, reason: collision with root package name */
        public final float f35867e;

        public c(e eVar, float f10, float f11) {
            this.f35865c = eVar;
            this.f35866d = f10;
            this.f35867e = f11;
        }

        @Override // com.google.android.material.shape.p.g
        public void b(Matrix matrix, Ea.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f35865c.f35876c - this.f35867e, this.f35865c.f35875b - this.f35866d), 0.0f);
            this.f35879a.set(matrix);
            this.f35879a.preTranslate(this.f35866d, this.f35867e);
            this.f35879a.preRotate(c());
            aVar.b(canvas, this.f35879a, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f35865c.f35876c - this.f35867e) / (this.f35865c.f35875b - this.f35866d)));
        }
    }

    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f35868h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f35869b;

        /* renamed from: c, reason: collision with root package name */
        public float f35870c;

        /* renamed from: d, reason: collision with root package name */
        public float f35871d;

        /* renamed from: e, reason: collision with root package name */
        public float f35872e;

        /* renamed from: f, reason: collision with root package name */
        public float f35873f;

        /* renamed from: g, reason: collision with root package name */
        public float f35874g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // com.google.android.material.shape.p.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f35877a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f35868h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f35872e;
        }

        public final float k() {
            return this.f35869b;
        }

        public final float l() {
            return this.f35871d;
        }

        public final float m() {
            return this.f35873f;
        }

        public final float n() {
            return this.f35874g;
        }

        public final float o() {
            return this.f35870c;
        }

        public final void p(float f10) {
            this.f35872e = f10;
        }

        public final void q(float f10) {
            this.f35869b = f10;
        }

        public final void r(float f10) {
            this.f35871d = f10;
        }

        public final void s(float f10) {
            this.f35873f = f10;
        }

        public final void t(float f10) {
            this.f35874g = f10;
        }

        public final void u(float f10) {
            this.f35870c = f10;
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        public float f35875b;

        /* renamed from: c, reason: collision with root package name */
        public float f35876c;

        @Override // com.google.android.material.shape.p.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f35877a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f35875b, this.f35876c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f35877a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f35878b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f35879a = new Matrix();

        public final void a(Ea.a aVar, int i10, Canvas canvas) {
            b(f35878b, aVar, i10, canvas);
        }

        public abstract void b(Matrix matrix, Ea.a aVar, int i10, Canvas canvas);
    }

    public p() {
        n(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f35858g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (g() == f10) {
            return;
        }
        float g10 = ((f10 - g()) + 360.0f) % 360.0f;
        if (g10 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g10);
        this.f35859h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f35859h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f35858g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f35858g.get(i10)).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f35860i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f35859h), new Matrix(matrix));
    }

    public final float g() {
        return this.f35856e;
    }

    public final float h() {
        return this.f35857f;
    }

    public float i() {
        return this.f35854c;
    }

    public float j() {
        return this.f35855d;
    }

    public float k() {
        return this.f35852a;
    }

    public float l() {
        return this.f35853b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f35875b = f10;
        eVar.f35876c = f11;
        this.f35858g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f35858g.clear();
        this.f35859h.clear();
        this.f35860i = false;
    }

    public final void p(float f10) {
        this.f35856e = f10;
    }

    public final void q(float f10) {
        this.f35857f = f10;
    }

    public final void r(float f10) {
        this.f35854c = f10;
    }

    public final void s(float f10) {
        this.f35855d = f10;
    }

    public final void t(float f10) {
        this.f35852a = f10;
    }

    public final void u(float f10) {
        this.f35853b = f10;
    }
}
