package ru.ozon.app.android.video.player.performance;

import Qj0.B;
import Qj0.C3882b;
import Qj0.C3883c;
import Qj0.Q;
import Qj0.U;
import Qj0.t0;
import We.F;
import We.G;
import We.InterfaceC4865g;
import We.L;
import We.v;
import We.y;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.tracker.performance.ObjectTypes;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u0000 e2\u00020\u0001:\u0001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0011J\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J-\u0010+\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b+\u0010,J'\u00101\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J1\u00103\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b5\u0010#J!\u00108\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b>\u0010#J\u001f\u0010A\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010EJ9\u0010I\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010MR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010MR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010YR\u0016\u0010^\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010YR\u0016\u0010_\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010YR\u0016\u0010`\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010YR\u0016\u0010a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR\u0016\u0010b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010YR\u0016\u0010c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010YR\u0016\u0010d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010Y¨\u0006f"}, d2 = {"Lru/ozon/app/android/video/player/performance/VideoPerformanceEventListener;", "LWe/v;", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "", ImagesContract.URL, FormPageDTO.Field.FIELD_TYPE_RANGE, "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "<init>", "(Lqj/a;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)V", "", "time", "", "calculateDnsTime", "(J)V", "LWe/F;", "protocol", "calculateProtocolVersion", "(LWe/F;)V", "calculateResponseTime", "calculateServerTime", "calculateTcpTime", "calculateTimeToFirstByte", "calculateTimeToLastByte", "calculateTlsTime", "calculateTotalTime", "", "nanoToMs", "(J)D", "LWe/g;", "call", "callStart", "(LWe/g;)V", "callEnd", "domainName", "dnsStart", "(LWe/g;Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(LWe/g;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "(LWe/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "connectEnd", "(LWe/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LWe/F;)V", "secureConnectStart", "LWe/y;", "handshake", "secureConnectEnd", "(LWe/g;LWe/y;)V", "LWe/G;", "request", "requestHeadersEnd", "(LWe/g;LWe/G;)V", "responseHeadersStart", "LWe/L;", "response", "responseHeadersEnd", "(LWe/g;LWe/L;)V", "byteCount", "requestBodyEnd", "(LWe/g;J)V", "responseBodyEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "(LWe/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LWe/F;Ljava/io/IOException;)V", "callFailed", "(LWe/g;Ljava/io/IOException;)V", "Ljava/lang/String;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "LQj0/U;", "trace", "LQj0/U;", "Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingsParser", "Lru/ozon/tracker/performance/ServerTimingsParser;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "videoAsset", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "headersSize", "J", "", "isSecureConnectWasCalled", "Z", "dnsTimeStart", "responseTimeStart", "serverTimeStart", "tcpTimeStart", "timeToFirstByteStart", "timeToLastByteStart", "tlsTimeStart", "totalTimeStart", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoPerformanceEventListener extends v {
    private long dnsTimeStart;
    private long headersSize;
    private boolean isSecureConnectWasCalled;

    @NotNull
    private final String range;
    private long responseTimeStart;
    private long serverTimeStart;

    @NotNull
    private final ServerTimingsParser serverTimingsParser;
    private long tcpTimeStart;
    private long timeToFirstByteStart;
    private long timeToLastByteStart;
    private long tlsTimeStart;
    private long totalTimeStart;

    @NotNull
    private final U trace;

    @NotNull
    private final String url;

    @NotNull
    private final VideoAsset videoAsset;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/player/performance/VideoPerformanceEventListener$Companion;", "", "<init>", "()V", "HEADER_CONTENT_TYPE", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.QUIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoPerformanceEventListener(@NotNull C9067a networkInfoProvider, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull String url, @NotNull String range, @NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        this.url = url;
        this.range = range;
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        U beginTrace = performanceTrackerDelegate.beginTrace(url);
        this.trace = beginTrace;
        this.serverTimingsParser = new ServerTimingsParser();
        this.videoAsset = new VideoAsset(url, range);
        t0 t0Var = new t0(url);
        int i11 = U.f23535i;
        beginTrace.n(t0Var, true);
        beginTrace.n(new C3882b(C9067a.g(networkInfoProvider)), true);
        beginTrace.n(new B(ObjectTypes.CUSTOM), true);
    }

    private final void calculateDnsTime(long time) {
        long j11 = this.dnsTimeStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("dnsTime", Double.valueOf(nanoToMs(time - j11))));
            this.dnsTimeStart = 0L;
        }
    }

    private final void calculateProtocolVersion(F protocol) {
        double d11;
        int i11 = WhenMappings.$EnumSwitchMapping$0[protocol.ordinal()];
        if (i11 == 1) {
            d11 = 1.0d;
        } else if (i11 == 2) {
            d11 = 1.1d;
        } else if (i11 == 3) {
            d11 = 3.0d;
        } else if (i11 != 4) {
            return;
        } else {
            d11 = 2.0d;
        }
        this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("protocolVersion", Double.valueOf(d11)));
    }

    private final void calculateResponseTime(long time) {
        long j11 = this.responseTimeStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("responseTime", Double.valueOf(nanoToMs(time - j11))));
            this.responseTimeStart = 0L;
        }
    }

    private final void calculateServerTime(long time) {
        long j11 = this.serverTimeStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("serverTime", Double.valueOf(nanoToMs(time - j11))));
            this.serverTimeStart = 0L;
        }
    }

    private final void calculateTcpTime(long time) {
        long j11 = this.tcpTimeStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("tcpTime", Double.valueOf(nanoToMs(time - j11))));
            this.tcpTimeStart = 0L;
        }
    }

    private final void calculateTimeToFirstByte(long time) {
        long j11 = this.timeToFirstByteStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("timeToFirstByte", Double.valueOf(nanoToMs(time - j11))));
            this.timeToFirstByteStart = 0L;
        }
    }

    private final void calculateTimeToLastByte(long time) {
        long j11 = this.timeToLastByteStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("timeToLastByte", Double.valueOf(nanoToMs(time - j11))));
            this.timeToLastByteStart = 0L;
        }
    }

    private final void calculateTlsTime(long time) {
        long j11 = this.tlsTimeStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("tlsTime", Double.valueOf(nanoToMs(time - j11))));
            this.tlsTimeStart = 0L;
        }
    }

    private final void calculateTotalTime(long time) {
        long j11 = this.totalTimeStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("totalTime", Double.valueOf(nanoToMs(time - j11))));
            this.totalTimeStart = 0L;
        }
    }

    private final double nanoToMs(long j11) {
        return Math.floor(j11 / 1000000.0d);
    }

    @Override // We.v
    public void callEnd(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        calculateTotalTime(System.nanoTime());
    }

    @Override // We.v
    public void callFailed(@NotNull InterfaceC4865g call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        long nanoTime = System.nanoTime();
        calculateResponseTime(nanoTime);
        calculateTimeToLastByte(nanoTime);
        calculateTotalTime(nanoTime);
    }

    @Override // We.v
    public void callStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        long nanoTime = System.nanoTime();
        this.totalTimeStart = nanoTime;
        this.timeToFirstByteStart = nanoTime;
        this.timeToLastByteStart = nanoTime;
    }

    @Override // We.v
    public void connectEnd(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, F protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        if (this.isSecureConnectWasCalled) {
            return;
        }
        calculateTcpTime(System.nanoTime());
    }

    @Override // We.v
    public void connectFailed(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, F protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    @Override // We.v
    public void connectStart(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.isSecureConnectWasCalled = false;
        this.tcpTimeStart = System.nanoTime();
    }

    @Override // We.v
    public void dnsEnd(@NotNull InterfaceC4865g call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        calculateDnsTime(System.nanoTime());
    }

    @Override // We.v
    public void dnsStart(@NotNull InterfaceC4865g call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        this.dnsTimeStart = System.nanoTime();
    }

    @Override // We.v
    public void requestBodyEnd(@NotNull InterfaceC4865g call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.serverTimeStart = System.nanoTime();
    }

    @Override // We.v
    public void requestHeadersEnd(@NotNull InterfaceC4865g call, @NotNull G request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        this.serverTimeStart = System.nanoTime();
    }

    @Override // We.v
    public void responseBodyEnd(@NotNull InterfaceC4865g call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        long nanoTime = System.nanoTime();
        calculateResponseTime(nanoTime);
        calculateTimeToLastByte(nanoTime);
    }

    @Override // We.v
    public void responseHeadersEnd(@NotNull InterfaceC4865g call, @NotNull L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.headersSize = response.r().b();
        this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("headersSize", Long.valueOf(this.headersSize)));
        int m11 = response.m();
        String q11 = L.q(response, "content-type");
        U u11 = this.trace;
        Q q12 = new Q(m11);
        int i11 = U.f23535i;
        u11.n(q12, true);
        if (q11 != null) {
            this.trace.n(new C3883c(q11), true);
        }
        this.serverTimingsParser.c(response, this.trace);
        calculateProtocolVersion(response.B());
    }

    @Override // We.v
    public void responseHeadersStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        long nanoTime = System.nanoTime();
        calculateTimeToFirstByte(nanoTime);
        calculateServerTime(nanoTime);
        this.responseTimeStart = nanoTime;
    }

    @Override // We.v
    public void secureConnectEnd(@NotNull InterfaceC4865g call, y handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        calculateTlsTime(System.nanoTime());
    }

    @Override // We.v
    public void secureConnectStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.isSecureConnectWasCalled = true;
        long nanoTime = System.nanoTime();
        calculateTcpTime(nanoTime);
        this.tlsTimeStart = nanoTime;
    }
}
