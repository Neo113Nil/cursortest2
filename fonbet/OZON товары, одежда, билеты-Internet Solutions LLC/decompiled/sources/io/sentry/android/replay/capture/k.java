package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.l;

/* loaded from: classes10.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l.a f67494a;

    public k(l.a aVar) {
        this.f67494a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67494a.invoke();
    }
}
