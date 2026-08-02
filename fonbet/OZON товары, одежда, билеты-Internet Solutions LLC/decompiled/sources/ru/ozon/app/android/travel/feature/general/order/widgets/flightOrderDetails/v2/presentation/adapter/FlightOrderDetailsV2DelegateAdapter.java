package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter;

import android.content.Context;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR@\u0010\u0013\u001a.\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f0\u00110\u000fj\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/FlightOrderDetailsV2DelegateAdapter;", "", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "item", "", "getItemViewType", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;)I", "Landroid/content/Context;", "context", "viewType", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "createViewHolder", "(Landroid/content/Context;I)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Ljava/util/LinkedHashMap;", "Lkotlin/reflect/d;", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/ViewHoldersFactory;", "viewHoldersFactory", "Ljava/util/LinkedHashMap;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2DelegateAdapter {

    @NotNull
    private final LinkedHashMap<d<? extends FlightOrderDetailsV2VO.Segment>, Function1<Context, FlightOrderDetailsV2ViewHolder<? extends FlightOrderDetailsV2VO.Segment>>> viewHoldersFactory = U.g(new Pair(N.b(FlightOrderDetailsV2VO.Segment.AdditionalInfo.class), FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$1.INSTANCE), new Pair(N.b(FlightOrderDetailsV2VO.Segment.AirlineInfo.class), FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$2.INSTANCE), new Pair(N.b(FlightOrderDetailsV2VO.Segment.BookingInfo.class), FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$3.INSTANCE), new Pair(N.b(FlightOrderDetailsV2VO.Segment.DashedSeparator.class), FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$4.INSTANCE), new Pair(N.b(FlightOrderDetailsV2VO.Segment.Transfer.class), FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$5.INSTANCE), new Pair(N.b(FlightOrderDetailsV2VO.Segment.TripLeg.class), FlightOrderDetailsV2DelegateAdapter$viewHoldersFactory$6.INSTANCE));

    @NotNull
    public final FlightOrderDetailsV2ViewHolder<?> createViewHolder(@NotNull Context context, int viewType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Collection<Function1<Context, FlightOrderDetailsV2ViewHolder<? extends FlightOrderDetailsV2VO.Segment>>> values = this.viewHoldersFactory.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return (FlightOrderDetailsV2ViewHolder) ((Function1) C7714v.F(values, viewType)).invoke(context);
    }

    public final int getItemViewType(@NotNull FlightOrderDetailsV2VO.Segment item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Set<d<? extends FlightOrderDetailsV2VO.Segment>> keySet = this.viewHoldersFactory.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        int i11 = 0;
        for (Object obj : keySet) {
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (Intrinsics.d((d) obj, N.b(item.getClass()))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}
