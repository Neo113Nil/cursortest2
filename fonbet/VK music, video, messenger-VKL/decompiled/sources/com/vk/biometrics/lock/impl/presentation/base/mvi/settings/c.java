package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.ug5;
import xsna.xl50;

/* compiled from: BiometricsLockSettingsPatch.kt */
/* loaded from: classes15.dex */
public interface c extends xl50 {

    /* compiled from: BiometricsLockSettingsPatch.kt */
    public interface a extends c {

        /* compiled from: BiometricsLockSettingsPatch.kt */
        /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.settings.c$a$a, reason: collision with other inner class name */
        public static final class C0432a implements a {
            public static final C0432a b = new C0432a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0432a);
            }

            public final int hashCode() {
                return -2047504534;
            }

            public final String toString() {
                return "HideAll";
            }
        }

        /* compiled from: BiometricsLockSettingsPatch.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -762584883;
            }

            public final String toString() {
                return "ShowBiometrics";
            }
        }

        /* compiled from: BiometricsLockSettingsPatch.kt */
        /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.settings.c$a$c, reason: collision with other inner class name */
        public static final class C0433c implements a {
            public static final C0433c b = new C0433c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0433c);
            }

            public final int hashCode() {
                return -1606447614;
            }

            public final String toString() {
                return "ShowTooManyBiometricsAttempts";
            }
        }
    }

    /* compiled from: BiometricsLockSettingsPatch.kt */
    public static final class b implements c {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -501881340;
        }

        public final String toString() {
            return "DisableSecureEntrance";
        }
    }

    /* compiled from: BiometricsLockSettingsPatch.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.settings.c$c, reason: collision with other inner class name */
    public static final class C0434c implements c {
        public final boolean b;
        public final boolean c;
        public final ug5 d;

        public C0434c(boolean z, boolean z2, ug5 ug5Var) {
            this.b = z;
            this.c = z2;
            this.d = ug5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0434c)) {
                return false;
            }
            C0434c c0434c = (C0434c) obj;
            return this.b == c0434c.b && this.c == c0434c.c && epx.f(this.d, c0434c.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            return "Loaded(isBiometricEntranceEnabled=" + this.b + ", isBiometricAvailable=" + this.c + ", autoLockTimeStrategy=" + this.d + ')';
        }
    }

    /* compiled from: BiometricsLockSettingsPatch.kt */
    public static final class d implements c {
        public final ug5 b;

        public d(ug5 ug5Var) {
            this.b = ug5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetAutoLockTimeStrategy(strategy=" + this.b + ')';
        }
    }

    /* compiled from: BiometricsLockSettingsPatch.kt */
    public static final class e implements c {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("TurnBiometricEntrance(isEnabled="), this.b, ')');
        }
    }
}
