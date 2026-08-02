package ru.ozon.cdn.chooser.internal.data.popreachability;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;
import ru.ozon.cdn.chooser.internal.data.dto.PerfMetricsDto;
import uf0.InterfaceC10056a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/popreachability/PoPReachabilityApi;", "", "", ImagesContract.URL, "Luf0/a;", "", "getFile", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto;", "perfMetricsDto", "sendPopStats", "(Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PoPReachabilityApi {
    @GET
    Object getFile(@Url @NotNull String str, @NotNull d<? super InterfaceC10056a<Unit>> dVar);

    @POST("/pop-stats-collector/api/v1/pop-stats/send")
    Object sendPopStats(@Body @NotNull PerfMetricsDto perfMetricsDto, @NotNull d<? super Unit> dVar);
}
