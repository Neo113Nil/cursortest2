package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class G5 {
    public static final boolean a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ActivityManager activityManager = (ActivityManager) systemService;
        F5.a.getClass();
        if (!(F5.w() ? activityManager.isLowRamDevice() : true)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / 1048576 >= 100) {
                return false;
            }
        }
        return true;
    }

    public static final int a() {
        int i = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i && i <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 <= i && i < 640) {
            return 720;
        }
        if (320 > i || i >= 480) {
            return (240 > i || i >= 320) ? 240 : 360;
        }
        return 480;
    }
}
