package com.vk.ecomm.reviews.impl.allreviews.presentation;

import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.cf10;
import xsna.df10;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.oq;
import xsna.shy;
import xsna.vr00;
import xsna.vu5;
import xsna.xl50;

/* compiled from: MarketAllReviewsPatch.kt */
/* loaded from: classes18.dex */
public interface c extends xl50 {

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class a implements c {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FullScreenErrorResultPatch(throwable="), this.b, ')');
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class b implements c {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1029882503;
        }

        public final String toString() {
            return "FullScreenLoadPatch";
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    /* renamed from: com.vk.ecomm.reviews.impl.allreviews.presentation.c$c, reason: collision with other inner class name */
    public static final class C1008c implements c {
        public final vr00 b;

        public C1008c(vr00 vr00Var) {
            this.b = vr00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1008c) && epx.f(this.b, ((C1008c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FullScreenSuccessResultPatch(data=" + this.b + ')';
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static abstract class d implements c {

        /* compiled from: MarketAllReviewsPatch.kt */
        public static final class a extends d {
            public final ArrayList b;

            public a(ArrayList arrayList) {
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateItemsState(items="), this.b);
            }
        }

        /* compiled from: MarketAllReviewsPatch.kt */
        public static final class b extends d {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("UpdatePositionState(position="), this.b, ')');
            }
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class e implements c {
        public final int b;
        public final List<cf10> c;
        public final boolean d;

        public e(int i, List list, boolean z) {
            this.b = i;
            this.c = list;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && epx.f(this.c, eVar.c) && this.d == eVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + fw3.a(shy.a(0, Integer.hashCode(this.b) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NextPageCommunityReviewItemsSuccessPatch(count=");
            sb.append(this.b);
            sb.append(", lastId=0, items=");
            sb.append(this.c);
            sb.append(", hasNextCommunityReviews=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class f implements c {
        public final List<df10> b;

        public f(List<df10> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("NextPageGoodReviewItemsSuccessPatch(items="), this.b);
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class g implements c {
        public final Throwable b;

        public g(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("NextPageReviewItemsErrorPatch(throwable="), this.b, ')');
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class h implements c {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -67820534;
        }

        public final String toString() {
            return "NextPageReviewItemsLoadPatch";
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class i implements c {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -993480540;
        }

        public final String toString() {
            return "PartOfScreenErrorPatch";
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class j implements c {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -371753730;
        }

        public final String toString() {
            return "PartOfScreenLoadPatch";
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class k implements c {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -819802541;
        }

        public final String toString() {
            return "ReloadLoadingPatch";
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class l implements c {
        public final ArrayList b;

        public l(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b.equals(((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateCommunityReviewItemsPatch(communityReviews="), this.b);
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class m implements c {
        public final ArrayList b;

        public m(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b.equals(((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateGoodReviewItemsPatch(goodReviews="), this.b);
        }
    }

    /* compiled from: MarketAllReviewsPatch.kt */
    public static final class n implements c {
        public final MarketAllReviewsTabTypes b;

        public n(MarketAllReviewsTabTypes marketAllReviewsTabTypes) {
            this.b = marketAllReviewsTabTypes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateTabItemChanges(selectedTab=" + this.b + ')';
        }
    }
}
