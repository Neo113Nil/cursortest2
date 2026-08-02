package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import AE.a;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.databinding.PdpWidgetPriceCellBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.view.animationsaleblock.ObjectAnimation;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCellVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J)\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00110$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010!R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "saleBlockViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;)V", "item", "", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO;)V", "launchAnimation", "()V", "bind", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetPriceCellBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpWidgetPriceCellBinding;", "Landroid/view/animation/Animation;", "animation$delegate", "LSc/j;", "getAnimation", "()Landroid/view/animation/Animation;", "animation", "viewModelSaleBlock$delegate", "getViewModelSaleBlock", "()Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "viewModelSaleBlock", "viewGradient$delegate", "getViewGradient", "viewGradient", "Landroid/widget/FrameLayout;", "containerGradient$delegate", "getContainerGradient", "()Landroid/widget/FrameLayout;", "containerGradient", "LWZ/t;", "animationTokenizedEvent", "LWZ/t;", "", "delayAnimation", "Ljava/lang/Integer;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceCellViewHolder extends TabEmbeddedWidgetViewHolder<PriceCellVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: animation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animation;
    private t animationTokenizedEvent;

    @NotNull
    private final PdpWidgetPriceCellBinding binding;

    /* renamed from: containerGradient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerGradient;

    @NotNull
    private final View containerView;
    private Integer delayAnimation;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: viewGradient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewGradient;

    /* renamed from: viewModelSaleBlock$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModelSaleBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceCellViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor inhibitor, @NotNull SaleBlockViewModel saleBlockViewModel) {
        super(containerView, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(saleBlockViewModel, "saleBlockViewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).buildHandler();
        PdpWidgetPriceCellBinding bind = PdpWidgetPriceCellBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.animation = DelegatesKt.lazyUnsafe(new PriceCellViewHolder$animation$2(this));
        this.viewModelSaleBlock = DelegatesKt.lazyUnsafe(new PriceCellViewHolder$viewModelSaleBlock$2(this, saleBlockViewModel));
        this.viewGradient = DelegatesKt.lazyUnsafe(new PriceCellViewHolder$viewGradient$2(this));
        this.containerGradient = DelegatesKt.lazyUnsafe(new PriceCellViewHolder$containerGradient$2(this));
        bind.priceCellIconIv.setClipToOutline(true);
        bind.priceCellTitleTav.setTextIsSelectable(false);
        bind.priceCellSubtitleTav.setTextIsSelectable(false);
    }

    private final void bindInternal(PriceCellVO item) {
        String tintColor;
        PdpWidgetPriceCellBinding pdpWidgetPriceCellBinding = this.binding;
        pdpWidgetPriceCellBinding.getConstraintLayout().setBackground(new InnerIslandBackgroundDrawable(getContext(), item.getBackgroundColors().getInner(), item.getBackgroundColors().getOuter()));
        ImageView priceCellIconIv = pdpWidgetPriceCellBinding.priceCellIconIv;
        Intrinsics.checkNotNullExpressionValue(priceCellIconIv, "priceCellIconIv");
        ViewExtKt.bindOrGone$default(priceCellIconIv, item.getIcon(), null, 2, null);
        TextAtomV2View priceCellTitleTav = pdpWidgetPriceCellBinding.priceCellTitleTav;
        Intrinsics.checkNotNullExpressionValue(priceCellTitleTav, "priceCellTitleTav");
        TextHolderKt.bind$default(priceCellTitleTav, item.getTitle(), null, 2, null);
        TextAtomV2View priceCellSubtitleTav = pdpWidgetPriceCellBinding.priceCellSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(priceCellSubtitleTav, "priceCellSubtitleTav");
        TextHolderKt.bindOrGone$default(priceCellSubtitleTav, item.getSubtitle(), null, 2, null);
        PriceCounterBadgeView priceCounterBadge = pdpWidgetPriceCellBinding.priceCounterBadge;
        Intrinsics.checkNotNullExpressionValue(priceCounterBadge, "priceCounterBadge");
        PriceCounterBadgeViewKt.bindOrGone(priceCounterBadge, item.getCounterBadge());
        ImageView priceCellDisclosureIv = pdpWidgetPriceCellBinding.priceCellDisclosureIv;
        Intrinsics.checkNotNullExpressionValue(priceCellDisclosureIv, "priceCellDisclosureIv");
        priceCellDisclosureIv.setVisibility(item.getDisclosure() == null ? 8 : 0);
        PriceCellVO.Disclosure disclosure = item.getDisclosure();
        if (disclosure != null && (tintColor = disclosure.getTintColor()) != null) {
            ImageView priceCellDisclosureIv2 = pdpWidgetPriceCellBinding.priceCellDisclosureIv;
            Intrinsics.checkNotNullExpressionValue(priceCellDisclosureIv2, "priceCellDisclosureIv");
            ThemeExtKt.tint(priceCellDisclosureIv2, Integer.valueOf(ContextExtKt.parseColor(getContext(), tintColor)));
        }
        pdpWidgetPriceCellBinding.getConstraintLayout().setOnClickListener(new a(0, this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindInternal$lambda$7$lambda$6(PriceCellViewHolder priceCellViewHolder, PriceCellVO priceCellVO, View view) {
        if (priceCellViewHolder.delayAnimation != null) {
            priceCellViewHolder.getViewModelSaleBlock().leftTheScreen(ObjectAnimation.PRICE_CELL);
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(priceCellViewHolder.getViewGradient());
            priceCellViewHolder.delayAnimation = null;
        }
        AtomAction action = priceCellVO.getAction();
        if (action != null) {
            priceCellViewHolder.actionHandler.invoke(action);
        }
        TokenizedAnalyticsExtKt.processNonViewEvents(priceCellViewHolder.tokenizedAnalytics, priceCellVO.getTokenizedEvent());
    }

    private final Animation getAnimation() {
        Object value = this.animation.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getContainerGradient() {
        return (FrameLayout) this.containerGradient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getViewGradient() {
        return (View) this.viewGradient.getValue();
    }

    private final SaleBlockViewModel getViewModelSaleBlock() {
        return (SaleBlockViewModel) this.viewModelSaleBlock.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        getViewGradient().startAnimation(getAnimation());
        getViewGradient().setVisibility(0);
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, this.animationTokenizedEvent);
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Integer num = this.delayAnimation;
        if (num != null) {
            getViewModelSaleBlock().appearedOnScreen(ObjectAnimation.PRICE_CELL, num.intValue());
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        if (this.delayAnimation != null) {
            getViewModelSaleBlock().leftTheScreen(ObjectAnimation.PRICE_CELL);
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(getViewGradient());
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull PriceCellVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindInternal(item);
        Integer animationTimer = item.getAnimationTimer();
        if (animationTimer != null) {
            this.delayAnimation = Integer.valueOf(animationTimer.intValue() / 1000);
        }
        this.animationTokenizedEvent = item.getAnimationTokenizedEvent();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PriceCellVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PriceCellViewHolder) item, trackingData, viewedPond);
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
