package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.Session;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzeo extends zzbl {
    final /* synthetic */ Session zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzey zzeyVar, c cVar, Session session) {
        super(cVar);
        this.zza = session;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzck) ((zzbn) bVar).getService()).zzg(new com.google.android.gms.fitness.request.zzau(this.zza, (zzcw) new zzfb(this)));
    }
}
