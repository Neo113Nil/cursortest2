package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import x8.AbstractC6803a;

@DoNotStrip
/* loaded from: classes2.dex */
public class ThreadScopeSupport {
    static {
        AbstractC6803a.d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j10) {
        runStdFunctionImpl(j10);
    }

    private static native void runStdFunctionImpl(long j10);
}
