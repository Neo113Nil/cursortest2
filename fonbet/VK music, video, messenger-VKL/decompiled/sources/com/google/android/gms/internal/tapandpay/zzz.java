package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzz implements x2o0.c {
    private final Status zza;
    private final String zzb;

    public zzz(String str, Status status) {
        this.zzb = str;
        this.zza = status;
    }

    @Override // xsna.x2o0.c
    public final String getStableHardwareId() {
        return this.zzb;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }
}
