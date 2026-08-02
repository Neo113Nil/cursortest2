package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeNavigationTabClick implements SchemeStat$TypeClick.b {

    @pmi0("indicator_type")
    private final IndicatorType indicatorType;

    @pmi0("tab_id")
    private final TabId tabId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class IndicatorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IndicatorType[] $VALUES;

        @pmi0("counter")
        public static final IndicatorType COUNTER;

        @pmi0("dot")
        public static final IndicatorType DOT;

        static {
            IndicatorType indicatorType = new IndicatorType("DOT", 0);
            DOT = indicatorType;
            IndicatorType indicatorType2 = new IndicatorType("COUNTER", 1);
            COUNTER = indicatorType2;
            IndicatorType[] indicatorTypeArr = {indicatorType, indicatorType2};
            $VALUES = indicatorTypeArr;
            $ENTRIES = new asp(indicatorTypeArr);
        }

        private IndicatorType(String str, int i) {
        }

        public static IndicatorType valueOf(String str) {
            return (IndicatorType) Enum.valueOf(IndicatorType.class, str);
        }

        public static IndicatorType[] values() {
            return (IndicatorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public static final class TabId {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabId[] $VALUES;

        @pmi0("atlas")
        public static final TabId ATLAS;

        @pmi0("calls")
        public static final TabId CALLS;

        @pmi0("calls_main")
        public static final TabId CALLS_MAIN;

        @pmi0("classifieds")
        public static final TabId CLASSIFIEDS;

        @pmi0("clips")
        public static final TabId CLIPS;

        @pmi0("contacts")
        public static final TabId CONTACTS;

        @pmi0("feedback")
        public static final TabId FEEDBACK;

        @pmi0("friends")
        public static final TabId FRIENDS;

        @pmi0("games")
        public static final TabId GAMES;

        @pmi0("groups")
        public static final TabId GROUPS;

        @pmi0("managed_group")
        public static final TabId MANAGED_GROUP;

        @pmi0("messages")
        public static final TabId MESSAGES;

        @pmi0("music")
        public static final TabId MUSIC;

        @pmi0("news")
        public static final TabId NEWS;

        @pmi0("overview")
        public static final TabId OVERVIEW;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final TabId PROFILE;

        @pmi0("settings")
        public static final TabId SETTINGS;

        @pmi0("video")
        public static final TabId VIDEO;

        static {
            TabId tabId = new TabId("MESSAGES", 0);
            MESSAGES = tabId;
            TabId tabId2 = new TabId("FEEDBACK", 1);
            FEEDBACK = tabId2;
            TabId tabId3 = new TabId("NEWS", 2);
            NEWS = tabId3;
            TabId tabId4 = new TabId("CLIPS", 3);
            CLIPS = tabId4;
            TabId tabId5 = new TabId("GROUPS", 4);
            GROUPS = tabId5;
            TabId tabId6 = new TabId("MUSIC", 5);
            MUSIC = tabId6;
            TabId tabId7 = new TabId("CLASSIFIEDS", 6);
            CLASSIFIEDS = tabId7;
            TabId tabId8 = new TabId(SignalingProtocol.MEDIA_OPTION_VIDEO, 7);
            VIDEO = tabId8;
            TabId tabId9 = new TabId("ATLAS", 8);
            ATLAS = tabId9;
            TabId tabId10 = new TabId(Privacy.FRIENDS, 9);
            FRIENDS = tabId10;
            TabId tabId11 = new TabId("PROFILE", 10);
            PROFILE = tabId11;
            TabId tabId12 = new TabId("CONTACTS", 11);
            CONTACTS = tabId12;
            TabId tabId13 = new TabId("CALLS_MAIN", 12);
            CALLS_MAIN = tabId13;
            TabId tabId14 = new TabId("CALLS", 13);
            CALLS = tabId14;
            TabId tabId15 = new TabId("SETTINGS", 14);
            SETTINGS = tabId15;
            TabId tabId16 = new TabId("GAMES", 15);
            GAMES = tabId16;
            TabId tabId17 = new TabId("OVERVIEW", 16);
            OVERVIEW = tabId17;
            TabId tabId18 = new TabId("MANAGED_GROUP", 17);
            MANAGED_GROUP = tabId18;
            TabId[] tabIdArr = {tabId, tabId2, tabId3, tabId4, tabId5, tabId6, tabId7, tabId8, tabId9, tabId10, tabId11, tabId12, tabId13, tabId14, tabId15, tabId16, tabId17, tabId18};
            $VALUES = tabIdArr;
            $ENTRIES = new asp(tabIdArr);
        }

        private TabId(String str, int i) {
        }

        public static TabId valueOf(String str) {
            return (TabId) Enum.valueOf(TabId.class, str);
        }

        public static TabId[] values() {
            return (TabId[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeNavigationTabClick(TabId tabId, IndicatorType indicatorType) {
        this.tabId = tabId;
        this.indicatorType = indicatorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeNavigationTabClick)) {
            return false;
        }
        SchemeStat$TypeNavigationTabClick schemeStat$TypeNavigationTabClick = (SchemeStat$TypeNavigationTabClick) obj;
        return this.tabId == schemeStat$TypeNavigationTabClick.tabId && this.indicatorType == schemeStat$TypeNavigationTabClick.indicatorType;
    }

    public final int hashCode() {
        int hashCode = this.tabId.hashCode() * 31;
        IndicatorType indicatorType = this.indicatorType;
        return hashCode + (indicatorType == null ? 0 : indicatorType.hashCode());
    }

    public final String toString() {
        return "TypeNavigationTabClick(tabId=" + this.tabId + ", indicatorType=" + this.indicatorType + ')';
    }

    public /* synthetic */ SchemeStat$TypeNavigationTabClick(TabId tabId, IndicatorType indicatorType, int i, zcl zclVar) {
        this(tabId, (i & 2) != 0 ? null : indicatorType);
    }
}
