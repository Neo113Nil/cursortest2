package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;
import xsna.ehz;
import xsna.kxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcu implements ehz.b {
    final /* synthetic */ LocationAvailability zza;

    public zzcu(zzcw zzcwVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // xsna.ehz.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((kxz) obj).onLocationAvailability(this.zza);
    }

    @Override // xsna.ehz.b
    public final void onNotifyListenerFailed() {
    }
}
