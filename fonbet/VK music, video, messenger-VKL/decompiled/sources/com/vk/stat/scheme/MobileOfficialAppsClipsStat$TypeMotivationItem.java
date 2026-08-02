package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeMotivationItem implements SchemeStat$TypeAction.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_saa_motivation")
    private final MobileOfficialAppsClipsStat$TypeSaaMotivation typeSaaMotivation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_saa_motivation")
        public static final Type TYPE_SAA_MOTIVATION;

        static {
            Type type = new Type("TYPE_SAA_MOTIVATION", 0);
            TYPE_SAA_MOTIVATION = type;
            Type[] typeArr = {type};
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

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeMotivationItem(Type type, MobileOfficialAppsClipsStat$TypeSaaMotivation mobileOfficialAppsClipsStat$TypeSaaMotivation, zcl zclVar) {
        this(type, mobileOfficialAppsClipsStat$TypeSaaMotivation);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeMotivationItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeMotivationItem mobileOfficialAppsClipsStat$TypeMotivationItem = (MobileOfficialAppsClipsStat$TypeMotivationItem) obj;
        return this.type == mobileOfficialAppsClipsStat$TypeMotivationItem.type && epx.f(this.typeSaaMotivation, mobileOfficialAppsClipsStat$TypeMotivationItem.typeSaaMotivation);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MobileOfficialAppsClipsStat$TypeSaaMotivation mobileOfficialAppsClipsStat$TypeSaaMotivation = this.typeSaaMotivation;
        return hashCode + (mobileOfficialAppsClipsStat$TypeSaaMotivation == null ? 0 : mobileOfficialAppsClipsStat$TypeSaaMotivation.hashCode());
    }

    public final String toString() {
        return "TypeMotivationItem(type=" + this.type + ", typeSaaMotivation=" + this.typeSaaMotivation + ')';
    }

    private MobileOfficialAppsClipsStat$TypeMotivationItem(Type type, MobileOfficialAppsClipsStat$TypeSaaMotivation mobileOfficialAppsClipsStat$TypeSaaMotivation) {
        this.type = type;
        this.typeSaaMotivation = mobileOfficialAppsClipsStat$TypeSaaMotivation;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeMotivationItem(Type type, MobileOfficialAppsClipsStat$TypeSaaMotivation mobileOfficialAppsClipsStat$TypeSaaMotivation, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : mobileOfficialAppsClipsStat$TypeSaaMotivation);
    }
}
