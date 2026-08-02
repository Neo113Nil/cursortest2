package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jsj {
    private static final Object pcc = new Object();
    private static final Map<pcc, Object> sf = new ConcurrentHashMap();
    private static final AtomicInteger gm = new AtomicInteger();
    private static AtomicBoolean oo = new AtomicBoolean(false);
    private static volatile int vj = -1;
    private static volatile long wh = 0;
    private static volatile int qf = 60000;
    private static gpj kj = null;
    private static final AtomicBoolean vy = new AtomicBoolean(false);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(Context context, Intent intent, boolean z, int i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf extends BroadcastReceiver {
        private sf() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                jsj.sf(context, intent, jsj.gm.get() > 0, false);
            } catch (Throwable unused) {
            }
        }
    }

    private static int gm(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        gpj gpjVar = kj;
                        return (gpjVar == null || !gpjVar.pcc(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static void pcc(pcc pccVar, Context context) {
        if (pccVar == null) {
            return;
        }
        if (!oo.get()) {
            try {
                context.registerReceiver(new sf(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                oo.set(true);
            } catch (Throwable unused) {
            }
        }
        Map<pcc, Object> map = sf;
        map.put(pccVar, pcc);
        gm.set(map.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(Context context, Intent intent, int i, boolean z) {
        Map<pcc, Object> map = sf;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (pcc pccVar : map.keySet()) {
            if (pccVar != null) {
                try {
                    pccVar.pcc(context, intent, !z, i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            vj = 0;
        } else if (vy.compareAndSet(false, true)) {
            com.bytedance.sdk.component.kj.pcc.pcc(new Runnable() { // from class: com.bytedance.sdk.component.utils.jsj.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = jsj.vj = z2 ? 0 : jsj.sf(context);
                    jsj.vy.set(false);
                    boolean z3 = jsj.vj == 0;
                    boolean z4 = z;
                    if ((z4 || !z3) && z4) {
                        jsj.sf(context, intent, jsj.vj, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int sf(Context context) {
        vj = gm(context);
        wh = SystemClock.elapsedRealtime();
        return vj;
    }

    public static int pcc(Context context, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wh + j <= elapsedRealtime) {
            return sf(context);
        }
        if (vj == -1) {
            return sf(context);
        }
        if (elapsedRealtime - wh >= qf) {
            sf(context, (Intent) null, false, false);
        }
        return vj;
    }

    public static void pcc(pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        Map<pcc, Object> map = sf;
        map.remove(pccVar);
        gm.set(map.size());
    }
}
