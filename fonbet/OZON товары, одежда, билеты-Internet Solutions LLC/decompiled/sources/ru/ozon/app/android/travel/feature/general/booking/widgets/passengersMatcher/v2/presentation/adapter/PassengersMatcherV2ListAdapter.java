package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.PassengersMatcherV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/adapter/PassengersMatcherV2ListAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersMatcherV2ListAdapter extends AsyncListDifferDelegationAdapter<PassengersMatcherV2VO.PassengersMatcherItemVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersMatcherV2ListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<PassengersMatcherV2VO.PassengersMatcherItemVO>() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter.PassengersMatcherV2ListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(PassengersMatcherV2VO.PassengersMatcherItemVO oldItem, PassengersMatcherV2VO.PassengersMatcherItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(PassengersMatcherV2VO.PassengersMatcherItemVO oldItem, PassengersMatcherV2VO.PassengersMatcherItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.delegatesManager.addDelegate(CategoryAdapterDelegateKt.categoryAdapterDelegate()).addDelegate(PassengerCellAdapterDelegateKt.passengerCellAdapterDelegate(actionHandler));
    }
}
