package ru.ozon.tracker.network;

import Mj0.h;
import We.M;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import ru.ozon.tracker.model.SendEventsRequest;
import ru.ozon.tracker.model.SendPerfEventsTraceEntity;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/tracker/network/NewTrackerApi;", "LMj0/h;", "Lru/ozon/tracker/model/SendPerfEventsTraceEntity;", "body", "Lretrofit2/Response;", "LWe/M;", "sendPerfMetricsV3", "(Lru/ozon/tracker/model/SendPerfEventsTraceEntity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "sendPerfMetricsV2", "Lru/ozon/tracker/model/SendEventsRequest;", "sendMultiEvent", "(Lru/ozon/tracker/model/SendEventsRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NewTrackerApi extends h {
    @Override // Mj0.h
    @Headers({"accept: application/json", "Content-Type: application/json"})
    @POST("p-api/tracker/dlte/multi")
    Object sendMultiEvent(@Body @NotNull SendEventsRequest sendEventsRequest, @NotNull d<? super Response<M>> dVar);

    @Override // Mj0.h
    @POST("p-api/perf-metrics-collector/v2/events")
    Object sendPerfMetricsV2(@Body @NotNull SendPerfEventsTraceEntity sendPerfEventsTraceEntity, @NotNull d<? super Response<M>> dVar);

    @Override // Mj0.h
    @POST("p-api/perf-metrics-collector/v3/bx/apps/send")
    Object sendPerfMetricsV3(@Body @NotNull SendPerfEventsTraceEntity sendPerfEventsTraceEntity, @NotNull d<? super Response<M>> dVar);
}
