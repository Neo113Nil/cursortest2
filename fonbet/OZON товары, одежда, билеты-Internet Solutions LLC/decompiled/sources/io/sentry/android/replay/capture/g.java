package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.h;

/* loaded from: classes10.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.a f67480a;

    public g(h.a aVar) {
        this.f67480a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67480a.invoke();
    }
}
