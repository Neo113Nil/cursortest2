package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeImItem implements SchemeStat$TypeClick.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("contact_group_vkapp_link")
        public static final Subtype CONTACT_GROUP_VKAPP_LINK;

        @pmi0("contact_user_vkapp_link")
        public static final Subtype CONTACT_USER_VKAPP_LINK;

        @pmi0("disappearing_chat_placeholder")
        public static final Subtype DISAPPEARING_CHAT_PLACEHOLDER;

        @pmi0("disappearing_message_placeholder")
        public static final Subtype DISAPPEARING_MESSAGE_PLACEHOLDER;

        @pmi0("filter_all")
        public static final Subtype FILTER_ALL;

        @pmi0("filter_unread")
        public static final Subtype FILTER_UNREAD;

        @pmi0("history_attach_post_button")
        public static final Subtype HISTORY_ATTACH_POST_BUTTON;

        @pmi0("one_time_story_placeholder")
        public static final Subtype ONE_TIME_STORY_PLACEHOLDER;

        @pmi0("peer_list_vkapp_bar_item")
        public static final Subtype PEER_LIST_VKAPP_BAR_ITEM;

        @pmi0("peer_list_vkapp_swipe")
        public static final Subtype PEER_LIST_VKAPP_SWIPE;

        @pmi0("vkme_stickers_placeholder")
        public static final Subtype VKME_STICKERS_PLACEHOLDER;

        static {
            Subtype subtype = new Subtype("DISAPPEARING_CHAT_PLACEHOLDER", 0);
            DISAPPEARING_CHAT_PLACEHOLDER = subtype;
            Subtype subtype2 = new Subtype("ONE_TIME_STORY_PLACEHOLDER", 1);
            ONE_TIME_STORY_PLACEHOLDER = subtype2;
            Subtype subtype3 = new Subtype("DISAPPEARING_MESSAGE_PLACEHOLDER", 2);
            DISAPPEARING_MESSAGE_PLACEHOLDER = subtype3;
            Subtype subtype4 = new Subtype("VKME_STICKERS_PLACEHOLDER", 3);
            VKME_STICKERS_PLACEHOLDER = subtype4;
            Subtype subtype5 = new Subtype("PEER_LIST_VKAPP_BAR_ITEM", 4);
            PEER_LIST_VKAPP_BAR_ITEM = subtype5;
            Subtype subtype6 = new Subtype("PEER_LIST_VKAPP_SWIPE", 5);
            PEER_LIST_VKAPP_SWIPE = subtype6;
            Subtype subtype7 = new Subtype("HISTORY_ATTACH_POST_BUTTON", 6);
            HISTORY_ATTACH_POST_BUTTON = subtype7;
            Subtype subtype8 = new Subtype("CONTACT_USER_VKAPP_LINK", 7);
            CONTACT_USER_VKAPP_LINK = subtype8;
            Subtype subtype9 = new Subtype("CONTACT_GROUP_VKAPP_LINK", 8);
            CONTACT_GROUP_VKAPP_LINK = subtype9;
            Subtype subtype10 = new Subtype("FILTER_ALL", 9);
            FILTER_ALL = subtype10;
            Subtype subtype11 = new Subtype("FILTER_UNREAD", 10);
            FILTER_UNREAD = subtype11;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8, subtype9, subtype10, subtype11};
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

    public SchemeStat$TypeImItem(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeImItem) && this.subtype == ((SchemeStat$TypeImItem) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeImItem(subtype=" + this.subtype + ')';
    }
}
