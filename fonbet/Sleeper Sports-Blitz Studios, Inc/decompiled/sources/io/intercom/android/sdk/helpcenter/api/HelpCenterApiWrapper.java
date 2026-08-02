package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.protocol.Response;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: HelpCenterApiWrapper.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014J\f\u0010\u0018\u001a\u00020\f*\u00020\fH\u0002¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApiWrapper;", "", "<init>", "()V", "fetchHelpCenterCollections", "", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "collectionRequestCallback", "Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "fetchHelpCenterResultsForSearchTerm", "searchTerm", "", "searchRequestCallback", "Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;", "fetchHelpCenterCollection", "collectionId", "collectionContentRequestCallback", "Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "transformSearchResponse", "", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", Response.TYPE, "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "removeHighlightTags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HelpCenterApiWrapper {
    public static final int $stable = 0;
    public static final HelpCenterApiWrapper INSTANCE = new HelpCenterApiWrapper();

    private HelpCenterApiWrapper() {
    }

    public final void fetchHelpCenterCollections(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(collectionRequestCallback, "collectionRequestCallback");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new HelpCenterApiWrapper$fetchHelpCenterCollections$1(metricTracker, collectionRequestCallback, null), 2, null);
    }

    public final void fetchHelpCenterResultsForSearchTerm(MetricTracker metricTracker, String searchTerm, SearchRequestCallback searchRequestCallback) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
        Intrinsics.checkNotNullParameter(searchRequestCallback, "searchRequestCallback");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1(metricTracker, searchTerm, searchRequestCallback, null), 2, null);
    }

    public final void fetchHelpCenterCollection(MetricTracker metricTracker, String collectionId, CollectionContentRequestCallback collectionContentRequestCallback) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(collectionContentRequestCallback, "collectionContentRequestCallback");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new HelpCenterApiWrapper$fetchHelpCenterCollection$1(metricTracker, collectionId, collectionContentRequestCallback, null), 2, null);
    }

    public final List<HelpCenterArticleSearchResult> transformSearchResponse(List<HelpCenterArticleSearchResponse> response) {
        String title;
        Intrinsics.checkNotNullParameter(response, "response");
        List<HelpCenterArticleSearchResponse> list = response;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list) {
            String title2 = helpCenterArticleSearchResponse.getHighlight().getTitle();
            if (title2 == null || title2.length() == 0) {
                title = helpCenterArticleSearchResponse.getTitle();
            } else {
                title = helpCenterArticleSearchResponse.getHighlight().getTitle();
            }
            String summary = helpCenterArticleSearchResponse.getHighlight().getSummary();
            String str = "";
            if (summary == null) {
                summary = "";
            }
            String articleId = helpCenterArticleSearchResponse.getArticleId();
            HelpCenterApiWrapper helpCenterApiWrapper = INSTANCE;
            String removeHighlightTags = helpCenterApiWrapper.removeHighlightTags(title);
            String summary2 = helpCenterArticleSearchResponse.getSummary();
            if (summary2 != null) {
                str = summary2;
            }
            arrayList.add(new HelpCenterArticleSearchResult(articleId, removeHighlightTags, str, helpCenterApiWrapper.removeHighlightTags(summary)));
        }
        return arrayList;
    }

    private final String removeHighlightTags(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(str, "<highlight>", "", false, 4, (Object) null), "</highlight>", "", false, 4, (Object) null);
    }
}
