package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class r implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Set f30130a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.k
    public void a() {
        Iterator it = com.bumptech.glide.util.l.k(this.f30130a).iterator();
        while (it.hasNext()) {
            ((M4.j) it.next()).a();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void b() {
        Iterator it = com.bumptech.glide.util.l.k(this.f30130a).iterator();
        while (it.hasNext()) {
            ((M4.j) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void d() {
        Iterator it = com.bumptech.glide.util.l.k(this.f30130a).iterator();
        while (it.hasNext()) {
            ((M4.j) it.next()).d();
        }
    }

    public void f() {
        this.f30130a.clear();
    }

    public List k() {
        return com.bumptech.glide.util.l.k(this.f30130a);
    }

    public void l(M4.j jVar) {
        this.f30130a.add(jVar);
    }

    public void o(M4.j jVar) {
        this.f30130a.remove(jVar);
    }
}
