package com.google.android.gms.internal.gtm;

import I0.C3173b;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzqj {
    private final Map<String, zzqs> zza;
    private final zzqs zzb;

    /* synthetic */ zzqj(Map map, zzqs zzqsVar, zzqi zzqiVar) {
        this.zza = Collections.unmodifiableMap(map);
        this.zzb = zzqsVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return C3173b.c(new StringBuilder(valueOf.length() + 32 + valueOf2.length()), "Properties: ", valueOf, " pushAfterEvaluate: ", valueOf2);
    }

    public final Map<String, zzqs> zza() {
        return this.zza;
    }
}
