package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeSettingsItem implements SchemeStat$TypeAction.b {

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("kws")
        public static final Type KWS;

        @pmi0("system_assistant")
        public static final Type SYSTEM_ASSISTANT;

        static {
            Type type = new Type("KWS", 0);
            KWS = type;
            Type type2 = new Type("SYSTEM_ASSISTANT", 1);
            SYSTEM_ASSISTANT = type2;
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

    public MobileOfficialAppsMarusiaStat$TypeSettingsItem(Type type, boolean z) {
        this.type = type;
        this.enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeSettingsItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeSettingsItem mobileOfficialAppsMarusiaStat$TypeSettingsItem = (MobileOfficialAppsMarusiaStat$TypeSettingsItem) obj;
        return this.type == mobileOfficialAppsMarusiaStat$TypeSettingsItem.type && this.enabled == mobileOfficialAppsMarusiaStat$TypeSettingsItem.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSettingsItem(type=");
        sb.append(this.type);
        sb.append(", enabled=");
        return defpackage.q0.a(sb, this.enabled, ')');
    }
}
