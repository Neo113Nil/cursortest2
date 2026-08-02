package com.google.android.gms.internal.location;

import android.location.Location;
import xsna.ehz;
import xsna.vxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcx implements ehz.b {
    final /* synthetic */ Location zza;

    public zzcx(zzcz zzczVar, Location location) {
        this.zza = location;
    }

    @Override // xsna.ehz.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((vxz) obj).a();
    }

    @Override // xsna.ehz.b
    public final void onNotifyListenerFailed() {
    }
}
