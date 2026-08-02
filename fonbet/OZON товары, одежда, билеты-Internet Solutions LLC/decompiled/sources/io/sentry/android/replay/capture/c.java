package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.d;

/* loaded from: classes10.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d.a f67466a;

    public c(d.a aVar) {
        this.f67466a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67466a.invoke();
    }
}
