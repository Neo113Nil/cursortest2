package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import defpackage.q0;
import xsna.kj50;

/* compiled from: BiometricsLockSecuritySetupAction.kt */
/* loaded from: classes15.dex */
public interface a extends kj50 {

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a$a, reason: collision with other inner class name */
    public static final class C0436a implements a {
        public static final C0436a b = new C0436a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0436a);
        }

        public final int hashCode() {
            return -1386246619;
        }

        public final String toString() {
            return "HideDialog";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1593228875;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2055156685;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    public static final class d implements a {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SaveBiometricStatus(isSuccess="), this.b, ')');
        }
    }

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    public static final class e implements a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 835109947;
        }

        public final String toString() {
            return "ShowBiometricsDialog";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    public static final class f implements a {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1543802811;
        }

        public final String toString() {
            return "ShowToManyBiometricsAttemptsDialog";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    public static final class g implements a {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2001546208;
        }

        public final String toString() {
            return "SkipBiometricsLock";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupAction.kt */
    public static final class h implements a {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 922207261;
        }

        public final String toString() {
            return "TurnOnBiometricsLock";
        }
    }
}
