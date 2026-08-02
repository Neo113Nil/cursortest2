package com.google.android.gms.internal.location;

import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcy implements ehz.b {
    final /* synthetic */ zzcz zza;

    public zzcy(zzcz zzczVar) {
        this.zza = zzczVar;
    }

    @Override // xsna.ehz.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzcs zzcsVar;
        zzcsVar = this.zza.zza;
        zzcsVar.zzb();
    }

    @Override // xsna.ehz.b
    public final void onNotifyListenerFailed() {
    }
}
