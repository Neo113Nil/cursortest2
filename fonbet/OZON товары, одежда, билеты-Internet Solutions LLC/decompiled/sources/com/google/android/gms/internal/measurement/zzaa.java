package com.google.android.gms.internal.measurement;

import E0.C2942q;
import g.C6594f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzaa {
    private String zza;
    private final long zzb;
    private final Map zzc;

    public zzaa(String str, long j11, Map map) {
        this.zza = str;
        this.zzb = j11;
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.zzb == zzaaVar.zzb && this.zza.equals(zzaaVar.zza)) {
            return this.zzc.equals(zzaaVar.zzc);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        long j11 = this.zzb;
        return this.zzc.hashCode() + (((hashCode * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.zza;
        return C6594f.a(", params=", this.zzc.toString(), "}", C2942q.d(this.zzb, "Event{name='", str, "', timestamp="));
    }

    public final long zza() {
        return this.zzb;
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.zza, this.zzb, new HashMap(this.zzc));
    }

    public final Object zzc(String str) {
        if (this.zzc.containsKey(str)) {
            return this.zzc.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.zza;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(String str) {
        this.zza = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, obj);
        }
    }
}
