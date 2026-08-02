package com.google.android.gms.internal.gtm;

import I0.C3173b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzqg {
    private final List<zzqm> zza;
    private final Map<String, zzqj> zzb;
    private final String zzc;

    public zzqg(List<zzqm> list, Map<String, zzqj> map, String str, int i11) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableMap(map);
        this.zzc = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return C3173b.c(new StringBuilder(valueOf.length() + 18 + valueOf2.length()), "Rules: ", valueOf, "\n  Macros: ", valueOf2);
    }

    public final zzqj zza(String str) {
        return this.zzb.get(str);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final List<zzqm> zzc() {
        return this.zza;
    }
}
