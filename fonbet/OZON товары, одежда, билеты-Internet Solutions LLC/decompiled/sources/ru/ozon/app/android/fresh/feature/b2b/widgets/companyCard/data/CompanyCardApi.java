package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardApi;", "", "", "actionName", "", "params", "Lretrofit2/Response;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/ActionResponseDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CheckCanChangeEmailResponseDTO;", "canChangeEmail", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CompanyCardApi {
    @POST("composer-api.bx/_action/v2/{actionName}")
    Object canChangeEmail(@Path("actionName") @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<? super Response<ActionResponseDTO<CheckCanChangeEmailResponseDTO>>> dVar);
}
