package com.google.android.gms.internal.location;

import V9.AbstractC1755k;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
final class zzct implements C3140l.b {
    final /* synthetic */ LocationResult zza;

    public zzct(zzcw zzcwVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((AbstractC1755k) obj).onLocationResult(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final void onNotifyListenerFailed() {
    }
}
