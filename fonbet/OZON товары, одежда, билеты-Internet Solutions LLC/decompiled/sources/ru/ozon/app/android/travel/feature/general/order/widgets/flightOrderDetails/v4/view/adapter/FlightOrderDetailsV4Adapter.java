package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view.FlightOrderDetailsV4SegmentPartView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\u00112\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014j\u0004\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/adapter/FlightOrderDetailsV4Adapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/adapter/FlightOrderDetailsV4ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4SegmentPartView;", "getView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4SegmentPartView;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/adapter/FlightOrderDetailsV4ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/adapter/FlightOrderDetailsV4ViewHolder;I)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "setupActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4Adapter extends t<FlightOrderDetailsV4VO.SegmentPartVO, FlightOrderDetailsV4ViewHolder> {
    private Function1<? super AtomAction, Unit> actionHandler;

    public FlightOrderDetailsV4Adapter() {
        super(new i.d<FlightOrderDetailsV4VO.SegmentPartVO>() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view.adapter.FlightOrderDetailsV4Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(FlightOrderDetailsV4VO.SegmentPartVO oldItem, FlightOrderDetailsV4VO.SegmentPartVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(FlightOrderDetailsV4VO.SegmentPartVO oldItem, FlightOrderDetailsV4VO.SegmentPartVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    private final FlightOrderDetailsV4SegmentPartView getView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlightOrderDetailsV4SegmentPartView flightOrderDetailsV4SegmentPartView = new FlightOrderDetailsV4SegmentPartView(context);
        flightOrderDetailsV4SegmentPartView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return flightOrderDetailsV4SegmentPartView;
    }

    public final void setupActionHandler(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FlightOrderDetailsV4ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FlightOrderDetailsV4VO.SegmentPartVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FlightOrderDetailsV4ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new FlightOrderDetailsV4ViewHolder(getView(parent));
    }
}
