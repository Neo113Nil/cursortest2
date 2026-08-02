package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSuperappStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem implements SchemeStat$TypeClick.b {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSuperappStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("onboarding_panel_click")
        public static final Type ONBOARDING_PANEL_CLICK;

        @pmi0("onboarding_panel_close")
        public static final Type ONBOARDING_PANEL_CLOSE;

        @pmi0("superapp_step_1_close")
        public static final Type SUPERAPP_STEP_1_CLOSE;

        @pmi0("superapp_step_1_next")
        public static final Type SUPERAPP_STEP_1_NEXT;

        @pmi0("superapp_step_2_close")
        public static final Type SUPERAPP_STEP_2_CLOSE;

        @pmi0("superapp_step_2_next")
        public static final Type SUPERAPP_STEP_2_NEXT;

        static {
            Type type = new Type("SUPERAPP_STEP_1_NEXT", 0);
            SUPERAPP_STEP_1_NEXT = type;
            Type type2 = new Type("SUPERAPP_STEP_1_CLOSE", 1);
            SUPERAPP_STEP_1_CLOSE = type2;
            Type type3 = new Type("SUPERAPP_STEP_2_NEXT", 2);
            SUPERAPP_STEP_2_NEXT = type3;
            Type type4 = new Type("SUPERAPP_STEP_2_CLOSE", 3);
            SUPERAPP_STEP_2_CLOSE = type4;
            Type type5 = new Type("ONBOARDING_PANEL_CLICK", 4);
            ONBOARDING_PANEL_CLICK = type5;
            Type type6 = new Type("ONBOARDING_PANEL_CLOSE", 5);
            ONBOARDING_PANEL_CLOSE = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
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

    public MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem) && this.type == ((MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "TypeSuperappOnboardingClickItem(type=" + this.type + ')';
    }
}
