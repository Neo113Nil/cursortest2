package ru.ozon.app.android.account.subscription;

import Mc.a;
import Nc.C3667a;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.subscription.SubscriptionServiceImpl;
import vc.n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00110\u00110\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/subscription/SubscriptionServiceImpl;", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "Lru/ozon/app/android/account/subscription/SubscriptionApi;", "subscriptionApi", "<init>", "(Lru/ozon/app/android/account/subscription/SubscriptionApi;)V", "", "sku", "Lio/reactivex/b;", "subscribeToItemAvailabilityChange", "(J)Lio/reactivex/b;", "unsubscribeFromItemAvailabilityChange", "", "unsubscribeProduct", "(J)V", "Lru/ozon/app/android/account/subscription/SubscriptionApi;", "Lio/reactivex/p;", "Lru/ozon/app/android/account/subscription/SubscriptionEvent;", "onSubscriptionChange", "Lio/reactivex/p;", "getOnSubscriptionChange", "()Lio/reactivex/p;", "LNc/a;", "kotlin.jvm.PlatformType", "_onSubscriptionChange", "LNc/a;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionServiceImpl implements SubscriptionService {

    @NotNull
    private final C3667a<SubscriptionEvent> _onSubscriptionChange;

    @NotNull
    private final p<SubscriptionEvent> onSubscriptionChange;

    @NotNull
    private final SubscriptionApi subscriptionApi;

    public SubscriptionServiceImpl(@NotNull SubscriptionApi subscriptionApi) {
        Intrinsics.checkNotNullParameter(subscriptionApi, "subscriptionApi");
        this.subscriptionApi = subscriptionApi;
        C3667a<SubscriptionEvent> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this._onSubscriptionChange = d11;
        this.onSubscriptionChange = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToItemAvailabilityChange$lambda$2(SubscriptionServiceImpl subscriptionServiceImpl, long j11) {
        subscriptionServiceImpl._onSubscriptionChange.onNext(new AvailabilitySubscriptionAdd(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unsubscribeFromItemAvailabilityChange$lambda$3(SubscriptionServiceImpl subscriptionServiceImpl, long j11) {
        subscriptionServiceImpl._onSubscriptionChange.onNext(new AvailabilitySubscriptionRemove(j11));
    }

    @Override // ru.ozon.app.android.account.subscription.SubscriptionService
    @NotNull
    public AbstractC7094b subscribeToItemAvailabilityChange(final long sku) {
        n d11 = this.subscriptionApi.subscribeToItemAvailabilityChange(new SubscribeRequest(C7714v.a0(Long.valueOf(sku)))).k(a.b()).d(new InterfaceC9019a() { // from class: ml.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                SubscriptionServiceImpl.subscribeToItemAvailabilityChange$lambda$2(SubscriptionServiceImpl.this, sku);
            }
        });
        Intrinsics.checkNotNullExpressionValue(d11, "doOnComplete(...)");
        return d11;
    }

    @Override // ru.ozon.app.android.account.subscription.SubscriptionService
    @NotNull
    public AbstractC7094b unsubscribeFromItemAvailabilityChange(final long sku) {
        n d11 = this.subscriptionApi.unsubscribeFromItemAvailabilityChange(new SubscribeRequest(C7714v.a0(Long.valueOf(sku)))).k(a.b()).d(new InterfaceC9019a() { // from class: ml.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                SubscriptionServiceImpl.unsubscribeFromItemAvailabilityChange$lambda$3(SubscriptionServiceImpl.this, sku);
            }
        });
        Intrinsics.checkNotNullExpressionValue(d11, "doOnComplete(...)");
        return d11;
    }

    @Override // ru.ozon.app.android.account.subscription.SubscriptionService
    public void unsubscribeProduct(long sku) {
        this._onSubscriptionChange.onNext(new PriceSubscriptionRemove(sku));
        this._onSubscriptionChange.onNext(new AvailabilitySubscriptionRemove(sku));
    }
}
