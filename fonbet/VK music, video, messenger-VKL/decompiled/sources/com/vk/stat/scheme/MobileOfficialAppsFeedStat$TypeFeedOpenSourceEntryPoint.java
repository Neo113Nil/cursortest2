package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint {

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("coowner_modal_card")
        public static final EntryPoint COOWNER_MODAL_CARD;

        @pmi0("header_modal_photo")
        public static final EntryPoint HEADER_MODAL_PHOTO;

        @pmi0("header_name")
        public static final EntryPoint HEADER_NAME;

        @pmi0("menu_option")
        public static final EntryPoint MENU_OPTION;

        static {
            EntryPoint entryPoint = new EntryPoint("HEADER_MODAL_PHOTO", 0);
            HEADER_MODAL_PHOTO = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("HEADER_NAME", 1);
            HEADER_NAME = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("COOWNER_MODAL_CARD", 2);
            COOWNER_MODAL_CARD = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("MENU_OPTION", 3);
            MENU_OPTION = entryPoint4;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4};
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

    public MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint) && this.entryPoint == ((MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint) obj).entryPoint;
    }

    public final int hashCode() {
        return this.entryPoint.hashCode();
    }

    public final String toString() {
        return "TypeFeedOpenSourceEntryPoint(entryPoint=" + this.entryPoint + ')';
    }
}
