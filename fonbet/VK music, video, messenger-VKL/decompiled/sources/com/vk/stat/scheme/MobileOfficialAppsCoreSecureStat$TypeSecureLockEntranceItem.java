package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreSecureStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem implements SchemeStat$TypeAction.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_secure_lock_failure_entrance_item")
    private final MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem typeSecureLockFailureEntranceItem;

    @pmi0("type_secure_lock_success_entrance_item")
    private final MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem typeSecureLockSuccessEntranceItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreSecureStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_secure_lock_failure_entrance_item")
        public static final Type TYPE_SECURE_LOCK_FAILURE_ENTRANCE_ITEM;

        @pmi0("type_secure_lock_success_entrance_item")
        public static final Type TYPE_SECURE_LOCK_SUCCESS_ENTRANCE_ITEM;

        static {
            Type type = new Type("TYPE_SECURE_LOCK_SUCCESS_ENTRANCE_ITEM", 0);
            TYPE_SECURE_LOCK_SUCCESS_ENTRANCE_ITEM = type;
            Type type2 = new Type("TYPE_SECURE_LOCK_FAILURE_ENTRANCE_ITEM", 1);
            TYPE_SECURE_LOCK_FAILURE_ENTRANCE_ITEM = type2;
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

    private MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem(Type type, MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem, MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem) {
        this.type = type;
        this.typeSecureLockSuccessEntranceItem = mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem;
        this.typeSecureLockFailureEntranceItem = mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem)) {
            return false;
        }
        MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem = (MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem) obj;
        return this.type == mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem.type && epx.f(this.typeSecureLockSuccessEntranceItem, mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem.typeSecureLockSuccessEntranceItem) && epx.f(this.typeSecureLockFailureEntranceItem, mobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem.typeSecureLockFailureEntranceItem);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem = this.typeSecureLockSuccessEntranceItem;
        int hashCode2 = (hashCode + (mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem == null ? 0 : mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem.hashCode())) * 31;
        MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem = this.typeSecureLockFailureEntranceItem;
        return hashCode2 + (mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem != null ? mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSecureLockEntranceItem(type=" + this.type + ", typeSecureLockSuccessEntranceItem=" + this.typeSecureLockSuccessEntranceItem + ", typeSecureLockFailureEntranceItem=" + this.typeSecureLockFailureEntranceItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem(Type type, MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem, MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem, (i & 4) != 0 ? null : mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem);
    }
}
