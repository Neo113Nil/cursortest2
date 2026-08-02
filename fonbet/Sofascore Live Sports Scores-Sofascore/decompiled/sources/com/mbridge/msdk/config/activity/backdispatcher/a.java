package com.mbridge.msdk.config.activity.backdispatcher;

import android.os.Build;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import defpackage.h90;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    OnBackInvokedCallback a;

    public void a(Window window, b bVar) {
        if (Build.VERSION.SDK_INT < 33 || window == null || bVar == null) {
            return;
        }
        try {
            this.a = new h90(bVar, 7);
            window.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.a);
        } catch (Throwable unused) {
        }
    }

    public void a(Window window) {
        if (Build.VERSION.SDK_INT < 33 || window == null) {
            return;
        }
        try {
            window.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        } catch (Throwable unused) {
        }
    }
}
