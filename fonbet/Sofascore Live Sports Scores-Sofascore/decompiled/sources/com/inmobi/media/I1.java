package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class I1 {
    public static LinkedHashSet a;

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static void b(Context context) {
        C3736rl c3736rl = C3892xl.c;
        context.getClass();
        c3736rl.getClass();
        if (a == null) {
            a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new H1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = a;
        if (linkedHashSet != null) {
            linkedHashSet.add(c3736rl);
        }
    }

    public static void a(boolean z) {
        LinkedHashSet linkedHashSet;
        if (AbstractC3424fj.a == null || (linkedHashSet = a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C3736rl) it.next()).getClass();
                C3736rl.a(z);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
