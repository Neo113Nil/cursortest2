package com.vk.auth.main;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: LibverifyControllerProvider.kt */
/* loaded from: classes15.dex */
public interface LibverifyListener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LibverifyControllerProvider.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ENTER_PHONE;
        public static final State ENTER_SMS_CODE;

        static {
            State state = new State("ENTER_PHONE", 0);
            ENTER_PHONE = state;
            State state2 = new State("ENTER_SMS_CODE", 1);
            ENTER_SMS_CODE = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: LibverifyControllerProvider.kt */
    public static abstract class a {

        /* compiled from: LibverifyControllerProvider.kt */
        /* renamed from: com.vk.auth.main.LibverifyListener$a$a, reason: collision with other inner class name */
        public static final class C0402a extends a {
            public final String a;

            public C0402a(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0402a) && epx.f(this.a, ((C0402a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("GeneralError(description="), this.a, ')');
            }
        }

        /* compiled from: LibverifyControllerProvider.kt */
        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("IncorrectPhoneNumberError(description="), this.a, ')');
            }
        }

        /* compiled from: LibverifyControllerProvider.kt */
        public static final class c extends a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("IncorrectSmsCodeError(description="), this.a, ')');
            }
        }

        /* compiled from: LibverifyControllerProvider.kt */
        public static final class d extends a {
            public final String a;

            public d(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NetworkError(description="), this.a, ')');
            }
        }

        /* compiled from: LibverifyControllerProvider.kt */
        public static final class e extends a {
            public final String a;

            public e(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NoMoreRoutesError(description="), this.a, ')');
            }
        }

        /* compiled from: LibverifyControllerProvider.kt */
        public static final class f extends a {
            public final String a;

            public f(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NoNetworkError(description="), this.a, ')');
            }
        }

        /* compiled from: LibverifyControllerProvider.kt */
        public static final class g extends a {
            public final String a;

            public g(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("RateLimitError(description="), this.a, ')');
            }
        }

        /* compiled from: LibverifyControllerProvider.kt */
        public static final class h extends a {
            public final String a;

            public h(String str) {
                this.a = str;
            }

            @Override // com.vk.auth.main.LibverifyListener.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("UnsupportedNumberError(description="), this.a, ')');
            }
        }

        public abstract String a();
    }

    void a(Integer num, String str);

    void b(String str, String str2);

    void c(State state);

    void d(boolean z);

    void e(String str, String str2);

    void f(Integer num, String str, String str2);

    void g(a aVar);

    void h(Integer num, String str);

    void onCompleted(String str, String str2, String str3);

    void onNotification(String str);

    void onProgress(boolean z);
}
