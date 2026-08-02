package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class u {
    private static AccessibilityManager a;

    private static AccessibilityManager a(Context context) {
        AccessibilityManager accessibilityManager = a;
        if (accessibilityManager != null) {
            return accessibilityManager;
        }
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) context.getSystemService("accessibility");
        a = accessibilityManager2;
        return accessibilityManager2;
    }

    public static String b(Context context) {
        AccessibilityManager a2;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (a2 = a(context)) == null || (enabledAccessibilityServiceList = a2.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                String i2 = wv8.i(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, "#", accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (!arrayList.contains(i2)) {
                    arrayList.add(i2);
                }
            }
        }
        return String.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, arrayList);
    }
}
