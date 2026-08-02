package com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding;

/* compiled from: BiometricsLockOnboardingSideEffect.kt */
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: BiometricsLockOnboardingSideEffect.kt */
    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 144511667;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BiometricsLockOnboardingSideEffect.kt */
    public static final class b implements f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -851568792;
        }

        public final String toString() {
            return "OnCreatePinClicked";
        }
    }
}
