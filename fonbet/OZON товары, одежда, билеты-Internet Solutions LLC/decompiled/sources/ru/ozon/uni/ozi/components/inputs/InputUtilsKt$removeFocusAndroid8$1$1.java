package ru.ozon.uni.ozi.components.inputs;

import Sc.s;
import Wc.a;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.uni.ozi.components.inputs.InputUtilsKt$removeFocusAndroid8$1$1", f = "InputUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InputUtilsKt$removeFocusAndroid8$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ r $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputUtilsKt$removeFocusAndroid8$1$1(r rVar, d<? super InputUtilsKt$removeFocusAndroid8$1$1> dVar) {
        super(2, dVar);
        this.$focusRequester = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InputUtilsKt$removeFocusAndroid8$1$1(this.$focusRequester, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$focusRequester.d();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InputUtilsKt$removeFocusAndroid8$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
