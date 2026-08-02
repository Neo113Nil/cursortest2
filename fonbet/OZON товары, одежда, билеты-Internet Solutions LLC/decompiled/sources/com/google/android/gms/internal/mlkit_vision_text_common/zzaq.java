package com.google.android.gms.internal.mlkit_vision_text_common;

import B0.A0;
import Ve.C4598rp;

/* loaded from: classes9.dex */
final class zzaq {
    static int zza(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(C4598rp.c(i11, str, " cannot be negative but was: "));
    }

    static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(A0.b("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
