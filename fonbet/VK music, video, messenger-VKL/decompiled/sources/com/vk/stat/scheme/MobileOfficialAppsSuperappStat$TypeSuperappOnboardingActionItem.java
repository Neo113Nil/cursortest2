package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSuperappStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem implements SchemeStat$TypeAction.b {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSuperappStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("superapp_step_1_show")
        public static final Type SUPERAPP_STEP_1_SHOW;

        @pmi0("superapp_step_2_show")
        public static final Type SUPERAPP_STEP_2_SHOW;

        static {
            Type type = new Type("SUPERAPP_STEP_1_SHOW", 0);
            SUPERAPP_STEP_1_SHOW = type;
            Type type2 = new Type("SUPERAPP_STEP_2_SHOW", 1);
            SUPERAPP_STEP_2_SHOW = type2;
            Type[] typeArr = {type, type2};
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

    public MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem) && this.type == ((MobileOfficialAppsSuperappStat$TypeSuperappOnboardingActionItem) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "TypeSuperappOnboardingActionItem(type=" + this.type + ')';
    }
}
