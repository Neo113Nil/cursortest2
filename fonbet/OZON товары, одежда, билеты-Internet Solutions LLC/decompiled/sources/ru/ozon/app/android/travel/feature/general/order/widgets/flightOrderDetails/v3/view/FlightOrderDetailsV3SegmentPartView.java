package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.view;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.presentation.SegmentPartVO;
import ru.ozon.app.android.travel.molecules.view.airlineCustomCell.AirlineCustomCellView;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v2.TripLegV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/view/FlightOrderDetailsV3SegmentPartView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "airlineCell", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellView;", "tripLeg", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v2/TripLegV2View;", "transferCell", "Lru/ozon/uni/android/cell/CellView;", "bind", "", "data", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/SegmentPartVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV3SegmentPartView extends LinearLayout {
    public static final int $stable = (CellView.$stable | TripLegV2View.$stable) | AirlineCustomCellView.$stable;

    @NotNull
    private final AirlineCustomCellView airlineCell;
    private final int dp12;
    private final int dp8;

    @NotNull
    private final CellView transferCell;

    @NotNull
    private final TripLegV2View tripLeg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV3SegmentPartView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(12, context);
        this.dp12 = px2;
        AirlineCustomCellView airlineCustomCellView = new AirlineCustomCellView(context);
        airlineCustomCellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(airlineCustomCellView);
        this.airlineCell = airlineCustomCellView;
        TripLegV2View tripLegV2View = new TripLegV2View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, px, 0, 0);
        tripLegV2View.setLayoutParams(layoutParams);
        addView(tripLegV2View);
        this.tripLeg = tripLegV2View;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, px2, 0, 0);
        cellView.setLayoutParams(layoutParams2);
        addView(cellView);
        this.transferCell = cellView;
        setOrientation(1);
    }

    public final void bind(@NotNull SegmentPartVO data, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.airlineCell.bind(data.getAirlineCell());
        this.tripLeg.bind(data.getTripLeg());
        CellHolderKt.bindOrGone(this.transferCell, data.getTransferCell(), actionHandler);
    }
}
