package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command;

import Je.InterfaceC3394a;
import androidx.lifecycle.V;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0019\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00106R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00107R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00107R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00107R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00108R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u001a\u0010:\u001a\u00020 8\u0014X\u0094D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/command/FlightSeatSelectCommand;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/command/FlightSeatCommand;", "", "passengerId", "", "seatNumber", "", "passengerToSeatNumberMap", "seatNumberToPassengerMap", "passengerToSeatPositionMap", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "seatsSchemeMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "passengerMapper", "", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "seatTypes", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "schemeItems", "seatPosition", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "passengerTabs", "passengerPosition", "seatTemplate", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SeatSelection;", "seatSelectionLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSeatUpdate;", "tabUpdateLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerBlockUpdate;", "passengersBlockUpdateVoLiveData", "", "isClearButtonVisible", "LJe/a;", "mutex", "Lxe/M;", "viewModelScope", "<init>", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;Ljava/util/Map;Ljava/util/List;ILjava/util/List;ILru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;Landroidx/lifecycle/V;Landroidx/lifecycle/V;Landroidx/lifecycle/V;Landroidx/lifecycle/V;LJe/a;Lxe/M;)V", "", "execute", "()V", "undo", "I", "getPassengerId", "()I", "Ljava/lang/String;", "getSeatNumber", "()Ljava/lang/String;", "Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "Landroidx/lifecycle/V;", "LJe/a;", "Lxe/M;", "isSelected", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatSelectCommand extends FlightSeatCommand {

    @NotNull
    private final V<Boolean> isClearButtonVisible;
    private final boolean isSelected;

    @NotNull
    private final InterfaceC3394a mutex;
    private final int passengerId;

    @NotNull
    private final FlightSeatsSchemePassengersBlockMapper passengerMapper;
    private final int passengerPosition;

    @NotNull
    private final List<FlightSeatsSchemePassengersBlockVO.Passenger> passengerTabs;

    @NotNull
    private final Map<Integer, String> passengerToSeatNumberMap;

    @NotNull
    private final Map<Integer, Integer> passengerToSeatPositionMap;

    @NotNull
    private final V<FlightSeatsSchemeViewModel.PassengerBlockUpdate> passengersBlockUpdateVoLiveData;

    @NotNull
    private final List<FlightSeatsSchemeItem> schemeItems;

    @NotNull
    private final String seatNumber;

    @NotNull
    private final Map<String, Integer> seatNumberToPassengerMap;
    private final int seatPosition;

    @NotNull
    private final V<FlightSeatsSchemeViewModel.SeatSelection> seatSelectionLiveData;

    @NotNull
    private final AirplaneSeatVO seatTemplate;

    @NotNull
    private final Map<String, AirplaneSeatVO> seatTypes;

    @NotNull
    private final FlightSeatsSchemeBlockMapper seatsSchemeMapper;

    @NotNull
    private final V<FlightSeatsSchemeViewModel.PassengerTabSeatUpdate> tabUpdateLiveData;

    @NotNull
    private final M viewModelScope;

    public FlightSeatSelectCommand(int i11, @NotNull String seatNumber, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull FlightSeatsSchemeBlockMapper seatsSchemeMapper, @NotNull FlightSeatsSchemePassengersBlockMapper passengerMapper, @NotNull Map<String, AirplaneSeatVO> seatTypes, @NotNull List<FlightSeatsSchemeItem> schemeItems, int i12, @NotNull List<FlightSeatsSchemePassengersBlockVO.Passenger> passengerTabs, int i13, @NotNull AirplaneSeatVO seatTemplate, @NotNull V<FlightSeatsSchemeViewModel.SeatSelection> seatSelectionLiveData, @NotNull V<FlightSeatsSchemeViewModel.PassengerTabSeatUpdate> tabUpdateLiveData, @NotNull V<FlightSeatsSchemeViewModel.PassengerBlockUpdate> passengersBlockUpdateVoLiveData, @NotNull V<Boolean> isClearButtonVisible, @NotNull InterfaceC3394a mutex, @NotNull M viewModelScope) {
        Intrinsics.checkNotNullParameter(seatNumber, "seatNumber");
        Intrinsics.checkNotNullParameter(passengerToSeatNumberMap, "passengerToSeatNumberMap");
        Intrinsics.checkNotNullParameter(seatNumberToPassengerMap, "seatNumberToPassengerMap");
        Intrinsics.checkNotNullParameter(passengerToSeatPositionMap, "passengerToSeatPositionMap");
        Intrinsics.checkNotNullParameter(seatsSchemeMapper, "seatsSchemeMapper");
        Intrinsics.checkNotNullParameter(passengerMapper, "passengerMapper");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        Intrinsics.checkNotNullParameter(schemeItems, "schemeItems");
        Intrinsics.checkNotNullParameter(passengerTabs, "passengerTabs");
        Intrinsics.checkNotNullParameter(seatTemplate, "seatTemplate");
        Intrinsics.checkNotNullParameter(seatSelectionLiveData, "seatSelectionLiveData");
        Intrinsics.checkNotNullParameter(tabUpdateLiveData, "tabUpdateLiveData");
        Intrinsics.checkNotNullParameter(passengersBlockUpdateVoLiveData, "passengersBlockUpdateVoLiveData");
        Intrinsics.checkNotNullParameter(isClearButtonVisible, "isClearButtonVisible");
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.passengerId = i11;
        this.seatNumber = seatNumber;
        this.passengerToSeatNumberMap = passengerToSeatNumberMap;
        this.seatNumberToPassengerMap = seatNumberToPassengerMap;
        this.passengerToSeatPositionMap = passengerToSeatPositionMap;
        this.seatsSchemeMapper = seatsSchemeMapper;
        this.passengerMapper = passengerMapper;
        this.seatTypes = seatTypes;
        this.schemeItems = schemeItems;
        this.seatPosition = i12;
        this.passengerTabs = passengerTabs;
        this.passengerPosition = i13;
        this.seatTemplate = seatTemplate;
        this.seatSelectionLiveData = seatSelectionLiveData;
        this.tabUpdateLiveData = tabUpdateLiveData;
        this.passengersBlockUpdateVoLiveData = passengersBlockUpdateVoLiveData;
        this.isClearButtonVisible = isClearButtonVisible;
        this.mutex = mutex;
        this.viewModelScope = viewModelScope;
        this.isSelected = true;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatCommand
    public void execute() {
        C10727i.c(this.viewModelScope, null, null, new FlightSeatSelectCommand$execute$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatCommand
    protected int getPassengerId() {
        return this.passengerId;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatCommand
    @NotNull
    protected String getSeatNumber() {
        return this.seatNumber;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatCommand
    /* renamed from: isSelected, reason: from getter */
    protected boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatCommand
    public void undo() {
        C10727i.c(this.viewModelScope, null, null, new FlightSeatSelectCommand$undo$1(this, null), 3);
    }
}
