package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbce implements Callable {
    private final zzbbl zza;
    private final zzaxf zzb;

    public zzbce(zzbbl zzbblVar, zzaxf zzaxfVar) {
        this.zza = zzbblVar;
        this.zzb = zzaxfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar.zzm() != null) {
            zzbblVar.zzm().get();
        }
        zzayf zzl = zzbblVar.zzl();
        if (zzl == null) {
            return null;
        }
        try {
            zzaxf zzaxfVar = this.zzb;
            synchronized (zzaxfVar) {
                zzaxfVar.zzaY(zzl.zzaN(), zzidb.zza());
            }
            return null;
        } catch (zzieg | NullPointerException unused) {
            return null;
        }
    }
}
