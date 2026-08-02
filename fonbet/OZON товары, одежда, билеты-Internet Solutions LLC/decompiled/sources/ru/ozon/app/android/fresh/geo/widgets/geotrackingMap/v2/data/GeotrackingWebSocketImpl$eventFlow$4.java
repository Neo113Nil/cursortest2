package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data;

import Ae.C2399j;
import Ae.C2405m;
import Ae.InterfaceC2395h;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingSocketEvent;
import ru.ozon.app.android.network.websockets.SocketEvent;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/network/websockets/SocketEvent;", "kotlin.jvm.PlatformType", "socketEvent", "LAe/h;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingSocketEvent;", "<anonymous>", "(Lru/ozon/app/android/network/websockets/SocketEvent;)LAe/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data.GeotrackingWebSocketImpl$eventFlow$4", f = "GeotrackingWebSocketImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingWebSocketImpl$eventFlow$4 extends j implements Function2<SocketEvent, d<? super InterfaceC2395h<? extends GeotrackingSocketEvent>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GeotrackingWebSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingWebSocketImpl$eventFlow$4(GeotrackingWebSocketImpl geotrackingWebSocketImpl, d<? super GeotrackingWebSocketImpl$eventFlow$4> dVar) {
        super(2, dVar);
        this.this$0 = geotrackingWebSocketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        GeotrackingWebSocketImpl$eventFlow$4 geotrackingWebSocketImpl$eventFlow$4 = new GeotrackingWebSocketImpl$eventFlow$4(this.this$0, dVar);
        geotrackingWebSocketImpl$eventFlow$4.L$0 = obj;
        return geotrackingWebSocketImpl$eventFlow$4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SocketEvent socketEvent = (SocketEvent) this.L$0;
        GeotrackingWebSocketImpl geotrackingWebSocketImpl = this.this$0;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = socketEvent instanceof SocketEvent.Message ? geotrackingWebSocketImpl.mapSocketMessage((SocketEvent.Message) socketEvent) : socketEvent instanceof SocketEvent.Error ? new C2405m(new GeotrackingSocketEvent.Error(((SocketEvent.Error) socketEvent).getReason())) : Intrinsics.d(socketEvent, SocketEvent.Connected.INSTANCE) ? new C2405m(GeotrackingSocketEvent.Connected.INSTANCE) : C2399j.t();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        a.b bVar = Lm0.a.f17149a;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            bVar.e(b11);
        }
        return a11 instanceof r.b ? C2399j.t() : a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SocketEvent socketEvent, d<? super InterfaceC2395h<? extends GeotrackingSocketEvent>> dVar) {
        return ((GeotrackingWebSocketImpl$eventFlow$4) create(socketEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
