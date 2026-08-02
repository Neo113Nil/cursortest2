package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import com.vk.superapp.bridges.dto.LkPage;
import defpackage.q0;
import xsna.epx;
import xsna.exo;
import xsna.vu5;

/* compiled from: EcosystemProfileSideEffects.kt */
/* loaded from: classes6.dex */
public interface g {

    /* compiled from: EcosystemProfileSideEffects.kt */
    public static final class a implements g {
        public static final a a = new a();
    }

    /* compiled from: EcosystemProfileSideEffects.kt */
    public static final class b implements g {
        public static final b a = new b();
    }

    /* compiled from: EcosystemProfileSideEffects.kt */
    public static final class c implements g {
        public static final c a = new c();
    }

    /* compiled from: EcosystemProfileSideEffects.kt */
    public static final class d implements g {
        public final String a;
        public final LkPage b;

        public d(String str, LkPage lkPage) {
            this.a = str;
            this.b = lkPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenLk(accessToken=" + this.a + ", lkPage=" + this.b + ')';
        }
    }

    /* compiled from: EcosystemProfileSideEffects.kt */
    public static final class e implements g {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShowError(isRetryButtonVisible="), this.a, ')');
        }
    }

    /* compiled from: EcosystemProfileSideEffects.kt */
    public static final class f implements g {
        public final exo a;

        public f() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "ShowLoading(ecoplateLoadingVisibleFieldsConfig=" + this.a + ')';
        }

        public f(int i) {
            this.a = exo.c;
        }
    }

    /* compiled from: EcosystemProfileSideEffects.kt */
    /* renamed from: com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g$g, reason: collision with other inner class name */
    public static final class C1896g implements g {
        public final int a;

        public C1896g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1896g) && this.a == ((C1896g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ShowSecurityTooltip(securityTooltipTextId="), this.a, ')');
        }
    }

    /* compiled from: EcosystemProfileSideEffects.kt */
    public static final class h implements g {
        public final com.vk.superapp.multiaccount.api.f a;

        public h(com.vk.superapp.multiaccount.api.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowUser(user=" + this.a + ')';
        }
    }
}
