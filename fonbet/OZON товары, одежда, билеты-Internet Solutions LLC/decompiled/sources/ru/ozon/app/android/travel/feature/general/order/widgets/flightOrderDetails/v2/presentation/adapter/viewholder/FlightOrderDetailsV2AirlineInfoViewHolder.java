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
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.view.AirlineInfoView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/FlightOrderDetailsV2AirlineInfoViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$AirlineInfo;", "view", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/view/AirlineInfoView;", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/view/AirlineInfoView;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindTyped", "", "segment", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2AirlineInfoViewHolder extends FlightOrderDetailsV2ViewHolder<FlightOrderDetailsV2VO.Segment.AirlineInfo> {

    @NotNull
    private final AirlineInfoView view;

    private FlightOrderDetailsV2AirlineInfoViewHolder(AirlineInfoView airlineInfoView) {
        super(airlineInfoView);
        this.view = airlineInfoView;
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder
    public /* bridge */ /* synthetic */ void bindTyped(FlightOrderDetailsV2VO.Segment.AirlineInfo airlineInfo, Function1 function1) {
        bindTyped2(airlineInfo, (Function1<? super AtomAction, Unit>) function1);
    }

    /* renamed from: bindTyped, reason: avoid collision after fix types in other method */
    protected void bindTyped2(@NotNull FlightOrderDetailsV2VO.Segment.AirlineInfo segment, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view.bind(segment, actionHandler);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FlightOrderDetailsV2AirlineInfoViewHolder(@NotNull Context context) {
        this(r0);
        Intrinsics.checkNotNullParameter(context, "context");
        AirlineInfoView airlineInfoView = new AirlineInfoView(context);
        airlineInfoView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
