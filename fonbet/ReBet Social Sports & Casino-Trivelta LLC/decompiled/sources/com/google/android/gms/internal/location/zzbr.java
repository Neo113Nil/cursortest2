package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.GeofencingRequest;

/* loaded from: classes2.dex */
final class zzbr extends zzbu {
    final /* synthetic */ GeofencingRequest zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbr(zzbv zzbvVar, f fVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = geofencingRequest;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        ((zzda) bVar).zzq(this.zza, this.zzb, zzbv.zza(this));
    }
}
