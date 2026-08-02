package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.eq3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    ConnectivityManager b;
    b c;
    boolean d;
    private final List<com.mbridge.msdk.config.component.status.a> a = new CopyOnWriteArrayList();
    private final ConnectivityManager.NetworkCallback e = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean hasTransport = networkCapabilities.hasTransport(1);
            boolean hasTransport2 = networkCapabilities.hasTransport(0);
            int i = hasTransport ? 9 : -1;
            if (hasTransport2) {
                i = c.this.c();
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(i));
            bVar.a(hashMap);
            c.this.a(bVar);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(c.this.c()));
            bVar.a(hashMap);
            c.this.a(bVar);
        }
    }

    public c() {
        a(com.mbridge.msdk.foundation.controller.c.n().d());
        a();
    }

    private void a() {
        int b2 = eq3.b(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_PHONE_STATE");
        if (Build.VERSION.SDK_INT < 33) {
            this.d = b2 == 0;
            return;
        }
        int b3 = eq3.b(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_BASIC_PHONE_STATE");
        if (b2 != 0 && b3 != 0) {
            r3 = false;
        }
        this.d = r3;
    }

    public void b() {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager == null) {
            connectivityManager = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
            this.b = connectivityManager;
        }
        connectivityManager.unregisterNetworkCallback(this.e);
        this.b = null;
    }

    public int c() {
        NetworkInfo activeNetworkInfo;
        if (this.d) {
            TelephonyManager telephonyManager = (TelephonyManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("phone");
            return m0.c(telephonyManager != null ? telephonyManager.getDataNetworkType() : 0);
        }
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return m0.c(activeNetworkInfo.getSubtype());
    }

    public void d() {
        if (this.a.isEmpty()) {
            b();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                int c = c.this.c();
                com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
                bVar.b("916002");
                HashMap hashMap = new HashMap();
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(c));
                bVar.a(hashMap);
                c.this.a(bVar);
            } catch (Throwable th) {
                q0.b("MBNetworkEventPublisher", th.getMessage());
            }
        }

        public /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        this.a.remove(aVar);
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar == null || this.a.contains(aVar)) {
            return;
        }
        this.a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("MBNetworkEventPublisher", th.getMessage());
        }
    }

    private void a(Context context) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(11).addCapability(12).build(), this.e);
    }
}
