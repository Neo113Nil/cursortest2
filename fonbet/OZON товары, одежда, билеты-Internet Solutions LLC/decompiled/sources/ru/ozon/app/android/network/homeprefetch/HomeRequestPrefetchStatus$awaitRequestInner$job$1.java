package ru.ozon.app.android.network.homeprefetch;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "Lru/ozon/app/android/network/homeprefetch/HomeRequestStatus;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.network.homeprefetch.HomeRequestPrefetchStatus$awaitRequestInner$job$1", f = "HomeRequestPrefetchStatus.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HomeRequestPrefetchStatus$awaitRequestInner$job$1 extends j implements Function2<InterfaceC2397i<? super HomeRequestStatus>, d<? super Unit>, Object> {
    final /* synthetic */ CountDownLatch $latch;
    int label;
    final /* synthetic */ HomeRequestPrefetchStatus this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeRequestPrefetchStatus$awaitRequestInner$job$1(HomeRequestPrefetchStatus homeRequestPrefetchStatus, CountDownLatch countDownLatch, d<? super HomeRequestPrefetchStatus$awaitRequestInner$job$1> dVar) {
        super(2, dVar);
        this.this$0 = homeRequestPrefetchStatus;
        this.$latch = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HomeRequestPrefetchStatus$awaitRequestInner$job$1(this.this$0, this.$latch, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super HomeRequestStatus> interfaceC2397i, d<? super Unit> dVar) {
        return ((HomeRequestPrefetchStatus$awaitRequestInner$job$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean isCurrentlyCompletedOrEmpty;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        isCurrentlyCompletedOrEmpty = this.this$0.isCurrentlyCompletedOrEmpty();
        if (isCurrentlyCompletedOrEmpty) {
            this.$latch.countDown();
        }
        return Unit.f71690a;
    }
}
