package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation;

import He.b;
import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalDTO;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalMapperKt;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.SelectionActionResponse;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel$syncSelectionWithServer$1", f = "FlightSeatsSchemeViewModel.kt", l = {264}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeViewModel$syncSelectionWithServer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ List<Map<String, String>> $paramList;
    final /* synthetic */ Deque<Function0<Unit>> $undoOperations;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FlightSeatsSchemeViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel$syncSelectionWithServer$1$1", f = "FlightSeatsSchemeViewModel.kt", l = {357, 365}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel$syncSelectionWithServer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $link;
        final /* synthetic */ kotlin.jvm.internal.M<FlightSeatsSchemeViewModel.OrderDetailsInfo> $orderDetailsInfo;
        final /* synthetic */ kotlin.jvm.internal.M<OrderTotalVO> $orderTotal;
        final /* synthetic */ Map<String, String> $params;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ FlightSeatsSchemeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FlightSeatsSchemeViewModel flightSeatsSchemeViewModel, Map<String, String> map, String str, kotlin.jvm.internal.M<FlightSeatsSchemeViewModel.OrderDetailsInfo> m11, kotlin.jvm.internal.M<OrderTotalVO> m12, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = flightSeatsSchemeViewModel;
            this.$params = map;
            this.$link = str;
            this.$orderDetailsInfo = m11;
            this.$orderTotal = m12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$params, this.$link, this.$orderDetailsInfo, this.$orderTotal, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0045, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel$OrderDetailsInfo] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ActionV2Repository actionV2Repository;
            FlightSeatsSchemeOrderDetailsMapper flightSeatsSchemeOrderDetailsMapper;
            InterfaceC3394a interfaceC3394a;
            FlightSeatsSchemeViewModel flightSeatsSchemeViewModel;
            FlightSeatsSchemeOrderDetailsVO flightSeatsSchemeOrderDetailsVO;
            OrderTotalDTO orderTotalBlock;
            List list;
            List list2;
            List list3;
            List list4;
            Map map;
            int selectedPassengerId;
            Map map2;
            Map map3;
            Map map4;
            List list5;
            List list6;
            SingleLiveEvent singleLiveEvent;
            List list7;
            List list8;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                actionV2Repository = this.this$0.api;
                ActionV2Request actionV2Request = new ActionV2Request(this.$params, this.$link, true);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, SelectionActionResponse.class, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC3394a interfaceC3394a2 = (InterfaceC3394a) this.L$2;
                    flightSeatsSchemeOrderDetailsVO = (FlightSeatsSchemeOrderDetailsVO) this.L$1;
                    flightSeatsSchemeViewModel = (FlightSeatsSchemeViewModel) this.L$0;
                    s.b(obj);
                    interfaceC3394a = interfaceC3394a2;
                    try {
                        list = flightSeatsSchemeViewModel.schemeItems;
                        boolean z11 = C7714v.Z(list) instanceof FlightSeatsSchemeOrderDetailsVO;
                        list2 = flightSeatsSchemeViewModel.schemeItems;
                        int P11 = C7714v.P(list2);
                        if (flightSeatsSchemeOrderDetailsVO != null && z11) {
                            list7 = flightSeatsSchemeViewModel.schemeItems;
                            list8 = flightSeatsSchemeViewModel.schemeItems;
                            list7.remove(C7714v.P(list8));
                        } else if (flightSeatsSchemeOrderDetailsVO == null && z11) {
                            list4 = flightSeatsSchemeViewModel.schemeItems;
                            list4.set(P11, flightSeatsSchemeOrderDetailsVO);
                        } else if (flightSeatsSchemeOrderDetailsVO != null && !z11) {
                            list3 = flightSeatsSchemeViewModel.schemeItems;
                            list3.add(flightSeatsSchemeOrderDetailsVO);
                        }
                        map = flightSeatsSchemeViewModel.passengerToSeatPositionMap;
                        selectedPassengerId = flightSeatsSchemeViewModel.getSelectedPassengerId();
                        Integer num = (Integer) map.get(new Integer(selectedPassengerId));
                        map2 = flightSeatsSchemeViewModel.seatNumberToPassengerMap;
                        map3 = flightSeatsSchemeViewModel.passengerToSeatNumberMap;
                        map4 = flightSeatsSchemeViewModel.passengerToSeatPositionMap;
                        list5 = flightSeatsSchemeViewModel.schemeItems;
                        list6 = flightSeatsSchemeViewModel.passengerTabs;
                        FlightSeatsSchemeViewModel.SchemeUpdate schemeUpdate = new FlightSeatsSchemeViewModel.SchemeUpdate(num, map2, map3, map4, list5, C7714v.U0(list6));
                        interfaceC3394a.c(null);
                        singleLiveEvent = flightSeatsSchemeViewModel.schemeUpdateVoLiveData;
                        singleLiveEvent.postValue(schemeUpdate);
                        return Unit.f71690a;
                    } catch (Throwable th2) {
                        interfaceC3394a.c(null);
                        throw th2;
                    }
                }
                s.b(obj);
            }
            ActionV2Response ensureSuccessful = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
            FlightSeatsSchemeViewModel flightSeatsSchemeViewModel2 = this.this$0;
            kotlin.jvm.internal.M<FlightSeatsSchemeViewModel.OrderDetailsInfo> m11 = this.$orderDetailsInfo;
            kotlin.jvm.internal.M<OrderTotalVO> m12 = this.$orderTotal;
            flightSeatsSchemeOrderDetailsMapper = flightSeatsSchemeViewModel2.orderDetailsMapper;
            SelectionActionResponse selectionActionResponse = (SelectionActionResponse) ensureSuccessful.getData();
            FlightSeatsSchemeOrderDetailsVO map5 = flightSeatsSchemeOrderDetailsMapper.map(selectionActionResponse != null ? selectionActionResponse.getOrderDetailsBlock() : null);
            m11.f71787a = new FlightSeatsSchemeViewModel.OrderDetailsInfo(map5, ensureSuccessful.getTrackingInfo(), ensureSuccessful.getTrackingPayloads());
            SelectionActionResponse selectionActionResponse2 = (SelectionActionResponse) ensureSuccessful.getData();
            m12.f71787a = (selectionActionResponse2 == null || (orderTotalBlock = selectionActionResponse2.getOrderTotalBlock()) == null) ? 0 : OrderTotalMapperKt.toVo(orderTotalBlock);
            interfaceC3394a = flightSeatsSchemeViewModel2.mutex;
            this.L$0 = flightSeatsSchemeViewModel2;
            this.L$1 = map5;
            this.L$2 = interfaceC3394a;
            this.label = 2;
            if (interfaceC3394a.a(this) != aVar) {
                flightSeatsSchemeViewModel = flightSeatsSchemeViewModel2;
                flightSeatsSchemeOrderDetailsVO = map5;
                list = flightSeatsSchemeViewModel.schemeItems;
                boolean z112 = C7714v.Z(list) instanceof FlightSeatsSchemeOrderDetailsVO;
                list2 = flightSeatsSchemeViewModel.schemeItems;
                int P112 = C7714v.P(list2);
                if (flightSeatsSchemeOrderDetailsVO != null) {
                }
                if (flightSeatsSchemeOrderDetailsVO == null) {
                }
                if (flightSeatsSchemeOrderDetailsVO != null) {
                    list3 = flightSeatsSchemeViewModel.schemeItems;
                    list3.add(flightSeatsSchemeOrderDetailsVO);
                }
                map = flightSeatsSchemeViewModel.passengerToSeatPositionMap;
                selectedPassengerId = flightSeatsSchemeViewModel.getSelectedPassengerId();
                Integer num2 = (Integer) map.get(new Integer(selectedPassengerId));
                map2 = flightSeatsSchemeViewModel.seatNumberToPassengerMap;
                map3 = flightSeatsSchemeViewModel.passengerToSeatNumberMap;
                map4 = flightSeatsSchemeViewModel.passengerToSeatPositionMap;
                list5 = flightSeatsSchemeViewModel.schemeItems;
                list6 = flightSeatsSchemeViewModel.passengerTabs;
                FlightSeatsSchemeViewModel.SchemeUpdate schemeUpdate2 = new FlightSeatsSchemeViewModel.SchemeUpdate(num2, map2, map3, map4, list5, C7714v.U0(list6));
                interfaceC3394a.c(null);
                singleLiveEvent = flightSeatsSchemeViewModel.schemeUpdateVoLiveData;
                singleLiveEvent.postValue(schemeUpdate2);
                return Unit.f71690a;
            }
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlightSeatsSchemeViewModel$syncSelectionWithServer$1(List<? extends Map<String, String>> list, Deque<Function0<Unit>> deque, FlightSeatsSchemeViewModel flightSeatsSchemeViewModel, String str, d<? super FlightSeatsSchemeViewModel$syncSelectionWithServer$1> dVar) {
        super(2, dVar);
        this.$paramList = list;
        this.$undoOperations = deque;
        this.this$0 = flightSeatsSchemeViewModel;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FlightSeatsSchemeViewModel$syncSelectionWithServer$1 flightSeatsSchemeViewModel$syncSelectionWithServer$1 = new FlightSeatsSchemeViewModel$syncSelectionWithServer$1(this.$paramList, this.$undoOperations, this.this$0, this.$link, dVar);
        flightSeatsSchemeViewModel$syncSelectionWithServer$1.L$0 = obj;
        return flightSeatsSchemeViewModel$syncSelectionWithServer$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x001a, B:8:0x0079, B:9:0x0047, B:11:0x004d, B:13:0x0053, B:17:0x007f, B:19:0x0085, B:26:0x0034), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x001a, B:8:0x0079, B:9:0x0047, B:11:0x004d, B:13:0x0053, B:17:0x007f, B:19:0x0085, B:26:0x0034), top: B:2:0x0006 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0076 -> B:8:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0[] b0Arr;
        int i11;
        M m11;
        kotlin.jvm.internal.M m12;
        kotlin.jvm.internal.M m13;
        Iterator<Map<String, String>> it;
        B0[] b0Arr2;
        int i12;
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        try {
            if (i13 == 0) {
                s.b(obj);
                m11 = (M) this.L$0;
                kotlin.jvm.internal.M m14 = new kotlin.jvm.internal.M();
                m12 = m14;
                m13 = new kotlin.jvm.internal.M();
                it = this.$paramList.iterator();
                if (it.hasNext()) {
                }
                if (N.f(m11)) {
                }
                b0Arr2 = this.this$0.networkJobs;
                i12 = this.this$0.selectedPassengerTabPosition;
                b0Arr2[i12] = null;
                return Unit.f71690a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$3;
            kotlin.jvm.internal.M m15 = (kotlin.jvm.internal.M) this.L$2;
            kotlin.jvm.internal.M m16 = (kotlin.jvm.internal.M) this.L$1;
            M m17 = (M) this.L$0;
            s.b(obj);
            m13 = m15;
            m12 = m16;
            m11 = m17;
            this.$undoOperations.removeFirst();
            if (it.hasNext() || !N.f(m11)) {
                if (N.f(m11)) {
                    singleLiveEvent = this.this$0.orderDetailsLiveData;
                    singleLiveEvent.setValue(m12.f71787a);
                    singleLiveEvent2 = this.this$0.updateOrderTotalLiveData;
                    singleLiveEvent2.setValue(m13.f71787a);
                }
                b0Arr2 = this.this$0.networkJobs;
                i12 = this.this$0.selectedPassengerTabPosition;
                b0Arr2[i12] = null;
                return Unit.f71690a;
            }
            Map<String, String> next = it.next();
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, next, this.$link, m12, m13, null);
            this.L$0 = m11;
            this.L$1 = m12;
            this.L$2 = m13;
            this.L$3 = it;
            this.label = 1;
            if (C10727i.f(bVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
            this.$undoOperations.removeFirst();
            if (it.hasNext()) {
            }
            if (N.f(m11)) {
            }
            b0Arr2 = this.this$0.networkJobs;
            i12 = this.this$0.selectedPassengerTabPosition;
            b0Arr2[i12] = null;
            return Unit.f71690a;
        } catch (Throwable th2) {
            b0Arr = this.this$0.networkJobs;
            i11 = this.this$0.selectedPassengerTabPosition;
            b0Arr[i11] = null;
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightSeatsSchemeViewModel$syncSelectionWithServer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
