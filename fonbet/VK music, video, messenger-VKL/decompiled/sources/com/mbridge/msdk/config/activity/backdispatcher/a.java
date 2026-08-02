package com.mbridge.msdk.config.activity.backdispatcher;

import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: MBOnBackInvokedDispatcher.java */
/* loaded from: classes13.dex */
public class a {
    OnBackInvokedCallback a;

    public void a(Window window, final b bVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || window == null || bVar == null) {
            return;
        }
        try {
            this.a = new OnBackInvokedCallback() { // from class: xsna.n8y0
                public final void onBackInvoked() {
                    com.mbridge.msdk.config.activity.backdispatcher.b.this.a();
                }
            };
            onBackInvokedDispatcher = window.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.a);
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "registerOnBackInvokedCallback error");
        }
    }

    public void a(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || window == null) {
            return;
        }
        try {
            onBackInvokedDispatcher = window.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "unregisterOnBackInvokedCallback error");
        }
    }
}
