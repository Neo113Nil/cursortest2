package ru.ozon.tracker.sendEvent.runner;

import Sc.s;
import Wc.a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.FetchStatus;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "status", "Lru/ozon/app/android/abtool/FetchStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.runner.FastEventDelayTimeProvider$startObserving$1", f = "DelayTimeProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FastEventDelayTimeProvider$startObserving$1 extends j implements Function2<FetchStatus, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FastEventDelayTimeProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FastEventDelayTimeProvider$startObserving$1(FastEventDelayTimeProvider fastEventDelayTimeProvider, d<? super FastEventDelayTimeProvider$startObserving$1> dVar) {
        super(2, dVar);
        this.this$0 = fastEventDelayTimeProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FastEventDelayTimeProvider$startObserving$1 fastEventDelayTimeProvider$startObserving$1 = new FastEventDelayTimeProvider$startObserving$1(this.this$0, dVar);
        fastEventDelayTimeProvider$startObserving$1.L$0 = obj;
        return fastEventDelayTimeProvider$startObserving$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        int delayTimeFromAbTool;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((FetchStatus) this.L$0) instanceof FetchStatus.Succeed) {
            atomicInteger = this.this$0.cache;
            delayTimeFromAbTool = this.this$0.getDelayTimeFromAbTool();
            atomicInteger.set(delayTimeFromAbTool);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FetchStatus fetchStatus, d<? super Unit> dVar) {
        return ((FastEventDelayTimeProvider$startObserving$1) create(fetchStatus, dVar)).invokeSuspend(Unit.f71690a);
    }
}
