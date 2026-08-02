package com.zoho.messenger.api;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import gg.C4379a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class WebSocketKeepAliveWorker extends Worker {

    /* renamed from: c, reason: collision with root package name */
    public final String f44580c;

    public WebSocketKeepAliveWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f44580c = "WMS";
    }

    public static /* synthetic */ void a(WebSocketKeepAliveWorker webSocketKeepAliveWorker, C4379a c4379a, CountDownLatch countDownLatch) {
        webSocketKeepAliveWorker.getClass();
        try {
            Thread.currentThread().getName();
            c4379a.K();
        } catch (Throwable th2) {
            try {
                Log.getStackTraceString(th2);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static /* synthetic */ void b(WebSocketKeepAliveWorker webSocketKeepAliveWorker, C4379a c4379a, CountDownLatch countDownLatch) {
        webSocketKeepAliveWorker.getClass();
        try {
            Thread.currentThread().getName();
            c4379a.I();
        } catch (Throwable th2) {
            try {
                Log.getStackTraceString(th2);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        String d10 = getInputData().d("connectionIdentifier");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            final C4379a e10 = b.e(d10);
            if (e10 == null) {
                return c.a.a();
            }
            newFixedThreadPool.submit(new Runnable() { // from class: com.zoho.messenger.api.c
                @Override // java.lang.Runnable
                public final void run() {
                    WebSocketKeepAliveWorker.a(WebSocketKeepAliveWorker.this, e10, countDownLatch);
                }
            });
            newFixedThreadPool.submit(new Runnable() { // from class: com.zoho.messenger.api.d
                @Override // java.lang.Runnable
                public final void run() {
                    WebSocketKeepAliveWorker.b(WebSocketKeepAliveWorker.this, e10, countDownLatch);
                }
            });
            countDownLatch.await();
            return c.a.c();
        } catch (Exception e11) {
            Log.e("WMS", "Worker failed", e11);
            return c.a.a();
        } finally {
            newFixedThreadPool.shutdown();
        }
    }
}
