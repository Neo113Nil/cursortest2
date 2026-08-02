package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;

/* loaded from: classes2.dex */
final class zzar extends zzat {
    final /* synthetic */ Location zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzau zzauVar, f fVar, Location location) {
        super(fVar);
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        ((zzda) bVar).zzz(this.zza, zzau.zza(this));
    }
}
