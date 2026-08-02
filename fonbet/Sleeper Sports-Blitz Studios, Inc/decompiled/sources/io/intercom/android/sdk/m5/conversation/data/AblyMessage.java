package io.intercom.android.sdk.m5.conversation.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParsedAblyEvent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/AblyMessage;", "", "eventName", "", "eventData", "Lio/intercom/android/sdk/m5/conversation/data/AblyEventData;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/data/AblyEventData;)V", "getEventName", "()Ljava/lang/String;", "getEventData", "()Lio/intercom/android/sdk/m5/conversation/data/AblyEventData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AblyMessage {
    public static final int $stable = 8;

    @SerializedName("eventData")
    private final AblyEventData eventData;

    @SerializedName("eventName")
    private final String eventName;

    public static /* synthetic */ AblyMessage copy$default(AblyMessage ablyMessage, String str, AblyEventData ablyEventData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ablyMessage.eventName;
        }
        if ((i & 2) != 0) {
            ablyEventData = ablyMessage.eventData;
        }
        return ablyMessage.copy(str, ablyEventData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final AblyEventData getEventData() {
        return this.eventData;
    }

    public final AblyMessage copy(String eventName, AblyEventData eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        return new AblyMessage(eventName, eventData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AblyMessage)) {
            return false;
        }
        AblyMessage ablyMessage = (AblyMessage) other;
        return Intrinsics.areEqual(this.eventName, ablyMessage.eventName) && Intrinsics.areEqual(this.eventData, ablyMessage.eventData);
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.eventData.hashCode();
    }

    public String toString() {
        return "AblyMessage(eventName=" + this.eventName + ", eventData=" + this.eventData + ')';
    }

    public AblyMessage(String eventName, AblyEventData eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.eventName = eventName;
        this.eventData = eventData;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final AblyEventData getEventData() {
        return this.eventData;
    }
}
