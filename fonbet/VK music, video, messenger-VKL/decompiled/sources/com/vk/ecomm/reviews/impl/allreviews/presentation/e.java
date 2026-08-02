package com.vk.ecomm.reviews.impl.allreviews.presentation;

import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.ft00;
import xsna.h0u0;
import xsna.hfz;
import xsna.hvp;
import xsna.n0u0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: MarketAllReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class e implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;

    /* compiled from: MarketAllReviewsViewState.kt */
    public static final class a implements fm50<ft00> {
        public final yzt0<List<hfz>> a;

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
            return tr.c(new StringBuilder("Content(screenData="), this.a, ')');
        }
    }

    /* compiled from: MarketAllReviewsViewState.kt */
    public static final class b implements fm50<ft00> {
        public final yzt0<hvp> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Error(errorData="), this.a, ')');
        }
    }

    /* compiled from: MarketAllReviewsViewState.kt */
    public static final class c implements fm50<ft00> {
        public final yzt0<List<hfz>> a;

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
            return tr.c(new StringBuilder("InitializeLoading(loadingData="), this.a, ')');
        }
    }

    /* compiled from: MarketAllReviewsViewState.kt */
    public static final class d implements fm50<ft00> {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1952577615;
        }

        public final String toString() {
            return "Refreshing";
        }
    }

    /* compiled from: MarketAllReviewsViewState.kt */
    /* renamed from: com.vk.ecomm.reviews.impl.allreviews.presentation.e$e, reason: collision with other inner class name */
    public static final class C1009e implements fm50<ft00> {
        public static final C1009e a = new C1009e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1009e);
        }

        public final int hashCode() {
            return 2021351524;
        }

        public final String toString() {
            return "ReviewActionLoading";
        }
    }

    public e(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
    }

    public final n0u0<a> a() {
        return this.a;
    }

    public final n0u0<b> b() {
        return this.e;
    }

    public final n0u0<c> c() {
        return this.b;
    }

    public final n0u0<d> d() {
        return this.d;
    }

    public final n0u0<C1009e> e() {
        return this.c;
    }
}
