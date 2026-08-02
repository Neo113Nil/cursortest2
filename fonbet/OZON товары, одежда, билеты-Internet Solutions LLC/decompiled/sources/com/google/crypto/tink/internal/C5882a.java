package com.google.crypto.tink.internal;

import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;
import java.security.Security;

/* renamed from: com.google.crypto.tink.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5882a {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f59253a = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        String[] strArr = f59253a;
        for (int i11 = 0; i11 < 3; i11++) {
            Provider provider = Security.getProvider(strArr[i11]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
