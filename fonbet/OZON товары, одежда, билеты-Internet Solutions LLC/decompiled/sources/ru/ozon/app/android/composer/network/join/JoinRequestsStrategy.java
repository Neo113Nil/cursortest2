package ru.ozon.app.android.composer.network.join;

import Ib.a;
import Qj0.InterfaceC3892l;
import Qj0.U;
import Qj0.s0;
import We.B;
import We.C4876s;
import We.G;
import We.InterfaceC4865g;
import We.L;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.network.cache.util.Url;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.network.utils.RequestsKt;
import ru.ozon.tracker.performance.MetricType;
import xe.C10727i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy;", "", "LWe/B$a;", "chain", "LWe/L;", "execute", "(LWe/B$a;)LWe/L;", "Disabled", "Enabled", "Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy$Disabled;", "Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy$Enabled;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface JoinRequestsStrategy {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy$Disabled;", "Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "execute", "(LWe/B$a;)LWe/L;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Disabled implements JoinRequestsStrategy {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        @Override // ru.ozon.app.android.composer.network.join.JoinRequestsStrategy
        @NotNull
        public L execute(@NotNull B.a chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return chain.proceed(chain.request());
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u001c\u0010&\u001a\n #*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001c\u0010)\u001a\n #*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\n #*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy$Enabled;", "Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy;", "LIb/a;", "LWe/s;", "dispatcherLazy", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "prefetchServiceLazy", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "trackerLazy", "<init>", "(LIb/a;LIb/a;LIb/a;)V", "LWe/g;", "", "await", "(LWe/g;)V", "LWe/G;", "from", "copyTrace", "(LWe/G;LWe/G;)V", "LQj0/U;", "copyNetworkMetrics", "(LQj0/U;LQj0/U;)LQj0/U;", "copyRequestPrepareTime", "LQj0/l;", "type", "copyMetric", "(LQj0/U;LQj0/l;LQj0/U;)LQj0/U;", "trace", "(LWe/G;)LQj0/U;", "LWe/B$a;", "chain", "LWe/L;", "execute", "(LWe/B$a;)LWe/L;", "LIb/a;", "kotlin.jvm.PlatformType", "getDispatcher", "()LWe/s;", "dispatcher", "getPrefetchService", "()Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "prefetchService", "getTracker", "()Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "tracker", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Enabled implements JoinRequestsStrategy {

        @NotNull
        private final a<C4876s> dispatcherLazy;

        @NotNull
        private final a<ComposerPrefetchService> prefetchServiceLazy;

        @NotNull
        private final a<PerformanceTrackerDelegate> trackerLazy;

        public Enabled(@NotNull a<C4876s> dispatcherLazy, @NotNull a<ComposerPrefetchService> prefetchServiceLazy, @NotNull a<PerformanceTrackerDelegate> trackerLazy) {
            Intrinsics.checkNotNullParameter(dispatcherLazy, "dispatcherLazy");
            Intrinsics.checkNotNullParameter(prefetchServiceLazy, "prefetchServiceLazy");
            Intrinsics.checkNotNullParameter(trackerLazy, "trackerLazy");
            this.dispatcherLazy = dispatcherLazy;
            this.prefetchServiceLazy = prefetchServiceLazy;
            this.trackerLazy = trackerLazy;
        }

        private final void await(InterfaceC4865g interfaceC4865g) {
            C10727i.d(g.f71771a, new JoinRequestsStrategy$Enabled$await$1(interfaceC4865g, null));
        }

        private final U copyMetric(U u11, InterfaceC3892l interfaceC3892l, U u12) {
            Long i11 = u12.i(interfaceC3892l);
            U.p(u11, interfaceC3892l, i11 != null ? i11.longValue() : 0L, false, 4);
            return u11;
        }

        private final U copyNetworkMetrics(U u11, U u12) {
            copyMetric(u11, MetricType.DNS_TIME_START, u12);
            copyMetric(u11, MetricType.DNS_TIME_END, u12);
            copyMetric(u11, MetricType.TCP_TIME_START, u12);
            copyMetric(u11, MetricType.TCP_TIME_END, u12);
            copyMetric(u11, MetricType.TLS_TIME_START, u12);
            copyMetric(u11, MetricType.TLS_TIME_END, u12);
            copyMetric(u11, MetricType.SERVER_TIME_START, u12);
            copyMetric(u11, MetricType.SERVER_TIME_END, u12);
            copyMetric(u11, MetricType.RESPONSE_TIME_START, u12);
            copyMetric(u11, MetricType.RESPONSE_TIME_END, u12);
            copyMetric(u11, MetricType.TIME_TO_FIRST_BYTE_START, u12);
            copyMetric(u11, MetricType.TIME_TO_FIRST_BYTE_END, u12);
            copyMetric(u11, MetricType.TIME_TO_LAST_BYTE_START, u12);
            copyMetric(u11, MetricType.TIME_TO_LAST_BYTE_END, u12);
            copyMetric(u11, MetricType.ADDITIONAL_REQUESTS_TIME_START, u12);
            copyMetric(u11, MetricType.ADDITIONAL_REQUESTS_TIME_END, u12);
            copyMetric(u11, MetricType.NETWORK_LB_REDIRECT_TIME_START, u12);
            copyMetric(u11, MetricType.NETWORK_LB_REDIRECT_TIME_END, u12);
            copyMetric(u11, MetricType.NETWORK_ANTIBOT_TIME_START, u12);
            copyMetric(u11, MetricType.NETWORK_ANTIBOT_TIME_END, u12);
            return u11;
        }

        private final U copyRequestPrepareTime(U u11, U u12) {
            copyMetric(u11, MetricType.REQUEST_PREPARE_TIME_START, u12);
            copyMetric(u11, MetricType.REQUEST_PREPARE_TIME_END, u12);
            return u11;
        }

        private final void copyTrace(G g10, G g11) {
            U trace;
            U trace2 = trace(g11);
            if (trace2 == null || (trace = trace(g10)) == null) {
                return;
            }
            copyNetworkMetrics(trace, trace2);
            copyRequestPrepareTime(trace, trace2);
        }

        private final C4876s getDispatcher() {
            return this.dispatcherLazy.get();
        }

        private final ComposerPrefetchService getPrefetchService() {
            return this.prefetchServiceLazy.get();
        }

        private final PerformanceTrackerDelegate getTracker() {
            return this.trackerLazy.get();
        }

        private final U trace(G g10) {
            String a11 = s0.a(g10);
            if (getTracker().hasTrace(a11)) {
                return getTracker().beginTrace(a11);
            }
            return null;
        }

        @Override // ru.ozon.app.android.composer.network.join.JoinRequestsStrategy
        @NotNull
        public L execute(@NotNull B.a chain) {
            Object obj;
            Intrinsics.checkNotNullParameter(chain, "chain");
            G request = chain.request();
            if (RequestsKt.isPrefetch(request)) {
                return chain.proceed(request);
            }
            List<InterfaceC4865g> g10 = getDispatcher().g();
            InterfaceC4865g call = chain.call();
            Iterator<T> it = g10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                InterfaceC4865g interfaceC4865g = (InterfaceC4865g) obj;
                if (interfaceC4865g != call) {
                    G request2 = interfaceC4865g.request();
                    if (Intrinsics.d(request2.j(), request.j()) && RequestsKt.isPrefetch(request2)) {
                        break;
                    }
                }
            }
            InterfaceC4865g interfaceC4865g2 = (InterfaceC4865g) obj;
            if (interfaceC4865g2 == null) {
                return chain.proceed(request);
            }
            if (getPrefetchService().mo670shouldJoinRequestzMoF2ac(Url.m664constructorimpl(request.j()), ru.ozon.app.android.composer.network.util.RequestsKt.cacheGroup(request))) {
                await(interfaceC4865g2);
            }
            L proceed = chain.proceed(request);
            if (proceed.x() == null) {
                copyTrace(request, interfaceC4865g2.request());
            }
            return proceed;
        }
    }

    @NotNull
    L execute(@NotNull B.a chain);
}
