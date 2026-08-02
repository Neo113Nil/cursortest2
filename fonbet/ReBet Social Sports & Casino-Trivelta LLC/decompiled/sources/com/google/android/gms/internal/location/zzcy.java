package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3140l;

/* loaded from: classes2.dex */
final class zzcy implements C3140l.b {
    final /* synthetic */ zzcz zza;

    public zzcy(zzcz zzczVar) {
        this.zza = zzczVar;
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzcs zzcsVar;
        zzcsVar = this.zza.zza;
        zzcsVar.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.C3140l.b
    public final void onNotifyListenerFailed() {
    }
}
