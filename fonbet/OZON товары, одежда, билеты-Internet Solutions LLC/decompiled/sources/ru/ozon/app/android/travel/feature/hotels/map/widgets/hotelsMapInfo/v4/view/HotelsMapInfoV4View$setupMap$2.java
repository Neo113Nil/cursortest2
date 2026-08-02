package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ve0.b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lve0/b;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View$setupMap$2", f = "HotelsMapInfoV4View.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4View$setupMap$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super b>, Throwable, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    HotelsMapInfoV4View$setupMap$2(d<? super HotelsMapInfoV4View$setupMap$2> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super b> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        HotelsMapInfoV4View$setupMap$2 hotelsMapInfoV4View$setupMap$2 = new HotelsMapInfoV4View$setupMap$2(dVar);
        hotelsMapInfoV4View$setupMap$2.L$0 = interfaceC2397i;
        hotelsMapInfoV4View$setupMap$2.L$1 = th2;
        return hotelsMapInfoV4View$setupMap$2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ThrowableExtKt.log((Throwable) this.L$1, ((InterfaceC2397i) this.L$0).getClass().getSimpleName().concat("_setupMap"));
        return Unit.f71690a;
    }
}
