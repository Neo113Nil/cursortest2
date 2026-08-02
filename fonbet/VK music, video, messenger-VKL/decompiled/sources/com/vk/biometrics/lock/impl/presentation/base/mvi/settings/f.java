package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import java.util.List;
import xsna.epx;
import xsna.hsk0;
import xsna.ms9;
import xsna.ug5;

/* compiled from: BiometricsLockSettingsSideEffect.kt */
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 949462950;
        }

        public final String toString() {
            return "ChangePassword";
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class b implements f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 596455098;
        }

        public final String toString() {
            return "DisableSecureEntrance";
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class c implements f {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -505408013;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class d implements f {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 727526423;
        }

        public final String toString() {
            return "OpenSystemSettings";
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class e implements f {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -165822577;
        }

        public final String toString() {
            return "RequestBiometrics";
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.settings.f$f, reason: collision with other inner class name */
    public static final class C0435f implements f {
        public final List<ug5> a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0435f(List<? extends ug5> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0435f) && epx.f(this.a, ((C0435f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ShowAutoLockTimePicker(actions="), this.a);
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class g implements f {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 40623234;
        }

        public final String toString() {
            return "ShowHideAppContentBottomSheet";
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class h implements f {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1603587418;
        }

        public final String toString() {
            return "ShowPasswordChangedSnackbar";
        }
    }

    /* compiled from: BiometricsLockSettingsSideEffect.kt */
    public static final class i implements f {
        public final hsk0 a;

        public i(hsk0 hsk0Var) {
            this.a = hsk0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StatEvent(item=" + this.a + ')';
        }
    }
}
