package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.LocationRequest;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzak extends zzat {
    final /* synthetic */ ehz zza;
    final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzau zzauVar, c cVar, ehz ehzVar, LocationRequest locationRequest) {
        super(cVar);
        this.zza = ehzVar;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzda) bVar).zzv(new zzas(this.zza), this.zzb, zzau.zza(this));
    }
}
