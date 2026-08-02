package com.google.android.gms.internal.ads;

import com.ironsource.C2399e8;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzcgl implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcgp zzb;

    zzcgl(zzcgp zzcgpVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzcgpVar);
        this.zzb = zzcgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{C2399e8.k, String.valueOf(this.zza)});
    }
}
