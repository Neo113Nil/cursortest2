package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class i0 implements AppLovinBroadcastManager.Receiver {
    private static final Set c = new HashSet();
    private final j7 a;
    private final com.applovin.impl.sdk.l b;

    private i0(long j, final boolean z, com.applovin.impl.sdk.l lVar, final Runnable runnable) {
        this.a = j7.a(j, z, lVar, new Runnable() { // from class: com.applovin.impl.i0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.a(z, runnable);
            }
        });
        this.b = lVar;
        c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public static i0 a(long j, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return a(j, false, lVar, runnable);
    }

    public long b() {
        return this.a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.a.e();
        }
    }

    public static i0 a(long j, boolean z, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return new i0(j, z, lVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Runnable runnable) {
        if (!z) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        c.remove(this);
    }
}
