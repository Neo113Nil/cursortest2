package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Ae.C2405m;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
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
import xe.Y;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState;", "it", "LAe/h;", "<anonymous>", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState;)LAe/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$1", f = "GeotrackingMapV2ViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewModelImpl$initPopupTimer$1 extends j implements Function2<ConnectionSocketState, d<? super InterfaceC2395h<? extends ConnectionSocketState>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState$Disconnected;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$1$1", f = "GeotrackingMapV2ViewModelImpl.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<ConnectionSocketState.Disconnected, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                this.label = 1;
                if (Y.b(10000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConnectionSocketState.Disconnected disconnected, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(disconnected, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    GeotrackingMapV2ViewModelImpl$initPopupTimer$1(d<? super GeotrackingMapV2ViewModelImpl$initPopupTimer$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        GeotrackingMapV2ViewModelImpl$initPopupTimer$1 geotrackingMapV2ViewModelImpl$initPopupTimer$1 = new GeotrackingMapV2ViewModelImpl$initPopupTimer$1(dVar);
        geotrackingMapV2ViewModelImpl$initPopupTimer$1.L$0 = obj;
        return geotrackingMapV2ViewModelImpl$initPopupTimer$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ConnectionSocketState connectionSocketState = (ConnectionSocketState) this.L$0;
        if (Intrinsics.d(connectionSocketState, ConnectionSocketState.Connected.INSTANCE)) {
            return new C2405m(connectionSocketState);
        }
        if (connectionSocketState instanceof ConnectionSocketState.Disconnected) {
            return new C2408n0(new C2405m(connectionSocketState), new AnonymousClass1(null));
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConnectionSocketState connectionSocketState, d<? super InterfaceC2395h<? extends ConnectionSocketState>> dVar) {
        return ((GeotrackingMapV2ViewModelImpl$initPopupTimer$1) create(connectionSocketState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
