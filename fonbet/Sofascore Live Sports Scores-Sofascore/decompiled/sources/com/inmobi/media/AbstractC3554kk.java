package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3554kk {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static C3528jk b;
    public static boolean c;

    public static void a(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        try {
            intent.getAction();
            boolean z = false;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z = true;
                        }
                        c = z;
                        ((Kc) AbstractC3424fj.e.getValue()).b(new N2(10, 4, c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    F5.a.getClass();
                    if (F5.y()) {
                        z = powerManager.isDeviceIdleMode();
                    }
                }
                if (z != c) {
                    F5.a.getClass();
                    if (F5.y()) {
                        ((Kc) AbstractC3424fj.e.getValue()).b(new N2(11, 4, String.valueOf(z)));
                        return;
                    }
                    return;
                }
                return;
            }
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                ((Kc) AbstractC3424fj.e.getValue()).b(new N2(100, 6, (String) null));
                return;
            }
            if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
                ((Kc) AbstractC3424fj.e.getValue()).b(new N2(1, 6, (String) null));
                Iterator it = a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                a.clear();
                b = null;
                return;
            }
            if (!"android.intent.action.REBOOT".equals(intent.getAction())) {
                ((Kc) AbstractC3424fj.e.getValue()).b(new N2(99, 4, intent.getAction()));
                return;
            }
            ((Kc) AbstractC3424fj.e.getValue()).b(new N2(2, 6, (String) null));
            Iterator it2 = a.entrySet().iterator();
            while (it2.hasNext()) {
                b((String) ((Map.Entry) it2.next()).getKey());
            }
            a.clear();
            b = null;
        } catch (Exception unused) {
        }
    }

    public static void b(String str) {
        Context context = AbstractC3424fj.a;
        if (context != null) {
            F5.a.getClass();
            if (!F5.r() || !"SYSTEM_CONNECTIVITY_CHANGE".equals(str) || b == null) {
                ConcurrentHashMap concurrentHashMap = a;
                if (concurrentHashMap.get(str) != null) {
                    context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                    concurrentHashMap.remove(str);
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                C3528jk c3528jk = b;
                c3528jk.getClass();
                connectivityManager.unregisterNetworkCallback(c3528jk);
                b = null;
            }
        }
    }

    public static void b() {
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        F5.a.getClass();
        if (F5.y()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (F5.r()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void a() {
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        F5.a.getClass();
        if (F5.y()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (F5.r()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        a.clear();
    }

    public static void a(String str) {
        Context context = AbstractC3424fj.a;
        if (context != null) {
            F5.a.getClass();
            if (F5.r() && "SYSTEM_CONNECTIVITY_CHANGE".equals(str)) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    C3528jk c3528jk = new C3528jk();
                    b = c3528jk;
                    connectivityManager.registerDefaultNetworkCallback(c3528jk);
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = a;
            if (concurrentHashMap.get(str) == null) {
                C3502ik c3502ik = new C3502ik();
                concurrentHashMap.put(str, c3502ik);
                N3.a(context, c3502ik, new IntentFilter(str));
            }
        }
    }
}
