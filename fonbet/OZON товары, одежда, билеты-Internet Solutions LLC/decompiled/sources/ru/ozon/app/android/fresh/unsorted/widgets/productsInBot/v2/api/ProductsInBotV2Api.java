package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.api;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JR\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/ProductsInBotV2Api;", "", "", "buttonId", "chatId", "groupId", "groupName", "posting", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/SelectedProductsBodyV2;", "selectedProductsBody", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/SelectedProductsResponseV2;", "sendProductsToBot", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/api/SelectedProductsBodyV2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ProductsInBotV2Api {
    @POST("composer-api.bx/_action/v2/selectProductsInBotv2")
    Object sendProductsToBot(@NotNull @Query("button_id") String str, @NotNull @Query("chat_id") String str2, @NotNull @Query("groupId") String str3, @NotNull @Query("group_name") String str4, @NotNull @Query("posting") String str5, @Body @NotNull SelectedProductsBodyV2 selectedProductsBodyV2, @NotNull d<? super ActionV2Response<SelectedProductsResponseV2>> dVar);
}
