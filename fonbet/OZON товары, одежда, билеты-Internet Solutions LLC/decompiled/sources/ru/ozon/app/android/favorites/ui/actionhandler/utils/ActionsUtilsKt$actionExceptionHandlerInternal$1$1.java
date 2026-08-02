package ru.ozon.app.android.favorites.ui.actionhandler.utils;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.utils.ActionsUtilsKt$actionExceptionHandlerInternal$1$1", f = "ActionsUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ActionsUtilsKt$actionExceptionHandlerInternal$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionsUtilsKt$actionExceptionHandlerInternal$1$1(CustomActionHandler.HandlerReferences handlerReferences, d<? super ActionsUtilsKt$actionExceptionHandlerInternal$1$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActionsUtilsKt$actionExceptionHandlerInternal$1$1(this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ActionsUtilsKt.hideModalIfNeed(this.$handlerRefs);
        ActionsUtilsKt.showError(this.$handlerRefs);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActionsUtilsKt$actionExceptionHandlerInternal$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
