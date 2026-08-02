package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("from_comments_donut")
        public static final EntryPoint FROM_COMMENTS_DONUT;

        @pmi0("from_comments_modal")
        public static final EntryPoint FROM_COMMENTS_MODAL;

        @pmi0("from_footer_donut")
        public static final EntryPoint FROM_FOOTER_DONUT;

        @pmi0("from_footer_like")
        public static final EntryPoint FROM_FOOTER_LIKE;

        @pmi0("from_friends_icon_likes")
        public static final EntryPoint FROM_FRIENDS_ICON_LIKES;

        @pmi0("from_friends_text_likes")
        public static final EntryPoint FROM_FRIENDS_TEXT_LIKES;

        @pmi0("from_post_screen")
        public static final EntryPoint FROM_POST_SCREEN;

        static {
            EntryPoint entryPoint = new EntryPoint("FROM_COMMENTS_MODAL", 0);
            FROM_COMMENTS_MODAL = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("FROM_FOOTER_LIKE", 1);
            FROM_FOOTER_LIKE = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("FROM_FOOTER_DONUT", 2);
            FROM_FOOTER_DONUT = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("FROM_POST_SCREEN", 3);
            FROM_POST_SCREEN = entryPoint4;
            EntryPoint entryPoint5 = new EntryPoint("FROM_COMMENTS_DONUT", 4);
            FROM_COMMENTS_DONUT = entryPoint5;
            EntryPoint entryPoint6 = new EntryPoint("FROM_FRIENDS_TEXT_LIKES", 5);
            FROM_FRIENDS_TEXT_LIKES = entryPoint6;
            EntryPoint entryPoint7 = new EntryPoint("FROM_FRIENDS_ICON_LIKES", 6);
            FROM_FRIENDS_ICON_LIKES = entryPoint7;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5, entryPoint6, entryPoint7};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal) && this.entryPoint == ((MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal) obj).entryPoint;
    }

    public final int hashCode() {
        return this.entryPoint.hashCode();
    }

    public final String toString() {
        return "TypeFeedOpenReactionsModal(entryPoint=" + this.entryPoint + ')';
    }
}
