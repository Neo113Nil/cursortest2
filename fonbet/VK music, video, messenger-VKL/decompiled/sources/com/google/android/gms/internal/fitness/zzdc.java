package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.result.BleDevicesResult;
import java.util.Collections;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdc extends zzh {
    public zzdc(zzdf zzdfVar, c cVar) {
        super(cVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final qdg0 createFailedResult(Status status) {
        return new BleDevicesResult(Collections.EMPTY_LIST, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcd) ((zzm) bVar).getService()).zze(new com.google.android.gms.fitness.request.zzac((zzff) new zzde(this, null)));
    }
}
