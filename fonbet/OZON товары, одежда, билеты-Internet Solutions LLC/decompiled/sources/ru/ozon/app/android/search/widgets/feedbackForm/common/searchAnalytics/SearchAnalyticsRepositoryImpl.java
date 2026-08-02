package ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRepositoryImpl;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRepository;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsApi;", "searchAnalyticsApi", "<init>", "(Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsApi;)V", "", "actionName", "Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRequest;", "request", "LSc/r;", "", "sendSearchAnalytics-0E7RQCE", "(Ljava/lang/String;Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "sendSearchAnalytics", "Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchAnalyticsRepositoryImpl implements SearchAnalyticsRepository {

    @NotNull
    private final SearchAnalyticsApi searchAnalyticsApi;

    public SearchAnalyticsRepositoryImpl(@NotNull SearchAnalyticsApi searchAnalyticsApi) {
        Intrinsics.checkNotNullParameter(searchAnalyticsApi, "searchAnalyticsApi");
        this.searchAnalyticsApi = searchAnalyticsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics.SearchAnalyticsRepository
    /* renamed from: sendSearchAnalytics-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo971sendSearchAnalytics0E7RQCE(@NotNull String str, @NotNull SearchAnalyticsRequest searchAnalyticsRequest, @NotNull d<? super r<Unit>> dVar) {
        SearchAnalyticsRepositoryImpl$sendSearchAnalytics$1 searchAnalyticsRepositoryImpl$sendSearchAnalytics$1;
        int i11;
        try {
            if (dVar instanceof SearchAnalyticsRepositoryImpl$sendSearchAnalytics$1) {
                searchAnalyticsRepositoryImpl$sendSearchAnalytics$1 = (SearchAnalyticsRepositoryImpl$sendSearchAnalytics$1) dVar;
                int i12 = searchAnalyticsRepositoryImpl$sendSearchAnalytics$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    searchAnalyticsRepositoryImpl$sendSearchAnalytics$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = searchAnalyticsRepositoryImpl$sendSearchAnalytics$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = searchAnalyticsRepositoryImpl$sendSearchAnalytics$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        SearchAnalyticsApi searchAnalyticsApi = this.searchAnalyticsApi;
                        searchAnalyticsRepositoryImpl$sendSearchAnalytics$1.label = 1;
                        if (searchAnalyticsApi.sendSearchAnalytics(str, searchAnalyticsRequest, searchAnalyticsRepositoryImpl$sendSearchAnalytics$1) == aVar) {
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
        searchAnalyticsRepositoryImpl$sendSearchAnalytics$1 = new SearchAnalyticsRepositoryImpl$sendSearchAnalytics$1(this, dVar);
        Object obj2 = searchAnalyticsRepositoryImpl$sendSearchAnalytics$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = searchAnalyticsRepositoryImpl$sendSearchAnalytics$1.label;
    }
}
