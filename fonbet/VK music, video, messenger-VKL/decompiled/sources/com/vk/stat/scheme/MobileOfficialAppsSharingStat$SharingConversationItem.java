package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$SharingConversationItem {

    @pmi0("conversation_id")
    private final long conversationId;

    @pmi0("conversation_idnum")
    private final long conversationIdnum;

    @pmi0("conversation_type")
    private final ConversationType conversationType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class ConversationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConversationType[] $VALUES;

        @pmi0("chat")
        public static final ConversationType CHAT;

        @pmi0("community")
        public static final ConversationType COMMUNITY;

        @pmi0("user")
        public static final ConversationType USER;

        static {
            ConversationType conversationType = new ConversationType("USER", 0);
            USER = conversationType;
            ConversationType conversationType2 = new ConversationType("CHAT", 1);
            CHAT = conversationType2;
            ConversationType conversationType3 = new ConversationType("COMMUNITY", 2);
            COMMUNITY = conversationType3;
            ConversationType[] conversationTypeArr = {conversationType, conversationType2, conversationType3};
            $VALUES = conversationTypeArr;
            $ENTRIES = new asp(conversationTypeArr);
        }

        private ConversationType(String str, int i) {
        }

        public static ConversationType valueOf(String str) {
            return (ConversationType) Enum.valueOf(ConversationType.class, str);
        }

        public static ConversationType[] values() {
            return (ConversationType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSharingStat$SharingConversationItem(long j, ConversationType conversationType, long j2) {
        this.conversationId = j;
        this.conversationType = conversationType;
        this.conversationIdnum = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSharingStat$SharingConversationItem)) {
            return false;
        }
        MobileOfficialAppsSharingStat$SharingConversationItem mobileOfficialAppsSharingStat$SharingConversationItem = (MobileOfficialAppsSharingStat$SharingConversationItem) obj;
        return this.conversationId == mobileOfficialAppsSharingStat$SharingConversationItem.conversationId && this.conversationType == mobileOfficialAppsSharingStat$SharingConversationItem.conversationType && this.conversationIdnum == mobileOfficialAppsSharingStat$SharingConversationItem.conversationIdnum;
    }

    public final int hashCode() {
        return Long.hashCode(this.conversationIdnum) + ((this.conversationType.hashCode() + (Long.hashCode(this.conversationId) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharingConversationItem(conversationId=");
        sb.append(this.conversationId);
        sb.append(", conversationType=");
        sb.append(this.conversationType);
        sb.append(", conversationIdnum=");
        return vu5.a(')', this.conversationIdnum, sb);
    }
}
