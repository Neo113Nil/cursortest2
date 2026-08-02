package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.MultipleDebounceHandler$handle$1", f = "MultipleDebounceHandler.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class MultipleDebounceHandler$handle$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ T $param;
    int label;
    final /* synthetic */ MultipleDebounceHandler<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleDebounceHandler$handle$1(MultipleDebounceHandler<T> multipleDebounceHandler, T t2, d<? super MultipleDebounceHandler$handle$1> dVar) {
        super(2, dVar);
        this.this$0 = multipleDebounceHandler;
        this.$param = t2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MultipleDebounceHandler$handle$1(this.this$0, this.$param, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j11;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = ((MultipleDebounceHandler) this.this$0).debounce;
            this.label = 1;
            if (Y.b(j11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        function1 = ((MultipleDebounceHandler) this.this$0).onHandle;
        function1.invoke(this.$param);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MultipleDebounceHandler$handle$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
