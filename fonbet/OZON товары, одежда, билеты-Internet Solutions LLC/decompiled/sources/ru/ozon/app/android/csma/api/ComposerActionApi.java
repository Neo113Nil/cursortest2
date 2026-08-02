package ru.ozon.app.android.csma.api;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.ozon.app.android.csma.api.models.ComposerActionResponse;
import ru.ozon.app.android.csma.api.models.SendComplainResponse;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0001H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\nJ&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/csma/api/ComposerActionApi;", "", "", "actionName", "", "regularId", "body", "Lru/ozon/app/android/csma/api/models/ComposerActionResponse;", "callAction", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/csma/api/models/SendComplainResponse;", "sendComplain", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ComposerActionApi {
    @POST("composer-api.bx/_action/{actionName}")
    Object callAction(@Path("actionName") @NotNull String str, @Query("regularId") Long l11, @Body Object obj, @NotNull d<? super ComposerActionResponse> dVar);

    @POST("composer-api.bx/_action/{actionName}")
    Object callAction(@Path("actionName") @NotNull String str, @Body String str2, @NotNull d<? super ComposerActionResponse> dVar);

    @POST("composer-api.bx/_action/{actionName}")
    Object sendComplain(@Path("actionName") @NotNull String str, @Body String str2, @NotNull d<? super SendComplainResponse> dVar);
}
