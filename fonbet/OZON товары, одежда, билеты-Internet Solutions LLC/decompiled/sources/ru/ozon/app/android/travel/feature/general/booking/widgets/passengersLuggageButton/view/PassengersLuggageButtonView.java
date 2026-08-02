package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.view;

import B90.C2618u;
import De.C2860c;
import F3.G;
import Im.a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.presentation.PassengersLuggageButtonButtonVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.TextDTOExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001aj\u0004\u0018\u0001`\u001cJ\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/view/PassengersLuggageButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "dp16", "titleTV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconIV", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "badgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "pricePV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "buttonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "termsTitleTV", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/presentation/PassengersLuggageButtonButtonVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "addViews", "setConstraints", "setupRoot", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersLuggageButtonView extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeBV;

    @NotNull
    private final ButtonV3View buttonBV;
    private final int dp12;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final IconButtonV3View iconIV;

    @NotNull
    private final PriceAtomView pricePV;

    @NotNull
    private final TextAtomV2View termsTitleTV;

    @NotNull
    private final TextAtomV2View titleTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersLuggageButtonView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp12 = UiExtKt.toPx(12, context);
        this.dp16 = UiExtKt.toPx(16, context);
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View, R$id.passengersLuggageButtonTitle, -2, -2);
        this.titleTV = textAtomV2View;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context);
        if (iconButtonV3View == null) {
            context2 = context;
            iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        iconButtonV3View.setId(R$id.passengersLuggageButtonIcon);
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.iconIV = iconButtonV3View;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context2);
        a.c(badgeView, R$id.passengersLuggageButtonBadge, -2, -2);
        this.badgeBV = badgeView;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context2);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context2, null, 0, 6, null) : priceAtomView;
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.passengersLuggageButtonPrice, -2, -2);
        b11.f41616W = true;
        b11.f41598E = 1.0f;
        priceAtomView.setLayoutParams(b11);
        this.pricePV = priceAtomView;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context2);
        buttonV3View = buttonV3View == null ? new ButtonV3View(context2, null, 0, 0, 14, null) : buttonV3View;
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.passengersLuggageButtonButton, 0, -2);
        e11.f41660x = 0;
        buttonV3View.setLayoutParams(e11);
        this.buttonBV = buttonV3View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        G.g(textAtomV2View2, R$id.passengersLuggageButtonTermsTitle, 0, -2);
        this.termsTitleTV = textAtomV2View2;
        addViews();
        setConstraints();
        setupRoot();
    }

    private final void addViews() {
        addView(this.titleTV);
        addView(this.iconIV);
        addView(this.badgeBV);
        addView(this.pricePV);
        addView(this.buttonBV);
        addView(this.termsTitleTV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new PassengersLuggageButtonView$setConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(i11, i11, i11, i11);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    public final void bind(@NotNull PassengersLuggageButtonButtonVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(this.titleTV, item.getTitle(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.iconIV, item.getIconButton(), actionHandler);
        BadgeHolderKt.bindOrGone(this.badgeBV, item.getMilesBadge(), actionHandler);
        PriceAtomHolderKt.bindOrGone$default(this.pricePV, item.getPrice(), null, 2, null);
        ButtonV3HolderKt.bindOrGone(this.buttonBV, item.getButton(), actionHandler);
        TextAtomV2View textAtomV2View = this.termsTitleTV;
        TextDTO termsTitle = item.getTermsTitle();
        TextHolderKt.bindOrGone$default(textAtomV2View, termsTitle != null ? TextDTOExtensionsKt.withNavigationLinksHandling(termsTitle, this.termsTitleTV, actionHandler) : null, null, 2, null);
    }
}
