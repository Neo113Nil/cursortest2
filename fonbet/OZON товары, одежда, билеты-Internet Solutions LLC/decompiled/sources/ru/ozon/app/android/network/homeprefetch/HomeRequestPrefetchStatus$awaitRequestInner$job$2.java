package ru.ozon.app.android.network.homeprefetch;

import Sc.s;
import Wc.a;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/network/homeprefetch/HomeRequestStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.network.homeprefetch.HomeRequestPrefetchStatus$awaitRequestInner$job$2", f = "HomeRequestPrefetchStatus.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HomeRequestPrefetchStatus$awaitRequestInner$job$2 extends j implements Function2<HomeRequestStatus, d<? super Unit>, Object> {
    final /* synthetic */ CountDownLatch $latch;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeRequestPrefetchStatus$awaitRequestInner$job$2(CountDownLatch countDownLatch, d<? super HomeRequestPrefetchStatus$awaitRequestInner$job$2> dVar) {
        super(2, dVar);
        this.$latch = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HomeRequestPrefetchStatus$awaitRequestInner$job$2 homeRequestPrefetchStatus$awaitRequestInner$job$2 = new HomeRequestPrefetchStatus$awaitRequestInner$job$2(this.$latch, dVar);
        homeRequestPrefetchStatus$awaitRequestInner$job$2.L$0 = obj;
        return homeRequestPrefetchStatus$awaitRequestInner$job$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((HomeRequestStatus) this.L$0) != HomeRequestStatus.PROGRESS) {
            this.$latch.countDown();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HomeRequestStatus homeRequestStatus, d<? super Unit> dVar) {
        return ((HomeRequestPrefetchStatus$awaitRequestInner$job$2) create(homeRequestStatus, dVar)).invokeSuspend(Unit.f71690a);
    }
}
