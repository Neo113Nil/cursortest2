package ru.ozon.app.android.cart.domain.data;

import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cart.common.data.CartAddItemResponse;
import ru.ozon.app.android.cart.common.data.CartItemRequest;
import ru.ozon.app.android.cart.common.data.SummaryV2Response;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cart/domain/data/CartDomainApi;", "", "", "Lru/ozon/app/android/cart/common/data/CartItemRequest;", "requestBody", "", "miniapp", "Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/cart/common/data/CartAddItemResponse;", "addToCart", "(Ljava/util/List;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/data/SummaryV2Response;", "getCartsV2", "(Ljava/lang/String;)Lio/reactivex/y;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartDomainApi {
    @POST("composer-api.bx/_action/v2/addToCart")
    @NotNull
    y<ActionV2Response<CartAddItemResponse>> addToCart(@Body @NotNull List<CartItemRequest> requestBody, @Query("miniapp") String miniapp);

    @GET("composer-api.bx/_action/v2/summaryV2")
    @NotNull
    y<ActionV2Response<SummaryV2Response>> getCartsV2(@Query("miniapp") String miniapp);
}
