package ru.ozon.app.android.metrics.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00040\nH&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/metrics/client/MetricsClient;", "", "call", "Lru/ozon/app/android/metrics/client/MetricsResponse;", "R", "requestData", "Lru/ozon/app/android/metrics/client/MetricsRequestData;", "isLongPolling", "", "parser", "Lru/ozon/app/android/metrics/client/MetricsResponseParser;", "metrics-client_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MetricsClient {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ MetricsResponse call$default(MetricsClient metricsClient, MetricsRequestData metricsRequestData, boolean z11, MetricsResponseParser metricsResponseParser, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return metricsClient.call(metricsRequestData, z11, metricsResponseParser);
        }
    }

    @NotNull
    <R> MetricsResponse<R> call(@NotNull MetricsRequestData requestData, boolean isLongPolling, @NotNull MetricsResponseParser<R> parser);
}
