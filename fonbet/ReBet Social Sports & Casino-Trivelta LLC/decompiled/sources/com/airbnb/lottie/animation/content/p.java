package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f28643a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f28644b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final K f28645c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f28646d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28647e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28648f;

    /* renamed from: g, reason: collision with root package name */
    public final B3.a f28649g;

    /* renamed from: h, reason: collision with root package name */
    public final B3.a f28650h;

    /* renamed from: i, reason: collision with root package name */
    public final B3.s f28651i;

    /* renamed from: j, reason: collision with root package name */
    public d f28652j;

    public p(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.m mVar) {
        this.f28645c = k10;
        this.f28646d = bVar;
        this.f28647e = mVar.c();
        this.f28648f = mVar.f();
        B3.d a10 = mVar.b().a();
        this.f28649g = a10;
        bVar.j(a10);
        a10.a(this);
        B3.d a11 = mVar.d().a();
        this.f28650h = a11;
        bVar.j(a11);
        a11.a(this);
        B3.s b10 = mVar.e().b();
        this.f28651i = b10;
        b10.d(bVar);
        b10.e(this);
    }

    @Override // B3.a.b
    public void a() {
        this.f28645c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        this.f28652j.b(list, list2);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        float floatValue = ((Float) this.f28649g.h()).floatValue();
        float floatValue2 = ((Float) this.f28650h.h()).floatValue();
        float floatValue3 = ((Float) this.f28651i.l().h()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f28651i.h().h()).floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f28643a.set(matrix);
            float f10 = i11;
            this.f28643a.preConcat(this.f28651i.j(f10 + floatValue2));
            this.f28652j.d(canvas, this.f28643a, (int) (i10 * com.airbnb.lottie.utils.l.i(floatValue3, floatValue4, f10 / floatValue)), dVar);
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        if (this.f28651i.f(obj, cVar)) {
            return;
        }
        if (obj == S.f28481x) {
            this.f28649g.o(cVar);
        } else if (obj == S.f28482y) {
            this.f28650h.o(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f28652j.f(rectF, matrix, z10);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator listIterator) {
        if (this.f28652j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f28652j = new d(this.f28645c, this.f28646d, "Repeater", this.f28648f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28647e;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f28652j.k().size(); i11++) {
            c cVar = (c) this.f28652j.k().get(i11);
            if (cVar instanceof k) {
                com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path l() {
        Path l10 = this.f28652j.l();
        this.f28644b.reset();
        float floatValue = ((Float) this.f28649g.h()).floatValue();
        float floatValue2 = ((Float) this.f28650h.h()).floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f28643a.set(this.f28651i.j(i10 + floatValue2));
            this.f28644b.addPath(l10, this.f28643a);
        }
        return this.f28644b;
    }
}
