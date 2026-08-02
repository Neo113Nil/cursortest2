package com.logrocket.core;

import java.lang.Thread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f6626e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static n f6627f;

    /* renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f6629b;

    /* renamed from: c, reason: collision with root package name */
    public com.android.billingclient.api.i f6630c;

    /* renamed from: a, reason: collision with root package name */
    public final ba.d f6628a = new ba.d("exception-handler");

    /* renamed from: d, reason: collision with root package name */
    public Boolean f6631d = Boolean.FALSE;

    public n(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6629b = uncaughtExceptionHandler;
    }

    public static void a() {
        synchronized (f6626e) {
            try {
                if (f6627f == null) {
                    n nVar = new n(Thread.getDefaultUncaughtExceptionHandler());
                    f6627f = nVar;
                    Thread.setDefaultUncaughtExceptionHandler(nVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        if (this.f6631d.booleanValue()) {
            PostInitializationTasks.run(new o(0, th2));
        }
        try {
            com.android.billingclient.api.i iVar = this.f6630c;
            if (iVar != null && iVar.f4027a) {
                try {
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    newSingleThreadExecutor.submit(new androidx.appcompat.app.t(8, iVar, th2)).get();
                    newSingleThreadExecutor.shutdown();
                } catch (InterruptedException | RuntimeException | ExecutionException e7) {
                    ((ba.d) iVar.f4030d).f("Error while uploading pending crash reports", e7.getCause());
                }
            }
        } catch (Exception e9) {
            this.f6628a.e("Error while trying to send crash report", e9);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6629b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
