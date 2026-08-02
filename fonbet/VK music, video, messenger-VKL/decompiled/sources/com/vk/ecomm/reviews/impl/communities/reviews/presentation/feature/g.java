package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.f4g0;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.hfz;
import xsna.n0u0;
import xsna.o4g0;
import xsna.sr;
import xsna.tr;
import xsna.uyh;
import xsna.vzh;
import xsna.yzt0;

/* compiled from: CommunityReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class g implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: CommunityReviewsViewState.kt */
    public static final class a implements fm50<vzh> {
        public final yzt0<Boolean> a;
        public final yzt0<List<hfz>> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<f4g0> e;
        public final yzt0<o4g0> f;
        public final yzt0<Boolean> g;
        public final yzt0<Boolean> h;
        public final yzt0<TopBarSubscriptionManageType> i;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(isAddBtnVisible=");
            sb.append(this.a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", isRefreshLoaderVisible=");
            sb.append(this.c);
            sb.append(", isCommentBarVisible=");
            sb.append(this.d);
            sb.append(", replyBarFrom=");
            sb.append(this.e);
            sb.append(", replyBarToName=");
            sb.append(this.f);
            sb.append(", isReplyBarFromVisible=");
            sb.append(this.g);
            sb.append(", isScreenSpinnerVisible=");
            sb.append(this.h);
            sb.append(", topBarSubscriptionManageType=");
            return tr.c(sb, this.i, ')');
        }
    }

    /* compiled from: CommunityReviewsViewState.kt */
    public static final class b implements fm50<vzh> {
        public final yzt0<uyh> a;
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
            StringBuilder sb = new StringBuilder("Empty(data=");
            sb.append(this.a);
            sb.append(", isAddBtnVisible=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsViewState.kt */
    public static final class c implements fm50<vzh> {
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
            return tr.c(new StringBuilder("Error(isAddBtnVisible="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsViewState.kt */
    public static final class d implements fm50<vzh> {
        public final yzt0<Boolean> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Loading(isAddBtnVisible="), this.a, ')');
        }
    }

    public g(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }

    public final n0u0<a> a() {
        return this.a;
    }

    public final n0u0<b> b() {
        return this.d;
    }

    public final n0u0<c> c() {
        return this.b;
    }

    public final n0u0<d> d() {
        return this.c;
    }
}
