package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.passengers;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0000¨\u0006\t"}, d2 = {"passengersLuggageAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<PassengersLuggageSelectionVO.PassengerVO>> passengersLuggageAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        return new DslViewBindingListAdapterDelegate(PassengersLuggageAdapterDelegateKt$passengersLuggageAdapterDelegate$1.INSTANCE, PassengersLuggageAdapterDelegateKt$passengersLuggageAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new PassengersLuggageAdapterDelegateKt$passengersLuggageAdapterDelegate$2(actionHandler), PassengersLuggageAdapterDelegateKt$passengersLuggageAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
