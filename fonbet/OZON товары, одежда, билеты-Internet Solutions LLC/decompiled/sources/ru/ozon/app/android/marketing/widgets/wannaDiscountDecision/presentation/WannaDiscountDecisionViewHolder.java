package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.presentation;

import WZ.l;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetWannaDiscountDecisionBinding;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data.PriceBlock;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data.SellerMessage;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.presentation.WannaDiscountDecisionVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0018J#\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00022\n\u0010(\u001a\u00060&j\u0002`'H\u0014¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000f078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010;\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000f078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "", "bindInfoButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO$TimerBlockVO;", "timerBlock", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "bindTimer", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO$TimerBlockVO;)Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "hideTimerBlock", "()V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;", "priceBlock", "bindPriceBlock", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;)V", "hidePriceBlock", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;", "sellerMessage", "", "doesRequireTopMargin", "bindSellerMessage", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;Z)V", "hideSellerMessage", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/marketing/databinding/WidgetWannaDiscountDecisionBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetWannaDiscountDecisionBinding;", "", "dp16", "F", "Landroid/graphics/drawable/ShapeDrawable;", "priceDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "sellerDrawable", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "timerActionHandler", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountDecisionViewHolder extends k<WannaDiscountDecisionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetWannaDiscountDecisionBinding binding;
    private final float dp16;

    @NotNull
    private final ShapeDrawable priceDrawable;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ShapeDrawable sellerDrawable;

    @NotNull
    private final Function1<AtomAction, Unit> timerActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WannaDiscountDecisionViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetWannaDiscountDecisionBinding bind = WidgetWannaDiscountDecisionBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        float pxF = UiExtKt.toPxF(16);
        this.dp16 = pxF;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{pxF, pxF, pxF, pxF, pxF, pxF, pxF, pxF}, null, null));
        this.priceDrawable = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RoundRectShape(new float[]{pxF, pxF, pxF, pxF, pxF, pxF, pxF, pxF}, null, null));
        this.sellerDrawable = shapeDrawable2;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.timerActionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new WannaDiscountDecisionViewHolder$timerActionHandler$1(this)).buildHandler();
    }

    private final void bindInfoButton(ButtonV3Atom.SmallIconButton infoButton) {
        SmallIconButtonView smallIconButtonView = this.binding.infoStatusButton;
        Intrinsics.f(smallIconButtonView);
        WrappedIconButtonHolderKt.bind(smallIconButtonView, infoButton, this.actionHandler);
        smallIconButtonView.setPadding(0, 0, 0, 0);
        ViewExtKt.show(smallIconButtonView);
    }

    private final void bindPriceBlock(PriceBlock priceBlock) {
        WidgetWannaDiscountDecisionBinding widgetWannaDiscountDecisionBinding = this.binding;
        this.priceDrawable.getPaint().setColor(StyleParser.INSTANCE.parseColor(getContext(), priceBlock.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        View view = widgetWannaDiscountDecisionBinding.wannaDiscountPriceBg;
        view.setBackground(this.priceDrawable);
        ViewExtKt.show(view);
        PriceView priceView = widgetWannaDiscountDecisionBinding.wannaDiscountPriceView;
        Intrinsics.f(priceView);
        PriceHolderKt.bind$default(priceView, priceBlock.getPrice(), null, 2, null);
        ViewExtKt.show(priceView);
        TextAtomView textAtomView = widgetWannaDiscountDecisionBinding.wannaDiscountPriceTv;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, priceBlock.getDescription(), null, 2, null);
        ViewExtKt.show(textAtomView);
    }

    private final void bindSellerMessage(SellerMessage sellerMessage, boolean doesRequireTopMargin) {
        WidgetWannaDiscountDecisionBinding widgetWannaDiscountDecisionBinding = this.binding;
        this.sellerDrawable.getPaint().setColor(StyleParser.INSTANCE.parseColor(getContext(), (String) null, UniColors.BG_SECONDARY.getResId()));
        View view = widgetWannaDiscountDecisionBinding.sellerMessageView;
        if (doesRequireTopMargin) {
            Intrinsics.f(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            view.setLayoutParams(marginLayoutParams);
        }
        view.setBackground(this.sellerDrawable);
        ViewExtKt.show(view);
        TextAtomView textAtomView = widgetWannaDiscountDecisionBinding.sellerMessageTitleTv;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, sellerMessage.getTitle(), null, 2, null);
        ViewExtKt.show(textAtomView);
        TextAtomView textAtomView2 = widgetWannaDiscountDecisionBinding.sellerMessageSubtitleTv;
        Intrinsics.f(textAtomView2);
        TextAtomHolderKt.bind$default(textAtomView2, sellerMessage.getSubtitle(), null, 2, null);
        ViewExtKt.show(textAtomView2);
    }

    private final SingleAtom bindTimer(WannaDiscountDecisionVO.TimerBlockVO timerBlock) {
        WidgetWannaDiscountDecisionBinding widgetWannaDiscountDecisionBinding = this.binding;
        TextAtomView textAtomView = widgetWannaDiscountDecisionBinding.wannaDiscountTimerTitle;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, timerBlock.getTitle(), null, 2, null);
        ViewExtKt.show(textAtomView);
        SingleAtom singleAtom = widgetWannaDiscountDecisionBinding.wannaDiscountTimerBadge;
        singleAtom.setOnAction(this.timerActionHandler);
        SingleAtom.bind$default(singleAtom, timerBlock.getTimerBadge(), false, 2, null);
        ViewExtKt.show(singleAtom);
        Intrinsics.checkNotNullExpressionValue(singleAtom, "with(...)");
        return singleAtom;
    }

    private final void hidePriceBlock() {
        WidgetWannaDiscountDecisionBinding widgetWannaDiscountDecisionBinding = this.binding;
        View wannaDiscountPriceBg = widgetWannaDiscountDecisionBinding.wannaDiscountPriceBg;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountPriceBg, "wannaDiscountPriceBg");
        ViewExtKt.gone(wannaDiscountPriceBg);
        TextAtomView wannaDiscountPriceTv = widgetWannaDiscountDecisionBinding.wannaDiscountPriceTv;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountPriceTv, "wannaDiscountPriceTv");
        ViewExtKt.gone(wannaDiscountPriceTv);
        PriceView wannaDiscountPriceView = widgetWannaDiscountDecisionBinding.wannaDiscountPriceView;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountPriceView, "wannaDiscountPriceView");
        ViewExtKt.gone(wannaDiscountPriceView);
    }

    private final void hideSellerMessage() {
        WidgetWannaDiscountDecisionBinding widgetWannaDiscountDecisionBinding = this.binding;
        View sellerMessageView = widgetWannaDiscountDecisionBinding.sellerMessageView;
        Intrinsics.checkNotNullExpressionValue(sellerMessageView, "sellerMessageView");
        ViewExtKt.gone(sellerMessageView);
        TextAtomView sellerMessageTitleTv = widgetWannaDiscountDecisionBinding.sellerMessageTitleTv;
        Intrinsics.checkNotNullExpressionValue(sellerMessageTitleTv, "sellerMessageTitleTv");
        ViewExtKt.gone(sellerMessageTitleTv);
        TextAtomView sellerMessageSubtitleTv = widgetWannaDiscountDecisionBinding.sellerMessageSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(sellerMessageSubtitleTv, "sellerMessageSubtitleTv");
        ViewExtKt.gone(sellerMessageSubtitleTv);
    }

    private final void hideTimerBlock() {
        WidgetWannaDiscountDecisionBinding widgetWannaDiscountDecisionBinding = this.binding;
        TextAtomView wannaDiscountTimerTitle = widgetWannaDiscountDecisionBinding.wannaDiscountTimerTitle;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountTimerTitle, "wannaDiscountTimerTitle");
        ViewExtKt.gone(wannaDiscountTimerTitle);
        SingleAtom wannaDiscountTimerBadge = widgetWannaDiscountDecisionBinding.wannaDiscountTimerBadge;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountTimerBadge, "wannaDiscountTimerBadge");
        ViewExtKt.gone(wannaDiscountTimerBadge);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull WannaDiscountDecisionVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetWannaDiscountDecisionBinding widgetWannaDiscountDecisionBinding = this.binding;
        boolean z11 = (item.getPriceBlock() == null || item.getTimer() == null) ? false : true;
        if (item.getSellerMessage() != null) {
            bindSellerMessage(item.getSellerMessage(), z11);
        } else {
            hideSellerMessage();
        }
        if (item.getTimer() != null) {
            bindTimer(item.getTimer());
        } else {
            hideTimerBlock();
        }
        if (item.getPriceBlock() != null) {
            bindPriceBlock(item.getPriceBlock());
        } else {
            hidePriceBlock();
        }
        TextAtomView wannaDiscountStatusTitle = widgetWannaDiscountDecisionBinding.wannaDiscountStatusTitle;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountStatusTitle, "wannaDiscountStatusTitle");
        TextAtomHolderKt.bind$default(wannaDiscountStatusTitle, item.getTitle(), null, 2, null);
        TextAtomView wannaDiscountStatusSubtitle = widgetWannaDiscountDecisionBinding.wannaDiscountStatusSubtitle;
        Intrinsics.checkNotNullExpressionValue(wannaDiscountStatusSubtitle, "wannaDiscountStatusSubtitle");
        TextAtomHolderKt.bind$default(wannaDiscountStatusSubtitle, item.getSubtitle(), null, 2, null);
        bindInfoButton(item.getInfoButton());
    }
}
