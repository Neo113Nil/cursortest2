package com.google.android.gms.internal.fido;

import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
final class zzbv {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(zr.a("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
