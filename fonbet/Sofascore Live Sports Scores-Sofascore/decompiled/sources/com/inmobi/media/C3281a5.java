package com.inmobi.media;

import java.lang.Thread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3281a5 extends B5 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3281a5(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C5 c5) {
        super(c5);
        c5.getClass();
        this.b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.B5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.B5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        thread.getClass();
        th.getClass();
        this.a.a(new C3307b5(thread, th));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
