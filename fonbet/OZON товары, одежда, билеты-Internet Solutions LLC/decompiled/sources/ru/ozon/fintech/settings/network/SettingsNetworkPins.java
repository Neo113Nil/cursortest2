package ru.ozon.fintech.settings.network;

import We.M;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import ru.ozon.fintech.settings.models.Sign;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/settings/network/SettingsNetworkPins;", "", "LWe/M;", "getSoftPins", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/fintech/settings/models/Sign;", "getSign", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SettingsNetworkPins {
    @Headers({"Cache-Control: no-cache", "accept: application/json"})
    @GET("/sign")
    Object getSign(@NotNull d<? super Sign> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json"})
    @GET("/")
    Object getSoftPins(@NotNull d<? super M> dVar);
}
