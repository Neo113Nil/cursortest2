package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$BestFriendEvent {

    @pmi0("best_friend_event_type")
    private final BestFriendEventType bestFriendEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class BestFriendEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BestFriendEventType[] $VALUES;

        @pmi0("add_friends_from_chat")
        public static final BestFriendEventType ADD_FRIENDS_FROM_CHAT;

        @pmi0("clear")
        public static final BestFriendEventType CLEAR;

        @pmi0("click_to_best_friends_entrypoint")
        public static final BestFriendEventType CLICK_TO_BEST_FRIENDS_ENTRYPOINT;

        @pmi0("click_to_lock_best_friends")
        public static final BestFriendEventType CLICK_TO_LOCK_BEST_FRIENDS;

        @pmi0("click_to_lock_friends")
        public static final BestFriendEventType CLICK_TO_LOCK_FRIENDS;

        @pmi0("create_post_from_popup_best")
        public static final BestFriendEventType CREATE_POST_FROM_POPUP_BEST;

        @pmi0("create_post_from_popup_friends")
        public static final BestFriendEventType CREATE_POST_FROM_POPUP_FRIENDS;

        @pmi0("edit_best_friends")
        public static final BestFriendEventType EDIT_BEST_FRIENDS;

        @pmi0("edit_best_friends_from_popup")
        public static final BestFriendEventType EDIT_BEST_FRIENDS_FROM_POPUP;

        @pmi0("more_chats")
        public static final BestFriendEventType MORE_CHATS;

        @pmi0("save_best_friends_list")
        public static final BestFriendEventType SAVE_BEST_FRIENDS_LIST;

        @pmi0("select_best_freinds")
        public static final BestFriendEventType SELECT_BEST_FREINDS;

        @pmi0("select_chat_from_search")
        public static final BestFriendEventType SELECT_CHAT_FROM_SEARCH;

        @pmi0("select_friend_from_search")
        public static final BestFriendEventType SELECT_FRIEND_FROM_SEARCH;

        @pmi0("update_popup_cancel")
        public static final BestFriendEventType UPDATE_POPUP_CANCEL;

        @pmi0("update_popup_save")
        public static final BestFriendEventType UPDATE_POPUP_SAVE;

        static {
            BestFriendEventType bestFriendEventType = new BestFriendEventType("SELECT_FRIEND_FROM_SEARCH", 0);
            SELECT_FRIEND_FROM_SEARCH = bestFriendEventType;
            BestFriendEventType bestFriendEventType2 = new BestFriendEventType("SELECT_CHAT_FROM_SEARCH", 1);
            SELECT_CHAT_FROM_SEARCH = bestFriendEventType2;
            BestFriendEventType bestFriendEventType3 = new BestFriendEventType("SELECT_BEST_FREINDS", 2);
            SELECT_BEST_FREINDS = bestFriendEventType3;
            BestFriendEventType bestFriendEventType4 = new BestFriendEventType("SAVE_BEST_FRIENDS_LIST", 3);
            SAVE_BEST_FRIENDS_LIST = bestFriendEventType4;
            BestFriendEventType bestFriendEventType5 = new BestFriendEventType("MORE_CHATS", 4);
            MORE_CHATS = bestFriendEventType5;
            BestFriendEventType bestFriendEventType6 = new BestFriendEventType("EDIT_BEST_FRIENDS_FROM_POPUP", 5);
            EDIT_BEST_FRIENDS_FROM_POPUP = bestFriendEventType6;
            BestFriendEventType bestFriendEventType7 = new BestFriendEventType("EDIT_BEST_FRIENDS", 6);
            EDIT_BEST_FRIENDS = bestFriendEventType7;
            BestFriendEventType bestFriendEventType8 = new BestFriendEventType("CREATE_POST_FROM_POPUP_FRIENDS", 7);
            CREATE_POST_FROM_POPUP_FRIENDS = bestFriendEventType8;
            BestFriendEventType bestFriendEventType9 = new BestFriendEventType("CREATE_POST_FROM_POPUP_BEST", 8);
            CREATE_POST_FROM_POPUP_BEST = bestFriendEventType9;
            BestFriendEventType bestFriendEventType10 = new BestFriendEventType("CLICK_TO_LOCK_FRIENDS", 9);
            CLICK_TO_LOCK_FRIENDS = bestFriendEventType10;
            BestFriendEventType bestFriendEventType11 = new BestFriendEventType("CLICK_TO_LOCK_BEST_FRIENDS", 10);
            CLICK_TO_LOCK_BEST_FRIENDS = bestFriendEventType11;
            BestFriendEventType bestFriendEventType12 = new BestFriendEventType("CLICK_TO_BEST_FRIENDS_ENTRYPOINT", 11);
            CLICK_TO_BEST_FRIENDS_ENTRYPOINT = bestFriendEventType12;
            BestFriendEventType bestFriendEventType13 = new BestFriendEventType("CLEAR", 12);
            CLEAR = bestFriendEventType13;
            BestFriendEventType bestFriendEventType14 = new BestFriendEventType("ADD_FRIENDS_FROM_CHAT", 13);
            ADD_FRIENDS_FROM_CHAT = bestFriendEventType14;
            BestFriendEventType bestFriendEventType15 = new BestFriendEventType("UPDATE_POPUP_SAVE", 14);
            UPDATE_POPUP_SAVE = bestFriendEventType15;
            BestFriendEventType bestFriendEventType16 = new BestFriendEventType("UPDATE_POPUP_CANCEL", 15);
            UPDATE_POPUP_CANCEL = bestFriendEventType16;
            BestFriendEventType[] bestFriendEventTypeArr = {bestFriendEventType, bestFriendEventType2, bestFriendEventType3, bestFriendEventType4, bestFriendEventType5, bestFriendEventType6, bestFriendEventType7, bestFriendEventType8, bestFriendEventType9, bestFriendEventType10, bestFriendEventType11, bestFriendEventType12, bestFriendEventType13, bestFriendEventType14, bestFriendEventType15, bestFriendEventType16};
            $VALUES = bestFriendEventTypeArr;
            $ENTRIES = new asp(bestFriendEventTypeArr);
        }

        private BestFriendEventType(String str, int i) {
        }

        public static BestFriendEventType valueOf(String str) {
            return (BestFriendEventType) Enum.valueOf(BestFriendEventType.class, str);
        }

        public static BestFriendEventType[] values() {
            return (BestFriendEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$BestFriendEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$BestFriendEvent) && this.bestFriendEventType == ((MobileOfficialAppsConPostingStat$BestFriendEvent) obj).bestFriendEventType;
    }

    public final int hashCode() {
        BestFriendEventType bestFriendEventType = this.bestFriendEventType;
        if (bestFriendEventType == null) {
            return 0;
        }
        return bestFriendEventType.hashCode();
    }

    public final String toString() {
        return "BestFriendEvent(bestFriendEventType=" + this.bestFriendEventType + ')';
    }

    public MobileOfficialAppsConPostingStat$BestFriendEvent(BestFriendEventType bestFriendEventType) {
        this.bestFriendEventType = bestFriendEventType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$BestFriendEvent(BestFriendEventType bestFriendEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bestFriendEventType);
    }
}
