package ru.ozon.app.android.metrics.client;

import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.C3899t;
import Qj0.C3900u;
import Qj0.D;
import Qj0.F;
import Qj0.H;
import Qj0.U;
import Qj0.r0;
import Qj0.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sg.a;
import We.C;
import We.E;
import We.G;
import We.K;
import We.L;
import We.M;
import We.z;
import android.app.Application;
import android.net.Uri;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.metrics.client.MetricsRequestData;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.network.interceptors.LongPollingTag;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001ABE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\b\b\u0000\u0010 *\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0018\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u001b\u00102\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u0010\u0003\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00105R\u0016\u00107\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010@\u001a\n =*\u0004\u0018\u00010<0<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsClientImpl;", "Lru/ozon/app/android/metrics/client/MetricsClient;", "LWe/E;", "client", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "gncOkHttpClientBuilder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Landroid/app/Application;", "application", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkConfig", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(LWe/E;Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;Lru/ozon/app/android/network/abtool/FeatureChecker;Landroid/app/Application;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/network/di/NetworkComponentConfig;LSg/a;)V", "LQj0/U;", "", "putPageInfo", "(LQj0/U;)V", "Lru/ozon/tracker/performance/ServerTimingsParser;", "LWe/z;", "headers", "", "getRequestId", "(Lru/ozon/tracker/performance/ServerTimingsParser;LWe/z;)Ljava/lang/String;", "modify", "(LWe/E;)LWe/E;", "", "R", "Lru/ozon/app/android/metrics/client/MetricsRequestData;", "requestData", "", "isLongPolling", "Lru/ozon/app/android/metrics/client/MetricsResponseParser;", "parser", "Lru/ozon/app/android/metrics/client/MetricsResponse;", "call", "(Lru/ozon/app/android/metrics/client/MetricsRequestData;ZLru/ozon/app/android/metrics/client/MetricsResponseParser;)Lru/ozon/app/android/metrics/client/MetricsResponse;", "Landroid/app/Application;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "LSg/a;", "requestIdParser$delegate", "LSc/j;", "getRequestIdParser", "()Lru/ozon/tracker/performance/ServerTimingsParser;", "requestIdParser", "client$delegate", "getClient", "()LWe/E;", "LWe/C;", "contentType", "LWe/C;", "LWe/K;", "emptyRequestBody", "LWe/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getBaseUrl", "()Landroid/net/Uri;", "baseUrl", "Companion", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MetricsClientImpl implements MetricsClient {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final Application application;

    /* renamed from: client$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j client;
    private final C contentType;

    @NotNull
    private final K emptyRequestBody;

    @NotNull
    private final NetworkComponentConfig networkConfig;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    /* renamed from: requestIdParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j requestIdParser;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsClientImpl$Companion;", "", "<init>", "()V", "JSON_CONTENT_TYPE", "", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MetricsRequestData.RequestType.values().length];
            try {
                iArr[MetricsRequestData.RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetricsRequestData.RequestType.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MetricsClientImpl(@NotNull E client, @NotNull GncOkHttpClientBuilder gncOkHttpClientBuilder, @NotNull FeatureChecker featureChecker, @NotNull Application application, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull NetworkComponentConfig networkConfig, @NotNull a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(gncOkHttpClientBuilder, "gncOkHttpClientBuilder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.application = application;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.networkConfig = networkConfig;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.requestIdParser = k.b(MetricsClientImpl$requestIdParser$2.INSTANCE);
        this.client = k.b(new MetricsClientImpl$client$2(featureChecker, gncOkHttpClientBuilder, this, client));
        C.f33536g.getClass();
        C b11 = C.a.b("application/json");
        this.contentType = b11;
        this.emptyRequestBody = K.Companion.d(K.INSTANCE, new byte[0], b11, 0, 6);
        analyticsScreenStorage.c();
    }

    private final Uri getBaseUrl() {
        return Uri.parse(this.networkConfig.getApiUrl());
    }

    private final E getClient() {
        return (E) this.client.getValue();
    }

    private final String getRequestId(ServerTimingsParser serverTimingsParser, z zVar) {
        String c11 = zVar.c("server-timing");
        if (c11 == null) {
            c11 = "";
        }
        ServerTimingsParser.ServerTimeKeys serverTimeKeys = ServerTimingsParser.ServerTimeKeys.REQUEST_ID;
        serverTimingsParser.getClass();
        String a11 = ServerTimingsParser.a(c11, serverTimeKeys);
        return a11 == null ? "" : a11;
    }

    private final ServerTimingsParser getRequestIdParser() {
        return (ServerTimingsParser) this.requestIdParser.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E modify(E e11) {
        e11.getClass();
        E.a aVar = new E.a(e11);
        aVar.k(new D(this.application, null));
        aVar.S().add(0, new H());
        return new E(aVar);
    }

    private final void putPageInfo(U u11) {
        Rg.a a11 = this.analyticsScreenStorage.a();
        if (a11 == null) {
            return;
        }
        F f7 = new F(a11.g());
        int i11 = U.f23535i;
        u11.n(f7, true);
        String c11 = a11.c();
        if (c11 != null) {
            u11.n(new C3885e(c11), true);
        }
        String f11 = a11.f();
        if (f11 != null) {
            u11.n(new C3884d(f11), true);
        }
        String d11 = a11.d();
        if (d11 != null) {
            u11.n(new C3899t(d11), true);
        }
        String e11 = a11.e();
        if (e11 != null) {
            u11.n(new C3900u(e11), true);
        }
        String l11 = a11.l();
        if (l11 != null) {
            u11.n(new x0(l11), true);
        }
    }

    @Override // ru.ozon.app.android.metrics.client.MetricsClient
    @NotNull
    public <R> MetricsResponse<R> call(@NotNull MetricsRequestData requestData, boolean isLongPolling, @NotNull MetricsResponseParser<R> parser) {
        K b11;
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(parser, "parser");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        G.a aVar = new G.a();
        Uri.Builder buildUpon = getBaseUrl().buildUpon();
        Intrinsics.checkNotNullExpressionValue(buildUpon, "buildUpon(...)");
        String uri = UriExtKt.appendEndPoint(buildUpon, requestData.getPath()).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        aVar.k(uri);
        int i11 = WhenMappings.$EnumSwitchMapping$0[requestData.getRequestType().ordinal()];
        if (i11 == 1) {
            aVar.f(null, "GET");
        } else {
            if (i11 != 2) {
                throw new o();
            }
            if (requestData.getBody().length() == 0) {
                b11 = this.emptyRequestBody;
            } else {
                K.Companion companion = K.INSTANCE;
                String body = requestData.getBody();
                C c11 = this.contentType;
                companion.getClass();
                b11 = K.Companion.b(body, c11);
            }
            aVar.g(b11);
        }
        for (Map.Entry<String, String> entry : requestData.getHeaders().entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        if (isLongPolling) {
            aVar.i(LongPollingTag.class, LongPollingTag.INSTANCE);
        }
        aVar.i(r0.class, new r0(uuid));
        L execute = getClient().a(aVar.b()).execute();
        try {
            M c12 = execute.c();
            Intrinsics.f(c12);
            if (!execute.v()) {
                throw new HttpException(Response.error(c12, execute));
            }
            long nanoTime = System.nanoTime();
            R parse = parser.parse(c12.string());
            U removeTrace = this.performanceTrackerDelegate.removeTrace(uuid);
            if (removeTrace != null) {
                Qj0.L l11 = new Qj0.L(getRequestId(getRequestIdParser(), execute.r()));
                int i12 = U.f23535i;
                removeTrace.n(l11, true);
                putPageInfo(removeTrace);
                U.p(removeTrace, MetricType.DECODING_TIME_START, nanoTime, false, 4);
                U.p(removeTrace, MetricType.DECODING_TIME_END, 0L, false, 6);
            }
            MetricsResponse<R> metricsResponse = new MetricsResponse<>(parse, new MetricsResponse.Metrics(uuid, removeTrace));
            execute.close();
            return metricsResponse;
        } finally {
        }
    }
}
