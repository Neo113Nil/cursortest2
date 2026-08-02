package ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics;

import Nh.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRequest;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "payload", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getActionType", "()Ljava/lang/String;", "getPayload", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchAnalyticsRequest {
    public static final int $stable = 8;

    @NotNull
    private final String actionType;
    private final Map<String, String> payload;

    public SearchAnalyticsRequest(@NotNull String actionType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.actionType = actionType;
        this.payload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchAnalyticsRequest copy$default(SearchAnalyticsRequest searchAnalyticsRequest, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchAnalyticsRequest.actionType;
        }
        if ((i11 & 2) != 0) {
            map = searchAnalyticsRequest.payload;
        }
        return searchAnalyticsRequest.copy(str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    public final Map<String, String> component2() {
        return this.payload;
    }

    @NotNull
    public final SearchAnalyticsRequest copy(@NotNull String actionType, Map<String, String> payload) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return new SearchAnalyticsRequest(actionType, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAnalyticsRequest)) {
            return false;
        }
        SearchAnalyticsRequest searchAnalyticsRequest = (SearchAnalyticsRequest) other;
        return Intrinsics.d(this.actionType, searchAnalyticsRequest.actionType) && Intrinsics.d(this.payload, searchAnalyticsRequest.payload);
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int hashCode = this.actionType.hashCode() * 31;
        Map<String, String> map = this.payload;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return a.d("SearchAnalyticsRequest(actionType=", this.actionType, ", payload=", ")", this.payload);
    }
}
