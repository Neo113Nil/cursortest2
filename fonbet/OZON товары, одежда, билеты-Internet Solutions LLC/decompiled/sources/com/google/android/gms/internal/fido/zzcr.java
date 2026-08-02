package com.google.android.gms.internal.fido;

import Ej.b;

/* loaded from: classes9.dex */
public final class zzcr {
    static Object zza(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(b.a(i11, "at index "));
    }

    static Object[] zzb(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            zza(objArr[i12], i12);
        }
        return objArr;
    }
}
