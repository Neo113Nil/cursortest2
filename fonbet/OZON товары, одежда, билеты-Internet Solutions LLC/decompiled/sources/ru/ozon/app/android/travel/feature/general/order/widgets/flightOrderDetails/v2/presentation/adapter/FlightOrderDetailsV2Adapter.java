package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00062\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/FlightOrderDetailsV2Adapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/FlightOrderDetailsV2DelegateAdapter;", "delegateAdapter$delegate", "LSc/j;", "getDelegateAdapter", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/FlightOrderDetailsV2DelegateAdapter;", "delegateAdapter", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2Adapter extends i<FlightOrderDetailsV2VO.Segment, FlightOrderDetailsV2ViewHolder<?>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: delegateAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j delegateAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightOrderDetailsV2Adapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull J lifecycleOwner) {
        super(FlightOrderDetailsV2SegmentsDiffUtil.INSTANCE, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.delegateAdapter = LazyUtilsKt.unsafeLazy(FlightOrderDetailsV2Adapter$delegateAdapter$2.INSTANCE);
    }

    private final FlightOrderDetailsV2DelegateAdapter getDelegateAdapter() {
        return (FlightOrderDetailsV2DelegateAdapter) this.delegateAdapter.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        FlightOrderDetailsV2DelegateAdapter delegateAdapter = getDelegateAdapter();
        FlightOrderDetailsV2VO.Segment item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return delegateAdapter.getItemViewType(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FlightOrderDetailsV2ViewHolder<?> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FlightOrderDetailsV2VO.Segment item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FlightOrderDetailsV2ViewHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FlightOrderDetailsV2DelegateAdapter delegateAdapter = getDelegateAdapter();
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return delegateAdapter.createViewHolder(context, viewType);
    }
}
