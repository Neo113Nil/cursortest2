package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationResult;
import xsna.ehz;
import xsna.kxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzct implements ehz.b {
    final /* synthetic */ LocationResult zza;

    public zzct(zzcw zzcwVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // xsna.ehz.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((kxz) obj).onLocationResult(this.zza);
    }

    @Override // xsna.ehz.b
    public final void onNotifyListenerFailed() {
    }
}
