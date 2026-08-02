package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.fhz;
import xsna.vxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzan extends zzat {
    final /* synthetic */ vxz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzau zzauVar, c cVar, vxz vxzVar) {
        super(cVar);
        this.zza = vxzVar;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzda) bVar).zzC(fhz.c(this.zza, vxz.class.getSimpleName()), true, zzau.zza(this));
    }
}
