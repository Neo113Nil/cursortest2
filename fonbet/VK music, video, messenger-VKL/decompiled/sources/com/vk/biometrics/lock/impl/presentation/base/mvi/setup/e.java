package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import xsna.epx;
import xsna.fm50;
import xsna.h0u0;
import xsna.h87;
import xsna.tr;
import xsna.yzt0;

/* compiled from: BiometricsLockSecuritySetupRender.kt */
/* loaded from: classes15.dex */
public interface e extends fm50<h87> {

    /* compiled from: BiometricsLockSecuritySetupRender.kt */
    public static final class a implements e {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1375473362;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: BiometricsLockSecuritySetupRender.kt */
    public static final class b implements e {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(needShowBiometricsDialog=");
            sb.append(this.a);
            sb.append(", isTooManyBiometricsAttemptsDialog=");
            return tr.c(sb, this.b, ')');
        }
    }
}
