package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.x;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.FastAnswerTemplateEditorContentKt$FastAnswerTemplateEditorContent$1$1$1", f = "FastAnswerTemplateEditorContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class n extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<x, Unit> f86914d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f86915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    n(Function1<? super x, Unit> function1, t tVar, kotlin.coroutines.d<? super n> dVar) {
        super(2, dVar);
        this.f86914d = function1;
        this.f86915e = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new n(this.f86914d, this.f86915e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f86914d.invoke(new x.a(this.f86915e.b()));
        return Unit.f71690a;
    }
}
