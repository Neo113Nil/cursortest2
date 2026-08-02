package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes13.dex */
final class A5 extends HandlerThread {
    private Handler a;

    public A5(String str) {
        super(str);
    }

    public final void a(Runnable runnable) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }
}
