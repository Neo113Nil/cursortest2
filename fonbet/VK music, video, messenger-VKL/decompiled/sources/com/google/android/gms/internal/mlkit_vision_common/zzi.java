package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Objects;
import xsna.so;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes12.dex */
final class zzi {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(so.a(obj, "null value in entry: ", "=null"));
        }
    }
}
