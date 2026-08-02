package com.vk.api.internal.utils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.vk.core.utils.newtork.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.bpn0;
import xsna.enj;
import xsna.s3q0;

/* compiled from: NetworkBroadcastReceiver.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class NetworkBroadcastReceiver extends BroadcastReceiver {
    public static Context d;
    public static volatile boolean e;
    public static final NetworkBroadcastReceiver a = new NetworkBroadcastReceiver();
    public static final Object b = new Object();
    public static final Set<Object> c = Collections.newSetFromMap(new WeakHashMap());
    public static final IntentFilter f = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");

    private NetworkBroadcastReceiver() {
    }

    public static final void a(Object obj) {
        synchronized (b) {
            c.add(obj);
        }
    }

    public static boolean b() {
        NetworkInfo activeNetworkInfo;
        b.a.getClass();
        if (b.e()) {
            return b.d();
        }
        Context context = d;
        if (context == null) {
            context = null;
        }
        bpn0 bpn0Var = enj.a;
        ConnectivityManager connectivityManager = (ConnectivityManager) (context != null ? context.getSystemService("connectivity") : null);
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public static void c() {
        synchronized (b) {
            try {
                for (Object obj : c) {
                    synchronized (obj) {
                        obj.notifyAll();
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !f.hasAction(intent.getAction())) {
            return;
        }
        b.a.getClass();
        if (b.e()) {
            return;
        }
        c();
    }
}
