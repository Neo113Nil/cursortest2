package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzqf {
    private final List<zzqm> zza = new ArrayList();
    private final Map<String, zzqj> zzb = new HashMap();
    private String zzc = "";

    public final zzqf zza(zzqj zzqjVar) {
        this.zzb.put(zzqjVar.zza().get("instance_name").toString(), zzqjVar);
        return this;
    }

    public final zzqf zzb(zzqm zzqmVar) {
        this.zza.add(zzqmVar);
        return this;
    }

    public final zzqf zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzqg zzd() {
        return new zzqg(this.zza, this.zzb, this.zzc, 0);
    }
}
