package com.google.android.gms.internal.gtm;

import g.C6594f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class zzqw<T> {
    protected Map<String, zzqw<?>> zza;

    public abstract String toString();

    public zzjt zza(String str) {
        throw new IllegalStateException(C6594f.a("Attempting to access Native Method ", str, " on unsupported type.", new StringBuilder(String.valueOf(str).length() + 56)));
    }

    public zzqw<?> zzb(String str) {
        Map<String, zzqw<?>> map = this.zza;
        return map != null ? map.get(str) : zzra.zze;
    }

    public abstract T zzc();

    protected final Iterator<zzqw<?>> zzd() {
        Map<String, zzqw<?>> map = this.zza;
        return map == null ? new zzqv(null) : new zzqt(this, map.keySet().iterator());
    }

    public Iterator<zzqw<?>> zze() {
        return new zzqv(null);
    }

    public final void zzf(String str, zzqw<?> zzqwVar) {
        if (this.zza == null) {
            this.zza = new HashMap();
        }
        this.zza.put(str, zzqwVar);
    }

    public boolean zzg(String str) {
        return false;
    }

    public final boolean zzh(String str) {
        Map<String, zzqw<?>> map = this.zza;
        return map != null && map.containsKey(str);
    }
}
