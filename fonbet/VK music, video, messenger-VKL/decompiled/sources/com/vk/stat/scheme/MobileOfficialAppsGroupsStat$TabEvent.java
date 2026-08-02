package com.vk.stat.scheme;

import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGroupsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGroupsStat$TabEvent {

    @pmi0(X3.i.L)
    private final int position;

    @pmi0("tab_event_content_type")
    private final CommonCommunitiesStat$TypeTabContentType tabEventContentType;

    @pmi0("tab_event_type")
    private final TabEventType tabEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class TabEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabEventType[] $VALUES;

        @pmi0("add")
        public static final TabEventType ADD;

        @pmi0("more")
        public static final TabEventType MORE;

        @pmi0("open")
        public static final TabEventType OPEN;

        static {
            TabEventType tabEventType = new TabEventType("MORE", 0);
            MORE = tabEventType;
            TabEventType tabEventType2 = new TabEventType("ADD", 1);
            ADD = tabEventType2;
            TabEventType tabEventType3 = new TabEventType("OPEN", 2);
            OPEN = tabEventType3;
            TabEventType[] tabEventTypeArr = {tabEventType, tabEventType2, tabEventType3};
            $VALUES = tabEventTypeArr;
            $ENTRIES = new asp(tabEventTypeArr);
        }

        private TabEventType(String str, int i) {
        }

        public static TabEventType valueOf(String str) {
            return (TabEventType) Enum.valueOf(TabEventType.class, str);
        }

        public static TabEventType[] values() {
            return (TabEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsGroupsStat$TabEvent(TabEventType tabEventType, CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType, int i) {
        this.tabEventType = tabEventType;
        this.tabEventContentType = commonCommunitiesStat$TypeTabContentType;
        this.position = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGroupsStat$TabEvent)) {
            return false;
        }
        MobileOfficialAppsGroupsStat$TabEvent mobileOfficialAppsGroupsStat$TabEvent = (MobileOfficialAppsGroupsStat$TabEvent) obj;
        return this.tabEventType == mobileOfficialAppsGroupsStat$TabEvent.tabEventType && this.tabEventContentType == mobileOfficialAppsGroupsStat$TabEvent.tabEventContentType && this.position == mobileOfficialAppsGroupsStat$TabEvent.position;
    }

    public final int hashCode() {
        return Integer.hashCode(this.position) + ((this.tabEventContentType.hashCode() + (this.tabEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabEvent(tabEventType=");
        sb.append(this.tabEventType);
        sb.append(", tabEventContentType=");
        sb.append(this.tabEventContentType);
        sb.append(", position=");
        return vu5.b(sb, this.position, ')');
    }
}
