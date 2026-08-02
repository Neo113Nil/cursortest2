package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapToLoadedState", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$LoadedState;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$FetchState;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionPassengersMapperExtKt {
    @NotNull
    public static final PassengersLuggageSelectionVO.State.LoadedState mapToLoadedState(@NotNull PassengersLuggageSelectionVO.State.FetchState fetchState) {
        List<PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO> tariffs;
        Intrinsics.checkNotNullParameter(fetchState, "<this>");
        List<PassengersLuggageSelectionVO.PassengerVO> passengers = fetchState.getPassengers();
        ArrayList arrayList = new ArrayList(C7714v.z(passengers, 10));
        for (PassengersLuggageSelectionVO.PassengerVO passengerVO : passengers) {
            PassengersLuggageSelectionVO.PassengerVO.LuggageVO luggageThere = passengerVO.getLuggageThere();
            if (luggageThere != null && (tariffs = luggageThere.getTariffs()) != null) {
                List<PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO> list = tariffs;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO) it.next()) instanceof PassengersLuggageSelectionVO.PassengerVO.LuggageVO.SkeletonVO) {
                            passengerVO = PassengersLuggageSelectionVO.PassengerVO.copy$default(passengerVO, 0, null, null, null, false, false, false, null, 143, null);
                            break;
                        }
                    }
                }
            }
            arrayList.add(passengerVO);
        }
        return new PassengersLuggageSelectionVO.State.LoadedState(arrayList);
    }
}
