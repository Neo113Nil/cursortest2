package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Je.InterfaceC3394a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.PlacemarkProvider;
import we0.u;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$updatePin$1", f = "HotelsMapInfoV4Wrapper.kt", l = {568}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$updatePin$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MapAction.UpdatePin $action;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$updatePin$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, MapAction.UpdatePin updatePin, d<? super HotelsMapInfoV4Wrapper$updatePin$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4Wrapper;
        this.$action = updatePin;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV4Wrapper$updatePin$1(this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper;
        InterfaceC3394a interfaceC3394a2;
        MapAction.UpdatePin updatePin;
        PlacemarkProvider placemarkProvider;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC3394a = this.this$0.mutex;
            hotelsMapInfoV4Wrapper = this.this$0;
            MapAction.UpdatePin updatePin2 = this.$action;
            this.L$0 = interfaceC3394a;
            this.L$1 = hotelsMapInfoV4Wrapper;
            this.L$2 = updatePin2;
            this.label = 1;
            if (interfaceC3394a.a(this) == aVar) {
                return aVar;
            }
            interfaceC3394a2 = interfaceC3394a;
            updatePin = updatePin2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            updatePin = (MapAction.UpdatePin) this.L$2;
            hotelsMapInfoV4Wrapper = (HotelsMapInfoV4Wrapper) this.L$1;
            interfaceC3394a2 = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            hotelsMapInfoV4Wrapper.hotelsMapInfoView.getController().b().e(updatePin.getUpdatedPin().getId());
            placemarkProvider = hotelsMapInfoV4Wrapper.placemarkProvider;
            u provide = placemarkProvider.provide(updatePin.getUpdatedPin());
            if (provide == null) {
                return Unit.f71690a;
            }
            hotelsMapInfoV4Wrapper.hotelsMapInfoView.getController().b().h((long) provide.d().f(), C7714v.a0(provide));
            Unit unit = Unit.f71690a;
            interfaceC3394a2.c(null);
            return Unit.f71690a;
        } finally {
            interfaceC3394a2.c(null);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4Wrapper$updatePin$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
