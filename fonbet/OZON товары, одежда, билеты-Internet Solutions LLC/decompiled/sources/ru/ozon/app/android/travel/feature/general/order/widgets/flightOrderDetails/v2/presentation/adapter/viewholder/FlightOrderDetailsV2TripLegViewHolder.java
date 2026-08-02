package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v1.TripLegVO;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v1.TripLegView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ+\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/FlightOrderDetailsV2TripLegViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$TripLeg;", "view", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegView;", "<init>", "(Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegView;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindTyped", "", "segment", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindTyped-Sm7mdfc", "(Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;Lkotlin/jvm/functions/Function1;)V", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2TripLegViewHolder extends FlightOrderDetailsV2ViewHolder<FlightOrderDetailsV2VO.Segment.TripLeg> {
    public static final int $stable = TripLegView.$stable;

    @NotNull
    private final TripLegView view;

    private FlightOrderDetailsV2TripLegViewHolder(TripLegView tripLegView) {
        super(tripLegView);
        this.view = tripLegView;
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder
    public /* bridge */ /* synthetic */ void bindTyped(FlightOrderDetailsV2VO.Segment.TripLeg tripLeg, Function1 function1) {
        m1308bindTypedSm7mdfc(tripLeg.getTripLeg(), function1);
    }

    /* renamed from: bindTyped-Sm7mdfc, reason: not valid java name */
    protected void m1308bindTypedSm7mdfc(@NotNull TripLegVO segment, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view.bind(segment);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FlightOrderDetailsV2TripLegViewHolder(@NotNull Context context) {
        this(r1);
        Intrinsics.checkNotNullParameter(context, "context");
        TripLegView tripLegView = new TripLegView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(12, context);
        tripLegView.setLayoutParams(layoutParams);
    }
}
