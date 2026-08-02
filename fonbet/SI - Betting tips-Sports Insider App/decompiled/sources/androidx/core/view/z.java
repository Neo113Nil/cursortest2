package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f1410a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f1411b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f1412c;

    public z(View view, Runnable runnable) {
        this.f1410a = view;
        this.f1411b = view.getViewTreeObserver();
        this.f1412c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        z zVar = new z(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(zVar);
        view.addOnAttachStateChangeListener(zVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f1411b.isAlive()) {
            this.f1411b.removeOnPreDrawListener(this);
        } else {
            this.f1410a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1410a.removeOnAttachStateChangeListener(this);
        this.f1412c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1411b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f1411b.isAlive()) {
            this.f1411b.removeOnPreDrawListener(this);
        } else {
            this.f1410a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1410a.removeOnAttachStateChangeListener(this);
    }
}
