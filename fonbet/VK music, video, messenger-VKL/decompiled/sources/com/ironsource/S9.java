package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes13.dex */
public final class S9 extends HandlerThread {
    private Handler a;

    public S9(String str) {
        super(str);
    }

    public final void a(Runnable runnable) {
        a(this, runnable, 0L, 2, null);
    }

    public final void b(Runnable runnable) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static /* synthetic */ void a(S9 s9, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        s9.a(runnable, j);
    }

    public final void a(Runnable runnable, long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }
}
