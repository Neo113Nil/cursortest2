package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import java.util.Collections;
import xsna.puz0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzcx extends zzk {
    final /* synthetic */ StartBleScanRequest zza;
    final /* synthetic */ puz0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdf zzdfVar, c cVar, StartBleScanRequest startBleScanRequest, puz0 puz0Var) {
        super(cVar);
        this.zza = startBleScanRequest;
        this.zzb = puz0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void doExecute(a.b bVar) throws RemoteException {
        zzfb zzfbVar = new zzfb(this);
        zzcd zzcdVar = (zzcd) ((zzm) bVar).getService();
        StartBleScanRequest startBleScanRequest = this.zza;
        zzcdVar.zzf(new StartBleScanRequest(Collections.unmodifiableList(startBleScanRequest.b), this.zzb, startBleScanRequest.d, zzfbVar));
    }
}
