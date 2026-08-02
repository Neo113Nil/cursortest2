package ru.ozon.app.android.travel.feature.entry.network;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.api.TabConfigRequest;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/network/OzonTravelTabConfigApi;", "", "Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;", "request", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "loadTabConfig", "(Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OzonTravelTabConfigApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/getTravelTabBarConfigV1")
    Object loadTabConfig(@Body @NotNull TabConfigRequest tabConfigRequest, @NotNull d<? super TabConfigResponse> dVar);
}
