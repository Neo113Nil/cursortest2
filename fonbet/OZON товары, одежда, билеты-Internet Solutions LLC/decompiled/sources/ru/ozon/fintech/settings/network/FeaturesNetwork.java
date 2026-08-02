package ru.ozon.fintech.settings.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.fintech.settings.models.FeatureFlag;
import ru.ozon.fintech.settings.models.FeatureFlagsRequest;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/fintech/settings/network/FeaturesNetwork;", "", "", "path", "Lru/ozon/fintech/settings/models/FeatureFlagsRequest;", "request", "Lretrofit2/Response;", "", "Lru/ozon/fintech/settings/models/FeatureFlag;", "getFeatureFlags", "(Ljava/lang/String;Lru/ozon/fintech/settings/models/FeatureFlagsRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getFeatureFlag", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FeaturesNetwork {
    @Headers({"Cache-Control: no-cache", "Accept: application/json", "Content-Type: application/json"})
    @POST("{path}")
    Object getFeatureFlag(@Path(encoded = true, value = "path") @NotNull String str, @Body @NotNull FeatureFlagsRequest featureFlagsRequest, @NotNull d<? super List<FeatureFlag>> dVar);

    @Headers({"Cache-Control: no-cache", "Accept: application/json", "Content-Type: application/json"})
    @POST("{path}")
    Object getFeatureFlags(@Path(encoded = true, value = "path") @NotNull String str, @Body @NotNull FeatureFlagsRequest featureFlagsRequest, @NotNull d<? super Response<List<FeatureFlag>>> dVar);
}
