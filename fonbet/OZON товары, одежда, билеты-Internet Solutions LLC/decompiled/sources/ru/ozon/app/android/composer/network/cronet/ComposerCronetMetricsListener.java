package ru.ozon.app.android.composer.network.cronet;

import Ja.h;
import Ja.i;
import Ka.b;
import Ma.a;
import Ma.d;
import Qj0.C3883c;
import Qj0.C3889i;
import Qj0.InterfaceC3888h;
import Qj0.Q;
import Qj0.U;
import Sc.InterfaceC4008j;
import Sc.k;
import ei0.InterfaceC6369b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetRequestIdKey;
import ru.ozon.app.android.network.cronet.metrics.BaseCronetMetricsListener;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/composer/network/cronet/ComposerCronetMetricsListener;", "Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;", "Lqj/a;", "networkInfoProvider", "Lei0/b;", "ozonTracker", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LQj0/h;", "eventListenerInterceptor", "Lru/ozon/app/android/network/cronet/CronetConfig;", "cronetConfig", "<init>", "(Lqj/a;Lei0/b;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LQj0/h;Lru/ozon/app/android/network/cronet/CronetConfig;)V", "LJa/i;", "LQj0/i;", "meta", "(LJa/i;)LQj0/i;", "LQj0/U;", "LJa/h;", "protocol", "", "putMetric", "(LQj0/U;LJa/h;)V", "LMa/d;", "responseMeta", "putMetrics", "(LQj0/U;LMa/d;)V", "LMa/a;", "metricsTiming", "putTimingMetrics", "(LQj0/U;LMa/a;)V", "putConnectionMetrics", "", "toNanos", "(J)J", "LMa/b;", "metrics", "request", "response", "onMetricsCollected", "(LMa/b;LJa/i;LMa/d;)V", "Lqj/a;", "Lei0/b;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LQj0/h;", "Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingParser$delegate", "LSc/j;", "getServerTimingParser", "()Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingParser", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerCronetMetricsListener extends BaseCronetMetricsListener {

    @NotNull
    private final InterfaceC3888h eventListenerInterceptor;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    /* renamed from: serverTimingParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j serverTimingParser;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.QUIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerCronetMetricsListener(@NotNull C9067a networkInfoProvider, @NotNull InterfaceC6369b ozonTracker, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull InterfaceC3888h eventListenerInterceptor, @NotNull CronetConfig cronetConfig) {
        super(cronetConfig.getCronetMetricsKey());
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(eventListenerInterceptor, "eventListenerInterceptor");
        Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
        this.networkInfoProvider = networkInfoProvider;
        this.ozonTracker = ozonTracker;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.eventListenerInterceptor = eventListenerInterceptor;
        this.serverTimingParser = k.b(ComposerCronetMetricsListener$serverTimingParser$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ServerTimingsParser getServerTimingParser() {
        return (ServerTimingsParser) this.serverTimingParser.getValue();
    }

    private final C3889i meta(i iVar) {
        String k11 = iVar.k();
        String str = (String) iVar.h(CronetRequestIdKey.INSTANCE);
        if (str == null) {
            str = iVar.k();
        }
        Map<String, List<String>> e11 = iVar.e();
        String b11 = iVar.g().b();
        b a11 = iVar.a();
        if (a11 != null) {
            a11.b();
        }
        return new C3889i(k11, str, e11, b11);
    }

    private final void putConnectionMetrics(U u11, a aVar) {
        U.p(u11, MetricType.DNS_TIME_START, toNanos(aVar.d()), false, 4);
        U.p(u11, MetricType.DNS_TIME_END, toNanos(aVar.c()), false, 4);
        U.p(u11, MetricType.TLS_TIME_START, toNanos(aVar.j()), false, 4);
        U.p(u11, MetricType.TLS_TIME_END, toNanos(aVar.i()), false, 4);
        U.p(u11, MetricType.TCP_TIME_START, toNanos(aVar.b()), false, 4);
        U.p(u11, MetricType.TCP_TIME_END, toNanos(aVar.a()), false, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putMetric(U u11, h hVar) {
        long j11;
        int i11 = WhenMappings.$EnumSwitchMapping$0[hVar.ordinal()];
        if (i11 == 1) {
            j11 = 0;
        } else if (i11 == 2) {
            j11 = 1;
        } else if (i11 == 3) {
            j11 = 3;
        } else if (i11 != 4) {
            return;
        } else {
            j11 = 2;
        }
        U.p(u11, MetricType.PROTOCOL_VERSION, j11, false, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putMetrics(U u11, d dVar) {
        U u12;
        Long a11 = dVar.a();
        long longValue = a11 != null ? a11.longValue() : 0L;
        if (longValue > 0) {
            U.p(u11, MetricType.ENCODED_SIZE, longValue, false, 4);
            u12 = u11;
            U.p(u12, MetricType.TRANSFER_SIZE, dVar.e(), false, 4);
        } else {
            u12 = u11;
        }
        String b11 = dVar.b();
        Q q11 = new Q(dVar.f());
        int i11 = U.f23535i;
        u12.n(q11, true);
        if (b11 != null) {
            u12.n(new C3883c(b11), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putTimingMetrics(U u11, a aVar) {
        if (!aVar.h()) {
            putConnectionMetrics(u11, aVar);
        }
        U.p(u11, MetricType.RESPONSE_TIME_START, toNanos(aVar.g()), false, 4);
        U.p(u11, MetricType.RESPONSE_TIME_END, toNanos(aVar.f()), false, 4);
        U.p(u11, MetricType.TIME_TO_FIRST_BYTE_START, toNanos(aVar.l()), false, 4);
        U.p(u11, MetricType.TIME_TO_FIRST_BYTE_END, toNanos(aVar.k()), false, 4);
        U.p(u11, MetricType.TIME_TO_LAST_BYTE_START, toNanos(aVar.n()), false, 4);
        U.p(u11, MetricType.TIME_TO_LAST_BYTE_END, toNanos(aVar.m()), false, 4);
        U.p(u11, MetricType.SERVER_TIME_START, toNanos(aVar.e()), false, 4);
        U.p(u11, MetricType.SERVER_TIME_END, toNanos(aVar.g()), false, 4);
    }

    private final long toNanos(long j11) {
        return System.nanoTime() - ((System.currentTimeMillis() - j11) * 1000000);
    }

    @Override // Ma.c
    public void onMetricsCollected(@NotNull Ma.b metrics, @NotNull i request, d response) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(request, "request");
        if (response != null && this.ozonTracker.i()) {
            C3889i meta = meta(request);
            if (this.eventListenerInterceptor.intercept(meta)) {
                return;
            }
            this.performanceTrackerDelegate.beginTrace(meta.b(), new ComposerCronetMetricsListener$onMetricsCollected$1(meta, this, response, metrics));
        }
    }
}
