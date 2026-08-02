package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class M implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f19167a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f19168b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f19169c;

    public M(View view, Runnable runnable) {
        this.f19167a = view;
        this.f19168b = view.getViewTreeObserver();
        this.f19169c = runnable;
    }

    public static M a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        M m10 = new M(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(m10);
        view.addOnAttachStateChangeListener(m10);
        return m10;
    }

    public void b() {
        if (this.f19168b.isAlive()) {
            this.f19168b.removeOnPreDrawListener(this);
        } else {
            this.f19167a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f19167a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f19169c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f19168b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
