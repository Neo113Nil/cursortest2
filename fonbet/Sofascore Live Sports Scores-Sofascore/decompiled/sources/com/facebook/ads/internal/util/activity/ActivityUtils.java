package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.core.AbstractC2064Td;
import com.facebook.ads.redexgen.core.AbstractC2155Wt;
import com.facebook.ads.redexgen.core.C2065Te;
import com.facebook.ads.redexgen.core.C2102Up;
import com.facebook.ads.redexgen.core.C2648ge;
import com.facebook.ads.redexgen.core.C2652gi;
import com.facebook.ads.redexgen.core.InterfaceC2158Ww;
import com.facebook.ads.redexgen.core.RunnableC2157Wv;
import com.facebook.ads.redexgen.core.X0;
import com.facebook.ads.redexgen.core.Y4;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: assets/audience_network/classes2.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C2648ge A02;
    public static byte[] A03;
    public static String[] A04 = {"92eOfmmmV4HUmtBKNwX5jODUm9snbisL", "83A6RHTc3uHHgwZu0l", "xT8NDmJO40EcDZzCFYpPknxtJdrIGRIs", "yd9OYuKBF31VEKohInrUKVptjNnIlgtF", "ffDhLNnwXMIpP", "gJJ", "YtTChd0N7kYfN", "CHt0mr4gyt"};
    public static final X0 A05;
    public static final List<InterfaceC2158Ww> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {14, 2, 35, 69, 86, 75, 88, 75, 86, 91, 28, 2, -90, -102, -20, -33, -32, -76, -102, 6, 40, 57, 46, 59, 46, 57, 62, -27, 41, 46, 56, 40, 55, 42, 53, 38, 51, 40, 46, 42, 56, -13, 56, 103, 103, 58, 102, 101, 107, 92, 111, 107, 23, 96, 106, 23, 101, 102, 107, 23, 56, 103, 103, 99, 96, 90, 88, 107, 96, 102, 101, 37, -3, 41, 40, 29, 47, 44, 44, 31, 40, 46, -38, 39, 41, 30, 35, 32, 35, 29, 27, 46, 35, 41, 40, -38, 31, 50, 29, 31, 42, 46, 35, 41, 40, -38, 46, 34, 44, 41, 49, 40, 30, 47, 44, 35, 40, 33, -38, 44, 31, 33, 35, 45, 46, 31, 44, -5, 29, 46, 35, 48, 35, 46, 51, -3, 27, 38, 38, 28, 27, 29, 37, 45, 6, 35, 45, 46, 31, 40, 31, 44, 45, 74, 66, -2, 63, 65, 82, 71, 84, 71, 82, 87, -2, 81, 82, 63, 82, 67, 24, -2, 24, 41, 61, 59, 45, 44, -24, 41, 43, 60, 49, 62, 49, 60, 65, -24, 49, 59, -24, 54, 55, 60, -24, 58, 45, 59, 61, 53, 45, 44, -10, 44, 63, 77, 20, -6, 23, 25, 42, 21, 43, 42, 31, 34, -35, -20, -27, 58, 57, 12, 46, 63, 52, 65, 52, 63, 68, 14, 61, 48, 44, 63, 48, 47};
        if (A04[0].charAt(5) != 'm') {
            throw new RuntimeException();
        }
        A04[7] = "OT1BI2x3SK";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static synchronized void A04(C2648ge c2648ge, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = c2648ge;
            A01 = c2648ge.getApplicationContext();
            if (A01 instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            c2648ge.A08().ABC(A01(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), AbstractC2064Td.A02, new C2065Te(A01(72, 80, 65)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c2648ge);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                c2648ge.A08().ABC(A01(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 3, 3), AbstractC2064Td.A0d, new C2065Te(A01(42, 30, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE)));
            }
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = X0.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x00a0, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:11:0x0027, B:14:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized Activity A00() {
        boolean z;
        synchronized (ActivityUtils.class) {
            Activity activity = null;
            Iterator<Map.Entry<Activity, Integer>> it = A08.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Activity, Integer> next = it.next();
                if (next.getValue().intValue() == 3) {
                    activity = next.getKey();
                    break;
                }
            }
            Activity activity2 = null;
            if (activity != null && Build.VERSION.SDK_INT >= 28) {
                z = false;
                if (z) {
                    activity2 = AbstractC2155Wt.A00();
                }
                if (A02 != null && z && activity != activity2) {
                    C2065Te c2065Te = new C2065Te(A01(19, 23, 76), A01(203, 5, 97) + activity + A01(12, 7, 1) + activity2);
                    c2065Te.A05(1);
                    A02.A08().ABC(A01(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), AbstractC2064Td.A03, c2065Te);
                }
                return activity == null ? activity : activity2;
            }
            z = true;
            if (z) {
            }
            if (A02 != null) {
                C2065Te c2065Te2 = new C2065Te(A01(19, 23, 76), A01(203, 5, 97) + activity + A01(12, 7, 1) + activity2);
                c2065Te2.A05(1);
                A02.A08().ABC(A01(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), AbstractC2064Td.A03, c2065Te2);
            }
            if (activity == null) {
            }
        }
    }

    public static void A03(C2652gi c2652gi) {
        if (!C2102Up.A1p(c2652gi) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        RunnableC2157Wv runnableC2157Wv = new RunnableC2157Wv(c2652gi);
        synchronized (A07) {
            A07.add(runnableC2157Wv);
        }
        Y4.A01.A01().postDelayed(runnableC2157Wv, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<InterfaceC2158Ww> it = A06.iterator();
        boolean hasNext = it.hasNext();
        String[] strArr = A04;
        if (strArr[4].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "6ucg7ZQRC52PgbYLp0IlsO8L9UBIqtAr";
        strArr2[2] = "XfsAw5zLn3vJHYKMay1aCQiNLVOIwPXI";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 17, 82));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            C2065Te c2065Te = new C2065Te(A01(172, 31, 79), A01(152, 20, 101) + num + A01(0, 12, 105) + activity);
            c2065Te.A05(0);
            A02.A08().ABC(A01(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), AbstractC2064Td.A03, c2065Te);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Y4.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
