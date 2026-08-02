package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.adapter;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.HotelsOrderRoomsDetailsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsView;", "containerView", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsView;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsItemCellsView;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsOrderRoomsDetailsItemCellsViewHolder extends j {

    @NotNull
    private final HotelsOrderRoomsDetailsItemCellsView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsOrderRoomsDetailsItemCellsViewHolder(@NotNull HotelsOrderRoomsDetailsItemCellsView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void bind(@NotNull HotelsOrderRoomsDetailsVO.CellListVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.containerView.bind(item, onAction);
    }
}
