package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final List f28811a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f28812b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28813c;

    public o(PointF pointF, boolean z10, List list) {
        this.f28812b = pointF;
        this.f28813c = z10;
        this.f28811a = new ArrayList(list);
    }

    public List a() {
        return this.f28811a;
    }

    public PointF b() {
        return this.f28812b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f28812b == null) {
            this.f28812b = new PointF();
        }
        this.f28813c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            com.airbnb.lottie.utils.g.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int min = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f28811a.size() < min) {
            for (int size = this.f28811a.size(); size < min; size++) {
                this.f28811a.add(new E3.a());
            }
        } else if (this.f28811a.size() > min) {
            for (int size2 = this.f28811a.size() - 1; size2 >= min; size2--) {
                List list = this.f28811a;
                list.remove(list.size() - 1);
            }
        }
        PointF b10 = oVar.b();
        PointF b11 = oVar2.b();
        f(com.airbnb.lottie.utils.l.i(b10.x, b11.x, f10), com.airbnb.lottie.utils.l.i(b10.y, b11.y, f10));
        for (int size3 = this.f28811a.size() - 1; size3 >= 0; size3--) {
            E3.a aVar = (E3.a) oVar.a().get(size3);
            E3.a aVar2 = (E3.a) oVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b12 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b13 = aVar2.b();
            PointF c11 = aVar2.c();
            ((E3.a) this.f28811a.get(size3)).d(com.airbnb.lottie.utils.l.i(a10.x, a11.x, f10), com.airbnb.lottie.utils.l.i(a10.y, a11.y, f10));
            ((E3.a) this.f28811a.get(size3)).e(com.airbnb.lottie.utils.l.i(b12.x, b13.x, f10), com.airbnb.lottie.utils.l.i(b12.y, b13.y, f10));
            ((E3.a) this.f28811a.get(size3)).f(com.airbnb.lottie.utils.l.i(c10.x, c11.x, f10), com.airbnb.lottie.utils.l.i(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f28813c;
    }

    public void e(boolean z10) {
        this.f28813c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f28812b == null) {
            this.f28812b = new PointF();
        }
        this.f28812b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f28811a.size() + "closed=" + this.f28813c + '}';
    }

    public o() {
        this.f28811a = new ArrayList();
    }
}
