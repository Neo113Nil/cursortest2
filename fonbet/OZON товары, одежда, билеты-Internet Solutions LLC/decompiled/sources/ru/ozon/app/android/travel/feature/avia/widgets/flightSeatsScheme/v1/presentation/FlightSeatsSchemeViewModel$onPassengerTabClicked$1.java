package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation;

import Je.InterfaceC3394a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel$onPassengerTabClicked$1", f = "FlightSeatsSchemeViewModel.kt", l = {362}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeViewModel$onPassengerTabClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ FlightSeatsSchemePassengersBlockVO.Passenger $passenger;
    final /* synthetic */ int $position;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FlightSeatsSchemeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeViewModel$onPassengerTabClicked$1(FlightSeatsSchemeViewModel flightSeatsSchemeViewModel, int i11, FlightSeatsSchemePassengersBlockVO.Passenger passenger, d<? super FlightSeatsSchemeViewModel$onPassengerTabClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatsSchemeViewModel;
        this.$position = i11;
        this.$passenger = passenger;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatsSchemeViewModel$onPassengerTabClicked$1(this.this$0, this.$position, this.$passenger, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        FlightSeatsSchemeViewModel flightSeatsSchemeViewModel;
        FlightSeatsSchemePassengersBlockVO.Passenger passenger;
        int i11;
        Object a11;
        int i12;
        Map map;
        int selectedPassengerId;
        Map map2;
        int selectedPassengerId2;
        SingleLiveEvent singleLiveEvent;
        int i13;
        FlightSeatsSchemePassengersBlockMapper flightSeatsSchemePassengersBlockMapper;
        List list;
        FlightSeatsSchemePassengersBlockMapper flightSeatsSchemePassengersBlockMapper2;
        List list2;
        List list3;
        SingleLiveEvent singleLiveEvent2;
        List list4;
        int i14;
        SingleLiveEvent singleLiveEvent3;
        SingleLiveEvent singleLiveEvent4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = this.label;
        if (i15 == 0) {
            s.b(obj);
            interfaceC3394a = this.this$0.mutex;
            int i16 = this.$position;
            flightSeatsSchemeViewModel = this.this$0;
            passenger = this.$passenger;
            this.L$0 = interfaceC3394a;
            this.L$1 = flightSeatsSchemeViewModel;
            this.L$2 = passenger;
            this.I$0 = i16;
            this.label = 1;
            if (interfaceC3394a.a(this) == aVar) {
                return aVar;
            }
            i11 = i16;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.I$0;
            passenger = (FlightSeatsSchemePassengersBlockVO.Passenger) this.L$2;
            flightSeatsSchemeViewModel = (FlightSeatsSchemeViewModel) this.L$1;
            interfaceC3394a = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            try {
                r.Companion companion = r.INSTANCE;
                i12 = flightSeatsSchemeViewModel.selectedPassengerTabPosition;
                if (i11 != i12) {
                    i13 = flightSeatsSchemeViewModel.selectedPassengerTabPosition;
                    flightSeatsSchemeViewModel.selectedPassengerTabPosition = i11;
                    flightSeatsSchemePassengersBlockMapper = flightSeatsSchemeViewModel.passengersBlockMapper;
                    list = flightSeatsSchemeViewModel.passengerTabs;
                    FlightSeatsSchemePassengersBlockVO.Passenger deselect = flightSeatsSchemePassengersBlockMapper.deselect((FlightSeatsSchemePassengersBlockVO.Passenger) list.get(i13));
                    flightSeatsSchemePassengersBlockMapper2 = flightSeatsSchemeViewModel.passengersBlockMapper;
                    FlightSeatsSchemePassengersBlockVO.Passenger select = flightSeatsSchemePassengersBlockMapper2.select(passenger);
                    list2 = flightSeatsSchemeViewModel.passengerTabs;
                    list2.set(i13, deselect);
                    list3 = flightSeatsSchemeViewModel.passengerTabs;
                    list3.set(i11, select);
                    singleLiveEvent2 = flightSeatsSchemeViewModel.passengersBlockUpdateVoLiveData;
                    list4 = flightSeatsSchemeViewModel.passengerTabs;
                    List U02 = C7714v.U0(list4);
                    i14 = flightSeatsSchemeViewModel.selectedPassengerTabPosition;
                    singleLiveEvent2.setValue(new FlightSeatsSchemeViewModel.PassengerBlockUpdate(U02, i14));
                    singleLiveEvent3 = flightSeatsSchemeViewModel.passengerTabSelectionLiveData;
                    singleLiveEvent3.setValue(new FlightSeatsSchemeViewModel.PassengerTabSelection(deselect, i13, false, 4, null));
                    singleLiveEvent4 = flightSeatsSchemeViewModel.passengerTabSelectionLiveData;
                    singleLiveEvent4.setValue(new FlightSeatsSchemeViewModel.PassengerTabSelection(select, i11, true));
                }
                map = flightSeatsSchemeViewModel.passengerToSeatPositionMap;
                selectedPassengerId = flightSeatsSchemeViewModel.getSelectedPassengerId();
                Integer num = (Integer) map.get(new Integer(selectedPassengerId));
                if (num != null) {
                    map2 = flightSeatsSchemeViewModel.passengerToSeatNumberMap;
                    selectedPassengerId2 = flightSeatsSchemeViewModel.getSelectedPassengerId();
                    String str = (String) map2.get(new Integer(selectedPassengerId2));
                    singleLiveEvent = flightSeatsSchemeViewModel.scrollToSchemeRowLiveData;
                    singleLiveEvent.setValue(new FlightSeatsSchemeViewModel.ScrollToSeat(num.intValue(), str));
                }
                a11 = Unit.f71690a;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            Throwable b11 = r.b(a11);
            if (b11 != null) {
                Lm0.a.f17149a.e(b11);
            }
            Unit unit = Unit.f71690a;
            interfaceC3394a.c(null);
            return Unit.f71690a;
        } catch (Throwable th3) {
            interfaceC3394a.c(null);
            throw th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightSeatsSchemeViewModel$onPassengerTabClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
