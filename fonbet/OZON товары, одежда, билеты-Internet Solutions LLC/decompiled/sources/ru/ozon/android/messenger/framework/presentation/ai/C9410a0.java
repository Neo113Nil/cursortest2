package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.ai.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$1", f = "AiAssistantViewModel.kt", l = {209}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9410a0 extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.presentation.models.l, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89413d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9410a0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89414e = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9410a0(dVar, this.f89414e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ru.ozon.android.messenger.framework.presentation.models.l lVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9410a0) create(lVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ae.C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89413d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f89414e.f89523z;
            Y.c cVar = Y.c.f89406a;
            this.f89413d = 1;
            if (c02.emit(cVar, this) == aVar) {
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
