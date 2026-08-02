package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements InterfaceC5884c {
    @Override // com.google.crypto.tink.internal.InterfaceC5884c
    public final He.g a(S7.q qVar, Integer num) {
        f8.G c11 = ((C5892k) qVar).b().c();
        S7.f<?> c12 = C5885d.d().c(c11.J());
        if (!C5885d.d().f(c11.J())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        f8.E b11 = c12.b(c11.K());
        return new C5891j(F.a(b11.J(), b11.K(), b11.I(), c11.I(), num), S7.e.a());
    }
}
