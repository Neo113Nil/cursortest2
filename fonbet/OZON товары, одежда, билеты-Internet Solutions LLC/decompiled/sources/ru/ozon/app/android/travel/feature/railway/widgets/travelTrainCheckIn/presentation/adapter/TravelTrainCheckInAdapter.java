package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.presentation.adapter;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/presentation/adapter/TravelTrainCheckInAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/uni/atoms/data/AtomDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainCheckInAdapter extends AsyncListDifferDelegationAdapter<AtomDTO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTrainCheckInAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<AtomDTO>() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.presentation.adapter.TravelTrainCheckInAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(AtomDTO oldItem, AtomDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (oldItem instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio) {
                    return false;
                }
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AtomDTO oldItem, AtomDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getItemType() == newItem.getItemType();
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.delegatesManager.addDelegate(0, HeaderAdapterDelegateKt.headerAdapterDelegate()).addDelegate(1, PassengerAdapterDelegateKt.passengerAdapterDelegate(actionHandler)).addDelegate(2, ButtonAdapterDelegateKt.buttonAdapterDelegate(actionHandler));
    }
}
