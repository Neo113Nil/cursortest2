package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapGotoEventItem implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("menu_action")
    private final MenuAction menuAction;

    @pmi0("source")
    private final Source source;

    @pmi0("target_nav_info")
    private final CommonStat$TypeCommonEventItem targetNavInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class MenuAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MenuAction[] $VALUES;

        @pmi0("album_menu")
        public static final MenuAction ALBUM_MENU;

        @pmi0("audiobook_menu")
        public static final MenuAction AUDIOBOOK_MENU;

        @pmi0("chapter_menu")
        public static final MenuAction CHAPTER_MENU;

        @pmi0("episode_menu")
        public static final MenuAction EPISODE_MENU;

        @pmi0("playlist_menu")
        public static final MenuAction PLAYLIST_MENU;

        @pmi0("podcast_menu")
        public static final MenuAction PODCAST_MENU;

        @pmi0("radio_menu")
        public static final MenuAction RADIO_MENU;

        @pmi0("subscription_menu")
        public static final MenuAction SUBSCRIPTION_MENU;

        @pmi0("track_menu")
        public static final MenuAction TRACK_MENU;

        static {
            MenuAction menuAction = new MenuAction("TRACK_MENU", 0);
            TRACK_MENU = menuAction;
            MenuAction menuAction2 = new MenuAction("PLAYLIST_MENU", 1);
            PLAYLIST_MENU = menuAction2;
            MenuAction menuAction3 = new MenuAction("ALBUM_MENU", 2);
            ALBUM_MENU = menuAction3;
            MenuAction menuAction4 = new MenuAction("PODCAST_MENU", 3);
            PODCAST_MENU = menuAction4;
            MenuAction menuAction5 = new MenuAction("EPISODE_MENU", 4);
            EPISODE_MENU = menuAction5;
            MenuAction menuAction6 = new MenuAction("AUDIOBOOK_MENU", 5);
            AUDIOBOOK_MENU = menuAction6;
            MenuAction menuAction7 = new MenuAction("CHAPTER_MENU", 6);
            CHAPTER_MENU = menuAction7;
            MenuAction menuAction8 = new MenuAction("RADIO_MENU", 7);
            RADIO_MENU = menuAction8;
            MenuAction menuAction9 = new MenuAction("SUBSCRIPTION_MENU", 8);
            SUBSCRIPTION_MENU = menuAction9;
            MenuAction[] menuActionArr = {menuAction, menuAction2, menuAction3, menuAction4, menuAction5, menuAction6, menuAction7, menuAction8, menuAction9};
            $VALUES = menuActionArr;
            $ENTRIES = new asp(menuActionArr);
        }

        private MenuAction(String str, int i) {
        }

        public static MenuAction valueOf(String str) {
            return (MenuAction) Enum.valueOf(MenuAction.class, str);
        }

        public static MenuAction[] values() {
            return (MenuAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("my_tracks_nav")
        public static final Source MY_TRACKS_NAV;

        @pmi0("tab_bar")
        public static final Source TAB_BAR;

        @pmi0("tool_bar")
        public static final Source TOOL_BAR;

        static {
            Source source = new Source("TAB_BAR", 0);
            TAB_BAR = source;
            Source source2 = new Source("TOOL_BAR", 1);
            TOOL_BAR = source2;
            Source source3 = new Source("MY_TRACKS_NAV", 2);
            MY_TRACKS_NAV = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioTapGotoEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, MenuAction menuAction, Source source) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.targetNavInfo = commonStat$TypeCommonEventItem;
        this.menuAction = menuAction;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapGotoEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapGotoEventItem commonAudioStat$TypeAudioTapGotoEventItem = (CommonAudioStat$TypeAudioTapGotoEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapGotoEventItem.event) && epx.f(this.targetNavInfo, commonAudioStat$TypeAudioTapGotoEventItem.targetNavInfo) && this.menuAction == commonAudioStat$TypeAudioTapGotoEventItem.menuAction && this.source == commonAudioStat$TypeAudioTapGotoEventItem.source;
    }

    public final int hashCode() {
        int hashCode = (this.targetNavInfo.hashCode() + (this.event.hashCode() * 31)) * 31;
        MenuAction menuAction = this.menuAction;
        int hashCode2 = (hashCode + (menuAction == null ? 0 : menuAction.hashCode())) * 31;
        Source source = this.source;
        return hashCode2 + (source != null ? source.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAudioTapGotoEventItem(event=" + this.event + ", targetNavInfo=" + this.targetNavInfo + ", menuAction=" + this.menuAction + ", source=" + this.source + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioTapGotoEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, MenuAction menuAction, Source source, int i, zcl zclVar) {
        this(commonAudioStat$TypeAudioDomainEventItem, commonStat$TypeCommonEventItem, (i & 4) != 0 ? null : menuAction, (i & 8) != 0 ? null : source);
    }
}
