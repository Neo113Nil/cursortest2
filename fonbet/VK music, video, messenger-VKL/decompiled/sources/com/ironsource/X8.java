package com.ironsource;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class X8 {
    private final F0 a;

    public X8(F0 f0) {
        this.a = f0;
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        this.a.a(C0.INIT_STARTED, hashMap);
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        this.a.a(C0.INIT_ENDED, hashMap);
    }

    public void a() {
        this.a.a(C0.INIT_SUCCESS, null);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        this.a.a(C0.INIT_FAILED, hashMap);
    }
}
