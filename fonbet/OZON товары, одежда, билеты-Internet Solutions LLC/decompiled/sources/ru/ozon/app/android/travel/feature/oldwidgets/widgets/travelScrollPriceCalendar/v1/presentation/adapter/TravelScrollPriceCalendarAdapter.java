package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.adapter;

import TS.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012(\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R6\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/adapter/TravelScrollPriceCalendarAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO$DateTabVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function2;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "position", "", "", "payloads", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarAdapter extends AsyncListDifferDelegationAdapter<TravelScrollPriceCalendarVO.DateTabVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function2<Map<String, TokenizedTrackingInfo>, String, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelScrollPriceCalendarAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> onAction) {
        super(new i.d<TravelScrollPriceCalendarVO.DateTabVO>() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.adapter.TravelScrollPriceCalendarAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelScrollPriceCalendarVO.DateTabVO oldItem, TravelScrollPriceCalendarVO.DateTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelScrollPriceCalendarVO.DateTabVO oldItem, TravelScrollPriceCalendarVO.DateTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.actionHandler = actionHandler;
        this.onAction = onAction;
        this.delegatesManager.addDelegate(R$id.travel_scroll_price_calendar, TravelScrollPriceCalendarAdapterDelegateKt.travelScrollPriceCalendarAdapterDelegate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(TravelScrollPriceCalendarVO.DateTabVO dateTabVO, TravelScrollPriceCalendarAdapter travelScrollPriceCalendarAdapter, View view) {
        AtomAction action = dateTabVO.getAction();
        if (action != null) {
            travelScrollPriceCalendarAdapter.actionHandler.invoke(action);
        }
        travelScrollPriceCalendarAdapter.onAction.invoke(dateTabVO.getTrackingInfo(), dateTabVO.getPriceForAnalytics());
    }

    @Override // ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter, androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
        if (holder.getItemViewType() == R$id.travel_scroll_price_calendar) {
            holder.itemView.setOnClickListener(new a(0, getItems().get(position), this));
        }
    }
}
