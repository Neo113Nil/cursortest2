package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import defpackage.q0;
import xsna.epx;
import xsna.kj50;
import xsna.o3v;
import xsna.vu5;
import xsna.wla0;

/* compiled from: BiometricsLockPinAction.kt */
/* loaded from: classes15.dex */
public interface a extends kj50 {

    /* compiled from: BiometricsLockPinAction.kt */
    /* renamed from: com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a$a, reason: collision with other inner class name */
    public static final class C0425a implements a {
        public final boolean b;

        public C0425a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0425a) && this.b == ((C0425a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("BiometricStatus(isSuccess="), this.b, ')');
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -210401725;
        }

        public final String toString() {
            return "BiometricsInvalidated";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 270542392;
        }

        public final String toString() {
            return "CheckPassword";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1412620925;
        }

        public final String toString() {
            return "ClearPassword";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class e implements a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -355707088;
        }

        public final String toString() {
            return "HandleSuccess";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class f implements a {
        public final o3v b;

        public f(o3v o3vVar) {
            this.b = o3vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HideDialog(type=" + this.b + ')';
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class g implements a {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -982961413;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class h implements a {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1263243491;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class i implements a {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnDigitEntered(digit="), this.b, ')');
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class j implements a {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 115496636;
        }

        public final String toString() {
            return "OnLeftBtnClicked";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class k implements a {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -661977410;
        }

        public final String toString() {
            return "RemoveDigit";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class l implements a {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 264449353;
        }

        public final String toString() {
            return "TooManyBiometricsAttempts";
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class m implements a {
        public final long b;
        public final long c;

        public m(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.b == mVar.b && this.c == mVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackHideEvent(startTime=");
            sb.append(this.b);
            sb.append(", endTIme=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: BiometricsLockPinAction.kt */
    public static final class n implements a {
        public final wla0 b;

        public n(wla0 wla0Var) {
            this.b = wla0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateBackoff(backoff=" + this.b + ')';
        }
    }
}
