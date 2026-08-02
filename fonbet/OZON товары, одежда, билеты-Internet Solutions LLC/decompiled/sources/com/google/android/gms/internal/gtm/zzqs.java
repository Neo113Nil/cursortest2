package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzqs {
    private static final String zza = new String("");
    private static final Integer zzb = 0;
    private final int zzc;
    private final Object zzd;
    private final List<Integer> zze;

    /* synthetic */ zzqs(Integer num, Object obj, List list, boolean z11, zzqr zzqrVar) {
        this.zzc = num.intValue();
        this.zzd = obj;
        this.zze = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzqs) && ((zzqs) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final String toString() {
        Object obj = this.zzd;
        if (obj != null) {
            return obj.toString();
        }
        zzhl.zza("Fail to convert a null object to string");
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    public final Object zzb() {
        return this.zzd;
    }

    public final List<Integer> zzc() {
        return this.zze;
    }
}
