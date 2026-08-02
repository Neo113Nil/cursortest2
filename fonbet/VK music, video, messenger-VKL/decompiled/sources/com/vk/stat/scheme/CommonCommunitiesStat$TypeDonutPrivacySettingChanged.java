package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeDonutPrivacySettingChanged implements SchemeStat$TypeAction.b {

    @pmi0("event_data")
    private final EventData eventData;

    @pmi0("subscription_source")
    private final CommonCommunitiesStat$TypeSubscriptionSource subscriptionSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class EventData {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventData[] $VALUES;

        @pmi0("visible_everybody")
        public static final EventData VISIBLE_EVERYBODY;

        @pmi0("visible_friends")
        public static final EventData VISIBLE_FRIENDS;

        @pmi0("visible_nobody")
        public static final EventData VISIBLE_NOBODY;

        static {
            EventData eventData = new EventData("VISIBLE_EVERYBODY", 0);
            VISIBLE_EVERYBODY = eventData;
            EventData eventData2 = new EventData("VISIBLE_FRIENDS", 1);
            VISIBLE_FRIENDS = eventData2;
            EventData eventData3 = new EventData("VISIBLE_NOBODY", 2);
            VISIBLE_NOBODY = eventData3;
            EventData[] eventDataArr = {eventData, eventData2, eventData3};
            $VALUES = eventDataArr;
            $ENTRIES = new asp(eventDataArr);
        }

        private EventData(String str, int i) {
        }

        public static EventData valueOf(String str) {
            return (EventData) Enum.valueOf(EventData.class, str);
        }

        public static EventData[] values() {
            return (EventData[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonCommunitiesStat$TypeDonutPrivacySettingChanged() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeDonutPrivacySettingChanged)) {
            return false;
        }
        CommonCommunitiesStat$TypeDonutPrivacySettingChanged commonCommunitiesStat$TypeDonutPrivacySettingChanged = (CommonCommunitiesStat$TypeDonutPrivacySettingChanged) obj;
        return this.eventData == commonCommunitiesStat$TypeDonutPrivacySettingChanged.eventData && this.subscriptionSource == commonCommunitiesStat$TypeDonutPrivacySettingChanged.subscriptionSource;
    }

    public final int hashCode() {
        EventData eventData = this.eventData;
        int hashCode = (eventData == null ? 0 : eventData.hashCode()) * 31;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource = this.subscriptionSource;
        return hashCode + (commonCommunitiesStat$TypeSubscriptionSource != null ? commonCommunitiesStat$TypeSubscriptionSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeDonutPrivacySettingChanged(eventData=" + this.eventData + ", subscriptionSource=" + this.subscriptionSource + ')';
    }

    public CommonCommunitiesStat$TypeDonutPrivacySettingChanged(EventData eventData, CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource) {
        this.eventData = eventData;
        this.subscriptionSource = commonCommunitiesStat$TypeSubscriptionSource;
    }

    public /* synthetic */ CommonCommunitiesStat$TypeDonutPrivacySettingChanged(EventData eventData, CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventData, (i & 2) != 0 ? null : commonCommunitiesStat$TypeSubscriptionSource);
    }
}
