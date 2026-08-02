package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.ConnectionSocketState;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel;
import xe.C10727i;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$2", f = "GeotrackingMapV2ViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewModelImpl$initPopupTimer$2 extends j implements Function2<ConnectionSocketState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GeotrackingMapV2ViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$2$1", f = "GeotrackingMapV2ViewModelImpl.kt", l = {93}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ GeotrackingMapV2ViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = geotrackingMapV2ViewModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                h<GeotrackingMapV2ViewModel.Action> action = this.this$0.getAction();
                GeotrackingMapV2ViewModel.Action.HidePopup hidePopup = GeotrackingMapV2ViewModel.Action.HidePopup.INSTANCE;
                this.label = 1;
                if (action.n(hidePopup, this) == aVar) {
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
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$2$2", f = "GeotrackingMapV2ViewModelImpl.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$initPopupTimer$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ GeotrackingMapV2ViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = geotrackingMapV2ViewModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                h<GeotrackingMapV2ViewModel.Action> action = this.this$0.getAction();
                GeotrackingMapV2ViewModel.Action.ShowPopup showPopup = GeotrackingMapV2ViewModel.Action.ShowPopup.INSTANCE;
                this.label = 1;
                if (action.n(showPopup, this) == aVar) {
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
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewModelImpl$initPopupTimer$2(GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl, d<? super GeotrackingMapV2ViewModelImpl$initPopupTimer$2> dVar) {
        super(2, dVar);
        this.this$0 = geotrackingMapV2ViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        GeotrackingMapV2ViewModelImpl$initPopupTimer$2 geotrackingMapV2ViewModelImpl$initPopupTimer$2 = new GeotrackingMapV2ViewModelImpl$initPopupTimer$2(this.this$0, dVar);
        geotrackingMapV2ViewModelImpl$initPopupTimer$2.L$0 = obj;
        return geotrackingMapV2ViewModelImpl$initPopupTimer$2;
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
            C10727i.c(x0.a(this.this$0), null, null, new AnonymousClass1(this.this$0, null), 3);
        } else {
            if (!Intrinsics.d(connectionSocketState, ConnectionSocketState.Disconnected.INSTANCE)) {
                throw new o();
            }
            C10727i.c(x0.a(this.this$0), null, null, new AnonymousClass2(this.this$0, null), 3);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConnectionSocketState connectionSocketState, d<? super Unit> dVar) {
        return ((GeotrackingMapV2ViewModelImpl$initPopupTimer$2) create(connectionSocketState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
