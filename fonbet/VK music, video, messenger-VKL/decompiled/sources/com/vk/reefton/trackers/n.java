package com.vk.reefton.trackers;

import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.vk.reefton.observers.receivers.ReefWifiReceiver;
import com.vk.reefton.trackers.l;
import com.vk.reefton.utils.ReefNetworkUtil;
import kotlin.collections.EmptyList;
import xsna.apf0;
import xsna.hof0;
import xsna.l7i;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;
import xsna.xmf0;
import xsna.yof0;

/* compiled from: ReefWifiTracker.kt */
/* loaded from: classes5.dex */
public final class n extends l {
    public final hof0 a;
    public final ReefNetworkUtil b;
    public final WifiManager c;
    public final apf0 d;
    public yof0 e = new yof0(EmptyList.b);

    /* compiled from: ReefWifiTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            hof0 d = qof0Var.d();
            ReefNetworkUtil c = qof0Var.c();
            WifiManager wifiManager = (WifiManager) qof0Var.a.getApplicationContext().getSystemService("wifi");
            apf0 apf0Var = qof0.K;
            if (apf0Var == null) {
                apf0Var = (apf0) qof0.L.invoke(qof0Var);
                qof0.K = apf0Var;
            }
            return new n(d, c, wifiManager, apf0Var);
        }
    }

    public n(hof0 hof0Var, ReefNetworkUtil reefNetworkUtil, WifiManager wifiManager, apf0 apf0Var) {
        this.a = hof0Var;
        this.b = reefNetworkUtil;
        this.c = wifiManager;
        this.d = apf0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new com.vk.movika.sdk.base.ui.m(19, this, vof0Var));
    }

    @Override // com.vk.reefton.trackers.l
    public final void c() {
        apf0 apf0Var = this.d;
        if (apf0Var != null) {
            synchronized (apf0Var) {
                apf0Var.d.remove(this);
                if (apf0Var.d.size() == 0) {
                    ReefWifiReceiver reefWifiReceiver = apf0Var.b;
                    reefWifiReceiver.getClass();
                    try {
                        reefWifiReceiver.a.unregisterReceiver(reefWifiReceiver);
                    } catch (IllegalArgumentException unused) {
                    }
                    reefWifiReceiver.d = null;
                }
            }
        }
    }

    @Override // com.vk.reefton.trackers.l
    public final void f(xmf0 xmf0Var) {
        apf0 apf0Var;
        if (!xmf0Var.a || (apf0Var = this.d) == null) {
            return;
        }
        synchronized (apf0Var) {
            apf0Var.d.add(this);
            if (apf0Var.d.size() == 1) {
                ReefWifiReceiver reefWifiReceiver = apf0Var.b;
                reefWifiReceiver.d = apf0Var;
                reefWifiReceiver.a.registerReceiver(reefWifiReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            }
        }
    }
}
