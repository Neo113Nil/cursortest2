package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Path;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.model.content.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f28658b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28659c;

    /* renamed from: d, reason: collision with root package name */
    public final K f28660d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.m f28661e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28662f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f28657a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b f28663g = new b();

    public r(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.r rVar) {
        this.f28658b = rVar.b();
        this.f28659c = rVar.d();
        this.f28660d = k10;
        B3.m a10 = rVar.c().a();
        this.f28661e = a10;
        bVar.j(a10);
        a10.a(this);
    }

    private void g() {
        this.f28662f = false;
        this.f28660d.invalidateSelf();
    }

    @Override // B3.a.b
    public void a() {
        g();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f28663g.a(uVar);
                    uVar.e(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                s sVar = (s) cVar;
                sVar.h(this);
                arrayList.add(sVar);
            }
        }
        this.f28661e.s(arrayList);
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        if (obj == S.f28457R) {
            this.f28661e.o(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28658b;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path l() {
        if (this.f28662f && !this.f28661e.k()) {
            return this.f28657a;
        }
        this.f28657a.reset();
        if (this.f28659c) {
            this.f28662f = true;
            return this.f28657a;
        }
        Path path = (Path) this.f28661e.h();
        if (path == null) {
            return this.f28657a;
        }
        this.f28657a.set(path);
        this.f28657a.setFillType(Path.FillType.EVEN_ODD);
        this.f28663g.b(this.f28657a);
        this.f28662f = true;
        return this.f28657a;
    }
}
