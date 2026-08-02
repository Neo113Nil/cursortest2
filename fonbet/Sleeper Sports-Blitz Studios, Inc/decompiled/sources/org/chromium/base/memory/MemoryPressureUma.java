package org.chromium.base.memory;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.chromium.base.ContextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.metrics.RecordHistogram;

/* loaded from: classes10.dex */
public class MemoryPressureUma implements ComponentCallbacks2 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static MemoryPressureUma sInstance;
    private final String mHistogramName;

    @Retention(RetentionPolicy.SOURCE)
    private @interface Notification {
        public static final int NUM_ENTRIES = 9;
        public static final int ON_LOW_MEMORY = 8;
        public static final int TRIM_MEMORY_BACKGROUND = 3;
        public static final int TRIM_MEMORY_COMPLETE = 1;
        public static final int TRIM_MEMORY_MODERATE = 2;
        public static final int TRIM_MEMORY_RUNNING_CRITICAL = 5;
        public static final int TRIM_MEMORY_RUNNING_LOW = 6;
        public static final int TRIM_MEMORY_RUNNING_MODERATE = 7;
        public static final int TRIM_MEMORY_UI_HIDDEN = 4;
        public static final int UNKNOWN_TRIM_LEVEL = 0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public static void initializeForBrowser() {
        initializeInstance("Browser");
    }

    public static void initializeForChildService() {
        initializeInstance("ChildService");
    }

    private static void initializeInstance(String processType) {
        ThreadUtils.assertOnUiThread();
        sInstance = new MemoryPressureUma(processType);
        ContextUtils.getApplicationContext().registerComponentCallbacks(sInstance);
    }

    private MemoryPressureUma(String processType) {
        this.mHistogramName = "Android.MemoryPressureNotification." + processType;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        record(8);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        if (level == 5) {
            record(7);
            return;
        }
        if (level == 10) {
            record(6);
            return;
        }
        if (level == 15) {
            record(5);
            return;
        }
        if (level == 20) {
            record(4);
            return;
        }
        if (level == 40) {
            record(3);
            return;
        }
        if (level == 60) {
            record(2);
        } else if (level == 80) {
            record(1);
        } else {
            record(0);
        }
    }

    private void record(int notification) {
        RecordHistogram.recordEnumeratedHistogram(this.mHistogramName, notification, 9);
    }
}
