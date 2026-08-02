package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdi extends zzs {
    public zzdi(zzdl zzdlVar, c cVar) {
        super(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzce) ((zzu) bVar).getService()).zze(new com.google.android.gms.fitness.request.zzv((zzcw) new zzfb(this)));
    }
}
