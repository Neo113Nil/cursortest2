package com.tiktok.appevents;

import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.offline.DownloadService;
import com.facebook.react.modules.appstate.AppStateModule;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import com.tiktok.util.TTUtil;

/* loaded from: classes8.dex */
class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {
    private static boolean isPaused = false;
    private final TTAppEventLogger appEventLogger;
    private long bgStart = 0;
    private long fgStart = System.currentTimeMillis();

    public TTActivityLifecycleCallbacksListener(TTAppEventLogger appEventLogger) {
        this.appEventLogger = appEventLogger;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        if (isPaused) {
            reportBackground(this.bgStart);
            this.fgStart = System.currentTimeMillis();
            this.appEventLogger.fetchGlobalConfig(0);
            this.appEventLogger.restartScheduler();
            this.appEventLogger.autoEventsManager.track2DayRetentionEvent();
        }
        isPaused = false;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        reportForeground(this.fgStart);
        this.bgStart = System.currentTimeMillis();
        this.appEventLogger.stopScheduler();
        isPaused = true;
        if (TikTokBusinessSdk.enableAutoIapTrack()) {
            TTInAppPurchaseWrapper.startBillingClient();
        }
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        this.appEventLogger.persistEvents();
        this.appEventLogger.persistMonitor();
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        this.appEventLogger.stopScheduler();
    }

    private void reportForeground(long ts) {
        try {
            this.appEventLogger.monitorMetric(DownloadService.KEY_FOREGROUND, TTUtil.getMetaWithTS(Long.valueOf(ts)).put("latency", System.currentTimeMillis() - ts), null);
        } catch (Exception unused) {
        }
    }

    private void reportBackground(long ts) {
        try {
            this.appEventLogger.monitorMetric(AppStateModule.APP_STATE_BACKGROUND, TTUtil.getMetaWithTS(Long.valueOf(ts)).put("latency", System.currentTimeMillis() - ts), null);
        } catch (Exception unused) {
        }
    }

    public static boolean isBackground() {
        return isPaused;
    }
}
