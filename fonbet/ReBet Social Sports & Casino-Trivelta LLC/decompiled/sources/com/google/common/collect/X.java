package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class X {
    public static Object[] a(Object[] objArr, int i10, int i11, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i10, i11, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i10) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i10);
    }

    public static Map c(int i10) {
        return C3433m.w(i10);
    }

    public static Map d() {
        return C3433m.r();
    }
}
