package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import defpackage.q0;
import xsna.epx;
import xsna.exo;
import xsna.xl50;
import xsna.xxo;

/* compiled from: EcosystemProfilePatch.kt */
/* loaded from: classes6.dex */
public abstract class d implements xl50 {

    /* compiled from: EcosystemProfilePatch.kt */
    public static final class a extends d {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Error(isRetryButtonVisible="), this.b, ')');
        }
    }

    /* compiled from: EcosystemProfilePatch.kt */
    public static final class b extends d {
        public final exo b;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }

        public final String toString() {
            return "Loading(ecoplateLoadingVisibleFieldsConfig=" + this.b + ')';
        }

        public b(exo exoVar) {
            this.b = exoVar;
        }

        public b(int i) {
            this(exo.c);
        }
    }

    /* compiled from: EcosystemProfilePatch.kt */
    public static final class c extends d {
        public final xxo b;

        public c(xxo xxoVar) {
            this.b = xxoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateConfiguration(viewConfiguration=" + this.b + ')';
        }
    }

    /* compiled from: EcosystemProfilePatch.kt */
    /* renamed from: com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.d$d, reason: collision with other inner class name */
    public static final class C1895d extends d {
        public final com.vk.superapp.multiaccount.api.f b;

        public C1895d(com.vk.superapp.multiaccount.api.f fVar) {
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1895d) && epx.f(this.b, ((C1895d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UserData(user=" + this.b + ')';
        }
    }
}
