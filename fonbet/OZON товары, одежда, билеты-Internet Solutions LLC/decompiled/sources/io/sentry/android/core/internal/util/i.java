package io.sentry.android.core.internal.util;

import android.view.View;
import android.view.Window;
import io.sentry.android.core.I;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f67205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Window.Callback f67206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f67207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f67208d;

    public /* synthetic */ i(Window window, Window.Callback callback, Runnable runnable, I i11) {
        this.f67205a = window;
        this.f67206b = callback;
        this.f67207c = runnable;
        this.f67208d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.f67205a;
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            window.setCallback(this.f67206b);
            k.b(peekDecorView, this.f67207c, this.f67208d);
        }
    }
}
