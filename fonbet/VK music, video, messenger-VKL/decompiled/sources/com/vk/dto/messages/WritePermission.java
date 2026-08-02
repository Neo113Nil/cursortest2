package com.vk.dto.messages;

import xsna.asp;
import xsna.vu5;
import xsna.zrp;

/* compiled from: WritePermission.kt */
/* loaded from: classes18.dex */
public final class WritePermission {
    public final State a;
    public final long b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WritePermission.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final a Companion;
        public static final State DISABLED_BROADCAST;
        public static final State DISABLED_CHANNEL;
        public static final State DISABLED_COMMUNITY_CHAT;
        public static final State DISABLED_DONUT_EXPIRED;
        public static final State DISABLED_DUE_SPAM;
        public static final State DISABLED_MOVED_TO_MAX;
        public static final State DISABLED_NEED_EDU_ROLE;
        public static final State DISABLED_NEED_MESSAGE_REQUEST;
        public static final State DISABLED_PENDING_MESSAGE_REQUEST;
        public static final State DISABLED_RECEIVER_ACCESS_DENIED;
        public static final State DISABLED_RECEIVER_DELETED;
        public static final State DISABLED_RECEIVER_MSG_NOT_ENABLED;
        public static final State DISABLED_RECEIVER_PERMISSION_REQUIRED;
        public static final State DISABLED_RECEIVER_PRIVACY_SETTINGS;
        public static final State DISABLED_RECIPIENT_BLACKLISTED;
        public static final State DISABLED_RESTRICTED;
        public static final State DISABLED_RESTRICTED_TO_ALL;
        public static final State DISABLED_SENDER_FORBIDDEN;
        public static final State DISABLED_SENDER_KICKED;
        public static final State DISABLED_SENDER_LEFT;
        public static final State DISABLED_UNAVAILABLE;
        public static final State DISABLED_UNKNOWN;
        public static final State ENABLED;
        private static final State[] values;
        private final int id;

        /* compiled from: WritePermission.kt */
        public static final class a {
        }

        static {
            State state = new State("ENABLED", 0, 0);
            ENABLED = state;
            State state2 = new State("DISABLED_UNKNOWN", 1, 1);
            DISABLED_UNKNOWN = state2;
            State state3 = new State("DISABLED_SENDER_FORBIDDEN", 2, 2);
            DISABLED_SENDER_FORBIDDEN = state3;
            State state4 = new State("DISABLED_RECEIVER_PRIVACY_SETTINGS", 3, 3);
            DISABLED_RECEIVER_PRIVACY_SETTINGS = state4;
            State state5 = new State("DISABLED_RECEIVER_PERMISSION_REQUIRED", 4, 4);
            DISABLED_RECEIVER_PERMISSION_REQUIRED = state5;
            State state6 = new State("DISABLED_RECEIVER_ACCESS_DENIED", 5, 5);
            DISABLED_RECEIVER_ACCESS_DENIED = state6;
            State state7 = new State("DISABLED_RECEIVER_MSG_NOT_ENABLED", 6, 6);
            DISABLED_RECEIVER_MSG_NOT_ENABLED = state7;
            State state8 = new State("DISABLED_RECEIVER_DELETED", 7, 7);
            DISABLED_RECEIVER_DELETED = state8;
            State state9 = new State("DISABLED_SENDER_KICKED", 8, 8);
            DISABLED_SENDER_KICKED = state9;
            State state10 = new State("DISABLED_SENDER_LEFT", 9, 9);
            DISABLED_SENDER_LEFT = state10;
            State state11 = new State("DISABLED_CHANNEL", 10, 10);
            DISABLED_CHANNEL = state11;
            State state12 = new State("DISABLED_COMMUNITY_CHAT", 11, 11);
            DISABLED_COMMUNITY_CHAT = state12;
            State state13 = new State("DISABLED_UNAVAILABLE", 12, 12);
            DISABLED_UNAVAILABLE = state13;
            State state14 = new State("DISABLED_DONUT_EXPIRED", 13, 13);
            DISABLED_DONUT_EXPIRED = state14;
            State state15 = new State("DISABLED_RESTRICTED", 14, 14);
            DISABLED_RESTRICTED = state15;
            State state16 = new State("DISABLED_RESTRICTED_TO_ALL", 15, 15);
            DISABLED_RESTRICTED_TO_ALL = state16;
            State state17 = new State("DISABLED_DUE_SPAM", 16, 16);
            DISABLED_DUE_SPAM = state17;
            State state18 = new State("DISABLED_BROADCAST", 17, 17);
            DISABLED_BROADCAST = state18;
            State state19 = new State("DISABLED_NEED_EDU_ROLE", 18, 18);
            DISABLED_NEED_EDU_ROLE = state19;
            State state20 = new State("DISABLED_NEED_MESSAGE_REQUEST", 19, 19);
            DISABLED_NEED_MESSAGE_REQUEST = state20;
            State state21 = new State("DISABLED_PENDING_MESSAGE_REQUEST", 20, 20);
            DISABLED_PENDING_MESSAGE_REQUEST = state21;
            State state22 = new State("DISABLED_MOVED_TO_MAX", 21, 21);
            DISABLED_MOVED_TO_MAX = state22;
            State state23 = new State("DISABLED_RECIPIENT_BLACKLISTED", 22, 22);
            DISABLED_RECIPIENT_BLACKLISTED = state23;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7, state8, state9, state10, state11, state12, state13, state14, state15, state16, state17, state18, state19, state20, state21, state22, state23};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
            Companion = new a();
            values = values();
        }

        public State(String str, int i, int i2) {
            this.id = i2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final int i() {
            return this.id;
        }
    }

    public /* synthetic */ WritePermission(State state) {
        this(state, 0L);
    }

    public final State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WritePermission)) {
            return false;
        }
        WritePermission writePermission = (WritePermission) obj;
        return this.a == writePermission.a && this.b == writePermission.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WritePermission(state=");
        sb.append(this.a);
        sb.append(", restrictedTill=");
        return vu5.a(')', this.b, sb);
    }

    public WritePermission(State state, long j) {
        this.a = state;
        this.b = j;
    }
}
