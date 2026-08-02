package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzac implements x2o0.d {
    private final Status zza;
    private final TokenStatus zzb;

    public zzac(Status status, TokenStatus tokenStatus) {
        this.zza = status;
        this.zzb = tokenStatus;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }

    @Override // xsna.x2o0.d
    public final TokenStatus getTokenStatus() {
        return this.zzb;
    }
}
