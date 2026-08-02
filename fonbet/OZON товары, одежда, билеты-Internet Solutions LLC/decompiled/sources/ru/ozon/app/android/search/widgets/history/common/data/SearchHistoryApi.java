package ru.ozon.app.android.search.widgets.history.common.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryApi;", "", "", "actionName", "Lru/ozon/app/android/search/widgets/history/common/data/RemoveFromHistoryRequest;", "request", "", "deleteSearchHistory", "(Ljava/lang/String;Lru/ozon/app/android/search/widgets/history/common/data/RemoveFromHistoryRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "params", "deleteTagFromSearchHistory", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/search/widgets/history/common/data/SearchSuggestionsOnboardingRequest;", "Lretrofit2/Response;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "getSearchSuggestionsOnboarding", "(Lru/ozon/app/android/search/widgets/history/common/data/SearchSuggestionsOnboardingRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SearchHistoryApi {
    @POST("composer-api.bx/_action/{actionName}")
    Object deleteSearchHistory(@Path("actionName") @NotNull String str, @Body @NotNull RemoveFromHistoryRequest removeFromHistoryRequest, @NotNull d<? super Unit> dVar);

    @POST("composer-api.bx/_action/{actionName}")
    Object deleteTagFromSearchHistory(@Path("actionName") @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull d<? super Unit> dVar);

    @POST("composer-api.bx/_action/getSearchSuggestionsOnboarding")
    Object getSearchSuggestionsOnboarding(@Body @NotNull SearchSuggestionsOnboardingRequest searchSuggestionsOnboardingRequest, @NotNull d<? super Response<HistoryDTO.Onboarding>> dVar);
}
