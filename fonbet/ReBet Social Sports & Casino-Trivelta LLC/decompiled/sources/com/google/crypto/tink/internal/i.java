package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.y;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f37060b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f37061a = new AtomicReference(new r.b().e());

    public static i a() {
        return f37060b;
    }

    public boolean b(q qVar) {
        return ((r) this.f37061a.get()).e(qVar);
    }

    public com.google.crypto.tink.g c(q qVar, y yVar) {
        return ((r) this.f37061a.get()).f(qVar, yVar);
    }

    public com.google.crypto.tink.g d(o oVar, y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, yVar);
        }
        try {
            return new e(oVar, yVar);
        } catch (GeneralSecurityException e10) {
            throw new s("Creating a LegacyProtoKey failed", e10);
        }
    }

    public synchronized void e(b bVar) {
        this.f37061a.set(new r.b((r) this.f37061a.get()).f(bVar).e());
    }

    public synchronized void f(c cVar) {
        this.f37061a.set(new r.b((r) this.f37061a.get()).g(cVar).e());
    }

    public synchronized void g(j jVar) {
        this.f37061a.set(new r.b((r) this.f37061a.get()).h(jVar).e());
    }

    public synchronized void h(k kVar) {
        this.f37061a.set(new r.b((r) this.f37061a.get()).i(kVar).e());
    }
}
