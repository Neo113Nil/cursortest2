package com.google.android.gms.internal.cast;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzhc implements Serializable {
    public static zzhc zzb() {
        return zzha.zza;
    }

    public static zzhc zzc(Object obj) {
        return obj == null ? zzha.zza : new zzhe(obj);
    }

    public abstract Object zza(Object obj);
}
