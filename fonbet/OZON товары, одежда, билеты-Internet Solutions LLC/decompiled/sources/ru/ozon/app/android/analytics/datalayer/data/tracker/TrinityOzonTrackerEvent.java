package ru.ozon.app.android.analytics.datalayer.data.tracker;

import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "custom", "", "widgetToken", "cellToken", "sliceToken", "userToken", "pageToken", "pageTimestamp", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "getCustom", "()Ljava/util/Map;", "setCustom", "(Ljava/util/Map;)V", "getWidgetToken", "getCellToken", "getSliceToken", "getUserToken", "getPageToken", "getPageTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "equals", "", "other", "hashCode", "", "toString", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TrinityOzonTrackerEvent {
    private String actionType;
    private final String cellToken;
    private Map<String, ? extends Object> custom;
    private final Long pageTimestamp;
    private final String pageToken;
    private final String sliceToken;
    private final String userToken;
    private final String widgetToken;

    public TrinityOzonTrackerEvent() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ TrinityOzonTrackerEvent copy$default(TrinityOzonTrackerEvent trinityOzonTrackerEvent, String str, Map map, String str2, String str3, String str4, String str5, String str6, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trinityOzonTrackerEvent.actionType;
        }
        if ((i11 & 2) != 0) {
            map = trinityOzonTrackerEvent.custom;
        }
        if ((i11 & 4) != 0) {
            str2 = trinityOzonTrackerEvent.widgetToken;
        }
        if ((i11 & 8) != 0) {
            str3 = trinityOzonTrackerEvent.cellToken;
        }
        if ((i11 & 16) != 0) {
            str4 = trinityOzonTrackerEvent.sliceToken;
        }
        if ((i11 & 32) != 0) {
            str5 = trinityOzonTrackerEvent.userToken;
        }
        if ((i11 & 64) != 0) {
            str6 = trinityOzonTrackerEvent.pageToken;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            l11 = trinityOzonTrackerEvent.pageTimestamp;
        }
        String str7 = str6;
        Long l12 = l11;
        String str8 = str4;
        String str9 = str5;
        return trinityOzonTrackerEvent.copy(str, map, str2, str3, str8, str9, str7, l12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    public final Map<String, Object> component2() {
        return this.custom;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWidgetToken() {
        return this.widgetToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCellToken() {
        return this.cellToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSliceToken() {
        return this.sliceToken;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUserToken() {
        return this.userToken;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPageToken() {
        return this.pageToken;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getPageTimestamp() {
        return this.pageTimestamp;
    }

    @NotNull
    public final TrinityOzonTrackerEvent copy(String actionType, Map<String, ? extends Object> custom, String widgetToken, String cellToken, String sliceToken, String userToken, String pageToken, Long pageTimestamp) {
        return new TrinityOzonTrackerEvent(actionType, custom, widgetToken, cellToken, sliceToken, userToken, pageToken, pageTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrinityOzonTrackerEvent)) {
            return false;
        }
        TrinityOzonTrackerEvent trinityOzonTrackerEvent = (TrinityOzonTrackerEvent) other;
        return Intrinsics.d(this.actionType, trinityOzonTrackerEvent.actionType) && Intrinsics.d(this.custom, trinityOzonTrackerEvent.custom) && Intrinsics.d(this.widgetToken, trinityOzonTrackerEvent.widgetToken) && Intrinsics.d(this.cellToken, trinityOzonTrackerEvent.cellToken) && Intrinsics.d(this.sliceToken, trinityOzonTrackerEvent.sliceToken) && Intrinsics.d(this.userToken, trinityOzonTrackerEvent.userToken) && Intrinsics.d(this.pageToken, trinityOzonTrackerEvent.pageToken) && Intrinsics.d(this.pageTimestamp, trinityOzonTrackerEvent.pageTimestamp);
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final String getCellToken() {
        return this.cellToken;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final Long getPageTimestamp() {
        return this.pageTimestamp;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final String getSliceToken() {
        return this.sliceToken;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final String getWidgetToken() {
        return this.widgetToken;
    }

    public int hashCode() {
        String str = this.actionType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, ? extends Object> map = this.custom;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.widgetToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cellToken;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sliceToken;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userToken;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pageToken;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.pageTimestamp;
        return hashCode7 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setActionType(String str) {
        this.actionType = str;
    }

    public final void setCustom(Map<String, ? extends Object> map) {
        this.custom = map;
    }

    @NotNull
    public String toString() {
        String str = this.actionType;
        Map<String, ? extends Object> map = this.custom;
        String str2 = this.widgetToken;
        String str3 = this.cellToken;
        String str4 = this.sliceToken;
        String str5 = this.userToken;
        String str6 = this.pageToken;
        Long l11 = this.pageTimestamp;
        StringBuilder sb2 = new StringBuilder("TrinityOzonTrackerEvent(actionType=");
        sb2.append(str);
        sb2.append(", custom=");
        sb2.append(map);
        sb2.append(", widgetToken=");
        a.h(sb2, str2, ", cellToken=", str3, ", sliceToken=");
        a.h(sb2, str4, ", userToken=", str5, ", pageToken=");
        sb2.append(str6);
        sb2.append(", pageTimestamp=");
        sb2.append(l11);
        sb2.append(")");
        return sb2.toString();
    }

    public TrinityOzonTrackerEvent(String str, Map<String, ? extends Object> map, String str2, String str3, String str4, String str5, String str6, Long l11) {
        this.actionType = str;
        this.custom = map;
        this.widgetToken = str2;
        this.cellToken = str3;
        this.sliceToken = str4;
        this.userToken = str5;
        this.pageToken = str6;
        this.pageTimestamp = l11;
    }

    public /* synthetic */ TrinityOzonTrackerEvent(String str, Map map, String str2, String str3, String str4, String str5, String str6, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l11);
    }
}
