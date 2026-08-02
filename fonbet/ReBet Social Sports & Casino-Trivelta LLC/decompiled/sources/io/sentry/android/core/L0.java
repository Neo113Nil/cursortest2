package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f50712a;

    public L0() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f50712a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f50712a.post(runnable);
    }

    public L0(Looper looper) {
        this.f50712a = new Handler(looper);
    }
}
