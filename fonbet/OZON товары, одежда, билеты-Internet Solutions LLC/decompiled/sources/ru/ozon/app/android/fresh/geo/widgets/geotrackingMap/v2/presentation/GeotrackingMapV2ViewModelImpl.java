package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.ConnectionSocketState;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingMessage;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingWebSocket;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel;
import xe.B0;
import xe.C10727i;
import ze.EnumC11113a;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010%R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingWebSocket;", "geotrackingWebSocket", "<init>", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingWebSocket;)V", "", "stopSocketWork", "()V", "initPopupTimer", "startSocketIfNeeded", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$CourierLocation;", "courierLocation", "processCourierLocationEvent", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$CourierLocation;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$OrderStatus;", "orderStatusMessage", "processOrderStatusEvent", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$OrderStatus;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$NeedsPageRefresh;", "message", "processNeedsPageRefreshEvent", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$NeedsPageRefresh;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "vo", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)V", "onStart", "onStop", "onBackPressed", "onCleared", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingWebSocket;", "Lze/h;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "action", "Lze/h;", "getAction", "()Lze/h;", "LAe/w0;", "mapState", "LAe/w0;", "getMapState", "()LAe/w0;", "Lxe/B0;", "socketJob", "Lxe/B0;", "popupTimeJob", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState;", "popupTimer", "", "webSocketUrl", "Ljava/lang/String;", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingMapV2ViewModelImpl extends w0 implements GeotrackingMapV2ViewModel {

    @NotNull
    private final h<GeotrackingMapV2ViewModel.Action> action;

    @NotNull
    private final GeotrackingWebSocket geotrackingWebSocket;

    @NotNull
    private final Ae.w0<GeotrackingMapV2VO> mapState;
    private B0 popupTimeJob;

    @NotNull
    private final h<ConnectionSocketState> popupTimer;
    private B0 socketJob;
    private String webSocketUrl;

    public GeotrackingMapV2ViewModelImpl(@NotNull GeotrackingWebSocket geotrackingWebSocket) {
        Intrinsics.checkNotNullParameter(geotrackingWebSocket, "geotrackingWebSocket");
        this.geotrackingWebSocket = geotrackingWebSocket;
        this.action = k.a(0, 7, null);
        this.mapState = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        this.popupTimer = k.a(0, 7, null);
    }

    private final void initPopupTimer() {
        this.popupTimeJob = C2399j.C(new C2408n0(C2399j.y(C2399j.o(C2399j.H(this.popupTimer)), new GeotrackingMapV2ViewModelImpl$initPopupTimer$1(null)), new GeotrackingMapV2ViewModelImpl$initPopupTimer$2(this, null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCourierLocationEvent(GeotrackingMessage.CourierLocation courierLocation) {
        GeotrackingMapV2VO geotrackingMapV2VO = (GeotrackingMapV2VO) C7714v.Z(getMapState().getReplayCache());
        if (geotrackingMapV2VO == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new GeotrackingMapV2ViewModelImpl$processCourierLocationEvent$1(this, geotrackingMapV2VO, courierLocation, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processNeedsPageRefreshEvent(GeotrackingMessage.NeedsPageRefresh message) {
        if (message.getNeedsPageRefresh()) {
            C10727i.c(x0.a(this), null, null, new GeotrackingMapV2ViewModelImpl$processNeedsPageRefreshEvent$1(this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOrderStatusEvent(GeotrackingMessage.OrderStatus orderStatusMessage) {
        C10727i.c(x0.a(this), null, null, new GeotrackingMapV2ViewModelImpl$processOrderStatusEvent$1((GeotrackingMapV2VO) C7714v.Z(getMapState().getReplayCache()), orderStatusMessage, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startSocketIfNeeded(d<? super Unit> dVar) {
        GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$1 geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1;
        int i11;
        GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl;
        GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl2;
        if (dVar instanceof GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$1) {
            geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1 = (GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$1) dVar;
            int i12 = geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (this.webSocketUrl != null && this.socketJob == null) {
                        initPopupTimer();
                        GeotrackingWebSocket geotrackingWebSocket = this.geotrackingWebSocket;
                        String str = this.webSocketUrl;
                        Intrinsics.f(str);
                        geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.L$0 = this;
                        geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.L$1 = this;
                        geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.label = 1;
                        obj = geotrackingWebSocket.eventFlow(str, geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                        geotrackingMapV2ViewModelImpl = this;
                        geotrackingMapV2ViewModelImpl2 = geotrackingMapV2ViewModelImpl;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                geotrackingMapV2ViewModelImpl2 = (GeotrackingMapV2ViewModelImpl) geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.L$1;
                geotrackingMapV2ViewModelImpl = (GeotrackingMapV2ViewModelImpl) geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.L$0;
                s.b(obj);
                geotrackingMapV2ViewModelImpl2.socketJob = C2399j.C(new C2408n0((InterfaceC2395h) obj, new GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2(geotrackingMapV2ViewModelImpl, null)), x0.a(geotrackingMapV2ViewModelImpl));
                return Unit.f71690a;
            }
        }
        geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1 = new GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$1(this, dVar);
        Object obj2 = geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = geotrackingMapV2ViewModelImpl$startSocketIfNeeded$1.label;
        if (i11 != 0) {
        }
        geotrackingMapV2ViewModelImpl2.socketJob = C2399j.C(new C2408n0((InterfaceC2395h) obj2, new GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2(geotrackingMapV2ViewModelImpl, null)), x0.a(geotrackingMapV2ViewModelImpl));
        return Unit.f71690a;
    }

    private final void stopSocketWork() {
        B0 b02;
        B0 b03 = this.socketJob;
        if (b03 != null && b03.isActive() && (b02 = this.socketJob) != null) {
            b02.j(null);
        }
        this.socketJob = null;
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel
    public void bind(@NotNull GeotrackingMapV2VO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.webSocketUrl = vo.getWebSocketUrl();
        C10727i.c(x0.a(this), null, null, new GeotrackingMapV2ViewModelImpl$bind$1(vo, this, null), 3);
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel
    public void onBackPressed() {
        C10727i.c(x0.a(this), null, null, new GeotrackingMapV2ViewModelImpl$onBackPressed$1(this, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        stopSocketWork();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel
    public void onStart() {
        C10727i.c(x0.a(this), null, null, new GeotrackingMapV2ViewModelImpl$onStart$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel
    public void onStop() {
        stopSocketWork();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel
    @NotNull
    public h<GeotrackingMapV2ViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel
    @NotNull
    public Ae.w0<GeotrackingMapV2VO> getMapState() {
        return this.mapState;
    }
}
