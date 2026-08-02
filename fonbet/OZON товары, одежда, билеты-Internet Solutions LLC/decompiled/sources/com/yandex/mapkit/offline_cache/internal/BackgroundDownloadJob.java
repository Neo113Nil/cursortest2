package com.yandex.mapkit.offline_cache.internal;

import B90.g0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.h;
import androidx.work.n;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public class BackgroundDownloadJob extends Worker implements BackgroundWorkerListener {
    private static Logger LOGGER = Logger.getLogger(BackgroundDownloadJob.class.getCanonicalName());
    protected static final String TAG = "mapkit_background_download";

    protected BackgroundDownloadJob(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doWork$0(BackgroundDownloadInitializer backgroundDownloadInitializer) {
        backgroundDownloadInitializer.setListener(this);
        backgroundDownloadInitializer.initializeMapkit();
    }

    @Override // androidx.work.Worker
    @NonNull
    public synchronized n.a doWork() {
        LOGGER.info("Start background download job");
        BackgroundDownloadInitializer initializer = BackgroundDownloadManager.getInitializer();
        if (initializer != null) {
            new Handler(Looper.getMainLooper()).post(new a(0, this, initializer));
        }
        try {
            try {
                wait();
                LOGGER.info("Stop background download job");
            } finally {
                if (initializer != null) {
                    new Handler(Looper.getMainLooper()).post(new g0(initializer, 4));
                }
            }
        } catch (InterruptedException unused) {
            LOGGER.info("Background download job interrupted");
            n.a.b bVar = new n.a.b();
            if (initializer != null) {
                new Handler(Looper.getMainLooper()).post(new g0(initializer, 4));
            }
            return bVar;
        }
        return new n.a.c();
    }

    @Override // androidx.work.n
    public synchronized void onStopped() {
        notifyAll();
    }

    @Override // com.yandex.mapkit.offline_cache.internal.BackgroundWorkerListener
    public void updateForegroundInfo(@NonNull h hVar) {
        setForegroundAsync(hVar);
    }
}
