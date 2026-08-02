package com.masteratul.exceptionhandler;

import java.lang.Thread;

/* loaded from: classes8.dex */
public interface NativeExceptionHandlerIfc {
    void handleNativeException(Thread thread, Throwable th, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
