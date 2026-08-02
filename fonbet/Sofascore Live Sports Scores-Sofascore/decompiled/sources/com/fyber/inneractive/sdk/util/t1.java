package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t1 extends Handler {
    public final WeakReference a;

    public t1(v1 v1Var) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(v1Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        v1 v1Var = (v1) this.a.get();
        if (v1Var == null || message.what != 1932593528 || v1Var.d) {
            return;
        }
        v1Var.a(message.getWhen());
    }
}
