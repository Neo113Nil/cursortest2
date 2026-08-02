package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.AiMessageActionsRootKt$AiMessageActionsRoot$1$1", f = "AiMessageActionsRoot.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f83978d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f83979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(h hVar, f fVar, kotlin.coroutines.d<? super a> dVar) {
        super(2, dVar);
        this.f83978d = hVar;
        this.f83979e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f83978d, this.f83979e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f83978d.k0(this.f83979e);
        return Unit.f71690a;
    }
}
