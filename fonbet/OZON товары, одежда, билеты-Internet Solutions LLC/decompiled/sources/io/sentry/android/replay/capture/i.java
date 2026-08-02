package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.j;

/* loaded from: classes10.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j.a f67487a;

    public i(j.a aVar) {
        this.f67487a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67487a.invoke();
    }
}
