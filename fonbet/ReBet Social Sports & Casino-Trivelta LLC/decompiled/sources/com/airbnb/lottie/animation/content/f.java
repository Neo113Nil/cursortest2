package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.model.content.t;
import java.util.List;

/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f28559b;

    /* renamed from: c, reason: collision with root package name */
    public final K f28560c;

    /* renamed from: d, reason: collision with root package name */
    public final B3.a f28561d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.a f28562e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.b f28563f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28565h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f28558a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b f28564g = new b();

    public f(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.f28559b = bVar2.b();
        this.f28560c = k10;
        B3.a a10 = bVar2.d().a();
        this.f28561d = a10;
        B3.a a11 = bVar2.c().a();
        this.f28562e = a11;
        this.f28563f = bVar2;
        bVar.j(a10);
        bVar.j(a11);
        a10.a(this);
        a11.a(this);
    }

    @Override // B3.a.b
    public void a() {
        g();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f28564g.a(uVar);
                    uVar.e(this);
                }
            }
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        if (obj == S.f28468k) {
            this.f28561d.o(cVar);
        } else if (obj == S.f28471n) {
            this.f28562e.o(cVar);
        }
    }

    public final void g() {
        this.f28565h = false;
        this.f28560c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28559b;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path l() {
        if (this.f28565h) {
            return this.f28558a;
        }
        this.f28558a.reset();
        if (this.f28563f.e()) {
            this.f28565h = true;
            return this.f28558a;
        }
        PointF pointF = (PointF) this.f28561d.h();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f28558a.reset();
        if (this.f28563f.f()) {
            float f14 = -f11;
            this.f28558a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f28558a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f28558a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f28558a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f28558a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f28558a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f28558a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f28558a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f28558a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f28558a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f28562e.h();
        this.f28558a.offset(pointF2.x, pointF2.y);
        this.f28558a.close();
        this.f28564g.b(this.f28558a);
        this.f28565h = true;
        return this.f28558a;
    }
}
