package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import xsna.xl50;

/* compiled from: BiometricsLockSecuritySetupPatch.kt */
/* loaded from: classes15.dex */
public interface c extends xl50 {

    /* compiled from: BiometricsLockSecuritySetupPatch.kt */
    public static final class a implements c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "BiometricsErrorDialog(isVisible=true)";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupPatch.kt */
    public static final class b implements c {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1933921766;
        }

        public final String toString() {
            return "HideDialogs";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupPatch.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.setup.c$c, reason: collision with other inner class name */
    public static final class C0437c implements c {
        public static final C0437c b = new C0437c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0437c);
        }

        public final int hashCode() {
            return 1953600648;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupPatch.kt */
    public static final class d implements c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "TooManyBiometricsAttemptsDialog(isVisible=true)";
        }
    }
}
