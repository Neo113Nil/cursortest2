package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Hj.C3143a;
import Qx.a;
import Sc.o;
import T00.j;
import T00.m;
import Vg.d;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfState;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.utils.RecShelfKeys;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollDTO;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 N2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001NB5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0013J\u001b\u0010$\u001a\u00020\u0011*\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010\u0013J\u0015\u0010)\u001a\u0004\u0018\u00010\"*\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\u00020,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0002¢\u0006\u0004\b2\u0010\u0013J\u001d\u00105\u001a\u00020\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001103H\u0002¢\u0006\u0004\b5\u00106J9\u0010=\u001a\n <*\u0004\u0018\u00010;0;2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000103H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00110B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/widget/FrameLayout;", "containerView", "Ll10/i;", "screenContainer", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/widget/FrameLayout;Ll10/i;Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewModel;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "onAttach", "()V", "onDetach", "onRecycle", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState;", "state", "bindState", "(Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState;)V", "hideWithShimmer", "resolveShimmer", "Lru/ozon/composer/ui/widget/l;", "skusViewItem", "addSkuScroll", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "subscribeToWidgetUpdates", "unsubscribeFromWidgetUpdates", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "generateViewItem", "(Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;)Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;", "", "hasSavedScroll", "(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;)Z", "Landroid/view/View;", "setupSkuScroll", "(Landroid/view/View;)Landroid/view/View;", "animateShimmerAppearance", "Lkotlin/Function0;", "onAnimationEnd", "animateShimmerDisappearance", "(Lkotlin/jvm/functions/Function0;)V", "", "startValue", "endValue", "onEndAction", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "createAnimator", "(IILkotlin/jvm/functions/Function0;)Landroid/animation/ValueAnimator;", "Landroid/widget/FrameLayout;", "Ll10/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "widgetUpdatesCollector", "Lxe/B0;", "onDetachDelegate", "Lkotlin/jvm/functions/Function0;", "onRecycleDelegate", "currentAnimator", "Landroid/animation/ValueAnimator;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecShelfViewHolder extends k<RecShelfVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FrameLayout containerView;
    private ValueAnimator currentAnimator;

    @NotNull
    private Function0<Unit> onDetachDelegate;

    @NotNull
    private Function0<Unit> onRecycleDelegate;
    private final i screenContainer;

    @NotNull
    private final RecShelfViewModel viewModel;
    private B0 widgetUpdatesCollector;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int shimmerHeight = ResourceExtKt.toPx(140);
    private static final int initialHeight = ResourceExtKt.toPx(1);
    private static final float skuScrollRadius = ResourceExtKt.toPxF(24);
    private static final int skuScrollVerticalPadding = ResourceExtKt.toPx(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewHolder$Companion;", "", "<init>", "()V", "", "skuScrollRadius", "F", "getSkuScrollRadius", "()F", "", "SHIMMER_POSITION", "I", "SHELF_POSITION", "", "ANIMATION_DURATION", "J", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getSkuScrollRadius() {
            return RecShelfViewHolder.skuScrollRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecShelfViewHolder(@NotNull FrameLayout containerView, i iVar, @NotNull RecShelfViewModel viewModel, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.screenContainer = iVar;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new RecShelfViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.onDetachDelegate = RecShelfViewHolder$onDetachDelegate$1.INSTANCE;
        this.onRecycleDelegate = RecShelfViewHolder$onRecycleDelegate$1.INSTANCE;
    }

    private final void addSkuScroll(i iVar, l lVar) {
        ru.ozon.composer.ui.widget.i iVar2 = new ru.ozon.composer.ui.widget.i(this.containerView, iVar);
        View childAt = this.containerView.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        childAt.setVisibility(8);
        if (this.containerView.getChildCount() > 1) {
            this.containerView.removeViewAt(1);
        }
        iVar.d0().c(iVar2, lVar);
        k<c> f7 = iVar.d0().f(iVar2, lVar.j());
        if (f7 != null) {
            f7.setLifecycleState(AbstractC5434v.b.CREATED);
            f7.bindTrackingData(lVar, lVar.n(), iVar.c0());
            f7.track(lVar);
            k.bindItem$default(f7, lVar.d(), lVar.c(), null, 4, null);
            this.onDetachDelegate = new RecShelfViewHolder$addSkuScroll$1$1(f7);
            this.onRecycleDelegate = new RecShelfViewHolder$addSkuScroll$1$2(f7);
            FrameLayout frameLayout = this.containerView;
            View itemView = f7.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            frameLayout.addView(setupSkuScroll(itemView));
        }
    }

    private final void animateShimmerAppearance() {
        this.itemView.getLayoutParams().height = initialHeight;
        this.itemView.requestLayout();
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (!itemView.isLaidOut() || itemView.isLayoutRequested()) {
            itemView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewHolder$animateShimmerAppearance$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    RecShelfViewHolder recShelfViewHolder = RecShelfViewHolder.this;
                    recShelfViewHolder.currentAnimator = recShelfViewHolder.createAnimator(RecShelfViewHolder.initialHeight, RecShelfViewHolder.shimmerHeight, new RecShelfViewHolder$animateShimmerAppearance$1$1(RecShelfViewHolder.this));
                    ValueAnimator valueAnimator = RecShelfViewHolder.this.currentAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            });
            return;
        }
        this.currentAnimator = createAnimator(initialHeight, shimmerHeight, new RecShelfViewHolder$animateShimmerAppearance$1$1(this));
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    private final void animateShimmerDisappearance(Function0<Unit> onAnimationEnd) {
        final ValueAnimator createAnimator = createAnimator(this.itemView.getHeight(), initialHeight, onAnimationEnd);
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            createAnimator.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.currentAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewHolder$animateShimmerDisappearance$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    createAnimator.start();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
    }

    private final void bindState(RecShelfState state) {
        l skuScrollViewItem;
        i iVar;
        l skuScrollViewItem2;
        AtomAction.Click getRecShelfAction;
        Map<String, String> params;
        RecShelfVO boundData = getBoundData();
        String str = (boundData == null || (getRecShelfAction = boundData.getGetRecShelfAction()) == null || (params = getRecShelfAction.getParams()) == null) ? null : params.get(RecShelfKeys.GET_REC_SHELF_SHELF_ID_PARAMETER.getKey());
        if (str == null) {
            str = "";
        }
        if (Intrinsics.d(state.getShelfId(), str)) {
            if (state instanceof RecShelfState.Close) {
                animateShimmerDisappearance(new RecShelfViewHolder$bindState$1(this));
                return;
            }
            if (!(state instanceof RecShelfState.ShowSkus)) {
                throw new o();
            }
            RecShelfVO boundData2 = getBoundData();
            Object d11 = (boundData2 == null || (skuScrollViewItem2 = boundData2.getSkuScrollViewItem()) == null) ? null : skuScrollViewItem2.d();
            SkuThinScrollVO skuThinScrollVO = d11 instanceof SkuThinScrollVO ? (SkuThinScrollVO) d11 : null;
            if (skuThinScrollVO == null || !hasSavedScroll(skuThinScrollVO)) {
                RecShelfVO boundData3 = getBoundData();
                if (boundData3 != null) {
                    boundData3.setSkuScrollViewItem(generateViewItem(((RecShelfState.ShowSkus) state).getShelf()));
                }
                RecShelfVO boundData4 = getBoundData();
                if (boundData4 == null || (skuScrollViewItem = boundData4.getSkuScrollViewItem()) == null || (iVar = this.screenContainer) == null) {
                    return;
                }
                addSkuScroll(iVar, skuScrollViewItem);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator createAnimator(int startValue, int endValue, final Function0<Unit> onEndAction) {
        ValueAnimator ofInt = ValueAnimator.ofInt(startValue, endValue);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new a(this, 0));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewHolder$createAnimator$lambda$9$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Function0 function0 = Function0.this;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAnimator$lambda$9$lambda$7(RecShelfViewHolder recShelfViewHolder, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewGroup.LayoutParams layoutParams = recShelfViewHolder.itemView.getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        recShelfViewHolder.itemView.requestLayout();
    }

    private final l generateViewItem(SkuThinScrollDTO skuThinScrollDTO) {
        QZ.a<l> J11;
        I00.a<l> s11;
        i iVar = this.screenContainer;
        if (iVar == null || (J11 = iVar.J()) == null || (s11 = J11.s()) == null) {
            return null;
        }
        return (l) s11.b(new j(new m(1L, "products", "skuThinScroll", "1-products.skuThinScroll"), skuThinScrollDTO, U.c(), U.c()));
    }

    private final boolean hasSavedScroll(SkuThinScrollVO skuThinScrollVO) {
        return skuThinScrollVO.getLayoutManagerState() != null;
    }

    private final void hideWithShimmer() {
        if (this.containerView.getChildCount() > 1) {
            View childAt = this.containerView.getChildAt(1);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            childAt.setVisibility(8);
        }
        View childAt2 = this.containerView.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
        childAt2.setVisibility(0);
    }

    private final void resolveShimmer() {
        l skuScrollViewItem;
        Unit unit;
        RecShelfVO boundData = getBoundData();
        if (boundData != null && (skuScrollViewItem = boundData.getSkuScrollViewItem()) != null) {
            i iVar = this.screenContainer;
            if (iVar != null) {
                addSkuScroll(iVar, skuScrollViewItem);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        animateShimmerAppearance();
    }

    private final View setupSkuScroll(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewHolder$setupSkuScroll$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                RecShelfViewHolder.Companion companion;
                int f7 = C3143a.f(view2, "view", outline, "outline");
                int height = view2.getHeight();
                companion = RecShelfViewHolder.Companion;
                outline.setRoundRect(0, 0, f7, height, companion.getSkuScrollRadius());
            }
        });
        view.setClipToOutline(true);
        int i11 = skuScrollVerticalPadding;
        view.setPadding(0, i11, 0, i11);
        return view;
    }

    private final void subscribeToWidgetUpdates() {
        unsubscribeFromWidgetUpdates();
        this.widgetUpdatesCollector = C2399j.C(new C2408n0(C5427n.a(this.viewModel.getWidgetUpdates(), getLifecycle(), AbstractC5434v.b.STARTED), new RecShelfViewHolder$subscribeToWidgetUpdates$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeToWidgetUpdates$bindState(RecShelfViewHolder recShelfViewHolder, RecShelfState recShelfState, kotlin.coroutines.d dVar) {
        recShelfViewHolder.bindState(recShelfState);
        return Unit.f71690a;
    }

    private final void unsubscribeFromWidgetUpdates() {
        B0 b02 = this.widgetUpdatesCollector;
        if (b02 != null) {
            b02.j(null);
        }
        this.widgetUpdatesCollector = null;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        subscribeToWidgetUpdates();
        resolveShimmer();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        unsubscribeFromWidgetUpdates();
        this.onDetachDelegate.invoke();
        hideWithShimmer();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.onRecycleDelegate.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RecShelfVO item, @NotNull l20.d info) {
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        l skuScrollViewItem = item.getSkuScrollViewItem();
        if (skuScrollViewItem != null) {
            i iVar = this.screenContainer;
            if (iVar != null) {
                addSkuScroll(iVar, skuScrollViewItem);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        this.actionHandler.invoke(item.getGetRecShelfAction());
    }
}
