package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.C4683i0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class r implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f51148a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f51149b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f51150c;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(r.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f51152a;

        public b(View view) {
            this.f51152a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f51152a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f51152a.getViewTreeObserver().removeOnDrawListener(r.this);
        }
    }

    public r(View view, Runnable runnable) {
        this.f51149b = new AtomicReference(view);
        this.f51150c = runnable;
    }

    public static /* synthetic */ void a(Window window, Window.Callback callback, Runnable runnable, C4683i0 c4683i0) {
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            window.setCallback(callback);
            d(peekDecorView, runnable, c4683i0);
        }
    }

    public static boolean b(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void c(Activity activity, final Runnable runnable, final C4683i0 c4683i0) {
        final Window window = activity.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null) {
                d(peekDecorView, runnable, c4683i0);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.o(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new Runnable() { // from class: io.sentry.android.core.internal.util.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a(window, callback, runnable, c4683i0);
                    }
                }));
            }
        }
    }

    public static void d(View view, Runnable runnable, C4683i0 c4683i0) {
        r rVar = new r(view, runnable);
        if (c4683i0.d() >= 26 || b(view)) {
            view.getViewTreeObserver().addOnDrawListener(rVar);
        } else {
            view.addOnAttachStateChangeListener(rVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        View view = (View) this.f51149b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new b(view));
        this.f51148a.postAtFrontOfQueue(this.f51150c);
    }
}
