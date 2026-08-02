package com.google.android.gms.internal.tapandpay;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import xsna.qdg0;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzp extends x2o0.e<x2o0.d> {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzm zzmVar, c cVar, int i, String str) {
        super(cVar);
        this.zza = i;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ qdg0 createFailedResult(Status status) {
        return new zzac(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* synthetic */ void doExecute(zzh zzhVar) throws RemoteException {
        ((zze) zzhVar.getService()).zza(this.zza, this.zzb, new zzag(this));
    }
}
