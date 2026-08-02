package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command;

import Je.InterfaceC3394a;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContentRow;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatDeselectCommand$execute$1", f = "FlightSeatDeselectCommand.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatDeselectCommand$execute$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FlightSeatDeselectCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatDeselectCommand$execute$1(FlightSeatDeselectCommand flightSeatDeselectCommand, d<? super FlightSeatDeselectCommand$execute$1> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatDeselectCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatDeselectCommand$execute$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        FlightSeatDeselectCommand flightSeatDeselectCommand;
        Object a11;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        FlightSeatsSchemeBlockMapper flightSeatsSchemeBlockMapper;
        List list;
        int i11;
        Map<String, AirplaneSeatVO> map5;
        FlightSeatsSchemePassengersBlockMapper flightSeatsSchemePassengersBlockMapper;
        List list2;
        int i12;
        List list3;
        int i13;
        V v11;
        List list4;
        int i14;
        V v12;
        int i15;
        List list5;
        int i16;
        V v13;
        int i17;
        V v14;
        a aVar = a.COROUTINE_SUSPENDED;
        int i18 = this.label;
        if (i18 == 0) {
            s.b(obj);
            interfaceC3394a = this.this$0.mutex;
            FlightSeatDeselectCommand flightSeatDeselectCommand2 = this.this$0;
            this.L$0 = interfaceC3394a;
            this.L$1 = flightSeatDeselectCommand2;
            this.label = 1;
            if (interfaceC3394a.a(this) == aVar) {
                return aVar;
            }
            flightSeatDeselectCommand = flightSeatDeselectCommand2;
        } else {
            if (i18 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flightSeatDeselectCommand = (FlightSeatDeselectCommand) this.L$1;
            interfaceC3394a = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            try {
                r.Companion companion = r.INSTANCE;
                map = flightSeatDeselectCommand.passengerToSeatNumberMap;
                map.remove(new Integer(flightSeatDeselectCommand.getPassengerId()));
                map2 = flightSeatDeselectCommand.seatNumberToPassengerMap;
                map2.remove(flightSeatDeselectCommand.getSeatNumber());
                map3 = flightSeatDeselectCommand.passengerToSeatPositionMap;
                map3.remove(new Integer(flightSeatDeselectCommand.getPassengerId()));
                map4 = flightSeatDeselectCommand.passengerToSeatNumberMap;
                if (map4.isEmpty()) {
                    v14 = flightSeatDeselectCommand.isClearButtonVisible;
                    v14.setValue(Boolean.FALSE);
                }
                flightSeatsSchemeBlockMapper = flightSeatDeselectCommand.seatsSchemeMapper;
                list = flightSeatDeselectCommand.schemeItems;
                i11 = flightSeatDeselectCommand.seatPosition;
                Object obj2 = list.get(i11);
                FlightSchemeContentRow flightSchemeContentRow = obj2 instanceof FlightSchemeContentRow ? (FlightSchemeContentRow) obj2 : null;
                String seatNumber = flightSeatDeselectCommand.getSeatNumber();
                map5 = flightSeatDeselectCommand.seatTypes;
                FlightSchemeContentRow deselect = flightSeatsSchemeBlockMapper.deselect(flightSchemeContentRow, seatNumber, map5);
                if (deselect != null) {
                    list5 = flightSeatDeselectCommand.schemeItems;
                    i16 = flightSeatDeselectCommand.seatPosition;
                    list5.set(i16, deselect);
                    v13 = flightSeatDeselectCommand.seatSelectionLiveData;
                    i17 = flightSeatDeselectCommand.seatPosition;
                    v13.setValue(new FlightSeatsSchemeViewModel.SeatSelection(deselect, i17));
                }
                flightSeatsSchemePassengersBlockMapper = flightSeatDeselectCommand.passengerMapper;
                list2 = flightSeatDeselectCommand.passengerTabs;
                i12 = flightSeatDeselectCommand.passengerPosition;
                FlightSeatsSchemePassengersBlockVO.Passenger removeSeat = flightSeatsSchemePassengersBlockMapper.removeSeat((FlightSeatsSchemePassengersBlockVO.Passenger) list2.get(i12));
                list3 = flightSeatDeselectCommand.passengerTabs;
                i13 = flightSeatDeselectCommand.passengerPosition;
                list3.set(i13, removeSeat);
                v11 = flightSeatDeselectCommand.passengersBlockUpdateVoLiveData;
                list4 = flightSeatDeselectCommand.passengerTabs;
                i14 = flightSeatDeselectCommand.passengerPosition;
                v11.setValue(new FlightSeatsSchemeViewModel.PassengerBlockUpdate(list4, i14));
                v12 = flightSeatDeselectCommand.tabUpdateLiveData;
                i15 = flightSeatDeselectCommand.passengerPosition;
                v12.setValue(new FlightSeatsSchemeViewModel.PassengerTabSeatUpdate(removeSeat, i15));
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
        return ((FlightSeatDeselectCommand$execute$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
