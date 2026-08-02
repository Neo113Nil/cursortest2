package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.google.android.gms.cast.internal.Logger;
import defpackage.c2a;
import defpackage.eq3;
import defpackage.wjn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzek implements zzeg {
    public static final Logger l = new Logger("ConnectivityMonitor", null);
    public final zzwo a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final boolean i;
    public final com.facebook.internal.d j;
    public final HashSet k;
    public final c2a b = new c2a(this, 7);
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final Object h = new Object();

    public zzek(Context context, zzwo zzwoVar) {
        this.i = Build.VERSION.SDK_INT >= 31;
        this.j = new com.facebook.internal.d(this, 17);
        this.k = new HashSet();
        this.a = zzwoVar;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        l.a("Start monitoring connectivity changes", new Object[0]);
        if (this.f || (connectivityManager = this.c) == null) {
            return;
        }
        Context context = this.g;
        if (eq3.b(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                b(activeNetwork, linkProperties);
            }
            NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().addTransportType(1);
            if (this.i) {
                addTransportType.setIncludeOtherUidNetworks(true);
            } else {
                context.registerReceiver(this.j, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            connectivityManager.registerNetworkCallback(addTransportType.build(), this.b);
            this.f = true;
        }
    }

    public final void b(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            try {
                l.a("a new network is available", new Object[0]);
                HashMap hashMap = this.d;
                if (hashMap.containsKey(network)) {
                    this.e.remove(network);
                }
                hashMap.put(network, linkProperties);
                this.e.add(network);
            } catch (Throwable th) {
                throw th;
            }
        }
        c();
    }

    public final void c() {
        zzwo zzwoVar = this.a;
        if (zzwoVar == null) {
            return;
        }
        HashSet hashSet = this.k;
        synchronized (hashSet) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    zzef zzefVar = (zzef) it.next();
                    if (!zzwoVar.isShutdown()) {
                        zzwoVar.execute(new wjn(15, this, zzefVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
