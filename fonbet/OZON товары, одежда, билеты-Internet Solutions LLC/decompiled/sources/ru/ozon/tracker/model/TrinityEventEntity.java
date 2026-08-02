package ru.ozon.tracker.model;

import GR.b;
import N3.C3660k;
import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.network.serializing.date.DateTimeWithMs;
import ru.ozon.tracker.sendEvent.Cell;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÅ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010C\u001a\u00020DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020DHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\u0016\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020DR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001e¨\u0006P"}, d2 = {"Lru/ozon/tracker/model/TrinityEventEntity;", "Landroid/os/Parcelable;", "uuid", "", "number", "timestamp", "Lorg/joda/time/DateTime;", "timestampMs", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "trackCampaignUuid", "attributes", "Lru/ozon/tracker/model/TrinityAttributes;", "page", "Lru/ozon/tracker/model/TrinityPage;", "pageToken", "custom", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "widgetToken", "sliceToken", "cellToken", "userToken", "user", "Lru/ozon/tracker/model/TrinityUser;", "pageTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/TrinityAttributes;Lru/ozon/tracker/model/TrinityPage;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/TrinityUser;Lorg/joda/time/DateTime;)V", "getUuid", "()Ljava/lang/String;", "getNumber", "getTimestamp", "()Lorg/joda/time/DateTime;", "getTimestampMs$annotations", "()V", "getTimestampMs", "getActionType", "getTrackCampaignUuid", "getAttributes", "()Lru/ozon/tracker/model/TrinityAttributes;", "getPage", "()Lru/ozon/tracker/model/TrinityPage;", "getPageToken", "getCustom", "()Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "getWidgetToken", "getSliceToken", "getCellToken", "getUserToken", "getUser", "()Lru/ozon/tracker/model/TrinityUser;", "getPageTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrinityEventEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrinityEventEntity> CREATOR = new Creator();
    private final String actionType;
    private final TrinityAttributes attributes;
    private final String cellToken;
    private final Cell.CustomCell custom;
    private final String number;
    private final TrinityPage page;
    private final DateTime pageTimestamp;
    private final String pageToken;
    private final String sliceToken;

    @NotNull
    private final DateTime timestamp;

    @NotNull
    private final DateTime timestampMs;
    private final String trackCampaignUuid;
    private final TrinityUser user;
    private final String userToken;
    private final String uuid;
    private final String widgetToken;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrinityEventEntity> {
        @Override // android.os.Parcelable.Creator
        public final TrinityEventEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrinityEventEntity(parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TrinityAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TrinityPage.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Cell.CustomCell.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? TrinityUser.CREATOR.createFromParcel(parcel) : null, (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TrinityEventEntity[] newArray(int i11) {
            return new TrinityEventEntity[i11];
        }
    }

    public TrinityEventEntity(String str, String str2, @NotNull DateTime timestamp, @NotNull DateTime timestampMs, @i(name = "actionType") String str3, @i(name = "track_campaign_uuid") String str4, TrinityAttributes trinityAttributes, TrinityPage trinityPage, String str5, Cell.CustomCell customCell, String str6, String str7, String str8, String str9, TrinityUser trinityUser, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(timestampMs, "timestampMs");
        this.uuid = str;
        this.number = str2;
        this.timestamp = timestamp;
        this.timestampMs = timestampMs;
        this.actionType = str3;
        this.trackCampaignUuid = str4;
        this.attributes = trinityAttributes;
        this.page = trinityPage;
        this.pageToken = str5;
        this.custom = customCell;
        this.widgetToken = str6;
        this.sliceToken = str7;
        this.cellToken = str8;
        this.userToken = str9;
        this.user = trinityUser;
        this.pageTimestamp = dateTime;
    }

    @DateTimeWithMs
    public static /* synthetic */ void getTimestampMs$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component10, reason: from getter */
    public final Cell.CustomCell getCustom() {
        return this.custom;
    }

    /* renamed from: component11, reason: from getter */
    public final String getWidgetToken() {
        return this.widgetToken;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSliceToken() {
        return this.sliceToken;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCellToken() {
        return this.cellToken;
    }

    /* renamed from: component14, reason: from getter */
    public final String getUserToken() {
        return this.userToken;
    }

    /* renamed from: component15, reason: from getter */
    public final TrinityUser getUser() {
        return this.user;
    }

    /* renamed from: component16, reason: from getter */
    public final DateTime getPageTimestamp() {
        return this.pageTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final DateTime getTimestampMs() {
        return this.timestampMs;
    }

    /* renamed from: component5, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTrackCampaignUuid() {
        return this.trackCampaignUuid;
    }

    /* renamed from: component7, reason: from getter */
    public final TrinityAttributes getAttributes() {
        return this.attributes;
    }

    /* renamed from: component8, reason: from getter */
    public final TrinityPage getPage() {
        return this.page;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPageToken() {
        return this.pageToken;
    }

    @NotNull
    public final TrinityEventEntity copy(String uuid, String number, @NotNull DateTime timestamp, @NotNull DateTime timestampMs, @i(name = "actionType") String actionType, @i(name = "track_campaign_uuid") String trackCampaignUuid, TrinityAttributes attributes, TrinityPage page, String pageToken, Cell.CustomCell custom, String widgetToken, String sliceToken, String cellToken, String userToken, TrinityUser user, DateTime pageTimestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(timestampMs, "timestampMs");
        return new TrinityEventEntity(uuid, number, timestamp, timestampMs, actionType, trackCampaignUuid, attributes, page, pageToken, custom, widgetToken, sliceToken, cellToken, userToken, user, pageTimestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrinityEventEntity)) {
            return false;
        }
        TrinityEventEntity trinityEventEntity = (TrinityEventEntity) other;
        return Intrinsics.d(this.uuid, trinityEventEntity.uuid) && Intrinsics.d(this.number, trinityEventEntity.number) && Intrinsics.d(this.timestamp, trinityEventEntity.timestamp) && Intrinsics.d(this.timestampMs, trinityEventEntity.timestampMs) && Intrinsics.d(this.actionType, trinityEventEntity.actionType) && Intrinsics.d(this.trackCampaignUuid, trinityEventEntity.trackCampaignUuid) && Intrinsics.d(this.attributes, trinityEventEntity.attributes) && Intrinsics.d(this.page, trinityEventEntity.page) && Intrinsics.d(this.pageToken, trinityEventEntity.pageToken) && Intrinsics.d(this.custom, trinityEventEntity.custom) && Intrinsics.d(this.widgetToken, trinityEventEntity.widgetToken) && Intrinsics.d(this.sliceToken, trinityEventEntity.sliceToken) && Intrinsics.d(this.cellToken, trinityEventEntity.cellToken) && Intrinsics.d(this.userToken, trinityEventEntity.userToken) && Intrinsics.d(this.user, trinityEventEntity.user) && Intrinsics.d(this.pageTimestamp, trinityEventEntity.pageTimestamp);
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final TrinityAttributes getAttributes() {
        return this.attributes;
    }

    public final String getCellToken() {
        return this.cellToken;
    }

    public final Cell.CustomCell getCustom() {
        return this.custom;
    }

    public final String getNumber() {
        return this.number;
    }

    public final TrinityPage getPage() {
        return this.page;
    }

    public final DateTime getPageTimestamp() {
        return this.pageTimestamp;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final String getSliceToken() {
        return this.sliceToken;
    }

    @NotNull
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DateTime getTimestampMs() {
        return this.timestampMs;
    }

    public final String getTrackCampaignUuid() {
        return this.trackCampaignUuid;
    }

    public final TrinityUser getUser() {
        return this.user;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getWidgetToken() {
        return this.widgetToken;
    }

    public int hashCode() {
        String str = this.uuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        int a11 = b.a(this.timestampMs, b.a(this.timestamp, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.actionType;
        int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackCampaignUuid;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TrinityAttributes trinityAttributes = this.attributes;
        int hashCode4 = (hashCode3 + (trinityAttributes == null ? 0 : trinityAttributes.hashCode())) * 31;
        TrinityPage trinityPage = this.page;
        int hashCode5 = (hashCode4 + (trinityPage == null ? 0 : trinityPage.hashCode())) * 31;
        String str5 = this.pageToken;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Cell.CustomCell customCell = this.custom;
        int hashCode7 = (hashCode6 + (customCell == null ? 0 : customCell.hashCode())) * 31;
        String str6 = this.widgetToken;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sliceToken;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cellToken;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userToken;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        TrinityUser trinityUser = this.user;
        int hashCode12 = (hashCode11 + (trinityUser == null ? 0 : trinityUser.hashCode())) * 31;
        DateTime dateTime = this.pageTimestamp;
        return hashCode12 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.number;
        DateTime dateTime = this.timestamp;
        DateTime dateTime2 = this.timestampMs;
        String str3 = this.actionType;
        String str4 = this.trackCampaignUuid;
        TrinityAttributes trinityAttributes = this.attributes;
        TrinityPage trinityPage = this.page;
        String str5 = this.pageToken;
        Cell.CustomCell customCell = this.custom;
        String str6 = this.widgetToken;
        String str7 = this.sliceToken;
        String str8 = this.cellToken;
        String str9 = this.userToken;
        TrinityUser trinityUser = this.user;
        DateTime dateTime3 = this.pageTimestamp;
        StringBuilder d11 = C3660k.d("TrinityEventEntity(uuid=", str, ", number=", str2, ", timestamp=");
        d11.append(dateTime);
        d11.append(", timestampMs=");
        d11.append(dateTime2);
        d11.append(", actionType=");
        a.h(d11, str3, ", trackCampaignUuid=", str4, ", attributes=");
        d11.append(trinityAttributes);
        d11.append(", page=");
        d11.append(trinityPage);
        d11.append(", pageToken=");
        d11.append(str5);
        d11.append(", custom=");
        d11.append(customCell);
        d11.append(", widgetToken=");
        a.h(d11, str6, ", sliceToken=", str7, ", cellToken=");
        a.h(d11, str8, ", userToken=", str9, ", user=");
        d11.append(trinityUser);
        d11.append(", pageTimestamp=");
        d11.append(dateTime3);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.uuid);
        dest.writeString(this.number);
        dest.writeSerializable(this.timestamp);
        dest.writeSerializable(this.timestampMs);
        dest.writeString(this.actionType);
        dest.writeString(this.trackCampaignUuid);
        TrinityAttributes trinityAttributes = this.attributes;
        if (trinityAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            trinityAttributes.writeToParcel(dest, flags);
        }
        TrinityPage trinityPage = this.page;
        if (trinityPage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            trinityPage.writeToParcel(dest, flags);
        }
        dest.writeString(this.pageToken);
        Cell.CustomCell customCell = this.custom;
        if (customCell == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customCell.writeToParcel(dest, flags);
        }
        dest.writeString(this.widgetToken);
        dest.writeString(this.sliceToken);
        dest.writeString(this.cellToken);
        dest.writeString(this.userToken);
        TrinityUser trinityUser = this.user;
        if (trinityUser == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            trinityUser.writeToParcel(dest, flags);
        }
        dest.writeSerializable(this.pageTimestamp);
    }

    public /* synthetic */ TrinityEventEntity(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, TrinityAttributes trinityAttributes, TrinityPage trinityPage, String str5, Cell.CustomCell customCell, String str6, String str7, String str8, String str9, TrinityUser trinityUser, DateTime dateTime3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, dateTime, dateTime2, str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : trinityAttributes, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : trinityPage, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : customCell, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str6, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? null : str8, (i11 & 8192) != 0 ? null : str9, (i11 & 16384) != 0 ? null : trinityUser, (i11 & 32768) != 0 ? null : dateTime3);
    }
}
