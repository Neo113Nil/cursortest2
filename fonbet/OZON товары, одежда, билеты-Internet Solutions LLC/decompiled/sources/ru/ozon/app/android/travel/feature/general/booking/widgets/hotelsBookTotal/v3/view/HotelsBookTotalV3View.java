package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view;

import EI.a;
import FN.d;
import FN.e;
import FN.f;
import FN.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.children.HotelsBookTotalV3BasePriceView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.children.HotelsBookTotalV3BonusesView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.children.HotelsBookTotalV3FinalPriceView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.children.HotelsBookTotalV3StarsBonusesView;
import ru.ozon.app.android.travel.utils.extensions.TextDTOExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001eJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+J,\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u001f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001eJ$\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u0001022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001eJ$\u00103\u001a\u00020\u001a2\b\u00104\u001a\u0004\u0018\u0001052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001eJ\u001a\u00106\u001a\u00020\u001a2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u001eJ\u0010\u00108\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002J\b\u00109\u001a\u00020\u001aH\u0003J\b\u0010:\u001a\u00020\u001aH\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp8", "dp12", "dp16", "finalPriceView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3FinalPriceView;", "basePriceView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3BasePriceView;", "starsBonusesView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3StarsBonusesView;", "dividerView", "Landroid/view/View;", "bonusesView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3BonusesView;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "agreementTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "state", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindFinalPrice", "finalPrice", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "bindOrGoneBasePrice", "basePrice", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "bindOrGoneBonusesAmount", "bonuses", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "setLoading", "isLoading", "", "bindNextButton", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "action", "bindOrGoneAgreement", "agreement", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindOrGoneStarBonuses", "starsBonuses", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "setOnPriceClickListener", "click", "toggleButtonLoader", "disableTouchAndShowLoader", "enableTouchAndHideLoader", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3View extends LinearLayout {

    @NotNull
    private final TextAtomV2View agreementTextView;

    @NotNull
    private final HotelsBookTotalV3BasePriceView basePriceView;

    @NotNull
    private final HotelsBookTotalV3BonusesView bonusesView;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final View dividerView;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final HotelsBookTotalV3FinalPriceView finalPriceView;

    @NotNull
    private final HotelsBookTotalV3StarsBonusesView starsBonusesView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(12, context);
        this.dp12 = px3;
        int px4 = ResourceExtKt.toPx(16, context);
        this.dp16 = px4;
        HotelsBookTotalV3FinalPriceView hotelsBookTotalV3FinalPriceView = new HotelsBookTotalV3FinalPriceView(context);
        hotelsBookTotalV3FinalPriceView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(hotelsBookTotalV3FinalPriceView);
        this.finalPriceView = hotelsBookTotalV3FinalPriceView;
        HotelsBookTotalV3BasePriceView hotelsBookTotalV3BasePriceView = new HotelsBookTotalV3BasePriceView(context);
        hotelsBookTotalV3BasePriceView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ViewExtKt.gone(hotelsBookTotalV3BasePriceView);
        addView(hotelsBookTotalV3BasePriceView);
        this.basePriceView = hotelsBookTotalV3BasePriceView;
        HotelsBookTotalV3StarsBonusesView hotelsBookTotalV3StarsBonusesView = new HotelsBookTotalV3StarsBonusesView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, px2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        hotelsBookTotalV3StarsBonusesView.setLayoutParams(layoutParams);
        ViewExtKt.gone(hotelsBookTotalV3StarsBonusesView);
        addView(hotelsBookTotalV3StarsBonusesView);
        this.starsBonusesView = hotelsBookTotalV3StarsBonusesView;
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, px);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, px3, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, px3);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        ViewExtKt.gone(view);
        addView(view);
        this.dividerView = view;
        HotelsBookTotalV3BonusesView hotelsBookTotalV3BonusesView = new HotelsBookTotalV3BonusesView(context);
        hotelsBookTotalV3BonusesView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ViewExtKt.gone(hotelsBookTotalV3BonusesView);
        addView(hotelsBookTotalV3BonusesView);
        this.bonusesView = hotelsBookTotalV3BonusesView;
        q qVar = q.f64554a;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        if (buttonV3View == null) {
            buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, px4, ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        buttonV3View.setLayoutParams(layoutParams3);
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, px2, ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
        textAtomV2View.setLayoutParams(layoutParams4);
        ViewExtKt.gone(textAtomV2View);
        addView(g10);
        this.agreementTextView = textAtomV2View;
        setOrientation(1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void disableTouchAndShowLoader() {
        this.buttonView.setOnTouchListener(new d());
        this.finalPriceView.setOnTouchListener(new e());
        this.basePriceView.setOnTouchListener(new f());
        this.buttonView.showLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disableTouchAndShowLoader$lambda$19(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disableTouchAndShowLoader$lambda$20(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disableTouchAndShowLoader$lambda$21(View view, MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void enableTouchAndHideLoader() {
        this.buttonView.setOnTouchListener(null);
        this.finalPriceView.setOnTouchListener(null);
        this.basePriceView.setOnTouchListener(null);
        this.buttonView.hideLoader();
    }

    private final void toggleButtonLoader(boolean isLoading) {
        if (isLoading) {
            disableTouchAndShowLoader();
        } else {
            enableTouchAndHideLoader();
        }
    }

    public final void bind(@NotNull HotelsBookTotalV3VO state, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.finalPriceView.bind(state.getPrice().getFinal());
        this.basePriceView.bindOrGone(state.getPrice().getBase());
        this.dividerView.setVisibility(state.getBonuses() != null ? 0 : 8);
        this.bonusesView.bindOrGone(state.getBonuses());
        bindNextButton(state.getNextButton(), state.getNextButtonAction(), actionHandler);
        toggleButtonLoader(state.getIsLoading());
        TextAtomV2View textAtomV2View = this.agreementTextView;
        TextDTO agreement = state.getAgreement();
        TextHolderKt.bindOrGone(textAtomV2View, agreement != null ? TextDTOExtensionsKt.withNavigationLinksHandling(agreement, this.agreementTextView, actionHandler) : null, actionHandler);
        this.starsBonusesView.bindOrGone(state.getStarsBonuses(), actionHandler);
    }

    public final void bindFinalPrice(@NotNull HotelsBookTotalV3VO.Price.Final finalPrice) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.finalPriceView.bind(finalPrice);
    }

    public final void bindNextButton(@NotNull ButtonV3DTO button, AtomAction action, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(this.buttonView, button, actionHandler);
        ViewExtKt.setOnClickListenerThrottle$default(this.buttonView, 0L, new HotelsBookTotalV3View$bindNextButton$1(action, actionHandler), 1, null);
    }

    public final void bindOrGoneAgreement(TextDTO agreement, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomV2View textAtomV2View = this.agreementTextView;
        TextHolderKt.bindOrGone(textAtomV2View, agreement != null ? TextDTOExtensionsKt.withNavigationLinksHandling(agreement, textAtomV2View, actionHandler) : null, actionHandler);
    }

    public final void bindOrGoneBasePrice(HotelsBookTotalV3VO.Price.Base basePrice) {
        this.basePriceView.bindOrGone(basePrice);
    }

    public final void bindOrGoneBonusesAmount(HotelsBookTotalV3VO.Bonuses bonuses) {
        this.bonusesView.bindOrGone(bonuses);
    }

    public final void bindOrGoneStarBonuses(HotelsBookTotalV3VO.StarsBonuses starsBonuses, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.starsBonusesView.bindOrGone(starsBonuses, actionHandler);
    }

    public final void setLoading(boolean isLoading) {
        toggleButtonLoader(isLoading);
    }

    public final void setOnPriceClickListener(@NotNull Function1<? super View, Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.finalPriceView.setOnClickListener(new a(click, 1));
        this.basePriceView.setOnClickListener(new g(click, 0));
    }
}
