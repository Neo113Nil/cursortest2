package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import defpackage.q0;
import xsna.epx;
import xsna.exo;
import xsna.kj50;
import xsna.xxo;

/* compiled from: EcosystemProfileAction.kt */
/* loaded from: classes6.dex */
public abstract class a implements kj50 {

    /* compiled from: EcosystemProfileAction.kt */
    /* renamed from: com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a$a, reason: collision with other inner class name */
    public static final class C1894a extends a {
        public static final C1894a b = new C1894a();
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class d extends a {
        public static final d b = new d();
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class f extends a {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShowError(isRetryButtonVisible="), this.b, ')');
        }
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class g extends a {
        public final exo b;

        public g(exo exoVar) {
            this.b = exoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }

        public final String toString() {
            return "ShowLoading(ecoplateLoadingVisibleFieldsConfig=" + this.b + ')';
        }
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class h extends a {
        public final com.vk.superapp.multiaccount.api.f b;

        public h(com.vk.superapp.multiaccount.api.f fVar) {
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowUserData(user=" + this.b + ')';
        }
    }

    /* compiled from: EcosystemProfileAction.kt */
    public static final class i extends a {
        public final xxo b;

        public i(xxo xxoVar) {
            this.b = xxoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateConfiguration(config=" + this.b + ')';
        }
    }
}
