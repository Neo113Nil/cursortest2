package com.zoho.salesiqembed.android.tracking;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class VTSWebSocketKeepAliveWorker extends Worker {
    private final String TAG;

    public VTSWebSocketKeepAliveWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.TAG = "Mobilisten";
    }

    public static /* synthetic */ void a(VTSWebSocketKeepAliveWorker vTSWebSocketKeepAliveWorker, UTS uts, CountDownLatch countDownLatch) {
        vTSWebSocketKeepAliveWorker.getClass();
        try {
            Thread.currentThread().getName();
            uts.startSyncing();
        } catch (Throwable th2) {
            try {
                Log.getStackTraceString(th2);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static /* synthetic */ void b(VTSWebSocketKeepAliveWorker vTSWebSocketKeepAliveWorker, UTS uts, CountDownLatch countDownLatch) {
        vTSWebSocketKeepAliveWorker.getClass();
        try {
            Thread.currentThread().getName();
            uts.startListeningCallbacks();
        } catch (Throwable th2) {
            try {
                Log.getStackTraceString(th2);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    @Override // androidx.work.Worker
    @NonNull
    public c.a doWork() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final UTS uts = UTS.getInstance();
        try {
            newFixedThreadPool.submit(new Runnable() { // from class: com.zoho.salesiqembed.android.tracking.k
                @Override // java.lang.Runnable
                public final void run() {
                    VTSWebSocketKeepAliveWorker.a(VTSWebSocketKeepAliveWorker.this, uts, countDownLatch);
                }
            });
            newFixedThreadPool.submit(new Runnable() { // from class: com.zoho.salesiqembed.android.tracking.l
                @Override // java.lang.Runnable
                public final void run() {
                    VTSWebSocketKeepAliveWorker.b(VTSWebSocketKeepAliveWorker.this, uts, countDownLatch);
                }
            });
            countDownLatch.await();
            return c.a.c();
        } catch (Exception e10) {
            Log.e("Mobilisten", "Worker failed", e10);
            return c.a.a();
        } finally {
            newFixedThreadPool.shutdown();
        }
    }
}
