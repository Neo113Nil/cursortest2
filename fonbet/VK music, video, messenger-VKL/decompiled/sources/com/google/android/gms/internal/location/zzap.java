package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.fhz;
import xsna.kxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzap extends zzat {
    final /* synthetic */ kxz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzau zzauVar, c cVar, kxz kxzVar) {
        super(cVar);
        this.zza = kxzVar;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzda) bVar).zzB(fhz.c(this.zza, kxz.class.getSimpleName()), true, zzau.zza(this));
    }
}
