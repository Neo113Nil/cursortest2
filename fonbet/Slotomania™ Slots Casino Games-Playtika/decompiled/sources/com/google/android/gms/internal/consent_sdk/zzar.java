package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes6.dex */
public final class zzar implements zzth {
    private final zztk zza;

    private zzar(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzar zza(zztk zztkVar) {
        return new zzar(zztkVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzaq((Application) this.zza.zzb());
    }
}
