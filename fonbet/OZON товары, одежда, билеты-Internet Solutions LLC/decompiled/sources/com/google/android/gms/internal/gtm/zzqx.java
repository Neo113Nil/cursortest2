package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzqx extends zzqw<Boolean> {
    private static final Map<String, zzjt> zzb;
    private final Boolean zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzlu.zza);
        hashMap.put("toString", new zzmw());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzqx(Boolean bool) {
        Preconditions.checkNotNull(bool);
        this.zzc = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzqx) && ((zzqx) obj).zzc == this.zzc;
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
        throw new IllegalStateException(C6594f.a("Native Method ", str, " is not defined for type BooleanWrapper.", new StringBuilder(String.valueOf(str).length() + 54)));
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final /* bridge */ /* synthetic */ Boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Boolean zzi() {
        return this.zzc;
    }
}
