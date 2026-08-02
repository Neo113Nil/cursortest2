package ru.ozon.app.android.search.widgets.history.common.data;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepositoryImpl;", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryApi;", "searchHistoryApi", "<init>", "(Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryApi;)V", "", "text", "link", "actionName", "LSc/r;", "", "removeQueryFromSearchHistory-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeQueryFromSearchHistory", "", "params", "removeTagFromSearchHistory-0E7RQCE", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeTagFromSearchHistory", "Lru/ozon/app/android/search/widgets/history/common/data/SearchSuggestionsOnboardingRequest;", "request", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "getSearchSuggestionsOnboarding-gIAlu-s", "(Lru/ozon/app/android/search/widgets/history/common/data/SearchSuggestionsOnboardingRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getSearchSuggestionsOnboarding", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchHistoryRepositoryImpl implements SearchHistoryRepository {

    @NotNull
    private final SearchHistoryApi searchHistoryApi;

    public SearchHistoryRepositoryImpl(@NotNull SearchHistoryApi searchHistoryApi) {
        Intrinsics.checkNotNullParameter(searchHistoryApi, "searchHistoryApi");
        this.searchHistoryApi = searchHistoryApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0041, B:13:0x0049, B:15:0x004f, B:18:0x0054, B:19:0x005b, B:20:0x005c, B:21:0x006e, B:25:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0041, B:13:0x0049, B:15:0x004f, B:18:0x0054, B:19:0x005b, B:20:0x005c, B:21:0x006e, B:25:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository
    /* renamed from: getSearchSuggestionsOnboarding-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo973getSearchSuggestionsOnboardinggIAlus(@NotNull SearchSuggestionsOnboardingRequest searchSuggestionsOnboardingRequest, @NotNull d<? super r<HistoryDTO.Onboarding>> dVar) {
        SearchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1 searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1;
        int i11;
        Response response;
        try {
            if (dVar instanceof SearchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1) {
                searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1 = (SearchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1) dVar;
                int i12 = searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        SearchHistoryApi searchHistoryApi = this.searchHistoryApi;
                        searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1.label = 1;
                        obj = searchHistoryApi.getSearchSuggestionsOnboarding(searchSuggestionsOnboardingRequest, searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    response = (Response) obj;
                    if (response.isSuccessful()) {
                        String message = response.message();
                        Intrinsics.checkNotNullExpressionValue(message, "message(...)");
                        throw new IllegalStateException(message.toString());
                    }
                    Object body = response.body();
                    if (body == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    HistoryDTO.Onboarding onboarding = (HistoryDTO.Onboarding) body;
                    r.Companion companion2 = r.INSTANCE;
                    return onboarding;
                }
            }
            if (i11 != 0) {
            }
            response = (Response) obj;
            if (response.isSuccessful()) {
            }
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(th2);
        }
        searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1 = new SearchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1(this, dVar);
        Object obj2 = searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = searchHistoryRepositoryImpl$getSearchSuggestionsOnboarding$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository
    /* renamed from: removeQueryFromSearchHistory-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo974removeQueryFromSearchHistoryBWLJW6A(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull d<? super r<Unit>> dVar) {
        SearchHistoryRepositoryImpl$removeQueryFromSearchHistory$1 searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1;
        int i11;
        try {
            if (dVar instanceof SearchHistoryRepositoryImpl$removeQueryFromSearchHistory$1) {
                searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1 = (SearchHistoryRepositoryImpl$removeQueryFromSearchHistory$1) dVar;
                int i12 = searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        SearchHistoryApi searchHistoryApi = this.searchHistoryApi;
                        RemoveFromHistoryRequest removeFromHistoryRequest = new RemoveFromHistoryRequest(str, str2);
                        searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1.label = 1;
                        if (searchHistoryApi.deleteSearchHistory(str3, removeFromHistoryRequest, searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Unit unit = Unit.f71690a;
                    r.Companion companion2 = r.INSTANCE;
                    return unit;
                }
            }
            if (i11 != 0) {
            }
            Unit unit2 = Unit.f71690a;
            r.Companion companion22 = r.INSTANCE;
            return unit2;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(th2);
        }
        searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1 = new SearchHistoryRepositoryImpl$removeQueryFromSearchHistory$1(this, dVar);
        Object obj2 = searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = searchHistoryRepositoryImpl$removeQueryFromSearchHistory$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository
    /* renamed from: removeTagFromSearchHistory-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo975removeTagFromSearchHistory0E7RQCE(@NotNull Map<String, String> map, @NotNull String str, @NotNull d<? super r<Unit>> dVar) {
        SearchHistoryRepositoryImpl$removeTagFromSearchHistory$1 searchHistoryRepositoryImpl$removeTagFromSearchHistory$1;
        int i11;
        try {
            if (dVar instanceof SearchHistoryRepositoryImpl$removeTagFromSearchHistory$1) {
                searchHistoryRepositoryImpl$removeTagFromSearchHistory$1 = (SearchHistoryRepositoryImpl$removeTagFromSearchHistory$1) dVar;
                int i12 = searchHistoryRepositoryImpl$removeTagFromSearchHistory$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    searchHistoryRepositoryImpl$removeTagFromSearchHistory$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = searchHistoryRepositoryImpl$removeTagFromSearchHistory$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = searchHistoryRepositoryImpl$removeTagFromSearchHistory$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        SearchHistoryApi searchHistoryApi = this.searchHistoryApi;
                        searchHistoryRepositoryImpl$removeTagFromSearchHistory$1.label = 1;
                        if (searchHistoryApi.deleteTagFromSearchHistory(str, map, searchHistoryRepositoryImpl$removeTagFromSearchHistory$1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Unit unit = Unit.f71690a;
                    r.Companion companion2 = r.INSTANCE;
                    return unit;
                }
            }
            if (i11 != 0) {
            }
            Unit unit2 = Unit.f71690a;
            r.Companion companion22 = r.INSTANCE;
            return unit2;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(th2);
        }
        searchHistoryRepositoryImpl$removeTagFromSearchHistory$1 = new SearchHistoryRepositoryImpl$removeTagFromSearchHistory$1(this, dVar);
        Object obj2 = searchHistoryRepositoryImpl$removeTagFromSearchHistory$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = searchHistoryRepositoryImpl$removeTagFromSearchHistory$1.label;
    }
}
