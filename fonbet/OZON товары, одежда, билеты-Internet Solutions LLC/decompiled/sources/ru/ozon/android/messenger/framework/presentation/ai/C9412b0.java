package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$3", f = "AiAssistantViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9412b0 extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.blocks.ai.input.data.a, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f89417d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9412b0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89418e = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9412b0 c9412b0 = new C9412b0(dVar, this.f89418e);
        c9412b0.f89417d = obj;
        return c9412b0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ru.ozon.android.messenger.blocks.ai.input.data.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9412b0) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ru.ozon.android.messenger.blocks.ai.input.data.a aVar2 = (ru.ozon.android.messenger.blocks.ai.input.data.a) this.f89417d;
        if (aVar2 == ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT || aVar2 == ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT_EMPTY) {
            this.f89418e.N0().d();
        }
        return Unit.f71690a;
    }
}
