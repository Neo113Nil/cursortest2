package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/RecShelfApi;", "", "", "miniapp", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/GetRecShelfRequest;", "request", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/GetRecShelfResponse;", "requestRecShelf", "(Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/GetRecShelfRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface RecShelfApi {
    @POST("composer-api.bx/_action/v2/getRecommendationsShelfAction")
    Object requestRecShelf(@NotNull @Query("miniapp") String str, @Body @NotNull GetRecShelfRequest getRecShelfRequest, @NotNull d<? super ActionV2Response<GetRecShelfResponse>> dVar);
}
