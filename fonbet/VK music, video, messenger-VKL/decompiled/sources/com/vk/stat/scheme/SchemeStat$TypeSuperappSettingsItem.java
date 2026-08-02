package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSuperappSettingsItem implements SchemeStat$TypeClick.b {

    @pmi0("action_index")
    private final Integer actionIndex;

    @pmi0("type")
    private final Type type;

    @pmi0("widgets")
    private final List<SchemeStat$TypeSuperappWidgetItem> widgets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("widgets_options_tap")
        public static final Type WIDGETS_OPTIONS_TAP;

        @pmi0("widget_hide")
        public static final Type WIDGET_HIDE;

        @pmi0("widget_show")
        public static final Type WIDGET_SHOW;

        static {
            Type type = new Type("WIDGET_SHOW", 0);
            WIDGET_SHOW = type;
            Type type2 = new Type("WIDGET_HIDE", 1);
            WIDGET_HIDE = type2;
            Type type3 = new Type("WIDGETS_OPTIONS_TAP", 2);
            WIDGETS_OPTIONS_TAP = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeSuperappSettingsItem(Type type, List<SchemeStat$TypeSuperappWidgetItem> list, Integer num) {
        this.type = type;
        this.widgets = list;
        this.actionIndex = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSuperappSettingsItem)) {
            return false;
        }
        SchemeStat$TypeSuperappSettingsItem schemeStat$TypeSuperappSettingsItem = (SchemeStat$TypeSuperappSettingsItem) obj;
        return this.type == schemeStat$TypeSuperappSettingsItem.type && epx.f(this.widgets, schemeStat$TypeSuperappSettingsItem.widgets) && epx.f(this.actionIndex, schemeStat$TypeSuperappSettingsItem.actionIndex);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<SchemeStat$TypeSuperappWidgetItem> list = this.widgets;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.actionIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuperappSettingsItem(type=");
        sb.append(this.type);
        sb.append(", widgets=");
        sb.append(this.widgets);
        sb.append(", actionIndex=");
        return uqi.b(sb, this.actionIndex, ')');
    }

    public /* synthetic */ SchemeStat$TypeSuperappSettingsItem(Type type, List list, Integer num, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
