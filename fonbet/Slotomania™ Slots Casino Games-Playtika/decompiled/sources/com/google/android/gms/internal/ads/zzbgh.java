package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzbgh implements Runnable {
    final /* synthetic */ zzbgl zza;

    zzbgh(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
        this.zza = zzbglVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
