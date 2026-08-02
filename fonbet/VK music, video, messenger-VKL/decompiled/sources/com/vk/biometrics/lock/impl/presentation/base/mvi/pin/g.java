package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.domain.model.PinLockLogoutReason;
import defpackage.q0;
import xsna.epx;
import xsna.r4q0;

/* compiled from: BiometricsLockPinSideEffect.kt */
/* loaded from: classes15.dex */
public interface g {

    /* compiled from: BiometricsLockPinSideEffect.kt */
    public static final class a implements g {
        public final PinLockLogoutReason a;

        public a(PinLockLogoutReason pinLockLogoutReason) {
            this.a = pinLockLogoutReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Logout(logoutReason=" + this.a + ')';
        }
    }

    /* compiled from: BiometricsLockPinSideEffect.kt */
    public static final class b implements g {
        public final boolean a;

        public b() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("NavigateBack(shouldDoSomething="), this.a, ')');
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: BiometricsLockPinSideEffect.kt */
    public static final class c implements g {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2092689899;
        }

        public final String toString() {
            return "NavigateChangePassword";
        }
    }

    /* compiled from: BiometricsLockPinSideEffect.kt */
    public static final class d implements g {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 987867699;
        }

        public final String toString() {
            return "NavigateSecuritySetup";
        }
    }

    /* compiled from: BiometricsLockPinSideEffect.kt */
    public static final class e implements g {
        public final boolean a;

        public e() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("NavigateSettings(isPasswordChanged="), this.a, ')');
        }

        public e(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: BiometricsLockPinSideEffect.kt */
    public static final class f implements g {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -969974398;
        }

        public final String toString() {
            return "RequestBiometric";
        }
    }

    /* compiled from: BiometricsLockPinSideEffect.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g$g, reason: collision with other inner class name */
    public static final class C0428g implements g {
        public final r4q0 a;

        public C0428g(r4q0 r4q0Var) {
            this.a = r4q0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0428g) && epx.f(this.a, ((C0428g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StatEvent(item=" + this.a + ')';
        }
    }
}
