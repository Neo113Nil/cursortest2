package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzcgd implements Runnable {
    final /* synthetic */ zzcgf zza;

    zzcgd(zzcgf zzcgfVar) {
        Objects.requireNonNull(zzcgfVar);
        this.zza = zzcgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgf zzcgfVar = this.zza;
        if (zzcgfVar.zzt() != null) {
            zzcgfVar.zzt().zzd();
        }
    }
}
