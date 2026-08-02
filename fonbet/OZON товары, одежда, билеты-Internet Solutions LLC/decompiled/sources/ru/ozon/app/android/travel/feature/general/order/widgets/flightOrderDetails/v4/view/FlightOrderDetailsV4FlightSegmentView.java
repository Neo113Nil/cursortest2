package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v3.TripLegV3View;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001fj\u0004\u0018\u0001`!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4FlightSegmentView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "dpF16", "", "badgeV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "airlineCell", "Lru/ozon/uni/android/cell/CellView;", "getAirlineCell", "()Lru/ozon/uni/android/cell/CellView;", "airlineCell$delegate", "tripLeg", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v3/TripLegV3View;", "luggageBlock", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4LuggageBlockView;", "bind", "", "data", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4FlightSegmentView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightOrderDetailsV4FlightSegmentView.class, "badgeV", "getBadgeV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(FlightOrderDetailsV4FlightSegmentView.class, "airlineCell", "getAirlineCell()Lru/ozon/uni/android/cell/CellView;", 0)};
    public static final int $stable = 8;

    /* renamed from: airlineCell$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate airlineCell;

    /* renamed from: badgeV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badgeV;
    private final int dp16;
    private final int dp8;
    private final float dpF16;

    @NotNull
    private final FlightOrderDetailsV4LuggageBlockView luggageBlock;

    @NotNull
    private final TripLegV3View tripLeg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV4FlightSegmentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpF16 = pxF;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.badgeV = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new FlightOrderDetailsV4FlightSegmentView$special$$inlined$preCreationViewPool$default$1(this), new FlightOrderDetailsV4FlightSegmentView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.airlineCell = new PreCreationViewPoolDelegate(context3, N.b(CellView.class), new FlightOrderDetailsV4FlightSegmentView$special$$inlined$preCreationViewPool$default$3(this), new FlightOrderDetailsV4FlightSegmentView$special$$inlined$preCreationViewPool$default$4(this));
        TripLegV3View tripLegV3View = new TripLegV3View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = px;
        tripLegV3View.setLayoutParams(layoutParams);
        this.tripLeg = tripLegV3View;
        FlightOrderDetailsV4LuggageBlockView flightOrderDetailsV4LuggageBlockView = new FlightOrderDetailsV4LuggageBlockView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = px2;
        flightOrderDetailsV4LuggageBlockView.setLayoutParams(layoutParams2);
        this.luggageBlock = flightOrderDetailsV4LuggageBlockView;
        addView(getBadgeV());
        addView(getAirlineCell());
        addView(tripLegV3View);
        addView(flightOrderDetailsV4LuggageBlockView);
        setOrientation(1);
        setPadding(px2, px2, px2, px2);
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), pxF));
    }

    private final CellView getAirlineCell() {
        return (CellView) this.airlineCell.getValue(this, $$delegatedProperties[1]);
    }

    private final BadgeView getBadgeV() {
        return (BadgeView) this.badgeV.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO data, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        BadgeHolderKt.bindOrGone(getBadgeV(), data.getBadge(), actionHandler);
        CellHolderKt.bind(getAirlineCell(), data.getAirlineCell(), actionHandler);
        this.tripLeg.bind(data.getTripLeg());
        this.luggageBlock.bind(data.getLuggageBlock());
    }
}
