package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import xsna.epx;
import xsna.hsk0;

/* compiled from: BiometricsLockSecuritySetupSideEffect.kt */
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: BiometricsLockSecuritySetupSideEffect.kt */
    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1849730975;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupSideEffect.kt */
    public static final class b implements f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -237185144;
        }

        public final String toString() {
            return "OpenBiometricSettings";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupSideEffect.kt */
    public static final class c implements f {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1311794181;
        }

        public final String toString() {
            return "OpenSystemSettings";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupSideEffect.kt */
    public static final class d implements f {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 375146706;
        }

        public final String toString() {
            return "RequestBiometric";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupSideEffect.kt */
    public static final class e implements f {
        public final hsk0 a;

        public e(hsk0 hsk0Var) {
            this.a = hsk0Var;
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
            return "StatEvent(item=" + this.a + ')';
        }
    }
}
