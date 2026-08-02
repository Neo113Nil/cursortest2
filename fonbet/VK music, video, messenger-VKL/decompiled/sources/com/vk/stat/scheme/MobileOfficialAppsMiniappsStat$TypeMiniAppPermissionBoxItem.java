package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem implements SchemeStat$TypeClick.b {

    @pmi0("action")
    private final Action action;

    @pmi0("app_id")
    private final MobileOfficialAppsMiniappsStat$AppIdItem appId;

    @pmi0("name")
    private final Name name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("allow")
        public static final Action ALLOW;

        @pmi0("deny")
        public static final Action DENY;

        @pmi0("show")
        public static final Action SHOW;

        static {
            Action action = new Action("SHOW", 0);
            SHOW = action;
            Action action2 = new Action("ALLOW", 1);
            ALLOW = action2;
            Action action3 = new Action("DENY", 2);
            DENY = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("allow_global_notifications")
        public static final Name ALLOW_GLOBAL_NOTIFICATIONS;

        @pmi0("allow_messages_from_group")
        public static final Name ALLOW_MESSAGES_FROM_GROUP;

        @pmi0("allow_notifications")
        public static final Name ALLOW_NOTIFICATIONS;

        @pmi0("get_email")
        public static final Name GET_EMAIL;

        @pmi0("get_geodata")
        public static final Name GET_GEODATA;

        @pmi0("get_phone_number")
        public static final Name GET_PHONE_NUMBER;

        @pmi0("join_group")
        public static final Name JOIN_GROUP;

        static {
            Name name = new Name("JOIN_GROUP", 0);
            JOIN_GROUP = name;
            Name name2 = new Name("GET_GEODATA", 1);
            GET_GEODATA = name2;
            Name name3 = new Name("ALLOW_NOTIFICATIONS", 2);
            ALLOW_NOTIFICATIONS = name3;
            Name name4 = new Name("ALLOW_GLOBAL_NOTIFICATIONS", 3);
            ALLOW_GLOBAL_NOTIFICATIONS = name4;
            Name name5 = new Name("ALLOW_MESSAGES_FROM_GROUP", 4);
            ALLOW_MESSAGES_FROM_GROUP = name5;
            Name name6 = new Name("GET_EMAIL", 5);
            GET_EMAIL = name6;
            Name name7 = new Name("GET_PHONE_NUMBER", 6);
            GET_PHONE_NUMBER = name7;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7};
            $VALUES = nameArr;
            $ENTRIES = new asp(nameArr);
        }

        private Name(String str, int i) {
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem(Name name, Action action, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem) {
        this.name = name;
        this.action = action;
        this.appId = mobileOfficialAppsMiniappsStat$AppIdItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem = (MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem) obj;
        return this.name == mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.name && this.action == mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.action && epx.f(this.appId, mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.appId);
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + (this.name.hashCode() * 31)) * 31;
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = this.appId;
        return hashCode + (mobileOfficialAppsMiniappsStat$AppIdItem == null ? 0 : mobileOfficialAppsMiniappsStat$AppIdItem.hashCode());
    }

    public final String toString() {
        return "TypeMiniAppPermissionBoxItem(name=" + this.name + ", action=" + this.action + ", appId=" + this.appId + ')';
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem(Name name, Action action, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, int i, zcl zclVar) {
        this(name, action, (i & 4) != 0 ? null : mobileOfficialAppsMiniappsStat$AppIdItem);
    }
}
