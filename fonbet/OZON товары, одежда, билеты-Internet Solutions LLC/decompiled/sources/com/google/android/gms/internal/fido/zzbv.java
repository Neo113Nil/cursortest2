package com.google.android.gms.internal.fido;

import B0.A0;

/* loaded from: classes9.dex */
final class zzbv {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(A0.b("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
