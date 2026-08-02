package ru.ozon.app.android.tabbar.feature.tab.boutique;

import Sc.InterfaceC3999a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.feature.tab.boutique.BoutiqueTabUiController;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010)\u001a\u0004\u0018\u00010(8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/boutique/BoutiqueTabUiController;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Landroidx/fragment/app/m;)V", "Landroid/os/Handler;", "", "delay", "Lkotlin/Function0;", "", "callback", "waitUntilWindowHasFocus", "(Landroid/os/Handler;JLkotlin/jvm/functions/Function0;)V", "showBadgeWithAnimation", "()V", "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "tabView", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "showBadgeWithAnimationActual", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "cancelAnimation", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "item", "onBind", "(Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;)V", "onAnimation", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;)V", "onStaticBadgeUpdated", "onDestroy", "handler", "Landroid/os/Handler;", "Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/r;", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Landroid/animation/ValueAnimator;", "indicatorAnimation", "Landroid/animation/ValueAnimator;", "getIndicatorAnimation", "()Landroid/animation/ValueAnimator;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BoutiqueTabUiController extends TabUiController {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static boolean indicatorAnimationCompleted;

    @NotNull
    private final r activity;
    private AnimatorSet animatorSet;

    @NotNull
    private final Handler handler;
    private ValueAnimator indicatorAnimation;
    private BottomNavigationItem item;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/boutique/BoutiqueTabUiController$Companion;", "", "<init>", "()V", "", "START_VALUE", "F", "END_VALUE", "", "START_TIMER_DELAY", "J", "TIMER_PERIODIC_DELAY", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoutiqueTabUiController(@NotNull ComponentCallbacksC5392m fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.handler = new Handler(Looper.getMainLooper());
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.activity = requireActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAnimation() {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.animatorSet = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    private final ValueAnimator getIndicatorAnimation() {
        BaseOzonBottomTabView tabView;
        if (indicatorAnimationCompleted || (tabView = getTabView()) == null) {
            return null;
        }
        if (this.indicatorAnimation == null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tabView, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 0.01f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 0.01f, 1.0f));
            ofPropertyValuesHolder.setDuration(400L);
            ofPropertyValuesHolder.setInterpolator(new BounceInterpolator());
            ofPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.tabbar.feature.tab.boutique.BoutiqueTabUiController$_get_indicatorAnimation_$lambda$2$$inlined$addListener$default$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                    BoutiqueTabUiController.Companion unused;
                    unused = BoutiqueTabUiController.Companion;
                    BoutiqueTabUiController.indicatorAnimationCompleted = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    BoutiqueTabUiController.Companion unused;
                    unused = BoutiqueTabUiController.Companion;
                    BoutiqueTabUiController.indicatorAnimationCompleted = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
            this.indicatorAnimation = ofPropertyValuesHolder;
        }
        return this.indicatorAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBadgeWithAnimation() {
        IndicatorDTO indicator;
        BaseOzonBottomTabView tabView;
        BottomNavigationItem bottomNavigationItem = this.item;
        if (bottomNavigationItem == null || (indicator = bottomNavigationItem.getIndicator()) == null || (tabView = getTabView()) == null) {
            return;
        }
        showBadgeWithAnimationActual(tabView, indicator);
    }

    private final void showBadgeWithAnimationActual(BaseOzonBottomTabView tabView, IndicatorDTO indicator) {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        BaseOzonBottomTabView.bindBadge$default(tabView, indicator, null, 2, null);
        ValueAnimator indicatorAnimation = getIndicatorAnimation();
        if (indicatorAnimation == null) {
            tabView.setScaleX(1.0f);
            tabView.setScaleY(1.0f);
            return;
        }
        tabView.setScaleX(0.0f);
        tabView.setScaleY(0.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(indicatorAnimation);
        animatorSet2.start();
        this.animatorSet = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void waitUntilWindowHasFocus(final Handler handler, long j11, final Function0<Unit> function0) {
        this.handler.postDelayed(new Runnable() { // from class: YL.a
            @Override // java.lang.Runnable
            public final void run() {
                BoutiqueTabUiController.waitUntilWindowHasFocus$lambda$4(BoutiqueTabUiController.this, function0, handler);
            }
        }, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilWindowHasFocus$lambda$4(BoutiqueTabUiController boutiqueTabUiController, Function0 function0, Handler handler) {
        if (boutiqueTabUiController.activity.hasWindowFocus()) {
            function0.invoke();
        } else {
            boutiqueTabUiController.waitUntilWindowHasFocus(handler, 1000L, function0);
        }
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onAnimation(@NotNull BaseOzonBottomTabView tabView, @NotNull BottomNavigationItem item) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        Intrinsics.checkNotNullParameter(item, "item");
        waitUntilWindowHasFocus(this.handler, 2000L, new BoutiqueTabUiController$onAnimation$1(this));
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onBind(@NotNull BottomNavigationItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind(item);
        this.item = item;
        final BaseOzonBottomTabView tabView = getTabView();
        if (tabView != null) {
            if (tabView.isAttachedToWindow()) {
                tabView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.tabbar.feature.tab.boutique.BoutiqueTabUiController$onBind$$inlined$doOnDetach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View view) {
                        tabView.removeOnAttachStateChangeListener(this);
                        BaseOzonBottomTabView tabView2 = this.getTabView();
                        if (tabView2 != null) {
                            BaseOzonBottomTabView.removeBadge$default(tabView2, null, 1, null);
                        }
                        this.cancelAnimation();
                    }
                });
                return;
            }
            BaseOzonBottomTabView tabView2 = getTabView();
            if (tabView2 != null) {
                BaseOzonBottomTabView.removeBadge$default(tabView2, null, 1, null);
            }
            cancelAnimation();
        }
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onDestroy() {
        super.onDestroy();
        cancelAnimation();
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onStaticBadgeUpdated(@NotNull BaseOzonBottomTabView tabView, IndicatorDTO indicator) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        if (indicator == null) {
            BaseOzonBottomTabView.removeBadge$default(tabView, null, 1, null);
            cancelAnimation();
        } else if (indicatorAnimationCompleted) {
            showBadgeWithAnimationActual(tabView, indicator);
        } else if (OzonBottomNavigationTabViewExtKt.hasAnimation(tabView)) {
            OzonBottomNavigationTabViewExtKt.whenAnimationCompleted(tabView, new BoutiqueTabUiController$onStaticBadgeUpdated$1(this));
        } else {
            waitUntilWindowHasFocus(this.handler, 2000L, new BoutiqueTabUiController$onStaticBadgeUpdated$2(this));
        }
    }
}
