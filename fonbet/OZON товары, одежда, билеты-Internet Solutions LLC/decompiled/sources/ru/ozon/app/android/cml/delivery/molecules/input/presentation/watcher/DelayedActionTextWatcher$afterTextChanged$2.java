package ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher;

import Sc.s;
import Wc.a;
import android.text.Editable;
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
@e(c = "ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.DelayedActionTextWatcher$afterTextChanged$2", f = "DelayedActionTextWatcher.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DelayedActionTextWatcher$afterTextChanged$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $action;
    final /* synthetic */ Editable $input;
    int label;
    final /* synthetic */ DelayedActionTextWatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DelayedActionTextWatcher$afterTextChanged$2(DelayedActionTextWatcher delayedActionTextWatcher, Function1<? super String, Unit> function1, Editable editable, d<? super DelayedActionTextWatcher$afterTextChanged$2> dVar) {
        super(2, dVar);
        this.this$0 = delayedActionTextWatcher;
        this.$action = function1;
        this.$input = editable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DelayedActionTextWatcher$afterTextChanged$2(this.this$0, this.$action, this.$input, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long debounce = this.this$0.getDebounce();
            this.label = 1;
            if (Y.b(debounce, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.$action.invoke(this.$input.toString());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DelayedActionTextWatcher$afterTextChanged$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
