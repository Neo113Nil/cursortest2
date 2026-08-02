package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.ai.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$handleAction$1", f = "AiAssistantViewModel.kt", l = {421}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9420f0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89601d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9420f0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89602e = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9420f0(dVar, this.f89602e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9420f0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ae.C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89601d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f89602e.f89523z;
            Y.a aVar2 = Y.a.f89404a;
            this.f89601d = 1;
            if (c02.emit(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
