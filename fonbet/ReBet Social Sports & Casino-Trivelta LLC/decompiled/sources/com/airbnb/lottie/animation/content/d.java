package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import com.airbnb.lottie.utils.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements e, m, a.b, E3.f {

    /* renamed from: a, reason: collision with root package name */
    public final x.b f28546a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f28547b;

    /* renamed from: c, reason: collision with root package name */
    public final x f28548c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f28549d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f28550e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f28551f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28552g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28553h;

    /* renamed from: i, reason: collision with root package name */
    public final List f28554i;

    /* renamed from: j, reason: collision with root package name */
    public final K f28555j;

    /* renamed from: k, reason: collision with root package name */
    public List f28556k;

    /* renamed from: l, reason: collision with root package name */
    public B3.s f28557l;

    public d(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.q qVar, C2940j c2940j) {
        this(k10, bVar, qVar.c(), qVar.d(), g(k10, c2940j, bVar, qVar.b()), j(qVar.b()));
    }

    public static List g(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c a10 = ((com.airbnb.lottie.model.content.c) list.get(i10)).a(k10, c2940j, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static F3.n j(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.airbnb.lottie.model.content.c cVar = (com.airbnb.lottie.model.content.c) list.get(i10);
            if (cVar instanceof F3.n) {
                return (F3.n) cVar;
            }
        }
        return null;
    }

    @Override // B3.a.b
    public void a() {
        this.f28555j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f28554i.size());
        arrayList.addAll(list);
        for (int size = this.f28554i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f28554i.get(size);
            cVar.b(arrayList, this.f28554i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        if (this.f28553h) {
            return;
        }
        this.f28549d.set(matrix);
        B3.s sVar = this.f28557l;
        if (sVar != null) {
            this.f28549d.preConcat(sVar.i());
            i10 = (int) (((((this.f28557l.k() == null ? 100 : ((Integer) this.f28557l.k().h()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = (this.f28555j.f0() && o() && i10 != 255) || (dVar != null && this.f28555j.g0() && o());
        int i11 = z10 ? 255 : i10;
        if (z10) {
            this.f28547b.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(this.f28547b, matrix, true);
            x.b bVar = this.f28546a;
            bVar.f29158a = i10;
            if (dVar != null) {
                dVar.b(bVar);
                dVar = null;
            } else {
                bVar.f29161d = null;
            }
            canvas = this.f28548c.j(canvas, this.f28547b, this.f28546a);
        } else if (dVar != null) {
            com.airbnb.lottie.utils.d dVar2 = new com.airbnb.lottie.utils.d(dVar);
            dVar2.i(i11);
            dVar = dVar2;
        }
        for (int size = this.f28554i.size() - 1; size >= 0; size--) {
            Object obj = this.f28554i.get(size);
            if (obj instanceof e) {
                ((e) obj).d(canvas, this.f28549d, i11, dVar);
            }
        }
        if (z10) {
            this.f28548c.e();
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        B3.s sVar = this.f28557l;
        if (sVar != null) {
            sVar.f(obj, cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f28549d.set(matrix);
        B3.s sVar = this.f28557l;
        if (sVar != null) {
            this.f28549d.preConcat(sVar.i());
        }
        this.f28551f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f28554i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f28554i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(this.f28551f, this.f28549d, z10);
                rectF.union(this.f28551f);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28552g;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int e10 = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f28554i.size(); i11++) {
                    c cVar = (c) this.f28554i.get(i11);
                    if (cVar instanceof E3.f) {
                        ((E3.f) cVar).i(eVar, e10, list, eVar2);
                    }
                }
            }
        }
    }

    public List k() {
        return this.f28554i;
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path l() {
        this.f28549d.reset();
        B3.s sVar = this.f28557l;
        if (sVar != null) {
            this.f28549d.set(sVar.i());
        }
        this.f28550e.reset();
        if (this.f28553h) {
            return this.f28550e;
        }
        for (int size = this.f28554i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f28554i.get(size);
            if (cVar instanceof m) {
                this.f28550e.addPath(((m) cVar).l(), this.f28549d);
            }
        }
        return this.f28550e;
    }

    public List m() {
        if (this.f28556k == null) {
            this.f28556k = new ArrayList();
            for (int i10 = 0; i10 < this.f28554i.size(); i10++) {
                c cVar = (c) this.f28554i.get(i10);
                if (cVar instanceof m) {
                    this.f28556k.add((m) cVar);
                }
            }
        }
        return this.f28556k;
    }

    public Matrix n() {
        B3.s sVar = this.f28557l;
        if (sVar != null) {
            return sVar.i();
        }
        this.f28549d.reset();
        return this.f28549d;
    }

    public final boolean o() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28554i.size(); i11++) {
            if ((this.f28554i.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public d(K k10, com.airbnb.lottie.model.layer.b bVar, String str, boolean z10, List list, F3.n nVar) {
        this.f28546a = new x.b();
        this.f28547b = new RectF();
        this.f28548c = new x();
        this.f28549d = new Matrix();
        this.f28550e = new Path();
        this.f28551f = new RectF();
        this.f28552g = str;
        this.f28555j = k10;
        this.f28553h = z10;
        this.f28554i = list;
        if (nVar != null) {
            B3.s b10 = nVar.b();
            this.f28557l = b10;
            b10.d(bVar);
            this.f28557l.e(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).g(list.listIterator(list.size()));
        }
    }
}
