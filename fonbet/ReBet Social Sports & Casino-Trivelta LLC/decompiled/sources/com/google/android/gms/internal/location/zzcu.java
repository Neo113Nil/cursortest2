package com.google.android.gms.internal.location;

import V9.AbstractC1755k;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes2.dex */
final class zzcu implements C3140l.b {
    final /* synthetic */ LocationAvailability zza;

    public zzcu(zzcw zzcwVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((AbstractC1755k) obj).onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final void onNotifyListenerFailed() {
    }
}
