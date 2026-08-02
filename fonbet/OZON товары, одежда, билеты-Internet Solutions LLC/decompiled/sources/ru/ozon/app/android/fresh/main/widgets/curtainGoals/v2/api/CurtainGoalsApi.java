package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsApi;", "", "", "", "body", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsResponse;", "applyGoalsCoupon", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CurtainGoalsApi {
    @POST("composer-api.bx/_action/applyGoalsCoupon")
    Object applyGoalsCoupon(@Body @NotNull Map<String, String> map, @NotNull d<? super CurtainGoalsResponse> dVar);
}
