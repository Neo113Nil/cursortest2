package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import B4.V;
import G.g;
import N3.C3660k;
import RZ.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0086\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b2\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001dR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001fR%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b7\u0010\u001f¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "", "", "productId", "actionName", "params", "", "widgetId", "widgetToken", "LRZ/b;", "pageAnalyticsInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "submitActionTrackingInfo", "customTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;LRZ/b;Ljava/util/Map;Ljava/util/Map;)V", SubmitActionPendingData.REVIEW_UUID_KEY, "appendReviewUuidToCustomTracking", "(Ljava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/lang/Long;", "component5", "component6", "()LRZ/b;", "component7", "()Ljava/util/Map;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;LRZ/b;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getActionName", "Ljava/lang/Object;", "getParams", "Ljava/lang/Long;", "getWidgetId", "getWidgetToken", "LRZ/b;", "getPageAnalyticsInfo", "Ljava/util/Map;", "getSubmitActionTrackingInfo", "getCustomTrackingInfo", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SubmitActionPendingData {

    @NotNull
    private static final String REVIEW_UUID_KEY = "reviewUuid";

    @NotNull
    private final String actionName;
    private final Map<String, Object> customTrackingInfo;
    private final b pageAnalyticsInfo;
    private final Object params;
    private final String productId;
    private final Map<String, TokenizedTrackingInfo> submitActionTrackingInfo;
    private final Long widgetId;
    private final String widgetToken;
    public static final int $stable = 8;

    public SubmitActionPendingData(String str, @NotNull String actionName, Object obj, Long l11, String str2, b bVar, Map<String, TokenizedTrackingInfo> map, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.productId = str;
        this.actionName = actionName;
        this.params = obj;
        this.widgetId = l11;
        this.widgetToken = str2;
        this.pageAnalyticsInfo = bVar;
        this.submitActionTrackingInfo = map;
        this.customTrackingInfo = map2;
    }

    public static /* synthetic */ SubmitActionPendingData copy$default(SubmitActionPendingData submitActionPendingData, String str, String str2, Object obj, Long l11, String str3, b bVar, Map map, Map map2, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = submitActionPendingData.productId;
        }
        if ((i11 & 2) != 0) {
            str2 = submitActionPendingData.actionName;
        }
        if ((i11 & 4) != 0) {
            obj = submitActionPendingData.params;
        }
        if ((i11 & 8) != 0) {
            l11 = submitActionPendingData.widgetId;
        }
        if ((i11 & 16) != 0) {
            str3 = submitActionPendingData.widgetToken;
        }
        if ((i11 & 32) != 0) {
            bVar = submitActionPendingData.pageAnalyticsInfo;
        }
        if ((i11 & 64) != 0) {
            map = submitActionPendingData.submitActionTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map2 = submitActionPendingData.customTrackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        String str4 = str3;
        b bVar2 = bVar;
        return submitActionPendingData.copy(str, str2, obj, l11, str4, bVar2, map3, map4);
    }

    @NotNull
    public final SubmitActionPendingData appendReviewUuidToCustomTracking(@NotNull String reviewUuid) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Map<String, Object> map = this.customTrackingInfo;
        if (map != null) {
            linkedHashMap = U.u(map);
            linkedHashMap.put(REVIEW_UUID_KEY, reviewUuid);
            Unit unit = Unit.f71690a;
        } else {
            linkedHashMap = null;
        }
        return copy$default(this, null, null, null, null, null, null, null, linkedHashMap, 127, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getParams() {
        return this.params;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWidgetToken() {
        return this.widgetToken;
    }

    /* renamed from: component6, reason: from getter */
    public final b getPageAnalyticsInfo() {
        return this.pageAnalyticsInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.submitActionTrackingInfo;
    }

    public final Map<String, Object> component8() {
        return this.customTrackingInfo;
    }

    @NotNull
    public final SubmitActionPendingData copy(String productId, @NotNull String actionName, Object params, Long widgetId, String widgetToken, b pageAnalyticsInfo, Map<String, TokenizedTrackingInfo> submitActionTrackingInfo, Map<String, ? extends Object> customTrackingInfo) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return new SubmitActionPendingData(productId, actionName, params, widgetId, widgetToken, pageAnalyticsInfo, submitActionTrackingInfo, customTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitActionPendingData)) {
            return false;
        }
        SubmitActionPendingData submitActionPendingData = (SubmitActionPendingData) other;
        return Intrinsics.d(this.productId, submitActionPendingData.productId) && Intrinsics.d(this.actionName, submitActionPendingData.actionName) && Intrinsics.d(this.params, submitActionPendingData.params) && Intrinsics.d(this.widgetId, submitActionPendingData.widgetId) && Intrinsics.d(this.widgetToken, submitActionPendingData.widgetToken) && Intrinsics.d(this.pageAnalyticsInfo, submitActionPendingData.pageAnalyticsInfo) && Intrinsics.d(this.submitActionTrackingInfo, submitActionPendingData.submitActionTrackingInfo) && Intrinsics.d(this.customTrackingInfo, submitActionPendingData.customTrackingInfo);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    public final Map<String, Object> getCustomTrackingInfo() {
        return this.customTrackingInfo;
    }

    public final b getPageAnalyticsInfo() {
        return this.pageAnalyticsInfo;
    }

    public final Object getParams() {
        return this.params;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Map<String, TokenizedTrackingInfo> getSubmitActionTrackingInfo() {
        return this.submitActionTrackingInfo;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public final String getWidgetToken() {
        return this.widgetToken;
    }

    public int hashCode() {
        String str = this.productId;
        int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.actionName);
        Object obj = this.params;
        int hashCode = (a11 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l11 = this.widgetId;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.widgetToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.pageAnalyticsInfo;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.submitActionTrackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.customTrackingInfo;
        return hashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.productId;
        String str2 = this.actionName;
        Object obj = this.params;
        Long l11 = this.widgetId;
        String str3 = this.widgetToken;
        b bVar = this.pageAnalyticsInfo;
        Map<String, TokenizedTrackingInfo> map = this.submitActionTrackingInfo;
        Map<String, Object> map2 = this.customTrackingInfo;
        StringBuilder d11 = C3660k.d("SubmitActionPendingData(productId=", str, ", actionName=", str2, ", params=");
        d11.append(obj);
        d11.append(", widgetId=");
        d11.append(l11);
        d11.append(", widgetToken=");
        d11.append(str3);
        d11.append(", pageAnalyticsInfo=");
        d11.append(bVar);
        d11.append(", submitActionTrackingInfo=");
        return V.c(d11, map, ", customTrackingInfo=", map2, ")");
    }
}
