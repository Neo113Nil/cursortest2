package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3096 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f3097;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final Handler f3098;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final ScheduledExecutorService f3099;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3100;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final Handler f3101;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8548() {
        f3097 = new int[]{621951346, 554129842, -1770562891, 15781964, 317828427, 281533300, 936340100, 1880100504, -1716981975, -594389257, 998113686, -2078480336, -738254728, 1280070557, -496344797, -975173945, -1798293182, 632528032};
    }

    static {
        ScheduledExecutorService scheduledExecutorService;
        m8548();
        f3101 = new Handler(Looper.getMainLooper());
        Handler m8546 = m8546();
        f3098 = m8546;
        if (m8546 == null) {
            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            int i = f3100 + 41;
            f3096 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            scheduledExecutorService = null;
        }
        f3099 = scheduledExecutorService;
        int i4 = f3100 + 63;
        f3096 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m8556() {
        int i = 2 % 2;
        int i2 = f3100 + 23;
        f3096 = i2 % 128;
        if (i2 % 2 != 0) {
            return f3101;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8554(je jeVar) {
        int i = 2 % 2;
        int i2 = f3096 + 63;
        f3100 = i2 % 128;
        int i3 = i2 % 2;
        if (!m8555()) {
            m8549(jeVar);
            return;
        }
        int i4 = f3096 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3100 = i4 % 128;
        int i5 = i4 % 2;
        jeVar.run();
        int i6 = f3100 + 67;
        f3096 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8549(je jeVar) {
        int i = 2 % 2;
        int i2 = f3096 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f3100 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8556().post(jeVar);
                return;
            }
            m8556().post(jeVar);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12).intern(), m8551(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, 511058957, 1449920737, -963374330, 2138074815, -1011185014, 307574359, -160436756, 1142998141, 829619273, 8203275}, KeyEvent.getDeadChar(0, 0) + 29).intern(), false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8547(je jeVar, long j) {
        int i = 2 % 2;
        int i2 = f3096 + 83;
        f3100 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8556().postDelayed(jeVar, j);
            } else {
                m8556().postDelayed(jeVar, j);
                throw null;
            }
        } catch (Throwable unused) {
            m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, 12 - TextUtils.getCapsMode("", 0, 0)).intern(), m8551(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, -1951368966, -1322678961, -28348876, -1310592639, -1231078610, 928073700, -963374330, 2138074815, -1011185014, 307574359, -160436756, 1142998141, 829619273, 8203275}, 37 - Color.red(0)).intern(), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8557(je jeVar) {
        int i = 2 % 2;
        int i2 = f3100 + 95;
        f3096 = i2 % 128;
        if (i2 % 2 != 0) {
            if (m8555()) {
                int i3 = f3096 + 71;
                f3100 = i3 % 128;
                if (i3 % 2 == 0) {
                    m8552(jeVar);
                    return;
                } else {
                    m8552(jeVar);
                    int i4 = 19 / 0;
                    return;
                }
            }
            jeVar.run();
            return;
        }
        m8555();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8552(je jeVar) {
        int i = 2 % 2;
        int i2 = f3096 + 107;
        f3100 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Handler m8550 = m8550();
                if (m8550 != null) {
                    m8550.post(jeVar);
                    return;
                }
                ScheduledExecutorService scheduledExecutorService = f3099;
                if (scheduledExecutorService != null) {
                    int i3 = f3096 + 73;
                    f3100 = i3 % 128;
                    if (i3 % 2 == 0) {
                        scheduledExecutorService.execute(jeVar);
                        return;
                    } else {
                        scheduledExecutorService.execute(jeVar);
                        throw null;
                    }
                }
                m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, MotionEvent.axisFromString("") + 13).intern(), m8551(new int[]{-1197097769, 1516248765, 724329398, -935862335, 2030468669, 1751617149, 2067107392, 1817268173, -527728537, 499605611, -1257836709, 1566789497, 1524907785, 1066728750, -983722423, -956596478, -441218123, -852801427, -1805784129, 995277949, 1166065063, 1865124124, 77840018, -336588001, 247310341, 2120525376}, View.MeasureSpec.getSize(0) + 52).intern(), false);
                return;
            }
            m8550();
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12).intern(), m8551(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, 511058957, 1449920737, -1174571853, -1486532682, 1074588006, 1001308909, -758532677, 1834953419, 2847859, -250659468, 150969600, -249783878}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36).intern(), false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8553(je jeVar, long j) {
        int i = 2 % 2;
        int i2 = f3100 + 57;
        f3096 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Handler m8550 = m8550();
                if (m8550 == null) {
                    ScheduledExecutorService scheduledExecutorService = f3099;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.schedule(jeVar, j, TimeUnit.MILLISECONDS);
                        return;
                    } else {
                        m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, KeyEvent.normalizeMetaState(0) + 12).intern(), m8551(new int[]{-1197097769, 1516248765, 724329398, -935862335, 2030468669, 1751617149, 2067107392, 1817268173, -527728537, 499605611, -1257836709, 1566789497, 1524907785, 1066728750, -983722423, -956596478, -441218123, -852801427, -1805784129, 995277949, 1166065063, 1865124124, 77840018, -336588001, 247310341, 2120525376}, 52 - View.combineMeasuredStates(0, 0)).intern(), false);
                        return;
                    }
                }
                int i3 = f3096 + 51;
                f3100 = i3 % 128;
                if (i3 % 2 == 0) {
                    m8550.postDelayed(jeVar, j);
                    return;
                } else {
                    m8550.postDelayed(jeVar, j);
                    int i4 = 12 / 0;
                    return;
                }
            }
            m8550();
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, View.combineMeasuredStates(0, 0) + 12).intern(), m8551(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, -1951368966, -1322678961, -28348876, -1310592639, -1231078610, 928073700, -1174571853, -1486532682, 1074588006, 1001308909, -758532677, 1834953419, 2847859, -250659468, 150969600, -249783878}, 44 - KeyEvent.getDeadChar(0, 0)).intern(), false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Handler m8550() {
        int i = 2 % 2;
        int i2 = f3096 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3100 = i2 % 128;
        if (i2 % 2 == 0) {
            return f3098;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m8555() {
        int i = 2 % 2;
        Object obj = null;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            int i2 = f3100 + 57;
            f3096 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i3 = f3100;
        int i4 = i3 + 73;
        f3096 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 65;
        f3096 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Handler m8546() {
        HandlerThread handlerThread;
        int i = 2 % 2;
        int i2 = f3096 + 85;
        f3100 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < 3) {
            try {
                handlerThread = new HandlerThread(m8551(new int[]{426041053, 745093849, 1262991584, -465927634, 145822151, -20209200}, 10 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
            } catch (Throwable unused) {
                handlerThread = null;
            }
            try {
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            } catch (Throwable unused2) {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                    } catch (Throwable unused3) {
                        m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12).intern(), m8551(new int[]{-141257061, -2103618194, -182019254, 2032439213, 26327093, 379715407, 1253628177, -127331222, -1574072248, 1072353177, 377508188, 133172322, -1438332986, -1622780767, -621619074, 1758919274, -751518759, -1361665732}, 35 - (Process.myPid() >> 22)).intern(), true);
                    }
                }
                m.m8531(m8551(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, 12 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m8551(new int[]{-141257061, -2103618194, -182019254, 2032439213, 26327093, 379715407, 1253628177, -127331222, -1574072248, 1072353177, 377508188, 133172322, -1438332986, -1622780767, -621619074, 1758919274, 431700199, 1208226594, 1686160351, -1565922216, 65260135, -1091427008, 1260918137, -1639155475}, TextUtils.getTrimmedLength("") + 48).intern(), true);
                i4++;
                int i5 = f3100 + 115;
                f3096 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 4;
                }
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8551(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f3097.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
