package ru.ozon.android.messenger.framework.data.remote.websocket;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$reconnectSocket$reconnectionStatus$1", f = "MessengerWebSocketDataSource.kt", l = {211}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9346q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Unit>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88129d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9331b f88130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9346q(C9331b c9331b, kotlin.coroutines.d<? super C9346q> dVar) {
        super(2, dVar);
        this.f88130e = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9346q(this.f88130e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Unit>> dVar) {
        return ((C9346q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f88129d;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        this.f88129d = 1;
        i11 = this.f88130e.i(this);
        return i11 == aVar ? aVar : i11;
    }
}
