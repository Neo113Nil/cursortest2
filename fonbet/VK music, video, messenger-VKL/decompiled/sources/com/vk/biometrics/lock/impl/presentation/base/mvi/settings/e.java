package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import xsna.epx;
import xsna.fm50;
import xsna.h0u0;
import xsna.i47;
import xsna.qoy;
import xsna.sr;
import xsna.tr;
import xsna.ug5;
import xsna.x87;
import xsna.yzt0;

/* compiled from: BiometricsLockSettingsRender.kt */
/* loaded from: classes15.dex */
public interface e extends fm50<x87> {

    /* compiled from: BiometricsLockSettingsRender.kt */
    public static final class a implements e {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<ug5> c;
        public final yzt0<i47> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isBiometricEntranceEnabled=");
            sb.append(this.a);
            sb.append(", isBiometricAvailable=");
            sb.append(this.b);
            sb.append(", autoLockTimeStrategy=");
            sb.append(this.c);
            sb.append(", dialogs=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: BiometricsLockSettingsRender.kt */
    public static final class b implements e {
        public static final b a = new b();

        /* compiled from: BiometricsLockSettingsRender.kt */
        public static final class a {
            public final boolean a;
            public final boolean b;
            public final ug5 c;

            public a(boolean z, boolean z2, ug5 ug5Var) {
                this.a = z;
                this.b = z2;
                this.c = ug5Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                return "InitialRender(isBiometricEntranceEnabled=" + this.a + ", isBiometricAvailable=" + this.b + ", autoLockTimeStrategy=" + this.c + ')';
            }
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -492169088;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
