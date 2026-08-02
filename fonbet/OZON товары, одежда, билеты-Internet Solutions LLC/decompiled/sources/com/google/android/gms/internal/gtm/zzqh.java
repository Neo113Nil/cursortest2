package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzqh {
    private final Map<String, zzqs> zza = new HashMap();
    private zzqs zzb;

    public final zzqh zza(String str, zzqs zzqsVar) {
        this.zza.put(str, zzqsVar);
        return this;
    }

    public final zzqh zzb(zzqs zzqsVar) {
        this.zzb = zzqsVar;
        return this;
    }

    public final zzqj zzc() {
        return new zzqj(this.zza, this.zzb, null);
    }
}
