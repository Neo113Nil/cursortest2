package com.ironsource;

import java.lang.Thread;

/* renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2520l4 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    C2520l4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C2538m4 c2538m4 = new C2538m4(th);
        if (c2538m4.d()) {
            new K5(c2538m4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }
}
