package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzfun implements Runnable {
    final /* synthetic */ zzfuo zza;

    zzfun(zzfuo zzfuoVar) {
        Objects.requireNonNull(zzfuoVar);
        this.zza = zzfuoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfuo zzfuoVar = this.zza;
        AtomicBoolean zzf = zzfuoVar.zzf();
        float zzc = zzfuoVar.zzc();
        zzf.set(false);
        if (((Float) zzfuoVar.zze().getAndSet(Float.valueOf(zzc))).floatValue() != zzc) {
            zzfuoVar.zzd().post(new zzfum(this, zzc));
        }
    }
}
