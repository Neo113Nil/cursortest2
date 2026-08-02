package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzrh extends zzqw<String> {
    private static final Map<String, zzjt> zzb;
    private final String zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("charAt", new zzmj());
        hashMap.put("concat", new zzmk());
        hashMap.put("hasOwnProperty", zzlu.zza);
        hashMap.put("indexOf", new zzml());
        hashMap.put("lastIndexOf", new zzmm());
        hashMap.put("match", new zzmn());
        hashMap.put("replace", new zzmo());
        hashMap.put("search", new zzmp());
        hashMap.put("slice", new zzmq());
        hashMap.put("split", new zzmr());
        hashMap.put("substring", new zzms());
        hashMap.put("toLocaleLowerCase", new zzmt());
        hashMap.put("toLocaleUpperCase", new zzmu());
        hashMap.put("toLowerCase", new zzmv());
        hashMap.put("toUpperCase", new zzmx());
        hashMap.put("toString", new zzmw());
        hashMap.put("trim", new zzmy());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzrh(String str) {
        Preconditions.checkNotNull(str);
        this.zzc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrh) {
            return this.zzc.equals(((zzrh) obj).zzc);
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
        throw new IllegalStateException(C6594f.a("Native Method ", str, " is not defined for type ListWrapper.", new StringBuilder(String.valueOf(str).length() + 51)));
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final /* bridge */ /* synthetic */ String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final Iterator<zzqw<?>> zze() {
        return new zzrg(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzqw<?> zzi(int i11) {
        return (i11 < 0 || i11 >= this.zzc.length()) ? zzra.zze : new zzrh(String.valueOf(this.zzc.charAt(i11)));
    }

    public final String zzk() {
        return this.zzc;
    }
}
