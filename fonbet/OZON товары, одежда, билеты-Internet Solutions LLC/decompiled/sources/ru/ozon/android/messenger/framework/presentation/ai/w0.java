package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.navigation.controller.d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$observeMessengerEvents$1$1$1$1", f = "AiAssistantViewModel.kt", l = {331}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class w0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89692d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89693e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f89694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.controller.d dVar, kotlin.coroutines.d<? super w0> dVar2) {
        super(2, dVar2);
        this.f89693e = c9414c0;
        this.f89694f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new w0(this.f89693e, this.f89694f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((w0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89692d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar2 = this.f89693e.f89506i;
            d.q qVar = (d.q) this.f89694f;
            this.f89692d = 1;
            if (aVar2.u(qVar, this) == aVar) {
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
