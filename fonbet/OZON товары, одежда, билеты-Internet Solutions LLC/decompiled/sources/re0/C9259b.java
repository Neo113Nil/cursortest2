package re0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import se0.AbstractC9672a;
import xe.M;

@e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.pulse.LocationPulseListener$setPulsing$1", f = "LocationPulseListener.kt", l = {}, m = "invokeSuspend")
/* renamed from: re0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9259b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9260c f83332d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f83333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9259b(C9260c c9260c, boolean z11, kotlin.coroutines.d<? super C9259b> dVar) {
        super(2, dVar);
        this.f83332d = c9260c;
        this.f83333e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9259b(this.f83332d, this.f83333e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9259b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC9261d interfaceC9261d;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        interfaceC9261d = this.f83332d.f83336c;
        ((AbstractC9672a) interfaceC9261d).p(this.f83333e);
        return Unit.f71690a;
    }
}
