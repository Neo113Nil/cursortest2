package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001b\u0010+\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$R\u001b\u0010=\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b<\u0010/¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2BonusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "", "addToLayout", "(Landroid/view/View;)V", "setupConstraints", "()V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;", "bonusTotal", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;Lkotlin/jvm/functions/Function1;)V", "", "dp1", "I", "dp2", "dp4", "", "dp6F", "F", "dp8", "dp12", "dp14", "dp16", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "title$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitle", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bonusPrice$delegate", "getBonusPrice", "bonusPrice", "bonusDetailsTitle$delegate", "getBonusDetailsTitle", "bonusDetailsTitle", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "bonusDetailsIconButton$delegate", "getBonusDetailsIconButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "bonusDetailsIconButton", "separator", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "price$delegate", "getPrice", "()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "price", "priceDetailsTitle$delegate", "getPriceDetailsTitle", "priceDetailsTitle", "priceDetailsIconButton$delegate", "getPriceDetailsIconButton", "priceDetailsIconButton", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2BonusView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelPriceDetailInformationV2BonusView.class, SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2BonusView.class, "bonusPrice", "getBonusPrice()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2BonusView.class, "bonusDetailsTitle", "getBonusDetailsTitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2BonusView.class, "bonusDetailsIconButton", "getBonusDetailsIconButton()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", 0), C2438a.c(TravelPriceDetailInformationV2BonusView.class, "price", "getPrice()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", 0), C2438a.c(TravelPriceDetailInformationV2BonusView.class, "priceDetailsTitle", "getPriceDetailsTitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2BonusView.class, "priceDetailsIconButton", "getPriceDetailsIconButton()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", 0)};
    public static final int $stable = 8;

    /* renamed from: bonusDetailsIconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate bonusDetailsIconButton;

    /* renamed from: bonusDetailsTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate bonusDetailsTitle;

    /* renamed from: bonusPrice$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate bonusPrice;
    private final int dp1;
    private final int dp12;
    private final int dp14;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final float dp6F;
    private final int dp8;

    /* renamed from: price$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate price;

    /* renamed from: priceDetailsIconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceDetailsIconButton;

    /* renamed from: priceDetailsTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceDetailsTitle;

    @NotNull
    private final View separator;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2BonusView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp6F = ResourceExtKt.toPxF(6, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        this.dp14 = ResourceExtKt.toPx(14, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.title = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$1(this), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.bonusPrice = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$3(this), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$4(context, this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.bonusDetailsTitle = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$5(this), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$6(this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.bonusDetailsIconButton = new PreCreationViewPoolDelegate(context5, N.b(SmallIconButtonView.class), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$7(this), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$8(this));
        View view = new View(context);
        view.setId(R$id.travelPriceDetailInfoBonusSeparator);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px, px2);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        bVar.f41598E = 0.466f;
        view.setLayoutParams(bVar);
        addToLayout(view);
        this.separator = view;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.price = new PreCreationViewPoolDelegate(context6, N.b(PriceView.class), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$9(this), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$10(this));
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.priceDetailsTitle = new PreCreationViewPoolDelegate(context7, N.b(TextAtomView.class), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$11(this), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$12(this));
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        this.priceDetailsIconButton = new PreCreationViewPoolDelegate(context8, N.b(SmallIconButtonView.class), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$13(this), new TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$14(this));
        setupConstraints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToLayout(View view) {
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmallIconButtonView getBonusDetailsIconButton() {
        return (SmallIconButtonView) this.bonusDetailsIconButton.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getBonusDetailsTitle() {
        return (TextAtomView) this.bonusDetailsTitle.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getBonusPrice() {
        return (TextAtomView) this.bonusPrice.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceView getPrice() {
        return (PriceView) this.price.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmallIconButtonView getPriceDetailsIconButton() {
        return (SmallIconButtonView) this.priceDetailsIconButton.getValue(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getPriceDetailsTitle() {
        return (TextAtomView) this.priceDetailsTitle.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getTitle() {
        return (TextAtomView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new TravelPriceDetailInformationV2BonusView$setupConstraints$1(this));
    }

    public final void bind(@NotNull TravelPriceDetailInformationV2VO.BonusPriceRowVO bonusTotal, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(bonusTotal, "bonusTotal");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Integer bonusPriceBackgroundColor = bonusTotal.getBonusPriceBackgroundColor();
        if (bonusPriceBackgroundColor != null) {
            ViewExtKt.setBackgroundTint(getBonusPrice(), bonusPriceBackgroundColor.intValue());
        }
        TextAtomHolderKt.bind$default(getTitle(), bonusTotal.getTitle(), null, 2, null);
        TextAtomHolderKt.bind$default(getBonusPrice(), bonusTotal.getBonusPrice(), null, 2, null);
        TextAtomHolderKt.bind$default(getBonusDetailsTitle(), bonusTotal.getBonusDetailsTitle(), null, 2, null);
        WrappedIconButtonHolderKt.bind(getBonusDetailsIconButton(), bonusTotal.getBonusDetailsIconButton(), onAction);
        PriceHolderKt.bind$default(getPrice(), bonusTotal.getPrice(), null, 2, null);
        TextAtomHolderKt.bind$default(getPriceDetailsTitle(), bonusTotal.getPriceDetailsTitle(), null, 2, null);
        WrappedIconButtonHolderKt.bind(getPriceDetailsIconButton(), bonusTotal.getPriceDetailsIconButton(), onAction);
    }
}
