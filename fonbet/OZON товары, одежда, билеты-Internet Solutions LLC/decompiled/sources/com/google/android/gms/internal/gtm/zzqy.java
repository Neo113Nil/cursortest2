package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzqy extends zzqw<Double> {
    private static final Map<String, zzjt> zzb;
    private final Double zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzlu.zza);
        hashMap.put("toString", new zzmw());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzqy(Double d11) {
        Preconditions.checkNotNull(d11);
        this.zzc = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqy) {
            return this.zzc.equals(((zzqy) obj).zzc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    /* renamed from: toString */
    public final String zzc() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final zzjt zza(String str) {
        if (zzg(str)) {
            return zzb.get(str);
        }
        throw new IllegalStateException(C6594f.a("Native Method ", str, " is not defined for type DoubleWrapper.", new StringBuilder(String.valueOf(str).length() + 53)));
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final /* bridge */ /* synthetic */ Double zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Double zzi() {
        return this.zzc;
    }
}
