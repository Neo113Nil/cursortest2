package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import we0.h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/h;", "update", "", "<anonymous>", "(Lwe0/h;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$observeActions$1", f = "HotelsMapViewV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapViewV2$observeActions$1 extends j implements Function2<h, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsMapViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapViewV2$observeActions$1(HotelsMapViewV2 hotelsMapViewV2, d<? super HotelsMapViewV2$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapViewV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapViewV2$observeActions$1 hotelsMapViewV2$observeActions$1 = new HotelsMapViewV2$observeActions$1(this.this$0, dVar);
        hotelsMapViewV2$observeActions$1.L$0 = obj;
        return hotelsMapViewV2$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        h hVar = (h) this.L$0;
        function1 = this.this$0.cameraChangeListener;
        function1.invoke(hVar);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h hVar, d<? super Unit> dVar) {
        return ((HotelsMapViewV2$observeActions$1) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
