package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.d;
import androidx.work.g;
import androidx.work.impl.C;
import androidx.work.p;
import androidx.work.q;
import androidx.work.w;
import com.yandex.runtime.Runtime;
import java.util.Collections;

/* loaded from: classes9.dex */
public class BackgroundDownloadManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static BackgroundDownloadInitializer initializer;
    private static BackgroundDownloadManager instance;
    private int activeDownloads = 0;
    private boolean allowCellular = false;
    private w workManager;

    private BackgroundDownloadManager(BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        this.workManager = null;
        initializer = backgroundDownloadInitializer;
        this.workManager = C.i(context);
    }

    private void disableBackgroundDownloading() {
        this.workManager.a("mapkit_background_download");
    }

    private void enableBackgroundDownloading() {
        p pVar = this.allowCellular ? p.CONNECTED : p.UNMETERED;
        d.a aVar = new d.a();
        aVar.b(pVar);
        q b11 = new q.a(BackgroundDownloadJob.class).j(aVar.a()).b();
        w wVar = this.workManager;
        g gVar = g.REPLACE;
        wVar.getClass();
        wVar.b("mapkit_background_download", gVar, Collections.singletonList(b11));
    }

    protected static synchronized BackgroundDownloadInitializer getInitializer() {
        BackgroundDownloadInitializer backgroundDownloadInitializer;
        synchronized (BackgroundDownloadManager.class) {
            backgroundDownloadInitializer = initializer;
        }
        return backgroundDownloadInitializer;
    }

    public static BackgroundDownloadManager getInstance() {
        initialize(null, Runtime.getApplicationContext());
        return instance;
    }

    public static void initialize(BackgroundDownloadInitializer backgroundDownloadInitializer, @NonNull Context context) {
        if (instance == null) {
            instance = new BackgroundDownloadManager(backgroundDownloadInitializer, context);
        } else if (backgroundDownloadInitializer != null) {
            throw new RuntimeException("BackgroundDownloadManager reinitialization");
        }
    }

    protected void decrementActiveDownloads() {
        int i11 = this.activeDownloads - 1;
        this.activeDownloads = i11;
        if (i11 == 0) {
            disableBackgroundDownloading();
        }
    }

    protected void incrementActiveDownloads() {
        int i11 = this.activeDownloads + 1;
        this.activeDownloads = i11;
        if (i11 == 1) {
            enableBackgroundDownloading();
        }
    }

    protected void updateBackgroundDownloading(boolean z11) {
        this.allowCellular = z11;
        if (this.activeDownloads > 0) {
            enableBackgroundDownloading();
        }
    }
}
