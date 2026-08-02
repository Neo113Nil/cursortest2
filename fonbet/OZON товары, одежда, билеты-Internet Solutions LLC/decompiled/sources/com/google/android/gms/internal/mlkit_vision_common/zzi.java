package com.google.android.gms.internal.mlkit_vision_common;

import C.C2702w;
import java.util.Objects;

/* loaded from: classes9.dex */
final class zzi {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(C2702w.c(obj, "null value in entry: ", "=null"));
        }
    }
}
