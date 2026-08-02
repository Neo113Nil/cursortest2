package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, w9.InterfaceC6729d
    public final void zzc(boolean z10) {
        this.zza.setResult((zzag) new zzak(z10 ? Status.f32275f : zzal.zza));
    }
}
