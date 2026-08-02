package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.model.content.t;
import java.util.List;

/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    public final String f28634c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28635d;

    /* renamed from: e, reason: collision with root package name */
    public final K f28636e;

    /* renamed from: f, reason: collision with root package name */
    public final B3.a f28637f;

    /* renamed from: g, reason: collision with root package name */
    public final B3.a f28638g;

    /* renamed from: h, reason: collision with root package name */
    public final B3.a f28639h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28642k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f28632a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f28633b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final b f28640i = new b();

    /* renamed from: j, reason: collision with root package name */
    public B3.a f28641j = null;

    public o(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar) {
        this.f28634c = lVar.c();
        this.f28635d = lVar.f();
        this.f28636e = k10;
        B3.a a10 = lVar.d().a();
        this.f28637f = a10;
        B3.a a11 = lVar.e().a();
        this.f28638g = a11;
        B3.d a12 = lVar.b().a();
        this.f28639h = a12;
        bVar.j(a10);
        bVar.j(a11);
        bVar.j(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    private void g() {
        this.f28642k = false;
        this.f28636e.invalidateSelf();
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
                    this.f28640i.a(uVar);
                    uVar.e(this);
                }
            }
            if (cVar instanceof q) {
                this.f28641j = ((q) cVar).i();
            }
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        if (obj == S.f28469l) {
            this.f28638g.o(cVar);
        } else if (obj == S.f28471n) {
            this.f28637f.o(cVar);
        } else if (obj == S.f28470m) {
            this.f28639h.o(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28634c;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path l() {
        B3.a aVar;
        if (this.f28642k) {
            return this.f28632a;
        }
        this.f28632a.reset();
        if (this.f28635d) {
            this.f28642k = true;
            return this.f28632a;
        }
        PointF pointF = (PointF) this.f28638g.h();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        B3.a aVar2 = this.f28639h;
        float r10 = aVar2 == null ? 0.0f : ((B3.d) aVar2).r();
        if (r10 == 0.0f && (aVar = this.f28641j) != null) {
            r10 = Math.min(((Float) aVar.h()).floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (r10 > min) {
            r10 = min;
        }
        PointF pointF2 = (PointF) this.f28637f.h();
        this.f28632a.moveTo(pointF2.x + f10, (pointF2.y - f11) + r10);
        this.f28632a.lineTo(pointF2.x + f10, (pointF2.y + f11) - r10);
        if (r10 > 0.0f) {
            RectF rectF = this.f28633b;
            float f12 = pointF2.x;
            float f13 = r10 * 2.0f;
            float f14 = pointF2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f28632a.arcTo(this.f28633b, 0.0f, 90.0f, false);
        }
        this.f28632a.lineTo((pointF2.x - f10) + r10, pointF2.y + f11);
        if (r10 > 0.0f) {
            RectF rectF2 = this.f28633b;
            float f15 = pointF2.x;
            float f16 = pointF2.y;
            float f17 = r10 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f28632a.arcTo(this.f28633b, 90.0f, 90.0f, false);
        }
        this.f28632a.lineTo(pointF2.x - f10, (pointF2.y - f11) + r10);
        if (r10 > 0.0f) {
            RectF rectF3 = this.f28633b;
            float f18 = pointF2.x;
            float f19 = pointF2.y;
            float f20 = r10 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f28632a.arcTo(this.f28633b, 180.0f, 90.0f, false);
        }
        this.f28632a.lineTo((pointF2.x + f10) - r10, pointF2.y - f11);
        if (r10 > 0.0f) {
            RectF rectF4 = this.f28633b;
            float f21 = pointF2.x;
            float f22 = r10 * 2.0f;
            float f23 = pointF2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f28632a.arcTo(this.f28633b, 270.0f, 90.0f, false);
        }
        this.f28632a.close();
        this.f28640i.b(this.f28632a);
        this.f28642k = true;
        return this.f28632a;
    }
}
