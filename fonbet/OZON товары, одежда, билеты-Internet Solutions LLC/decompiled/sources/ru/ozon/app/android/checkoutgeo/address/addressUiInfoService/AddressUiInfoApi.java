package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoApi;", "", "", "miniApp", "Lio/reactivex/y;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoResponse;", "getAddressUiInfo", "(Ljava/lang/String;)Lio/reactivex/y;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressUiInfoApi {
    @GET("composer-api.bx/_action/addressUIInfo")
    @NotNull
    y<AddressUiInfoResponse> getAddressUiInfo(@Query("miniapp") String miniApp);
}
