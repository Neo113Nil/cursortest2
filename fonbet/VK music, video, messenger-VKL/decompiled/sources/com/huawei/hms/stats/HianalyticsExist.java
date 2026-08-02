package com.huawei.hms.stats;

/* loaded from: classes13.dex */
public class HianalyticsExist {
    private static final Object a = new Object();
    private static boolean b = false;
    private static boolean c = false;

    public static boolean isHianalyticsExist() {
        synchronized (a) {
            if (!b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                }
                b = true;
            }
        }
        return c;
    }
}
