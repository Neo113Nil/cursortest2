package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import com.vk.biometrics.lock.impl.domain.model.UnlockType;
import xsna.epx;
import xsna.o3v;
import xsna.qoy;
import xsna.vu5;
import xsna.wla0;
import xsna.xl50;

/* compiled from: BiometricsLockPinPatch.kt */
/* loaded from: classes15.dex */
public interface d extends xl50 {

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class a implements d {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AddPasswordDigit(digit="), this.b, ')');
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class b implements d {
        public final boolean b;
        public final UnlockType c;

        public b(boolean z, UnlockType unlockType) {
            this.b = z;
            this.c = unlockType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "BiometricStatus(isSuccess=" + this.b + ", unlockType=" + this.c + ')';
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class c implements d {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1365910885;
        }

        public final String toString() {
            return "BiometricsInvalidated";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.pin.d$d, reason: collision with other inner class name */
    public static final class C0427d implements d {
        public static final C0427d b = new C0427d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0427d);
        }

        public final int hashCode() {
            return 985206485;
        }

        public final String toString() {
            return "ClearPassword";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class e implements d {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -709387000;
        }

        public final String toString() {
            return "ConfirmPassword";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class f implements d {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 831143824;
        }

        public final String toString() {
            return "ErrorPassword";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class g implements d {
        public final o3v b;

        public g(o3v o3vVar) {
            this.b = o3vVar;
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
            return "HideDialog(type=" + this.b + ')';
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class h implements d {
        public final com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c b;
        public final boolean c;
        public final wla0 d;

        public h(com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar, boolean z, wla0 wla0Var) {
            this.b = cVar;
            this.c = z;
            this.d = wla0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && this.c == hVar.c && epx.f(this.d, hVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "Loaded(pinMode=" + this.b + ", isBiometricBtnVisible=" + this.c + ", backoff=" + this.d + ')';
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class i implements d {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1589947236;
        }

        public final String toString() {
            return "OnLeftBtnClicked";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class j implements d {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -18847466;
        }

        public final String toString() {
            return "RemoveDigit";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class k implements d {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -2109996213;
        }

        public final String toString() {
            return "SuccessPassword";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class l implements d {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -546204255;
        }

        public final String toString() {
            return "TooManyBiometricsAttempts";
        }
    }

    /* compiled from: BiometricsLockPinPatch.kt */
    public static final class m implements d {
        public final wla0 b;

        public m(wla0 wla0Var) {
            this.b = wla0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateBackoff(backoff=" + this.b + ')';
        }
    }
}
