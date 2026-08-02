package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import defpackage.q0;
import xsna.d77;
import xsna.epx;
import xsna.fm50;
import xsna.h0u0;
import xsna.p57;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: BiometricsLockPinRender.kt */
/* loaded from: classes15.dex */
public interface f extends fm50<h> {

    /* compiled from: BiometricsLockPinRender.kt */
    public static final class a implements f {
        public final yzt0<d77> a;
        public final yzt0<c> b;
        public final yzt0<Boolean> c;
        public final yzt0<p57> d;

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
            StringBuilder sb = new StringBuilder("Data(passwordContent=");
            sb.append(this.a);
            sb.append(", pinMode=");
            sb.append(this.b);
            sb.append(", isBiometricBtnVisible=");
            sb.append(this.c);
            sb.append(", dialogs=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: BiometricsLockPinRender.kt */
    public static final class b implements f {
        public static final b a = new b();

        /* compiled from: BiometricsLockPinRender.kt */
        public static final class a {
            public final d77 a;
            public final c b;
            public final boolean c;

            public a(d77 d77Var, c cVar, boolean z) {
                this.a = d77Var;
                this.b = cVar;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("InitialRender(passwordContent=");
                sb.append(this.a);
                sb.append(", pinMode=");
                sb.append(this.b);
                sb.append(", isBiometricBtnVisible=");
                return q0.a(sb, this.c, ')');
            }
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1177014238;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
