package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.model.content.q;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: E, reason: collision with root package name */
    public final com.airbnb.lottie.animation.content.d f28942E;

    /* renamed from: F, reason: collision with root package name */
    public final c f28943F;

    /* renamed from: G, reason: collision with root package name */
    public B3.c f28944G;

    public g(K k10, e eVar, c cVar, C2940j c2940j) {
        super(k10, eVar);
        this.f28943F = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(k10, this, new q("__container", eVar.o(), false), c2940j);
        this.f28942E = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
        if (A() != null) {
            this.f28944G = new B3.c(this, this, A());
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void J(E3.e eVar, int i10, List list, E3.e eVar2) {
        this.f28942E.i(eVar, i10, list, eVar2);
    }

    @Override // com.airbnb.lottie.model.layer.b, E3.f
    public void e(Object obj, G3.c cVar) {
        B3.c cVar2;
        B3.c cVar3;
        B3.c cVar4;
        B3.c cVar5;
        B3.c cVar6;
        super.e(obj, cVar);
        if (obj == S.f28462e && (cVar6 = this.f28944G) != null) {
            cVar6.c(cVar);
            return;
        }
        if (obj == S.f28449J && (cVar5 = this.f28944G) != null) {
            cVar5.f(cVar);
            return;
        }
        if (obj == S.f28450K && (cVar4 = this.f28944G) != null) {
            cVar4.d(cVar);
            return;
        }
        if (obj == S.f28451L && (cVar3 = this.f28944G) != null) {
            cVar3.e(cVar);
        } else {
            if (obj != S.f28452M || (cVar2 = this.f28944G) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        this.f28942E.f(rectF, this.f28872o, z10);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void v(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        B3.c cVar = this.f28944G;
        if (cVar != null) {
            dVar = cVar.b(matrix, i10);
        }
        this.f28942E.d(canvas, matrix, i10, dVar);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public com.airbnb.lottie.model.content.a y() {
        com.airbnb.lottie.model.content.a y10 = super.y();
        return y10 != null ? y10 : this.f28943F.y();
    }
}
