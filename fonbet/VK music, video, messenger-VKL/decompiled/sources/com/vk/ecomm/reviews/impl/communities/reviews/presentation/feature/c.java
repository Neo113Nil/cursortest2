package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewSuccessResult;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.PinReviewDetailsScreenResult;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.PaymentResult;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import defpackage.q0;
import java.util.List;
import xsna.bt;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.kj50;
import xsna.ms9;
import xsna.qxh;
import xsna.shy;
import xsna.tlo0;
import xsna.vu5;

/* compiled from: CommunityReviewsAction.kt */
/* loaded from: classes18.dex */
public interface c extends kj50 {

    /* compiled from: CommunityReviewsAction.kt */
    public static final class a implements c {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 320039091;
        }

        public final String toString() {
            return "AddReview";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static abstract class b implements c {

        /* compiled from: CommunityReviewsAction.kt */
        public static final class a extends b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2029903787;
            }

            public final String toString() {
                return "AddReview";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c$b$b, reason: collision with other inner class name */
        public static final class C1011b extends b {
            public static final C1011b b = new C1011b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1011b);
            }

            public final int hashCode() {
                return 530028195;
            }

            public final String toString() {
                return "ShowReview";
            }
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c$c, reason: collision with other inner class name */
    public static final class C1012c implements c {
        public final CreateCommunityReviewData b;

        public C1012c(CreateCommunityReviewData createCommunityReviewData) {
            this.b = createCommunityReviewData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1012c) && epx.f(this.b, ((C1012c) obj).b);
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

    /* compiled from: CommunityReviewsAction.kt */
    public static final class d implements c {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -218016862;
        }

        public final String toString() {
            return "CheckPinSubscriptionStatus";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class e implements c {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CopyText(text="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class f implements c {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DeleteReview(itemId="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class g implements c {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("EditReview(itemId="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class h implements c {
        public final int b;

        public h(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ExpandCommunityReview(reviewId="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class i implements c {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 630889465;
        }

        public final String toString() {
            return "FilterParamClick";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class j implements c {
        public final boolean b;

        public j(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("HideConnectYClientsReviewsBanner(withSaveToConfig="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class k implements c {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 772713334;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class l implements c {
        public final int b;

        public l(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LikeReview(itemId="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class m implements c {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1164401659;
        }

        public final String toString() {
            return "LoadPage";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public interface n extends c {

        /* compiled from: CommunityReviewsAction.kt */
        public static final class a implements n {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1415771415;
            }

            public final String toString() {
                return "ShowCreateCommunityReviewConfirmDialog";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class b implements n {
            public final tlo0.h b;
            public final tlo0 c;

            public b(tlo0.h hVar, tlo0.h hVar2) {
                this.b = hVar;
                this.c = hVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b.equals(bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = this.b.a.hashCode() * 31;
                tlo0 tlo0Var = this.c;
                return hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowCreateCommunityReviewErrorDialog(title=");
                sb.append(this.b);
                sb.append(", description=");
                return bt.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c$n$c, reason: collision with other inner class name */
        public static final class C1013c implements n {
            public final CreateCommunityReviewSuccessResult b;
            public final String c;

            public C1013c(CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult, String str) {
                this.b = createCommunityReviewSuccessResult;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1013c)) {
                    return false;
                }
                C1013c c1013c = (C1013c) obj;
                return epx.f(this.b, c1013c.b) && epx.f(this.c, c1013c.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                String str = this.c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowCreateCommunityReviewSuccessDialog(resultData=");
                sb.append(this.b);
                sb.append(", faqButtonLink=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class d implements n {
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class e implements n {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1995366187;
            }

            public final String toString() {
                return "ToCanAddReviewErrorDialog";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class f implements n {
            public final qxh b;

            public f(qxh qxhVar) {
                this.b = qxhVar;
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
                return "ToComplainReview(reviewItem=" + this.b + ')';
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class g implements n {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1643867333;
            }

            public final String toString() {
                return "ToCreateCommunityReviewDialog";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class h implements n {
            public final int b;
            public final int c;

            public h(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.b == hVar.b && this.c == hVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToImageViewer(position=");
                sb.append(this.b);
                sb.append(", reviewId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class i implements n {
            public final qxh b;

            public i(qxh qxhVar) {
                this.b = qxhVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                qxh qxhVar = this.b;
                if (qxhVar == null) {
                    return 0;
                }
                return qxhVar.hashCode();
            }

            public final String toString() {
                return "ToReviewActionsBottomSheet(item=" + this.b + ')';
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class j implements n {
            public final UserId b;

            public j(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ToUserProfile(id="), this.b, ')');
            }
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class o implements c {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1586573065;
        }

        public final String toString() {
            return "OnFAQClick";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class p implements c {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1630081082;
        }

        public final String toString() {
            return "OnPaginationRetryTap";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class q implements c {
        public final ReviewsSort b;

        public q(ReviewsSort reviewsSort) {
            this.b = reviewsSort;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnSortItemClick(sort=" + this.b + ')';
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public interface r extends c {

        /* compiled from: CommunityReviewsAction.kt */
        public static final class a implements r {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1807866082;
            }

            public final String toString() {
                return "GetChangePaymentMethodLink";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class b implements r {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -542347215;
            }

            public final String toString() {
                return "GetPaymentLink";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c$r$c, reason: collision with other inner class name */
        public static final class C1014c implements r {
            public static final C1014c b = new C1014c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1014c);
            }

            public final int hashCode() {
                return -1475504980;
            }

            public final String toString() {
                return "LeftActivePinned";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class d implements r {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -91325695;
            }

            public final String toString() {
                return "OnPinReviewTooltipDisposed";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class e implements r {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -487181475;
            }

            public final String toString() {
                return "OnPinnedReviewHighlighted";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class f implements r {
            public final PinReviewDetailsScreenResult b;

            public f(PinReviewDetailsScreenResult pinReviewDetailsScreenResult) {
                this.b = pinReviewDetailsScreenResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                PinReviewDetailsScreenResult pinReviewDetailsScreenResult = this.b;
                if (pinReviewDetailsScreenResult == null) {
                    return 0;
                }
                return pinReviewDetailsScreenResult.hashCode();
            }

            public final String toString() {
                return "OnSubscriptionDetailsResult(result=" + this.b + ')';
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class g implements r {
            public final PaymentResult b;

            public g(PaymentResult paymentResult) {
                this.b = paymentResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.b == ((g) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnSubscriptionPaymentResult(result=" + this.b + ')';
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class h implements r {
            public final HintId b;

            public h(HintId hintId) {
                this.b = hintId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.b == ((h) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnTooltipDismiss(hintId=" + this.b + ')';
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class i implements r {
            public static final i b = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -1994880277;
            }

            public final String toString() {
                return "OnTopBarTooltipDismiss";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class j implements r {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -812394156;
            }

            public final String toString() {
                return "OpenSubscriptionDetails";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class k implements r {
            public final int b;

            public k(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.b == ((k) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Pin(reviewId="), this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class l implements r {
            public final int b;
            public final boolean c;

            public l(int i, boolean z) {
                this.b = i;
                this.c = z;
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
                return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PinTryAgain(reviewId=");
                sb.append(this.b);
                sb.append(", isReplacement=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class m implements r {
            public final int b;

            public m(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && this.b == ((m) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ReplacePinReview(reviewId="), this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class n implements r {
            public static final n b = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -2146736975;
            }

            public final String toString() {
                return "ResumeSubscription";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class o implements r {
            public static final o b = new o();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return -176332398;
            }

            public final String toString() {
                return "SuspendSubscription";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class p implements r {
            public final int b;

            public p(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && this.b == ((p) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Unpin(reviewId="), this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class q implements r {
            public final int b;

            public q(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q) && this.b == ((q) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("UnpinTryAgain(reviewId="), this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c$r$r, reason: collision with other inner class name */
        public static final class C1015r implements r {
            public static final C1015r b = new C1015r();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1015r);
            }

            public final int hashCode() {
                return -509931584;
            }

            public final String toString() {
                return "UpdatePinReviewsData";
            }
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class s implements c {
        public static final s b = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -202389889;
        }

        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class t implements c {
        public static final t b = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 272637266;
        }

        public final String toString() {
            return "ReloadScreenDataAfterChangesAction";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public interface u extends c {

        /* compiled from: CommunityReviewsAction.kt */
        public static final class a implements u {
            public final Integer b;
            public final int c;
            public final UserId d;

            public a(int i, Integer num, UserId userId) {
                this.b = num;
                this.c = i;
                this.d = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                Integer num = this.b;
                return Long.hashCode(this.d.b) + shy.a(this.c, (num == null ? 0 : num.hashCode()) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnReplyClick(replyId=");
                sb.append(this.b);
                sb.append(", reviewId=");
                sb.append(this.c);
                sb.append(", userToReplyId=");
                return gp.b(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class b implements u {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1513677412;
            }

            public final String toString() {
                return "OnReplyFromClick";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c$u$c, reason: collision with other inner class name */
        public static final class C1016c implements u {
            public final UserId b;

            public C1016c(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1016c) && epx.f(this.b, ((C1016c) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OnReplyFromSelected(userId="), this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class d implements u {
            public final int b;
            public final int c;

            public d(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.b == dVar.b && this.c == dVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnReplyItemClick(replyId=");
                sb.append(this.b);
                sb.append(", reviewId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class e implements u {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -902109261;
            }

            public final String toString() {
                return "OnReplyToClick";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class f implements u {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -888455302;
            }

            public final String toString() {
                return "OnReplyToReset";
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class g implements u {
            public final int b;
            public final int c;

            public g(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.b == gVar.b && this.c == gVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnRestoreReply(reviewId=");
                sb.append(this.b);
                sb.append(", replyId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class h implements u {
            public final String b;
            public final List<Attachment> c;

            /* JADX WARN: Multi-variable type inference failed */
            public h(String str, List<? extends Attachment> list) {
                this.b = str;
                this.c = list;
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
                StringBuilder sb = new StringBuilder("OnSendClick(text=");
                sb.append(this.b);
                sb.append(", attachments=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class i implements u {
            public final int b;

            public i(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.b == ((i) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnShowAllReviewReplies(reviewId="), this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public static final class j implements u {
            public final int b;
            public final int c;

            public j(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.b == jVar.b && this.c == jVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnTextExpandClick(replyId=");
                sb.append(this.b);
                sb.append(", reviewId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsAction.kt */
        public interface k extends u {

            /* compiled from: CommunityReviewsAction.kt */
            public static final class a implements k {
                public final int b;
                public final int c;

                public a(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.b == aVar.b && this.c == aVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnCopyAction(replyId=");
                    sb.append(this.b);
                    sb.append(", reviewId=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityReviewsAction.kt */
            public static final class b implements k {
                public final int b;
                public final int c;

                public b(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.b == bVar.b && this.c == bVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnDeleteAction(replyId=");
                    sb.append(this.b);
                    sb.append(", reviewId=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityReviewsAction.kt */
            /* renamed from: com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c$u$k$c, reason: collision with other inner class name */
            public static final class C1017c implements k {
                public final int b;
                public final int c;

                public C1017c(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1017c)) {
                        return false;
                    }
                    C1017c c1017c = (C1017c) obj;
                    return this.b == c1017c.b && this.c == c1017c.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnEditAction(replyId=");
                    sb.append(this.b);
                    sb.append(", reviewId=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityReviewsAction.kt */
            public static final class d implements k {
                public final int b;
                public final int c;

                public d(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.b == dVar.b && this.c == dVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnReplyAction(replyId=");
                    sb.append(this.b);
                    sb.append(", reviewId=");
                    return vu5.b(sb, this.c, ')');
                }
            }
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class v implements c {
        public final int b;

        public v(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.b == ((v) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("RestoreReview(itemId="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class w implements c {
        public static final w b = new w();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return -1564848145;
        }

        public final String toString() {
            return "ShowConnectYClientsReviewsBottomSheet";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class x implements c {
        public static final x b = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return 1778196515;
        }

        public final String toString() {
            return "ShowReviewAddedSuccessSnackBar";
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class y implements c {
        public final boolean b;

        public y(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && this.b == ((y) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShowScreenSpinner(isVisible="), this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsAction.kt */
    public static final class z implements c {
        public static final z b = new z();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -2064615308;
        }

        public final String toString() {
            return "TapOnFriendReviewsItem";
        }
    }
}
