package io.intercom.android.sdk.m5.conversation.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConversationRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_COMMENT", "NEXUS_CONNECTED", "NETWORK_CONNECTED", "OPEN_CONVERSATION", "POLLING", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetConversationReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GetConversationReason[] $VALUES;
    public static final GetConversationReason NEW_COMMENT = new GetConversationReason("NEW_COMMENT", 0);
    public static final GetConversationReason NEXUS_CONNECTED = new GetConversationReason("NEXUS_CONNECTED", 1);
    public static final GetConversationReason NETWORK_CONNECTED = new GetConversationReason("NETWORK_CONNECTED", 2);
    public static final GetConversationReason OPEN_CONVERSATION = new GetConversationReason("OPEN_CONVERSATION", 3);
    public static final GetConversationReason POLLING = new GetConversationReason("POLLING", 4);

    private static final /* synthetic */ GetConversationReason[] $values() {
        return new GetConversationReason[]{NEW_COMMENT, NEXUS_CONNECTED, NETWORK_CONNECTED, OPEN_CONVERSATION, POLLING};
    }

    public static EnumEntries<GetConversationReason> getEntries() {
        return $ENTRIES;
    }

    private GetConversationReason(String str, int i) {
    }

    static {
        GetConversationReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static GetConversationReason valueOf(String str) {
        return (GetConversationReason) Enum.valueOf(GetConversationReason.class, str);
    }

    public static GetConversationReason[] values() {
        return (GetConversationReason[]) $VALUES.clone();
    }
}
