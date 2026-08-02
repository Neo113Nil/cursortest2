package com.google.android.gms.internal.location;

import V9.InterfaceC1756l;
import android.location.Location;
import com.google.android.gms.common.api.internal.C3140l;

/* loaded from: classes2.dex */
final class zzcx implements C3140l.b {
    final /* synthetic */ Location zza;

    public zzcx(zzcz zzczVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((InterfaceC1756l) obj).onLocationChanged(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final void onNotifyListenerFailed() {
    }
}
