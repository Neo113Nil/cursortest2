package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.Map;
import xsna.big0;
import xsna.cjl0;
import xsna.epx;
import xsna.gp;
import xsna.j2g0;
import xsna.k4g0;
import xsna.n210;
import xsna.oq;
import xsna.yl50;

/* compiled from: MarketItemReviewRepliesPatch.kt */
/* loaded from: classes18.dex */
public interface k extends yl50 {

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class a implements k {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ChangeHasEditorRole(isEditor="), this.a, ')');
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class b implements k {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1292447207;
        }

        public final String toString() {
            return "DataOnScreenChanged";
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class c implements k {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -952128094;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class d implements k {
        public final n210 a;
        public final Map<UserId, big0> b;

        public d(n210 n210Var, Map<UserId, big0> map) {
            this.a = n210Var;
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitResult(review=");
            sb.append(this.a);
            sb.append(", usersAndGroups=");
            return cjl0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class e implements k {
        public final j2g0 a;

        public e(j2g0 j2g0Var) {
            this.a = j2g0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LoadPageResult(response=" + this.a + ')';
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class f implements k {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1648574038;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class g implements k {
        public final Throwable a;

        public g(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("PaginationError(throwable="), this.a, ')');
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class h implements k {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1011767347;
        }

        public final String toString() {
            return "Refreshing";
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class i implements k {
        public final UserId a;

        public i(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SetCurrentUserId(userId="), this.a, ')');
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class j implements k {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SetScreenSpinnerVisibility(isVisible="), this.a, ')');
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    /* renamed from: com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k$k, reason: collision with other inner class name */
    public static final class C1020k implements k {
        public static final C1020k a = new C1020k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1020k);
        }

        public final int hashCode() {
            return -651296591;
        }

        public final String toString() {
            return "StartLoadPage";
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class l implements k {
        public final Map<Integer, k4g0> a;

        public l(Map<Integer, k4g0> map) {
            this.a = map;
        }
    }

    /* compiled from: MarketItemReviewRepliesPatch.kt */
    public static final class m implements k {
        public final n210 a;

        public m(n210 n210Var) {
            this.a = n210Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateReviewItem(review=" + this.a + ')';
        }
    }
}
