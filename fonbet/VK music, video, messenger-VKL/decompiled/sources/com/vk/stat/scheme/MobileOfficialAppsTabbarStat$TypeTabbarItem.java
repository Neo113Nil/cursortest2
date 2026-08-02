package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsTabbarStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsTabbarStat$TypeTabbarItem implements SchemeStat$TypeAction.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("action_index")
    private final Integer actionIndex;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("service")
    private final MobileOfficialAppsTabbarStat$TabbarItemName service;

    @pmi0("tabbar_setup")
    private final List<MobileOfficialAppsTabbarStat$TabbarItemName> tabbarSetup;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsTabbarStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("context_menu_open")
        public static final Event CONTEXT_MENU_OPEN;

        @pmi0("settings_open")
        public static final Event SETTINGS_OPEN;

        @pmi0("suggest_pin_accept")
        public static final Event SUGGEST_PIN_ACCEPT;

        @pmi0("suggest_pin_show")
        public static final Event SUGGEST_PIN_SHOW;

        @pmi0("suggest_unpin_accept")
        public static final Event SUGGEST_UNPIN_ACCEPT;

        @pmi0("suggest_unpin_show")
        public static final Event SUGGEST_UNPIN_SHOW;

        static {
            Event event = new Event("SETTINGS_OPEN", 0);
            SETTINGS_OPEN = event;
            Event event2 = new Event("CONTEXT_MENU_OPEN", 1);
            CONTEXT_MENU_OPEN = event2;
            Event event3 = new Event("SUGGEST_PIN_SHOW", 2);
            SUGGEST_PIN_SHOW = event3;
            Event event4 = new Event("SUGGEST_UNPIN_SHOW", 3);
            SUGGEST_UNPIN_SHOW = event4;
            Event event5 = new Event("SUGGEST_PIN_ACCEPT", 4);
            SUGGEST_PIN_ACCEPT = event5;
            Event event6 = new Event("SUGGEST_UNPIN_ACCEPT", 5);
            SUGGEST_UNPIN_ACCEPT = event6;
            Event[] eventArr = {event, event2, event3, event4, event5, event6};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsTabbarStat$TypeTabbarItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsTabbarStat$TypeTabbarItem)) {
            return false;
        }
        MobileOfficialAppsTabbarStat$TypeTabbarItem mobileOfficialAppsTabbarStat$TypeTabbarItem = (MobileOfficialAppsTabbarStat$TypeTabbarItem) obj;
        return this.event == mobileOfficialAppsTabbarStat$TypeTabbarItem.event && epx.f(this.tabbarSetup, mobileOfficialAppsTabbarStat$TypeTabbarItem.tabbarSetup) && this.service == mobileOfficialAppsTabbarStat$TypeTabbarItem.service && epx.f(this.actionIndex, mobileOfficialAppsTabbarStat$TypeTabbarItem.actionIndex);
    }

    public final int hashCode() {
        Event event = this.event;
        int hashCode = (event == null ? 0 : event.hashCode()) * 31;
        List<MobileOfficialAppsTabbarStat$TabbarItemName> list = this.tabbarSetup;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName = this.service;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsTabbarStat$TabbarItemName == null ? 0 : mobileOfficialAppsTabbarStat$TabbarItemName.hashCode())) * 31;
        Integer num = this.actionIndex;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeTabbarItem(event=");
        sb.append(this.event);
        sb.append(", tabbarSetup=");
        sb.append(this.tabbarSetup);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", actionIndex=");
        return uqi.b(sb, this.actionIndex, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsTabbarStat$TypeTabbarItem(Event event, List<? extends MobileOfficialAppsTabbarStat$TabbarItemName> list, MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName, Integer num) {
        this.event = event;
        this.tabbarSetup = list;
        this.service = mobileOfficialAppsTabbarStat$TabbarItemName;
        this.actionIndex = num;
    }

    public /* synthetic */ MobileOfficialAppsTabbarStat$TypeTabbarItem(Event event, List list, MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : event, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : mobileOfficialAppsTabbarStat$TabbarItemName, (i & 8) != 0 ? null : num);
    }
}
