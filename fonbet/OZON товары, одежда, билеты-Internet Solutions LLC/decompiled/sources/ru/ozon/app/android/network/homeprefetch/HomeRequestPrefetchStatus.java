package ru.ozon.app.android.network.homeprefetch;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.O0;
import Ae.x0;
import He.b;
import I0.C3173b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.network.abtool.FeatureService;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/network/homeprefetch/HomeRequestPrefetchStatus;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "awaitRequestInner", "()V", "", "isCurrentlyCompletedOrEmpty", "()Z", "setStarting", "setCompleted", "awaitRequestEnd", "Lru/ozon/app/android/network/abtool/FeatureService;", "LAe/x0;", "Lru/ozon/app/android/network/homeprefetch/HomeRequestStatus;", "requestStatus", "LAe/x0;", "Lxe/M;", "scope", "Lxe/M;", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeRequestPrefetchStatus {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final x0<HomeRequestStatus> requestStatus;

    @NotNull
    private final M scope;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/network/homeprefetch/HomeRequestPrefetchStatus$Companion;", "", "<init>", "()V", "TOTAL_PERCENT_FOR_LOGGING", "", "AWAIT_TIME_LOG", "", "SPAM_LIMIT_TIME_IN_MILLS", "AWAIT_TIMEOUT", "", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HomeRequestPrefetchStatus(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
        this.requestStatus = O0.a(HomeRequestStatus.EMPTY);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b);
    }

    private final void awaitRequestInner() {
        if (isCurrentlyCompletedOrEmpty()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        B0 C11 = C2399j.C(new C2408n0(C2399j.G(this.requestStatus, new HomeRequestPrefetchStatus$awaitRequestInner$job$1(this, countDownLatch, null)), new HomeRequestPrefetchStatus$awaitRequestInner$job$2(countDownLatch, null)), this.scope);
        countDownLatch.await(20L, TimeUnit.SECONDS);
        ((H0) C11).j(null);
        this.requestStatus.tryEmit(HomeRequestStatus.EMPTY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentlyCompletedOrEmpty() {
        return this.requestStatus.getValue() != HomeRequestStatus.PROGRESS;
    }

    public final void awaitRequestEnd() {
        int intKey = this.featureService.getIntKey(HomePrefetchFlagLogging.INSTANCE);
        if (intKey < 1 || intKey < new e(0).d()) {
            awaitRequestInner();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        awaitRequestInner();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            LoggerExtKt.sendNonFatal$default(null, C3173b.b(currentTimeMillis2, "Await time for main home request in mills "), "HomePrefetchAwaitTime", null, 9, null);
        }
    }

    public final void setCompleted() {
        this.requestStatus.tryEmit(HomeRequestStatus.COMPLETED);
    }

    public final void setStarting() {
        this.requestStatus.tryEmit(HomeRequestStatus.PROGRESS);
    }
}
