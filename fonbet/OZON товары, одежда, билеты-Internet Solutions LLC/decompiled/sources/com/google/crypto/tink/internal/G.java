package com.google.crypto.tink.internal;

import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class G implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C7306a f59234a;

    /* renamed from: b, reason: collision with root package name */
    private final f8.G f59235b;

    private G(f8.G g10, C7306a c7306a) {
        this.f59235b = g10;
        this.f59234a = c7306a;
    }

    public static G a(f8.G g10) throws GeneralSecurityException {
        return new G(g10, M.a(g10.J()));
    }

    public static G b(f8.G g10) {
        return new G(g10, M.c(g10.J()));
    }

    public final f8.G c() {
        return this.f59235b;
    }

    public final C7306a d() {
        return this.f59234a;
    }
}
