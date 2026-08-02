package com.bytedance.sdk.openadsdk.oo;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.lo;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private static Method gm = null;
    private static Method oo = null;
    private static Method pcc = null;
    private static Class<?> sf = null;
    private static boolean vj = false;

    static {
        sf();
    }

    private static boolean gm() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("s_i_e", 0) == 1;
    }

    public static JSONObject pcc() {
        JSONObject jSONObject;
        Method method;
        List list;
        Method method2;
        Method method3;
        int i = Build.VERSION.SDK_INT;
        JSONObject jSONObject2 = null;
        if (i >= 35 && gm()) {
            sf();
            try {
                jSONObject = new JSONObject();
            } catch (Throwable th) {
                th = th;
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService(ActivityManager.class);
                if (activityManager != null && (method = pcc) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                    Object obj = list.get(0);
                    if (i >= 36 && obj != null && (method3 = gm) != null) {
                        jSONObject.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                    }
                    if (obj != null && (method2 = oo) != null) {
                        jSONObject.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                    }
                }
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                jSONObject2 = jSONObject;
                lo.gm(th.getMessage(), new Object[0]);
                return jSONObject2;
            }
        }
        return jSONObject2;
    }

    private static void sf() {
        int i;
        if (vj || (i = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (gm()) {
                pcc = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                sf = cls;
                oo = cls.getMethod("getReason", null);
                if (i >= 36) {
                    gm = sf.getMethod("getStartComponent", null);
                }
                vj = true;
            }
        } catch (Throwable th) {
            lo.gm(th.getMessage(), new Object[0]);
        }
    }
}
