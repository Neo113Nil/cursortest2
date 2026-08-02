package ru.ozon.app.android.pdp.widgets.productStarsTile.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/productStarsTile/data/ProductStarsApi;", "", "", "productId", "getStarsBalance", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ProductStarsApi {
    @GET("composer-api.bx/_action/pdpGetStarsBalance")
    Object getStarsBalance(@NotNull @Query("product_id") String str, @NotNull d<? super String> dVar);
}
