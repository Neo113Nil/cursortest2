package com.google.common.collect;

import C.C2702w;
import Ve.C4598rp;

/* renamed from: com.google.common.collect.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5866j {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(U7.m.b(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(C2702w.c(obj, "null value in entry: ", "=null"));
        }
    }

    static void b(int i11, String str) {
        if (i11 < 0) {
            throw new IllegalArgumentException(C4598rp.c(i11, str, " cannot be negative but was: "));
        }
    }
}
