package ru.ozon.app.android.pikazon.logging.error;

import T5.e;
import We.F;
import We.InterfaceC4865g;
import We.L;
import cf.C5824e;
import cf.j;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.chromium.net.r;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.callback.raw.PikazonRawRequestsListener;
import ru.ozon.app.android.pikazon.callback.raw.RequestData;
import ru.ozon.app.android.pikazon.glide.exception.UntrustedHostException;
import ru.ozon.app.android.pikazon.logging.error.ErrorStatus;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\b*\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u000fJ\u001b\u0010-\u001a\u00020\u001f2\n\u0010,\u001a\u00060*j\u0002`+H\u0002¢\u0006\u0004\b-\u0010.J'\u00104\u001a\u00020&2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J'\u00106\u001a\u00020&2\u0006\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020*2\u0006\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0014\u0010?\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/PikazonErrorLogsProducer;", "Lru/ozon/app/android/pikazon/callback/raw/PikazonRawRequestsListener;", "Lru/ozon/app/android/pikazon/Pikazon;", "pikazon", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "performanceAvailabilityChecker", "", "isCronetEnabled", "<init>", "(Lru/ozon/app/android/pikazon/Pikazon;Lqj/a;Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;Z)V", "Lru/ozon/android/networkinfo/models/ConnectionType;", "connectionType", "isNetworkAvailable", "(Lru/ozon/android/networkinfo/models/ConnectionType;)Z", "Lru/ozon/app/android/pikazon/callback/raw/RequestData;", "request", "", "timeLimit", "isLoadingTimeValid", "(Lru/ozon/app/android/pikazon/callback/raw/RequestData;J)Z", "", "requestUuid", "contextMessage", "originalUrl", "LWe/F;", "protocol", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "errorStatus", ImagesContract.URL, "Lru/ozon/app/android/pikazon/logging/error/PikazonErrorLogEntry;", "createLogEntry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWe/F;Ljava/lang/Exception;Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;Ljava/lang/String;Lru/ozon/android/networkinfo/models/ConnectionType;)Lru/ozon/app/android/pikazon/logging/error/PikazonErrorLogEntry;", "logEntry", "", "log", "(Lru/ozon/app/android/pikazon/logging/error/PikazonErrorLogEntry;)V", "isFast", "Ljava/io/IOException;", "Lokio/IOException;", "e", "getErrorStatusByException", "(Ljava/io/IOException;)Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "LWe/g;", "call", "LWe/L;", "response", "requestData", "onResponseReceived", "(LWe/g;LWe/L;Lru/ozon/app/android/pikazon/callback/raw/RequestData;)V", "onRequestFailed", "(LWe/g;Ljava/io/IOException;Lru/ozon/app/android/pikazon/callback/raw/RequestData;)V", "Lru/ozon/app/android/pikazon/Pikazon;", "Lqj/a;", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "Z", "Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;", "getLoadTimeConfig", "()Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;", "loadTimeConfig", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonErrorLogsProducer implements PikazonRawRequestsListener {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isCronetEnabled;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private final PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker;

    @NotNull
    private final Pikazon pikazon;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/PikazonErrorLogsProducer$Companion;", "", "<init>", "()V", "PROTOCOL_VERSION_UNKNOWN", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PikazonErrorLogsProducer(@NotNull Pikazon pikazon, @NotNull C9067a networkInfoProvider, @NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, boolean z11) {
        Intrinsics.checkNotNullParameter(pikazon, "pikazon");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
        this.pikazon = pikazon;
        this.networkInfoProvider = networkInfoProvider;
        this.performanceAvailabilityChecker = performanceAvailabilityChecker;
        this.isCronetEnabled = z11;
    }

    private final PikazonErrorLogEntry createLogEntry(String requestUuid, String contextMessage, String originalUrl, F protocol, Exception exception, ErrorStatus errorStatus, String url, ConnectionType connectionType) {
        String str;
        Boolean n11 = this.networkInfoProvider.n();
        boolean booleanValue = n11 != null ? n11.booleanValue() : false;
        Boolean l11 = this.networkInfoProvider.l();
        boolean booleanValue2 = l11 != null ? l11.booleanValue() : false;
        int code = errorStatus.getCode();
        String type = errorStatus.getType();
        boolean z11 = this.isCronetEnabled;
        if (protocol == null || (str = protocol.toString()) == null) {
            str = "unknown";
        }
        String str2 = str;
        IOException exception2 = errorStatus.getException();
        return new PikazonErrorLogEntry(requestUuid, contextMessage, originalUrl, url, code, type, booleanValue, booleanValue2, z11, connectionType, str2, exception, exception2 != null ? exception2.getClass().getCanonicalName() : null);
    }

    private final ErrorStatus getErrorStatusByException(IOException e11) {
        return e11 instanceof UntrustedHostException ? new ErrorStatus.Other(1, null, 2, null) : e11 instanceof r ? new ErrorStatus.Cronet(((r) e11).a(), null, 2, null) : e11 instanceof e ? new ErrorStatus.System(((e) e11).a(), null, 2, null) : new ErrorStatus.System(0, e11, 1, null);
    }

    private final Pikazon.LoadTimeLogsConfiguration getLoadTimeConfig() {
        return this.pikazon.getConfig().getLoadTimeLogsConfiguration();
    }

    private final boolean isFast(ConnectionType connectionType) {
        return connectionType == ConnectionType.WIFI || connectionType == ConnectionType.CELLULAR_3G || connectionType == ConnectionType.CELLULAR_4G;
    }

    private final boolean isLoadingTimeValid(RequestData request, long timeLimit) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - b.i(request.getStartTime())) < timeLimit;
    }

    private final boolean isNetworkAvailable(ConnectionType connectionType) {
        return connectionType != ConnectionType.NO_INTERNET;
    }

    private final void log(PikazonErrorLogEntry logEntry) {
        for (PikazonErrorsLogger pikazonErrorsLogger : this.pikazon.getErrorsLoggers$lib_release()) {
            if (this.performanceAvailabilityChecker.isImageErrorsAnalyticsEnabled(pikazonErrorsLogger.getAnalyticsPlatform())) {
                pikazonErrorsLogger.log(logEntry);
            }
        }
    }

    @Override // ru.ozon.app.android.pikazon.callback.raw.PikazonRawRequestsListener
    public void onRequestFailed(@NotNull InterfaceC4865g call, @NotNull IOException e11, @NotNull RequestData requestData) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        ConnectionType g10 = C9067a.g(this.networkInfoProvider);
        if (isNetworkAvailable(g10)) {
            boolean isLoadingTimeValid = isLoadingTimeValid(requestData, getLoadTimeConfig().getCancelRequestValidTimeMs());
            if (!call.isCanceled() || (!isLoadingTimeValid && isFast(g10))) {
                ErrorStatus errorStatusByException = (call.isCanceled() && !isLoadingTimeValid && isFast(g10)) ? ErrorStatus.Cancellation.INSTANCE : getErrorStatusByException(e11);
                String uuid = requestData.getUuid();
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                String str = message;
                String originalUrl = requestData.getOriginalUrl();
                C5824e c5824e = (C5824e) call;
                j h11 = c5824e.h();
                log(createLogEntry(uuid, str, originalUrl, h11 != null ? h11.a() : null, e11, errorStatusByException, c5824e.l().j().toString(), C9067a.g(this.networkInfoProvider)));
            }
        }
    }

    @Override // ru.ozon.app.android.pikazon.callback.raw.PikazonRawRequestsListener
    public void onRequestStarted(@NotNull RequestData requestData) {
        PikazonRawRequestsListener.DefaultImpls.onRequestStarted(this, requestData);
    }

    @Override // ru.ozon.app.android.pikazon.callback.raw.PikazonRawRequestsListener
    public void onResponseReceived(@NotNull InterfaceC4865g call, @NotNull L response, @NotNull RequestData requestData) {
        ErrorStatus other;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        ConnectionType g10 = C9067a.g(this.networkInfoProvider);
        if (isNetworkAvailable(g10)) {
            if (!response.v()) {
                other = new ErrorStatus.Http(response.m(), null, 2, null);
            } else if (!isLoadingTimeValid(requestData, getLoadTimeConfig().getSuccessLoadValidTimeMs()) && isFast(g10)) {
                other = new ErrorStatus.Other(2, null, 2, null);
            }
            log(createLogEntry(requestData.getUuid(), response.w(), requestData.getOriginalUrl(), response.B(), null, other, response.L().j().toString(), g10));
        }
    }
}
