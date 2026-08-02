package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/ProductsInBotApi;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsBody;", "selectedProductsBody", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsResponse;", "sendProductsToBot", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ProductsInBotApi {
    @POST("composer-api.bx/_action/v2/selectProductsInBot")
    Object sendProductsToBot(@Body @NotNull SelectedProductsBody selectedProductsBody, @NotNull d<? super ActionV2Response<SelectedProductsResponse>> dVar);
}
