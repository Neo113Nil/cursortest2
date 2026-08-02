package org.chromium.base;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public abstract class PathService {
    public static final int DIR_MODULE = 3;

    interface Natives {
        void override(int what, String path);
    }

    private PathService() {
    }

    public static void override(int what, String path) {
        PathServiceJni.get().override(what, path);
    }
}
