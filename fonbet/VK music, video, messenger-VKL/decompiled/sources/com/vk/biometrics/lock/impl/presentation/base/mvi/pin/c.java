package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

/* compiled from: BiometricsLockPinRender.kt */
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: BiometricsLockPinRender.kt */
    public interface a extends c {
    }

    /* compiled from: BiometricsLockPinRender.kt */
    public static final class b implements c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 139246665;
        }

        public final String toString() {
            return "ChangePassword";
        }
    }

    /* compiled from: BiometricsLockPinRender.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c$c, reason: collision with other inner class name */
    public static final class C0426c implements c {
        public static final C0426c a = new C0426c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0426c);
        }

        public final int hashCode() {
            return -866039971;
        }

        public final String toString() {
            return "ConfirmPassword";
        }
    }

    /* compiled from: BiometricsLockPinRender.kt */
    public static final class d implements a {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -284959867;
        }

        public final String toString() {
            return "DisablePassword";
        }
    }

    /* compiled from: BiometricsLockPinRender.kt */
    public static final class e implements a {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1845960715;
        }

        public final String toString() {
            return "EnterPassword";
        }
    }

    /* compiled from: BiometricsLockPinRender.kt */
    public static final class f implements c {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 313088806;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: BiometricsLockPinRender.kt */
    public static final class g implements a {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 646183108;
        }

        public final String toString() {
            return "OldPassword";
        }
    }
}
