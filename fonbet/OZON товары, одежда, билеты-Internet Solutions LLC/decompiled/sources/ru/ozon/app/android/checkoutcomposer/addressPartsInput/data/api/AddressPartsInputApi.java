package ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api;

import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputApi;", "", "", "actionName", "", "queryMap", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputRequest;", "params", "Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputResponse;", "updateAddressParts", "(Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputRequest;)Lio/reactivex/y;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AddressPartsInputApi {
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    y<AddressPartsInputResponse> updateAddressParts(@Path("actionName") @NotNull String actionName, @QueryMap @NotNull Map<String, String> queryMap, @Body @NotNull AddressPartsInputRequest params);
}
