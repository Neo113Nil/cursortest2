package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.W;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetBottomCartBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.data.BottomCartWidgetDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetMapperKt;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetVO;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.WidgetState;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 h2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001hB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001b\u0010.\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001b\u00101\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010;R#\u0010B\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010AR#\u0010E\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010AR#\u0010J\u001a\n >*\u0004\u0018\u00010F0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010%\u001a\u0004\bH\u0010IR#\u0010M\u001a\n >*\u0004\u0018\u00010F0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010%\u001a\u0004\bL\u0010IR\u001b\u0010P\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010%\u001a\u0004\bO\u0010;R#\u0010S\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010%\u001a\u0004\bR\u0010AR#\u0010V\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010%\u001a\u0004\bU\u0010AR\u001b\u0010Y\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010%\u001a\u0004\bX\u0010;R#\u0010\\\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010%\u001a\u0004\b[\u0010AR#\u0010_\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010%\u001a\u0004\b^\u0010AR \u0010b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u000e0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/overlay/BottomCartWidgetOverlayHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModel;", "viewModel", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModel;Ll10/i;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO;)V", "vo", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "cartButton", "slideUpButton", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "slideDownButton", "cartButtonV3DTO", "showCartButton", "hideCartButton", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO$ViewState;", "viewState", "prepareLayout", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO$ViewState;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModel;", "", "containerHeight$delegate", "LSc/j;", "getContainerHeight", "()I", "containerHeight", "iconButtonWidth$delegate", "getIconButtonWidth", "iconButtonWidth", "layoutOffset$delegate", "getLayoutOffset", "layoutOffset", "paddingOffset$delegate", "getPaddingOffset", "paddingOffset", "Landroid/view/animation/PathInterpolator;", "pathInterpolator", "Landroid/view/animation/PathInterpolator;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetBottomCartBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetBottomCartBinding;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "slideListener$delegate", "getSlideListener", "()Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "slideListener", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "slideUp$delegate", "getSlideUp", "()Landroid/animation/ValueAnimator;", "slideUp", "slideDown$delegate", "getSlideDown", "slideDown", "Landroid/animation/ObjectAnimator;", "buttonHideAlphaAnimator$delegate", "getButtonHideAlphaAnimator", "()Landroid/animation/ObjectAnimator;", "buttonHideAlphaAnimator", "buttonShowAlphaAnimator$delegate", "getButtonShowAlphaAnimator", "buttonShowAlphaAnimator", "widthListener$delegate", "getWidthListener", "widthListener", "widthToIconButton$delegate", "getWidthToIconButton", "widthToIconButton", "widthToNormalButton$delegate", "getWidthToNormalButton", "widthToNormalButton", "translationXListener$delegate", "getTranslationXListener", "translationXListener", "cartButtonFadeIn$delegate", "getCartButtonFadeIn", "cartButtonFadeIn", "cartButtonFadeOut$delegate", "getCartButtonFadeOut", "cartButtonFadeOut", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/WidgetState$NewState;", "observer", "Landroidx/lifecycle/W;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomCartWidgetOverlayHolder extends AbstractC6064a<BottomCartWidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetBottomCartBinding binding;

    /* renamed from: buttonHideAlphaAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonHideAlphaAnimator;

    /* renamed from: buttonShowAlphaAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonShowAlphaAnimator;

    /* renamed from: cartButtonFadeIn$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartButtonFadeIn;

    /* renamed from: cartButtonFadeOut$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartButtonFadeOut;

    /* renamed from: containerHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerHeight;

    /* renamed from: iconButtonWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconButtonWidth;

    /* renamed from: layoutOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layoutOffset;

    @NotNull
    private final W<WidgetState.NewState> observer;

    /* renamed from: paddingOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paddingOffset;

    @NotNull
    private final PathInterpolator pathInterpolator;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: slideDown$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideDown;

    /* renamed from: slideListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideListener;

    /* renamed from: slideUp$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideUp;

    /* renamed from: translationXListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j translationXListener;

    @NotNull
    private final BottomCartWidgetViewModel viewModel;

    /* renamed from: widthListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widthListener;

    /* renamed from: widthToIconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widthToIconButton;

    /* renamed from: widthToNormalButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widthToNormalButton;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomCartWidgetOverlayHolder(@NotNull ComposerReferences refs, @NotNull BottomCartWidgetViewModel viewModel, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.refs = refs;
        this.viewModel = viewModel;
        this.containerHeight = k.b(BottomCartWidgetOverlayHolder$containerHeight$2.INSTANCE);
        this.iconButtonWidth = k.b(BottomCartWidgetOverlayHolder$iconButtonWidth$2.INSTANCE);
        this.layoutOffset = k.b(BottomCartWidgetOverlayHolder$layoutOffset$2.INSTANCE);
        this.paddingOffset = k.b(BottomCartWidgetOverlayHolder$paddingOffset$2.INSTANCE);
        this.pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
        WidgetBottomCartBinding bind = WidgetBottomCartBinding.bind(getView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.slideListener = k.b(new BottomCartWidgetOverlayHolder$slideListener$2(this));
        this.slideUp = k.b(new BottomCartWidgetOverlayHolder$slideUp$2(this));
        this.slideDown = k.b(new BottomCartWidgetOverlayHolder$slideDown$2(this));
        this.buttonHideAlphaAnimator = k.b(new BottomCartWidgetOverlayHolder$buttonHideAlphaAnimator$2(this));
        this.buttonShowAlphaAnimator = k.b(new BottomCartWidgetOverlayHolder$buttonShowAlphaAnimator$2(this));
        this.widthListener = k.b(new BottomCartWidgetOverlayHolder$widthListener$2(this));
        this.widthToIconButton = k.b(new BottomCartWidgetOverlayHolder$widthToIconButton$2(this));
        this.widthToNormalButton = k.b(new BottomCartWidgetOverlayHolder$widthToNormalButton$2(this));
        this.translationXListener = k.b(new BottomCartWidgetOverlayHolder$translationXListener$2(this));
        this.cartButtonFadeIn = k.b(new BottomCartWidgetOverlayHolder$cartButtonFadeIn$2(this));
        this.cartButtonFadeOut = k.b(new BottomCartWidgetOverlayHolder$cartButtonFadeOut$2(this));
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new BottomCartWidgetOverlayHolder$actionHandler$1(this)).buildHandler();
        this.observer = new Xw.a(this, 0);
    }

    private final ObjectAnimator getButtonHideAlphaAnimator() {
        return (ObjectAnimator) this.buttonHideAlphaAnimator.getValue();
    }

    private final ObjectAnimator getButtonShowAlphaAnimator() {
        return (ObjectAnimator) this.buttonShowAlphaAnimator.getValue();
    }

    private final ValueAnimator getCartButtonFadeIn() {
        return (ValueAnimator) this.cartButtonFadeIn.getValue();
    }

    private final ValueAnimator getCartButtonFadeOut() {
        return (ValueAnimator) this.cartButtonFadeOut.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerHeight() {
        return ((Number) this.containerHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getIconButtonWidth() {
        return ((Number) this.iconButtonWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getLayoutOffset() {
        return ((Number) this.layoutOffset.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPaddingOffset() {
        return ((Number) this.paddingOffset.getValue()).intValue();
    }

    private final ValueAnimator getSlideDown() {
        return (ValueAnimator) this.slideDown.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getSlideListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.slideListener.getValue();
    }

    private final ValueAnimator getSlideUp() {
        return (ValueAnimator) this.slideUp.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getTranslationXListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.translationXListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getWidthListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.widthListener.getValue();
    }

    private final ValueAnimator getWidthToIconButton() {
        return (ValueAnimator) this.widthToIconButton.getValue();
    }

    private final ValueAnimator getWidthToNormalButton() {
        return (ValueAnimator) this.widthToNormalButton.getValue();
    }

    private final void hideCartButton(final BottomCartWidgetVO vo) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getWidthToNormalButton(), getButtonHideAlphaAnimator(), getCartButtonFadeOut());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartWidgetOverlayHolder$hideCartButton$lambda$11$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                WidgetBottomCartBinding widgetBottomCartBinding;
                WidgetBottomCartBinding widgetBottomCartBinding2;
                ComposerReferences composerReferences;
                widgetBottomCartBinding = BottomCartWidgetOverlayHolder.this.binding;
                ButtonV3View catalogButton = widgetBottomCartBinding.catalogButton;
                Intrinsics.checkNotNullExpressionValue(catalogButton, "catalogButton");
                ViewGroup.LayoutParams layoutParams = catalogButton.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = 0;
                catalogButton.setLayoutParams(layoutParams);
                widgetBottomCartBinding2 = BottomCartWidgetOverlayHolder.this.binding;
                ButtonV3View cartButton = widgetBottomCartBinding2.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
                ViewExtKt.gone(cartButton);
                composerReferences = BottomCartWidgetOverlayHolder.this.refs;
                composerReferences.getController().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observer$lambda$0(BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder, WidgetState.NewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BottomCartWidgetVO bottomCartWidgetVO = (BottomCartWidgetVO) bottomCartWidgetOverlayHolder.getBoundData();
        if (bottomCartWidgetVO == null) {
            return;
        }
        BottomCartWidgetDTO dto = it.getDto();
        BottomCartWidgetVO bottomCartWidgetVO2 = (BottomCartWidgetVO) bottomCartWidgetOverlayHolder.getBoundData();
        BottomCartWidgetVO vO$default = BottomCartWidgetMapperKt.toVO$default(dto, bottomCartWidgetVO2 != null ? bottomCartWidgetVO2.getId() : 0L, null, 2, null);
        Map<String, String> trackingPayloads = it.getTrackingPayloads();
        if (trackingPayloads != null) {
            bottomCartWidgetOverlayHolder.refs.getTokenizedAnalytics().e(trackingPayloads);
        }
        if (vO$default.getViewState().getClass() == bottomCartWidgetVO.getViewState().getClass() && vO$default.getId() == bottomCartWidgetVO.getId()) {
            bottomCartWidgetOverlayHolder.refs.getController().update(vO$default);
            return;
        }
        BottomCartWidgetVO.ViewState viewState = vO$default.getViewState();
        if (viewState instanceof BottomCartWidgetVO.ViewState.CartButtonState) {
            bottomCartWidgetOverlayHolder.slideUpButton(vO$default, ((BottomCartWidgetVO.ViewState.CartButtonState) viewState).getCartButton());
            return;
        }
        if (viewState instanceof BottomCartWidgetVO.ViewState.NoButtonsState) {
            bottomCartWidgetOverlayHolder.slideDownButton(vO$default);
        } else if (viewState instanceof BottomCartWidgetVO.ViewState.CatalogButtonState) {
            bottomCartWidgetOverlayHolder.hideCartButton(vO$default);
        } else {
            if (!(viewState instanceof BottomCartWidgetVO.ViewState.TwoButtonState)) {
                throw new o();
            }
            bottomCartWidgetOverlayHolder.showCartButton(vO$default, ((BottomCartWidgetVO.ViewState.TwoButtonState) viewState).getCartButton());
        }
    }

    private final void prepareLayout(BottomCartWidgetVO.ViewState viewState) {
        WidgetBottomCartBinding widgetBottomCartBinding = this.binding;
        if (viewState instanceof BottomCartWidgetVO.ViewState.NoButtonsState) {
            ButtonV3View cartButton = widgetBottomCartBinding.cartButton;
            Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
            ViewExtKt.gone(cartButton);
            ButtonV3View catalogButton = widgetBottomCartBinding.catalogButton;
            Intrinsics.checkNotNullExpressionValue(catalogButton, "catalogButton");
            ViewExtKt.gone(catalogButton);
            ConstraintLayout bottomCartLayout = widgetBottomCartBinding.bottomCartLayout;
            Intrinsics.checkNotNullExpressionValue(bottomCartLayout, "bottomCartLayout");
            ViewGroup.LayoutParams layoutParams = bottomCartLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            bottomCartLayout.setLayoutParams(layoutParams);
            return;
        }
        if (viewState instanceof BottomCartWidgetVO.ViewState.TwoButtonState) {
            ButtonV3View buttonV3View = widgetBottomCartBinding.cartButton;
            Intrinsics.f(buttonV3View);
            BottomCartWidgetVO.ViewState.TwoButtonState twoButtonState = (BottomCartWidgetVO.ViewState.TwoButtonState) viewState;
            ButtonV3HolderKt.bindOrGone(buttonV3View, twoButtonState.getCartButton(), this.actionHandler);
            buttonV3View.setAlpha(1.0f);
            buttonV3View.setTranslationX(0.0f);
            ButtonV3View buttonV3View2 = widgetBottomCartBinding.catalogButton;
            Intrinsics.f(buttonV3View2);
            ButtonV3HolderKt.bindOrGone(buttonV3View2, twoButtonState.getCatalogButton(), this.actionHandler);
            ViewGroup.LayoutParams layoutParams2 = buttonV3View2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = getIconButtonWidth();
            buttonV3View2.setLayoutParams(layoutParams2);
            return;
        }
        if (viewState instanceof BottomCartWidgetVO.ViewState.CartButtonState) {
            ButtonV3View cartButton2 = widgetBottomCartBinding.cartButton;
            Intrinsics.checkNotNullExpressionValue(cartButton2, "cartButton");
            ButtonV3HolderKt.bindOrGone(cartButton2, ((BottomCartWidgetVO.ViewState.CartButtonState) viewState).getCartButton(), this.actionHandler);
            ConstraintLayout bottomCartLayout2 = widgetBottomCartBinding.bottomCartLayout;
            Intrinsics.checkNotNullExpressionValue(bottomCartLayout2, "bottomCartLayout");
            if (bottomCartLayout2.getVisibility() == 0) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(this.pathInterpolator);
            animatorSet.playTogether(getSlideUp(), getButtonShowAlphaAnimator());
            animatorSet.start();
            return;
        }
        if (!(viewState instanceof BottomCartWidgetVO.ViewState.CatalogButtonState)) {
            throw new o();
        }
        ButtonV3View buttonV3View3 = widgetBottomCartBinding.catalogButton;
        Intrinsics.f(buttonV3View3);
        ButtonV3HolderKt.bindOrGone(buttonV3View3, ((BottomCartWidgetVO.ViewState.CatalogButtonState) viewState).getCatalogButton(), this.actionHandler);
        ButtonV3View catalogButton2 = this.binding.catalogButton;
        Intrinsics.checkNotNullExpressionValue(catalogButton2, "catalogButton");
        ViewGroup.LayoutParams layoutParams3 = catalogButton2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = 0;
        catalogButton2.setLayoutParams(layoutParams3);
        ButtonV3View cartButton3 = widgetBottomCartBinding.cartButton;
        Intrinsics.checkNotNullExpressionValue(cartButton3, "cartButton");
        ViewExtKt.gone(cartButton3);
    }

    private final void showCartButton(final BottomCartWidgetVO vo, final ButtonV3DTO cartButtonV3DTO) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getWidthToIconButton(), getButtonShowAlphaAnimator(), getCartButtonFadeIn());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartWidgetOverlayHolder$showCartButton$lambda$8$$inlined$doOnStart$1
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
                WidgetBottomCartBinding widgetBottomCartBinding;
                widgetBottomCartBinding = BottomCartWidgetOverlayHolder.this.binding;
                ButtonV3View cartButton = widgetBottomCartBinding.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
                ButtonV3HolderKt.bindOrGone$default(cartButton, cartButtonV3DTO, null, 2, null);
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartWidgetOverlayHolder$showCartButton$lambda$8$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ComposerReferences composerReferences;
                composerReferences = BottomCartWidgetOverlayHolder.this.refs;
                composerReferences.getController().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void slideDownButton(final BottomCartWidgetVO vo) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getSlideDown(), getButtonHideAlphaAnimator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartWidgetOverlayHolder$slideDownButton$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                WidgetBottomCartBinding widgetBottomCartBinding;
                ComposerReferences composerReferences;
                widgetBottomCartBinding = BottomCartWidgetOverlayHolder.this.binding;
                ButtonV3View cartButton = widgetBottomCartBinding.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
                ViewExtKt.gone(cartButton);
                composerReferences = BottomCartWidgetOverlayHolder.this.refs;
                composerReferences.getController().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void slideUpButton(final BottomCartWidgetVO vo, final ButtonV3DTO cartButton) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getSlideUp(), getButtonShowAlphaAnimator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartWidgetOverlayHolder$slideUpButton$lambda$3$$inlined$doOnStart$1
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
                WidgetBottomCartBinding widgetBottomCartBinding;
                widgetBottomCartBinding = BottomCartWidgetOverlayHolder.this.binding;
                ButtonV3View cartButton2 = widgetBottomCartBinding.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton2, "cartButton");
                ButtonV3HolderKt.bindOrGone$default(cartButton2, cartButton, null, 2, null);
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartWidgetOverlayHolder$slideUpButton$lambda$3$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ComposerReferences composerReferences;
                composerReferences = BottomCartWidgetOverlayHolder.this.refs;
                composerReferences.getController().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.viewModel.getWidgetState().observe(this, this.observer);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull BottomCartWidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.setAsyncData(item.getAsyncData());
        prepareLayout(item.getViewState());
    }
}
