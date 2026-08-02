package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import Ae.w0;
import He.b;
import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import com.google.android.gms.wallet.WalletConstants;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.SelectionActionResponseV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FlightSeatsSchemeV2FooterMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1", f = "FlightSeatsSchemeV2ViewModel.kt", l = {357, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ List<Map<String, String>> $paramList;
    final /* synthetic */ Deque<Function0<Unit>> $undoOperations;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FlightSeatsSchemeV2ViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1$1", f = "FlightSeatsSchemeV2ViewModel.kt", l = {480, 370, 495}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate.FooterBlockUpdate> $footerBlockUpdate;
        final /* synthetic */ String $link;
        final /* synthetic */ Map<String, String> $params;
        final /* synthetic */ kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate> $update;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ FlightSeatsSchemeV2ViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel, Map<String, String> map, String str, kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate.FooterBlockUpdate> m11, kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate> m12, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = flightSeatsSchemeV2ViewModel;
            this.$params = map;
            this.$link = str;
            this.$footerBlockUpdate = m11;
            this.$update = m12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$params, this.$link, this.$footerBlockUpdate, this.$update, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
        
            if (r2.emit(r3, r22) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0057, code lost:
        
            if (r2 == r0) goto L43;
         */
        /* JADX WARN: Type inference failed for: r12v5, types: [T, ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$SchemeUpdate$FooterBlockUpdate] */
        /* JADX WARN: Type inference failed for: r7v2, types: [T, ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$SchemeUpdate] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ActionV2Repository actionV2Repository;
            Object callActionSuspend;
            FlightSeatsSchemeV2FooterMapper flightSeatsSchemeV2FooterMapper;
            FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI tabStyleV2VI;
            FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI tabStyleV2VI2;
            int i11;
            List list;
            int i12;
            InterfaceC3394a interfaceC3394a;
            ActionV2Response actionV2Response;
            InterfaceC3394a interfaceC3394a2;
            FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel;
            kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate.FooterBlockUpdate> m11;
            kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate> m12;
            w0 w0Var;
            Map map;
            int selectedPassengerId;
            Map map2;
            Map map3;
            Map map4;
            List list2;
            List list3;
            int i13;
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                s.b(obj);
                actionV2Repository = this.this$0.api;
                ActionV2Request actionV2Request = new ActionV2Request(this.$params, this.$link, true);
                this.label = 1;
                callActionSuspend = actionV2Repository.callActionSuspend(actionV2Request, SelectionActionResponseV2.class, this);
            } else {
                if (i14 != 1) {
                    if (i14 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m12 = (kotlin.jvm.internal.M) this.L$4;
                    interfaceC3394a2 = (InterfaceC3394a) this.L$3;
                    actionV2Response = (ActionV2Response) this.L$2;
                    m11 = (kotlin.jvm.internal.M) this.L$1;
                    flightSeatsSchemeV2ViewModel = (FlightSeatsSchemeV2ViewModel) this.L$0;
                    s.b(obj);
                    try {
                        map = flightSeatsSchemeV2ViewModel.passengerToSeatPositionMap;
                        selectedPassengerId = flightSeatsSchemeV2ViewModel.getSelectedPassengerId();
                        Integer num = (Integer) map.get(new Integer(selectedPassengerId));
                        map2 = flightSeatsSchemeV2ViewModel.seatNumberToPassengerMap;
                        map3 = flightSeatsSchemeV2ViewModel.passengerToSeatNumberMap;
                        map4 = flightSeatsSchemeV2ViewModel.passengerToSeatPositionMap;
                        list2 = flightSeatsSchemeV2ViewModel.schemeItems;
                        FlightSeatsSchemeV2ViewModel.SchemeUpdate.FooterBlockUpdate footerBlockUpdate = m11.f71787a;
                        Map<String, TokenizedTrackingInfo> trackingInfo = actionV2Response.getTrackingInfo();
                        Map<String, String> trackingPayloads = actionV2Response.getTrackingPayloads();
                        list3 = flightSeatsSchemeV2ViewModel.passengerTabs;
                        i13 = flightSeatsSchemeV2ViewModel.selectedPassengerTabPosition;
                        ?? schemeUpdate = new FlightSeatsSchemeV2ViewModel.SchemeUpdate(num, map2, map3, map4, list2, footerBlockUpdate, trackingInfo, trackingPayloads, ((FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) list3.get(i13)).getSubtitleName());
                        interfaceC3394a2.c(null);
                        m12.f71787a = schemeUpdate;
                        return Unit.f71690a;
                    } catch (Throwable th2) {
                        interfaceC3394a2.c(null);
                        throw th2;
                    }
                }
                s.b(obj);
                callActionSuspend = obj;
            }
            ActionV2Response ensureSuccessful = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) callActionSuspend);
            FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel2 = this.this$0;
            kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate.FooterBlockUpdate> m13 = this.$footerBlockUpdate;
            kotlin.jvm.internal.M<FlightSeatsSchemeV2ViewModel.SchemeUpdate> m14 = this.$update;
            SelectionActionResponseV2 selectionActionResponseV2 = (SelectionActionResponseV2) ensureSuccessful.getData();
            if (selectionActionResponseV2 != null) {
                if (selectionActionResponseV2.getPassengers().isEmpty()) {
                    flightSeatsSchemeV2ViewModel2.sendNonFatalLog();
                    w0Var = flightSeatsSchemeV2ViewModel2._networkErrorFlow;
                    Unit unit = Unit.f71690a;
                    this.label = 2;
                } else {
                    Iterator<FooterBlockV2DTO.PassengerV2DTO> it = selectionActionResponseV2.getPassengers().iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i15 = -1;
                            break;
                        }
                        if (it.next().isCurrent()) {
                            break;
                        }
                        i15++;
                    }
                    flightSeatsSchemeV2ViewModel2.selectedPassengerTabPosition = Math.max(0, i15);
                    flightSeatsSchemeV2FooterMapper = flightSeatsSchemeV2ViewModel2.footerMapper;
                    List<FooterBlockV2DTO.PassengerV2DTO> passengers = selectionActionResponseV2.getPassengers();
                    tabStyleV2VI = flightSeatsSchemeV2ViewModel2.selectedStyle;
                    tabStyleV2VI2 = flightSeatsSchemeV2ViewModel2.defaultStyle;
                    i11 = flightSeatsSchemeV2ViewModel2.selectedPassengerTabPosition;
                    flightSeatsSchemeV2ViewModel2.passengerTabs = C7714v.W0(flightSeatsSchemeV2FooterMapper.mapPassengers(passengers, tabStyleV2VI2, tabStyleV2VI, i11));
                    list = flightSeatsSchemeV2ViewModel2.passengerTabs;
                    TextDTO price = selectionActionResponseV2.getPrice();
                    TextDTO caption = selectionActionResponseV2.getCaption();
                    CommonAtomIconDTO infoIcon = selectionActionResponseV2.getInfoIcon();
                    ButtonV3DTO submitButton = selectionActionResponseV2.getSubmitButton();
                    i12 = flightSeatsSchemeV2ViewModel2.selectedPassengerTabPosition;
                    CommonControlSettings common = selectionActionResponseV2.getCommon();
                    m13.f71787a = new FlightSeatsSchemeV2ViewModel.SchemeUpdate.FooterBlockUpdate(list, i12, caption, price, submitButton, infoIcon, common != null ? common.toAtomAction() : null, selectionActionResponseV2.getSkipButton() != null, selectionActionResponseV2.getSkipButton());
                    interfaceC3394a = flightSeatsSchemeV2ViewModel2.mutex;
                    this.L$0 = flightSeatsSchemeV2ViewModel2;
                    this.L$1 = m13;
                    this.L$2 = ensureSuccessful;
                    this.L$3 = interfaceC3394a;
                    this.L$4 = m14;
                    this.label = 3;
                    if (interfaceC3394a.a(this) != aVar) {
                        actionV2Response = ensureSuccessful;
                        interfaceC3394a2 = interfaceC3394a;
                        flightSeatsSchemeV2ViewModel = flightSeatsSchemeV2ViewModel2;
                        m11 = m13;
                        m12 = m14;
                        map = flightSeatsSchemeV2ViewModel.passengerToSeatPositionMap;
                        selectedPassengerId = flightSeatsSchemeV2ViewModel.getSelectedPassengerId();
                        Integer num2 = (Integer) map.get(new Integer(selectedPassengerId));
                        map2 = flightSeatsSchemeV2ViewModel.seatNumberToPassengerMap;
                        map3 = flightSeatsSchemeV2ViewModel.passengerToSeatNumberMap;
                        map4 = flightSeatsSchemeV2ViewModel.passengerToSeatPositionMap;
                        list2 = flightSeatsSchemeV2ViewModel.schemeItems;
                        FlightSeatsSchemeV2ViewModel.SchemeUpdate.FooterBlockUpdate footerBlockUpdate2 = m11.f71787a;
                        Map<String, TokenizedTrackingInfo> trackingInfo2 = actionV2Response.getTrackingInfo();
                        Map<String, String> trackingPayloads2 = actionV2Response.getTrackingPayloads();
                        list3 = flightSeatsSchemeV2ViewModel.passengerTabs;
                        i13 = flightSeatsSchemeV2ViewModel.selectedPassengerTabPosition;
                        ?? schemeUpdate2 = new FlightSeatsSchemeV2ViewModel.SchemeUpdate(num2, map2, map3, map4, list2, footerBlockUpdate2, trackingInfo2, trackingPayloads2, ((FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) list3.get(i13)).getSubtitleName());
                        interfaceC3394a2.c(null);
                        m12.f71787a = schemeUpdate2;
                    }
                }
                return aVar;
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1(List<? extends Map<String, String>> list, Deque<Function0<Unit>> deque, FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel, String str, d<? super FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1> dVar) {
        super(2, dVar);
        this.$paramList = list;
        this.$undoOperations = deque;
        this.this$0 = flightSeatsSchemeV2ViewModel;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1 flightSeatsSchemeV2ViewModel$syncSelectionWithServer$1 = new FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1(this.$paramList, this.$undoOperations, this.this$0, this.$link, dVar);
        flightSeatsSchemeV2ViewModel$syncSelectionWithServer$1.L$0 = obj;
        return flightSeatsSchemeV2ViewModel$syncSelectionWithServer$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r1.emit(r15, r14) != r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000e, B:13:0x002f, B:15:0x0082, B:16:0x0050, B:18:0x0056, B:20:0x005c, B:24:0x0088, B:26:0x008e, B:28:0x0094, B:31:0x003d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000e, B:13:0x002f, B:15:0x0082, B:16:0x0050, B:18:0x0056, B:20:0x005c, B:24:0x0088, B:26:0x008e, B:28:0x0094, B:31:0x003d), top: B:2:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007f -> B:15:0x0082). Please report as a decompilation issue!!! */
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
        w0 w0Var;
        B0[] b0Arr2;
        int i12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        try {
            if (i13 == 0) {
                s.b(obj);
                m11 = (M) this.L$0;
                m12 = new kotlin.jvm.internal.M();
                m13 = new kotlin.jvm.internal.M();
                it = this.$paramList.iterator();
                if (it.hasNext()) {
                }
                if (N.f(m11)) {
                }
                b0Arr2 = this.this$0.networkJobs;
                i12 = this.this$0.selectedPassengerTabPosition;
                b0Arr2[i12] = null;
                this.this$0.isProcessingClickSeats = false;
                return Unit.f71690a;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                b0Arr2 = this.this$0.networkJobs;
                i12 = this.this$0.selectedPassengerTabPosition;
                b0Arr2[i12] = null;
                this.this$0.isProcessingClickSeats = false;
                return Unit.f71690a;
            }
            it = (Iterator) this.L$3;
            kotlin.jvm.internal.M m14 = (kotlin.jvm.internal.M) this.L$2;
            kotlin.jvm.internal.M m15 = (kotlin.jvm.internal.M) this.L$1;
            M m16 = (M) this.L$0;
            s.b(obj);
            m13 = m14;
            m12 = m15;
            m11 = m16;
            this.$undoOperations.removeFirst();
            if (it.hasNext() || !N.f(m11)) {
                if (N.f(m11) && (r15 = (FlightSeatsSchemeV2ViewModel.SchemeUpdate) m13.f71787a) != null) {
                    w0Var = this.this$0._schemeUpdateVoFlow;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                }
                b0Arr2 = this.this$0.networkJobs;
                i12 = this.this$0.selectedPassengerTabPosition;
                b0Arr2[i12] = null;
                this.this$0.isProcessingClickSeats = false;
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
            }
            this.$undoOperations.removeFirst();
            if (it.hasNext()) {
            }
            if (N.f(m11)) {
                w0Var = this.this$0._schemeUpdateVoFlow;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
            }
            b0Arr2 = this.this$0.networkJobs;
            i12 = this.this$0.selectedPassengerTabPosition;
            b0Arr2[i12] = null;
            this.this$0.isProcessingClickSeats = false;
            return Unit.f71690a;
            return aVar;
        } catch (Throwable th2) {
            b0Arr = this.this$0.networkJobs;
            i11 = this.this$0.selectedPassengerTabPosition;
            b0Arr[i11] = null;
            this.this$0.isProcessingClickSeats = false;
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
