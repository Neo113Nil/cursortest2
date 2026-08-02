package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command;

import Ae.w0;
import Je.InterfaceC3394a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FlightSeatsSchemeV2FooterMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatDeselectCommandV2$execute$1", f = "FlightSeatDeselectCommandV2.kt", l = {179, 101, 110, 115, 121}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatDeselectCommandV2$execute$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FlightSeatDeselectCommandV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatDeselectCommandV2$execute$1(FlightSeatDeselectCommandV2 flightSeatDeselectCommandV2, d<? super FlightSeatDeselectCommandV2$execute$1> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatDeselectCommandV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatDeselectCommandV2$execute$1(this.this$0, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:2)|(1:(1:(1:(1:(1:(8:9|10|11|12|(1:14)|15|16|17)(2:20|21))(5:22|23|24|(7:27|11|12|(0)|15|16|17)|26))(6:29|30|31|32|(3:34|24|(0))|26))(7:35|36|37|38|(1:40)(1:48)|41|(3:43|(4:45|31|32|(0))|26)(4:47|32|(0)|26)))(1:55))(3:68|(1:70)|26)|56|57|(1:59)|62|38|(0)(0)|41|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
    
        if (r9.emit(r10, r16) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ae A[Catch: all -> 0x01b4, TryCatch #4 {all -> 0x01b4, blocks: (B:12:0x01a8, B:14:0x01ae, B:15:0x01b6, B:54:0x01a2, B:77:0x01be), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa A[Catch: all -> 0x0063, CancellationException -> 0x0067, TryCatch #6 {CancellationException -> 0x0067, all -> 0x0063, blocks: (B:37:0x005e, B:38:0x00e6, B:40:0x00fa, B:41:0x00fe, B:43:0x010c), top: B:36:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c A[Catch: all -> 0x0063, CancellationException -> 0x0067, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0067, all -> 0x0063, blocks: (B:37:0x005e, B:38:0x00e6, B:40:0x00fa, B:41:0x00fe, B:43:0x010c), top: B:36:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Je.a, int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        InterfaceC3394a interfaceC3394a;
        Throwable b11;
        InterfaceC3394a interfaceC3394a2;
        InterfaceC3394a interfaceC3394a3;
        FlightSeatDeselectCommandV2 flightSeatDeselectCommandV2;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        InterfaceC3394a interfaceC3394a4;
        w0 w0Var;
        FlightSeatsSchemeV2BlockMapper flightSeatsSchemeV2BlockMapper;
        List list;
        int i11;
        Map<String, AirplaneSeatTypeV2VI> map5;
        FlightSchemeContentRowV2 deselect;
        FlightSeatDeselectCommandV2 flightSeatDeselectCommandV22;
        InterfaceC3394a interfaceC3394a5;
        List list2;
        int i12;
        w0 w0Var2;
        int i13;
        InterfaceC3394a interfaceC3394a6;
        FlightSeatsSchemeV2FooterMapper flightSeatsSchemeV2FooterMapper;
        List list3;
        int i14;
        List list4;
        int i15;
        w0 w0Var3;
        FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate passengerBlockUpdate;
        List list5;
        int i16;
        FlightSeatDeselectCommandV2 flightSeatDeselectCommandV23;
        FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI;
        w0 w0Var4;
        FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate passengerTabSeatUpdate;
        int i17;
        a aVar = a.COROUTINE_SUSPENDED;
        ?? r22 = this.label;
        ?? r52 = 3;
        r52 = 3;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    r22.c(null);
                    throw th2;
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th3) {
                th = th3;
                r22 = r52;
            }
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th4) {
            th = th4;
        }
        if (r22 == 0) {
            s.b(obj);
            interfaceC3394a2 = this.this$0.mutex;
            FlightSeatDeselectCommandV2 flightSeatDeselectCommandV24 = this.this$0;
            this.L$0 = interfaceC3394a2;
            this.L$1 = flightSeatDeselectCommandV24;
            this.label = 1;
            if (interfaceC3394a2.a(this) != aVar) {
                interfaceC3394a3 = interfaceC3394a2;
                flightSeatDeselectCommandV2 = flightSeatDeselectCommandV24;
            }
            return aVar;
        }
        if (r22 != 1) {
            if (r22 != 2) {
                if (r22 == 3) {
                    flightSeatDeselectCommandV2 = (FlightSeatDeselectCommandV2) this.L$1;
                    interfaceC3394a6 = (InterfaceC3394a) this.L$0;
                    s.b(obj);
                    InterfaceC3394a interfaceC3394a7 = interfaceC3394a6;
                    flightSeatDeselectCommandV22 = flightSeatDeselectCommandV2;
                    interfaceC3394a5 = interfaceC3394a7;
                    flightSeatsSchemeV2FooterMapper = flightSeatDeselectCommandV22.passengerMapper;
                    list3 = flightSeatDeselectCommandV22.passengerTabs;
                    i14 = flightSeatDeselectCommandV22.passengerPosition;
                    FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI removeSeat = flightSeatsSchemeV2FooterMapper.removeSeat((FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) list3.get(i14));
                    list4 = flightSeatDeselectCommandV22.passengerTabs;
                    i15 = flightSeatDeselectCommandV22.passengerPosition;
                    list4.set(i15, removeSeat);
                    w0Var3 = flightSeatDeselectCommandV22.passengersBlockUpdateVoFlow;
                    list5 = flightSeatDeselectCommandV22.passengerTabs;
                    i16 = flightSeatDeselectCommandV22.passengerPosition;
                    passengerBlockUpdate = new FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate(list5, i16, null, 4, null);
                    this.L$0 = interfaceC3394a5;
                    this.L$1 = flightSeatDeselectCommandV22;
                    this.L$2 = removeSeat;
                    this.label = 4;
                    if (w0Var3.emit(passengerBlockUpdate, this) != aVar) {
                        flightSeatDeselectCommandV23 = flightSeatDeselectCommandV22;
                        r52 = interfaceC3394a5;
                        passengerV2VI = removeSeat;
                        w0Var4 = flightSeatDeselectCommandV23.tabUpdateFlow;
                        i17 = flightSeatDeselectCommandV23.passengerPosition;
                        passengerTabSeatUpdate = new FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate(passengerV2VI, i17);
                        this.L$0 = r52;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (w0Var4.emit(passengerTabSeatUpdate, this) != aVar) {
                        }
                    }
                    return aVar;
                }
                if (r22 != 4) {
                    if (r22 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC3394a interfaceC3394a8 = (InterfaceC3394a) this.L$0;
                    s.b(obj);
                    r22 = interfaceC3394a8;
                    a11 = Unit.f71690a;
                    r.Companion companion = r.INSTANCE;
                    interfaceC3394a = r22;
                    b11 = r.b(a11);
                    if (b11 != null) {
                        Lm0.a.f17149a.e(b11);
                    }
                    Unit unit = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return Unit.f71690a;
                }
                passengerV2VI = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) this.L$2;
                flightSeatDeselectCommandV23 = (FlightSeatDeselectCommandV2) this.L$1;
                InterfaceC3394a interfaceC3394a9 = (InterfaceC3394a) this.L$0;
                s.b(obj);
                r52 = interfaceC3394a9;
                w0Var4 = flightSeatDeselectCommandV23.tabUpdateFlow;
                i17 = flightSeatDeselectCommandV23.passengerPosition;
                passengerTabSeatUpdate = new FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate(passengerV2VI, i17);
                this.L$0 = r52;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                if (w0Var4.emit(passengerTabSeatUpdate, this) != aVar) {
                    r22 = r52;
                    a11 = Unit.f71690a;
                    r.Companion companion2 = r.INSTANCE;
                    interfaceC3394a = r22;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    Unit unit2 = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return Unit.f71690a;
                }
                return aVar;
            }
            flightSeatDeselectCommandV2 = (FlightSeatDeselectCommandV2) this.L$1;
            interfaceC3394a4 = (InterfaceC3394a) this.L$0;
            try {
                s.b(obj);
                flightSeatsSchemeV2BlockMapper = flightSeatDeselectCommandV2.seatsSchemeMapper;
                list = flightSeatDeselectCommandV2.schemeItems;
                i11 = flightSeatDeselectCommandV2.seatPosition;
                Object obj2 = list.get(i11);
                FlightSchemeContentRowV2 flightSchemeContentRowV2 = !(obj2 instanceof FlightSchemeContentRowV2) ? (FlightSchemeContentRowV2) obj2 : null;
                String seatNumber = flightSeatDeselectCommandV2.getSeatNumber();
                map5 = flightSeatDeselectCommandV2.seatTypes;
                deselect = flightSeatsSchemeV2BlockMapper.deselect(flightSchemeContentRowV2, seatNumber, map5);
                if (deselect != null) {
                    flightSeatDeselectCommandV22 = flightSeatDeselectCommandV2;
                    interfaceC3394a5 = interfaceC3394a4;
                    flightSeatsSchemeV2FooterMapper = flightSeatDeselectCommandV22.passengerMapper;
                    list3 = flightSeatDeselectCommandV22.passengerTabs;
                    i14 = flightSeatDeselectCommandV22.passengerPosition;
                    FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI removeSeat2 = flightSeatsSchemeV2FooterMapper.removeSeat((FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) list3.get(i14));
                    list4 = flightSeatDeselectCommandV22.passengerTabs;
                    i15 = flightSeatDeselectCommandV22.passengerPosition;
                    list4.set(i15, removeSeat2);
                    w0Var3 = flightSeatDeselectCommandV22.passengersBlockUpdateVoFlow;
                    list5 = flightSeatDeselectCommandV22.passengerTabs;
                    i16 = flightSeatDeselectCommandV22.passengerPosition;
                    passengerBlockUpdate = new FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate(list5, i16, null, 4, null);
                    this.L$0 = interfaceC3394a5;
                    this.L$1 = flightSeatDeselectCommandV22;
                    this.L$2 = removeSeat2;
                    this.label = 4;
                    if (w0Var3.emit(passengerBlockUpdate, this) != aVar) {
                    }
                    return aVar;
                }
                list2 = flightSeatDeselectCommandV2.schemeItems;
                i12 = flightSeatDeselectCommandV2.seatPosition;
                list2.set(i12, deselect);
                w0Var2 = flightSeatDeselectCommandV2.seatSelectionFlow;
                i13 = flightSeatDeselectCommandV2.seatPosition;
                FlightSeatsSchemeV2ViewModel.SeatSelection seatSelection = new FlightSeatsSchemeV2ViewModel.SeatSelection(deselect, i13);
                this.L$0 = interfaceC3394a4;
                this.L$1 = flightSeatDeselectCommandV2;
                this.label = 3;
                if (w0Var2.emit(seatSelection, this) != aVar) {
                    interfaceC3394a6 = interfaceC3394a4;
                    InterfaceC3394a interfaceC3394a72 = interfaceC3394a6;
                    flightSeatDeselectCommandV22 = flightSeatDeselectCommandV2;
                    interfaceC3394a5 = interfaceC3394a72;
                    flightSeatsSchemeV2FooterMapper = flightSeatDeselectCommandV22.passengerMapper;
                    list3 = flightSeatDeselectCommandV22.passengerTabs;
                    i14 = flightSeatDeselectCommandV22.passengerPosition;
                    FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI removeSeat22 = flightSeatsSchemeV2FooterMapper.removeSeat((FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) list3.get(i14));
                    list4 = flightSeatDeselectCommandV22.passengerTabs;
                    i15 = flightSeatDeselectCommandV22.passengerPosition;
                    list4.set(i15, removeSeat22);
                    w0Var3 = flightSeatDeselectCommandV22.passengersBlockUpdateVoFlow;
                    list5 = flightSeatDeselectCommandV22.passengerTabs;
                    i16 = flightSeatDeselectCommandV22.passengerPosition;
                    passengerBlockUpdate = new FlightSeatsSchemeV2ViewModel.PassengerBlockUpdate(list5, i16, null, 4, null);
                    this.L$0 = interfaceC3394a5;
                    this.L$1 = flightSeatDeselectCommandV22;
                    this.L$2 = removeSeat22;
                    this.label = 4;
                    if (w0Var3.emit(passengerBlockUpdate, this) != aVar) {
                    }
                }
                return aVar;
            } catch (CancellationException e13) {
                throw e13;
            } catch (Throwable th5) {
                th = th5;
                r22 = interfaceC3394a4;
                r.Companion companion3 = r.INSTANCE;
                a11 = s.a(th);
                interfaceC3394a = r22;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                Unit unit22 = Unit.f71690a;
                interfaceC3394a.c(null);
                return Unit.f71690a;
            }
        }
        flightSeatDeselectCommandV2 = (FlightSeatDeselectCommandV2) this.L$1;
        interfaceC3394a3 = (InterfaceC3394a) this.L$0;
        s.b(obj);
        r.Companion companion4 = r.INSTANCE;
        map = flightSeatDeselectCommandV2.passengerToSeatNumberMap;
        map.remove(new Integer(flightSeatDeselectCommandV2.getPassengerId()));
        map2 = flightSeatDeselectCommandV2.seatNumberToPassengerMap;
        map2.remove(flightSeatDeselectCommandV2.getSeatNumber());
        map3 = flightSeatDeselectCommandV2.passengerToSeatPositionMap;
        map3.remove(new Integer(flightSeatDeselectCommandV2.getPassengerId()));
        map4 = flightSeatDeselectCommandV2.passengerToSeatNumberMap;
        if (map4.isEmpty()) {
            w0Var = flightSeatDeselectCommandV2.isClearButtonVisibleFlow;
            Boolean bool = Boolean.FALSE;
            this.L$0 = interfaceC3394a3;
            this.L$1 = flightSeatDeselectCommandV2;
            this.label = 2;
        }
        interfaceC3394a4 = interfaceC3394a3;
        flightSeatsSchemeV2BlockMapper = flightSeatDeselectCommandV2.seatsSchemeMapper;
        list = flightSeatDeselectCommandV2.schemeItems;
        i11 = flightSeatDeselectCommandV2.seatPosition;
        Object obj22 = list.get(i11);
        if (!(obj22 instanceof FlightSchemeContentRowV2)) {
        }
        String seatNumber2 = flightSeatDeselectCommandV2.getSeatNumber();
        map5 = flightSeatDeselectCommandV2.seatTypes;
        deselect = flightSeatsSchemeV2BlockMapper.deselect(flightSchemeContentRowV2, seatNumber2, map5);
        if (deselect != null) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightSeatDeselectCommandV2$execute$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
