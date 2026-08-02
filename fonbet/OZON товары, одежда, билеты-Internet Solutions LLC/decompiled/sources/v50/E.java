package v50;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class E implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<View> f102324a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f102325b;

    public static final class a {
    }

    public E(@NotNull u targetView, @NotNull l action) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f102324a = new WeakReference<>(targetView);
        this.f102325b = action;
        targetView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f102324a.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    this.f102325b.a();
                }
            }
        }
        return true;
    }
}
