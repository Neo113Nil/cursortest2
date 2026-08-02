package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostComponentClick implements SchemeStat$TypeClick.b {

    @pmi0("component")
    private final Component component;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Component {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Component[] $VALUES;

        @pmi0("footer_date")
        public static final Component FOOTER_DATE;

        static {
            Component component = new Component("FOOTER_DATE", 0);
            FOOTER_DATE = component;
            Component[] componentArr = {component};
            $VALUES = componentArr;
            $ENTRIES = new asp(componentArr);
        }

        private Component(String str, int i) {
        }

        public static Component valueOf(String str) {
            return (Component) Enum.valueOf(Component.class, str);
        }

        public static Component[] values() {
            return (Component[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedPostComponentClick() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostComponentClick) && this.component == ((MobileOfficialAppsFeedStat$TypeFeedPostComponentClick) obj).component;
    }

    public final int hashCode() {
        Component component = this.component;
        if (component == null) {
            return 0;
        }
        return component.hashCode();
    }

    public final String toString() {
        return "TypeFeedPostComponentClick(component=" + this.component + ')';
    }

    public MobileOfficialAppsFeedStat$TypeFeedPostComponentClick(Component component) {
        this.component = component;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedPostComponentClick(Component component, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : component);
    }
}
