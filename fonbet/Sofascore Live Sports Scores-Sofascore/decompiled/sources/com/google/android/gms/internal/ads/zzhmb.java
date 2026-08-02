package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhmb {
    public static final String[] a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(a[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
