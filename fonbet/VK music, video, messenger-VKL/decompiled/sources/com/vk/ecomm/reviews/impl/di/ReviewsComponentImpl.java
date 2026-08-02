package com.vk.ecomm.reviews.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ajg0;
import xsna.c8m;
import xsna.e610;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gyh;
import xsna.hpf0;
import xsna.j55;
import xsna.jnf;
import xsna.k6h;
import xsna.knf;
import xsna.lnf;
import xsna.mla0;
import xsna.nwy;
import xsna.pwj0;
import xsna.pzh;
import xsna.qcy;
import xsna.r12;
import xsna.s0f;
import xsna.s12;
import xsna.t410;
import xsna.tog;
import xsna.u310;
import xsna.u94;
import xsna.v94;
import xsna.vig0;
import xsna.w94;
import xsna.xhg0;

/* compiled from: ReviewsComponentImpl.kt */
/* loaded from: classes.dex */
public final class ReviewsComponentImpl implements ReviewsComponent {
    public static final /* synthetic */ qcy<Object>[] l;
    public final ewy a = new ewy(new jnf(6));
    public final nwy b = new nwy(new r12(10));
    public final ewy c = new ewy(new s12(6));
    public final ewy d = new ewy(new tog(7));
    public final ewy e = new ewy(new j55(9));
    public final ewy f = new ewy(new s0f(this, 8));
    public final nwy g = new nwy(new u94(6));
    public final nwy h = new nwy(new v94(9));
    public final ewy i = new ewy(new w94(13));
    public final nwy j = new nwy(new knf(11));
    public final ewy k = new ewy(new lnf(8));

    /* compiled from: ReviewsComponentImpl.kt */
    public static final class a implements c8m<ReviewsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ReviewsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ReviewsComponentImpl.class, "reviewsRouter", "getReviewsRouter()Lcom/vk/ecomm/reviews/api/router/ReviewsRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        l = new qcy[]{propertyReference1Impl, fp.c(0, ReviewsComponentImpl.class, "itemsForReviewRepository", "getItemsForReviewRepository()Lcom/vk/ecomm/reviews/api/repository/MarketItemsForReviewRepository;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "itemsForReviewConfigStorage", "getItemsForReviewConfigStorage()Lcom/vk/ecomm/reviews/api/storage/MarketItemsForReviewConfigStorage;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "reviewsAnalytics", "getReviewsAnalytics()Lcom/vk/ecomm/reviews/api/analytics/MarketItemReviewsFacade;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "communityReviewsRepository", "getCommunityReviewsRepository()Lcom/vk/ecomm/reviews/api/repository/CommunityReviewsRepository;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "communityItemsForReviewDelegate", "getCommunityItemsForReviewDelegate()Lcom/vk/ecomm/reviews/api/delegate/CommunityItemsForReviewDelegate;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "communityReviewsAnalytics", "getCommunityReviewsAnalytics()Lcom/vk/ecomm/reviews/api/communites/analytics/CommunityReviewsAnalyticsFacade;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "pinCommunityReviewAnalytics", "getPinCommunityReviewAnalytics()Lcom/vk/ecomm/reviews/api/communites/analytics/PinCommunityReviewAnalyticsFacade;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "reviewRepliesRepository", "getReviewRepliesRepository()Lcom/vk/ecomm/reviews/api/repository/ReviewRepliesRepository;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "reviewsRatingFormatter", "getReviewsRatingFormatter()Lcom/vk/ecomm/reviews/api/formatters/ReviewsRatingFormatter;", hpf0Var), ep.a(0, ReviewsComponentImpl.class, "marketItemReviewsRepository", "getMarketItemReviewsRepository()Lcom/vk/ecomm/reviews/api/repository/MarketItemReviewsRepository;", hpf0Var)};
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final t410 C6() {
        qcy<Object> qcyVar = l[10];
        return (t410) this.k.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final ajg0 Md() {
        qcy<Object> qcyVar = l[0];
        return (ajg0) this.a.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final gyh U3() {
        qcy<Object> qcyVar = l[6];
        return (gyh) this.g.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final u310 e7() {
        qcy<Object> qcyVar = l[3];
        return (u310) this.d.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final xhg0 k1() {
        qcy<Object> qcyVar = l[8];
        return (xhg0) this.i.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final k6h m1() {
        qcy<Object> qcyVar = l[5];
        return (k6h) this.f.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final mla0 qb() {
        qcy<Object> qcyVar = l[7];
        return (mla0) this.h.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final pzh v3() {
        qcy<Object> qcyVar = l[4];
        return (pzh) this.e.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final vig0 xa() {
        qcy<Object> qcyVar = l[9];
        return (vig0) this.j.c();
    }

    @Override // com.vk.ecomm.reviews.api.di.ReviewsComponent
    public final e610 zd() {
        qcy<Object> qcyVar = l[1];
        return (e610) this.b.c();
    }
}
