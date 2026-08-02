package com.google.common.collect;

/* loaded from: classes.dex */
public final class S {
    static void a(int i11, Object[] objArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException(Ej.b.a(i12, "at index "));
            }
        }
    }
}
