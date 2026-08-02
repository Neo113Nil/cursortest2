package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$aiScreenState$2", f = "AiAssistantViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9418e0 extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super W>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9418e0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89599d = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9418e0(dVar, this.f89599d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super W> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9418e0) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C9414c0.J0(this.f89599d);
        return Unit.f71690a;
    }
}
