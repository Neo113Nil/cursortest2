package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.sentry.clientreport.DiscardedEvent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEndedButton.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/ConversationEndedButton;", "", "message", "", "ctaTitle", DiscardedEvent.JsonKeys.REASON, "Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;", "metadata", "Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;)V", "getMessage", "()Ljava/lang/String;", "getCtaTitle", "getReason", "()Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;", "getMetadata", "()Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Metadata", "Reason", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConversationEndedButton {
    public static final int $stable = 0;

    @SerializedName("text")
    private final String ctaTitle;

    @SerializedName("title")
    private final String message;
    private final Metadata metadata;
    private final Reason reason;

    public static /* synthetic */ ConversationEndedButton copy$default(ConversationEndedButton conversationEndedButton, String str, String str2, Reason reason, Metadata metadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationEndedButton.message;
        }
        if ((i & 2) != 0) {
            str2 = conversationEndedButton.ctaTitle;
        }
        if ((i & 4) != 0) {
            reason = conversationEndedButton.reason;
        }
        if ((i & 8) != 0) {
            metadata = conversationEndedButton.metadata;
        }
        return conversationEndedButton.copy(str, str2, reason, metadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    /* renamed from: component4, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final ConversationEndedButton copy(String message, String ctaTitle, Reason reason, Metadata metadata) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ConversationEndedButton(message, ctaTitle, reason, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationEndedButton)) {
            return false;
        }
        ConversationEndedButton conversationEndedButton = (ConversationEndedButton) other;
        return Intrinsics.areEqual(this.message, conversationEndedButton.message) && Intrinsics.areEqual(this.ctaTitle, conversationEndedButton.ctaTitle) && this.reason == conversationEndedButton.reason && Intrinsics.areEqual(this.metadata, conversationEndedButton.metadata);
    }

    public int hashCode() {
        int hashCode = ((((this.message.hashCode() * 31) + this.ctaTitle.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Metadata metadata = this.metadata;
        return hashCode + (metadata == null ? 0 : metadata.hashCode());
    }

    public String toString() {
        return "ConversationEndedButton(message=" + this.message + ", ctaTitle=" + this.ctaTitle + ", reason=" + this.reason + ", metadata=" + this.metadata + ')';
    }

    public ConversationEndedButton(String message, String ctaTitle, Reason reason, Metadata metadata) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.ctaTitle = ctaTitle;
        this.reason = reason;
        this.metadata = metadata;
    }

    public /* synthetic */ ConversationEndedButton(String str, String str2, Reason reason, Metadata metadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, reason, (i & 8) != 0 ? null : metadata);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final Reason getReason() {
        return this.reason;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    /* compiled from: ConversationEndedButton.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/ConversationEndedButton$Metadata;", "", "mergedIntoConversationId", "", "<init>", "(Ljava/lang/String;)V", "getMergedIntoConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metadata {
        public static final int $stable = 0;

        @SerializedName("merged_into_conversation_id")
        private final String mergedIntoConversationId;

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.mergedIntoConversationId;
            }
            return metadata.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMergedIntoConversationId() {
            return this.mergedIntoConversationId;
        }

        public final Metadata copy(String mergedIntoConversationId) {
            Intrinsics.checkNotNullParameter(mergedIntoConversationId, "mergedIntoConversationId");
            return new Metadata(mergedIntoConversationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Metadata) && Intrinsics.areEqual(this.mergedIntoConversationId, ((Metadata) other).mergedIntoConversationId);
        }

        public int hashCode() {
            return this.mergedIntoConversationId.hashCode();
        }

        public String toString() {
            return "Metadata(mergedIntoConversationId=" + this.mergedIntoConversationId + ')';
        }

        public Metadata(String mergedIntoConversationId) {
            Intrinsics.checkNotNullParameter(mergedIntoConversationId, "mergedIntoConversationId");
            this.mergedIntoConversationId = mergedIntoConversationId;
        }

        public final String getMergedIntoConversationId() {
            return this.mergedIntoConversationId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConversationEndedButton.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/ConversationEndedButton$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "MERGED_INTO_CONVERSATION", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Reason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason UNKNOWN = new Reason("UNKNOWN", 0);

        @SerializedName("merged_into_conversation")
        public static final Reason MERGED_INTO_CONVERSATION = new Reason("MERGED_INTO_CONVERSATION", 1);

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{UNKNOWN, MERGED_INTO_CONVERSATION};
        }

        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }

        private Reason(String str, int i) {
        }

        static {
            Reason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }
}
