package com.google.android.gms.internal.common;

import xsna.z23;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(z23.b(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
            }
        }
        return objArr;
    }
}
