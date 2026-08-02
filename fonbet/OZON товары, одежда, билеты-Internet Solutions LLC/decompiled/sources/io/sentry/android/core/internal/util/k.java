package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.I;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f67211a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<View> f67212b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Runnable f67213c;

    private k(@NotNull View view, @NotNull Runnable runnable) {
        this.f67212b = new AtomicReference<>(view);
        this.f67213c = runnable;
    }

    public static void a(@NotNull Activity activity, @NotNull Runnable runnable, @NotNull I i11) {
        Window window = activity.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null) {
                b(peekDecorView, runnable, i11);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.m(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new i(window, callback, runnable, i11)));
            }
        }
    }

    public static void b(@NotNull View view, @NotNull Runnable runnable, @NotNull I i11) {
        k kVar = new k(view, runnable);
        i11.getClass();
        view.getViewTreeObserver().addOnDrawListener(kVar);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.f67212b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.j
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                k kVar = k.this;
                kVar.getClass();
                andSet.getViewTreeObserver().removeOnDrawListener(kVar);
            }
        });
        this.f67211a.postAtFrontOfQueue(this.f67213c);
    }
}
