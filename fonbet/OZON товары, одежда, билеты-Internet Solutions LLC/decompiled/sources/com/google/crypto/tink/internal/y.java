package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.z;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class y extends z<S7.q, J> {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z.a f59300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(z.a aVar, Class cls) {
        super(cls);
        this.f59300c = aVar;
    }

    @Override // com.google.crypto.tink.internal.z
    public final J d(S7.q qVar) throws GeneralSecurityException {
        return this.f59300c.b(qVar);
    }
}
