package ed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class f extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public Function3 f45942a;

    /* renamed from: b, reason: collision with root package name */
    public C4201a f45943b;

    /* renamed from: c, reason: collision with root package name */
    public c f45944c;

    public f(Context context) {
        super(context);
    }

    public final void o() {
        C4201a e10;
        Function3 function3 = this.f45942a;
        if (function3 == null || (e10 = h.e(this)) == null) {
            return;
        }
        View rootView = getRootView();
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        c a10 = h.a((ViewGroup) rootView, this);
        if (a10 == null) {
            return;
        }
        if (Intrinsics.areEqual(this.f45943b, e10) && Intrinsics.areEqual(this.f45944c, a10)) {
            return;
        }
        function3.invoke(this, e10, a10);
        this.f45943b = e10;
        this.f45944c = a10;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        o();
        return true;
    }

    public final void setOnInsetsChangeHandler(@Nullable Function3<? super f, ? super C4201a, ? super c, Unit> function3) {
        this.f45942a = function3;
        o();
    }
}
