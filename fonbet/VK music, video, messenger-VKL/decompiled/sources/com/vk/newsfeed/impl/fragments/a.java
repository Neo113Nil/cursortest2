package com.vk.newsfeed.impl.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.attachpicker.impl.ImagePickerActivity;
import com.vk.badges.fragments.OneTimeDonutFragment;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.products_multipicker.api.MarketMultiPickerSource;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.settings.api.di.NewsfeedSettingsComponent;
import com.vk.movika.sdk.android.defaultplayer.utils.d;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.api.stats.NewsEntryEventItem;
import com.vk.newsfeed.domain.model.NewsfeedCustomFeedType;
import com.vk.newsfeed.domain.model.NewsfeedSimilarFeedType;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.newsfeed.impl.drafts.DraftsFeedFragment;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.newsfeed_section.presentation.base.fragment.NewsfeedSectionFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomToolbarFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.impl.views.a;
import com.vk.newsfeed.impl.views.c;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.presentation.model.ExcerptConfigFeatureType;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.t0;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MoneyFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a5;
import xsna.a960;
import xsna.arm0;
import xsna.b0r;
import xsna.b130;
import xsna.b1h;
import xsna.b2c0;
import xsna.b810;
import xsna.bc6;
import xsna.be50;
import xsna.bjc;
import xsna.bpn0;
import xsna.c120;
import xsna.c9x0;
import xsna.cn70;
import xsna.cpo;
import xsna.cqm0;
import xsna.di60;
import xsna.drm0;
import xsna.dw20;
import xsna.dxe;
import xsna.e3m;
import xsna.e43;
import xsna.eiz;
import xsna.emi;
import xsna.epx;
import xsna.ey50;
import xsna.f5y;
import xsna.fa10;
import xsna.fo1;
import xsna.fpf0;
import xsna.g66;
import xsna.g910;
import xsna.gla;
import xsna.gzn;
import xsna.h3f0;
import xsna.hg1;
import xsna.hu50;
import xsna.i730;
import xsna.iah0;
import xsna.ify;
import xsna.j5g;
import xsna.jbs;
import xsna.jgj;
import xsna.k7m;
import xsna.k9q0;
import xsna.kw60;
import xsna.l490;
import xsna.l7s;
import xsna.lq60;
import xsna.m5y;
import xsna.m7m;
import xsna.ma60;
import xsna.mf7;
import xsna.mvf;
import xsna.n11;
import xsna.n1o0;
import xsna.ncg;
import xsna.nex;
import xsna.nly;
import xsna.nw60;
import xsna.o25;
import xsna.o2r;
import xsna.o3w;
import xsna.o3y0;
import xsna.o9x0;
import xsna.ol;
import xsna.on00;
import xsna.oog0;
import xsna.ow60;
import xsna.owc0;
import xsna.oz50;
import xsna.p010;
import xsna.p90;
import xsna.pdv0;
import xsna.pj8;
import xsna.pw60;
import xsna.q2r;
import xsna.q860;
import xsna.qg60;
import xsna.qqb;
import xsna.qr80;
import xsna.qw60;
import xsna.r2r;
import xsna.rfc0;
import xsna.rsg0;
import xsna.rwi;
import xsna.rz00;
import xsna.s200;
import xsna.s8w;
import xsna.t6g0;
import xsna.tmq;
import xsna.tzp0;
import xsna.uls;
import xsna.ux40;
import xsna.uzp0;
import xsna.vex;
import xsna.vq6;
import xsna.vtk0;
import xsna.w8i;
import xsna.wed;
import xsna.ww50;
import xsna.xmq;
import xsna.yfb;
import xsna.yp80;
import xsna.ysd0;
import xsna.zb60;
import xsna.zdg;

/* compiled from: NewsfeedRouterImpl.kt */
/* loaded from: classes4.dex */
public final class a implements NewsfeedRouter, w8i {
    public final Object b;
    public final Object c;
    public final Object d;
    public final bpn0 e = new bpn0(new vex(this, 11));
    public final bpn0 f = new bpn0(new nly(this, 18));
    public final kw60 g = new kw60();

    public a(Lazy<? extends AttachPickerComponent> lazy, Lazy<? extends MarketComponent> lazy2, Lazy<? extends ProductsMultipickerComponent> lazy3) {
        this.b = lazy3;
        this.c = lazy;
        this.d = lazy2;
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void A(Context context, FeedbackPoll feedbackPoll) {
        NewsfeedFeedbackPollFragment.a aVar = new NewsfeedFeedbackPollFragment.a(NewsfeedFeedbackPollFragment.class, null, null);
        aVar.j.putParcelable("payload", feedbackPoll);
        aVar.k(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void C(Context context, NewsEntry newsEntry, String str, String str2, Integer num, c9x0 c9x0Var, String str3) {
        String str4;
        Owner s;
        UserId userId = null;
        owc0 owc0Var = new owc0(PostFragment.class, null, null);
        o25.a().N();
        owc0Var.m = newsEntry;
        Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
        long d = NewsfeedData.a.d(newsEntry);
        Bundle bundle = owc0Var.j;
        bundle.putLong("entry_key", d);
        l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
        if (l490Var != null && (s = l490Var.s()) != null) {
            userId = s.b;
        }
        int n = di60.n(newsEntry);
        if (userId != null && n != 0) {
            bundle.putString("entry_content_id", newsEntry.Bb());
        }
        if (newsEntry instanceof Videos) {
            bundle.putBoolean("load_as_videos", true);
        } else if (newsEntry instanceof Photos) {
            bundle.putBoolean("load_as_photos", true);
        } else if (newsEntry instanceof Post) {
            bundle.putSerializable("post_from", ((Post) newsEntry).Y);
        }
        bundle.putInt("entry_type", newsEntry.zb());
        boolean z = newsEntry instanceof Post;
        if (z && ((Post) newsEntry).Y == Post.SourceFrom.Discover) {
            bundle.putBoolean("no_bottom_navigation", true);
        }
        bundle.putBoolean("is_suggest_subscribe_allowed", true);
        if (z && ((Post) newsEntry).Y == Post.SourceFrom.Newsfeed) {
            bundle.putBoolean("is_time_spent_tracker_enabled", true);
        }
        if (str != null) {
            owc0Var.n = str;
            bundle.putString("referrer", str);
        }
        if (str2 != null) {
            bundle.putString("track_code", str2);
        }
        if (num != null) {
            bundle.putInt("arg_start_comment_id", num.intValue());
        }
        if (c9x0Var != null && (str4 = c9x0Var.a) != null && str4.length() != 0) {
            bundle.putString("post_action", str4);
        }
        if (str3 != null) {
            bundle.putString("access_key", str3);
        }
        owc0Var.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void F(Context context, String str) {
        EmptyList emptyList = EmptyList.b;
        UiTracker uiTracker = UiTracker.a;
        p(context, new NewsfeedRouter.d(str, emptyList, null, UiTracker.d(), t0.a(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA_SIMILAR_NEWS), "", ExcerptConfigFeatureType.DiscoverMediaPost, null));
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void G(Context context, String str, List<? extends NewsEntry> list, String str2, String str3) {
        FeedFeatures feedFeatures = FeedFeatures.DZEN_API;
        feedFeatures.getClass();
        NewsfeedSimilarFeedType newsfeedSimilarFeedType = b.A.a(feedFeatures) ? NewsfeedSimilarFeedType.DZEN : NewsfeedSimilarFeedType.NONE;
        DiscoverSimilarFeedFragment.a aVar = new DiscoverSimilarFeedFragment.a(str);
        List<? extends NewsEntry> list2 = list;
        if (list2.isEmpty()) {
            list2 = null;
        }
        aVar.y(list2);
        Bundle bundle = aVar.j;
        if (str3 != null) {
            bundle.putString("ref", str3);
        }
        bundle.putString("title", str2);
        bundle.putSerializable("feed_type", newsfeedSimilarFeedType);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final boolean H(Context context, UserId userId, int i, String str, Integer num, yp80 yp80Var) {
        String sb;
        if (str == null || drm0.N(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userId);
            sb2.append('_');
            sb2.append(i);
            sb = sb2.toString();
        } else {
            sb = userId + '_' + i + '_' + str;
        }
        new c0(hg1.m(rsg0.y0(new i730(sb), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new g66(yp80Var, 6)).subscribe(new f5y(new s8w(context, yp80Var, num, this, str, 2), 11), new nex(new o3w(yp80Var, 22), 9));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void I(Context context, Good good) {
        ((MarketComponent) this.d.getValue()).Ob().e(context, new rz00(good, CommonMarketStat$TypeRefSource.PHOTO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532));
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void J(int i, Context context) {
        new GeoPostsFragment.a(i).k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void K(Context context, SituationalSuggest situationalSuggest, String str) {
        emi.w(context, situationalSuggest, str);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void L(Context context, String str) {
        NewsfeedCustomToolbarFragment.a aVar = new NewsfeedCustomToolbarFragment.a(str);
        aVar.y(str);
        Bundle bundle = aVar.j;
        bundle.putString("ref", "shops_posts");
        bundle.putBoolean("NewsfeedCustomFragmentShops", false);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void M(Context context, o3y0 o3y0Var) {
        WriteBarOverlayFragment.a aVar = new WriteBarOverlayFragment.a(WriteBarOverlayFragment.class, null, null);
        UserId userId = o3y0Var.a;
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putInt("item_id", o3y0Var.b);
        bundle.putInt("type", 0);
        bundle.putString("ref", o3y0Var.c);
        bundle.putString("track_code", o3y0Var.d);
        bundle.putBoolean("can_group_comment", o3y0Var.e);
        bundle.putInt(X3.i.L, o3y0Var.f);
        Activity h = e3m.h(context);
        FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
        if (fragmentActivity == null || p90.e(fragmentActivity)) {
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        try {
            FragmentEntry j = aVar.j();
            j.Ab().Td(supportFragmentManager, j.d);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final boolean N(Context context, String str, String str2, c9x0 c9x0Var, yp80 yp80Var, String str3) {
        new c0(hg1.m(rsg0.y0(new i730(str), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new fo1(yp80Var, 5)).subscribe(new m5y(new dxe(context, yp80Var, str2, this, str3, c9x0Var), 11), new a960(new b810(yp80Var, 11), 2));
        return true;
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void P(bc6 bc6Var, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, Integer num, boolean z) {
        new ProfileFriendsFragment.a(friendsListParams, friendsListPrivacyType, null, null, z, 28).i(bc6Var, num.intValue());
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void R(Context context, MyTargetNativeAdEntry myTargetNativeAdEntry) {
        MyTargetBrandLiftSurvey myTargetBrandLiftSurvey;
        Map<String, Set<String>> map;
        LinkedHashMap linkedHashMap = null;
        MyTargetNativeAdEntry myTargetNativeAdEntry2 = myTargetNativeAdEntry != null ? myTargetNativeAdEntry : null;
        if (myTargetNativeAdEntry2 == null || (myTargetBrandLiftSurvey = myTargetNativeAdEntry2.v) == null) {
            return;
        }
        MyTargetNativeAdEntry.b bVar = myTargetNativeAdEntry.E;
        if (bVar != null && (map = bVar.c) != null) {
            linkedHashMap = new LinkedHashMap(on00.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), j5g.O0((Set) entry.getValue()));
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        n11 n11Var = (n11) this.e.getValue();
        MoneyFeatures moneyFeatures = MoneyFeatures.FEATURE_MONEY_AD_CHOICES_ENTRY_HASH;
        moneyFeatures.getClass();
        n11Var.e(context, myTargetBrandLiftSurvey, myTargetNativeAdEntry, linkedHashMap2, b.A.a(moneyFeatures));
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void S(Context context, String str, String str2, String str3) {
        PostsFromNotificationsFragment.a aVar = new PostsFromNotificationsFragment.a(PostsFromNotificationsFragment.class, null, null);
        Bundle bundle = aVar.j;
        if (str != null) {
            bundle.putString("title", str);
        }
        if (str2 != null) {
            bundle.putString("ref", str2);
        }
        if (str3 != null) {
            bundle.putString("arg_scroll_to", str3);
        }
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void T(Context context, Post post, String str) {
        Caption caption = post.x;
        if (caption == null) {
            return;
        }
        String str2 = caption.b;
        UserId userId = post.m;
        int i = post.n;
        String str3 = caption.m;
        mvf mvfVar = new mvf("newsfeed.getCaptionInfo", 1);
        mvfVar.K("type", str2);
        mvfVar.D(userId.b, "owner_id");
        mvfVar.C(i, "item_id");
        mvfVar.K("ref", str);
        mvfVar.K("track_code", str3);
        rsg0.y0(mvfVar, null, null, 3).subscribe(new c120(new zb60(context, 2), 10), new be50(new ow60(0), 2));
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void U(Context context, NewsEntry newsEntry, String[] strArr) {
        n11 n11Var = (n11) this.e.getValue();
        MoneyFeatures moneyFeatures = MoneyFeatures.FEATURE_MONEY_AD_CHOICES_ENTRY_HASH;
        moneyFeatures.getClass();
        n11Var.b(context, newsEntry, strArr, b.A.a(moneyFeatures));
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void V(Context context, UserId userId, NewsfeedRouter.OpenFromRef openFromRef) {
        DraftsFeedFragment.a aVar = new DraftsFeedFragment.a(DraftsFeedFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putSerializable("ref", openFromRef);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void W(Context context, String str, UserId userId, String str2, String str3, Boolean bool, String str4) {
        NewsfeedSearchFragment.a aVar = new NewsfeedSearchFragment.a(NewsfeedSearchFragment.class, null, null);
        Bundle bundle = aVar.j;
        if (str2 != null) {
            bundle.putString("key_owner_name", str2);
        }
        if (userId != null) {
            bundle.putParcelable("owner", userId);
        }
        if (str3 != null) {
            bundle.putString("key_situational_suggest_id", str3);
        }
        if (bool != null) {
            bundle.putBoolean("key_start_speech_to_text", bool.booleanValue());
        }
        if (str4 != null) {
            bundle.putString("key_domain", str4);
        }
        if (str != null) {
            bundle.putString("key_query", str);
        }
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void X(Context context, UserId userId) {
        t6g0 t6g0Var = t6g0.b;
        ExtendedUserProfile L0 = t6g0.c().L0(userId);
        ExtendedCommunityProfile extendedCommunityProfile = L0 instanceof ExtendedCommunityProfile ? (ExtendedCommunityProfile) L0 : null;
        if (extendedCommunityProfile == null) {
            return;
        }
        int i = rfc0.a;
        q860 q860Var = new q860();
        q860Var.g(userId, extendedCommunityProfile);
        q860Var.l(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final boolean Y(int i, int i2, int i3, Context context, UserId userId) {
        new c0(hg1.m(rsg0.y0(new o9x0(userId, i2), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new qqb(1)).subscribe(new qg60(new nw60(i, i2, i3, context, userId), 2), new hu50(new gzn(22), 3));
        return true;
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void Z(Context context, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, List list, List list2) {
        new ProfileFriendsFragment.a(friendsListParams, friendsListPrivacyType, list, list2, false, 32).k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void a(Context context, NewsEntry newsEntry) {
        d.b(context, newsEntry, (newsEntry instanceof Post) && epx.f(((Post) newsEntry).t, "suggest"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, com.vk.newsfeed.impl.views.a] */
    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void a0(Context context, Photos photos, h3f0 h3f0Var, PostInteract postInteract, String str) {
        tzp0.c.a aVar = com.vk.newsfeed.impl.views.a.l1;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        c cVar = new c(ref$ObjectRef);
        ArrayList a = a.c.a(context, photos, postInteract, str);
        b2c0 b2c0Var = new b2c0(h3f0Var);
        b2c0Var.m = new com.vk.newsfeed.impl.views.b(context);
        b2c0Var.setItems(a);
        if (context instanceof ey50) {
            ((ey50) context).Y().S(cVar);
        }
        final n1o0 n1o0Var = new n1o0(a);
        oog0 oog0Var = new oog0(iah0.b(18.0f), cn70.b(8), new mf7() { // from class: xsna.o1o0
            @Override // xsna.mf7
            public final int e0(int i) {
                if (i == 0) {
                    return 1;
                }
                return n1o0.this.e0(i);
            }
        });
        a.C1405a c1405a = new a.C1405a(context, b2c0Var, com.vk.newsfeed.impl.views.a.l1);
        c1405a.v0(R.string.photos_tagged_bottom_sheet_title);
        c1405a.l0(oog0Var);
        c1405a.i(b2c0Var, (r3 & 2) == 0, false);
        c1405a.c(new cpo(false, 0, 6)).a0(new vq6(22, context, cVar));
        ?? r8 = (com.vk.newsfeed.impl.views.a) c1405a.I0("TaggedPhotosBottomSheet");
        ref$ObjectRef.element = r8;
        r8.g1 = photos;
        r8.i1 = str;
        r8.h1 = postInteract;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final FragmentImpl b0(Context context, NewsEntry newsEntry, ModalPostDestination modalPostDestination, boolean z, Integer num, String str, String str2, qr80 qr80Var) {
        Owner s;
        Long l;
        VideoFile videoFile;
        AppCompatActivity appCompatActivity = (AppCompatActivity) e3m.h(context);
        UserId userId = null;
        if (p90.e(appCompatActivity)) {
            return null;
        }
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        qr80Var.getClass();
        boolean z2 = (qr80Var instanceof qr80.c) || (qr80Var instanceof qr80.h) || (qr80Var instanceof qr80.f) || (qr80Var instanceof qr80.g);
        kw60 kw60Var = this.g;
        if (z2) {
            qr80.b.a.getClass();
            MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint entryPoint = qr80Var instanceof qr80.c ? MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint.FROM_FOOTER_DONUT : qr80Var instanceof qr80.h ? MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint.FROM_POST_SCREEN : qr80Var instanceof qr80.g ? MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint.FROM_FRIENDS_ICON_LIKES : qr80Var instanceof qr80.f ? MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint.FROM_FRIENDS_TEXT_LIKES : null;
            if (entryPoint != null) {
                if (newsEntry instanceof Post) {
                    l = Long.valueOf(((Post) newsEntry).n);
                } else if (newsEntry instanceof PromoPost) {
                    l = Long.valueOf(((PromoPost) newsEntry).n.n);
                } else if (newsEntry instanceof Photos) {
                    l = Long.valueOf(((Photos) newsEntry).m);
                } else if (newsEntry instanceof Videos) {
                    VideoAttachment Nb = ((Videos) newsEntry).Nb();
                    l = Long.valueOf((Nb == null || (videoFile = Nb.k) == null) ? 0L : videoFile.o0());
                } else {
                    l = null;
                }
                Long valueOf = Long.valueOf(k9q0.o(newsEntry).b);
                String str3 = newsEntry.Cb().b;
                String str4 = str3 != null ? str3 : "";
                kw60Var.getClass();
                kw60.a(l, valueOf, str4, entryPoint);
            }
        } else {
            qr80.b.a.getClass();
            MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.EntryPoint entryPoint2 = qr80Var instanceof qr80.b ? MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.EntryPoint.BUTTON : qr80Var instanceof qr80.a ? MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.EntryPoint.INLINE_COMMENT : qr80Var instanceof qr80.d ? MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.EntryPoint.FRIEND_INLINE_COMMENT : qr80Var instanceof qr80.e ? MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.EntryPoint.FRIEND_ICON : null;
            if (entryPoint2 != null) {
                Integer valueOf2 = qr80Var instanceof qr80.a ? Integer.valueOf(((qr80.a) qr80Var).a) : qr80Var instanceof qr80.d ? Integer.valueOf(((qr80.d) qr80Var).a) : null;
                kw60Var.getClass();
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
                String str5 = newsEntry.Cb().b;
                bpn0 bpn0Var = cqm0.a;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal(entryPoint2, str5 != null ? str5 : "", valueOf2), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
            }
        }
        zdg zdgVar = new zdg(ModalPostCommonFragment.class, null, null);
        o25.a().N();
        zdgVar.m = newsEntry;
        Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
        long d = NewsfeedData.a.d(newsEntry);
        Bundle bundle = zdgVar.j;
        bundle.putLong("entry_key", d);
        l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
        if (l490Var != null && (s = l490Var.s()) != null) {
            userId = s.b;
        }
        int n = di60.n(newsEntry);
        if (userId != null && n != 0) {
            bundle.putString("entry_content_id", newsEntry.Bb());
        }
        if (newsEntry instanceof Videos) {
            bundle.putBoolean("load_as_videos", true);
        } else if (newsEntry instanceof Photos) {
            bundle.putBoolean("load_as_photos", true);
        } else if (newsEntry instanceof Post) {
            bundle.putSerializable("post_from", ((Post) newsEntry).Y);
        }
        bundle.putInt("entry_type", newsEntry.zb());
        if ((newsEntry instanceof Post) && ((Post) newsEntry).Y == Post.SourceFrom.Discover) {
            bundle.putBoolean("no_bottom_navigation", true);
        }
        bundle.putBoolean("is_suggest_subscribe_allowed", true);
        bundle.putBoolean("is_time_spent_tracker_enabled", false);
        NewsEntryEventItem a = ma60.a(newsEntry);
        if (a != null) {
            bundle.putParcelable("news_entry_event_item", a);
        }
        bundle.putString("track_code", str2);
        if (num != null) {
            bundle.putInt("arg_start_comment_id", num.intValue());
        }
        bundle.putBoolean("ModalPostCommonFragment.isModalReactionsForceDarkTheme", z);
        bundle.putInt("ModalPostCommonFragment.destination", modalPostDestination.ordinal());
        if (str != null) {
            zdgVar.n = str;
            bundle.putString("referrer", str);
        }
        FragmentImpl f = zdgVar.f();
        f.Td(supportFragmentManager, "ModalPostCommonFragmentNewsEntry" + newsEntry.Bb());
        return f;
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void c(Context context, String str) {
        NewsfeedCustomToolbarFragment.a aVar = new NewsfeedCustomToolbarFragment.a(str);
        aVar.y(str);
        aVar.j.putBoolean("show_in_lego_theme", false);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void c0(Context context, int i, uls ulsVar) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        ProfileFriendsFragment.a aVar = new ProfileFriendsFragment.a(new FriendsListParams.FriendsListsWithFriends(ulsVar.b), ulsVar.a, ulsVar.c, ulsVar.d, false, 36);
        if (context instanceof l7s) {
            aVar.w(((l7s) context).getThemeResId());
        }
        aVar.h(h, i);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void d(Context context, UserId userId) {
        SuggestedPostsFragment.a aVar = new SuggestedPostsFragment.a(SuggestedPostsFragment.class, null, null);
        aVar.j.putParcelable("owner_id", userId);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void d0(Context context, String str) {
        if (epx.f(str, "likes_posts")) {
            str = "post";
        } else if (epx.f(str, "likes_video")) {
            str = "video";
        }
        FeedFeatures feedFeatures = FeedFeatures.MVI_REACTIONS;
        feedFeatures.getClass();
        if (!b.A.a(feedFeatures)) {
            tmq.a().a(context, str);
            return;
        }
        ReactionsFeedFragment.a aVar = new ReactionsFeedFragment.a(ReactionsFeedFragment.class, null, null);
        aVar.j.putString("arg_filter", str);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void e(Context context, lq60 lq60Var) {
        if (lq60Var.equals(lq60.b.a)) {
            NewsfeedSectionFragment.a aVar = new NewsfeedSectionFragment.a();
            Bundle bundle = aVar.j;
            bundle.putInt("list_id", -2);
            bundle.putString("title", context.getString(R.string.friends));
            aVar.k(context);
            return;
        }
        if (lq60Var.equals(lq60.c.a)) {
            NewsfeedSectionFragment.a aVar2 = new NewsfeedSectionFragment.a();
            Bundle bundle2 = aVar2.j;
            bundle2.putInt("list_id", -4);
            bundle2.putString("title", context.getString(R.string.photos));
            aVar2.k(context);
            return;
        }
        if (lq60Var.equals(lq60.d.a)) {
            NewsfeedSectionFragment.a aVar3 = new NewsfeedSectionFragment.a();
            Bundle bundle3 = aVar3.j;
            bundle3.putInt("list_id", -5);
            bundle3.putString("title", context.getString(R.string.videos));
            aVar3.k(context);
            return;
        }
        if (!lq60Var.equals(lq60.a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        NewsfeedSectionFragment.a aVar4 = new NewsfeedSectionFragment.a();
        Bundle bundle4 = aVar4.j;
        bundle4.putInt("list_id", 0);
        bundle4.putString("title", context.getString(R.string.home_tabs_feed));
        aVar4.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void f(Context context, String str) {
        FeedFeatures feedFeatures = FeedFeatures.BREAKING_NEWS_API;
        feedFeatures.getClass();
        NewsfeedCustomFeedType newsfeedCustomFeedType = b.A.a(feedFeatures) ? NewsfeedCustomFeedType.BREAKING_NEWS : NewsfeedCustomFeedType.NONE;
        NewsfeedCustomToolbarFragment.a aVar = new NewsfeedCustomToolbarFragment.a(str);
        aVar.y(str);
        Bundle bundle = aVar.j;
        bundle.putSerializable("feed_type", newsfeedCustomFeedType);
        bundle.putBoolean("show_in_lego_theme", false);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void g(Context context, PostingVisibilityMode postingVisibilityMode, String str) {
        int i = rfc0.a;
        q860 q860Var = new q860();
        q860Var.b(postingVisibilityMode);
        q860Var.p(-1, context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final oz50 h(xmq xmqVar, FaveTag faveTag, FaveSource faveSource) {
        FaveType faveType;
        FaveFeedFragment.a aVar = new FaveFeedFragment.a(FaveFeedFragment.class, null, null);
        Bundle bundle = aVar.j;
        if (xmqVar != null) {
            if (xmqVar.equals(xmq.f.a)) {
                faveType = FaveType.POST;
            } else if (xmqVar.equals(xmq.a.a)) {
                faveType = FaveType.ARTICLE;
            } else if (xmqVar.equals(xmq.c.a)) {
                faveType = FaveType.LINK;
            } else if (xmqVar.equals(xmq.e.a)) {
                faveType = FaveType.PODCAST;
            } else if (xmqVar.equals(xmq.h.a)) {
                faveType = FaveType.VIDEO;
            } else if (xmqVar.equals(xmq.b.a)) {
                faveType = FaveType.CLIP;
            } else if (xmqVar.equals(xmq.g.a)) {
                faveType = FaveType.PRODUCT;
            } else {
                if (!xmqVar.equals(xmq.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                faveType = FaveType.NARRATIVE;
            }
            bundle.putSerializable("fave_type", faveType);
        }
        if (faveTag != null) {
            bundle.putParcelable("fave_tag", faveTag);
        }
        if (faveSource != null) {
            bundle.putString("source", faveSource.name());
        }
        return aVar;
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void i(Context context, NewsEntry newsEntry, Comment comment, String str, qr80 qr80Var) {
        b0(context, newsEntry, ModalPostDestination.COMMENTS, false, Integer.valueOf(comment.b), str, newsEntry.Cb().b, qr80Var);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final FragmentImpl j(Context context, VideoFile videoFile, String str, String str2, NewsfeedRouter.b bVar) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) e3m.h(context);
        if (p90.e(appCompatActivity)) {
            return null;
        }
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        pdv0.a a = vtk0.c().a(videoFile);
        Bundle bundle = a.j;
        a.C();
        a.B(str2);
        bundle.putBoolean("arg_show_only_comments", true);
        a.L(bVar.a);
        bundle.putBoolean("should_show_reactions_panel", false);
        bundle.putBoolean("should_send_donut_button", false);
        a.K(bVar.b);
        if (str != null) {
            a.J(str);
        }
        FragmentImpl f = a.f();
        f.Td(supportFragmentManager, "ModalPostCommentsFragmentVideo" + videoFile);
        return f;
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void k(Context context, UserId userId, int i, NewsfeedRouter.a aVar) {
        CommentThreadFragment.a aVar2 = new CommentThreadFragment.a(userId, i, 0);
        int i2 = aVar.a;
        Bundle bundle = aVar2.j;
        bundle.putInt("comment_id", i2);
        bundle.putInt("arg_start_comment_id", aVar.b);
        bundle.putBoolean("arg_can_comment", aVar.c);
        bundle.putBoolean("arg_can_share_comments", aVar.d);
        bundle.putBoolean("arg_can_group_comment", aVar.e);
        bundle.putString("arg_item_likes_type", aVar.f.i());
        bundle.putBoolean("arg_show_options_menu", true);
        aVar2.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void m(Context context, UserId userId, long j) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) e3m.h(context);
        if (p90.e(appCompatActivity)) {
            return;
        }
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        b130 b130Var = new b130(ModalPostCommonFragment.class, null, null);
        Bundle bundle = b130Var.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putLong("item_id", j);
        bundle.putInt("ModalPostCommonFragment.destination", ModalPostDestination.REACTIONS_DONATS.ordinal());
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        bundle.putString("entry_content_id", sb.toString());
        b130Var.f().Td(supportFragmentManager, "ModalPostCommonFragmentDonutReactions_" + userId.b + '_' + j);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final ysd0 n(Context context, fa10 fa10Var, p010 p010Var, int i, UserId userId, Integer num) {
        return ((ProductsMultipickerComponent) this.b.getValue()).a().a(context, new g910(null, 1, null, userId, new eiz(fa10Var, 16), i, num, MarketMultiPickerSource.POSTING, null, null, new ux40(p010Var, 5), new defpackage.c(26, this, context), 3221));
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void o(Context context, NewsEntry newsEntry, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr) {
        n11 n11Var = (n11) this.e.getValue();
        MoneyFeatures moneyFeatures = MoneyFeatures.FEATURE_MONEY_AD_CHOICES_ENTRY_HASH;
        moneyFeatures.getClass();
        n11Var.c(context, newsEntry, str, myTargetAdsComplainOptionsArr, b.A.a(moneyFeatures));
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void p(Context context, NewsfeedRouter.d dVar) {
        String str = dVar.a;
        List c0 = drm0.c0(drm0.j0(str, DomExceptionUtils.SEPARATOR, str), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        String str2 = (String) j5g.b0(0, c0);
        Long n = str2 != null ? arm0.n(str2) : null;
        String str3 = (String) j5g.b0(1, c0);
        Pair pair = new Pair(n, str3 != null ? arm0.m(10, str3) : null);
        Long l = (Long) pair.d();
        Integer num = (Integer) pair.g();
        DiscoverSimilarFeedFragment.a aVar = new DiscoverSimilarFeedFragment.a(str);
        aVar.y(dVar.b);
        ExcerptConfigFeatureType excerptConfigFeatureType = dVar.g;
        Bundle bundle = aVar.j;
        if (excerptConfigFeatureType != null) {
            bundle.putInt("posts_excerpt_config_type", excerptConfigFeatureType.h());
        }
        String str4 = dVar.c;
        if (str4 != null) {
            if (str4 != null) {
                bundle.putString("scroll_to", str4);
            }
            bundle.putBoolean("expand", false);
        }
        String str5 = dVar.e;
        if (str5 != null) {
            bundle.putString("ref", str5);
        }
        bundle.putString("title", dVar.f);
        String str6 = dVar.h;
        if (str6 != null) {
            bundle.putString("track_code", str6);
        }
        if (l != null && num != null) {
            long longValue = l.longValue();
            int intValue = num.intValue();
            bundle.putLong("anchor_owner_id", longValue);
            bundle.putInt("anchor_item_id", intValue);
        }
        FeedFeatures feedFeatures = FeedFeatures.SIMILAR_NEWS_API;
        feedFeatures.getClass();
        if (b.A.a(feedFeatures)) {
            bundle.putSerializable("feed_type", NewsfeedSimilarFeedType.SIMILAR_NEWS);
        }
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void q(Context context, String str, List<? extends NewsEntry> list, String str2, String str3, String str4) {
        FeedFeatures feedFeatures = FeedFeatures.BREAKING_NEWS_TREND_API;
        feedFeatures.getClass();
        NewsfeedSimilarFeedType newsfeedSimilarFeedType = b.A.a(feedFeatures) ? NewsfeedSimilarFeedType.BREAKING_NEWS_TREND : NewsfeedSimilarFeedType.NONE;
        DiscoverSimilarFeedFragment.a aVar = new DiscoverSimilarFeedFragment.a(str);
        List<? extends NewsEntry> list2 = list;
        if (list2.isEmpty()) {
            list2 = null;
        }
        aVar.y(list2);
        Bundle bundle = aVar.j;
        if (str4 != null) {
            bundle.putString("ref", str4);
        }
        if (str2 != null) {
            bundle.putString("title", str2);
        }
        if (str3 != null) {
            if (str3 != null) {
                bundle.putString("scroll_to", str3);
            }
            bundle.putBoolean("expand", false);
        }
        bundle.putSerializable("feed_type", newsfeedSimilarFeedType);
        aVar.k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void r(Context context, Post post, Group group) {
        int i = rfc0.a;
        q860 q860Var = new q860();
        q860Var.g = PostingCreationEntryPoint.PrepareSuggestedPostButton;
        q860Var.o(post, group);
        q860Var.l(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void t(Context context) {
        new ThemedFeedToolbarFragment.a(ThemedFeedToolbarFragment.class, null, null).k(context);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void u(PostingFragment postingFragment) {
        FragmentActivity activity = postingFragment.getActivity();
        if (activity == null) {
            return;
        }
        ((AttachPickerComponent) this.c.getValue()).getClass();
        Intent putExtra = new Intent(activity, (Class<?>) ImagePickerActivity.class).putExtra("type", 0);
        int i = ify.a;
        if (ify.e(ify.c)) {
            ify.a(new pw60(postingFragment, putExtra));
        } else {
            postingFragment.startActivityForResult(putExtra, 12);
        }
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void v(Context context, Badgeable badgeable) {
        new OneTimeDonutFragment.a(badgeable).k(context);
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void x(jbs jbsVar, NewsEntry newsEntry) {
        new oz50(PostFragment.class, null, yfb.b(new Pair("entry", newsEntry))).m(jbsVar);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.Object, xsna.dw20] */
    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final dw20 y(Context context) {
        ww50 v;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        qw60 qw60Var = new qw60(ref$ObjectRef);
        Activity h = e3m.h(context);
        if (h != null && (v = s200.v(h)) != null) {
            v.S(qw60Var);
        }
        r2r r2rVar = new r2r(context, null);
        r2rVar.e = new a5(this, context, qw60Var);
        r2rVar.F0(false);
        View inflate = LayoutInflater.from(r2rVar.c).inflate(R.layout.feed_hide_popup_layout, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.popup_recycler);
        r2rVar.F0(true);
        r2rVar.q0(false);
        r2rVar.u(0);
        r2rVar.x(0);
        r2rVar.v(0);
        r2rVar.I(true);
        ((TextView) inflate.findViewById(R.id.popup_text_title)).setText(R.string.newsfeed_modal_item_ignored_title);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setHasFixedSize(true);
        r2rVar.c(new jgj(inflate, 0, 0, 62));
        r2rVar.D0(inflate, false);
        ?? I0 = r2rVar.I0(null);
        inflate.findViewById(R.id.popup_dismiss_button).setOnClickListener(new q2r(0, r2rVar, I0));
        o2r o2rVar = new o2r(false);
        o2rVar.x0(b0r.class, new ol(26));
        o2rVar.setItems(e43.l(new b0r(R.drawable.vk_icon_check_circle_outline_28, r2rVar.c.getString(R.string.newsfeed_modal_item_ignored_subscriptions), new wed(1, rwi.d().b(null), r2rVar)), new b0r(R.drawable.vk_icon_block_outline_28, r2rVar.c.getString(R.string.newsfeed_modal_item_ignored_filter), new gla(3, ((NewsfeedSettingsComponent) ((k7m) m7m.f(r2rVar)).a(fpf0.a(NewsfeedSettingsComponent.class))).R9(), r2rVar)), new b0r(R.drawable.vk_icon_settings_outline_28, r2rVar.c.getString(R.string.newsfeed_modal_item_ignored_settings), new pj8(r2rVar, 5))));
        recyclerView.setAdapter(o2rVar);
        I0.Vn(new b1h(r2rVar, 11));
        r2rVar.a0(new ncg(r2rVar, 18));
        ref$ObjectRef.element = I0;
        return I0;
    }

    @Override // com.vk.newsfeed.api.NewsfeedRouter
    public final void z(Context context, UserId userId) {
        PostponedPostsFragment.a aVar = new PostponedPostsFragment.a(PostponedPostsFragment.class, null, null);
        aVar.j.putParcelable("owner_id", userId);
        aVar.k(context);
    }
}
