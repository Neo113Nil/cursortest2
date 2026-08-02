package com.google.firebase.sessions.api;

import xsna.epx;
import xsna.ho8;

/* compiled from: SessionSubscriber.kt */
/* loaded from: classes.dex */
public interface SessionSubscriber {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionSubscriber.kt */
    public static final class Name {
        private static final /* synthetic */ Name[] $VALUES;
        public static final Name CRASHLYTICS;
        public static final Name MATT_SAYS_HI;
        public static final Name PERFORMANCE;

        static {
            Name name = new Name("CRASHLYTICS", 0);
            CRASHLYTICS = name;
            Name name2 = new Name("PERFORMANCE", 1);
            PERFORMANCE = name2;
            Name name3 = new Name("MATT_SAYS_HI", 2);
            MATT_SAYS_HI = name3;
            $VALUES = new Name[]{name, name2, name3};
        }

        public Name() {
            throw null;
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    /* compiled from: SessionSubscriber.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
        }
    }

    boolean a();

    void b(a aVar);

    Name c();
}
