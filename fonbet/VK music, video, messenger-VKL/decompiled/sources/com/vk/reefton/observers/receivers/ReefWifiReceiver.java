package com.vk.reefton.observers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.List;
import xsna.aof0;
import xsna.hof0;

/* compiled from: ReefWifiReceiver.kt */
/* loaded from: classes5.dex */
public final class ReefWifiReceiver extends BroadcastReceiver {
    public final Context a;
    public final hof0 b;
    public final aof0 c;
    public a d;

    /* compiled from: ReefWifiReceiver.kt */
    public interface a {
        void a(List<ScanResult> list);
    }

    public ReefWifiReceiver(Context context, hof0 hof0Var, aof0 aof0Var) {
        this.a = context;
        this.b = hof0Var;
        this.c = aof0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        WifiManager wifiManager;
        a aVar;
        try {
            if (!this.b.b.l("android.permission.ACCESS_WIFI_STATE") || !"android.net.wifi.SCAN_RESULTS".equals(intent.getAction()) || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || (aVar = this.d) == null) {
                return;
            }
            aVar.a(wifiManager.getScanResults());
        } catch (Throwable unused) {
            this.c.b();
        }
    }
}
