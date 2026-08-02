package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzre extends zzqw<Map<String, zzqw<?>>> {
    private static final Map<String, zzjt> zzb;
    private boolean zzc = false;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzlu.zza);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzre(Map<String, zzqw<?>> map) {
        this.zza = (Map) Preconditions.checkNotNull(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzre) {
            return this.zza.entrySet().equals(((zzre) obj).zza.entrySet());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    /* renamed from: toString */
    public final String zzc() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final zzjt zza(String str) {
        if (zzg(str)) {
            return zzb.get(str);
        }
        throw new IllegalStateException(C6594f.a("Native Method ", str, " is not defined for type ListWrapper.", new StringBuilder(String.valueOf(str).length() + 51)));
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final zzqw<?> zzb(String str) {
        zzqw<?> zzb2 = super.zzb(str);
        return zzb2 == null ? zzra.zze : zzb2;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final /* bridge */ /* synthetic */ Map<String, zzqw<?>> zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final Iterator<zzqw<?>> zze() {
        return zzd();
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Map<String, zzqw<?>> zzi() {
        return this.zza;
    }

    public final void zzj() {
        this.zzc = true;
    }

    public final boolean zzk() {
        return this.zzc;
    }
}
