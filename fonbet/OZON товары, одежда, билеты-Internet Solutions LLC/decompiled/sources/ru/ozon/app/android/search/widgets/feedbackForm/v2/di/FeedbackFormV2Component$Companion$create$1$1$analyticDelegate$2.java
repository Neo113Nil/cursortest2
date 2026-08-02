package ru.ozon.app.android.search.widgets.feedbackForm.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics.SearchAnalyticsApi;
import ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics.SearchAnalyticsRepositoryImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FeedbackFormV2Component$Companion$create$1$1$analyticDelegate$2 extends AbstractC7737t implements Function0<FeedbackAnalyticDelegate> {
    final /* synthetic */ FeedbackFormV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackFormV2Component$Companion$create$1$1$analyticDelegate$2(FeedbackFormV2Component$Companion$create$1$1 feedbackFormV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = feedbackFormV2Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedbackAnalyticDelegate invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        Object create = networkComponentApi.getRetrofit().create(SearchAnalyticsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new FeedbackAnalyticDelegate(new SearchAnalyticsRepositoryImpl((SearchAnalyticsApi) create));
    }
}
