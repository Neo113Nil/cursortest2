package com.google.android.gms.internal.tapandpay;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import xsna.ehz;
import xsna.qdg0;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzl extends x2o0.e<Status> {
    private final /* synthetic */ ehz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(zzm zzmVar, c cVar, ehz ehzVar) {
        super(cVar);
        this.zza = ehzVar;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* synthetic */ void doExecute(zzh zzhVar) throws RemoteException {
        ((zze) zzhVar.getService()).zza(new zzv(this, this.zza));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ qdg0 createFailedResult(Status status) {
        return status;
    }
}
