package com.ironsource;

import java.lang.Thread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4122i4 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    public C4122i4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C4139j4 c4139j4 = new C4139j4(th);
        if (c4139j4.d()) {
            new I5(c4139j4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }
}
