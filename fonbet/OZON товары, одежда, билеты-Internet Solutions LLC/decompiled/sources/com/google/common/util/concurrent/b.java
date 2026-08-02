package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ boolean a(Unsafe unsafe, a aVar, long j11, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(aVar, j11, obj, obj2)) {
            if (unsafe.getObject(aVar, j11) != obj) {
                return false;
            }
        }
        return true;
    }
}
