package com.giphy.sdk.analytics.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.analytics.models.enums.EventType;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012(\b\u0002\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u001eH\u0016J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006)"}, d2 = {"Lcom/giphy/sdk/analytics/models/AnalyticsEvent;", "Landroid/os/Parcelable;", "analyticsResponsePayload", "", "eventType", "Lcom/giphy/sdk/analytics/models/enums/EventType;", "actionType", "Lcom/giphy/sdk/analytics/models/enums/ActionType;", "gifId", "tid", "ts", "", "attributes", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "userId", "loggedInUserId", "randomId", "(Ljava/lang/String;Lcom/giphy/sdk/analytics/models/enums/EventType;Lcom/giphy/sdk/analytics/models/enums/ActionType;Ljava/lang/String;Ljava/lang/String;JLjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionType", "()Lcom/giphy/sdk/analytics/models/enums/ActionType;", "getEventType", "()Lcom/giphy/sdk/analytics/models/enums/EventType;", "getGifId", "()Ljava/lang/String;", "getRandomId", "setRandomId", "(Ljava/lang/String;)V", "getUserId", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsEvent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AnalyticsEvent> CREATOR = new Creator();

    @c("action_type")
    @Nullable
    private final ActionType actionType;

    @c("analytics_response_payload")
    @NotNull
    private final String analyticsResponsePayload;

    @Nullable
    private final HashMap<String, String> attributes;

    @c(EventKeys.CALL_MESSAGE_EVENT_TYPE)
    @Nullable
    private final EventType eventType;

    @c("gif_id")
    @Nullable
    private final String gifId;

    @c("logged_in_user_id")
    @Nullable
    private final String loggedInUserId;

    @c("random_id")
    @Nullable
    private String randomId;

    @Nullable
    private final String tid;
    private final long ts;

    @c("user_id")
    @Nullable
    private final String userId;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsEvent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            HashMap hashMap = null;
            EventType valueOf = parcel.readInt() == 0 ? null : EventType.valueOf(parcel.readString());
            ActionType valueOf2 = parcel.readInt() == 0 ? null : ActionType.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                hashMap = new HashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new AnalyticsEvent(readString, valueOf, valueOf2, readString2, readString3, readLong, hashMap, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsEvent[] newArray(int i10) {
            return new AnalyticsEvent[i10];
        }
    }

    public AnalyticsEvent(@NotNull String analyticsResponsePayload, @Nullable EventType eventType, @Nullable ActionType actionType, @Nullable String str, @Nullable String str2, long j10, @Nullable HashMap<String, String> hashMap, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(analyticsResponsePayload, "analyticsResponsePayload");
        this.analyticsResponsePayload = analyticsResponsePayload;
        this.eventType = eventType;
        this.actionType = actionType;
        this.gifId = str;
        this.tid = str2;
        this.ts = j10;
        this.attributes = hashMap;
        this.userId = str3;
        this.loggedInUserId = str4;
        this.randomId = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AnalyticsEvent.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.giphy.sdk.analytics.models.AnalyticsEvent");
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) other;
        return Intrinsics.areEqual(this.randomId, analyticsEvent.randomId) && Intrinsics.areEqual(this.loggedInUserId, analyticsEvent.loggedInUserId) && Intrinsics.areEqual(this.userId, analyticsEvent.userId) && this.ts == analyticsEvent.ts && Intrinsics.areEqual(this.tid, analyticsEvent.tid) && this.actionType == analyticsEvent.actionType && this.eventType == analyticsEvent.eventType && Intrinsics.areEqual(this.analyticsResponsePayload, analyticsEvent.analyticsResponsePayload);
    }

    @Nullable
    public final ActionType getActionType() {
        return this.actionType;
    }

    @Nullable
    public final EventType getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getGifId() {
        return this.gifId;
    }

    @Nullable
    public final String getRandomId() {
        return this.randomId;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.randomId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.loggedInUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.userId;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.ts)) * 31;
        String str4 = this.tid;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.gifId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        ActionType actionType = this.actionType;
        int hashCode6 = (hashCode5 + (actionType != null ? actionType.hashCode() : 0)) * 31;
        EventType eventType = this.eventType;
        return ((hashCode6 + (eventType != null ? eventType.hashCode() : 0)) * 31) + this.analyticsResponsePayload.hashCode();
    }

    public final void setRandomId(@Nullable String str) {
        this.randomId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.analyticsResponsePayload);
        EventType eventType = this.eventType;
        if (eventType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eventType.name());
        }
        ActionType actionType = this.actionType;
        if (actionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(actionType.name());
        }
        parcel.writeString(this.gifId);
        parcel.writeString(this.tid);
        parcel.writeLong(this.ts);
        HashMap<String, String> hashMap = this.attributes;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.userId);
        parcel.writeString(this.loggedInUserId);
        parcel.writeString(this.randomId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AnalyticsEvent(String str, EventType eventType, ActionType actionType, String str2, String str3, long j10, HashMap hashMap, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eventType, actionType, str2, str3, j10, r10, r11, r12, r13);
        String str7;
        String str8;
        String str9;
        HashMap hashMap2;
        eventType = (i10 & 2) != 0 ? null : eventType;
        actionType = (i10 & 4) != 0 ? null : actionType;
        str2 = (i10 & 8) != 0 ? null : str2;
        str3 = (i10 & 16) != 0 ? null : str3;
        j10 = (i10 & 32) != 0 ? 0L : j10;
        if ((i10 & 64) != 0) {
            str7 = str6;
            str8 = str5;
            str9 = str4;
            hashMap2 = null;
        } else {
            str7 = str6;
            str8 = str5;
            str9 = str4;
            hashMap2 = hashMap;
        }
    }
}
