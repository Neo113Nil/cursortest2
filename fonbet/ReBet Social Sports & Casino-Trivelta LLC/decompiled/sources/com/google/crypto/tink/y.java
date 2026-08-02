package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f37515a = new y();

    public static y a() {
        return f37515a;
    }

    public static y b(y yVar) {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
