package com.vk.push.core.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import xsna.drm0;
import xsna.epx;
import xsna.j5g;

/* compiled from: ProcessUtils.kt */
/* loaded from: classes5.dex */
public final class ProcessUtilsKt {
    public static final String getPackageNameForPid(Context context, int i) {
        Object failure;
        Object obj;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(ActivityManager.class);
            failure = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        List list = (List) failure;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == i) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null) {
            return null;
        }
        return (String) j5g.a0(drm0.c0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6));
    }

    @SuppressLint({"PrivateApi"})
    public static final String getProcessName(Context context) {
        return Application.getProcessName();
    }

    public static final boolean isMainProcess(Context context) {
        return epx.f(getProcessName(context), context.getPackageName());
    }
}
