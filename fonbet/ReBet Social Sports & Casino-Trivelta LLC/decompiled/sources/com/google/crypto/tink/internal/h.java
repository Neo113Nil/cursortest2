package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.v;
import com.google.crypto.tink.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static h f37058b = new h();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f37059a = new AtomicReference(new n.b().c());

    public static h c() {
        return f37058b;
    }

    public Class a(Class cls) {
        return ((n) this.f37059a.get()).c(cls);
    }

    public Object b(com.google.crypto.tink.g gVar, Class cls) {
        return ((n) this.f37059a.get()).d(gVar, cls);
    }

    public synchronized void d(l lVar) {
        this.f37059a.set(new n.b((n) this.f37059a.get()).d(lVar).c());
    }

    public synchronized void e(w wVar) {
        this.f37059a.set(new n.b((n) this.f37059a.get()).e(wVar).c());
    }

    public Object f(v vVar, Class cls) {
        return ((n) this.f37059a.get()).e(vVar, cls);
    }
}
