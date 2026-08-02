package ru.ozon.android.messenger.framework.data.remote.websocket;

import Ae.C2399j;
import Ae.M0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$captureSocketConnectionResultWithTimeout$2", f = "MessengerWebSocketDataSource.kt", l = {264}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9333d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Unit>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88011d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9331b f88012e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$captureSocketConnectionResultWithTimeout$2$status$1", f = "MessengerWebSocketDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<AbstractC9330a, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f88013d;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(2, dVar);
            aVar.f88013d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC9330a abstractC9330a, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(abstractC9330a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            AbstractC9330a abstractC9330a = (AbstractC9330a) this.f88013d;
            return Boolean.valueOf((abstractC9330a instanceof AbstractC9330a.C1590a) || (abstractC9330a instanceof AbstractC9330a.e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9333d(C9331b c9331b, kotlin.coroutines.d<? super C9333d> dVar) {
        super(2, dVar);
        this.f88012e = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9333d(this.f88012e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Unit>> dVar) {
        return ((C9333d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88011d;
        if (i11 == 0) {
            Sc.s.b(obj);
            M0<AbstractC9330a> o11 = this.f88012e.o();
            a aVar2 = new a(2, null);
            this.f88011d = 1;
            obj = C2399j.v(o11, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return ((AbstractC9330a) obj) instanceof AbstractC9330a.C1590a ? new i.b(Unit.f71690a) : new i.a.h(0);
    }
}
