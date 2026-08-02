package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$handleAction$4$1", f = "AiAssistantViewModel.kt", l = {522}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9428j0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89626d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89627e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89628f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9428j0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9428j0> dVar) {
        super(2, dVar);
        this.f89627e = c9414c0;
        this.f89628f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9428j0(this.f89627e, this.f89628f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9428j0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89626d;
        C9414c0 c9414c0 = this.f89627e;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                aVar = c9414c0.f89502e;
                ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f89628f;
                this.f89626d = 1;
                obj = ((C9351a) aVar).p(aVar3, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            c9414c0.N0().d();
            return Unit.f71690a;
        } catch (Throwable th2) {
            c9414c0.N0().d();
            throw th2;
        }
    }
}
