package ru.ozon.app.android.returns.ui.utils;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.returns.ui.utils.KeyboardScrollToTargetHelper$createJob$1", f = "KeyboardScrollToTargetHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class KeyboardScrollToTargetHelper$createJob$1 extends j implements Function2<Long, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ KeyboardScrollToTargetHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KeyboardScrollToTargetHelper$createJob$1(KeyboardScrollToTargetHelper keyboardScrollToTargetHelper, d<? super KeyboardScrollToTargetHelper$createJob$1> dVar) {
        super(2, dVar);
        this.this$0 = keyboardScrollToTargetHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new KeyboardScrollToTargetHelper$createJob$1(this.this$0, dVar);
    }

    public final Object invoke(long j11, d<? super Unit> dVar) {
        return ((KeyboardScrollToTargetHelper$createJob$1) create(Long.valueOf(j11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.scrollToTarget();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l11, d<? super Unit> dVar) {
        return invoke(l11.longValue(), dVar);
    }
}
