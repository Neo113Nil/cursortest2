package com.google.android.gms.internal.cast;

import xsna.tdj;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzhm {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        throw new NullPointerException(tdj.a(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
    }
}
