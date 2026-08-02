package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.FlightOrderDetailsV2AdditionalInfoViewHolder;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$1 extends AbstractC7737t implements Function1<Context, FlightOrderDetailsV2ViewHolder<? extends FlightOrderDetailsV2VO.Segment>> {
    public static final FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$1 INSTANCE = new FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$1();

    FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FlightOrderDetailsV2ViewHolder<? extends FlightOrderDetailsV2VO.Segment> invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new FlightOrderDetailsV2AdditionalInfoViewHolder(context);
    }
}
