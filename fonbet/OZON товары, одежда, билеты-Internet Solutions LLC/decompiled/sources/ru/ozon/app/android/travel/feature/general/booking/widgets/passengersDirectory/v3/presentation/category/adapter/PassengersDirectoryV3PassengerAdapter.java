package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category.PassengersDirectoryV3CategoryVO;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/adapter/PassengersDirectoryV3PassengerAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO$PassengerV3VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/adapter/PassengersDirectoryV3PassengerViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/adapter/PassengersDirectoryV3PassengerViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/adapter/PassengersDirectoryV3PassengerViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3PassengerAdapter extends t<PassengersDirectoryV3CategoryVO.PassengerV3VO, PassengersDirectoryV3PassengerViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PassengersDirectoryV3PassengerAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<PassengersDirectoryV3CategoryVO.PassengerV3VO>() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category.adapter.PassengersDirectoryV3PassengerAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(PassengersDirectoryV3CategoryVO.PassengerV3VO oldItem, PassengersDirectoryV3CategoryVO.PassengerV3VO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(PassengersDirectoryV3CategoryVO.PassengerV3VO oldItem, PassengersDirectoryV3CategoryVO.PassengerV3VO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PassengersDirectoryV3PassengerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PassengersDirectoryV3CategoryVO.PassengerV3VO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PassengersDirectoryV3PassengerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new PassengersDirectoryV3PassengerViewHolder(cellView, this.actionHandler);
    }
}
