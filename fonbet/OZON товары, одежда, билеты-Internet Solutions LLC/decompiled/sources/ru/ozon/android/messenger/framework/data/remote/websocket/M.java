package ru.ozon.android.messenger.framework.data.remote.websocket;

import We.L;
import androidx.recyclerview.widget.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.WebSocketHttpProxy$1", f = "WebSocketHttpProxy.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class M extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f87937d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ P f87938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(P p11, kotlin.coroutines.d<? super M> dVar) {
        super(2, dVar);
        this.f87938e = p11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new M(this.f87938e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((M) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        We.G g10;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f87937d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f87937d = 1;
            if (Y.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        P p11 = this.f87938e;
        We.S s11 = p11.f87943a;
        L.a aVar2 = new L.a();
        aVar2.f(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        g10 = p11.f87945c;
        aVar2.r(g10);
        aVar2.l("Switching Protocols");
        aVar2.o(We.F.HTTP_1_1);
        s11.onOpen(p11, aVar2.c());
        return Unit.f71690a;
    }
}
