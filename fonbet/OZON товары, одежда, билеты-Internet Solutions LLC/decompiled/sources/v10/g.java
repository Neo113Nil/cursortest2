package v10;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import l10.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.g f101669a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f101670b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver f101671c;

    public g(@NotNull androidx.recyclerview.widget.g view, @NotNull m callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f101669a = view;
        this.f101670b = callback;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        this.f101671c = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f101670b.invoke();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        ViewTreeObserver viewTreeObserver = this.f101671c;
        boolean isAlive = viewTreeObserver.isAlive();
        androidx.recyclerview.widget.g gVar = this.f101669a;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            gVar.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        gVar.removeOnAttachStateChangeListener(this);
    }
}
