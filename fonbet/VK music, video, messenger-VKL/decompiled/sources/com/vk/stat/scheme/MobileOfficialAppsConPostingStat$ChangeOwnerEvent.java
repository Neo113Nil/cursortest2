package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$ChangeOwnerEvent {

    @pmi0("change_owner_type")
    private final ChangeOwnerType changeOwnerType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class ChangeOwnerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeOwnerType[] $VALUES;

        @pmi0("change_owner")
        public static final ChangeOwnerType CHANGE_OWNER;

        static {
            ChangeOwnerType changeOwnerType = new ChangeOwnerType("CHANGE_OWNER", 0);
            CHANGE_OWNER = changeOwnerType;
            ChangeOwnerType[] changeOwnerTypeArr = {changeOwnerType};
            $VALUES = changeOwnerTypeArr;
            $ENTRIES = new asp(changeOwnerTypeArr);
        }

        private ChangeOwnerType(String str, int i) {
        }

        public static ChangeOwnerType valueOf(String str) {
            return (ChangeOwnerType) Enum.valueOf(ChangeOwnerType.class, str);
        }

        public static ChangeOwnerType[] values() {
            return (ChangeOwnerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$ChangeOwnerEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$ChangeOwnerEvent) && this.changeOwnerType == ((MobileOfficialAppsConPostingStat$ChangeOwnerEvent) obj).changeOwnerType;
    }

    public final int hashCode() {
        ChangeOwnerType changeOwnerType = this.changeOwnerType;
        if (changeOwnerType == null) {
            return 0;
        }
        return changeOwnerType.hashCode();
    }

    public final String toString() {
        return "ChangeOwnerEvent(changeOwnerType=" + this.changeOwnerType + ')';
    }

    public MobileOfficialAppsConPostingStat$ChangeOwnerEvent(ChangeOwnerType changeOwnerType) {
        this.changeOwnerType = changeOwnerType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$ChangeOwnerEvent(ChangeOwnerType changeOwnerType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : changeOwnerType);
    }
}
