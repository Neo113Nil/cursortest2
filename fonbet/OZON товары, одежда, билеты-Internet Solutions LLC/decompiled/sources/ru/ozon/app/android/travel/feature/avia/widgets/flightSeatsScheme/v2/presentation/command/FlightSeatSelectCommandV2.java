package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command;

import Ae.w0;
import Je.InterfaceC3394a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FlightSeatsSchemeV2FooterMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0019\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00106R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00107R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00107R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00107R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00108R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u001a\u0010:\u001a\u00020 8\u0014X\u0094D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/command/FlightSeatSelectCommandV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/command/FlightSeatCommandV2;", "", "passengerId", "", "seatNumber", "", "passengerToSeatNumberMap", "seatNumberToPassengerMap", "passengerToSeatPositionMap", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "seatsSchemeMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "passengerMapper", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "seatTypes", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "schemeItems", "seatPosition", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "passengerTabs", "passengerPosition", "seatTemplate", "LAe/w0;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SeatSelection;", "seatSelectionFlow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSeatUpdate;", "tabUpdateFlow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerBlockUpdate;", "passengersBlockUpdateVoFlow", "", "isClearButtonVisibleFlow", "LJe/a;", "mutex", "Lxe/M;", "viewModelScope", "<init>", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;Ljava/util/Map;Ljava/util/List;ILjava/util/List;ILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;LAe/w0;LAe/w0;LAe/w0;LAe/w0;LJe/a;Lxe/M;)V", "", "execute", "()V", "undo", "I", "getPassengerId", "()I", "Ljava/lang/String;", "getSeatNumber", "()Ljava/lang/String;", "Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "LAe/w0;", "LJe/a;", "Lxe/M;", "isSelected", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatSelectCommandV2 extends FlightSeatCommandV2 {

    @NotNull
    private final w0<Boolean> isClearButtonVisibleFlow;
    private final boolean isSelected;

    @NotNull
    private final InterfaceC3394a mutex;
    private final int passengerId;

    @NotNull
    private final FlightSeatsSchemeV2FooterMapper passengerMapper;
    private final int passengerPosition;

    @NotNull
    private final List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengerTabs;

    @NotNull
    private final Map<Integer, String> passengerToSeatNumberMap;

    @NotNull
    private final Map<Integer, Integer> passengerToSeatPositionMap;

    @NotNull
    private final w0<FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate> passengersBlockUpdateVoFlow;

    @NotNull
    private final List<FlightSeatsSchemeV2Item> schemeItems;

    @NotNull
    private final String seatNumber;

    @NotNull
    private final Map<String, Integer> seatNumberToPassengerMap;
    private final int seatPosition;

    @NotNull
    private final w0<FlightSeatsSchemeV2ViewModel.SeatSelection> seatSelectionFlow;

    @NotNull
    private final AirplaneSeatTypeV2VI seatTemplate;

    @NotNull
    private final Map<String, AirplaneSeatTypeV2VI> seatTypes;

    @NotNull
    private final FlightSeatsSchemeV2BlockMapper seatsSchemeMapper;

    @NotNull
    private final w0<FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate> tabUpdateFlow;

    @NotNull
    private final M viewModelScope;

    public FlightSeatSelectCommandV2(int i11, @NotNull String seatNumber, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull FlightSeatsSchemeV2BlockMapper seatsSchemeMapper, @NotNull FlightSeatsSchemeV2FooterMapper passengerMapper, @NotNull Map<String, AirplaneSeatTypeV2VI> seatTypes, @NotNull List<FlightSeatsSchemeV2Item> schemeItems, int i12, @NotNull List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengerTabs, int i13, @NotNull AirplaneSeatTypeV2VI seatTemplate, @NotNull w0<FlightSeatsSchemeV2ViewModel.SeatSelection> seatSelectionFlow, @NotNull w0<FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate> tabUpdateFlow, @NotNull w0<FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate> passengersBlockUpdateVoFlow, @NotNull w0<Boolean> isClearButtonVisibleFlow, @NotNull InterfaceC3394a mutex, @NotNull M viewModelScope) {
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
        Intrinsics.checkNotNullParameter(seatSelectionFlow, "seatSelectionFlow");
        Intrinsics.checkNotNullParameter(tabUpdateFlow, "tabUpdateFlow");
        Intrinsics.checkNotNullParameter(passengersBlockUpdateVoFlow, "passengersBlockUpdateVoFlow");
        Intrinsics.checkNotNullParameter(isClearButtonVisibleFlow, "isClearButtonVisibleFlow");
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
        this.seatSelectionFlow = seatSelectionFlow;
        this.tabUpdateFlow = tabUpdateFlow;
        this.passengersBlockUpdateVoFlow = passengersBlockUpdateVoFlow;
        this.isClearButtonVisibleFlow = isClearButtonVisibleFlow;
        this.mutex = mutex;
        this.viewModelScope = viewModelScope;
        this.isSelected = true;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatCommandV2
    public void execute() {
        C10727i.c(this.viewModelScope, null, null, new FlightSeatSelectCommandV2$execute$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatCommandV2
    protected int getPassengerId() {
        return this.passengerId;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatCommandV2
    @NotNull
    protected String getSeatNumber() {
        return this.seatNumber;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatCommandV2
    /* renamed from: isSelected, reason: from getter */
    protected boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatCommandV2
    public void undo() {
        C10727i.c(this.viewModelScope, null, null, new FlightSeatSelectCommandV2$undo$1(this, null), 3);
    }
}
