package ru.ozon.app.android.metrics.client;

import Qj0.U;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsResponse;", "", "R", "response", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "metrics", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getResponse", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "getMetrics", "Metrics", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MetricsResponse<R> {

    @NotNull
    private final Metrics metrics;

    @NotNull
    private final R response;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "", "", "uuid", "LQj0/U;", "trace", "<init>", "(Ljava/lang/String;LQj0/U;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "LQj0/U;", "getTrace", "()LQj0/U;", "Companion", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metrics {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Metrics EMPTY = new Metrics("", null);
        private final U trace;

        @NotNull
        private final String uuid;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics$Companion;", "", "<init>", "()V", "EMPTY", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "getEMPTY", "()Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Metrics getEMPTY() {
                return Metrics.EMPTY;
            }

            private Companion() {
            }
        }

        public Metrics(@NotNull String uuid, U u11) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.uuid = uuid;
            this.trace = u11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metrics)) {
                return false;
            }
            Metrics metrics = (Metrics) other;
            return Intrinsics.d(this.uuid, metrics.uuid) && Intrinsics.d(this.trace, metrics.trace);
        }

        public final U getTrace() {
            return this.trace;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            int hashCode = this.uuid.hashCode() * 31;
            U u11 = this.trace;
            return hashCode + (u11 == null ? 0 : u11.hashCode());
        }

        @NotNull
        public String toString() {
            return "Metrics(uuid=" + this.uuid + ", trace=" + this.trace + ")";
        }
    }

    public MetricsResponse(@NotNull R response, @NotNull Metrics metrics) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.response = response;
        this.metrics = metrics;
    }

    @NotNull
    public final R component1() {
        return this.response;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Metrics getMetrics() {
        return this.metrics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsResponse)) {
            return false;
        }
        MetricsResponse metricsResponse = (MetricsResponse) other;
        return Intrinsics.d(this.response, metricsResponse.response) && Intrinsics.d(this.metrics, metricsResponse.metrics);
    }

    @NotNull
    public final Metrics getMetrics() {
        return this.metrics;
    }

    @NotNull
    public final R getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.metrics.hashCode() + (this.response.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MetricsResponse(response=" + this.response + ", metrics=" + this.metrics + ")";
    }
}
