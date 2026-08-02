package com.google.android.gms.common.util;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class WorkSourceUtil {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static Boolean e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception unused6) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception unused7) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused8) {
                }
            } catch (Exception unused9) {
            }
            d = method4;
            e = null;
        }
        method4 = null;
        d = method4;
        e = null;
    }

    private WorkSourceUtil() {
    }

    public static void a(WorkSource workSource, int i, String str) {
        Method method = b;
        try {
            if (method != null) {
                if (str == null) {
                    str = "";
                }
                method.invoke(workSource, Integer.valueOf(i), str);
            } else {
                Method method2 = a;
                if (method2 != null) {
                    method2.invoke(workSource, Integer.valueOf(i));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(WorkSource workSource) {
        int intValue;
        Method method = d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.i(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        Method method2 = c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                Preconditions.i(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception unused2) {
            }
            return intValue != 0;
        }
        intValue = 0;
        if (intValue != 0) {
        }
    }
}
