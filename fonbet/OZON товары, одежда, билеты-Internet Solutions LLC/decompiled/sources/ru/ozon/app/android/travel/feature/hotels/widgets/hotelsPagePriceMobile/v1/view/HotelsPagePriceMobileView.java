package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.view;

import Am.C2438a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.presentation.price.HotelsPagePriceMobilePriceVI;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'j\u0002`)J&\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'j\u0002`)J(\u0010-\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010/2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'j\u0002`)J(\u00100\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u00010/2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'j\u0002`)J2\u00102\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010/2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'j\u0002`)J\b\u00106\u001a\u00020#H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0018¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/view/HotelsPagePriceMobileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp2", "", "dp6", "dp10", "dp12", "radius16", "", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "bankBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBankBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "bankBadgeView$delegate", "nightsCountBadgeView", "getNightsCountBadgeView", "nightsCountBadgeView$delegate", "starsBadgeView", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeView;", "starsDetailInfoBadgeView", "getStarsDetailInfoBadgeView", "starsDetailInfoBadgeView$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/price/HotelsPagePriceMobilePriceVI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "bindPrice", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "bindBankBadge", "bankBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bindNightsCountBadge", "nightsCountBadge", "bindStars", "starsBadge", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "detailInfoBadge", "placeViews", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPagePriceMobileView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsPagePriceMobileView.class, "priceView", "getPriceView()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(HotelsPagePriceMobileView.class, "bankBadgeView", "getBankBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsPagePriceMobileView.class, "nightsCountBadgeView", "getNightsCountBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsPagePriceMobileView.class, "starsDetailInfoBadgeView", "getStarsDetailInfoBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable;

    /* renamed from: bankBadgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate bankBadgeView;

    @NotNull
    private final DesignSystemDimensProvider dimensProvider;
    private final int dp10;
    private final int dp12;
    private final int dp2;
    private final int dp6;

    /* renamed from: nightsCountBadgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate nightsCountBadgeView;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceView;
    private final float radius16;

    @NotNull
    private final StarsBadgeView starsBadgeView;

    /* renamed from: starsDetailInfoBadgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate starsDetailInfoBadgeView;

    static {
        int i11 = BadgeView.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i11 | i12 | StarsBadgeView.$stable | i11 | i12 | i12 | PriceAtomView.$stable | i12 | DesignSystemDimensProvider.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPagePriceMobileView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dimensProvider = dimens$default;
        this.dp2 = dimens$default.getMargin2();
        this.dp6 = dimens$default.getMargin6();
        int margin10 = dimens$default.getMargin10();
        this.dp10 = margin10;
        int margin12 = dimens$default.getMargin12();
        this.dp12 = margin12;
        float radius16 = dimens$default.getRadius16();
        this.radius16 = radius16;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.priceView = new PreCreationViewPoolDelegate(context2, N.b(PriceAtomView.class), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$1(this), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.bankBadgeView = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$3(this), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.nightsCountBadgeView = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$5(this), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$6(this));
        StarsBadgeView starsBadgeView = new StarsBadgeView(context);
        starsBadgeView.setId(R$id.hotelsPagePriceMobileStarsBadge);
        starsBadgeView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        ViewExtKt.gone(starsBadgeView);
        addView(starsBadgeView);
        this.starsBadgeView = starsBadgeView;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.starsDetailInfoBadgeView = new PreCreationViewPoolDelegate(context5, N.b(BadgeView.class), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$7(this), new HotelsPagePriceMobileView$special$$inlined$preCreationViewPool$default$8(this));
        setPadding(margin10, margin12, margin10, margin12);
        ViewExtensionsKt.applyRoundedOutline(this, radius16);
        placeViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBankBadgeView() {
        return (BadgeView) this.bankBadgeView.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getNightsCountBadgeView() {
        return (BadgeView) this.nightsCountBadgeView.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getPriceView() {
        return (PriceAtomView) this.priceView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getStarsDetailInfoBadgeView() {
        return (BadgeView) this.starsDetailInfoBadgeView.getValue(this, $$delegatedProperties[3]);
    }

    private final void placeViews() {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelsPagePriceMobileView$placeViews$1(this));
    }

    public final void bind(@NotNull HotelsPagePriceMobilePriceVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        PriceAtomHolderKt.bind(getPriceView(), item.getPrice(), actionHandler);
        BadgeHolderKt.bindOrGone(getBankBadgeView(), item.getWithBankBadge(), actionHandler);
        BadgeHolderKt.bindOrGone(getNightsCountBadgeView(), item.getNightsCountBadge(), actionHandler);
        bindStars(item.getStarsBadge(), item.getStarsDetailInfoBadge(), actionHandler);
    }

    public final void bindBankBadge(BadgeDTO bankBadge, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bindOrGone(getBankBadgeView(), bankBadge, actionHandler);
    }

    public final void bindNightsCountBadge(BadgeDTO nightsCountBadge, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bindOrGone(getNightsCountBadgeView(), nightsCountBadge, actionHandler);
    }

    public final void bindPrice(@NotNull PriceDTO price, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        PriceAtomHolderKt.bind(getPriceView(), price, actionHandler);
    }

    public final void bindStars(StarsBadgeVI starsBadge, BadgeDTO detailInfoBadge, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.starsBadgeView.bindOrGone(starsBadge, actionHandler);
        if (starsBadge == null || detailInfoBadge == null) {
            ViewExtKt.gone(getStarsDetailInfoBadgeView());
        } else {
            BadgeHolderKt.bind(getStarsDetailInfoBadgeView(), detailInfoBadge, actionHandler);
            ViewExtKt.show(getStarsDetailInfoBadgeView());
        }
    }
}
