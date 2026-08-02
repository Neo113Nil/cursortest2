package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePermissionStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePermissionStat$TypePermissionChange implements SchemeStat$TypeAction.b {

    @pmi0("permission")
    private final Permission permission;

    @pmi0("state")
    private final State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePermissionStat.kt */
    public static final class Permission {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Permission[] $VALUES;

        @pmi0("geo")
        public static final Permission GEO;

        static {
            Permission permission = new Permission("GEO", 0);
            GEO = permission;
            Permission[] permissionArr = {permission};
            $VALUES = permissionArr;
            $ENTRIES = new asp(permissionArr);
        }

        private Permission(String str, int i) {
        }

        public static Permission valueOf(String str) {
            return (Permission) Enum.valueOf(Permission.class, str);
        }

        public static Permission[] values() {
            return (Permission[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePermissionStat.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @pmi0("denied")
        public static final State DENIED;

        @pmi0("granted")
        public static final State GRANTED;

        @pmi0("one_time")
        public static final State ONE_TIME;

        @pmi0("when_in_use")
        public static final State WHEN_IN_USE;

        static {
            State state = new State("GRANTED", 0);
            GRANTED = state;
            State state2 = new State("DENIED", 1);
            DENIED = state2;
            State state3 = new State("ONE_TIME", 2);
            ONE_TIME = state3;
            State state4 = new State("WHEN_IN_USE", 3);
            WHEN_IN_USE = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePermissionStat$TypePermissionChange(Permission permission, State state) {
        this.permission = permission;
        this.state = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePermissionStat$TypePermissionChange)) {
            return false;
        }
        MobileOfficialAppsCorePermissionStat$TypePermissionChange mobileOfficialAppsCorePermissionStat$TypePermissionChange = (MobileOfficialAppsCorePermissionStat$TypePermissionChange) obj;
        return this.permission == mobileOfficialAppsCorePermissionStat$TypePermissionChange.permission && this.state == mobileOfficialAppsCorePermissionStat$TypePermissionChange.state;
    }

    public final int hashCode() {
        return this.state.hashCode() + (this.permission.hashCode() * 31);
    }

    public final String toString() {
        return "TypePermissionChange(permission=" + this.permission + ", state=" + this.state + ')';
    }
}
