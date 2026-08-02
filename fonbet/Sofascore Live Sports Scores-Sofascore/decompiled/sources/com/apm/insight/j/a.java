package com.apm.insight.j;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a implements Runnable {
    private Handler a;
    private final long b = 0;
    private final long c;

    public a(Handler handler, long j) {
        this.a = handler;
        this.c = j;
    }

    public final void a(long j) {
        Handler handler = this.a;
        if (j > 0) {
            handler.postDelayed(this, j);
        } else {
            handler.post(this);
        }
    }

    public final long b() {
        return this.c;
    }

    public final void a() {
        this.a.post(this);
    }
}
