package ru.ozon.android.messenger.framework.presentation.chatlist;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$setupViewDelegates$$inlined$observe$1", f = "ChatListFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class c extends kotlin.coroutines.jvm.internal.j implements Function2<f, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f90465d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f90466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.coroutines.d dVar, k kVar) {
        super(2, dVar);
        this.f90466e = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        c cVar = new c(dVar, this.f90466e);
        cVar.f90465d = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(f fVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f90466e.p((f) this.f90465d);
        return Unit.f71690a;
    }
}
