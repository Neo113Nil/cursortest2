package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;

/* compiled from: HmsAPKVersionCheckUtil.java */
/* loaded from: classes13.dex */
public class q {
    public static int a() {
        return 30000000;
    }

    public static void a(Activity activity, AvailableAdapter.AvailableCallBack availableCallBack) {
        as.b("HmsAPKVersionCheckUtil", "====== HMSSDK version: 61100301 ======", true);
        Context applicationContext = activity.getApplicationContext();
        int a = a();
        as.b("HmsAPKVersionCheckUtil", "check minVersion:" + a, true);
        AvailableAdapter availableAdapter = new AvailableAdapter(a);
        int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(applicationContext);
        if (isHuaweiMobileServicesAvailable == 0) {
            availableCallBack.onComplete(isHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
            availableAdapter.startResolution(activity, availableCallBack);
        } else {
            availableCallBack.onComplete(isHuaweiMobileServicesAvailable);
        }
    }
}
