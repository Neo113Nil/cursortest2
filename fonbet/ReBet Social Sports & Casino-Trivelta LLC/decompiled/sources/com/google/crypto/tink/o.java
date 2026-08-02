package com.google.crypto.tink;

import com.google.crypto.tink.proto.A;
import com.google.crypto.tink.proto.C;
import com.google.crypto.tink.proto.I;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final C.b f37185a;

    public o(C.b bVar) {
        this.f37185a = bVar;
    }

    public static o i() {
        return new o(C.X());
    }

    public static o j(n nVar) {
        return new o((C.b) nVar.h().N());
    }

    public synchronized o a(l lVar) {
        b(lVar.b(), false);
        return this;
    }

    public synchronized int b(A a10, boolean z10) {
        C.c f10;
        try {
            f10 = f(a10);
            this.f37185a.l(f10);
            if (z10) {
                this.f37185a.p(f10.U());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f10.U();
    }

    public final synchronized C.c c(com.google.crypto.tink.proto.y yVar, I i10) {
        int g10;
        g10 = g();
        if (i10 == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C.c) C.c.Y().l(yVar).m(g10).o(com.google.crypto.tink.proto.z.ENABLED).n(i10).c();
    }

    public synchronized n d() {
        return n.e((C) this.f37185a.c());
    }

    public final synchronized boolean e(int i10) {
        Iterator it = this.f37185a.o().iterator();
        while (it.hasNext()) {
            if (((C.c) it.next()).U() == i10) {
                return true;
            }
        }
        return false;
    }

    public final synchronized C.c f(A a10) {
        return c(x.k(a10), a10.T());
    }

    public final synchronized int g() {
        int c10;
        c10 = com.google.crypto.tink.internal.t.c();
        while (e(c10)) {
            c10 = com.google.crypto.tink.internal.t.c();
        }
        return c10;
    }

    public synchronized o h(int i10) {
        for (int i11 = 0; i11 < this.f37185a.n(); i11++) {
            C.c m10 = this.f37185a.m(i11);
            if (m10.U() == i10) {
                if (!m10.W().equals(com.google.crypto.tink.proto.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.f37185a.p(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
