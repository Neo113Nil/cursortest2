package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$StoriesEvent {

    @pmi0("stories_block_name")
    private final StoriesBlockName storiesBlockName;

    @pmi0("stories_event_type")
    private final StoriesEventType storiesEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class StoriesBlockName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoriesBlockName[] $VALUES;

        @pmi0("possible_friends")
        public static final StoriesBlockName POSSIBLE_FRIENDS;

        static {
            StoriesBlockName storiesBlockName = new StoriesBlockName("POSSIBLE_FRIENDS", 0);
            POSSIBLE_FRIENDS = storiesBlockName;
            StoriesBlockName[] storiesBlockNameArr = {storiesBlockName};
            $VALUES = storiesBlockNameArr;
            $ENTRIES = new asp(storiesBlockNameArr);
        }

        private StoriesBlockName(String str, int i) {
        }

        public static StoriesBlockName valueOf(String str) {
            return (StoriesBlockName) Enum.valueOf(StoriesBlockName.class, str);
        }

        public static StoriesBlockName[] values() {
            return (StoriesBlockName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class StoriesEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoriesEventType[] $VALUES;

        @pmi0("hide_stories_block")
        public static final StoriesEventType HIDE_STORIES_BLOCK;

        @pmi0("view_stories_block")
        public static final StoriesEventType VIEW_STORIES_BLOCK;

        static {
            StoriesEventType storiesEventType = new StoriesEventType("VIEW_STORIES_BLOCK", 0);
            VIEW_STORIES_BLOCK = storiesEventType;
            StoriesEventType storiesEventType2 = new StoriesEventType("HIDE_STORIES_BLOCK", 1);
            HIDE_STORIES_BLOCK = storiesEventType2;
            StoriesEventType[] storiesEventTypeArr = {storiesEventType, storiesEventType2};
            $VALUES = storiesEventTypeArr;
            $ENTRIES = new asp(storiesEventTypeArr);
        }

        private StoriesEventType(String str, int i) {
        }

        public static StoriesEventType valueOf(String str) {
            return (StoriesEventType) Enum.valueOf(StoriesEventType.class, str);
        }

        public static StoriesEventType[] values() {
            return (StoriesEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$StoriesEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$StoriesEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$StoriesEvent mobileOfficialAppsProfileStat$StoriesEvent = (MobileOfficialAppsProfileStat$StoriesEvent) obj;
        return this.storiesEventType == mobileOfficialAppsProfileStat$StoriesEvent.storiesEventType && this.storiesBlockName == mobileOfficialAppsProfileStat$StoriesEvent.storiesBlockName;
    }

    public final int hashCode() {
        StoriesEventType storiesEventType = this.storiesEventType;
        int hashCode = (storiesEventType == null ? 0 : storiesEventType.hashCode()) * 31;
        StoriesBlockName storiesBlockName = this.storiesBlockName;
        return hashCode + (storiesBlockName != null ? storiesBlockName.hashCode() : 0);
    }

    public final String toString() {
        return "StoriesEvent(storiesEventType=" + this.storiesEventType + ", storiesBlockName=" + this.storiesBlockName + ')';
    }

    public MobileOfficialAppsProfileStat$StoriesEvent(StoriesEventType storiesEventType, StoriesBlockName storiesBlockName) {
        this.storiesEventType = storiesEventType;
        this.storiesBlockName = storiesBlockName;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$StoriesEvent(StoriesEventType storiesEventType, StoriesBlockName storiesBlockName, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : storiesEventType, (i & 2) != 0 ? null : storiesBlockName);
    }
}
