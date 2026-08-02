package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$loadNextPage$notConnectedToSocket$1", f = "ChatSearchViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<AbstractC9330a, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f91793d;

    s() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        s sVar = new s(2, dVar);
        sVar.f91793d = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC9330a abstractC9330a, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((s) create(abstractC9330a, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return Boolean.valueOf(((AbstractC9330a) this.f91793d) instanceof AbstractC9330a.C1590a);
    }
}
