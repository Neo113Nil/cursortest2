package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
final class zzam extends zzat {
    final /* synthetic */ PendingIntent zza;
    final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzau zzauVar, f fVar, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(fVar);
        this.zza = pendingIntent;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        ((zzda) bVar).zzw(this.zza, this.zzb, zzau.zza(this));
    }
}
