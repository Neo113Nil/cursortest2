package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public final class MemoryPressureListener {

    /* renamed from: a, reason: collision with root package name */
    private static k<Im.a> f78516a;

    @CalledByNative
    private static void addNativeCallback() {
        Im.a aVar = new Im.a();
        if (f78516a == null) {
            f78516a = new k<>();
        }
        f78516a.c(aVar);
    }
}
