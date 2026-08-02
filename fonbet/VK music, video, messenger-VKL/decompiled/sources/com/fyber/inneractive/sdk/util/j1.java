package com.fyber.inneractive.sdk.util;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes12.dex */
public abstract class j1 {
    public static boolean a(String str) {
        int i = com.fyber.inneractive.sdk.config.k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains(CrashHianalyticsData.EVENT_ID_CRASH);
    }
}
