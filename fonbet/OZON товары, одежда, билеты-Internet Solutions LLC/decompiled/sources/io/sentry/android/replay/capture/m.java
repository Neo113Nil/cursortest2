package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.n;

/* loaded from: classes10.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n.a f67501a;

    public m(n.a aVar) {
        this.f67501a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67501a.invoke();
    }
}
