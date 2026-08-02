package bd;

import Lc.q;
import ad.C1933a;
import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.swmansion.rnscreens.C3825p;
import com.swmansion.rnscreens.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e extends CoordinatorLayout implements ReactPointerEventsView {

    /* renamed from: u, reason: collision with root package name */
    public final Y f25016u;

    /* renamed from: v, reason: collision with root package name */
    public final ReactPointerEventsView f25017v;

    /* renamed from: w, reason: collision with root package name */
    public final Animation.AnimationListener f25018w;

    public static final class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            e.this.getFragment$react_native_screens_release().p0();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            e.this.getFragment$react_native_screens_release().q0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Y fragment, ReactPointerEventsView pointerEventsImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        this.f25016u = fragment;
        this.f25017v = pointerEventsImpl;
        this.f25018w = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    @NotNull
    public final Y getFragment$react_native_screens_release() {
        return this.f25016u;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return this.f25017v.getPointerEvents();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsets(...)");
        return onApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (q.e(this.f25016u.b())) {
            this.f25016u.b().u(z10);
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        C1933a c1933a = new C1933a(this.f25016u);
        c1933a.setDuration(animation.getDuration());
        if ((animation instanceof AnimationSet) && !this.f25016u.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(c1933a);
            animationSet.setAnimationListener(this.f25018w);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(c1933a);
        animationSet2.setAnimationListener(this.f25018w);
        super.startAnimation(animationSet2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, Y fragment) {
        this(context, fragment, new C3825p());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
