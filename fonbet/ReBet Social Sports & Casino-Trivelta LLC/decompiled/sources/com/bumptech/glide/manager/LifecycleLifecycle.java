package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC2193s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
final class LifecycleLifecycle implements j, androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final Set f30091a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2185j f30092b;

    public LifecycleLifecycle(AbstractC2185j abstractC2185j) {
        this.f30092b = abstractC2185j;
        abstractC2185j.a(this);
    }

    @Override // com.bumptech.glide.manager.j
    public void a(k kVar) {
        this.f30091a.remove(kVar);
    }

    @Override // com.bumptech.glide.manager.j
    public void b(k kVar) {
        this.f30091a.add(kVar);
        if (this.f30092b.b() == AbstractC2185j.b.f20390a) {
            kVar.a();
        } else if (this.f30092b.b().b(AbstractC2185j.b.f20393d)) {
            kVar.d();
        } else {
            kVar.b();
        }
    }

    @D(AbstractC2185j.a.ON_DESTROY)
    public void onDestroy(@NonNull InterfaceC2193s interfaceC2193s) {
        Iterator it = com.bumptech.glide.util.l.k(this.f30091a).iterator();
        while (it.hasNext()) {
            ((k) it.next()).a();
        }
        interfaceC2193s.getLifecycle().d(this);
    }

    @D(AbstractC2185j.a.ON_START)
    public void onStart(@NonNull InterfaceC2193s interfaceC2193s) {
        Iterator it = com.bumptech.glide.util.l.k(this.f30091a).iterator();
        while (it.hasNext()) {
            ((k) it.next()).d();
        }
    }

    @D(AbstractC2185j.a.ON_STOP)
    public void onStop(@NonNull InterfaceC2193s interfaceC2193s) {
        Iterator it = com.bumptech.glide.util.l.k(this.f30091a).iterator();
        while (it.hasNext()) {
            ((k) it.next()).b();
        }
    }
}
