package ru.ozon.app.android.network.homeprefetch;

import He.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.join.RequestsJoinEnabledFlag;
import xe.C10720e0;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/homeprefetch/HomeRequestPrefetchStatus;", "homeRequestPrefetchStatus", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/homeprefetch/HomeRequestPrefetchStatus;)V", "", "isHomePrefetchEnabled", "()Z", "isPlatformRequestsJoinEnabled", "joinRequests", "shouldNotCallPrefetch", "", "setIsHomePrefetched", "()V", "setStarting", "setCompleted", "awaitRequestEnd", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/homeprefetch/HomeRequestPrefetchStatus;", "Lxe/M;", "scope", "Lxe/M;", "getScope", "()Lxe/M;", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrefetchHomePageFacade {
    private static boolean isHomePrefetched;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final HomeRequestPrefetchStatus homeRequestPrefetchStatus;

    @NotNull
    private final M scope;

    public PrefetchHomePageFacade(@NotNull FeatureService featureService, @NotNull HomeRequestPrefetchStatus homeRequestPrefetchStatus) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(homeRequestPrefetchStatus, "homeRequestPrefetchStatus");
        this.featureService = featureService;
        this.homeRequestPrefetchStatus = homeRequestPrefetchStatus;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b);
    }

    private final boolean isHomePrefetchEnabled() {
        return this.featureService.getBooleanKey(HomePrefetchFlag.INSTANCE);
    }

    private final boolean isPlatformRequestsJoinEnabled() {
        return this.featureService.getBooleanKey(RequestsJoinEnabledFlag.INSTANCE);
    }

    public final void awaitRequestEnd() {
        this.homeRequestPrefetchStatus.awaitRequestEnd();
    }

    @NotNull
    public final M getScope() {
        return this.scope;
    }

    public final boolean joinRequests() {
        return isHomePrefetchEnabled() && !isPlatformRequestsJoinEnabled();
    }

    public final void setCompleted() {
        this.homeRequestPrefetchStatus.setCompleted();
        setIsHomePrefetched();
    }

    public final void setIsHomePrefetched() {
        isHomePrefetched = true;
    }

    public final void setStarting() {
        this.homeRequestPrefetchStatus.setStarting();
    }

    public final boolean shouldNotCallPrefetch() {
        return !isHomePrefetchEnabled() || isHomePrefetched;
    }
}
