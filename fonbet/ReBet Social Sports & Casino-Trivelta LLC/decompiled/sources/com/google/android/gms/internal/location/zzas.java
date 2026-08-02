package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3140l;

/* loaded from: classes2.dex */
final class zzas implements zzcs {
    private C3140l zza;

    public zzas(C3140l c3140l) {
        this.zza = c3140l;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized C3140l zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(C3140l c3140l) {
        C3140l c3140l2 = this.zza;
        if (c3140l2 != c3140l) {
            c3140l2.a();
            this.zza = c3140l;
        }
    }
}
