package com.vk.stat.scheme;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonProfileStat.kt */
/* loaded from: classes5.dex */
public final class CommonProfileStat$ContentTabsEvent {

    @pmi0("content_tabs_event_type")
    private final ContentTabsEventType contentTabsEventType;

    @pmi0("content_type")
    private final CommonProfileStat$ContentType contentType;

    @pmi0("tab_mode")
    private final TabMode tabMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonProfileStat.kt */
    public static final class ContentTabsEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentTabsEventType[] $VALUES;

        @pmi0("click_to_tab_settings_button")
        public static final ContentTabsEventType CLICK_TO_TAB_SETTINGS_BUTTON;

        @pmi0("save_tab_settings")
        public static final ContentTabsEventType SAVE_TAB_SETTINGS;

        @pmi0("tab_change_mode")
        public static final ContentTabsEventType TAB_CHANGE_MODE;

        static {
            ContentTabsEventType contentTabsEventType = new ContentTabsEventType("CLICK_TO_TAB_SETTINGS_BUTTON", 0);
            CLICK_TO_TAB_SETTINGS_BUTTON = contentTabsEventType;
            ContentTabsEventType contentTabsEventType2 = new ContentTabsEventType("TAB_CHANGE_MODE", 1);
            TAB_CHANGE_MODE = contentTabsEventType2;
            ContentTabsEventType contentTabsEventType3 = new ContentTabsEventType("SAVE_TAB_SETTINGS", 2);
            SAVE_TAB_SETTINGS = contentTabsEventType3;
            ContentTabsEventType[] contentTabsEventTypeArr = {contentTabsEventType, contentTabsEventType2, contentTabsEventType3};
            $VALUES = contentTabsEventTypeArr;
            $ENTRIES = new asp(contentTabsEventTypeArr);
        }

        private ContentTabsEventType(String str, int i) {
        }

        public static ContentTabsEventType valueOf(String str) {
            return (ContentTabsEventType) Enum.valueOf(ContentTabsEventType.class, str);
        }

        public static ContentTabsEventType[] values() {
            return (ContentTabsEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonProfileStat.kt */
    public static final class TabMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabMode[] $VALUES;

        @pmi0(C4217a2.e)
        public static final TabMode DISABLED;

        @pmi0("enabled")
        public static final TabMode ENABLED;

        static {
            TabMode tabMode = new TabMode("ENABLED", 0);
            ENABLED = tabMode;
            TabMode tabMode2 = new TabMode("DISABLED", 1);
            DISABLED = tabMode2;
            TabMode[] tabModeArr = {tabMode, tabMode2};
            $VALUES = tabModeArr;
            $ENTRIES = new asp(tabModeArr);
        }

        private TabMode(String str, int i) {
        }

        public static TabMode valueOf(String str) {
            return (TabMode) Enum.valueOf(TabMode.class, str);
        }

        public static TabMode[] values() {
            return (TabMode[]) $VALUES.clone();
        }
    }

    public CommonProfileStat$ContentTabsEvent() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonProfileStat$ContentTabsEvent)) {
            return false;
        }
        CommonProfileStat$ContentTabsEvent commonProfileStat$ContentTabsEvent = (CommonProfileStat$ContentTabsEvent) obj;
        return this.contentTabsEventType == commonProfileStat$ContentTabsEvent.contentTabsEventType && this.contentType == commonProfileStat$ContentTabsEvent.contentType && this.tabMode == commonProfileStat$ContentTabsEvent.tabMode;
    }

    public final int hashCode() {
        ContentTabsEventType contentTabsEventType = this.contentTabsEventType;
        int hashCode = (contentTabsEventType == null ? 0 : contentTabsEventType.hashCode()) * 31;
        CommonProfileStat$ContentType commonProfileStat$ContentType = this.contentType;
        int hashCode2 = (hashCode + (commonProfileStat$ContentType == null ? 0 : commonProfileStat$ContentType.hashCode())) * 31;
        TabMode tabMode = this.tabMode;
        return hashCode2 + (tabMode != null ? tabMode.hashCode() : 0);
    }

    public final String toString() {
        return "ContentTabsEvent(contentTabsEventType=" + this.contentTabsEventType + ", contentType=" + this.contentType + ", tabMode=" + this.tabMode + ')';
    }

    public CommonProfileStat$ContentTabsEvent(ContentTabsEventType contentTabsEventType, CommonProfileStat$ContentType commonProfileStat$ContentType, TabMode tabMode) {
        this.contentTabsEventType = contentTabsEventType;
        this.contentType = commonProfileStat$ContentType;
        this.tabMode = tabMode;
    }

    public /* synthetic */ CommonProfileStat$ContentTabsEvent(ContentTabsEventType contentTabsEventType, CommonProfileStat$ContentType commonProfileStat$ContentType, TabMode tabMode, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : contentTabsEventType, (i & 2) != 0 ? null : commonProfileStat$ContentType, (i & 4) != 0 ? null : tabMode);
    }
}
