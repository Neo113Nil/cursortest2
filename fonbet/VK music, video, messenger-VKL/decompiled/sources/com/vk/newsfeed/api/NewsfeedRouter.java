package com.vk.newsfeed.api;

import android.content.Context;
import com.vk.api.likes.LikesGetList;
import com.vk.attachpicker.StubFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.fave.entities.FaveSource;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.presentation.model.ExcerptConfigFeatureType;
import com.vkontakte.android.data.PostInteract;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.bc6;
import xsna.c9x0;
import xsna.dw20;
import xsna.epx;
import xsna.fa10;
import xsna.fw3;
import xsna.h3f0;
import xsna.ho8;
import xsna.iq80;
import xsna.jbs;
import xsna.lq60;
import xsna.o3y0;
import xsna.oz50;
import xsna.p010;
import xsna.qoy;
import xsna.qr80;
import xsna.rdi;
import xsna.shy;
import xsna.uls;
import xsna.urd0;
import xsna.xmq;
import xsna.yp80;
import xsna.ysd0;
import xsna.zrp;

/* compiled from: NewsfeedRouter.kt */
/* loaded from: classes3.dex */
public interface NewsfeedRouter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedRouter.kt */
    public static final class OpenFromRef {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpenFromRef[] $VALUES;
        public static final OpenFromRef REF_FEED;
        public static final OpenFromRef REF_POSTING;

        static {
            OpenFromRef openFromRef = new OpenFromRef("REF_FEED", 0);
            REF_FEED = openFromRef;
            OpenFromRef openFromRef2 = new OpenFromRef("REF_POSTING", 1);
            REF_POSTING = openFromRef2;
            OpenFromRef[] openFromRefArr = {openFromRef, openFromRef2};
            $VALUES = openFromRefArr;
            $ENTRIES = new asp(openFromRefArr);
        }

        public OpenFromRef() {
            throw null;
        }

        public static OpenFromRef valueOf(String str) {
            return (OpenFromRef) Enum.valueOf(OpenFromRef.class, str);
        }

        public static OpenFromRef[] values() {
            return (OpenFromRef[]) $VALUES.clone();
        }
    }

    /* compiled from: NewsfeedRouter.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final LikesGetList.Type f;

        public a(int i, int i2, boolean z, boolean z2, boolean z3, LikesGetList.Type type) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31);
        }

        public final String toString() {
            return "CommentThreadOptions(commentId=" + this.a + ", startCommendId=" + this.b + ", canReply=" + this.c + ", canShareComments=" + this.d + ", canGroupComment=" + this.e + ", itemLikesType=" + this.f + ", showOptionsMenu=true)";
        }
    }

    /* compiled from: NewsfeedRouter.kt */
    public static final class b {
        public static final b c = new b(false, false);
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommentsDisplayOptions(showLikesInfo=");
            sb.append(this.a);
            sb.append(", showCloseIcon=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: NewsfeedRouter.kt */
    public static final class d {
        public final String a;
        public final List<NewsEntry> b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final ExcerptConfigFeatureType g;
        public final String h;

        public d(String str, List list, String str2, String str3, String str4, String str5, ExcerptConfigFeatureType excerptConfigFeatureType, String str6) {
            this.a = str;
            this.b = list;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = excerptConfigFeatureType;
            this.h = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d.equals(dVar.d) && epx.f(this.e, dVar.e) && this.f.equals(dVar.f) && this.g == dVar.g && epx.f(this.h, dVar.h);
        }

        public final int hashCode() {
            int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int a2 = urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int b = qoy.b(urd0.a((a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, false);
            ExcerptConfigFeatureType excerptConfigFeatureType = this.g;
            int hashCode = (b + (excerptConfigFeatureType == null ? 0 : excerptConfigFeatureType.hashCode())) * 31;
            String str3 = this.h;
            return hashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimilarPostsFeedOptions(feedId=");
            sb.append(this.a);
            sb.append(", posts=");
            sb.append(this.b);
            sb.append(", scrollTo=");
            sb.append(this.c);
            sb.append(", fromScreen=");
            sb.append(this.d);
            sb.append(", referrer=");
            sb.append(this.e);
            sb.append(", title=");
            sb.append(this.f);
            sb.append(", expand=false, excerptConfig=");
            sb.append(this.g);
            sb.append(", trackCode=");
            return ho8.a(sb, this.h, ')');
        }
    }

    static /* synthetic */ void B(NewsfeedRouter newsfeedRouter, Context context, PostingVisibilityMode postingVisibilityMode, int i) {
        if ((i & 2) != 0) {
            postingVisibilityMode = null;
        }
        newsfeedRouter.g(context, postingVisibilityMode, (i & 4) != 0 ? "newsfeed" : "drafts_feed");
    }

    static void D(NewsfeedRouter newsfeedRouter, Context context, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType) {
        EmptyList emptyList = EmptyList.b;
        newsfeedRouter.Z(context, friendsListParams, friendsListPrivacyType, emptyList, emptyList);
    }

    static /* synthetic */ void E(NewsfeedRouter newsfeedRouter, Context context, NewsEntry newsEntry, String str, String str2, Integer num, c9x0 c9x0Var, String str3, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            c9x0Var = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        newsfeedRouter.C(context, newsEntry, str, str2, num, c9x0Var, str3);
    }

    static void O(NewsfeedRouter newsfeedRouter, Context context, String str) {
        newsfeedRouter.G(context, str, EmptyList.b, "", null);
    }

    static /* synthetic */ oz50 Q(NewsfeedRouter newsfeedRouter, FaveTag faveTag, FaveSource faveSource, int i) {
        if ((i & 2) != 0) {
            faveTag = null;
        }
        if ((i & 4) != 0) {
            faveSource = null;
        }
        return newsfeedRouter.h(null, faveTag, faveSource);
    }

    static void b(NewsfeedRouter newsfeedRouter, Context context, String str, List list, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            list = EmptyList.b;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = null;
        }
        newsfeedRouter.q(context, str, list2, str4, null, str3);
    }

    static /* synthetic */ void l(NewsfeedRouter newsfeedRouter, Context context, String str, UserId userId, String str2, String str3, Boolean bool, String str4, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        newsfeedRouter.W(context, str, userId, str2, str3, bool, str4);
    }

    static /* synthetic */ void s(NewsfeedRouter newsfeedRouter, Context context, NewsEntry newsEntry, VideoFile videoFile, iq80 iq80Var, String str, String str2, b bVar, int i) {
        if ((i & 256) != 0) {
            bVar = b.c;
        }
        newsfeedRouter.j(context, videoFile, str, str2, bVar);
    }

    static /* synthetic */ boolean w(NewsfeedRouter newsfeedRouter, Context context, String str, String str2, c9x0 c9x0Var, yp80 yp80Var, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            yp80Var = null;
        }
        return newsfeedRouter.N(context, str, str2, c9x0Var, yp80Var, null);
    }

    void A(Context context, FeedbackPoll feedbackPoll);

    void C(Context context, NewsEntry newsEntry, String str, String str2, Integer num, c9x0 c9x0Var, String str3);

    void F(Context context, String str);

    void G(Context context, String str, List<? extends NewsEntry> list, String str2, String str3);

    boolean H(Context context, UserId userId, int i, String str, Integer num, yp80 yp80Var);

    void I(Context context, Good good);

    void J(int i, Context context);

    void K(Context context, SituationalSuggest situationalSuggest, String str);

    void L(Context context, String str);

    void M(Context context, o3y0 o3y0Var);

    boolean N(Context context, String str, String str2, c9x0 c9x0Var, yp80 yp80Var, String str3);

    void P(bc6 bc6Var, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, Integer num, boolean z);

    void R(Context context, MyTargetNativeAdEntry myTargetNativeAdEntry);

    void S(Context context, String str, String str2, String str3);

    void T(Context context, Post post, String str);

    void U(Context context, NewsEntry newsEntry, String[] strArr);

    void V(Context context, UserId userId, OpenFromRef openFromRef);

    void W(Context context, String str, UserId userId, String str2, String str3, Boolean bool, String str4);

    void X(Context context, UserId userId);

    boolean Y(int i, int i2, int i3, Context context, UserId userId);

    void Z(Context context, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, List list, List list2);

    void a(Context context, NewsEntry newsEntry);

    void a0(Context context, Photos photos, h3f0 h3f0Var, PostInteract postInteract, String str);

    FragmentImpl b0(Context context, NewsEntry newsEntry, ModalPostDestination modalPostDestination, boolean z, Integer num, String str, String str2, qr80 qr80Var);

    void c(Context context, String str);

    void c0(Context context, int i, uls ulsVar);

    void d(Context context, UserId userId);

    void d0(Context context, String str);

    void e(Context context, lq60 lq60Var);

    void f(Context context, String str);

    void g(Context context, PostingVisibilityMode postingVisibilityMode, String str);

    oz50 h(xmq xmqVar, FaveTag faveTag, FaveSource faveSource);

    void i(Context context, NewsEntry newsEntry, Comment comment, String str, qr80 qr80Var);

    FragmentImpl j(Context context, VideoFile videoFile, String str, String str2, b bVar);

    void k(Context context, UserId userId, int i, a aVar);

    void m(Context context, UserId userId, long j);

    ysd0 n(Context context, fa10 fa10Var, p010 p010Var, int i, UserId userId, Integer num);

    void o(Context context, NewsEntry newsEntry, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr);

    void p(Context context, d dVar);

    void q(Context context, String str, List<? extends NewsEntry> list, String str2, String str3, String str4);

    void r(Context context, Post post, Group group);

    void t(Context context);

    void u(PostingFragment postingFragment);

    void v(Context context, Badgeable badgeable);

    void x(jbs jbsVar, NewsEntry newsEntry);

    dw20 y(Context context);

    void z(Context context, UserId userId);

    /* compiled from: NewsfeedRouter.kt */
    public static final class c {
        public static final /* synthetic */ c a = new c();
        private static final NewsfeedRouter STUB = new a();

        public final NewsfeedRouter getSTUB() {
            return STUB;
        }

        /* compiled from: NewsfeedRouter.kt */
        public static final class a implements NewsfeedRouter {
            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final boolean H(Context context, UserId userId, int i, String str, Integer num, yp80 yp80Var) {
                return false;
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final boolean N(Context context, String str, String str2, c9x0 c9x0Var, yp80 yp80Var, String str3) {
                return false;
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final boolean Y(int i, int i2, int i3, Context context, UserId userId) {
                return false;
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final FragmentImpl b0(Context context, NewsEntry newsEntry, ModalPostDestination modalPostDestination, boolean z, Integer num, String str, String str2, qr80 qr80Var) {
                return null;
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final oz50 h(xmq xmqVar, FaveTag faveTag, FaveSource faveSource) {
                oz50 oz50Var = new oz50(StubFragment.class, null, null);
                rdi.F(oz50Var);
                return oz50Var;
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final FragmentImpl j(Context context, VideoFile videoFile, String str, String str2, b bVar) {
                return null;
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final ysd0 n(Context context, fa10 fa10Var, p010 p010Var, int i, UserId userId, Integer num) {
                return null;
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final dw20 y(Context context) {
                return new dw20();
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void t(Context context) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void u(PostingFragment postingFragment) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void A(Context context, FeedbackPoll feedbackPoll) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void F(Context context, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void I(Context context, Good good) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void J(int i, Context context) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void L(Context context, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void M(Context context, o3y0 o3y0Var) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void R(Context context, MyTargetNativeAdEntry myTargetNativeAdEntry) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void X(Context context, UserId userId) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void a(Context context, NewsEntry newsEntry) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void c(Context context, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void d(Context context, UserId userId) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void d0(Context context, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void e(Context context, lq60 lq60Var) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void f(Context context, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void p(Context context, d dVar) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void v(Context context, Badgeable badgeable) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void x(jbs jbsVar, NewsEntry newsEntry) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void z(Context context, UserId userId) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void K(Context context, SituationalSuggest situationalSuggest, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void T(Context context, Post post, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void U(Context context, NewsEntry newsEntry, String[] strArr) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void V(Context context, UserId userId, OpenFromRef openFromRef) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void c0(Context context, int i, uls ulsVar) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void g(Context context, PostingVisibilityMode postingVisibilityMode, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void m(Context context, UserId userId, long j) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void r(Context context, Post post, Group group) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void S(Context context, String str, String str2, String str3) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void k(Context context, UserId userId, int i, a aVar) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void o(Context context, NewsEntry newsEntry, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void G(Context context, String str, List<? extends NewsEntry> list, String str2, String str3) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void P(bc6 bc6Var, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, Integer num, boolean z) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void Z(Context context, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, List list, List list2) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void a0(Context context, Photos photos, h3f0 h3f0Var, PostInteract postInteract, String str) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void i(Context context, NewsEntry newsEntry, Comment comment, String str, qr80 qr80Var) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void q(Context context, String str, List<? extends NewsEntry> list, String str2, String str3, String str4) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void C(Context context, NewsEntry newsEntry, String str, String str2, Integer num, c9x0 c9x0Var, String str3) {
            }

            @Override // com.vk.newsfeed.api.NewsfeedRouter
            public final void W(Context context, String str, UserId userId, String str2, String str3, Boolean bool, String str4) {
            }
        }
    }
}
