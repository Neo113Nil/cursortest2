package ru.ozon.app.android.metrics.client;

import D40.c;
import Xc.a;
import Xc.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsRequestData;", "", "", "path", "Lru/ozon/app/android/metrics/client/MetricsRequestData$RequestType;", "requestType", "", "headers", "body", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/metrics/client/MetricsRequestData$RequestType;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Lru/ozon/app/android/metrics/client/MetricsRequestData$RequestType;", "getRequestType", "()Lru/ozon/app/android/metrics/client/MetricsRequestData$RequestType;", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "getBody", "RequestType", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MetricsRequestData {

    @NotNull
    private final String body;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final String path;

    @NotNull
    private final RequestType requestType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsRequestData$RequestType;", "", "<init>", "(Ljava/lang/String;I)V", "POST", "GET", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RequestType[] $VALUES;
        public static final RequestType POST = new RequestType("POST", 0);
        public static final RequestType GET = new RequestType("GET", 1);

        private static final /* synthetic */ RequestType[] $values() {
            return new RequestType[]{POST, GET};
        }

        static {
            RequestType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RequestType(String str, int i11) {
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) $VALUES.clone();
        }
    }

    public MetricsRequestData(@NotNull String path, @NotNull RequestType requestType, @NotNull Map<String, String> headers, @NotNull String body) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.path = path;
        this.requestType = requestType;
        this.headers = headers;
        this.body = body;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsRequestData)) {
            return false;
        }
        MetricsRequestData metricsRequestData = (MetricsRequestData) other;
        return Intrinsics.d(this.path, metricsRequestData.path) && this.requestType == metricsRequestData.requestType && Intrinsics.d(this.headers, metricsRequestData.headers) && Intrinsics.d(this.body, metricsRequestData.body);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final RequestType getRequestType() {
        return this.requestType;
    }

    public int hashCode() {
        return this.body.hashCode() + c.a(this.headers, (this.requestType.hashCode() + (this.path.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "MetricsRequestData(path=" + this.path + ", requestType=" + this.requestType + ", headers=" + this.headers + ", body=" + this.body + ")";
    }

    public /* synthetic */ MetricsRequestData(String str, RequestType requestType, Map map, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, requestType, (i11 & 4) != 0 ? U.c() : map, (i11 & 8) != 0 ? "" : str2);
    }
}
