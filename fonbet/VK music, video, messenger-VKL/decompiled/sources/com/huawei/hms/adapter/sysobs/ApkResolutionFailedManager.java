package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class ApkResolutionFailedManager {
    private static final ApkResolutionFailedManager c = new ApkResolutionFailedManager();
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Map<String, Runnable> b = new HashMap(2);

    private ApkResolutionFailedManager() {
    }

    public static ApkResolutionFailedManager getInstance() {
        return c;
    }

    public void postTask(String str, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        this.b.put(str, runnable);
        this.a.postDelayed(runnable, 2000L);
    }

    public void removeTask(String str) {
        Runnable remove;
        if (Looper.myLooper() == Looper.getMainLooper() && (remove = this.b.remove(str)) != null) {
            this.a.removeCallbacks(remove);
        }
    }

    public void removeValueOnly(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        this.b.remove(str);
    }
}
