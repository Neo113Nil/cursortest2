package com.ironsource;

import java.lang.Thread;

/* renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4416l4 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    public C4416l4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C4434m4 c4434m4 = new C4434m4(th);
        if (c4434m4.d()) {
            new K5(c4434m4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }
}
