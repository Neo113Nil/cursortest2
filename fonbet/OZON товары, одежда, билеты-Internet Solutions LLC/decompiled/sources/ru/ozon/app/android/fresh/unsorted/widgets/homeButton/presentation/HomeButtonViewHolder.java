package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Au.c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.ButtonState;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.ScrollLogic;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000278B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonVO;", "Ll10/i;", "uiContainer", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewModel;Ld20/e;)V", "", "observeButtonState", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "smartScrollToStart", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "smoothScrollToStart", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;)V", "", "targetPosition", "Lkotlin/Function0;", "onScrollComplete", "fastScrollToPosition", "(Landroidx/recyclerview/widget/RecyclerView;ILkotlin/jvm/functions/Function0;)V", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonVO;)V", "onWidgetDestroyed", "onWidgetCreated", "Ll10/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewModel;", "Landroidx/recyclerview/widget/RecyclerView$t;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/recyclerview/widget/RecyclerView$t;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/animation/AnimatorSet;", "fadeOutAnimatorSet", "Landroid/animation/AnimatorSet;", "fadeInAnimatorSet", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "", "isDefaultBehavior", "()Z", "Landroid/widget/ImageView;", "getButton", "()Landroid/widget/ImageView;", "button", "Companion", "TopOffsetSmoothScroller", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeButtonViewHolder extends AbstractC6064a<HomeButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AnimatorSet fadeInAnimatorSet;

    @NotNull
    private final AnimatorSet fadeOutAnimatorSet;

    @NotNull
    private RecyclerView.t listener;

    @NotNull
    private final i uiContainer;

    @NotNull
    private final HomeButtonViewModel viewModel;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewHolder$TopOffsetSmoothScroller;", "Landroidx/recyclerview/widget/r;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getVerticalSnapPreference", "()I", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TopOffsetSmoothScroller extends r {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopOffsetSmoothScroller(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // androidx.recyclerview.widget.r
        protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
            return 30.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r
        protected int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeButtonViewHolder(@NotNull i uiContainer, @NotNull HomeButtonViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(uiContainer, viewFactory);
        Intrinsics.checkNotNullParameter(uiContainer, "uiContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.uiContainer = uiContainer;
        this.viewModel = viewModel;
        this.listener = new RecyclerView.t() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewHolder$listener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                LinearLayoutManager layoutManager;
                HomeButtonViewModel homeButtonViewModel;
                HomeButtonViewModel homeButtonViewModel2;
                boolean isDefaultBehavior;
                HomeButtonViewModel homeButtonViewModel3;
                HomeButtonViewModel homeButtonViewModel4;
                HomeButtonViewModel homeButtonViewModel5;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                layoutManager = HomeButtonViewHolder.this.getLayoutManager();
                if (layoutManager != null) {
                    HomeButtonViewHolder homeButtonViewHolder = HomeButtonViewHolder.this;
                    homeButtonViewModel = homeButtonViewHolder.viewModel;
                    if (homeButtonViewModel.get_bottomPosition() == -1) {
                        homeButtonViewModel5 = homeButtonViewHolder.viewModel;
                        homeButtonViewModel5.setBottomPosition(layoutManager.findLastCompletelyVisibleItemPosition());
                    }
                    int findFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
                    homeButtonViewModel2 = homeButtonViewHolder.viewModel;
                    boolean z11 = findFirstVisibleItemPosition > homeButtonViewModel2.get_bottomPosition();
                    isDefaultBehavior = homeButtonViewHolder.isDefaultBehavior();
                    if (isDefaultBehavior) {
                        homeButtonViewModel4 = homeButtonViewHolder.viewModel;
                        homeButtonViewModel4.updateScrollState(new ScrollLogic.Default(z11));
                    } else {
                        homeButtonViewModel3 = homeButtonViewHolder.viewModel;
                        homeButtonViewModel3.updateScrollState(new ScrollLogic.PDP(z11, dy));
                    }
                }
            }
        };
        this.actionHandler = new ActionHandler.Builder(uiContainer, this).onClick(new HomeButtonViewHolder$actionHandler$1(this)).buildHandler();
        AnimatorSet animatorSet = new AnimatorSet();
        View view = getView();
        Property property = View.SCALE_X;
        AnimatorSet.Builder play = animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
        View view2 = getView();
        Property property2 = View.SCALE_Y;
        play.with(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, 1.0f, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewHolder$fadeOutAnimatorSet$lambda$1$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                HomeButtonViewModel homeButtonViewModel;
                homeButtonViewModel = HomeButtonViewHolder.this.viewModel;
                homeButtonViewModel.updateButtonState(ButtonState.Hidden.INSTANCE);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.fadeOutAnimatorSet = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewHolder$fadeInAnimatorSet$lambda$4$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                ViewExtKt.show(HomeButtonViewHolder.this.getView());
            }
        });
        animatorSet2.play(ObjectAnimator.ofFloat(getView(), (Property<View, Float>) property, 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(getView(), (Property<View, Float>) property2, 0.0f, 1.0f));
        animatorSet2.setDuration(300L);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewHolder$fadeInAnimatorSet$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                HomeButtonViewModel homeButtonViewModel;
                homeButtonViewModel = HomeButtonViewHolder.this.viewModel;
                homeButtonViewModel.updateButtonState(ButtonState.Showed.INSTANCE);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.fadeInAnimatorSet = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$6$lambda$5(HomeButtonViewHolder homeButtonViewHolder, HomeButtonVO homeButtonVO, View view) {
        homeButtonViewHolder.actionHandler.invoke(homeButtonVO.getAction());
    }

    private final void fastScrollToPosition(final RecyclerView recyclerView, final int i11, final Function0<Unit> function0) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            function0.invoke();
        } else {
            linearLayoutManager.scrollToPosition(i11);
            recyclerView.post(new Runnable() { // from class: sx.a
                @Override // java.lang.Runnable
                public final void run() {
                    HomeButtonViewHolder.fastScrollToPosition$lambda$9(LinearLayoutManager.this, this, recyclerView, i11, function0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fastScrollToPosition$lambda$9(LinearLayoutManager linearLayoutManager, HomeButtonViewHolder homeButtonViewHolder, RecyclerView recyclerView, int i11, Function0 function0) {
        if (linearLayoutManager.findFirstVisibleItemPosition() <= 32) {
            function0.invoke();
        } else {
            homeButtonViewHolder.fastScrollToPosition(recyclerView, i11, function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getButton() {
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type android.widget.ImageView");
        return (ImageView) view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayoutManager getLayoutManager() {
        RecyclerView.o layoutManager = this.uiContainer.e0().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDefaultBehavior() {
        HomeButtonVO homeButtonVO = (HomeButtonVO) getBoundData();
        if (homeButtonVO != null) {
            return homeButtonVO.getIsDefaultBehavior();
        }
        return true;
    }

    private final void observeButtonState() {
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getButtonState(), getLifecycle(), AbstractC5434v.b.STARTED), new HomeButtonViewHolder$observeButtonState$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smartScrollToStart(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        Integer num = linearLayoutManager.findFirstVisibleItemPosition() > 16 ? 16 : null;
        if (num != null) {
            fastScrollToPosition(recyclerView, num.intValue(), new HomeButtonViewHolder$smartScrollToStart$1(this, recyclerView, linearLayoutManager));
        } else {
            smoothScrollToStart(recyclerView, linearLayoutManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScrollToStart(RecyclerView recyclerView, final LinearLayoutManager linearLayoutManager) {
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final TopOffsetSmoothScroller topOffsetSmoothScroller = new TopOffsetSmoothScroller(context);
        topOffsetSmoothScroller.setTargetPosition(0);
        recyclerView.post(new Runnable() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.a
            @Override // java.lang.Runnable
            public final void run() {
                LinearLayoutManager.this.startSmoothScroll(topOffsetSmoothScroller);
            }
        });
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        observeButtonState();
        this.uiContainer.e0().addOnScrollListener(this.listener);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.uiContainer.e0().removeOnScrollListener(this.listener);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HomeButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView button = getButton();
        Context L11 = this.uiContainer.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        button.setImageDrawable(ContextExtKt.loadIconByString(L11, item.getIcon()));
        button.setOnClickListener(new c(8, this, item));
    }
}
