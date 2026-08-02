package com.google.android.gms.internal.mlkit_vision_common;

import Ej.b;

/* loaded from: classes.dex */
public final class zzt {
    static Object[] zza(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException(b.a(i12, "at index "));
            }
        }
        return objArr;
    }
}
