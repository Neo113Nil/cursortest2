package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;
import java.security.Security;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhkl {
    private static final String[] zza = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"};

    @Nullable
    public static Provider zza() {
        String[] strArr = zza;
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
