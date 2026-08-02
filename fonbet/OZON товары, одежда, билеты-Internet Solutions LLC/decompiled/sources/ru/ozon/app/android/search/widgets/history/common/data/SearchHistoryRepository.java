package ru.ozon.app.android.search.widgets.history.common.data;

import Sc.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "", "", "text", "link", "actionName", "LSc/r;", "", "removeQueryFromSearchHistory-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeQueryFromSearchHistory", "", "params", "removeTagFromSearchHistory-0E7RQCE", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeTagFromSearchHistory", "Lru/ozon/app/android/search/widgets/history/common/data/SearchSuggestionsOnboardingRequest;", "request", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "getSearchSuggestionsOnboarding-gIAlu-s", "(Lru/ozon/app/android/search/widgets/history/common/data/SearchSuggestionsOnboardingRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getSearchSuggestionsOnboarding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SearchHistoryRepository {
    /* renamed from: getSearchSuggestionsOnboarding-gIAlu-s, reason: not valid java name */
    Object mo973getSearchSuggestionsOnboardinggIAlus(@NotNull SearchSuggestionsOnboardingRequest searchSuggestionsOnboardingRequest, @NotNull d<? super r<HistoryDTO.Onboarding>> dVar);

    /* renamed from: removeQueryFromSearchHistory-BWLJW6A, reason: not valid java name */
    Object mo974removeQueryFromSearchHistoryBWLJW6A(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull d<? super r<Unit>> dVar);

    /* renamed from: removeTagFromSearchHistory-0E7RQCE, reason: not valid java name */
    Object mo975removeTagFromSearchHistory0E7RQCE(@NotNull Map<String, String> map, @NotNull String str, @NotNull d<? super r<Unit>> dVar);
}
