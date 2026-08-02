package com.vk.instantjobs.utils;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import xsna.lal;

/* compiled from: BgDataRestrictionDetector.kt */
@TargetApi(24)
/* loaded from: classes.dex */
public final class BgDataRestrictionDetector {
    public final lal a;
    public final ConnectivityManager b;
    public volatile boolean c;

    /* compiled from: BgDataRestrictionDetector.kt */
    public final class BgRestrictionChangeReceiver extends BroadcastReceiver {
        public BgRestrictionChangeReceiver() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        
            if (r0 != 2) goto L11;
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            BgDataRestrictionDetector bgDataRestrictionDetector = BgDataRestrictionDetector.this;
            boolean z = true;
            try {
                ConnectivityManager connectivityManager = bgDataRestrictionDetector.b;
                if (connectivityManager.isActiveNetworkMetered()) {
                    int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                    if (restrictBackgroundStatus != 1) {
                    }
                }
                z = false;
            } catch (SecurityException unused) {
            }
            if (bgDataRestrictionDetector.c != z) {
                bgDataRestrictionDetector.c = z;
                bgDataRestrictionDetector.a.invoke(Boolean.valueOf(z));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4 != 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BgDataRestrictionDetector(Context context, lal lalVar) {
        this.a = lalVar;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.b = connectivityManager;
        boolean z = true;
        try {
            if (connectivityManager.isActiveNetworkMetered()) {
                int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                if (restrictBackgroundStatus != 1) {
                }
            }
            z = false;
        } catch (SecurityException unused) {
        }
        this.c = z;
        context.registerReceiver(new BgRestrictionChangeReceiver(), new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED"));
    }
}
