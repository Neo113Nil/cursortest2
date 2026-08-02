package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.f;

/* loaded from: classes10.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f.a f67473a;

    public e(f.a aVar) {
        this.f67473a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67473a.invoke();
    }
}
