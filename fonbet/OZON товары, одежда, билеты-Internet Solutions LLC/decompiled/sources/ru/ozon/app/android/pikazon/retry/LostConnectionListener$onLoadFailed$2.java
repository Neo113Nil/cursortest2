package ru.ozon.app.android.pikazon.retry;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import rj.AbstractC9286a;
import ru.ozon.app.android.pikazon.retry.utils.RetriesLogKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrj/a;", "it", "", "<anonymous>", "(Lrj/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pikazon.retry.LostConnectionListener$onLoadFailed$2", f = "LostConnectionListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LostConnectionListener$onLoadFailed$2 extends j implements Function2<AbstractC9286a, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ LostConnectionListener<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LostConnectionListener$onLoadFailed$2(LostConnectionListener<R> lostConnectionListener, d<? super LostConnectionListener$onLoadFailed$2> dVar) {
        super(2, dVar);
        this.this$0 = lostConnectionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LostConnectionListener$onLoadFailed$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        LostConnectionListener<R> lostConnectionListener = this.this$0;
        RetriesLogKt.retriesLog("Internet appeared in " + lostConnectionListener + ". Current retry count: " + lostConnectionListener.getRetryCount() + ". Retrying request with retry count: " + (this.this$0.getRetryCount() + 1));
        LostConnectionListener<R> lostConnectionListener2 = this.this$0;
        ((LostConnectionListener) lostConnectionListener2).retryCount = lostConnectionListener2.getRetryCount() + 1;
        this.this$0.getRetryCount();
        function0 = ((LostConnectionListener) this.this$0).retryRequest;
        function0.invoke();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC9286a abstractC9286a, d<? super Unit> dVar) {
        return ((LostConnectionListener$onLoadFailed$2) create(abstractC9286a, dVar)).invokeSuspend(Unit.f71690a);
    }
}
