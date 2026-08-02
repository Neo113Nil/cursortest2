package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$AnotherUserProfileEvent {

    @pmi0("another_user_profile_event_type")
    private final AnotherUserProfileEventType anotherUserProfileEventType;

    @pmi0("content_subscription_type")
    private final ContentSubscriptionType contentSubscriptionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class AnotherUserProfileEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnotherUserProfileEventType[] $VALUES;

        @pmi0("click_to_birthday_gift")
        public static final AnotherUserProfileEventType CLICK_TO_BIRTHDAY_GIFT;

        @pmi0("click_to_emoji_status")
        public static final AnotherUserProfileEventType CLICK_TO_EMOJI_STATUS;

        @pmi0("click_to_message")
        public static final AnotherUserProfileEventType CLICK_TO_MESSAGE;

        @pmi0("content_subscribe")
        public static final AnotherUserProfileEventType CONTENT_SUBSCRIBE;

        @pmi0("content_unsubscribe")
        public static final AnotherUserProfileEventType CONTENT_UNSUBSCRIBE;

        @pmi0("hide_birthday_block")
        public static final AnotherUserProfileEventType HIDE_BIRTHDAY_BLOCK;

        @pmi0("select_emoji")
        public static final AnotherUserProfileEventType SELECT_EMOJI;

        @pmi0("show_more_gifts")
        public static final AnotherUserProfileEventType SHOW_MORE_GIFTS;

        static {
            AnotherUserProfileEventType anotherUserProfileEventType = new AnotherUserProfileEventType("CONTENT_SUBSCRIBE", 0);
            CONTENT_SUBSCRIBE = anotherUserProfileEventType;
            AnotherUserProfileEventType anotherUserProfileEventType2 = new AnotherUserProfileEventType("CONTENT_UNSUBSCRIBE", 1);
            CONTENT_UNSUBSCRIBE = anotherUserProfileEventType2;
            AnotherUserProfileEventType anotherUserProfileEventType3 = new AnotherUserProfileEventType("CLICK_TO_EMOJI_STATUS", 2);
            CLICK_TO_EMOJI_STATUS = anotherUserProfileEventType3;
            AnotherUserProfileEventType anotherUserProfileEventType4 = new AnotherUserProfileEventType("SELECT_EMOJI", 3);
            SELECT_EMOJI = anotherUserProfileEventType4;
            AnotherUserProfileEventType anotherUserProfileEventType5 = new AnotherUserProfileEventType("CLICK_TO_MESSAGE", 4);
            CLICK_TO_MESSAGE = anotherUserProfileEventType5;
            AnotherUserProfileEventType anotherUserProfileEventType6 = new AnotherUserProfileEventType("CLICK_TO_BIRTHDAY_GIFT", 5);
            CLICK_TO_BIRTHDAY_GIFT = anotherUserProfileEventType6;
            AnotherUserProfileEventType anotherUserProfileEventType7 = new AnotherUserProfileEventType("SHOW_MORE_GIFTS", 6);
            SHOW_MORE_GIFTS = anotherUserProfileEventType7;
            AnotherUserProfileEventType anotherUserProfileEventType8 = new AnotherUserProfileEventType("HIDE_BIRTHDAY_BLOCK", 7);
            HIDE_BIRTHDAY_BLOCK = anotherUserProfileEventType8;
            AnotherUserProfileEventType[] anotherUserProfileEventTypeArr = {anotherUserProfileEventType, anotherUserProfileEventType2, anotherUserProfileEventType3, anotherUserProfileEventType4, anotherUserProfileEventType5, anotherUserProfileEventType6, anotherUserProfileEventType7, anotherUserProfileEventType8};
            $VALUES = anotherUserProfileEventTypeArr;
            $ENTRIES = new asp(anotherUserProfileEventTypeArr);
        }

        private AnotherUserProfileEventType(String str, int i) {
        }

        public static AnotherUserProfileEventType valueOf(String str) {
            return (AnotherUserProfileEventType) Enum.valueOf(AnotherUserProfileEventType.class, str);
        }

        public static AnotherUserProfileEventType[] values() {
            return (AnotherUserProfileEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class ContentSubscriptionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentSubscriptionType[] $VALUES;

        @pmi0("live")
        public static final ContentSubscriptionType LIVE;

        @pmi0("post")
        public static final ContentSubscriptionType POST;

        @pmi0("story")
        public static final ContentSubscriptionType STORY;

        static {
            ContentSubscriptionType contentSubscriptionType = new ContentSubscriptionType("POST", 0);
            POST = contentSubscriptionType;
            ContentSubscriptionType contentSubscriptionType2 = new ContentSubscriptionType("STORY", 1);
            STORY = contentSubscriptionType2;
            ContentSubscriptionType contentSubscriptionType3 = new ContentSubscriptionType("LIVE", 2);
            LIVE = contentSubscriptionType3;
            ContentSubscriptionType[] contentSubscriptionTypeArr = {contentSubscriptionType, contentSubscriptionType2, contentSubscriptionType3};
            $VALUES = contentSubscriptionTypeArr;
            $ENTRIES = new asp(contentSubscriptionTypeArr);
        }

        private ContentSubscriptionType(String str, int i) {
        }

        public static ContentSubscriptionType valueOf(String str) {
            return (ContentSubscriptionType) Enum.valueOf(ContentSubscriptionType.class, str);
        }

        public static ContentSubscriptionType[] values() {
            return (ContentSubscriptionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$AnotherUserProfileEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$AnotherUserProfileEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$AnotherUserProfileEvent mobileOfficialAppsProfileStat$AnotherUserProfileEvent = (MobileOfficialAppsProfileStat$AnotherUserProfileEvent) obj;
        return this.anotherUserProfileEventType == mobileOfficialAppsProfileStat$AnotherUserProfileEvent.anotherUserProfileEventType && this.contentSubscriptionType == mobileOfficialAppsProfileStat$AnotherUserProfileEvent.contentSubscriptionType;
    }

    public final int hashCode() {
        AnotherUserProfileEventType anotherUserProfileEventType = this.anotherUserProfileEventType;
        int hashCode = (anotherUserProfileEventType == null ? 0 : anotherUserProfileEventType.hashCode()) * 31;
        ContentSubscriptionType contentSubscriptionType = this.contentSubscriptionType;
        return hashCode + (contentSubscriptionType != null ? contentSubscriptionType.hashCode() : 0);
    }

    public final String toString() {
        return "AnotherUserProfileEvent(anotherUserProfileEventType=" + this.anotherUserProfileEventType + ", contentSubscriptionType=" + this.contentSubscriptionType + ')';
    }

    public MobileOfficialAppsProfileStat$AnotherUserProfileEvent(AnotherUserProfileEventType anotherUserProfileEventType, ContentSubscriptionType contentSubscriptionType) {
        this.anotherUserProfileEventType = anotherUserProfileEventType;
        this.contentSubscriptionType = contentSubscriptionType;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$AnotherUserProfileEvent(AnotherUserProfileEventType anotherUserProfileEventType, ContentSubscriptionType contentSubscriptionType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : anotherUserProfileEventType, (i & 2) != 0 ? null : contentSubscriptionType);
    }
}
