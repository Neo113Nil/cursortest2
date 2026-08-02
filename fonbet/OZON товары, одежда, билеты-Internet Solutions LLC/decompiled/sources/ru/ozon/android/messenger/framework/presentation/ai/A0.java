package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$performAiRefresh$1$1", f = "AiAssistantViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class A0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89209d = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new A0(dVar, this.f89209d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((A0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f89209d.N0().d();
        return Unit.f71690a;
    }
}
