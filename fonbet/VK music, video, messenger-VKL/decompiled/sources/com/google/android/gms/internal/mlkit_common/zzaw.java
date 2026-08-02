package com.google.android.gms.internal.mlkit_common;

import xsna.lhg;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzaw {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(lhg.a(i2, "at index "));
            }
        }
        return objArr;
    }
}
