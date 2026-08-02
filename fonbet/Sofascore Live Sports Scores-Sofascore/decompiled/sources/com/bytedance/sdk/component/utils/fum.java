package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class fum {
    private static String pcc;

    public static String gm(Context context) {
        String sf = sf(context);
        return (TextUtils.isEmpty(sf) || !sf.contains(":")) ? sf : sf.replace(":", "_");
    }

    public static boolean pcc(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), sf(context));
    }

    public static String sf(Context context) {
        if (!TextUtils.isEmpty(pcc)) {
            return pcc;
        }
        String pcc2 = pcc();
        pcc = pcc2;
        if (!TextUtils.isEmpty(pcc2)) {
            return pcc;
        }
        String sf = sf();
        pcc = sf;
        return !TextUtils.isEmpty(sf) ? pcc : pcc;
    }

    private static String pcc() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String sf() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
