package ru.ozon.app.android.action.v2.models;

import Tl.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.metrics.client.MetricsResponse;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B[\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003Jf\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/action/v2/models/ActionV2Response;", "T", "", "error", "", "data", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingPayloads", "metrics", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;)V", "getError", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTrackingInfo", "()Ljava/util/Map;", "getTrackingPayloads", "getMetrics", "()Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;)Lru/ozon/app/android/action/v2/models/ActionV2Response;", "equals", "", "other", "hashCode", "", "toString", "Companion", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ActionV2Response<T> {
    private final T data;
    private final String error;

    @NotNull
    private final transient MetricsResponse.Metrics metrics;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Map<String, String> trackingPayloads;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0001¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/action/v2/models/ActionV2Response$Companion;", "", "<init>", "()V", "empty", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "T", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> ActionV2Response<T> empty() {
            return new ActionV2Response<>(null, null, null, null, null, 31, null);
        }

        private Companion() {
        }
    }

    public ActionV2Response() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionV2Response copy$default(ActionV2Response actionV2Response, String str, Object obj, Map map, Map map2, MetricsResponse.Metrics metrics, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = actionV2Response.error;
        }
        T t2 = obj;
        if ((i11 & 2) != 0) {
            t2 = actionV2Response.data;
        }
        if ((i11 & 4) != 0) {
            map = actionV2Response.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            map2 = actionV2Response.trackingPayloads;
        }
        if ((i11 & 16) != 0) {
            metrics = actionV2Response.metrics;
        }
        MetricsResponse.Metrics metrics2 = metrics;
        Map map3 = map;
        return actionV2Response.copy(str, t2, map3, map2, metrics2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final T component2() {
        return this.data;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    public final Map<String, String> component4() {
        return this.trackingPayloads;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MetricsResponse.Metrics getMetrics() {
        return this.metrics;
    }

    @NotNull
    public final ActionV2Response<T> copy(String error, T data, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, String> trackingPayloads, @NotNull MetricsResponse.Metrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return new ActionV2Response<>(error, data, trackingInfo, trackingPayloads, metrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionV2Response)) {
            return false;
        }
        ActionV2Response actionV2Response = (ActionV2Response) other;
        return Intrinsics.d(this.error, actionV2Response.error) && Intrinsics.d(this.data, actionV2Response.data) && Intrinsics.d(this.trackingInfo, actionV2Response.trackingInfo) && Intrinsics.d(this.trackingPayloads, actionV2Response.trackingPayloads) && Intrinsics.d(this.metrics, actionV2Response.metrics);
    }

    public final T getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    @NotNull
    public final MetricsResponse.Metrics getMetrics() {
        return this.metrics;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, String> getTrackingPayloads() {
        return this.trackingPayloads;
    }

    public int hashCode() {
        String str = this.error;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        T t2 = this.data;
        int hashCode2 = (hashCode + (t2 == null ? 0 : t2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.trackingPayloads;
        return this.metrics.hashCode() + ((hashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.error;
        T t2 = this.data;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, String> map2 = this.trackingPayloads;
        MetricsResponse.Metrics metrics = this.metrics;
        StringBuilder sb2 = new StringBuilder("ActionV2Response(error=");
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(t2);
        sb2.append(", trackingInfo=");
        b.g(sb2, map, ", trackingPayloads=", map2, ", metrics=");
        sb2.append(metrics);
        sb2.append(")");
        return sb2.toString();
    }

    public ActionV2Response(String str, T t2, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, @NotNull MetricsResponse.Metrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.error = str;
        this.data = t2;
        this.trackingInfo = map;
        this.trackingPayloads = map2;
        this.metrics = metrics;
    }

    public /* synthetic */ ActionV2Response(String str, Object obj, Map map, Map map2, MetricsResponse.Metrics metrics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : map2, (i11 & 16) != 0 ? MetricsResponse.Metrics.INSTANCE.getEMPTY() : metrics);
    }
}
