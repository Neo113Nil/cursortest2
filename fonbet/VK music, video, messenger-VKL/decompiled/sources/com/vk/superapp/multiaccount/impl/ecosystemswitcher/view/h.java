package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import defpackage.q0;
import xsna.epx;
import xsna.exo;
import xsna.km50;
import xsna.xxo;

/* compiled from: EcosystemProfileState.kt */
/* loaded from: classes6.dex */
public final class h implements km50 {
    public final a b;
    public final xxo c;

    /* compiled from: EcosystemProfileState.kt */
    public static abstract class a {

        /* compiled from: EcosystemProfileState.kt */
        /* renamed from: com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h$a$a, reason: collision with other inner class name */
        public static final class C1897a extends a {
            public final boolean a;

            public C1897a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1897a) && this.a == ((C1897a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Error(isRetryButtonVisible="), this.a, ')');
            }
        }

        /* compiled from: EcosystemProfileState.kt */
        public static final class b extends a {
            public final exo a;

            public b(exo exoVar) {
                this.a = exoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return "Loading(ecoplateLoadingVisibleFieldsConfig=" + this.a + ')';
            }
        }

        /* compiled from: EcosystemProfileState.kt */
        public static final class c extends a {
            public final com.vk.superapp.multiaccount.api.f a;

            public c(com.vk.superapp.multiaccount.api.f fVar) {
                this.a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UserData(user=" + this.a + ')';
            }
        }
    }

    public h(a aVar, xxo xxoVar) {
        this.b = aVar;
        this.c = xxoVar;
    }

    public static h a(h hVar, a aVar, xxo xxoVar, int i) {
        if ((i & 1) != 0) {
            aVar = hVar.b;
        }
        if ((i & 2) != 0) {
            xxoVar = hVar.c;
        }
        hVar.getClass();
        return new h(aVar, xxoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "EcosystemProfileState(sceneState=" + this.b + ", viewConfiguration=" + this.c + ')';
    }
}
