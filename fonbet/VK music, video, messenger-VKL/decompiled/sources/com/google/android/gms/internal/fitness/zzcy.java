package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.puz0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzcy extends zzk {
    final /* synthetic */ puz0 zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzdf zzdfVar, c cVar, puz0 puz0Var) {
        super(cVar);
        this.zza = puz0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcd) ((zzm) bVar).getService()).zzg(new com.google.android.gms.fitness.request.zzbc(this.zza, new zzfb(this)));
    }
}
