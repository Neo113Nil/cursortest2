package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzx implements x2o0.b {
    private final Status zza;
    private final String zzb;

    public zzx(Status status, String str) {
        this.zza = status;
        this.zzb = str;
    }

    @Override // xsna.x2o0.b
    public final String getActiveWalletId() {
        return this.zzb;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }
}
