package ru.ozon.android.messenger.blocks.chatlistheader.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.chatlistheader.search.SearchBarKt$SearchBar$1$1$1$1", f = "SearchBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f84811d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j1.r f84812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(boolean z11, j1.r rVar, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f84811d = z11;
        this.f84812e = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f84811d, this.f84812e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        if (this.f84811d) {
            this.f84812e.d();
        }
        return Unit.f71690a;
    }
}
