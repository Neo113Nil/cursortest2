package ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics.SearchAnalyticsRepositoryImpl", f = "SearchAnalyticsRepository.kt", l = {14}, m = "sendSearchAnalytics-0E7RQCE")
/* loaded from: classes13.dex */
final class SearchAnalyticsRepositoryImpl$sendSearchAnalytics$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchAnalyticsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchAnalyticsRepositoryImpl$sendSearchAnalytics$1(SearchAnalyticsRepositoryImpl searchAnalyticsRepositoryImpl, d<? super SearchAnalyticsRepositoryImpl$sendSearchAnalytics$1> dVar) {
        super(dVar);
        this.this$0 = searchAnalyticsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo971sendSearchAnalytics0E7RQCE = this.this$0.mo971sendSearchAnalytics0E7RQCE(null, null, this);
        return mo971sendSearchAnalytics0E7RQCE == a.COROUTINE_SUSPENDED ? mo971sendSearchAnalytics0E7RQCE : r.a(mo971sendSearchAnalytics0E7RQCE);
    }
}
