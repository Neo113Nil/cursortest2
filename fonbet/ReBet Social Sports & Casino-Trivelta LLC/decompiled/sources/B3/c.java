package B3;

import B3.a;
import android.graphics.Color;
import android.graphics.Matrix;
import com.airbnb.lottie.parser.C2956j;

/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f630a;

    /* renamed from: b, reason: collision with root package name */
    public final a.b f631b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.a f632c;

    /* renamed from: d, reason: collision with root package name */
    public final d f633d;

    /* renamed from: e, reason: collision with root package name */
    public final d f634e;

    /* renamed from: f, reason: collision with root package name */
    public final d f635f;

    /* renamed from: g, reason: collision with root package name */
    public final d f636g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f637h;

    public class a extends G3.c {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ G3.c f638d;

        public a(G3.c cVar) {
            this.f638d = cVar;
        }

        @Override // G3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(G3.b bVar) {
            Float f10 = (Float) this.f638d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, com.airbnb.lottie.model.layer.b bVar2, C2956j c2956j) {
        this.f631b = bVar;
        this.f630a = bVar2;
        B3.a a10 = c2956j.a().a();
        this.f632c = a10;
        a10.a(this);
        bVar2.j(a10);
        d a11 = c2956j.d().a();
        this.f633d = a11;
        a11.a(this);
        bVar2.j(a11);
        d a12 = c2956j.b().a();
        this.f634e = a12;
        a12.a(this);
        bVar2.j(a12);
        d a13 = c2956j.c().a();
        this.f635f = a13;
        a13.a(this);
        bVar2.j(a13);
        d a14 = c2956j.e().a();
        this.f636g = a14;
        a14.a(this);
        bVar2.j(a14);
    }

    @Override // B3.a.b
    public void a() {
        this.f631b.a();
    }

    public com.airbnb.lottie.utils.d b(Matrix matrix, int i10) {
        float r10 = this.f634e.r() * 0.017453292f;
        float floatValue = ((Float) this.f635f.h()).floatValue();
        double d10 = r10;
        float sin = ((float) Math.sin(d10)) * floatValue;
        float cos = ((float) Math.cos(d10 + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.f636g.h()).floatValue();
        int intValue = ((Integer) this.f632c.h()).intValue();
        com.airbnb.lottie.utils.d dVar = new com.airbnb.lottie.utils.d(floatValue2 * 0.33f, sin, cos, Color.argb(Math.round((((Float) this.f633d.h()).floatValue() * i10) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        dVar.k(matrix);
        if (this.f637h == null) {
            this.f637h = new Matrix();
        }
        this.f630a.f28881x.i().invert(this.f637h);
        dVar.k(this.f637h);
        return dVar;
    }

    public void c(G3.c cVar) {
        this.f632c.o(cVar);
    }

    public void d(G3.c cVar) {
        this.f634e.o(cVar);
    }

    public void e(G3.c cVar) {
        this.f635f.o(cVar);
    }

    public void f(G3.c cVar) {
        if (cVar == null) {
            this.f633d.o(null);
        } else {
            this.f633d.o(new a(cVar));
        }
    }

    public void g(G3.c cVar) {
        this.f636g.o(cVar);
    }
}
