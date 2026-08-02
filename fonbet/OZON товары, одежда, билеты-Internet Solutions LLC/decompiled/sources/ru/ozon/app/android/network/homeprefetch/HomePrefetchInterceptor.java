package ru.ozon.app.android.network.homeprefetch;

import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.utils.RequestsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/network/homeprefetch/HomePrefetchInterceptor;", "LWe/B;", "Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;", "prefetchHomePageFacade", "<init>", "(Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;)V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomePrefetchInterceptor implements B {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static volatile boolean isPrefetchCalled;

    @NotNull
    private final PrefetchHomePageFacade prefetchHomePageFacade;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/network/homeprefetch/HomePrefetchInterceptor$Companion;", "", "<init>", "()V", "isPrefetchCalled", "", "HOME_LINK", "", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HomePrefetchInterceptor(@NotNull PrefetchHomePageFacade prefetchHomePageFacade) {
        Intrinsics.checkNotNullParameter(prefetchHomePageFacade, "prefetchHomePageFacade");
        this.prefetchHomePageFacade = prefetchHomePageFacade;
    }

    @Override // We.B
    @NotNull
    public L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        if (!this.prefetchHomePageFacade.joinRequests() || !Intrinsics.d(request.j().o(), "url=/home")) {
            return chain.proceed(request);
        }
        boolean isPrefetch = RequestsKt.isPrefetch(request);
        if (isPrefetch && !isPrefetchCalled) {
            isPrefetchCalled = true;
            return chain.proceed(request);
        }
        if (isPrefetch || !isPrefetchCalled) {
            return chain.proceed(request);
        }
        this.prefetchHomePageFacade.awaitRequestEnd();
        isPrefetchCalled = false;
        return chain.proceed(request);
    }
}
