package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$PublishingEvent {

    @pmi0("publishing_event_type")
    private final PublishingEventType publishingEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class PublishingEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PublishingEventType[] $VALUES;

        @pmi0("classified_publish")
        public static final PublishingEventType CLASSIFIED_PUBLISH;

        @pmi0("click_to_drafts")
        public static final PublishingEventType CLICK_TO_DRAFTS;

        @pmi0("click_to_plus")
        public static final PublishingEventType CLICK_TO_PLUS;

        @pmi0("click_to_postponed")
        public static final PublishingEventType CLICK_TO_POSTPONED;

        @pmi0("clip_publish")
        public static final PublishingEventType CLIP_PUBLISH;

        @pmi0("live_publish")
        public static final PublishingEventType LIVE_PUBLISH;

        @pmi0("narrative_publish")
        public static final PublishingEventType NARRATIVE_PUBLISH;

        @pmi0("photo_publish")
        public static final PublishingEventType PHOTO_PUBLISH;

        @pmi0("poster_publish")
        public static final PublishingEventType POSTER_PUBLISH;

        @pmi0("post_publish")
        public static final PublishingEventType POST_PUBLISH;

        @pmi0("story_publish")
        public static final PublishingEventType STORY_PUBLISH;

        @pmi0("video_publish")
        public static final PublishingEventType VIDEO_PUBLISH;

        static {
            PublishingEventType publishingEventType = new PublishingEventType("CLICK_TO_PLUS", 0);
            CLICK_TO_PLUS = publishingEventType;
            PublishingEventType publishingEventType2 = new PublishingEventType("CLIP_PUBLISH", 1);
            CLIP_PUBLISH = publishingEventType2;
            PublishingEventType publishingEventType3 = new PublishingEventType("STORY_PUBLISH", 2);
            STORY_PUBLISH = publishingEventType3;
            PublishingEventType publishingEventType4 = new PublishingEventType("POST_PUBLISH", 3);
            POST_PUBLISH = publishingEventType4;
            PublishingEventType publishingEventType5 = new PublishingEventType("LIVE_PUBLISH", 4);
            LIVE_PUBLISH = publishingEventType5;
            PublishingEventType publishingEventType6 = new PublishingEventType("VIDEO_PUBLISH", 5);
            VIDEO_PUBLISH = publishingEventType6;
            PublishingEventType publishingEventType7 = new PublishingEventType("PHOTO_PUBLISH", 6);
            PHOTO_PUBLISH = publishingEventType7;
            PublishingEventType publishingEventType8 = new PublishingEventType("CLASSIFIED_PUBLISH", 7);
            CLASSIFIED_PUBLISH = publishingEventType8;
            PublishingEventType publishingEventType9 = new PublishingEventType("NARRATIVE_PUBLISH", 8);
            NARRATIVE_PUBLISH = publishingEventType9;
            PublishingEventType publishingEventType10 = new PublishingEventType("POSTER_PUBLISH", 9);
            POSTER_PUBLISH = publishingEventType10;
            PublishingEventType publishingEventType11 = new PublishingEventType("CLICK_TO_DRAFTS", 10);
            CLICK_TO_DRAFTS = publishingEventType11;
            PublishingEventType publishingEventType12 = new PublishingEventType("CLICK_TO_POSTPONED", 11);
            CLICK_TO_POSTPONED = publishingEventType12;
            PublishingEventType[] publishingEventTypeArr = {publishingEventType, publishingEventType2, publishingEventType3, publishingEventType4, publishingEventType5, publishingEventType6, publishingEventType7, publishingEventType8, publishingEventType9, publishingEventType10, publishingEventType11, publishingEventType12};
            $VALUES = publishingEventTypeArr;
            $ENTRIES = new asp(publishingEventTypeArr);
        }

        private PublishingEventType(String str, int i) {
        }

        public static PublishingEventType valueOf(String str) {
            return (PublishingEventType) Enum.valueOf(PublishingEventType.class, str);
        }

        public static PublishingEventType[] values() {
            return (PublishingEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$PublishingEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsProfileStat$PublishingEvent) && this.publishingEventType == ((MobileOfficialAppsProfileStat$PublishingEvent) obj).publishingEventType;
    }

    public final int hashCode() {
        PublishingEventType publishingEventType = this.publishingEventType;
        if (publishingEventType == null) {
            return 0;
        }
        return publishingEventType.hashCode();
    }

    public final String toString() {
        return "PublishingEvent(publishingEventType=" + this.publishingEventType + ')';
    }

    public MobileOfficialAppsProfileStat$PublishingEvent(PublishingEventType publishingEventType) {
        this.publishingEventType = publishingEventType;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$PublishingEvent(PublishingEventType publishingEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : publishingEventType);
    }
}
