package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public g0 f6122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f6123b;

    public f0(g0 g0Var, g0 g0Var2) {
        this.f6123b = g0Var;
        this.f6122a = g0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f6123b.f6130a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:14:0x0018, B:16:0x001e, B:21:0x002a, B:22:0x0034), top: B:2:0x0001 }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onReceive(Context context, Intent intent) {
        boolean z5;
        try {
            g0 g0Var = this.f6122a;
            if (g0Var == null) {
                return;
            }
            if (g0Var.d()) {
                if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                    z5 = false;
                    if (z5) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    g0 g0Var2 = this.f6122a;
                    g0Var2.f6133d.f6118f.schedule(g0Var2, 0L, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f6122a = null;
                }
                z5 = true;
                if (z5) {
                }
                g0 g0Var22 = this.f6122a;
                g0Var22.f6133d.f6118f.schedule(g0Var22, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f6122a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
