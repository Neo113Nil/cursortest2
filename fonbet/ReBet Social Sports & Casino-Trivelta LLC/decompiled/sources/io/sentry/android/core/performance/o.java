package io.sentry.android.core.performance;

import android.view.Window;

/* loaded from: classes3.dex */
public class o extends io.sentry.android.core.internal.gestures.l {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f51263b;

    public o(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.f51263b = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.l, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f51263b.run();
    }
}
