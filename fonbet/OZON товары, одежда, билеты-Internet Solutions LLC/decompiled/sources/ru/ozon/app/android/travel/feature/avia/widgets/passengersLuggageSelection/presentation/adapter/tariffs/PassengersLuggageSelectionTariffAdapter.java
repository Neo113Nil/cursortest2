package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.tariffs;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/adapter/tariffs/PassengersLuggageSelectionTariffAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffListItemVO;", "<init>", "()V", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionTariffAdapter extends AsyncListDifferDelegationAdapter<PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO> {
    private Function1<? super AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.tariffs.PassengersLuggageSelectionTariffAdapter$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            Function1<AtomAction, Unit> onAction = PassengersLuggageSelectionTariffAdapter.this.getOnAction();
            if (onAction != null) {
                onAction.invoke(action);
            }
        }
    }

    public PassengersLuggageSelectionTariffAdapter() {
        super(new i.d<PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.tariffs.PassengersLuggageSelectionTariffAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO oldItem, PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO oldItem, PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        this.delegatesManager.addDelegate(LuggageTariffAdapterDelegateKt.luggageTariffAdapterDelegate(new AnonymousClass2())).addDelegate(LuggageSkeletonAdapterDelegateKt.luggageSkeletonAdapterDelegate());
    }

    public final Function1<AtomAction, Unit> getOnAction() {
        return this.onAction;
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }
}
