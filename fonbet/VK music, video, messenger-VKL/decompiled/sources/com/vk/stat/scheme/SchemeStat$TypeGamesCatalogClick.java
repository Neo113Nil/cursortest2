package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeGamesCatalogClick implements SchemeStat$TypeClick.b {

    @pmi0("is_red_dot")
    private final Boolean isRedDot;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("achievements_gift_button_click")
        public static final Type ACHIEVEMENTS_GIFT_BUTTON_CLICK;

        @pmi0("achievements_welcome_modal")
        public static final Type ACHIEVEMENTS_WELCOME_MODAL;

        @pmi0("catalog_tab")
        public static final Type CATALOG_TAB;

        @pmi0("close_welcome_achievements_modal")
        public static final Type CLOSE_WELCOME_ACHIEVEMENTS_MODAL;

        @pmi0("main_tab")
        public static final Type MAIN_TAB;

        @pmi0("notification")
        public static final Type NOTIFICATION;

        @pmi0("what_inside_button_click")
        public static final Type WHAT_INSIDE_BUTTON_CLICK;

        @pmi0("what_inside_modal_close")
        public static final Type WHAT_INSIDE_MODAL_CLOSE;

        static {
            Type type = new Type("NOTIFICATION", 0);
            NOTIFICATION = type;
            Type type2 = new Type("MAIN_TAB", 1);
            MAIN_TAB = type2;
            Type type3 = new Type("CATALOG_TAB", 2);
            CATALOG_TAB = type3;
            Type type4 = new Type("ACHIEVEMENTS_WELCOME_MODAL", 3);
            ACHIEVEMENTS_WELCOME_MODAL = type4;
            Type type5 = new Type("CLOSE_WELCOME_ACHIEVEMENTS_MODAL", 4);
            CLOSE_WELCOME_ACHIEVEMENTS_MODAL = type5;
            Type type6 = new Type("ACHIEVEMENTS_GIFT_BUTTON_CLICK", 5);
            ACHIEVEMENTS_GIFT_BUTTON_CLICK = type6;
            Type type7 = new Type("WHAT_INSIDE_BUTTON_CLICK", 6);
            WHAT_INSIDE_BUTTON_CLICK = type7;
            Type type8 = new Type("WHAT_INSIDE_MODAL_CLOSE", 7);
            WHAT_INSIDE_MODAL_CLOSE = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
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

    public SchemeStat$TypeGamesCatalogClick(Type type, Boolean bool) {
        this.type = type;
        this.isRedDot = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeGamesCatalogClick)) {
            return false;
        }
        SchemeStat$TypeGamesCatalogClick schemeStat$TypeGamesCatalogClick = (SchemeStat$TypeGamesCatalogClick) obj;
        return this.type == schemeStat$TypeGamesCatalogClick.type && epx.f(this.isRedDot, schemeStat$TypeGamesCatalogClick.isRedDot);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Boolean bool = this.isRedDot;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGamesCatalogClick(type=");
        sb.append(this.type);
        sb.append(", isRedDot=");
        return tn.a(sb, this.isRedDot, ')');
    }

    public /* synthetic */ SchemeStat$TypeGamesCatalogClick(Type type, Boolean bool, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : bool);
    }
}
