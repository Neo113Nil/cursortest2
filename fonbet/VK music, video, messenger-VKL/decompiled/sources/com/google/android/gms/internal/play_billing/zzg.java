package com.google.android.gms.internal.play_billing;

import androidx.annotation.Nullable;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes12.dex */
final class zzg {
    static final zzg zza;
    static final zzg zzb;

    @Nullable
    final Throwable zzc;

    static {
        if (zzq.zza) {
            zzb = null;
            zza = null;
        } else {
            zzb = new zzg(false, null);
            zza = new zzg(true, null);
        }
    }

    public zzg(boolean z, @Nullable Throwable th) {
        this.zzc = th;
    }
}
