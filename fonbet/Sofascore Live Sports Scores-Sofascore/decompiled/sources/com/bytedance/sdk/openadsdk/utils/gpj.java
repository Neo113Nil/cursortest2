package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj {
    public static void pcc() {
        Context pcc = com.bytedance.sdk.openadsdk.core.lu.pcc();
        if (pcc != null && com.bytedance.sdk.component.utils.jr.gm()) {
            String packageName = pcc.getPackageName();
            int i = pcc.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = pcc.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> sf = sf();
                for (String str : strArr) {
                    if (str != null) {
                        sf.remove(str);
                    }
                }
                if (sf.isEmpty()) {
                    return;
                }
                for (String str2 : sf) {
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static List<String> sf() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
