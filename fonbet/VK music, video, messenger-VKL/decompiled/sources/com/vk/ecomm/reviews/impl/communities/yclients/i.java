package com.vk.ecomm.reviews.impl.communities.yclients;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.k3j;
import xsna.tr;
import xsna.yzt0;

/* compiled from: ConnectYClientsReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class i implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ConnectYClientsReviewsViewState.kt */
    public static final class a implements fm50<k3j> {
        public final yzt0<Boolean> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(isLoading="), this.a, ')');
        }
    }

    /* compiled from: ConnectYClientsReviewsViewState.kt */
    public static final class b implements fm50<k3j> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1166595837;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ConnectYClientsReviewsViewState.kt */
    public static final class c implements fm50<k3j> {
        public final yzt0<Boolean> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Error(isLoading="), this.a, ')');
        }
    }

    /* compiled from: ConnectYClientsReviewsViewState.kt */
    public static final class d implements fm50<k3j> {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -355480007;
        }

        public final String toString() {
            return "Success";
        }
    }

    public i(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
