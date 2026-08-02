package com.unity3d.ads.core.domain.work;

import android.content.Context;
import xsna.awx0;
import xsna.dwx0;
import xsna.epx;
import xsna.zcl;

/* compiled from: BackgroundWorker.kt */
/* loaded from: classes14.dex */
public final class BackgroundWorker {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "UnityAdsBackgroundWorker";
    private final awx0 workManager;

    /* compiled from: BackgroundWorker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public BackgroundWorker(Context context) {
        this.workManager = dwx0.h(context);
    }

    public final awx0 getWorkManager() {
        return this.workManager;
    }

    public final <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        epx.k();
        throw null;
    }
}
