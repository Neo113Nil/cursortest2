package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPricingInfoSubscriptionNameDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsResumeSubscriptionNameDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsSuspendSubscriptionNameDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.PinReviewDetailsScreenResult;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.PaymentResult;
import com.vk.toggle.features.SmbFeatures;
import defpackage.j0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.a020;
import xsna.a5;
import xsna.a7f0;
import xsna.b4r;
import xsna.c4r;
import xsna.ck70;
import xsna.ept;
import xsna.f4z;
import xsna.fkq0;
import xsna.gzh;
import xsna.gzs;
import xsna.h2w;
import xsna.h7v;
import xsna.hkb;
import xsna.hn0;
import xsna.hr;
import xsna.ir;
import xsna.ire;
import xsna.izh;
import xsna.izs;
import xsna.jr;
import xsna.k8;
import xsna.kj50;
import xsna.km50;
import xsna.ky80;
import xsna.kyh;
import xsna.l2e;
import xsna.lf3;
import xsna.mh3;
import xsna.mh40;
import xsna.mla0;
import xsna.mr;
import xsna.nch;
import xsna.nj50;
import xsna.nm0;
import xsna.nr;
import xsna.och;
import xsna.oh3;
import xsna.oj50;
import xsna.or;
import xsna.p5w;
import xsna.pch;
import xsna.pr;
import xsna.q9;
import xsna.qd1;
import xsna.rch;
import xsna.rsg0;
import xsna.sj4;
import xsna.sn;
import xsna.tfx;
import xsna.tn0;
import xsna.txh;
import xsna.u4u;
import xsna.up2;
import xsna.vyh;
import xsna.vzh;
import xsna.wj50;
import xsna.wk50;
import xsna.yd10;
import xsna.yfb;
import xsna.zq;

/* compiled from: CommunityPinReviewActionDelegate.kt */
/* loaded from: classes18.dex */
public final class a implements oj50<vzh, c, e> {
    public final gzh a;
    public final wj50<vyh> b;
    public final wj50<kyh> c;
    public final wj50<izh> d;
    public final h7v e;
    public final mla0 f;
    public final gzs<Boolean> g;

    /* compiled from: CommunityPinReviewActionDelegate.kt */
    /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1010a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentResult.values().length];
            try {
                iArr[PaymentResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(gzh gzhVar, f4z f4zVar, f4z f4zVar2, f4z f4zVar3, h7v h7vVar, mla0 mla0Var, nm0 nm0Var) {
        this.a = gzhVar;
        this.b = f4zVar;
        this.c = f4zVar2;
        this.d = f4zVar3;
        this.e = h7vVar;
        this.f = mla0Var;
        this.g = nm0Var;
    }

    public static void d(nj50 nj50Var, boolean z) {
        nj50Var.b(new e.q(z));
    }

    @Override // xsna.oj50
    public final void a(final wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        Object obj;
        vzh vzhVar = (vzh) km50Var;
        c cVar = (c) kj50Var;
        Map<Integer, txh> map = vzhVar.n;
        Integer num = vzhVar.F;
        final UserId userId = vzhVar.b;
        if (cVar instanceof c.r) {
            c.r rVar = (c.r) cVar;
            c.r.n nVar = c.r.n.b;
            boolean equals = rVar.equals(nVar);
            int i = 13;
            gzh gzhVar = this.a;
            int i2 = 1;
            mla0 mla0Var = this.f;
            if (equals) {
                mla0Var.o(userId.b);
                d(aVar, true);
                up2 up2Var = (up2) gzhVar.c.c;
                UserId a = fkq0.a(userId);
                CommunitySubscriptionsResumeSubscriptionNameDto communitySubscriptionsResumeSubscriptionNameDto = CommunitySubscriptionsResumeSubscriptionNameDto.PIN_REVIEW;
                up2Var.getClass();
                tfx tfxVar = new tfx("communitySubscriptions.resume", new or(8), new pr(11));
                tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
                tfx.o(tfxVar, "subscription_name", communitySubscriptionsResumeSubscriptionNameDto.i(), 0, 0, 12);
                a7f0.a.f(aVar, rsg0.w0(yfb.x(tfxVar)).l(new mh40(new b4r(24), 7)), new defpackage.c(i, this, aVar), new a5(6, this, aVar), 1);
                return;
            }
            int i3 = 9;
            if (rVar.equals(c.r.o.b)) {
                mla0Var.h(userId.b);
                d(aVar, true);
                up2 up2Var2 = (up2) gzhVar.c.c;
                UserId a2 = fkq0.a(userId);
                CommunitySubscriptionsSuspendSubscriptionNameDto communitySubscriptionsSuspendSubscriptionNameDto = CommunitySubscriptionsSuspendSubscriptionNameDto.PIN_REVIEW;
                up2Var2.getClass();
                tfx tfxVar2 = new tfx("communitySubscriptions.suspend", new q1(13), new hr(7));
                tfx.n(tfxVar2, "community_id", a2, 0L, 0L, 12);
                tfx.o(tfxVar2, "subscription_name", communitySubscriptionsSuspendSubscriptionNameDto.i(), 0, 0, 12);
                a7f0.a.f(aVar, rsg0.w0(yfb.x(tfxVar2)).l(new q9(new c4r(22), 26)), new l2e(this, aVar, userId, i2), new tn0(i3, this, aVar), 1);
                return;
            }
            if (rVar.equals(c.r.C1014c.b)) {
                mla0Var.c(userId.b);
                return;
            }
            if (!(rVar instanceof c.r.b)) {
                if (rVar.equals(c.r.a.b)) {
                    b(aVar, vzhVar);
                    return;
                }
                boolean equals2 = rVar.equals(c.r.j.b);
                wj50<kyh> wj50Var = this.c;
                if (equals2) {
                    mla0Var.n(userId.b);
                    wj50Var.b(new kyh.a.l(userId));
                    return;
                }
                if (rVar instanceof c.r.k) {
                    c(aVar, ((c.r.k) cVar).b, vzhVar);
                    return;
                }
                if (rVar instanceof c.r.m) {
                    int i4 = ((c.r.m) cVar).b;
                    mla0Var.f(userId.b, String.valueOf(i4));
                    d(aVar, true);
                    a7f0.a.f(aVar, gzhVar.c.g(i4, userId), new nch(this, aVar, userId, i4), new och(this, aVar, userId, i4, true), 1);
                    return;
                }
                if (rVar instanceof c.r.l) {
                    long j = userId.b;
                    c.r.l lVar = (c.r.l) cVar;
                    int i5 = lVar.b;
                    mla0Var.q(j, String.valueOf(i5));
                    boolean z = lVar.c;
                    if (z) {
                        mla0Var.f(userId.b, String.valueOf(i5));
                        d(aVar, true);
                        a7f0.a.f(aVar, gzhVar.c.g(i5, userId), new nch(this, aVar, userId, i5), new och(this, aVar, userId, i5, true), 1);
                        return;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c(aVar, i5, vzhVar);
                        return;
                    }
                }
                if (rVar instanceof c.r.p) {
                    long j2 = userId.b;
                    final int i6 = ((c.r.p) cVar).b;
                    mla0Var.j(j2, String.valueOf(i6));
                    d(aVar, true);
                    a7f0.a.d(aVar, rsg0.Z(yfb.x(((yd10) gzhVar.c.b).g(i6, fkq0.a(userId)))), null, new izs() { // from class: xsna.mch
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar, false);
                            com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.this.c.b(new kyh.a.j(userId.b, i6));
                            return s3q0.a;
                        }
                    }, new mh3(3, this, aVar), 1);
                    return;
                }
                if (rVar instanceof c.r.q) {
                    long j3 = userId.b;
                    final int i7 = ((c.r.q) cVar).b;
                    mla0Var.a(j3, String.valueOf(i7));
                    d(aVar, true);
                    a7f0.a.d(aVar, rsg0.Z(yfb.x(((yd10) gzhVar.c.b).g(i7, fkq0.a(userId)))), null, new izs() { // from class: xsna.mch
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar, false);
                            com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.this.c.b(new kyh.a.j(userId.b, i7));
                            return s3q0.a;
                        }
                    }, new mh3(3, this, aVar), 1);
                    return;
                }
                if (rVar instanceof c.r.f) {
                    PinReviewDetailsScreenResult pinReviewDetailsScreenResult = ((c.r.f) cVar).b;
                    if (pinReviewDetailsScreenResult == null) {
                        return;
                    }
                    if (pinReviewDetailsScreenResult instanceof PinReviewDetailsScreenResult.ResumeSubscriptionClick) {
                        mla0Var.g(userId.b);
                        aVar.a(nVar);
                        return;
                    } else if (pinReviewDetailsScreenResult instanceof PinReviewDetailsScreenResult.SuspendSubscriptionClick) {
                        mla0Var.e(userId.b);
                        wj50Var.b(new kyh.a.q(userId.b, a020.o(((PinReviewDetailsScreenResult.SuspendSubscriptionClick) pinReviewDetailsScreenResult).b)));
                        return;
                    } else {
                        if (!(pinReviewDetailsScreenResult instanceof PinReviewDetailsScreenResult.ChangePaymentMethodClick)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b(aVar, vzhVar);
                        return;
                    }
                }
                if (rVar instanceof c.r.g) {
                    PaymentResult paymentResult = ((c.r.g) cVar).b;
                    long j4 = userId.b;
                    if (C1010a.$EnumSwitchMapping$0[paymentResult.ordinal()] == 1) {
                        if (num != null) {
                            mla0Var.l(num.intValue(), j4);
                        }
                        wj50Var.b(kyh.a.c.a);
                        return;
                    }
                    return;
                }
                if (rVar instanceof c.r.e) {
                    Iterator<T> it = map.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((txh) obj).u) {
                                break;
                            }
                        }
                    }
                    txh txhVar = (txh) obj;
                    if (txhVar != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put(Integer.valueOf(txhVar.a), txh.a(txhVar, 0, false, false, false, null, false, 1048575));
                        aVar.b(new e.s(linkedHashMap));
                        return;
                    }
                    return;
                }
                boolean z2 = rVar instanceof c.r.i;
                h7v h7vVar = this.e;
                if (z2) {
                    h7vVar.b(HintId.GROUP_COMMUNITY_REVIEW_MANAGE_PIN_SUBSCRIPTION_ONBOARDING.getId());
                    aVar.b(new e.r(false));
                    return;
                } else {
                    if (rVar instanceof c.r.h) {
                        h7vVar.b(((c.r.h) cVar).b.getId());
                        return;
                    }
                    if (rVar instanceof c.r.d) {
                        h7vVar.b(HintId.GROUP_COMMUNITY_REVIEW_PIN_ONBOARDING.getId());
                        aVar.b(new e.b());
                        return;
                    } else {
                        if (!(rVar instanceof c.r.C1015r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a7f0.a.f(aVar, x.A(this.a.a(0, vzhVar.b, vzhVar.v.h(), 0, vzhVar.z), gzhVar.c.c(userId), gzhVar.c.d(userId), new sj4(new rch(0), 7)), new hn0(i3, aVar, this), new ire(aVar, 6), 1);
                        return;
                    }
                }
            }
            if (num != null) {
                mla0Var.k(num.intValue(), userId.b);
            }
            String str = vzhVar.E;
            if (str != null) {
                d(aVar, true);
                boolean booleanValue = this.g.invoke().booleanValue();
                up2 up2Var3 = (up2) gzhVar.c.c;
                UserId a3 = fkq0.a(userId);
                CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto communitySubscriptionsGetPaymentLinkSubscriptionNameDto = CommunitySubscriptionsGetPaymentLinkSubscriptionNameDto.PIN_REVIEW;
                String str2 = booleanValue ? "dark" : "light";
                up2Var3.getClass();
                tfx tfxVar3 = new tfx("communitySubscriptions.getPaymentLink", new nr(9), new j0(13));
                tfx.n(tfxVar3, "community_id", a3, 0L, 0L, 12);
                tfx.o(tfxVar3, "subscription_name", communitySubscriptionsGetPaymentLinkSubscriptionNameDto.i(), 0, 0, 12);
                tfx.o(tfxVar3, "price_id", str, 0, 0, 12);
                tfx.o(tfxVar3, "theme", str2, 0, 0, 12);
                tfxVar3.j("force_mobile", true);
                tfxVar3.j("fullscreen", false);
                a7f0.a.f(aVar, rsg0.w0(yfb.x(tfxVar3)).l(new ck70(2, new u4u(20))), new lf3(this, aVar, vzhVar, 3), new oh3(11, this, aVar), 1);
            }
        }
    }

    public final void b(wk50.a aVar, vzh vzhVar) {
        d(aVar, true);
        UserId userId = vzhVar.b;
        up2 up2Var = (up2) this.a.c.c;
        UserId a = fkq0.a(userId);
        up2Var.getClass();
        tfx tfxVar = new tfx("communitySubscriptions.changePaymentMethod", new mr(12), new sn(13));
        tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
        tfx.o(tfxVar, "subscription_name", "pin_review", 0, 0, 12);
        a7f0.a.f(aVar, rsg0.w0(yfb.x(tfxVar)).l(new ky80(new ept(18), 2)), new k8(11, this, aVar), new qd1(8, this, aVar), 1);
    }

    public final void c(final wk50.a aVar, final int i, final vzh vzhVar) {
        UserId userId = vzhVar.b;
        long j = userId.b;
        String valueOf = String.valueOf(i);
        mla0 mla0Var = this.f;
        mla0Var.v(j, valueOf);
        SmbFeatures smbFeatures = SmbFeatures.PIN_REVIEW_FREE;
        smbFeatures.getClass();
        boolean z = vzhVar.G || com.vk.toggle.b.A.a(smbFeatures);
        gzh gzhVar = this.a;
        if (z) {
            if (vzhVar.H) {
                mla0Var.s(userId.b, String.valueOf(i));
                this.c.b(new kyh.a.g(userId.b, i));
                return;
            } else {
                d(aVar, true);
                a7f0.a.f(aVar, gzhVar.c.g(i, userId), new nch(this, aVar, userId, i), new och(this, aVar, userId, i, false), 1);
                return;
            }
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        d(aVar, true);
        f0 g = gzhVar.c.g(i, userId);
        up2 up2Var = (up2) gzhVar.c.c;
        UserId a = fkq0.a(userId);
        CommunitySubscriptionsGetPricingInfoSubscriptionNameDto communitySubscriptionsGetPricingInfoSubscriptionNameDto = CommunitySubscriptionsGetPricingInfoSubscriptionNameDto.PIN_REVIEW;
        up2Var.getClass();
        tfx tfxVar = new tfx("communitySubscriptions.getPricingInfo", new ir(10), new jr(8));
        tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
        tfx.o(tfxVar, "subscription_name", communitySubscriptionsGetPricingInfoSubscriptionNameDto.i(), 0, 0, 12);
        a7f0.a.f(aVar, x.B(g, rsg0.w0(yfb.x(tfxVar)).l(new p5w(new h2w(18), 11)), new zq(11, new hkb(2))), new pch(i, this, vzhVar, aVar), new izs() { // from class: xsna.qch
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar, false);
                this.c.b(new kyh.a.f(vzhVar.b.b, i));
                return s3q0.a;
            }
        }, 1);
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
