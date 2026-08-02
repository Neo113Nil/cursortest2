package com.vk.movika.sdk.base.ui;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class m0 implements com.vk.movika.sdk.base.a, com.vk.movika.sdk.common.c {
    public final com.vk.movika.sdk.base.observable.h A;
    public final com.vk.movika.sdk.base.observable.h B;
    public final com.vk.movika.sdk.base.observable.l C;
    public final com.vk.movika.sdk.base.observable.l D;
    public final ArrayList<com.vk.movika.sdk.common.b<?>> b;
    public final com.vk.movika.sdk.base.observable.n c;
    public final com.vk.movika.sdk.base.observable.n d;
    public final com.vk.movika.sdk.base.observable.t e;
    public final com.vk.movika.sdk.base.observable.t f;
    public final com.vk.movika.sdk.base.observable.j g;
    public final com.vk.movika.sdk.base.observable.v h;
    public final com.vk.movika.sdk.base.observable.v i;
    public final com.vk.movika.sdk.base.observable.d0 j;
    public final com.vk.movika.sdk.base.observable.d0 k;
    public final com.vk.movika.sdk.base.observable.d l;
    public final com.vk.movika.sdk.base.observable.d m;
    public final com.vk.movika.sdk.base.observable.b0 n;
    public final com.vk.movika.sdk.base.observable.b0 o;
    public final com.vk.movika.sdk.base.observable.b p;
    public final com.vk.movika.sdk.base.observable.b q;
    public final com.vk.movika.sdk.base.observable.x r;
    public final com.vk.movika.sdk.base.observable.x s;
    public final com.vk.movika.sdk.base.observable.f t;
    public final com.vk.movika.sdk.base.observable.f u;
    public final com.vk.movika.sdk.base.observable.f0 v;
    public final com.vk.movika.sdk.base.observable.r w;
    public final com.vk.movika.sdk.base.observable.r x;
    public final com.vk.movika.sdk.base.observable.z y;
    public final com.vk.movika.sdk.base.observable.z z;

    public m0() {
        ArrayList<com.vk.movika.sdk.common.b<?>> arrayList = new ArrayList<>(15);
        this.b = arrayList;
        com.vk.movika.sdk.base.observable.n nVar = new com.vk.movika.sdk.base.observable.n();
        arrayList.add(nVar);
        this.c = nVar;
        this.d = nVar;
        com.vk.movika.sdk.base.observable.t tVar = new com.vk.movika.sdk.base.observable.t();
        arrayList.add(tVar);
        this.e = tVar;
        this.f = tVar;
        com.vk.movika.sdk.base.observable.j jVar = new com.vk.movika.sdk.base.observable.j();
        arrayList.add(jVar);
        this.g = jVar;
        com.vk.movika.sdk.base.observable.v vVar = new com.vk.movika.sdk.base.observable.v();
        arrayList.add(vVar);
        this.h = vVar;
        this.i = vVar;
        com.vk.movika.sdk.base.observable.d0 d0Var = new com.vk.movika.sdk.base.observable.d0();
        arrayList.add(d0Var);
        this.j = d0Var;
        this.k = d0Var;
        com.vk.movika.sdk.base.observable.d dVar = new com.vk.movika.sdk.base.observable.d();
        arrayList.add(dVar);
        this.l = dVar;
        this.m = dVar;
        com.vk.movika.sdk.base.observable.b0 b0Var = new com.vk.movika.sdk.base.observable.b0();
        arrayList.add(b0Var);
        this.n = b0Var;
        this.o = b0Var;
        com.vk.movika.sdk.base.observable.b bVar = new com.vk.movika.sdk.base.observable.b();
        arrayList.add(bVar);
        this.p = bVar;
        this.q = bVar;
        com.vk.movika.sdk.base.observable.x xVar = new com.vk.movika.sdk.base.observable.x();
        arrayList.add(xVar);
        this.r = xVar;
        this.s = xVar;
        com.vk.movika.sdk.base.observable.f fVar = new com.vk.movika.sdk.base.observable.f();
        arrayList.add(fVar);
        this.t = fVar;
        this.u = fVar;
        com.vk.movika.sdk.base.observable.f0 f0Var = new com.vk.movika.sdk.base.observable.f0();
        arrayList.add(f0Var);
        this.v = f0Var;
        com.vk.movika.sdk.base.observable.r rVar = new com.vk.movika.sdk.base.observable.r();
        arrayList.add(rVar);
        this.w = rVar;
        this.x = rVar;
        com.vk.movika.sdk.base.observable.z zVar = new com.vk.movika.sdk.base.observable.z();
        arrayList.add(zVar);
        this.y = zVar;
        this.z = zVar;
        com.vk.movika.sdk.base.observable.h hVar = new com.vk.movika.sdk.base.observable.h();
        arrayList.add(hVar);
        this.A = hVar;
        this.B = hVar;
        com.vk.movika.sdk.base.observable.l lVar = new com.vk.movika.sdk.base.observable.l();
        arrayList.add(lVar);
        this.C = lVar;
        this.D = lVar;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.z c() {
        return this.z;
    }

    @Override // com.vk.movika.sdk.common.c
    public final void destroy() {
        ArrayList<com.vk.movika.sdk.common.b<?>> arrayList = this.b;
        Iterator<com.vk.movika.sdk.common.b<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        arrayList.clear();
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.t e() {
        return this.f;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.f f() {
        return this.u;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.x j() {
        return this.s;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.d k() {
        return this.m;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.b o() {
        return this.q;
    }
}
