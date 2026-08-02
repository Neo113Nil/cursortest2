package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzcgk implements Runnable {
    final /* synthetic */ zzcgp zza;

    zzcgk(zzcgp zzcgpVar) {
        Objects.requireNonNull(zzcgpVar);
        this.zza = zzcgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
