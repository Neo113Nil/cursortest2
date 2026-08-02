package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint {

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("header_follow_alert")
        public static final EntryPoint HEADER_FOLLOW_ALERT;

        @pmi0("header_follow_button")
        public static final EntryPoint HEADER_FOLLOW_BUTTON;

        @pmi0("header_follow_text")
        public static final EntryPoint HEADER_FOLLOW_TEXT;

        @pmi0("header_modal_photo")
        public static final EntryPoint HEADER_MODAL_PHOTO;

        @pmi0("header_photo_follow_button")
        public static final EntryPoint HEADER_PHOTO_FOLLOW_BUTTON;

        static {
            EntryPoint entryPoint = new EntryPoint("HEADER_MODAL_PHOTO", 0);
            HEADER_MODAL_PHOTO = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("HEADER_PHOTO_FOLLOW_BUTTON", 1);
            HEADER_PHOTO_FOLLOW_BUTTON = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("HEADER_FOLLOW_ALERT", 2);
            HEADER_FOLLOW_ALERT = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("HEADER_FOLLOW_TEXT", 3);
            HEADER_FOLLOW_TEXT = entryPoint4;
            EntryPoint entryPoint5 = new EntryPoint("HEADER_FOLLOW_BUTTON", 4);
            HEADER_FOLLOW_BUTTON = entryPoint5;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5};
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

    public MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint) && this.entryPoint == ((MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint) obj).entryPoint;
    }

    public final int hashCode() {
        return this.entryPoint.hashCode();
    }

    public final String toString() {
        return "TypeFeedFollowSourceEntryPoint(entryPoint=" + this.entryPoint + ')';
    }
}
