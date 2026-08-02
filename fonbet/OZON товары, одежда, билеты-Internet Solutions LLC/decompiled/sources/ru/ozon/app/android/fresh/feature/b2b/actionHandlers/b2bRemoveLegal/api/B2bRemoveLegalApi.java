package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.api;

import We.K;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalResponse;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/api/B2bRemoveLegalApi;", "", "", "actionName", "LWe/K;", "requestBody", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse;", "removeLegal", "(Ljava/lang/String;LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface B2bRemoveLegalApi {
    @POST("composer-api.bx/_action/{actionName}")
    Object removeLegal(@Path("actionName") @NotNull String str, @Body @NotNull K k11, @NotNull d<? super B2bRemoveLegalResponse> dVar);
}
