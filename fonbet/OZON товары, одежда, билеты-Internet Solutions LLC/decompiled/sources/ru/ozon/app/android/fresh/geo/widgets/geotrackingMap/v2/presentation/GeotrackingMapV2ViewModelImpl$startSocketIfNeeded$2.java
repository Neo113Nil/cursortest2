package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.ConnectionSocketState;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingMessage;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingSocketEvent;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingSocketEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2", f = "GeotrackingMapV2ViewModelImpl.kt", l = {109, 110}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2 extends j implements Function2<GeotrackingSocketEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GeotrackingMapV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2(GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl, d<? super GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2> dVar) {
        super(2, dVar);
        this.this$0 = geotrackingMapV2ViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2 geotrackingMapV2ViewModelImpl$startSocketIfNeeded$2 = new GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2(this.this$0, dVar);
        geotrackingMapV2ViewModelImpl$startSocketIfNeeded$2.L$0 = obj;
        return geotrackingMapV2ViewModelImpl$startSocketIfNeeded$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r5.n(r1, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r5.n(r1, r4) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        h hVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            GeotrackingSocketEvent geotrackingSocketEvent = (GeotrackingSocketEvent) this.L$0;
            if (Intrinsics.d(geotrackingSocketEvent, GeotrackingSocketEvent.Connected.INSTANCE)) {
                hVar2 = this.this$0.popupTimer;
                ConnectionSocketState.Connected connected = ConnectionSocketState.Connected.INSTANCE;
                this.label = 1;
            } else if (geotrackingSocketEvent instanceof GeotrackingSocketEvent.Error) {
                hVar = this.this$0.popupTimer;
                ConnectionSocketState.Disconnected disconnected = ConnectionSocketState.Disconnected.INSTANCE;
                this.label = 2;
            } else {
                if (!(geotrackingSocketEvent instanceof GeotrackingSocketEvent.OnNewMessageReceived)) {
                    throw new o();
                }
                GeotrackingSocketEvent.OnNewMessageReceived onNewMessageReceived = (GeotrackingSocketEvent.OnNewMessageReceived) geotrackingSocketEvent;
                GeotrackingMessage message = onNewMessageReceived.getMessage();
                if (message instanceof GeotrackingMessage.CourierLocation) {
                    this.this$0.processCourierLocationEvent((GeotrackingMessage.CourierLocation) onNewMessageReceived.getMessage());
                } else if (message instanceof GeotrackingMessage.NeedsPageRefresh) {
                    this.this$0.processNeedsPageRefreshEvent((GeotrackingMessage.NeedsPageRefresh) onNewMessageReceived.getMessage());
                } else {
                    if (!(message instanceof GeotrackingMessage.OrderStatus)) {
                        throw new o();
                    }
                    this.this$0.processOrderStatusEvent((GeotrackingMessage.OrderStatus) onNewMessageReceived.getMessage());
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GeotrackingSocketEvent geotrackingSocketEvent, d<? super Unit> dVar) {
        return ((GeotrackingMapV2ViewModelImpl$startSocketIfNeeded$2) create(geotrackingSocketEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
