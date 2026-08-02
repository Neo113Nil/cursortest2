package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.view.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.presentation.SegmentPartVO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.view.FlightOrderDetailsV3SegmentPartView;
import ru.ozon.app.android.travel.molecules.view.airlineCustomCell.AirlineCustomCellView;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v2.TripLegV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/view/adapter/FlightOrderDetailsV3ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/view/FlightOrderDetailsV3SegmentPartView;", "view", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/view/FlightOrderDetailsV3SegmentPartView;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/SegmentPartVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/SegmentPartVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/view/FlightOrderDetailsV3SegmentPartView;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV3ViewHolder extends RecyclerView.C {
    public static final int $stable = (CellView.$stable | TripLegV2View.$stable) | AirlineCustomCellView.$stable;

    @NotNull
    private final FlightOrderDetailsV3SegmentPartView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV3ViewHolder(@NotNull FlightOrderDetailsV3SegmentPartView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull SegmentPartVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, actionHandler);
    }
}
