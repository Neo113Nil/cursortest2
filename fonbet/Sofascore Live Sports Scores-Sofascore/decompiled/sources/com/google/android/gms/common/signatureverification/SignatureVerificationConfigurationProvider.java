package com.google.android.gms.common.signatureverification;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class SignatureVerificationConfigurationProvider {
    static {
        synchronized (zzd.class) {
            if (zzd.a == null) {
                zzb zzbVar = new zzb();
                synchronized (zzd.class) {
                    if (zzd.a != null) {
                        throw new IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
                    }
                    zzd.a = zzbVar;
                }
            }
        }
    }

    private SignatureVerificationConfigurationProvider() {
    }
}
