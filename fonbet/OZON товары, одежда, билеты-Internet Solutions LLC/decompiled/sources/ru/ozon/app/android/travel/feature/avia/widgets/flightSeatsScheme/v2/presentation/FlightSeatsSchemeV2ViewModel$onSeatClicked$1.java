package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import Ae.w0;
import Je.InterfaceC3394a;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FlightSeatsSchemeV2FooterMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatCommandV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatDeselectCommandV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.command.FlightSeatSelectCommandV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$onSeatClicked$1", f = "FlightSeatsSchemeV2ViewModel.kt", l = {175, 485, 188, 191}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ViewModel$onSeatClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $position;
    final /* synthetic */ AirplaneSeatTypeV2VI $safeTemplate;
    final /* synthetic */ String $seatNumber;
    final /* synthetic */ AtomActionDTO $selectAction;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ FlightSeatsSchemeV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2ViewModel$onSeatClicked$1(FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel, String str, int i11, AirplaneSeatTypeV2VI airplaneSeatTypeV2VI, AtomActionDTO atomActionDTO, d<? super FlightSeatsSchemeV2ViewModel$onSeatClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatsSchemeV2ViewModel;
        this.$seatNumber = str;
        this.$position = i11;
        this.$safeTemplate = airplaneSeatTypeV2VI;
        this.$selectAction = atomActionDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatsSchemeV2ViewModel$onSeatClicked$1(this.this$0, this.$seatNumber, this.$position, this.$safeTemplate, this.$selectAction, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0076, code lost:
    
        if (r3.emit(r4, r39) == r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013c, code lost:
    
        if (r0.emit(r5, r39) == r2) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02db A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:12:0x02e4, B:28:0x02d5, B:30:0x02db), top: B:27:0x02d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146 A[Catch: all -> 0x00fa, CancellationException -> 0x00fe, TryCatch #5 {CancellationException -> 0x00fe, all -> 0x00fa, blocks: (B:37:0x00a9, B:40:0x00bb, B:46:0x00cf, B:48:0x00d5, B:49:0x00dd, B:51:0x00e4, B:55:0x00f8, B:56:0x00f1, B:61:0x0105, B:69:0x0126, B:71:0x013f, B:73:0x0146, B:74:0x025a, B:75:0x025e, B:77:0x0264, B:79:0x026e, B:81:0x0274, B:82:0x0278, B:83:0x0281, B:85:0x0287, B:87:0x0296, B:90:0x02a1, B:91:0x02b0, B:93:0x02b6, B:95:0x02c8, B:98:0x0194, B:101:0x01be, B:102:0x0212, B:103:0x00c2), top: B:36:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264 A[Catch: all -> 0x00fa, CancellationException -> 0x00fe, LOOP:1: B:75:0x025e->B:77:0x0264, LOOP_END, TryCatch #5 {CancellationException -> 0x00fe, all -> 0x00fa, blocks: (B:37:0x00a9, B:40:0x00bb, B:46:0x00cf, B:48:0x00d5, B:49:0x00dd, B:51:0x00e4, B:55:0x00f8, B:56:0x00f1, B:61:0x0105, B:69:0x0126, B:71:0x013f, B:73:0x0146, B:74:0x025a, B:75:0x025e, B:77:0x0264, B:79:0x026e, B:81:0x0274, B:82:0x0278, B:83:0x0281, B:85:0x0287, B:87:0x0296, B:90:0x02a1, B:91:0x02b0, B:93:0x02b6, B:95:0x02c8, B:98:0x0194, B:101:0x01be, B:102:0x0212, B:103:0x00c2), top: B:36:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274 A[Catch: all -> 0x00fa, CancellationException -> 0x00fe, TryCatch #5 {CancellationException -> 0x00fe, all -> 0x00fa, blocks: (B:37:0x00a9, B:40:0x00bb, B:46:0x00cf, B:48:0x00d5, B:49:0x00dd, B:51:0x00e4, B:55:0x00f8, B:56:0x00f1, B:61:0x0105, B:69:0x0126, B:71:0x013f, B:73:0x0146, B:74:0x025a, B:75:0x025e, B:77:0x0264, B:79:0x026e, B:81:0x0274, B:82:0x0278, B:83:0x0281, B:85:0x0287, B:87:0x0296, B:90:0x02a1, B:91:0x02b0, B:93:0x02b6, B:95:0x02c8, B:98:0x0194, B:101:0x01be, B:102:0x0212, B:103:0x00c2), top: B:36:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0287 A[Catch: all -> 0x00fa, CancellationException -> 0x00fe, LOOP:2: B:83:0x0281->B:85:0x0287, LOOP_END, TryCatch #5 {CancellationException -> 0x00fe, all -> 0x00fa, blocks: (B:37:0x00a9, B:40:0x00bb, B:46:0x00cf, B:48:0x00d5, B:49:0x00dd, B:51:0x00e4, B:55:0x00f8, B:56:0x00f1, B:61:0x0105, B:69:0x0126, B:71:0x013f, B:73:0x0146, B:74:0x025a, B:75:0x025e, B:77:0x0264, B:79:0x026e, B:81:0x0274, B:82:0x0278, B:83:0x0281, B:85:0x0287, B:87:0x0296, B:90:0x02a1, B:91:0x02b0, B:93:0x02b6, B:95:0x02c8, B:98:0x0194, B:101:0x01be, B:102:0x0212, B:103:0x00c2), top: B:36:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b6 A[Catch: all -> 0x00fa, CancellationException -> 0x00fe, LOOP:3: B:91:0x02b0->B:93:0x02b6, LOOP_END, TryCatch #5 {CancellationException -> 0x00fe, all -> 0x00fa, blocks: (B:37:0x00a9, B:40:0x00bb, B:46:0x00cf, B:48:0x00d5, B:49:0x00dd, B:51:0x00e4, B:55:0x00f8, B:56:0x00f1, B:61:0x0105, B:69:0x0126, B:71:0x013f, B:73:0x0146, B:74:0x025a, B:75:0x025e, B:77:0x0264, B:79:0x026e, B:81:0x0274, B:82:0x0278, B:83:0x0281, B:85:0x0287, B:87:0x0296, B:90:0x02a1, B:91:0x02b0, B:93:0x02b6, B:95:0x02c8, B:98:0x0194, B:101:0x01be, B:102:0x0212, B:103:0x00c2), top: B:36:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0191  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Wc.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        InterfaceC3394a interfaceC3394a;
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel;
        String str;
        int i11;
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI;
        AtomActionDTO atomActionDTO;
        w0 w0Var;
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel2;
        String str2;
        InterfaceC3394a interfaceC3394a2;
        Map map;
        Integer num;
        int i12;
        boolean z12;
        int selectedPassengerId;
        boolean z13;
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel3;
        Map map2;
        int selectedPassengerId2;
        Map map3;
        int selectedPassengerId3;
        int selectedPassengerId4;
        Map map4;
        Map map5;
        Map map6;
        FlightSeatsSchemeV2BlockMapper flightSeatsSchemeV2BlockMapper;
        FlightSeatsSchemeV2FooterMapper flightSeatsSchemeV2FooterMapper;
        Map map7;
        List list;
        List list2;
        int i13;
        w0 w0Var2;
        w0 w0Var3;
        w0 w0Var4;
        w0 w0Var5;
        InterfaceC3394a interfaceC3394a3;
        int selectedPassengerId5;
        Map map8;
        Map map9;
        Map map10;
        FlightSeatsSchemeV2BlockMapper flightSeatsSchemeV2BlockMapper2;
        FlightSeatsSchemeV2FooterMapper flightSeatsSchemeV2FooterMapper2;
        Map map11;
        List list3;
        List list4;
        int i14;
        w0 w0Var6;
        w0 w0Var7;
        w0 w0Var8;
        w0 w0Var9;
        InterfaceC3394a interfaceC3394a4;
        Iterator it;
        Map<String, String> params;
        Iterator it2;
        String link;
        Iterator it3;
        Object obj2;
        int selectedPassengerId6;
        Map map12;
        Map map13;
        Map map14;
        FlightSeatsSchemeV2BlockMapper flightSeatsSchemeV2BlockMapper3;
        FlightSeatsSchemeV2FooterMapper flightSeatsSchemeV2FooterMapper3;
        Map map15;
        List list5;
        List list6;
        int i15;
        w0 w0Var10;
        w0 w0Var11;
        w0 w0Var12;
        w0 w0Var13;
        InterfaceC3394a interfaceC3394a5;
        boolean z14;
        w0 w0Var14;
        List list7;
        List list8;
        Object selectPassengerInternal;
        Throwable b11;
        ?? r22 = a.COROUTINE_SUSPENDED;
        int i16 = this.label;
        try {
            if (i16 == 0) {
                s.b(obj);
                z11 = this.this$0.isPassengersEmpty;
                if (z11) {
                    this.this$0.sendNonFatalLog();
                    w0Var = this.this$0._networkErrorFlow;
                    Unit unit = Unit.f71690a;
                    this.label = 1;
                } else {
                    interfaceC3394a = this.this$0.mutex;
                    flightSeatsSchemeV2ViewModel = this.this$0;
                    str = this.$seatNumber;
                    int i17 = this.$position;
                    AirplaneSeatTypeV2VI airplaneSeatTypeV2VI2 = this.$safeTemplate;
                    AtomActionDTO atomActionDTO2 = this.$selectAction;
                    this.L$0 = interfaceC3394a;
                    this.L$1 = flightSeatsSchemeV2ViewModel;
                    this.L$2 = str;
                    this.L$3 = airplaneSeatTypeV2VI2;
                    this.L$4 = atomActionDTO2;
                    this.I$0 = i17;
                    this.label = 2;
                    if (interfaceC3394a.a(this) != r22) {
                        i11 = i17;
                        airplaneSeatTypeV2VI = airplaneSeatTypeV2VI2;
                        atomActionDTO = atomActionDTO2;
                        flightSeatsSchemeV2ViewModel2 = flightSeatsSchemeV2ViewModel;
                        str2 = str;
                        r.Companion companion = r.INSTANCE;
                        map = flightSeatsSchemeV2ViewModel2.seatNumberToPassengerMap;
                        num = (Integer) map.get(str2);
                        i12 = 0;
                        if (num != null) {
                        }
                        selectedPassengerId = flightSeatsSchemeV2ViewModel2.getSelectedPassengerId();
                        if (num != null) {
                            z13 = true;
                            if (z12) {
                            }
                            LinkedList linkedList = new LinkedList();
                            if (z13) {
                            }
                            it = linkedList.iterator();
                            while (it.hasNext()) {
                            }
                            params = atomActionDTO.getParams();
                            if (params == null) {
                            }
                            LinkedList linkedList2 = new LinkedList();
                            it2 = linkedList.iterator();
                            while (it2.hasNext()) {
                            }
                            flightSeatsSchemeV2ViewModel3.isProcessingClickSeats = true;
                            link = atomActionDTO.getLink();
                            if (link == null) {
                            }
                            ArrayList arrayList = new ArrayList(C7714v.z(linkedList, 10));
                            it3 = linkedList.iterator();
                            while (it3.hasNext()) {
                            }
                            flightSeatsSchemeV2ViewModel3.syncSelectionWithServer(link, arrayList, linkedList2);
                            obj2 = Unit.f71690a;
                            b11 = r.b(obj2);
                            if (b11 != null) {
                            }
                            Unit unit2 = Unit.f71690a;
                            interfaceC3394a.c(null);
                            return Unit.f71690a;
                        }
                        z13 = false;
                        if (z12) {
                        }
                        LinkedList linkedList3 = new LinkedList();
                        if (z13) {
                        }
                        it = linkedList3.iterator();
                        while (it.hasNext()) {
                        }
                        params = atomActionDTO.getParams();
                        if (params == null) {
                        }
                        LinkedList linkedList22 = new LinkedList();
                        it2 = linkedList3.iterator();
                        while (it2.hasNext()) {
                        }
                        flightSeatsSchemeV2ViewModel3.isProcessingClickSeats = true;
                        link = atomActionDTO.getLink();
                        if (link == null) {
                        }
                        ArrayList arrayList2 = new ArrayList(C7714v.z(linkedList3, 10));
                        it3 = linkedList3.iterator();
                        while (it3.hasNext()) {
                        }
                        flightSeatsSchemeV2ViewModel3.syncSelectionWithServer(link, arrayList2, linkedList22);
                        obj2 = Unit.f71690a;
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        Unit unit22 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    }
                }
                return r22;
            }
            if (i16 == 1) {
                s.b(obj);
                return Unit.f71690a;
            }
            if (i16 != 2) {
                if (i16 == 3) {
                    interfaceC3394a2 = (InterfaceC3394a) this.L$0;
                } else {
                    if (i16 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3394a2 = (InterfaceC3394a) this.L$0;
                }
                try {
                    s.b(obj);
                    interfaceC3394a = interfaceC3394a2;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    th = th2;
                    r.Companion companion2 = r.INSTANCE;
                    obj2 = s.a(th);
                    interfaceC3394a = interfaceC3394a2;
                    try {
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        Unit unit222 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    } catch (Throwable th3) {
                        th = th3;
                        r22 = interfaceC3394a;
                        r22.c(null);
                        throw th;
                    }
                }
                Unit unit2222 = Unit.f71690a;
                interfaceC3394a.c(null);
                return Unit.f71690a;
            }
            int i18 = this.I$0;
            atomActionDTO = (AtomActionDTO) this.L$4;
            AirplaneSeatTypeV2VI airplaneSeatTypeV2VI3 = (AirplaneSeatTypeV2VI) this.L$3;
            str = (String) this.L$2;
            flightSeatsSchemeV2ViewModel = (FlightSeatsSchemeV2ViewModel) this.L$1;
            InterfaceC3394a interfaceC3394a6 = (InterfaceC3394a) this.L$0;
            s.b(obj);
            i11 = i18;
            airplaneSeatTypeV2VI = airplaneSeatTypeV2VI3;
            interfaceC3394a = interfaceC3394a6;
            flightSeatsSchemeV2ViewModel2 = flightSeatsSchemeV2ViewModel;
            str2 = str;
            try {
                r.Companion companion3 = r.INSTANCE;
                map = flightSeatsSchemeV2ViewModel2.seatNumberToPassengerMap;
                num = (Integer) map.get(str2);
                i12 = 0;
                z12 = num != null;
                selectedPassengerId = flightSeatsSchemeV2ViewModel2.getSelectedPassengerId();
            } catch (CancellationException e12) {
                throw e12;
            } catch (Throwable th4) {
                th = th4;
                interfaceC3394a2 = interfaceC3394a;
                r.Companion companion22 = r.INSTANCE;
                obj2 = s.a(th);
                interfaceC3394a = interfaceC3394a2;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                Unit unit22222 = Unit.f71690a;
                interfaceC3394a.c(null);
                return Unit.f71690a;
            }
            if (num != null && num.intValue() == selectedPassengerId) {
                z13 = true;
                if (z12 && !z13) {
                    z14 = flightSeatsSchemeV2ViewModel2.switchPassengerOnReservedSeatClick;
                    if (z14) {
                        list7 = flightSeatsSchemeV2ViewModel2.passengerTabs;
                        Iterator it4 = list7.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                i12 = -1;
                                break;
                            }
                            int id2 = ((FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) it4.next()).getId();
                            if (num != null && id2 == num.intValue()) {
                                break;
                            }
                            i12++;
                        }
                        if (i12 != -1) {
                            list8 = flightSeatsSchemeV2ViewModel2.passengerTabs;
                            FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) list8.get(i12);
                            this.L$0 = interfaceC3394a;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 3;
                            selectPassengerInternal = flightSeatsSchemeV2ViewModel2.selectPassengerInternal(i12, passengerV2VI, this);
                            if (selectPassengerInternal == r22) {
                                return r22;
                            }
                            interfaceC3394a2 = interfaceC3394a;
                        }
                        Unit unit222222 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    }
                    w0Var14 = flightSeatsSchemeV2ViewModel2._seatSelectionErrorFlow;
                    Unit unit3 = Unit.f71690a;
                    this.L$0 = interfaceC3394a;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    interfaceC3394a = interfaceC3394a2;
                    Unit unit2222222 = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return Unit.f71690a;
                }
                LinkedList linkedList32 = new LinkedList();
                if (z13) {
                    flightSeatsSchemeV2ViewModel3 = flightSeatsSchemeV2ViewModel2;
                    if (z12) {
                        map2 = flightSeatsSchemeV2ViewModel3.passengerToSeatNumberMap;
                        selectedPassengerId2 = flightSeatsSchemeV2ViewModel3.getSelectedPassengerId();
                        String str3 = (String) map2.get(new Integer(selectedPassengerId2));
                        map3 = flightSeatsSchemeV2ViewModel3.passengerToSeatPositionMap;
                        selectedPassengerId3 = flightSeatsSchemeV2ViewModel3.getSelectedPassengerId();
                        Integer num2 = (Integer) map3.get(new Integer(selectedPassengerId3));
                        if (str3 != null && num2 != null) {
                            selectedPassengerId5 = flightSeatsSchemeV2ViewModel3.getSelectedPassengerId();
                            map8 = flightSeatsSchemeV2ViewModel3.passengerToSeatNumberMap;
                            map9 = flightSeatsSchemeV2ViewModel3.seatNumberToPassengerMap;
                            map10 = flightSeatsSchemeV2ViewModel3.passengerToSeatPositionMap;
                            flightSeatsSchemeV2BlockMapper2 = flightSeatsSchemeV2ViewModel3.schemeBlockMapper;
                            flightSeatsSchemeV2FooterMapper2 = flightSeatsSchemeV2ViewModel3.footerMapper;
                            map11 = flightSeatsSchemeV2ViewModel3.seatTypes;
                            list3 = flightSeatsSchemeV2ViewModel3.schemeItems;
                            int intValue = num2.intValue();
                            list4 = flightSeatsSchemeV2ViewModel3.passengerTabs;
                            i14 = flightSeatsSchemeV2ViewModel3.selectedPassengerTabPosition;
                            w0Var6 = flightSeatsSchemeV2ViewModel3._seatSelectionFlow;
                            w0Var7 = flightSeatsSchemeV2ViewModel3._passengerTabSeatUpdateFlow;
                            w0Var8 = flightSeatsSchemeV2ViewModel3._passengersBlockUpdateVoFlow;
                            w0Var9 = flightSeatsSchemeV2ViewModel3._isClearButtonVisibleFlow;
                            interfaceC3394a4 = flightSeatsSchemeV2ViewModel3.mutex;
                            AirplaneSeatTypeV2VI airplaneSeatTypeV2VI4 = airplaneSeatTypeV2VI;
                            airplaneSeatTypeV2VI = airplaneSeatTypeV2VI4;
                            linkedList32.add(new FlightSeatDeselectCommandV2(selectedPassengerId5, str3, map8, map9, map10, flightSeatsSchemeV2BlockMapper2, flightSeatsSchemeV2FooterMapper2, map11, list3, intValue, list4, i14, airplaneSeatTypeV2VI4, w0Var6, w0Var7, w0Var8, w0Var9, interfaceC3394a4, x0.a(flightSeatsSchemeV2ViewModel3)));
                        }
                        selectedPassengerId4 = flightSeatsSchemeV2ViewModel3.getSelectedPassengerId();
                        map4 = flightSeatsSchemeV2ViewModel3.passengerToSeatNumberMap;
                        map5 = flightSeatsSchemeV2ViewModel3.seatNumberToPassengerMap;
                        map6 = flightSeatsSchemeV2ViewModel3.passengerToSeatPositionMap;
                        flightSeatsSchemeV2BlockMapper = flightSeatsSchemeV2ViewModel3.schemeBlockMapper;
                        flightSeatsSchemeV2FooterMapper = flightSeatsSchemeV2ViewModel3.footerMapper;
                        map7 = flightSeatsSchemeV2ViewModel3.seatTypes;
                        list = flightSeatsSchemeV2ViewModel3.schemeItems;
                        list2 = flightSeatsSchemeV2ViewModel3.passengerTabs;
                        i13 = flightSeatsSchemeV2ViewModel3.selectedPassengerTabPosition;
                        w0Var2 = flightSeatsSchemeV2ViewModel3._seatSelectionFlow;
                        w0Var3 = flightSeatsSchemeV2ViewModel3._passengerTabSeatUpdateFlow;
                        w0Var4 = flightSeatsSchemeV2ViewModel3._passengersBlockUpdateVoFlow;
                        w0Var5 = flightSeatsSchemeV2ViewModel3._isClearButtonVisibleFlow;
                        interfaceC3394a3 = flightSeatsSchemeV2ViewModel3.mutex;
                        linkedList32.add(new FlightSeatSelectCommandV2(selectedPassengerId4, str2, map4, map5, map6, flightSeatsSchemeV2BlockMapper, flightSeatsSchemeV2FooterMapper, map7, list, i11, list2, i13, airplaneSeatTypeV2VI, w0Var2, w0Var3, w0Var4, w0Var5, interfaceC3394a3, x0.a(flightSeatsSchemeV2ViewModel3)));
                    }
                } else {
                    flightSeatsSchemeV2ViewModel3 = flightSeatsSchemeV2ViewModel2;
                    selectedPassengerId6 = flightSeatsSchemeV2ViewModel3.getSelectedPassengerId();
                    map12 = flightSeatsSchemeV2ViewModel3.passengerToSeatNumberMap;
                    map13 = flightSeatsSchemeV2ViewModel3.seatNumberToPassengerMap;
                    map14 = flightSeatsSchemeV2ViewModel3.passengerToSeatPositionMap;
                    flightSeatsSchemeV2BlockMapper3 = flightSeatsSchemeV2ViewModel3.schemeBlockMapper;
                    flightSeatsSchemeV2FooterMapper3 = flightSeatsSchemeV2ViewModel3.footerMapper;
                    map15 = flightSeatsSchemeV2ViewModel3.seatTypes;
                    list5 = flightSeatsSchemeV2ViewModel3.schemeItems;
                    list6 = flightSeatsSchemeV2ViewModel3.passengerTabs;
                    i15 = flightSeatsSchemeV2ViewModel3.selectedPassengerTabPosition;
                    w0Var10 = flightSeatsSchemeV2ViewModel3._seatSelectionFlow;
                    w0Var11 = flightSeatsSchemeV2ViewModel3._passengerTabSeatUpdateFlow;
                    w0Var12 = flightSeatsSchemeV2ViewModel3._passengersBlockUpdateVoFlow;
                    w0Var13 = flightSeatsSchemeV2ViewModel3._isClearButtonVisibleFlow;
                    interfaceC3394a5 = flightSeatsSchemeV2ViewModel3.mutex;
                    linkedList32.add(new FlightSeatDeselectCommandV2(selectedPassengerId6, str2, map12, map13, map14, flightSeatsSchemeV2BlockMapper3, flightSeatsSchemeV2FooterMapper3, map15, list5, i11, list6, i15, airplaneSeatTypeV2VI, w0Var10, w0Var11, w0Var12, w0Var13, interfaceC3394a5, x0.a(flightSeatsSchemeV2ViewModel3)));
                }
                it = linkedList32.iterator();
                while (it.hasNext()) {
                    ((FlightSeatCommandV2) it.next()).execute();
                }
                params = atomActionDTO.getParams();
                if (params == null) {
                    params = U.c();
                }
                LinkedList linkedList222 = new LinkedList();
                it2 = linkedList32.iterator();
                while (it2.hasNext()) {
                    linkedList222.add(new FlightSeatsSchemeV2ViewModel$onSeatClicked$1$1$1$undoOperations$1$1((FlightSeatCommandV2) it2.next()));
                }
                flightSeatsSchemeV2ViewModel3.isProcessingClickSeats = true;
                link = atomActionDTO.getLink();
                if (link == null) {
                    link = "";
                }
                ArrayList arrayList22 = new ArrayList(C7714v.z(linkedList32, 10));
                it3 = linkedList32.iterator();
                while (it3.hasNext()) {
                    arrayList22.add(U.m(params, ((FlightSeatCommandV2) it3.next()).params()));
                }
                flightSeatsSchemeV2ViewModel3.syncSelectionWithServer(link, arrayList22, linkedList222);
                obj2 = Unit.f71690a;
                b11 = r.b(obj2);
                if (b11 != null) {
                    Lm0.a.f17149a.e(b11);
                }
                Unit unit22222222 = Unit.f71690a;
                interfaceC3394a.c(null);
                return Unit.f71690a;
            }
            z13 = false;
            if (z12) {
            }
            LinkedList linkedList322 = new LinkedList();
            if (z13) {
            }
            it = linkedList322.iterator();
            while (it.hasNext()) {
            }
            params = atomActionDTO.getParams();
            if (params == null) {
            }
            LinkedList linkedList2222 = new LinkedList();
            it2 = linkedList322.iterator();
            while (it2.hasNext()) {
            }
            flightSeatsSchemeV2ViewModel3.isProcessingClickSeats = true;
            link = atomActionDTO.getLink();
            if (link == null) {
            }
            ArrayList arrayList222 = new ArrayList(C7714v.z(linkedList322, 10));
            it3 = linkedList322.iterator();
            while (it3.hasNext()) {
            }
            flightSeatsSchemeV2ViewModel3.syncSelectionWithServer(link, arrayList222, linkedList2222);
            obj2 = Unit.f71690a;
            b11 = r.b(obj2);
            if (b11 != null) {
            }
            Unit unit222222222 = Unit.f71690a;
            interfaceC3394a.c(null);
            return Unit.f71690a;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightSeatsSchemeV2ViewModel$onSeatClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
