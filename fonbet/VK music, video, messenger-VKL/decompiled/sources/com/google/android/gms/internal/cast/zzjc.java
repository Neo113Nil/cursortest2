package com.google.android.gms.internal.cast;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzjc {
    private static final zzjf zza = new zzja();
    private static final zzje zzb = new zzjb();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();

    public /* synthetic */ zzjc(zzjf zzjfVar, byte[] bArr) {
    }

    public final void zza(zzit zzitVar) {
        zzkm.zza(zzitVar, "key");
        if (!zzitVar.zzb()) {
            zzjf zzjfVar = zza;
            zzkm.zza(zzitVar, "key");
            this.zzd.remove(zzitVar);
            this.zzc.put(zzitVar, zzjfVar);
            return;
        }
        zzje zzjeVar = zzb;
        zzkm.zza(zzitVar, "key");
        if (!zzitVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzitVar);
        this.zzd.put(zzitVar, zzjeVar);
    }

    public final zzjg zzb() {
        return new zzjd(this, null);
    }

    public final /* synthetic */ Map zzc() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzd() {
        return this.zzd;
    }
}
