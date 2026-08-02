package com.google.android.gms.internal.tapandpay;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzae extends zzk {
    private final ue6<Object> zza;

    public zzae(ue6<Object> ue6Var) {
        this.zza = ue6Var;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzk, com.google.android.gms.internal.tapandpay.zzf
    public final void zze(Status status, String str) throws RemoteException {
        this.zza.setResult(new zzaa(str, status));
    }
}
