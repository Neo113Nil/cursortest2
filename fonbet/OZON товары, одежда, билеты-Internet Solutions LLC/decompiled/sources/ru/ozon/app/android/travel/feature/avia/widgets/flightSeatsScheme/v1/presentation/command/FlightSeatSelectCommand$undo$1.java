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
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatSelectCommand$undo$1", f = "FlightSeatSelectCommand.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatSelectCommand$undo$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FlightSeatSelectCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatSelectCommand$undo$1(FlightSeatSelectCommand flightSeatSelectCommand, d<? super FlightSeatSelectCommand$undo$1> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatSelectCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatSelectCommand$undo$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        FlightSeatSelectCommand flightSeatSelectCommand;
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
            FlightSeatSelectCommand flightSeatSelectCommand2 = this.this$0;
            this.L$0 = interfaceC3394a;
            this.L$1 = flightSeatSelectCommand2;
            this.label = 1;
            if (interfaceC3394a.a(this) == aVar) {
                return aVar;
            }
            flightSeatSelectCommand = flightSeatSelectCommand2;
        } else {
            if (i18 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flightSeatSelectCommand = (FlightSeatSelectCommand) this.L$1;
            interfaceC3394a = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            try {
                r.Companion companion = r.INSTANCE;
                map = flightSeatSelectCommand.passengerToSeatNumberMap;
                map.remove(new Integer(flightSeatSelectCommand.getPassengerId()));
                map2 = flightSeatSelectCommand.seatNumberToPassengerMap;
                map2.remove(flightSeatSelectCommand.getSeatNumber());
                map3 = flightSeatSelectCommand.passengerToSeatPositionMap;
                map3.remove(new Integer(flightSeatSelectCommand.getPassengerId()));
                map4 = flightSeatSelectCommand.passengerToSeatNumberMap;
                if (map4.isEmpty()) {
                    v14 = flightSeatSelectCommand.isClearButtonVisible;
                    v14.setValue(Boolean.FALSE);
                }
                flightSeatsSchemeBlockMapper = flightSeatSelectCommand.seatsSchemeMapper;
                list = flightSeatSelectCommand.schemeItems;
                i11 = flightSeatSelectCommand.seatPosition;
                Object obj2 = list.get(i11);
                FlightSchemeContentRow flightSchemeContentRow = obj2 instanceof FlightSchemeContentRow ? (FlightSchemeContentRow) obj2 : null;
                String seatNumber = flightSeatSelectCommand.getSeatNumber();
                map5 = flightSeatSelectCommand.seatTypes;
                FlightSchemeContentRow deselect = flightSeatsSchemeBlockMapper.deselect(flightSchemeContentRow, seatNumber, map5);
                if (deselect != null) {
                    list5 = flightSeatSelectCommand.schemeItems;
                    i16 = flightSeatSelectCommand.seatPosition;
                    list5.set(i16, deselect);
                    v13 = flightSeatSelectCommand.seatSelectionLiveData;
                    i17 = flightSeatSelectCommand.seatPosition;
                    v13.setValue(new FlightSeatsSchemeViewModel.SeatSelection(deselect, i17));
                }
                flightSeatsSchemePassengersBlockMapper = flightSeatSelectCommand.passengerMapper;
                list2 = flightSeatSelectCommand.passengerTabs;
                i12 = flightSeatSelectCommand.passengerPosition;
                FlightSeatsSchemePassengersBlockVO.Passenger removeSeat = flightSeatsSchemePassengersBlockMapper.removeSeat((FlightSeatsSchemePassengersBlockVO.Passenger) list2.get(i12));
                list3 = flightSeatSelectCommand.passengerTabs;
                i13 = flightSeatSelectCommand.passengerPosition;
                list3.set(i13, removeSeat);
                v11 = flightSeatSelectCommand.passengersBlockUpdateVoLiveData;
                list4 = flightSeatSelectCommand.passengerTabs;
                i14 = flightSeatSelectCommand.passengerPosition;
                v11.setValue(new FlightSeatsSchemeViewModel.PassengerBlockUpdate(list4, i14));
                v12 = flightSeatSelectCommand.tabUpdateLiveData;
                i15 = flightSeatSelectCommand.passengerPosition;
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
        return ((FlightSeatSelectCommand$undo$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
