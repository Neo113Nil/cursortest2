package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.HotelsOrderRoomsDetailsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsCellListAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsViewHolder;", "Lkotlin/jvm/functions/Function1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsOrderRoomsDetailsCellListAdapter extends i<HotelsOrderRoomsDetailsVO.CellListVO, HotelsOrderRoomsDetailsItemCellsViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsOrderRoomsDetailsCellListAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull J lifecycleOwner) {
        super(new HotelsOrderRoomsDetailsCellListDiffCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsOrderRoomsDetailsItemCellsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsOrderRoomsDetailsVO.CellListVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.onAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsOrderRoomsDetailsItemCellsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsOrderRoomsDetailsItemCellsView hotelsOrderRoomsDetailsItemCellsView = new HotelsOrderRoomsDetailsItemCellsView(context);
        hotelsOrderRoomsDetailsItemCellsView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new HotelsOrderRoomsDetailsItemCellsViewHolder(hotelsOrderRoomsDetailsItemCellsView);
    }
}
