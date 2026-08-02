package io.sentry.android.core.performance;

import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m extends io.sentry.android.core.internal.gestures.i {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.i f67346b;

    public m(@NotNull Window.Callback callback, @NotNull io.sentry.android.core.internal.util.i iVar) {
        super(callback);
        this.f67346b = iVar;
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.f67346b.run();
    }
}
