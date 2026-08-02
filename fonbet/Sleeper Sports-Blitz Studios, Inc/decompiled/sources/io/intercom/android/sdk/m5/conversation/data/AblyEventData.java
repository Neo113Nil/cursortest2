package io.intercom.android.sdk.m5.conversation.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.Part;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParsedAblyEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/AblyEventData;", "", "conversationId", "", "conversationPart", "Lio/intercom/android/sdk/models/Part$Builder;", "conversation", "<init>", "(JLio/intercom/android/sdk/models/Part$Builder;Ljava/lang/Object;)V", "getConversationId", "()J", "getConversationPart", "()Lio/intercom/android/sdk/models/Part$Builder;", "getConversation", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AblyEventData {
    public static final int $stable = 8;

    @SerializedName("conversation")
    private final Object conversation;

    @SerializedName("conversationId")
    private final long conversationId;

    @SerializedName("mobileConversationPart")
    private final Part.Builder conversationPart;

    public static /* synthetic */ AblyEventData copy$default(AblyEventData ablyEventData, long j, Part.Builder builder, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            j = ablyEventData.conversationId;
        }
        if ((i & 2) != 0) {
            builder = ablyEventData.conversationPart;
        }
        if ((i & 4) != 0) {
            obj = ablyEventData.conversation;
        }
        return ablyEventData.copy(j, builder, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final long getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component2, reason: from getter */
    public final Part.Builder getConversationPart() {
        return this.conversationPart;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getConversation() {
        return this.conversation;
    }

    public final AblyEventData copy(long conversationId, Part.Builder conversationPart, Object conversation) {
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        return new AblyEventData(conversationId, conversationPart, conversation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AblyEventData)) {
            return false;
        }
        AblyEventData ablyEventData = (AblyEventData) other;
        return this.conversationId == ablyEventData.conversationId && Intrinsics.areEqual(this.conversationPart, ablyEventData.conversationPart) && Intrinsics.areEqual(this.conversation, ablyEventData.conversation);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.conversationId) * 31) + this.conversationPart.hashCode()) * 31;
        Object obj = this.conversation;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "AblyEventData(conversationId=" + this.conversationId + ", conversationPart=" + this.conversationPart + ", conversation=" + this.conversation + ')';
    }

    public AblyEventData(long j, Part.Builder conversationPart, Object obj) {
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        this.conversationId = j;
        this.conversationPart = conversationPart;
        this.conversation = obj;
    }

    public /* synthetic */ AblyEventData(long j, Part.Builder builder, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, builder, (i & 4) != 0 ? null : obj);
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    public final Part.Builder getConversationPart() {
        return this.conversationPart;
    }

    public final Object getConversation() {
        return this.conversation;
    }
}
