package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import defpackage.q0;
import xsna.epx;
import xsna.kj50;
import xsna.ug5;

/* compiled from: BiometricsLockSettingsAction.kt */
/* loaded from: classes15.dex */
public interface a extends kj50 {

    /* compiled from: BiometricsLockSettingsAction.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a$a, reason: collision with other inner class name */
    public static final class C0429a implements a {
        public static final C0429a b = new C0429a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0429a);
        }

        public final int hashCode() {
            return 1759168504;
        }

        public final String toString() {
            return "ChangePassword";
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public interface b extends a {

        /* compiled from: BiometricsLockSettingsAction.kt */
        /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a$b$a, reason: collision with other inner class name */
        public static final class C0430a implements b {
            public static final C0430a b = new C0430a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0430a);
            }

            public final int hashCode() {
                return -772397114;
            }

            public final String toString() {
                return "HideAll";
            }
        }

        /* compiled from: BiometricsLockSettingsAction.kt */
        /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a$b$b, reason: collision with other inner class name */
        public static final class C0431b implements b {
            public static final C0431b b = new C0431b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0431b);
            }

            public final int hashCode() {
                return 2057725847;
            }

            public final String toString() {
                return "ShowBiometricsError";
            }
        }

        /* compiled from: BiometricsLockSettingsAction.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 152123742;
            }

            public final String toString() {
                return "ShowTooManyBiometricsAttempts";
            }
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 497446440;
        }

        public final String toString() {
            return "DisableSecureEntrance";
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2069248291;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class e implements a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -88923451;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class f implements a {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SaveBiometricStatus(isSuccess="), this.b, ')');
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class g implements a {
        public final ug5 b;

        public g(ug5 ug5Var) {
            this.b = ug5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetAutoLockTimeStrategy(strategy=" + this.b + ')';
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class h implements a {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1841055551;
        }

        public final String toString() {
            return "ShowAutoLockTimePicker";
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class i implements a {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1614663152;
        }

        public final String toString() {
            return "ShowHideAppContentBottomSheet";
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class j implements a {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1195812756;
        }

        public final String toString() {
            return "ShowPasswordChangedSnackbar";
        }
    }

    /* compiled from: BiometricsLockSettingsAction.kt */
    public static final class k implements a {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1364115868;
        }

        public final String toString() {
            return "TurnBiometricEntrance";
        }
    }
}
