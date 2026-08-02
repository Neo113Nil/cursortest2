package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDoneTotalElementBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import y7.C10856g;
import y7.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElementWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElement;", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneTotalElementBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneTotalElementBinding;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/TooltipVO;", "titleTooltip", "", "bindTitleTooltip", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/TooltipVO;)V", "", "color", "bindSeparator", "(Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneTotalElementBinding;Ljava/lang/String;)V", "item", "setupBackground", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElement;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElement;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElement;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneTotalElementBinding;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneTotalElementWidgetViewHolder extends k<OrderDoneTotalElement> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetOrderDoneTotalElementBinding binding;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDoneTotalElementWidgetViewHolder(@NotNull WidgetOrderDoneTotalElementBinding binding, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final void bindSeparator(WidgetOrderDoneTotalElementBinding widgetOrderDoneTotalElementBinding, String str) {
        View view = widgetOrderDoneTotalElementBinding.separatorV;
        if (str == null) {
            Intrinsics.f(view);
            ViewExtKt.gone(view);
            return;
        }
        Intrinsics.f(view);
        ViewExtKt.show(view);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(styleParser.parseColor(context, str, UniColors.GRAPHIC_NEUTRAL.getResId()));
    }

    private final void bindTitleTooltip(TooltipVO titleTooltip) {
        AtomActionDTO action;
        IconView iconView = this.binding.iconView;
        Intrinsics.f(iconView);
        IconHolderKt.bindOrGone$default(iconView, titleTooltip != null ? titleTooltip.getIcon() : null, null, 2, null);
        if (titleTooltip == null || (action = titleTooltip.getCommon().getAction()) == null) {
            return;
        }
        ViewExtKt.setOnClickListenerThrottle$default(iconView, 0L, new OrderDoneTotalElementWidgetViewHolder$bindTitleTooltip$1$1(this, action, titleTooltip), 1, null);
    }

    private final void setupBackground(OrderDoneTotalElement item) {
        WidgetOrderDoneTotalElementBinding widgetOrderDoneTotalElementBinding = this.binding;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = widgetOrderDoneTotalElementBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        int px = UiExtKt.toPx(12, getContext());
        int i11 = parseColor != null ? px : 0;
        Guideline guidelineStart = widgetOrderDoneTotalElementBinding.guidelineStart;
        Intrinsics.checkNotNullExpressionValue(guidelineStart, "guidelineStart");
        ViewGroup.LayoutParams layoutParams = guidelineStart.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41620a = i11;
        guidelineStart.setLayoutParams(bVar);
        Guideline guidelineEnd = widgetOrderDoneTotalElementBinding.guidelineEnd;
        Intrinsics.checkNotNullExpressionValue(guidelineEnd, "guidelineEnd");
        ViewGroup.LayoutParams layoutParams2 = guidelineEnd.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f41622b = i11;
        guidelineEnd.setLayoutParams(bVar2);
        Guideline guidelineTop = widgetOrderDoneTotalElementBinding.guidelineTop;
        Intrinsics.checkNotNullExpressionValue(guidelineTop, "guidelineTop");
        ViewGroup.LayoutParams layoutParams3 = guidelineTop.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        CornerRadius topCornerRadius = item.getTopCornerRadius();
        CornerRadius cornerRadius = CornerRadius.NO_RADIUS;
        bVar3.f41620a = topCornerRadius == cornerRadius ? 0 : px;
        guidelineTop.setLayoutParams(bVar3);
        Space spacerBottom = widgetOrderDoneTotalElementBinding.spacerBottom;
        Intrinsics.checkNotNullExpressionValue(spacerBottom, "spacerBottom");
        ViewGroup.LayoutParams layoutParams4 = spacerBottom.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
        if (item.getBottomCornerRadius() == cornerRadius) {
            px = 0;
        }
        ((ViewGroup.MarginLayoutParams) bVar4).height = px;
        spacerBottom.setLayoutParams(bVar4);
        if (parseColor == null) {
            widgetOrderDoneTotalElementBinding.viewBg.setBackground(null);
            return;
        }
        k.a aVar = new k.a();
        aVar.n(ResourceExtKt.toPxF(item.getTopCornerRadius().getPx(), getContext()));
        aVar.r(ResourceExtKt.toPxF(item.getTopCornerRadius().getPx(), getContext()));
        aVar.f(ResourceExtKt.toPxF(item.getBottomCornerRadius().getPx(), getContext()));
        aVar.j(ResourceExtKt.toPxF(item.getBottomCornerRadius().getPx(), getContext()));
        y7.k a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        View view = widgetOrderDoneTotalElementBinding.viewBg;
        C10856g c10856g = new C10856g(a11);
        c10856g.B(ColorStateList.valueOf(parseColor.intValue()));
        view.setBackground(c10856g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDoneTotalElement item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetOrderDoneTotalElementBinding widgetOrderDoneTotalElementBinding = this.binding;
        TextAtomV2View titleTav = widgetOrderDoneTotalElementBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bind(titleTav, item.getTitle(), this.actionHandler);
        bindTitleTooltip(item.getTitleTooltip());
        PriceAtomView atomPriceV2 = widgetOrderDoneTotalElementBinding.atomPriceV2;
        Intrinsics.checkNotNullExpressionValue(atomPriceV2, "atomPriceV2");
        PriceAtomHolderKt.bindOrGone$default(atomPriceV2, item.getAtomPrice(), null, 2, null);
        TextAtomV2View priceTav = widgetOrderDoneTotalElementBinding.priceTav;
        Intrinsics.checkNotNullExpressionValue(priceTav, "priceTav");
        priceTav.setVisibility(item.getAtomPrice() == null ? 0 : 8);
        TextAtomV2View priceTav2 = widgetOrderDoneTotalElementBinding.priceTav;
        Intrinsics.checkNotNullExpressionValue(priceTav2, "priceTav");
        TextHolderKt.bindOrGone(priceTav2, item.getPrice(), this.actionHandler);
        widgetOrderDoneTotalElementBinding.priceTav.setTextAlignment(3);
        TextAtomV2View subtitleTav = widgetOrderDoneTotalElementBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone(subtitleTav, item.getSubtitle(), this.actionHandler);
        ButtonView btn = widgetOrderDoneTotalElementBinding.btn;
        Intrinsics.checkNotNullExpressionValue(btn, "btn");
        ButtonHolderKt.bindOrGone(btn, item.getButton(), this.actionHandler);
        bindSeparator(widgetOrderDoneTotalElementBinding, item.getSeparatorColor());
        Integer paddingLeft = item.getPaddingLeft();
        if (paddingLeft != null) {
            int intValue = paddingLeft.intValue();
            ConstraintLayout constraintLayout = widgetOrderDoneTotalElementBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            constraintLayout.setPadding(intValue, constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        }
        TextAtomV2View titleTav2 = widgetOrderDoneTotalElementBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav2, "titleTav");
        ViewGroup.LayoutParams layoutParams = titleTav2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = item.getTitlePaddingTop();
        titleTav2.setLayoutParams(bVar);
        TextAtomV2View subtitleTav2 = widgetOrderDoneTotalElementBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav2, "subtitleTav");
        ViewGroup.LayoutParams layoutParams2 = subtitleTav2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = item.getSubtitlePaddingTop();
        subtitleTav2.setLayoutParams(bVar2);
        setupBackground(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderDoneTotalElement item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((OrderDoneTotalElementWidgetViewHolder) item, trackingData, viewedPond);
        TooltipVO titleTooltip = item.getTitleTooltip();
        if (titleTooltip == null || (tokenizedEvent = titleTooltip.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
