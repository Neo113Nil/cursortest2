package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data;

import He.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepositoryImpl;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepository;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscriptionApi;", "subscriptionApi", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscriptionApi;)V", "", "productId", "Lru/ozon/app/android/utils/Result;", "", "subscribeToItemAvailabilityChange", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "unsubscribeFromItemAvailabilityChange", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscriptionApi;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshSubscribeRepositoryImpl implements FreshSubscribeRepository {

    @NotNull
    private final FreshSubscriptionApi subscriptionApi;

    public FreshSubscribeRepositoryImpl(@NotNull FreshSubscriptionApi subscriptionApi) {
        Intrinsics.checkNotNullParameter(subscriptionApi, "subscriptionApi");
        this.subscriptionApi = subscriptionApi;
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.FreshSubscribeRepository
    public Object subscribeToItemAvailabilityChange(long j11, @NotNull d<? super Result<Unit>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new FreshSubscribeRepositoryImpl$subscribeToItemAvailabilityChange$$inlined$runCatchingWithDispatchers$default$1(this, null, j11), dVar);
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.FreshSubscribeRepository
    public Object unsubscribeFromItemAvailabilityChange(long j11, @NotNull d<? super Result<Unit>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new FreshSubscribeRepositoryImpl$unsubscribeFromItemAvailabilityChange$$inlined$runCatchingWithDispatchers$default$1(this, null, j11), dVar);
    }
}
