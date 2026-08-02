package com.huawei.hms.health;

import android.util.Log;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.api.CommonStatusCodes;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.hihealth.data.DataCollector;
import com.huawei.hms.hihealth.data.DataType;
import com.huawei.hms.support.api.client.Status;
import com.unity3d.ads.BuildConfig;
import java.util.Collection;
import java.util.regex.Pattern;
import xsna.dpy0;
import xsna.g5o0;
import xsna.go9;
import xsna.szy0;
import xsna.u5o0;

/* loaded from: classes13.dex */
public class aabz {
    public static <R extends com.huawei.hms.hihealth.result.aab, T> Task<R> aab(Task<T> task, aacw<T> aacwVar) {
        g5o0 g5o0Var = new g5o0();
        aacr aacrVar = new aacr(g5o0Var, aacwVar);
        szy0 szy0Var = (szy0) task;
        szy0Var.getClass();
        szy0Var.g(new dpy0(u5o0.c.b, aacrVar));
        return g5o0Var.a;
    }

    public static Boolean aaba(Collection collection) {
        return Boolean.valueOf(!aab(collection).booleanValue());
    }

    public static void aaba(String str, String str2) {
        Log.e("HmsHealth_kit " + str, str2);
    }

    public static DataCollector aab(DataType dataType) {
        return new DataCollector.Builder().setPackageName("com.huawei.hms.health").setDataStreamName(BuildConfig.FLAVOR).setDataGenerateType(1).setDataType(dataType).build();
    }

    public static Boolean aab(Collection collection) {
        return Boolean.valueOf(collection == null || collection.isEmpty());
    }

    public static void aab(String str, String str2) {
        Log.e("HmsHealth_kit " + str, str2);
    }

    public static void aab(String str, String str2, Object... objArr) {
        String b = go9.b("HmsHealth_kit ", str);
        try {
            str2 = String.format(str2, objArr);
        } catch (Exception unused) {
            aabc("util", "strFormat exception");
        }
        Log.e(b, str2);
    }

    public static Status aab(String str) {
        if (!((str == null || str.length() == 0) ? false : Pattern.matches("^[-\\+]?[\\d]*$", str))) {
            return new Status(Status.FAILURE.getStatusCode(), str);
        }
        try {
            int parseInt = Integer.parseInt(str);
            return Math.abs(parseInt) < 5000 ? new Status(parseInt, CommonStatusCodes.getStatusCodeString(parseInt)) : new Status(parseInt, HiHealthStatusCodes.getStatusCodeMessage(parseInt));
        } catch (NumberFormatException unused) {
            return new Status(Status.FAILURE.getStatusCode(), str);
        }
    }

    public static void aabb(String str, String str2) {
    }

    public static void aabc(String str, String str2) {
    }
}
