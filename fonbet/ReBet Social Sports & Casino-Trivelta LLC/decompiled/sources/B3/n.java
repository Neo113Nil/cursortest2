package B3;

import B3.a;
import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public class n extends a {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f656i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f657j;

    /* renamed from: k, reason: collision with root package name */
    public final a f658k;

    /* renamed from: l, reason: collision with root package name */
    public final a f659l;

    /* renamed from: m, reason: collision with root package name */
    public G3.c f660m;

    /* renamed from: n, reason: collision with root package name */
    public G3.c f661n;

    public n(a aVar, a aVar2) {
        super(Collections.EMPTY_LIST);
        this.f656i = new PointF();
        this.f657j = new PointF();
        this.f658k = aVar;
        this.f659l = aVar2;
        n(f());
    }

    @Override // B3.a
    public void n(float f10) {
        this.f658k.n(f10);
        this.f659l.n(f10);
        this.f656i.set(((Float) this.f658k.h()).floatValue(), ((Float) this.f659l.h()).floatValue());
        for (int i10 = 0; i10 < this.f616a.size(); i10++) {
            ((a.b) this.f616a.get(i10)).a();
        }
    }

    @Override // B3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // B3.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(G3.a aVar, float f10) {
        Float f11;
        G3.a b10;
        G3.a b11;
        Float f12 = null;
        if (this.f660m == null || (b11 = this.f658k.b()) == null) {
            f11 = null;
        } else {
            Float f13 = b11.f3861h;
            G3.c cVar = this.f660m;
            float f14 = b11.f3860g;
            f11 = (Float) cVar.b(f14, f13 == null ? f14 : f13.floatValue(), (Float) b11.f3855b, (Float) b11.f3856c, this.f658k.d(), this.f658k.e(), this.f658k.f());
        }
        if (this.f661n != null && (b10 = this.f659l.b()) != null) {
            Float f15 = b10.f3861h;
            G3.c cVar2 = this.f661n;
            float f16 = b10.f3860g;
            f12 = (Float) cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), (Float) b10.f3855b, (Float) b10.f3856c, this.f659l.d(), this.f659l.e(), this.f659l.f());
        }
        if (f11 == null) {
            this.f657j.set(this.f656i.x, 0.0f);
        } else {
            this.f657j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f657j;
            pointF.set(pointF.x, this.f656i.y);
        } else {
            PointF pointF2 = this.f657j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f657j;
    }

    public void t(G3.c cVar) {
        G3.c cVar2 = this.f660m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f660m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(G3.c cVar) {
        G3.c cVar2 = this.f661n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f661n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
