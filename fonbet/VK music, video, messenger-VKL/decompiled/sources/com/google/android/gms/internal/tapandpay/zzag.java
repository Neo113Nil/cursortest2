package com.google.android.gms.internal.tapandpay;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import xsna.ue6;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzag extends zzk {
    private final ue6<x2o0.d> zza;

    public zzag(ue6<x2o0.d> ue6Var) {
        this.zza = ue6Var;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzk, com.google.android.gms.internal.tapandpay.zzf
    public final void zza(Status status, TokenStatus tokenStatus) throws RemoteException {
        this.zza.setResult(new zzac(status, tokenStatus));
    }
}
