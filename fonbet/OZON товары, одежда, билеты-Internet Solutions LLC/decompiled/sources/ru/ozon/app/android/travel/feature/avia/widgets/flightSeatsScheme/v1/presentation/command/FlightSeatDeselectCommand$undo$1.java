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
import ru.ozon.uni.atoms.data.texts.TextAtom;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatDeselectCommand$undo$1", f = "FlightSeatDeselectCommand.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatDeselectCommand$undo$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FlightSeatDeselectCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatDeselectCommand$undo$1(FlightSeatDeselectCommand flightSeatDeselectCommand, d<? super FlightSeatDeselectCommand$undo$1> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatDeselectCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatDeselectCommand$undo$1(this.this$0, dVar);
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
        int i11;
        FlightSeatsSchemeBlockMapper flightSeatsSchemeBlockMapper;
        List list;
        int i12;
        List list2;
        int i13;
        AirplaneSeatVO airplaneSeatVO;
        FlightSeatsSchemePassengersBlockMapper flightSeatsSchemePassengersBlockMapper;
        List list3;
        int i14;
        List list4;
        int i15;
        V v11;
        List list5;
        int i16;
        V v12;
        int i17;
        List list6;
        int i18;
        V v13;
        int i19;
        V v14;
        a aVar = a.COROUTINE_SUSPENDED;
        int i21 = this.label;
        if (i21 == 0) {
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
            if (i21 != 1) {
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
                if (map.isEmpty()) {
                    v14 = flightSeatDeselectCommand.isClearButtonVisible;
                    v14.setValue(Boolean.TRUE);
                }
                map2 = flightSeatDeselectCommand.passengerToSeatNumberMap;
                map2.put(new Integer(flightSeatDeselectCommand.getPassengerId()), flightSeatDeselectCommand.getSeatNumber());
                map3 = flightSeatDeselectCommand.seatNumberToPassengerMap;
                map3.put(flightSeatDeselectCommand.getSeatNumber(), new Integer(flightSeatDeselectCommand.getPassengerId()));
                map4 = flightSeatDeselectCommand.passengerToSeatPositionMap;
                Integer num = new Integer(flightSeatDeselectCommand.getPassengerId());
                i11 = flightSeatDeselectCommand.seatPosition;
                map4.put(num, new Integer(i11));
                flightSeatsSchemeBlockMapper = flightSeatDeselectCommand.seatsSchemeMapper;
                list = flightSeatDeselectCommand.schemeItems;
                i12 = flightSeatDeselectCommand.seatPosition;
                Object obj2 = list.get(i12);
                FlightSchemeContentRow flightSchemeContentRow = obj2 instanceof FlightSchemeContentRow ? (FlightSchemeContentRow) obj2 : null;
                String seatNumber = flightSeatDeselectCommand.getSeatNumber();
                list2 = flightSeatDeselectCommand.passengerTabs;
                i13 = flightSeatDeselectCommand.passengerPosition;
                TextAtom shortName = ((FlightSeatsSchemePassengersBlockVO.Passenger) list2.get(i13)).getShortName();
                airplaneSeatVO = flightSeatDeselectCommand.seatTemplate;
                FlightSchemeContentRow select = flightSeatsSchemeBlockMapper.select(flightSchemeContentRow, seatNumber, shortName, airplaneSeatVO);
                if (select != null) {
                    list6 = flightSeatDeselectCommand.schemeItems;
                    i18 = flightSeatDeselectCommand.seatPosition;
                    list6.set(i18, select);
                    v13 = flightSeatDeselectCommand.seatSelectionLiveData;
                    i19 = flightSeatDeselectCommand.seatPosition;
                    v13.setValue(new FlightSeatsSchemeViewModel.SeatSelection(select, i19));
                }
                flightSeatsSchemePassengersBlockMapper = flightSeatDeselectCommand.passengerMapper;
                list3 = flightSeatDeselectCommand.passengerTabs;
                i14 = flightSeatDeselectCommand.passengerPosition;
                FlightSeatsSchemePassengersBlockVO.Passenger addSeat = flightSeatsSchemePassengersBlockMapper.addSeat((FlightSeatsSchemePassengersBlockVO.Passenger) list3.get(i14), flightSeatDeselectCommand.getSeatNumber());
                list4 = flightSeatDeselectCommand.passengerTabs;
                i15 = flightSeatDeselectCommand.passengerPosition;
                list4.set(i15, addSeat);
                v11 = flightSeatDeselectCommand.passengersBlockUpdateVoLiveData;
                list5 = flightSeatDeselectCommand.passengerTabs;
                i16 = flightSeatDeselectCommand.passengerPosition;
                v11.setValue(new FlightSeatsSchemeViewModel.PassengerBlockUpdate(list5, i16));
                v12 = flightSeatDeselectCommand.tabUpdateLiveData;
                i17 = flightSeatDeselectCommand.passengerPosition;
                v12.setValue(new FlightSeatsSchemeViewModel.PassengerTabSeatUpdate(addSeat, i17));
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
        return ((FlightSeatDeselectCommand$undo$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
