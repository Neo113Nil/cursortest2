package com.mbridge.msdk.config.component.common.express.operator;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class q {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public q(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        String str2;
        int i;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("879"))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Object obj2 = "";
        String obj3 = list.get(0) != null ? list.get(0).toString() : "";
        if (list.size() >= 2) {
            Object obj4 = list.get(1);
            if (obj4 instanceof Integer) {
                i = ((Integer) obj4).intValue();
            } else {
                if (obj4 != null) {
                    try {
                        i = Integer.parseInt(obj4.toString());
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 1;
            }
            if (list.size() == 3) {
                Object obj5 = list.get(2);
                if (obj5 instanceof String) {
                    str2 = String.valueOf(obj5);
                }
            }
            str2 = "STRING";
        } else {
            str2 = "STRING";
            i = 1;
        }
        if (TextUtils.isEmpty(obj3)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (i != 1) {
            switch (str2.hashCode()) {
                case -1838656495:
                    str2.equals("STRING");
                    obj2 = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, "");
                    break;
                case 72655:
                    if (str2.equals("INT")) {
                        obj2 = Integer.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, 0));
                        break;
                    }
                    obj2 = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, "");
                    break;
                case 2342524:
                    if (str2.equals("LONG")) {
                        obj2 = Long.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, 0L));
                        break;
                    }
                    obj2 = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, "");
                    break;
                case 66988604:
                    if (str2.equals("FLOAT")) {
                        obj2 = Float.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        break;
                    }
                    obj2 = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, "");
                    break;
                case 782694408:
                    if (str2.equals("BOOLEAN")) {
                        obj2 = Boolean.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, false));
                        break;
                    }
                    obj2 = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, "");
                    break;
                default:
                    obj2 = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj3, "");
                    break;
            }
        } else {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.mbridge.msdk.foundation.controller.c.n().d());
                switch (str2.hashCode()) {
                    case -1838656495:
                        str2.equals("STRING");
                        obj2 = defaultSharedPreferences.getString(obj3, "");
                        break;
                    case 72655:
                        if (str2.equals("INT")) {
                            obj2 = Integer.valueOf(defaultSharedPreferences.getInt(obj3, 0));
                            break;
                        }
                        obj2 = defaultSharedPreferences.getString(obj3, "");
                        break;
                    case 2342524:
                        if (str2.equals("LONG")) {
                            obj2 = Long.valueOf(defaultSharedPreferences.getLong(obj3, 0L));
                            break;
                        }
                        obj2 = defaultSharedPreferences.getString(obj3, "");
                        break;
                    case 66988604:
                        if (str2.equals("FLOAT")) {
                            obj2 = Float.valueOf(defaultSharedPreferences.getFloat(obj3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            break;
                        }
                        obj2 = defaultSharedPreferences.getString(obj3, "");
                        break;
                    case 782694408:
                        if (str2.equals("BOOLEAN")) {
                            obj2 = Boolean.valueOf(defaultSharedPreferences.getBoolean(obj3, false));
                            break;
                        }
                        obj2 = defaultSharedPreferences.getString(obj3, "");
                        break;
                    default:
                        obj2 = defaultSharedPreferences.getString(obj3, "");
                        break;
                }
            } catch (Exception unused2) {
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj2);
    }
}
