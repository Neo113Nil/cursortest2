package com.google.android.gms.internal.common;

import Ej.b;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes9.dex */
public final class zzah {
    static Object[] zza(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException(b.a(i12, "at index "));
            }
        }
        return objArr;
    }
}
