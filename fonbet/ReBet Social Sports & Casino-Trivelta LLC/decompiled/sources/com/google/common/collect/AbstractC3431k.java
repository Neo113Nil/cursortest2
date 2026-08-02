package com.google.common.collect;

/* renamed from: com.google.common.collect.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3431k {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void c(boolean z10) {
        Ra.n.q(z10, "no calls to next() since the last call to remove()");
    }
}
