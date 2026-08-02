package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzbbk implements Runnable {
    final /* synthetic */ zzbbl zza;

    zzbbk(zzbbl zzbblVar) {
        Objects.requireNonNull(zzbblVar);
        this.zza = zzbblVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbie.zza(this.zza.zza);
    }
}
