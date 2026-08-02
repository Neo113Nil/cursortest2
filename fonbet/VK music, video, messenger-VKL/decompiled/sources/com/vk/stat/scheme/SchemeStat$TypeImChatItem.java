package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeImChatItem implements SchemeStat$TypeClick.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("allow_messages")
        public static final Subtype ALLOW_MESSAGES;

        @pmi0("block_messages")
        public static final Subtype BLOCK_MESSAGES;

        @pmi0("chat_menu_open")
        public static final Subtype CHAT_MENU_OPEN;

        @pmi0("clear_history")
        public static final Subtype CLEAR_HISTORY;

        @pmi0("disable_notifications")
        public static final Subtype DISABLE_NOTIFICATIONS;

        @pmi0("enable_notifications")
        public static final Subtype ENABLE_NOTIFICATIONS;

        @pmi0("pin_to_chat_list")
        public static final Subtype PIN_TO_CHAT_LIST;

        @pmi0("unpin_from_chat_list")
        public static final Subtype UNPIN_FROM_CHAT_LIST;

        static {
            Subtype subtype = new Subtype("CHAT_MENU_OPEN", 0);
            CHAT_MENU_OPEN = subtype;
            Subtype subtype2 = new Subtype("PIN_TO_CHAT_LIST", 1);
            PIN_TO_CHAT_LIST = subtype2;
            Subtype subtype3 = new Subtype("UNPIN_FROM_CHAT_LIST", 2);
            UNPIN_FROM_CHAT_LIST = subtype3;
            Subtype subtype4 = new Subtype("ENABLE_NOTIFICATIONS", 3);
            ENABLE_NOTIFICATIONS = subtype4;
            Subtype subtype5 = new Subtype("DISABLE_NOTIFICATIONS", 4);
            DISABLE_NOTIFICATIONS = subtype5;
            Subtype subtype6 = new Subtype("CLEAR_HISTORY", 5);
            CLEAR_HISTORY = subtype6;
            Subtype subtype7 = new Subtype("ALLOW_MESSAGES", 6);
            ALLOW_MESSAGES = subtype7;
            Subtype subtype8 = new Subtype("BLOCK_MESSAGES", 7);
            BLOCK_MESSAGES = subtype8;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeImChatItem(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeImChatItem) && this.subtype == ((SchemeStat$TypeImChatItem) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeImChatItem(subtype=" + this.subtype + ')';
    }
}
