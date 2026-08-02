package com.airbnb.lottie.model.layer;

import B3.t;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z.C6907h;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: E, reason: collision with root package name */
    public B3.a f28884E;

    /* renamed from: F, reason: collision with root package name */
    public final List f28885F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f28886G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f28887H;

    /* renamed from: I, reason: collision with root package name */
    public final RectF f28888I;

    /* renamed from: J, reason: collision with root package name */
    public final x f28889J;

    /* renamed from: K, reason: collision with root package name */
    public final x.b f28890K;

    /* renamed from: L, reason: collision with root package name */
    public float f28891L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f28892M;

    /* renamed from: N, reason: collision with root package name */
    public B3.c f28893N;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        static {
            int[] iArr = new int[e.b.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(K k10, e eVar, List list, C2940j c2940j) {
        super(k10, eVar);
        int i10;
        b bVar;
        this.f28885F = new ArrayList();
        this.f28886G = new RectF();
        this.f28887H = new RectF();
        this.f28888I = new RectF();
        this.f28889J = new x();
        this.f28890K = new x.b();
        this.f28892M = true;
        F3.b v10 = eVar.v();
        if (v10 != null) {
            B3.d a10 = v10.a();
            this.f28884E = a10;
            j(a10);
            this.f28884E.a(this);
        } else {
            this.f28884E = null;
        }
        C6907h c6907h = new C6907h(c2940j.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = (e) list.get(size);
            b w10 = b.w(this, eVar2, k10, c2940j);
            if (w10 != null) {
                c6907h.g(w10.B().e(), w10);
                if (bVar2 != null) {
                    bVar2.K(w10);
                    bVar2 = null;
                } else {
                    this.f28885F.add(0, w10);
                    int i11 = a.$SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = w10;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < c6907h.j(); i10++) {
            b bVar3 = (b) c6907h.d(c6907h.f(i10));
            if (bVar3 != null && (bVar = (b) c6907h.d(bVar3.B().k())) != null) {
                bVar3.M(bVar);
            }
        }
        if (A() != null) {
            this.f28893N = new B3.c(this, this, A());
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void J(E3.e eVar, int i10, List list, E3.e eVar2) {
        for (int i11 = 0; i11 < this.f28885F.size(); i11++) {
            ((b) this.f28885F.get(i11)).i(eVar, i10, list, eVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void L(boolean z10) {
        super.L(z10);
        Iterator it = this.f28885F.iterator();
        while (it.hasNext()) {
            ((b) it.next()).L(z10);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void N(float f10) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("CompositionLayer#setProgress");
        }
        this.f28891L = f10;
        super.N(f10);
        if (this.f28884E != null) {
            f10 = ((((Float) this.f28884E.h()).floatValue() * this.f28874q.c().i()) - this.f28874q.c().p()) / (this.f28873p.J().e() + 0.01f);
        }
        if (this.f28884E == null) {
            f10 -= this.f28874q.s();
        }
        if (this.f28874q.w() != 0.0f && !"__container".equals(this.f28874q.j())) {
            f10 /= this.f28874q.w();
        }
        for (int size = this.f28885F.size() - 1; size >= 0; size--) {
            ((b) this.f28885F.get(size)).N(f10);
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("CompositionLayer#setProgress");
        }
    }

    public float Q() {
        return this.f28891L;
    }

    public void R(boolean z10) {
        this.f28892M = z10;
    }

    @Override // com.airbnb.lottie.model.layer.b, E3.f
    public void e(Object obj, G3.c cVar) {
        B3.c cVar2;
        B3.c cVar3;
        B3.c cVar4;
        B3.c cVar5;
        B3.c cVar6;
        super.e(obj, cVar);
        if (obj == S.f28447H) {
            if (cVar == null) {
                B3.a aVar = this.f28884E;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            t tVar = new t(cVar);
            this.f28884E = tVar;
            tVar.a(this);
            j(this.f28884E);
            return;
        }
        if (obj == S.f28462e && (cVar6 = this.f28893N) != null) {
            cVar6.c(cVar);
            return;
        }
        if (obj == S.f28449J && (cVar5 = this.f28893N) != null) {
            cVar5.f(cVar);
            return;
        }
        if (obj == S.f28450K && (cVar4 = this.f28893N) != null) {
            cVar4.d(cVar);
            return;
        }
        if (obj == S.f28451L && (cVar3 = this.f28893N) != null) {
            cVar3.e(cVar);
        } else {
            if (obj != S.f28452M || (cVar2 = this.f28893N) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        for (int size = this.f28885F.size() - 1; size >= 0; size--) {
            this.f28886G.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.f28885F.get(size)).f(this.f28886G, this.f28872o, true);
            rectF.union(this.f28886G);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void v(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        Canvas canvas2;
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("CompositionLayer#draw");
        }
        boolean z10 = false;
        boolean z11 = (dVar == null && this.f28893N == null) ? false : true;
        if ((this.f28873p.f0() && this.f28885F.size() > 1 && i10 != 255) || (z11 && this.f28873p.g0())) {
            z10 = true;
        }
        int i11 = z10 ? 255 : i10;
        B3.c cVar = this.f28893N;
        if (cVar != null) {
            dVar = cVar.b(matrix, i11);
        }
        if (this.f28892M || !"__container".equals(this.f28874q.j())) {
            this.f28887H.set(0.0f, 0.0f, this.f28874q.m(), this.f28874q.l());
            matrix.mapRect(this.f28887H);
        } else {
            this.f28887H.setEmpty();
            Iterator it = this.f28885F.iterator();
            while (it.hasNext()) {
                ((b) it.next()).f(this.f28888I, matrix, true);
                this.f28887H.union(this.f28888I);
            }
        }
        if (z10) {
            this.f28890K.f();
            x.b bVar = this.f28890K;
            bVar.f29158a = i10;
            if (dVar != null) {
                dVar.b(bVar);
                dVar = null;
            }
            canvas2 = this.f28889J.j(canvas, this.f28887H, this.f28890K);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.f28887H)) {
            for (int size = this.f28885F.size() - 1; size >= 0; size--) {
                ((b) this.f28885F.get(size)).d(canvas2, matrix, i11, dVar);
            }
        }
        if (z10) {
            this.f28889J.e();
        }
        canvas.restore();
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("CompositionLayer#draw");
        }
    }
}
