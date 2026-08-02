package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.content;

import Bl.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.view.RailwayScrollPriceCalendarView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$DateTabVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/view/RailwayScrollPriceCalendarView;", "getView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/view/RailwayScrollPriceCalendarView;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/content/RailwayScrollPriceCalendarViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayScrollPriceCalendarAdapter extends t<RailwayScrollPriceCalendarVO.DateTabVO, RailwayScrollPriceCalendarViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RailwayScrollPriceCalendarAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<RailwayScrollPriceCalendarVO.DateTabVO>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.content.RailwayScrollPriceCalendarAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(RailwayScrollPriceCalendarVO.DateTabVO oldItem, RailwayScrollPriceCalendarVO.DateTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(RailwayScrollPriceCalendarVO.DateTabVO oldItem, RailwayScrollPriceCalendarVO.DateTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    private final RailwayScrollPriceCalendarView getView(ViewGroup parent) {
        RailwayScrollPriceCalendarView railwayScrollPriceCalendarView = (RailwayScrollPriceCalendarView) b.a(RailwayScrollPriceCalendarView.class, "type", q.f64554a, null);
        if (railwayScrollPriceCalendarView != null) {
            return railwayScrollPriceCalendarView;
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new RailwayScrollPriceCalendarView(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RailwayScrollPriceCalendarViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RailwayScrollPriceCalendarVO.DateTabVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RailwayScrollPriceCalendarViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RailwayScrollPriceCalendarView view = getView(parent);
        view.setLayoutParams(new RecyclerView.p(-2, -2));
        return new RailwayScrollPriceCalendarViewHolder(view, this.actionHandler);
    }
}
