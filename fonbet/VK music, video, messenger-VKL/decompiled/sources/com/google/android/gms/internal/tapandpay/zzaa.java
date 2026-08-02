package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzaa implements qdg0 {
    private final Status zza;
    private final String zzb;

    public zzaa(String str, Status status) {
        this.zzb = str;
        this.zza = status;
    }

    public final String getEnvironment() {
        return this.zzb;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }
}
