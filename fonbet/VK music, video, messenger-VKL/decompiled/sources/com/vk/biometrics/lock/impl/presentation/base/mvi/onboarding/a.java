package com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding;

import xsna.kj50;

/* compiled from: BiometricsLockOnboardingAction.kt */
/* loaded from: classes15.dex */
public interface a extends kj50 {

    /* compiled from: BiometricsLockOnboardingAction.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.a$a, reason: collision with other inner class name */
    public static final class C0424a implements a {
        public static final C0424a b = new C0424a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0424a);
        }

        public final int hashCode() {
            return -2022972515;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: BiometricsLockOnboardingAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -890470523;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BiometricsLockOnboardingAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 700313672;
        }

        public final String toString() {
            return "SetPinClick";
        }
    }
}
