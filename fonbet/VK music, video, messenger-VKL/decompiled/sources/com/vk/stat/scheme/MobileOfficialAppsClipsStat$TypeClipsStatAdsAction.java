package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsStatAdsAction implements SchemeStat$TypeAction.b {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("start")
        public static final Type START;

        static {
            Type type = new Type("START", 0);
            START = type;
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

    public MobileOfficialAppsClipsStat$TypeClipsStatAdsAction(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipsStatAdsAction) && this.type == ((MobileOfficialAppsClipsStat$TypeClipsStatAdsAction) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "TypeClipsStatAdsAction(type=" + this.type + ')';
    }
}
