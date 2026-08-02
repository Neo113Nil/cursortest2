package com.google.android.gms.internal.mlkit_common;

import N3.C3660k;
import g.C6594f;

/* loaded from: classes9.dex */
final class zzag {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzag(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        return new IllegalArgumentException(C6594f.a(String.valueOf(obj3), "=", String.valueOf(obj), C3660k.d("Multiple entries with same key: ", String.valueOf(obj3), "=", String.valueOf(obj2), " and ")));
    }
}
