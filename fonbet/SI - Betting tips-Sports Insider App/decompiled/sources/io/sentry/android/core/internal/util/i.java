package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.n0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15724a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f15725b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f15726c;

    public i(View view, Runnable runnable) {
        this.f15725b = new AtomicReference(view);
        this.f15726c = runnable;
    }

    public static void a(Activity activity, Runnable runnable, n0 n0Var) {
        Window window = activity.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null) {
                b(peekDecorView, runnable, n0Var);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.h(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new com.appsflyer.internal.o(5, window, callback, runnable, n0Var)));
            }
        }
    }

    public static void b(View view, Runnable runnable, n0 n0Var) {
        i iVar = new i(view, runnable);
        n0Var.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(iVar);
        } else {
            view.addOnAttachStateChangeListener(new androidx.appcompat.view.menu.e(2, iVar));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f15725b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.h
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                i iVar = i.this;
                iVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(iVar);
            }
        });
        this.f15724a.postAtFrontOfQueue(this.f15726c);
    }
}
