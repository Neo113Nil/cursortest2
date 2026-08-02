package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;

/* compiled from: HmsAccountKitVersionCheckUtil.java */
/* loaded from: classes13.dex */
public class a {
    public static int a() {
        return 40004000;
    }

    public static void a(Activity activity, AvailableAdapter.AvailableCallBack availableCallBack) {
        as.b("HmsAccountKitVersionCheckUtil", "====== HMSSDK version: 61100301 ======", true);
        Context applicationContext = activity.getApplicationContext();
        int a = a();
        as.b("HmsAccountKitVersionCheckUtil", "check minVersion:" + a, true);
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
