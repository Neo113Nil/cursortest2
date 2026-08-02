package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import defpackage.q0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.bh10;
import xsna.big0;
import xsna.cjl0;
import xsna.dye0;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.oq;
import xsna.qoy;
import xsna.shy;
import xsna.txh;
import xsna.uf3;
import xsna.urd0;
import xsna.v11;
import xsna.vd10;
import xsna.vu5;
import xsna.xl50;
import xsna.yo9;
import xsna.zig0;

/* compiled from: CommunityReviewsPatch.kt */
/* loaded from: classes18.dex */
public interface e extends xl50 {

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class a implements e {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 983273373;
        }

        public final String toString() {
            return "CancelReloadPatch";
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class b implements e {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "ChangeCanShowPinReviewTooltip(reviewPinHintNotShow=false)";
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class c implements e {
        public final CreateCommunityReviewData b;

        public c(CreateCommunityReviewData createCommunityReviewData) {
            this.b = createCommunityReviewData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            CreateCommunityReviewData createCommunityReviewData = this.b;
            if (createCommunityReviewData == null) {
                return 0;
            }
            return createCommunityReviewData.hashCode();
        }

        public final String toString() {
            return "ChangeCreateReviewData(data=" + this.b + ')';
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class d implements e {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ChangeHasPinReviewSubscription(hasSubscription="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e$e, reason: collision with other inner class name */
    public static final class C1018e implements e {
        public final boolean b;
        public final boolean c;

        public C1018e(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1018e)) {
                return false;
            }
            C1018e c1018e = (C1018e) obj;
            return this.b == c1018e.b && this.c == c1018e.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeHasPinnedReview(hasPinnedReview=");
            sb.append(this.b);
            sb.append(", isPinReviewItemOnboardingShow=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class f implements e {
        public final UserId b;
        public final ReviewsSort c;

        public f(UserId userId, ReviewsSort reviewsSort) {
            this.b = userId;
            this.c = reviewsSort;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "ConfigureScreenStatePatch(userId=" + this.b + ", sort=" + this.c + ')';
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class g implements e {
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
            return oq.c(new StringBuilder("FullScreenErrorResultPatch(throwable="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class h implements e {
        public final int b;
        public final boolean c;
        public final Float d;
        public final LinkedHashMap e;
        public final int f;
        public final boolean g;
        public final yo9 h;
        public final String i;
        public final List<dye0> j;
        public final int k;
        public final List<vd10> l;
        public final Map<UserId, big0> m;
        public final boolean n;

        public h(int i, boolean z, Float f, LinkedHashMap linkedHashMap, int i2, boolean z2, yo9 yo9Var, String str, List list, int i3, List list2, Map map, boolean z3) {
            this.b = i;
            this.c = z;
            this.d = f;
            this.e = linkedHashMap;
            this.f = i2;
            this.g = z2;
            this.h = yo9Var;
            this.i = str;
            this.j = list;
            this.k = i3;
            this.l = list2;
            this.m = map;
            this.n = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && this.c == hVar.c && epx.f(this.d, hVar.d) && this.e.equals(hVar.e) && this.f == hVar.f && this.g == hVar.g && epx.f(this.h, hVar.h) && epx.f(this.i, hVar.i) && epx.f(this.j, hVar.j) && this.k == hVar.k && epx.f(this.l, hVar.l) && epx.f(this.m, hVar.m) && this.n == hVar.n;
        }

        public final int hashCode() {
            int b = qoy.b(Integer.hashCode(this.b) * 31, 31, this.c);
            Float f = this.d;
            int b2 = qoy.b(shy.a(this.f, uf3.b(this.e, (b + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31, this.g);
            yo9 yo9Var = this.h;
            return Boolean.hashCode(this.n) + v11.a(fw3.a(shy.a(this.k, fw3.a(urd0.a((b2 + (yo9Var != null ? yo9Var.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FullScreenSuccessResultPatch(reviewCount=");
            sb.append(this.b);
            sb.append(", canAddReview=");
            sb.append(this.c);
            sb.append(", communityRating=");
            sb.append(this.d);
            sb.append(", reviews=");
            sb.append(this.e);
            sb.append(", lastId=");
            sb.append(this.f);
            sb.append(", isAddReviewShow=");
            sb.append(this.g);
            sb.append(", canAddReviewError=");
            sb.append(this.h);
            sb.append(", faqUrl=");
            sb.append(this.i);
            sb.append(", marksStat=");
            sb.append(this.j);
            sb.append(", reviewFriendsTotal=");
            sb.append(this.k);
            sb.append(", reviewFriends=");
            sb.append(this.l);
            sb.append(", usersAndGroups=");
            sb.append(this.m);
            sb.append(", connectYClientsEnabled=");
            return q0.a(sb, this.n, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class i implements e {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 338686212;
        }

        public final String toString() {
            return "InitLoadScreenDataPatch";
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static abstract class j implements e {

        /* compiled from: CommunityReviewsPatch.kt */
        public static final class a extends j {
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsPatch.kt */
        public static final class b extends j {
            public final LinkedHashMap b;
            public final int c;
            public final Map<UserId, big0> d;

            public b(int i, LinkedHashMap linkedHashMap, Map map) {
                this.b = linkedHashMap;
                this.c = i;
                this.d = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(reviews=");
                sb.append(this.b);
                sb.append(", lastId=");
                sb.append(this.c);
                sb.append(", usersAndGroups=");
                return cjl0.a(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityReviewsPatch.kt */
        public static final class c extends j {
            public static final c b = new c();
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class k implements e {
        public final String b;
        public final int c;

        public k(String str, int i) {
            this.b = str;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && this.c == kVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadPinSubscriptionPriceInfo(priceId=");
            sb.append(this.b);
            sb.append(", price=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class l implements e {
        public final boolean b;
        public final boolean c;

        public l(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.b == lVar.b && this.c == lVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadedGroupInfoDataPatch(isEditor=");
            sb.append(this.b);
            sb.append(", isAdmin=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class m implements e {
        public final ReviewsSort b;

        public m(ReviewsSort reviewsSort) {
            this.b = reviewsSort;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnSelectedNewSortPatch(sort=" + this.b + ')';
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class n implements e {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1835289251;
        }

        public final String toString() {
            return "ReloadLoadingPatch";
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class o implements e {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 731303863;
        }

        public final String toString() {
            return "RemoveYClientsBanner";
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public interface p extends e {

        /* compiled from: CommunityReviewsPatch.kt */
        public static final class a implements p {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1279391459;
            }

            public final String toString() {
                return "ClearReplyDataPatch";
            }
        }

        /* compiled from: CommunityReviewsPatch.kt */
        public static final class b implements p {
            public final Integer b;
            public final Integer c;
            public final UserId d;
            public final UserId e;

            public b(Integer num, Integer num2, UserId userId, UserId userId2) {
                this.b = num;
                this.c = num2;
                this.d = userId;
                this.e = userId2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                Integer num = this.b;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.c;
                return Long.hashCode(this.e.b) + bh10.a((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CreateReplyDataChanged(reviewId=");
                sb.append(this.b);
                sb.append(", replyId=");
                sb.append(this.c);
                sb.append(", userReplyTo=");
                sb.append(this.d);
                sb.append(", userReplyFrom=");
                return gp.b(sb, this.e, ')');
            }
        }

        /* compiled from: CommunityReviewsPatch.kt */
        public static final class c implements p {
            public final zig0 b;

            public c(zig0 zig0Var) {
                this.b = zig0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                zig0 zig0Var = this.b;
                if (zig0Var == null) {
                    return 0;
                }
                return zig0Var.hashCode();
            }

            public final String toString() {
                return "EditReplyDataChanged(data=" + this.b + ')';
            }
        }

        /* compiled from: CommunityReviewsPatch.kt */
        public static final class d implements p {
            public final UserId b;

            public d(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ReplyFromChanged(userReplyFrom="), this.b, ')');
            }
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class q implements e {
        public final boolean b;

        public q(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SetScreenSpinnerVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class r implements e {
        public final boolean b;

        public r(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.b == ((r) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShowPinTopBarTooltipHint(isVisibleTooltip="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class s implements e {
        public final Map<Integer, txh> b;

        public s(Map<Integer, txh> map) {
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("UpdateReviewItemsPatch(reviews="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsPatch.kt */
    public static final class t implements e {
        public final Map<Integer, txh> b;
        public final int c;
        public final Map<UserId, big0> d;
        public final boolean e;
        public final boolean f;

        public t(Map<Integer, txh> map, int i, Map<UserId, big0> map2, boolean z, boolean z2) {
            this.b = map;
            this.c = i;
            this.d = map2;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return epx.f(this.b, tVar.b) && this.c == tVar.c && epx.f(this.d, tVar.d) && this.e == tVar.e && this.f == tVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(v11.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateScreenAfterPinReview(reviews=");
            sb.append(this.b);
            sb.append(", lastId=");
            sb.append(this.c);
            sb.append(", usersAndGroups=");
            sb.append(this.d);
            sb.append(", hasPinnedReview=");
            sb.append(this.e);
            sb.append(", hasPinReviewSubscription=");
            return q0.a(sb, this.f, ')');
        }
    }
}
