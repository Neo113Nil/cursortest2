package com.vk.dto.user.deactivation;

import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.zrp;

/* compiled from: Deactivation.kt */
/* loaded from: classes18.dex */
public interface Deactivation extends Serializer.StreamParcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Deactivation.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason Adult;
        public static final Reason Banned;
        public static final Reason Blacklisted;
        public static final a Companion;
        public static final Reason Deleted;
        public static final Reason Hidden;
        private final int state;

        /* compiled from: Deactivation.kt */
        public static final class a {
            public static Reason a(int i) {
                Reason reason = Reason.Banned;
                if (i == reason.h()) {
                    return reason;
                }
                Reason reason2 = Reason.Adult;
                if (i == reason2.h()) {
                    return reason2;
                }
                Reason reason3 = Reason.Hidden;
                if (i == reason3.h()) {
                    return reason3;
                }
                Reason reason4 = Reason.Deleted;
                if (i != reason4.h()) {
                    Reason reason5 = Reason.Blacklisted;
                    if (i == reason5.h()) {
                        return reason5;
                    }
                }
                return reason4;
            }
        }

        static {
            Reason reason = new Reason("Banned", 0, 1);
            Banned = reason;
            Reason reason2 = new Reason("Adult", 1, 2);
            Adult = reason2;
            Reason reason3 = new Reason("Hidden", 2, 3);
            Hidden = reason3;
            Reason reason4 = new Reason("Deleted", 3, 4);
            Deleted = reason4;
            Reason reason5 = new Reason("Blacklisted", 4, 5);
            Blacklisted = reason5;
            Reason[] reasonArr = {reason, reason2, reason3, reason4, reason5};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
            Companion = new a();
        }

        public Reason(String str, int i, int i2) {
            this.state = i2;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        public final int h() {
            return this.state;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Deactivation.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BANNED;
        public static final a Companion;
        public static final Type GEO_BLOCKED;

        /* compiled from: Deactivation.kt */
        public static final class a {
        }

        static {
            Type type = new Type("GEO_BLOCKED", 0);
            GEO_BLOCKED = type;
            Type type2 = new Type("BANNED", 1);
            BANNED = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    default int O4() {
        return 0;
    }

    Reason getReason();

    Type getType();

    String q5();
}
