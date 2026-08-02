package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.Y;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u001c\u0010\u0012\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyAnimator;", "", "view", "Landroid/view/View;", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "<init>", "(Landroid/view/View;Lcom/google/android/material/appbar/AppBarLayout;)V", "currentAnimator", "Landroid/view/ViewPropertyAnimator;", "enterInterpolator", "Landroid/view/animation/DecelerateInterpolator;", "exitInterpolator", "Landroid/view/animation/AccelerateInterpolator;", "hide", "", "show", "clearAnimation", "animateChildTo", "targetY", "", "interpolator", "Landroid/animation/TimeInterpolator;", "computeTargetY", "toolbarHeight", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSortSwitcherStickyAnimator {
    private final AppBarLayout appBar;
    private ViewPropertyAnimator currentAnimator;

    @NotNull
    private final DecelerateInterpolator enterInterpolator;

    @NotNull
    private final AccelerateInterpolator exitInterpolator;

    @NotNull
    private final View view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyAnimator$Companion;", "", "<init>", "()V", "DURATION", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SellerSortSwitcherStickyAnimator(@NotNull View view, AppBarLayout appBarLayout) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.appBar = appBarLayout;
        this.enterInterpolator = new DecelerateInterpolator();
        this.exitInterpolator = new AccelerateInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateChildTo(View view, float f7, TimeInterpolator timeInterpolator) {
        this.currentAnimator = view.animate().translationY(f7).setInterpolator(timeInterpolator).setDuration(250L).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky.SellerSortSwitcherStickyAnimator$animateChildTo$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SellerSortSwitcherStickyAnimator.this.currentAnimator = null;
            }
        });
    }

    private final void clearAnimation() {
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.view.clearAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float computeTargetY(float toolbarHeight) {
        return this.view.getMeasuredHeight() - (toolbarHeight != 0.0f ? Math.abs(this.view.getMeasuredHeight() - toolbarHeight) : 0.0f);
    }

    public final void hide() {
        clearAnimation();
        AppBarLayout appBarLayout = this.appBar;
        if (appBarLayout != null) {
            int i11 = Y.f42258g;
            if (!appBarLayout.isLaidOut() || appBarLayout.isLayoutRequested()) {
                appBarLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky.SellerSortSwitcherStickyAnimator$hide$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        SellerSortSwitcherStickyAnimator sellerSortSwitcherStickyAnimator = SellerSortSwitcherStickyAnimator.this;
                        sellerSortSwitcherStickyAnimator.animateChildTo(sellerSortSwitcherStickyAnimator.view, -SellerSortSwitcherStickyAnimator.this.computeTargetY(view.getMeasuredHeight()), SellerSortSwitcherStickyAnimator.this.exitInterpolator);
                    }
                });
            } else {
                animateChildTo(this.view, -computeTargetY(appBarLayout.getMeasuredHeight()), this.exitInterpolator);
            }
        }
    }

    public final void show() {
        clearAnimation();
        AppBarLayout appBarLayout = this.appBar;
        if (appBarLayout != null) {
            int i11 = Y.f42258g;
            if (!appBarLayout.isLaidOut() || appBarLayout.isLayoutRequested()) {
                appBarLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky.SellerSortSwitcherStickyAnimator$show$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        SellerSortSwitcherStickyAnimator sellerSortSwitcherStickyAnimator = SellerSortSwitcherStickyAnimator.this;
                        sellerSortSwitcherStickyAnimator.animateChildTo(sellerSortSwitcherStickyAnimator.view, SellerSortSwitcherStickyAnimator.this.computeTargetY(view.getMeasuredHeight()), SellerSortSwitcherStickyAnimator.this.enterInterpolator);
                    }
                });
            } else {
                animateChildTo(this.view, computeTargetY(appBarLayout.getMeasuredHeight()), this.enterInterpolator);
            }
        }
    }
}
