package com.vk.profile.community.impl.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.groups.dto.GroupsUpdateCreationOnboardingActionDto;
import com.vk.api.generated.groups.dto.GroupsUpdateCreationOnboardingScreenDto;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupChannelInfo;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboarding;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingModal;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingTooltip;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.Address;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.movika.sdk.base.observable.g;
import com.vk.movika.sdk.base.ui.p0;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.community.creationonboarding.api.data.GroupCreationOnboardingHighlight;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTask;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskProgress;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import com.vk.profile.community.details.api.CommunityAddContactsParams;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationBadgeClickItem;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationClickItem;
import com.vk.stat.scheme.CommonEcommStat$TypeEcommClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$OpenScreenEvent;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.toggle.features.FeedFeatures;
import com.vk.video.growth.api.data.VideoGrowthCommunitySource;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.maybe.s;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import io.reactivex.rxjava3.internal.operators.observable.e0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.a7f0;
import xsna.aeh;
import xsna.aha0;
import xsna.aoh;
import xsna.aqh;
import xsna.arh;
import xsna.asu0;
import xsna.az;
import xsna.b40;
import xsna.b60;
import xsna.bee;
import xsna.bhu;
import xsna.bjc;
import xsna.bpn0;
import xsna.buh;
import xsna.bw6;
import xsna.bwd0;
import xsna.bwr0;
import xsna.c2;
import xsna.c40;
import xsna.c5g;
import xsna.c95;
import xsna.ceh;
import xsna.cfh;
import xsna.cg1;
import xsna.cih;
import xsna.coh;
import xsna.cqm0;
import xsna.csh;
import xsna.da;
import xsna.doh;
import xsna.dq1;
import xsna.drm0;
import xsna.dvq0;
import xsna.e43;
import xsna.e89;
import xsna.e8v0;
import xsna.en;
import xsna.eoh;
import xsna.epx;
import xsna.ez;
import xsna.f0j0;
import xsna.f2i;
import xsna.f4z;
import xsna.fkq0;
import xsna.fnj;
import xsna.fo50;
import xsna.foh;
import xsna.fse;
import xsna.fzd0;
import xsna.g2h;
import xsna.geh;
import xsna.gf0;
import xsna.gl6;
import xsna.gn0;
import xsna.goh;
import xsna.gr3;
import xsna.gul0;
import xsna.gwh;
import xsna.hg1;
import xsna.hoh;
import xsna.hph;
import xsna.hqh;
import xsna.hv7;
import xsna.hz;
import xsna.i37;
import xsna.iah0;
import xsna.imh;
import xsna.ioh;
import xsna.ire;
import xsna.itg0;
import xsna.ivh;
import xsna.iwg0;
import xsna.iz0;
import xsna.j22;
import xsna.j5g;
import xsna.jnb;
import xsna.joh;
import xsna.jw5;
import xsna.jxg;
import xsna.jz;
import xsna.k6h;
import xsna.kf8;
import xsna.koh;
import xsna.kp1;
import xsna.ksh;
import xsna.kwg0;
import xsna.l3f;
import xsna.l50;
import xsna.loh;
import xsna.lpd;
import xsna.lt0;
import xsna.luh;
import xsna.m3a;
import xsna.mbe;
import xsna.mm6;
import xsna.mmh;
import xsna.moh;
import xsna.mre;
import xsna.mth;
import xsna.mx4;
import xsna.mzp0;
import xsna.n99;
import xsna.naz;
import xsna.neh;
import xsna.nf1;
import xsna.nk;
import xsna.noh;
import xsna.ns1;
import xsna.o0r0;
import xsna.o99;
import xsna.odg;
import xsna.oeh;
import xsna.ooh;
import xsna.ou1;
import xsna.ouh;
import xsna.ouq0;
import xsna.p4g;
import xsna.p5e;
import xsna.p870;
import xsna.p99;
import xsna.peh;
import xsna.pf8;
import xsna.ph3;
import xsna.ph40;
import xsna.pj1;
import xsna.pl2;
import xsna.po5;
import xsna.poh;
import xsna.pp3;
import xsna.q1;
import xsna.q7v0;
import xsna.q99;
import xsna.qmh;
import xsna.qr0;
import xsna.r50;
import xsna.r8h;
import xsna.rd1;
import xsna.rdi;
import xsna.rj80;
import xsna.rmh;
import xsna.rsg0;
import xsna.rth;
import xsna.s55;
import xsna.sec;
import xsna.sv4;
import xsna.t00;
import xsna.t3h;
import xsna.t50;
import xsna.t5h;
import xsna.t8q0;
import xsna.t9e;
import xsna.teh;
import xsna.tfx;
import xsna.tw4;
import xsna.tz;
import xsna.u9e;
import xsna.uaq0;
import xsna.uw4;
import xsna.uy3;
import xsna.uzp0;
import xsna.vbk;
import xsna.vea0;
import xsna.vs6;
import xsna.vw4;
import xsna.vzd0;
import xsna.w4y0;
import xsna.weh;
import xsna.wg1;
import xsna.whe;
import xsna.wjs0;
import xsna.wk50;
import xsna.wmc;
import xsna.wmh;
import xsna.wpg;
import xsna.wq;
import xsna.wtn0;
import xsna.wze;
import xsna.xa9;
import xsna.xcd;
import xsna.xf1;
import xsna.xq;
import xsna.xrh;
import xsna.xv2;
import xsna.xx0;
import xsna.xy2;
import xsna.y89;
import xsna.ych;
import xsna.yfb;
import xsna.ynh;
import xsna.yoh;
import xsna.yqh;
import xsna.yrh;
import xsna.ysg0;
import xsna.ysh;
import xsna.yte;
import xsna.z4f;
import xsna.z4h;
import xsna.z63;
import xsna.z8l0;
import xsna.z90;
import xsna.zah;
import xsna.zof;
import xsna.zq;
import xsna.zqh;
import xsna.zqu;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final class a extends wk50<CommunityProfileViewState, CommunityProfileState, CommunityProfileAction, d> {
    public final hph A;
    public final wmh B;
    public final imh C;
    public final vzd0 D;
    public final hqh E;
    public final ivh F;
    public final geh G;
    public final teh H;
    public final peh I;
    public final qmh J;
    public final rth K;
    public SubscribeStatus L;
    public final /* synthetic */ f2i f;
    public final Context g;
    public final e h;
    public final csh i;
    public final boolean j;
    public final ynh k;
    public final boolean l;
    public final cih m;
    public final yrh n;
    public final yqh o;
    public final ceh p;
    public final aeh q;
    public final mmh r;
    public final ksh s;
    public final arh t;
    public final weh u;
    public final ysh v;
    public final buh w;
    public final yoh x;
    public final aqh y;
    public final luh z;

    /* compiled from: CommunityProfileFeature.kt */
    /* renamed from: com.vk.profile.community.impl.ui.profile.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1566a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingCreationEntryPoint.values().length];
            try {
                iArr[PostingCreationEntryPoint.GroupWallButton.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingCreationEntryPoint.GroupPostponedPosts.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingCreationEntryPoint.GroupPostponedPostsThreePoints.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingCreationEntryPoint.CommunityCreationOnboardingBlock.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    public a(Context context, e eVar, csh cshVar, ExtendedProfilesRepository extendedProfilesRepository, boolean z, boolean z2, ynh ynhVar, neh nehVar, t5h t5hVar, zah zahVar) {
        super(CommunityProfileAction.i.b, eVar);
        this.f = new f2i(0);
        this.g = context;
        this.h = eVar;
        this.i = cshVar;
        this.j = z;
        this.k = ynhVar;
        this.l = z2;
        bhu bhuVar = new bhu();
        aoh aohVar = new aoh(new ire(this, 8));
        int i = 2;
        a7f0.a.e(this, ((o0r0) ynhVar.M0.getValue()).T().m().d, null, new ou1(1, this, a.class, "onSubscriptionStateChanged", "onSubscriptionStateChanged(Lcom/vk/subscription/api/SubscriptionInfo;)V", 0, i), null, null, 13);
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        hg1.v0 v0Var = new hg1.v0(koh.c);
        fVar.getClass();
        a7f0.a.e(this, new i0(fVar, v0Var), null, new hv7(1, this, a.class, "onPhotoRemoveEvent", "onPhotoRemoveEvent(Lcom/vkontakte/android/upload/events/PhotoRemoveEvent;)V", 0, i), null, null, 13);
        i0 i0Var = new i0(rj80.a(), new hg1.u0());
        g gVar = new g(aohVar, 25);
        int i2 = 16;
        this.e.b(i0Var.subscribe(new ez(gVar, i2), new gn0(new i37(L.a, 6), 15)));
        io.reactivex.rxjava3.subjects.f<bwr0> fVar2 = wjs0.b;
        hg1.v0 v0Var2 = new hg1.v0(loh.b);
        fVar2.getClass();
        a7f0.a.e(this, new i0(fVar2, v0Var2), null, new xa9(1, this, a.class, "onVideoNotInterestedEvent", "onVideoNotInterestedEvent(Lcom/vk/libvideo/event/VideoActionNotInterested;)V", 0, i), null, null, 13);
        a7f0.a.e(this, ((ych) ynhVar.k.getValue()).a(), null, new whe(1, this, a.class, "onPostsSubscriptionChangesEvent", "onPostsSubscriptionChangesEvent(Lcom/vk/profile/community/newsfeed/api/events/PostsSubscriptionEvent;)V", 0, 1), null, null, 13);
        this.e.b(new i0(ynhVar.g().a(), new hg1.v0(moh.b)).subscribe(new jz(new wpg(this, 4), i2)));
        a7f0.a.e(this, ynhVar.g().a(), null, new gl6(1, this, a.class, "onSubscriptionOnMarketEvent", "onSubscriptionOnMarketEvent(Lcom/vk/ecomm/market/api/bus/MarketEvent;)V", 0, 5), null, null, 13);
        a7f0.a.e(this, ynhVar.g().a(), null, new wg1(1, this, a.class, "onSubscriptionOnMarketEventForCtaButtons", "onSubscriptionOnMarketEventForCtaButtons(Lcom/vk/ecomm/market/api/bus/MarketEvent;)V", 0, 6), null, null, 13);
        ?? r7 = ynhVar.v0;
        a7f0.a.e(this, ((uaq0) r7.getValue()).a(), null, new ooh(1, this, a.class, "onVideoAddEvent", "onVideoAddEvent(Lcom/vk/newsfeed/api/posting/ContentOriginMetadata$Video;)V", 0), null, null, 13);
        a7f0.a.e(this, ((uaq0) r7.getValue()).c(), null, new poh(1, this, a.class, "onClipAddEvent", "onClipAddEvent(Lcom/vk/newsfeed/api/posting/ContentOriginMetadata$Clip;)V", 0), null, null, 13);
        a7f0.a.e(this, new i0(ynhVar.g().a(), new hg1.v0(fse.d)), null, new mx4(1, this, a.class, "onMarketItemCreatedEvent", "onMarketItemCreatedEvent(Lcom/vk/ecomm/market/api/bus/MarketEventGoodCreated;)V", 0, 4), null, null, 13);
        bw6 bw6Var = new bw6(1, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 2);
        p99 p99Var = new p99(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 1);
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context);
        cih cihVar = new cih(cshVar.a, this.e, new po5(1, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 1), bw6Var, p99Var, ynhVar, d);
        this.m = cihVar;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        mth mthVar = new mth(cshVar, (k6h) ynhVar.h.getValue(), new bee(i5, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i3, i4));
        yrh yrhVar = new yrh(context, ynhVar.d(), (q7v0) ynhVar.q0.getValue(), (wtn0) ynhVar.u0.getValue(), new lpd(i5, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i3, i4), new y89(i5, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 2));
        this.n = yrhVar;
        int i6 = 0;
        ouh ouhVar = new ouh(new r50(1, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i6, 1), this.e);
        UserId userId = cshVar.a;
        yqh yqhVar = new yqh(userId, new hoh(1, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i6, 0), this.e);
        this.o = yqhVar;
        int i7 = 0;
        int i8 = 1;
        ceh cehVar = new ceh(cshVar.a, ynhVar.d(), this.e, new uw4(i8, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i7, 6), new vw4(i8, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i7, 5));
        this.p = cehVar;
        this.q = new aeh(cshVar.a, context, ynhVar, new zqu(), this.e, new tw4(1, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 5));
        int i9 = 0;
        int i10 = 4;
        int i11 = 1;
        mmh mmhVar = new mmh(ynhVar, new zqu(), this.e, new jnb(i11, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i9, i10), new kf8(i11, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i9, i10), new doh(1, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.r = mmhVar;
        int i12 = 1;
        this.s = new ksh(cshVar.a, new zqu(), this.e, ynhVar, new l3f(i12, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 2), new pj1(i12, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 4), new joh(1, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        arh.a aVar = new arh.a(extendedProfilesRepository, (zof) ynhVar.C.getValue(), new bpn0(new defpackage.f(this, 28)));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        bpn0 bpn0Var = ynhVar.p;
        int i13 = 0;
        int i14 = 1;
        this.t = new arh(cshVar, aVar, bhuVar, bVar, new arh.b(cihVar, mthVar, ouhVar, yrhVar, yqhVar, (gul0) bpn0Var.getValue(), cehVar, mmhVar), nehVar, z2, new yte(i14, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i13, 1), new kp1(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 3), new ioh(i14, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", i13, 0));
        int i15 = 0;
        int i16 = 1;
        this.u = new weh(context, extendedProfilesRepository, this.e, new o99(i16, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i15, 3));
        this.v = new ysh(new wmc(i16, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i15, 1));
        this.w = new buh(new e89(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 3));
        this.x = new yoh(new com.vk.repository.internal.repos.stickers.suggests.a(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 5));
        int i17 = 1;
        this.y = new aqh(new goh(1, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0), new odg(i16, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i15, i17));
        this.z = new luh(new u9e(i16, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i15, i17));
        this.A = new hph(ynhVar.e(), new sec(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 1), fkq0.e(userId), extendedProfilesRepository, this.e, new foh(i16, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 0), new z4f(this, 9));
        int i18 = 0;
        int i19 = 1;
        this.B = new wmh(new c95(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 4));
        this.C = new imh(new s55(i19, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i18, 3), this.e, new coh(1, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0), new q99(i19, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i18, 2));
        vzd0 vzd0Var = new vzd0(new m3a(this), new noh(this), (p870) ynhVar.o.getValue(), new p5e(i19, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i18, 1), (gul0) bpn0Var.getValue(), ynhVar.a());
        this.D = vzd0Var;
        int i20 = 0;
        int i21 = 1;
        this.E = new hqh(vzd0Var, ouhVar, new q1(i21, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i20, 2), new vs6(i21, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i20, 1), new mbe(1, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 1));
        this.F = new ivh(bhuVar, new t50(1, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i20, 5));
        this.G = new geh(userId, zahVar, t5hVar);
        this.H = new teh(new n99(1, this, a.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", i20, 2), new xcd(this, 8));
        this.I = new peh((fzd0) ynhVar.O.getValue(), (ouq0) ynhVar.P.getValue(), new qr0(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", i20, 4));
        this.J = new qmh(new pf8(1, this, a.class, "send", "send(Lcom/vk/profile/community/impl/ui/profile/actions/CommunityProfileSideEffect;)V", 0, 4), new eoh(1, this, a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 0), this.e);
        this.K = new rth(zahVar, userId, cshVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02a9  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v146, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(CommunityProfileState communityProfileState, CommunityProfileAction communityProfileAction) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        long j;
        ?? r12;
        Object obj;
        boolean z3;
        GroupChannelInfo groupChannelInfo;
        UserProfile userProfile;
        UserId userId;
        boolean z4;
        UserProfile userProfile2;
        UserId userId2;
        UserId userId3;
        Object obj2;
        Object parcelableExtra;
        UserProfile userProfile3;
        UserId userId4;
        xy2 o;
        UserProfile userProfile4;
        List<CommunityProfileContentItem> list;
        t8q0 t8q0Var;
        GroupCreationOnboarding groupCreationOnboarding;
        GroupCreationOnboardingBlock groupCreationOnboardingBlock;
        GroupCreationOnboardingBlock.Step step;
        UserProfile userProfile5;
        UserId userId5;
        GroupCreationOnboarding groupCreationOnboarding2;
        GroupCreationOnboardingTooltip groupCreationOnboardingTooltip;
        GroupCreationOnboardingTooltip.Type type;
        ContentTab contentTab;
        ContentTab clip;
        io.reactivex.rxjava3.core.a aVar;
        CommunityProfileState communityProfileState2 = communityProfileState;
        CommunityProfileAction communityProfileAction2 = communityProfileAction;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState2.b;
        geh gehVar = this.G;
        gehVar.getClass();
        zah zahVar = gehVar.b;
        boolean z5 = communityProfileAction2 instanceof CommunityProfileAction.e.i;
        if (z5) {
            CommunityProfileAction.e.i iVar = (CommunityProfileAction.e.i) communityProfileAction2;
            if (epx.f(iVar, CommunityProfileAction.e.i.d.b)) {
                UserId userId6 = gehVar.a;
                obj = null;
                z = true;
                zah.b(zahVar, userId6, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_COMMUNITY_PAGE_NAVBAR, CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR, null, 24);
            } else {
                z = true;
                if (!epx.f(iVar, CommunityProfileAction.e.i.c.b)) {
                    str2 = "id";
                    r12 = 1;
                    z3 = communityProfileAction2 instanceof CommunityProfileAction.i;
                    int i = 9;
                    int i2 = 19;
                    ynh ynhVar = this.k;
                    io.reactivex.rxjava3.disposables.b bVar = this.e;
                    arh arhVar = this.t;
                    csh cshVar = this.i;
                    if (!z3) {
                        WallGetMode wallGetMode = cshVar.f;
                        if (wallGetMode == WallGetMode.DONUT) {
                            contentTab = new ContentTab.DonutWall();
                        } else {
                            if (wallGetMode != null) {
                                clip = new ContentTab.Wall(false, 3);
                            } else if (cshVar.h) {
                                clip = new ContentTab.Clip(false, 3);
                            } else {
                                contentTab = null;
                            }
                            contentTab = clip;
                        }
                        if (cshVar.i) {
                            T(new d.u(r12));
                        }
                        mzp0 mzp0Var = arhVar.a.c;
                        if (mzp0Var != null) {
                            mzp0Var.a();
                        }
                        arhVar.h.invoke(d.i.b.b);
                        arhVar.d.b(arhVar.d(arhVar.c(ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST)).C(new uy3(arhVar, 4)).subscribe(new xf1(new dq1(arhVar, this.j, contentTab), 15), new az(new wze(arhVar, i), i2)));
                        w4y0 w4y0Var = (w4y0) ynhVar.H0.getValue();
                        String P = w4y0Var.b.P();
                        if (P != null && !drm0.N(P)) {
                            FeedFeatures feedFeatures = FeedFeatures.FEED_YANDEX_AD;
                            feedFeatures.getClass();
                            if (com.vk.toggle.b.A.a(feedFeatures)) {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                asu0 asu0Var = asu0.a;
                                i0 I = q.Q(0L, 500L, timeUnit, asu0Var.c()).I(new f0j0(new z8l0(w4y0Var, 20), 18));
                                I.getClass();
                                aVar = new s(new e0(I).o(30L, TimeUnit.SECONDS)).o(asu0Var.d()).g(new ph40(r12, w4y0Var, P));
                                bVar.b(itg0.l(aVar.q(asu0.a.c())));
                                return;
                            }
                        }
                        aVar = i.b;
                        bVar.b(itg0.l(aVar.q(asu0.a.c())));
                        return;
                    }
                    if ((communityProfileAction2 instanceof CommunityProfileAction.m) || (communityProfileAction2 instanceof CommunityProfileAction.b) || (communityProfileAction2 instanceof CommunityProfileAction.o) || (communityProfileAction2 instanceof CommunityProfileAction.c)) {
                        U(communityProfileState2, communityProfileAction2);
                        return;
                    }
                    boolean z6 = communityProfileAction2 instanceof CommunityProfileAction.f;
                    cih cihVar = this.m;
                    if (z6) {
                        cihVar.a((CommunityProfileAction.f) communityProfileAction2, communityProfileState2);
                        return;
                    }
                    if (z5) {
                        CommunityProfileAction.e.i iVar2 = (CommunityProfileAction.e.i) communityProfileAction2;
                        e89 e89Var = this.w.a;
                        if (iVar2 instanceof CommunityProfileAction.e.i.C1585e) {
                            e89Var.invoke(new d.j.h(((CommunityProfileAction.e.i.C1585e) iVar2).b));
                            return;
                        }
                        if (iVar2 instanceof CommunityProfileAction.e.i.a) {
                            if (extendedCommunityProfile != null) {
                                e89Var.invoke(new d.j.x(extendedCommunityProfile, ((CommunityProfileAction.e.i.a) iVar2).b));
                                return;
                            }
                            return;
                        }
                        if (iVar2 instanceof CommunityProfileAction.e.i.c) {
                            if (extendedCommunityProfile != null) {
                                e89Var.invoke(new d.j.l(extendedCommunityProfile));
                                return;
                            }
                            return;
                        }
                        if (iVar2 instanceof CommunityProfileAction.e.i.d) {
                            if (extendedCommunityProfile != null) {
                                e89Var.invoke(new d.j.b(extendedCommunityProfile));
                                return;
                            }
                            return;
                        }
                        if (iVar2 instanceof CommunityProfileAction.e.i.f) {
                            if (extendedCommunityProfile != null) {
                                e89Var.invoke(new d.j.c0(extendedCommunityProfile));
                                return;
                            }
                            return;
                        } else {
                            if (iVar2 instanceof CommunityProfileAction.e.i.g) {
                                if (extendedCommunityProfile != null) {
                                    ((CommunityProfileAction.e.i.g) iVar2).getClass();
                                    e89Var.invoke(new d.j.j1(extendedCommunityProfile));
                                    return;
                                }
                                return;
                            }
                            if (!iVar2.equals(CommunityProfileAction.e.i.b.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (extendedCommunityProfile != null) {
                                e89Var.invoke(new d.e(extendedCommunityProfile, r12));
                                return;
                            }
                            return;
                        }
                    }
                    int i3 = 22;
                    boolean z7 = r12;
                    int i4 = 7;
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.AbstractC1583e) {
                        CommunityProfileAction.e.AbstractC1583e abstractC1583e = (CommunityProfileAction.e.AbstractC1583e) communityProfileAction2;
                        boolean z8 = abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.h;
                        if (z8) {
                            ExtendedCommunityProfile extendedCommunityProfile2 = ((CommunityProfileAction.e.AbstractC1583e.h) communityProfileAction2).b;
                            qmh qmhVar = this.J;
                            qmhVar.getClass();
                            int i5 = 16;
                            qmhVar.c.b(rsg0.y0(new vea0(extendedCommunityProfile2.a.c, -6, 0, 1, true), null, null, 3).L(new p0(new xx0(i2), 14), false).subscribe(new nf1(new t9e(qmhVar, i4), i3), new l50(new nk(i5), i5)));
                            return;
                        }
                        com.vk.repository.internal.repos.stickers.suggests.a aVar2 = this.x.a;
                        if (extendedCommunityProfile == null) {
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.a) {
                            aVar2.invoke(new d.j.g(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.p) {
                            aVar2.invoke(new d.j.i1(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.C1584e) {
                            aVar2.invoke(d.j.o.a);
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.s) {
                            aVar2.invoke(new d.j.n1(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.b) {
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.o) {
                            aVar2.invoke(new d.j.f1(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.d) {
                            aVar2.invoke(new d.j.r(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.f) {
                            aVar2.invoke(new d.j.p(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.q) {
                            CommunityProfileAction.e.AbstractC1583e.q qVar = (CommunityProfileAction.e.AbstractC1583e.q) abstractC1583e;
                            aVar2.invoke(new d.j.k1(extendedCommunityProfile, this.D, qVar.b, qVar.c));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.m) {
                            aVar2.invoke(d.j.s.a);
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.n) {
                            aVar2.invoke(new d.j.b0(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.r) {
                            aVar2.invoke(new d.j.m1(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.k) {
                            aVar2.invoke(new d.j.f(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.c) {
                            CommunityProfileAction.e.AbstractC1583e.c cVar = (CommunityProfileAction.e.AbstractC1583e.c) abstractC1583e;
                            aVar2.invoke(new d.j.i(cVar.b, cVar.c));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.l) {
                            aVar2.invoke(new d.j.n0(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.j) {
                            aVar2.invoke(new d.j.d1(extendedCommunityProfile));
                            return;
                        }
                        if (abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.g) {
                            aVar2.invoke(new d.j.m(extendedCommunityProfile));
                            return;
                        } else {
                            if (z8) {
                                return;
                            }
                            if (!(abstractC1583e instanceof CommunityProfileAction.e.AbstractC1583e.i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.invoke(new d.j.w(extendedCommunityProfile));
                            return;
                        }
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.d) {
                        CommunityProfileAction.e.d dVar = (CommunityProfileAction.e.d) communityProfileAction2;
                        c95 c95Var = this.B.a;
                        if (extendedCommunityProfile == null) {
                            return;
                        }
                        if (dVar instanceof CommunityProfileAction.e.d.C1582e) {
                            c95Var.invoke(new d.j.u(extendedCommunityProfile));
                            return;
                        }
                        if (dVar instanceof CommunityProfileAction.e.d.a) {
                            c95Var.invoke(new d.j.a(extendedCommunityProfile, ((CommunityProfileAction.e.d.a) dVar).b));
                            return;
                        }
                        if (dVar instanceof CommunityProfileAction.e.d.f) {
                            c95Var.invoke(new d.j.b1(extendedCommunityProfile));
                            return;
                        }
                        if (dVar instanceof CommunityProfileAction.e.d.C1581d) {
                            c95Var.invoke(new d.j.i0(extendedCommunityProfile, ((CommunityProfileAction.e.d.C1581d) dVar).b));
                            return;
                        }
                        if (dVar instanceof CommunityProfileAction.e.d.c) {
                            c95Var.invoke(new d.j.h0(((CommunityProfileAction.e.d.c) dVar).b));
                            return;
                        } else {
                            if (!(dVar instanceof CommunityProfileAction.e.d.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CommunityProfileAction.e.d.b bVar2 = (CommunityProfileAction.e.d.b) dVar;
                            c95Var.invoke(new d.j.f0(extendedCommunityProfile, bVar2.b, bVar2.c));
                            return;
                        }
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.w) {
                        CommunityProfileAction.w wVar = (CommunityProfileAction.w) communityProfileAction2;
                        T(new d.w(wVar.c, wVar.b));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.q) {
                        UserId userId7 = ((CommunityProfileAction.q) communityProfileAction2).b;
                        UserId a = fkq0.a(cshVar.a);
                        tfx tfxVar = new tfx("groups.invite", new en(23), new io.reactivex.rxjava3.internal.operators.observable.q1(25));
                        tfx.n(tfxVar, "group_id", a, 1L, 0L, 8);
                        if (userId7 != null) {
                            tfx.n(tfxVar, "user_id", userId7, 1L, 0L, 8);
                        }
                        bVar.b(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new ph3(new mre(this, 9), i2), new hz(new rd1(10), i3)));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.a0) {
                        CommunityProfileAction.a0 a0Var = (CommunityProfileAction.a0) communityProfileAction2;
                        ivh ivhVar = this.F;
                        ivhVar.getClass();
                        if (a0Var instanceof CommunityProfileAction.a0.b) {
                            Post post = ((CommunityProfileAction.a0.b) a0Var).b;
                            int i6 = !epx.f(post.m, post.o.b) ? 1 : 0;
                            bhu bhuVar = ivhVar.a;
                            long j2 = -post.m.b;
                            bhuVar.getClass();
                            HashMap A = fo50.A();
                            A.put(String.valueOf(j2), Integer.valueOf(i6));
                            p4g.a aVar3 = p4g.a;
                            Preference.H("community_posting", "selected_authors", new JSONObject(Collections.unmodifiableMap(A)).toString());
                            if (extendedCommunityProfile != null) {
                                extendedCommunityProfile.E2 = Integer.valueOf(i6);
                            }
                        } else if (a0Var instanceof CommunityProfileAction.a0.c) {
                            CommunityProfileAction.a0.c cVar2 = (CommunityProfileAction.a0.c) a0Var;
                            ivhVar.b.invoke(new d.y(cVar2.c, cVar2.b, cVar2.d));
                        }
                        mmh mmhVar = this.r;
                        mmhVar.getClass();
                        if (communityProfileAction2 instanceof CommunityProfileAction.a0.a) {
                            if (extendedCommunityProfile == null || (userProfile5 = extendedCommunityProfile.a) == null || (userId5 = userProfile5.c) == null || (groupCreationOnboarding2 = extendedCommunityProfile.K2) == null || (groupCreationOnboardingTooltip = groupCreationOnboarding2.f) == null || (type = groupCreationOnboardingTooltip.b) == null || type != GroupCreationOnboardingTooltip.Type.SHARE_POST) {
                                return;
                            }
                            mmhVar.b().f(userId5, type);
                            return;
                        }
                        if (!(communityProfileAction2 instanceof CommunityProfileAction.a0.b) || !((CommunityProfileAction.a0.b) communityProfileAction2).b.nc() || extendedCommunityProfile == null || (groupCreationOnboarding = extendedCommunityProfile.K2) == null || (groupCreationOnboardingBlock = groupCreationOnboarding.e) == null || (step = groupCreationOnboardingBlock.b) == null) {
                            return;
                        }
                        if (step == GroupCreationOnboardingBlock.Step.POSTING || step == GroupCreationOnboardingBlock.Step.REGULAR_POSTING) {
                            mmhVar.e.invoke(new CommunityProfileAction.o(z7));
                            return;
                        }
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.j) {
                        CommunityProfileAction.j jVar = (CommunityProfileAction.j) communityProfileAction2;
                        hqh hqhVar = this.E;
                        vzd0 vzd0Var = hqhVar.a;
                        vs6 vs6Var = hqhVar.d;
                        q1 q1Var = hqhVar.c;
                        if (jVar instanceof CommunityProfileAction.j.e) {
                            q1Var.invoke(d.k.C1613d.b);
                            vs6Var.invoke(d.f.b.a);
                            t8q0 t8q0Var2 = communityProfileState2.j;
                            if (t8q0Var2 == null) {
                                t8q0Var = null;
                            } else if (t8q0Var2.a) {
                                t8q0Var = null;
                                ouh.b(hqhVar.b, communityProfileState2.b, null, communityProfileState2.k, 2);
                            } else {
                                t8q0Var = null;
                                hqhVar.e.invoke(new CommunityProfileAction.o(true));
                            }
                            q1Var.invoke(new d.r(t8q0Var));
                        } else if (jVar instanceof CommunityProfileAction.j.d) {
                            q1Var.invoke(d.k.c.b);
                            vs6Var.invoke(d.f.a.a);
                        } else if (jVar instanceof CommunityProfileAction.j.a) {
                            CommunityProfileAction.j.a aVar4 = (CommunityProfileAction.j.a) jVar;
                            q1Var.invoke(new d.s(aVar4.b, aVar4.c));
                        } else if (jVar.equals(CommunityProfileAction.j.b.b)) {
                            q1Var.invoke(d.k.a.b);
                            vzd0Var.a();
                        } else {
                            if (!jVar.equals(CommunityProfileAction.j.c.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q1Var.invoke(d.k.b.b);
                            vzd0Var.b();
                        }
                        cihVar.getClass();
                        CommunityProfileContent communityProfileContent = communityProfileState2.d;
                        if (communityProfileContent != null && (list = communityProfileContent.b) != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                jxg b = cihVar.b((CommunityProfileContentItem) it.next());
                                if (jVar.equals(CommunityProfileAction.j.e.b)) {
                                    if (b != null) {
                                        b.b(communityProfileState2.e, extendedCommunityProfile);
                                    }
                                } else if (jVar.equals(CommunityProfileAction.j.d.b)) {
                                    if (b != null) {
                                        b.onPause();
                                    }
                                } else if (jVar.equals(CommunityProfileAction.j.c.b) && b != null) {
                                    b.onDestroy();
                                }
                            }
                        }
                        if (this.l && (communityProfileAction2 instanceof CommunityProfileAction.j.c)) {
                            arhVar.l.dispose();
                            arhVar.m.dispose();
                            return;
                        }
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.g) {
                        CommunityProfileAction.g gVar = (CommunityProfileAction.g) communityProfileAction2;
                        imh imhVar = this.C;
                        q99 q99Var = imhVar.d;
                        if (gVar instanceof CommunityProfileAction.g.d) {
                            CommunityProfileAction.g.d dVar2 = (CommunityProfileAction.g.d) gVar;
                            s55 s55Var = imhVar.a;
                            if (dVar2 instanceof CommunityProfileAction.g.d.b) {
                                s55Var.invoke(new d.v.g(((CommunityProfileAction.g.d.b) dVar2).b));
                                return;
                            }
                            if (epx.f(dVar2, CommunityProfileAction.g.d.c.b)) {
                                s55Var.invoke(d.v.b.b);
                                return;
                            }
                            if (dVar2 instanceof CommunityProfileAction.g.d.C1587d) {
                                s55Var.invoke(new d.v.c(((CommunityProfileAction.g.d.C1587d) dVar2).b));
                                return;
                            }
                            if (dVar2 instanceof CommunityProfileAction.g.d.f) {
                                s55Var.invoke(new d.v.e(((CommunityProfileAction.g.d.f) dVar2).b));
                                return;
                            }
                            if (dVar2 instanceof CommunityProfileAction.g.d.e) {
                                s55Var.invoke(new d.v.C1622d(((CommunityProfileAction.g.d.e) dVar2).b));
                                return;
                            }
                            if (dVar2 instanceof CommunityProfileAction.g.d.a) {
                                s55Var.invoke(d.v.a.b);
                                return;
                            } else if (dVar2 instanceof CommunityProfileAction.g.d.h) {
                                s55Var.invoke(new d.v.h(((CommunityProfileAction.g.d.h) dVar2).b));
                                return;
                            } else {
                                if (!(dVar2 instanceof CommunityProfileAction.g.d.C1588g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s55Var.invoke(new d.v.f(((CommunityProfileAction.g.d.C1588g) dVar2).b));
                                return;
                            }
                        }
                        if (gVar instanceof CommunityProfileAction.g.a) {
                            UserId userId8 = (extendedCommunityProfile == null || (userProfile4 = extendedCommunityProfile.a) == null) ? null : userProfile4.c;
                            if (userId8 != null) {
                                q99Var.invoke(new d.j.s0(userId8));
                                return;
                            }
                            return;
                        }
                        if (!(gVar instanceof CommunityProfileAction.g.c)) {
                            if (!(gVar instanceof CommunityProfileAction.g.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            boolean z9 = ((CommunityProfileAction.g.b) gVar).b;
                            if (extendedCommunityProfile == null) {
                                return;
                            }
                            if (extendedCommunityProfile.e() || z9) {
                                q99Var.invoke(new d.j.m0(extendedCommunityProfile, z9));
                                return;
                            } else {
                                q99Var.invoke(new d.j.s0(bwd0.i(extendedCommunityProfile)));
                                return;
                            }
                        }
                        boolean z10 = ((CommunityProfileAction.g.c) gVar).b;
                        io.reactivex.rxjava3.disposables.b bVar3 = imhVar.b;
                        if (extendedCommunityProfile == null || (userProfile3 = extendedCommunityProfile.a) == null || (userId4 = userProfile3.c) == null) {
                            return;
                        }
                        if (!z10) {
                            bVar3.b(rsg0.W(yfb.x(new aha0().n(fkq0.a(userId4))), 7).subscribe(new gf0(new ns1(imhVar, 26), 16), new da(new c2(20), 18)));
                            return;
                        }
                        r8h r8hVar = communityProfileState2.l.a;
                        if (r8hVar != null) {
                            ArrayList A2 = rdi.A(r8hVar.i, r8hVar.a);
                            ArrayList arrayList = new ArrayList(c5g.u(A2, 10));
                            Iterator it2 = A2.iterator();
                            while (it2.hasNext()) {
                                gwh gwhVar = (gwh) it2.next();
                                StringBuilder sb = new StringBuilder();
                                sb.append(userId4);
                                sb.append('_');
                                sb.append(gwhVar.getData().a().c);
                                arrayList.add(sb.toString());
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("covers", new JSONArray((Collection) arrayList));
                            jSONObject.put("is_scalable", Boolean.valueOf(extendedCommunityProfile.e2));
                            o = new zqu().o(fkq0.a(userId4), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : jSONObject.toString(), (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : "community_page", (r32 & 8388608) != 0 ? null : "onboarding_2025");
                            bVar3.b(rsg0.W(yfb.x(o), 7).subscribe(new t00(new t3h(imhVar, 1), 20), new j22(new pl2(17), i2)));
                            return;
                        }
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.h) {
                        Y(new d.j.l1(((CommunityProfileAction.e.h) communityProfileAction2).b));
                        return;
                    }
                    if (communityProfileAction2.equals(CommunityProfileAction.t.b)) {
                        Y(d.o.a);
                        return;
                    }
                    if (communityProfileAction2.equals(CommunityProfileAction.e.k.b)) {
                        if (extendedCommunityProfile == null) {
                            return;
                        }
                        Y(new d.e(extendedCommunityProfile, false));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.d) {
                        teh tehVar = this.H;
                        xcd xcdVar = tehVar.b;
                        Intent intent = ((CommunityProfileAction.d) communityProfileAction2).b;
                        if (epx.f(intent != null ? intent.getAction() : null, "draft")) {
                            z4 = false;
                        } else if (extendedCommunityProfile == null || (userProfile2 = extendedCommunityProfile.a) == null || (userId2 = userProfile2.c) == null) {
                            z4 = true;
                        } else {
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelableExtra = intent.getParcelableExtra("id", UserId.class);
                                    obj2 = (Parcelable) parcelableExtra;
                                } else {
                                    Object parcelableExtra2 = intent.getParcelableExtra(str2);
                                    if (!(parcelableExtra2 instanceof UserId)) {
                                        parcelableExtra2 = null;
                                    }
                                    obj2 = (UserId) parcelableExtra2;
                                }
                                userId3 = (UserId) obj2;
                            } else {
                                userId3 = null;
                            }
                            z4 = !userId2.equals(userId3);
                        }
                        if (z4) {
                            return;
                        }
                        String action = intent != null ? intent.getAction() : null;
                        if (action != null) {
                            int hashCode = action.hashCode();
                            if (hashCode == 3866578) {
                                if (action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                                    xcdVar.invoke(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else if (hashCode == 95844769) {
                                if (action.equals("draft")) {
                                    tehVar.a.invoke(new d.w(communityProfileState2.q, extendedCommunityProfile));
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode == 333377586 && action.equals("com.vkontakte.android.USER_PHOTO_CHANGED")) {
                                    xcdVar.invoke(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.z) {
                        CommunityProfileAction.z zVar = (CommunityProfileAction.z) communityProfileAction2;
                        T(new d.z(zVar.b, zVar.c));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.s) {
                        T(new d.r(((CommunityProfileAction.s) communityProfileAction2).b));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.g) {
                        CommunityProfileAction.e.g gVar2 = (CommunityProfileAction.e.g) communityProfileAction2;
                        yrh yrhVar = this.n;
                        yrhVar.getClass();
                        if (gVar2 instanceof CommunityProfileAction.e.g.a) {
                            yrhVar.a(communityProfileState2, ((CommunityProfileAction.e.g.a) gVar2).b);
                            return;
                        }
                        if (!(gVar2 instanceof CommunityProfileAction.e.g.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e8v0 e8v0Var = ((CommunityProfileAction.e.g.b) gVar2).b;
                        y89 y89Var = yrhVar.f;
                        xrh xrhVar = communityProfileState2.i;
                        ExtendedCommunityProfile extendedCommunityProfile3 = communityProfileState2.b;
                        if ((xrhVar instanceof xrh.d.C4044d) || (xrhVar instanceof xrh.d.e)) {
                            yrhVar.b(xrhVar, e8v0Var);
                            return;
                        }
                        if (xrhVar instanceof xrh.a) {
                            xrh.a aVar5 = (xrh.a) xrhVar;
                            if (aVar5 instanceof xrh.c.a) {
                                if (extendedCommunityProfile3 != null && (userProfile = extendedCommunityProfile3.a) != null && (userId = userProfile.c) != null) {
                                    y89Var.invoke(new d.j.v.e(fkq0.e(userId)));
                                }
                            } else if (!(aVar5 instanceof xrh.c.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yrhVar.e.invoke(d.m.a.b);
                            if (e8v0Var == null) {
                                return;
                            }
                            yrhVar.c.a(aVar5.b, aVar5.c, e8v0Var);
                            return;
                        }
                        if (xrhVar instanceof xrh.b) {
                            xrh.b bVar4 = (xrh.b) xrhVar;
                            if (bVar4 instanceof xrh.b.a) {
                                if (extendedCommunityProfile3 == null) {
                                    return;
                                }
                                y89Var.invoke(new d.j.y0(extendedCommunityProfile3));
                                return;
                            } else {
                                if (!(bVar4 instanceof xrh.b.C4043b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                y89Var.invoke(d.j.c1.a);
                                yrhVar.a(communityProfileState2, null);
                                return;
                            }
                        }
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.h) {
                        cihVar.d((CommunityProfileAction.h) communityProfileAction2, communityProfileState2);
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.u) {
                        T(new d.x(((CommunityProfileAction.u) communityProfileAction2).b));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.b) {
                        W((extendedCommunityProfile == null || (groupChannelInfo = extendedCommunityProfile.Y2) == null) ? null : groupChannelInfo.d);
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.a) {
                        V((CommunityProfileAction.e.a) communityProfileAction2);
                        return;
                    }
                    if (communityProfileAction2.equals(CommunityProfileAction.e.f.b)) {
                        this.o.a(true);
                        return;
                    }
                    if (communityProfileAction2.equals(CommunityProfileAction.v.b)) {
                        T(new d.u(false));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.b0) {
                        this.v.a((CommunityProfileAction.b0) communityProfileAction2);
                        return;
                    }
                    if (communityProfileAction2.equals(CommunityProfileAction.k.b)) {
                        this.p.a();
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.c) {
                        X(communityProfileState2, (CommunityProfileAction.e.c) communityProfileAction2);
                        return;
                    }
                    boolean z11 = communityProfileAction2 instanceof CommunityProfileAction.CommunityInternalMenuAction;
                    hph hphVar = this.A;
                    if (z11) {
                        hphVar.a((CommunityProfileAction.CommunityInternalMenuAction) communityProfileAction2);
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.p) {
                        CommunityProfileAction.p pVar = (CommunityProfileAction.p) communityProfileAction2;
                        peh pehVar = this.I;
                        fzd0.b(pehVar.a, pVar.b, pVar.c, pVar.d, (oeh) pehVar.d.getValue(), communityProfileState2.u, null, 96);
                        T(new d.q(null));
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.n) {
                        this.s.a((CommunityProfileAction.n) communityProfileAction2, communityProfileState2);
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.r) {
                        this.K.a((CommunityProfileAction.r) communityProfileAction2);
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.j) {
                        this.z.a((CommunityProfileAction.e.j) communityProfileAction2, communityProfileState2);
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.a) {
                        this.q.a((CommunityProfileAction.a) communityProfileAction2, communityProfileState2);
                        return;
                    }
                    if (communityProfileAction2 instanceof CommunityProfileAction.l) {
                        ((q7v0) ynhVar.q0.getValue()).a(null, null, null);
                        return;
                    } else {
                        if (communityProfileAction2 instanceof CommunityProfileAction.MiniAppMenuResultSnackBar) {
                            hphVar.b((CommunityProfileAction.MiniAppMenuResultSnackBar) communityProfileAction2);
                            return;
                        }
                        int i7 = 8;
                        if (epx.f(communityProfileAction2, CommunityProfileAction.x.b)) {
                            a7f0.a.d(this, i.b, io.reactivex.rxjava3.android.schedulers.a.b(), null, new cg1(i7, this, VideoGrowthCommunitySource.COMMUNITY_BANNER), 2);
                            return;
                        } else {
                            if (!epx.f(communityProfileAction2, CommunityProfileAction.y.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a7f0.a.d(this, i.b, io.reactivex.rxjava3.android.schedulers.a.b(), null, new cg1(i7, this, VideoGrowthCommunitySource.COMMUNITY_BUTTON), 2);
                            return;
                        }
                    }
                }
                UserId userId9 = gehVar.a;
                obj = null;
                zah.b(zahVar, userId9, CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_INFO_SETTINGS, CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR, null, 24);
            }
            str2 = "id";
            r12 = z;
            z3 = communityProfileAction2 instanceof CommunityProfileAction.i;
            int i8 = 9;
            int i22 = 19;
            ynh ynhVar2 = this.k;
            io.reactivex.rxjava3.disposables.b bVar5 = this.e;
            arh arhVar2 = this.t;
            csh cshVar2 = this.i;
            if (!z3) {
            }
        } else {
            z = true;
            if (communityProfileAction2 instanceof CommunityProfileAction.e.h) {
                UserId userId10 = gehVar.a;
                obj = null;
                zah.b(zahVar, userId10, CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_TABS_SETTINGS, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 24);
                str2 = "id";
                r12 = z;
                z3 = communityProfileAction2 instanceof CommunityProfileAction.i;
                int i82 = 9;
                int i222 = 19;
                ynh ynhVar22 = this.k;
                io.reactivex.rxjava3.disposables.b bVar52 = this.e;
                arh arhVar22 = this.t;
                csh cshVar22 = this.i;
                if (!z3) {
                }
            } else {
                if (communityProfileAction2 instanceof CommunityProfileAction.e.d) {
                    CommunityProfileAction.e.d dVar3 = (CommunityProfileAction.e.d) communityProfileAction2;
                    UserId userId11 = gehVar.a;
                    if (epx.f(dVar3, CommunityProfileAction.e.d.f.b)) {
                        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId11.b, null, null, new MobileOfficialAppsGroupsStat$OpenScreenEvent(MobileOfficialAppsGroupsStat$OpenScreenEvent.OpenScreenEventType.OPEN_PURCHASE_INFO, null, 2, null), 30), 2);
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c, b2, uzp0Var.a).q();
                        r12 = 1;
                        str2 = "id";
                    } else {
                        if (dVar3 instanceof CommunityProfileAction.e.d.C1581d) {
                            Integer num = ((CommunityProfileAction.e.d.C1581d) dVar3).b;
                            CommonEcommStat$TypeAvitoIntegrationBadgeClickItem.EventType eventType = (num != null && num.intValue() == 0) ? CommonEcommStat$TypeAvitoIntegrationBadgeClickItem.EventType.ACTIVE : (num != null && num.intValue() == 1) ? CommonEcommStat$TypeAvitoIntegrationBadgeClickItem.EventType.BROKEN : (num != null && num.intValue() == 2) ? CommonEcommStat$TypeAvitoIntegrationBadgeClickItem.EventType.PENDING : CommonEcommStat$TypeAvitoIntegrationBadgeClickItem.EventType.BROKEN;
                            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
                            if (userId11 != null) {
                                str = "id";
                                j = fkq0.a(userId11).b;
                            } else {
                                str = "id";
                                j = UserId.d.b;
                            }
                            SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_AVITO_INTEGRATION_CLICK, CommonEcommStat$TypeAvitoIntegrationClickItem.a.a(j, new CommonEcommStat$TypeAvitoIntegrationBadgeClickItem(eventType, null, null)), null, null, 12, null), 2);
                            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                            uzp0 uzp0Var2 = UiTracker.h;
                            uzp0Var2.getClass();
                            new bjc(c2, b3, uzp0Var2.a).q();
                            z2 = true;
                            zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_AVITO_ACCOUNT_LINK, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 24);
                        } else {
                            boolean z12 = true;
                            str = "id";
                            z2 = z12;
                            if (dVar3 instanceof CommunityProfileAction.e.d.c) {
                                zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_MUSICIAN_CARD, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 24);
                                z2 = z12;
                            }
                        }
                        str2 = str;
                        r12 = z2;
                    }
                } else {
                    boolean z13 = true;
                    str = "id";
                    if (communityProfileAction2 instanceof CommunityProfileAction.e.AbstractC1583e) {
                        CommunityProfileAction.e.AbstractC1583e abstractC1583e2 = (CommunityProfileAction.e.AbstractC1583e) communityProfileAction2;
                        if (abstractC1583e2 instanceof CommunityProfileAction.e.AbstractC1583e.b) {
                            zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_AVATAR, null, null, 28);
                            z2 = z13;
                        } else if (abstractC1583e2 instanceof CommunityProfileAction.e.AbstractC1583e.o) {
                            z2 = z13;
                            if (((CommunityProfileAction.e.AbstractC1583e.o) abstractC1583e2).b) {
                                zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_OPEN_PHOTO, null, null, 28);
                                z2 = z13;
                            }
                        } else if (abstractC1583e2 instanceof CommunityProfileAction.e.AbstractC1583e.d) {
                            zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_CHANGE_AVATAR, null, null, 28);
                            z2 = z13;
                        } else if (abstractC1583e2 instanceof CommunityProfileAction.e.AbstractC1583e.f) {
                            zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_CREATE_STORY, null, null, 28);
                            z2 = z13;
                        } else {
                            z2 = z13;
                            if (abstractC1583e2 instanceof CommunityProfileAction.e.AbstractC1583e.q) {
                                z2 = z13;
                                if (((CommunityProfileAction.e.AbstractC1583e.q) abstractC1583e2).d) {
                                    zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_VIEW_STORY, null, null, 28);
                                    z2 = z13;
                                }
                            }
                        }
                    } else if (communityProfileAction2 instanceof CommunityProfileAction.c) {
                        CommunityProfileAction.c cVar3 = (CommunityProfileAction.c) communityProfileAction2;
                        if (cVar3 instanceof CommunityProfileAction.c.AbstractC1572c.g) {
                            ((CommunityProfileAction.c.AbstractC1572c.g) cVar3).getClass();
                            z2 = z13;
                        } else {
                            z2 = z13;
                            if (cVar3 instanceof CommunityProfileAction.c.b.f) {
                                zah.b(zahVar, gehVar.a, CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_MUSICIAN_CARD, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 24);
                                z2 = z13;
                            }
                        }
                    } else {
                        z2 = z13;
                        if (communityProfileAction2 instanceof CommunityProfileAction.CommunityInternalMenuAction) {
                            CommunityProfileAction.CommunityInternalMenuAction communityInternalMenuAction = (CommunityProfileAction.CommunityInternalMenuAction) communityProfileAction2;
                            t5h t5hVar = gehVar.c;
                            CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = communityInternalMenuAction.b;
                            z4h.a aVar6 = communityInternalMenuAction.c;
                            Integer num2 = communityInternalMenuAction.d;
                            int[] iArr = t5h.a.$EnumSwitchMapping$0;
                            z2 = z13;
                            switch (iArr[communityMenuActionType.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    g2h g2hVar = new g2h(t5hVar.a);
                                    g2hVar.b = "menu";
                                    int i9 = iArr[communityMenuActionType.ordinal()];
                                    g2hVar.c = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? null : MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW : "share" : "copy" : "long_tap" : "tap";
                                    if (communityMenuActionType == CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.VIEW || aVar6 == null || num2 == null) {
                                        str2 = str;
                                    } else {
                                        int intValue = num2.intValue();
                                        JSONObject jSONObject2 = new JSONObject();
                                        str2 = str;
                                        jSONObject2.put(str2, aVar6.a);
                                        jSONObject2.put("type", aVar6.b);
                                        jSONObject2.put("pos", intValue);
                                        jSONObject2.put("app_id", aVar6.i);
                                        g2hVar.g = jSONObject2;
                                    }
                                    g2hVar.a();
                                    r12 = z13;
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    str2 = str;
                    r12 = z2;
                }
                z3 = communityProfileAction2 instanceof CommunityProfileAction.i;
                int i822 = 9;
                int i2222 = 19;
                ynh ynhVar222 = this.k;
                io.reactivex.rxjava3.disposables.b bVar522 = this.e;
                arh arhVar222 = this.t;
                csh cshVar222 = this.i;
                if (!z3) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0362 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CommunityProfileState communityProfileState, CommunityProfileAction communityProfileAction) {
        ExtendedCommunityProfile extendedCommunityProfile;
        boolean z;
        boolean z2 = communityProfileAction instanceof CommunityProfileAction.m;
        int i = 16;
        arh arhVar = this.t;
        int i2 = 0;
        j1 j1Var = null;
        boolean z3 = this.l;
        if (!z2) {
            if (communityProfileAction instanceof CommunityProfileAction.b) {
                if (z3) {
                    ((CommunityProfileAction.b) communityProfileAction).getClass();
                    T(new d.C1611d(0));
                    return;
                }
                return;
            }
            if (communityProfileAction instanceof CommunityProfileAction.o) {
                boolean z4 = ((CommunityProfileAction.o) communityProfileAction).b;
                ExtendedCommunityProfile extendedCommunityProfile2 = communityProfileState.b;
                ContentTab contentTab = communityProfileState.e;
                if (arhVar.g) {
                    arhVar.m.b(null);
                }
                arhVar.h.invoke(d.o.b.b);
                arhVar.d.b(arhVar.d(arhVar.c(z4 ? ExtendedProfilesRepository.LoadStrategy.RELOAD : ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST)).subscribe(new pp3(new sv4(z4, extendedCommunityProfile2, arhVar, contentTab), 13), new b60(new gr3(arhVar, 27), i)));
                return;
            }
            if ((communityProfileAction instanceof CommunityProfileAction.c) && z3) {
                ExtendedCommunityProfile extendedCommunityProfile3 = communityProfileState.b;
                CommunityProfileAction.c cVar = (CommunityProfileAction.c) communityProfileAction;
                r8h r8hVar = communityProfileState.l.a;
                boolean z5 = r8hVar != null && r8hVar.d;
                aqh aqhVar = this.y;
                odg odgVar = aqhVar.b;
                goh gohVar = aqhVar.a;
                if (cVar instanceof CommunityProfileAction.c.a) {
                    CommunityProfileAction.c.a aVar = (CommunityProfileAction.c.a) cVar;
                    if (epx.f(aVar, CommunityProfileAction.c.a.b.b)) {
                        gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.a.b);
                        return;
                    }
                    if (epx.f(aVar, CommunityProfileAction.c.a.C1568a.b)) {
                        gohVar.invoke(new CommunityProfileAction.e.d.a(false));
                        return;
                    }
                    if (aVar instanceof CommunityProfileAction.c.a.C1569c) {
                        CommunityProfileAction.c.a.C1569c c1569c = (CommunityProfileAction.c.a.C1569c) aVar;
                        if (extendedCommunityProfile3 == null) {
                            return;
                        }
                        c1569c.getClass();
                        int[] iArr = aqh.a.$EnumSwitchMapping$0;
                        throw null;
                    }
                    if (!(aVar instanceof CommunityProfileAction.c.a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CommunityProfileAction.c.a.d dVar = (CommunityProfileAction.c.a.d) aVar;
                    if (extendedCommunityProfile3 == null) {
                        return;
                    }
                    dVar.getClass();
                    int[] iArr2 = aqh.a.$EnumSwitchMapping$1;
                    throw null;
                }
                if (cVar instanceof CommunityProfileAction.c.b) {
                    CommunityProfileAction.c.b bVar = (CommunityProfileAction.c.b) cVar;
                    if (extendedCommunityProfile3 == null) {
                        return;
                    }
                    if (epx.f(bVar, CommunityProfileAction.c.b.h.b)) {
                        gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.l.b);
                        return;
                    }
                    if (bVar instanceof CommunityProfileAction.c.b.j) {
                        ((CommunityProfileAction.c.b.j) bVar).getClass();
                        odgVar.invoke(new d.j.y.b.g(naz.a(null)));
                        return;
                    }
                    if (epx.f(bVar, CommunityProfileAction.c.b.C1571c.b)) {
                        gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.i.b);
                        return;
                    }
                    if (epx.f(bVar, CommunityProfileAction.c.b.i.b)) {
                        odgVar.invoke(new d.j.y.b.f(extendedCommunityProfile3));
                        return;
                    }
                    if (epx.f(bVar, CommunityProfileAction.c.b.e.b)) {
                        return;
                    }
                    if (bVar instanceof CommunityProfileAction.c.b.d) {
                        ((CommunityProfileAction.c.b.d) bVar).getClass();
                        throw null;
                    }
                    if (epx.f(bVar, CommunityProfileAction.c.b.k.b)) {
                        gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.j.b);
                        return;
                    }
                    if (epx.f(bVar, CommunityProfileAction.c.b.C1570b.b)) {
                        odgVar.invoke(new d.j.y.b.C1607b(extendedCommunityProfile3.a.c));
                        return;
                    }
                    if (epx.f(bVar, CommunityProfileAction.c.b.a.b)) {
                        odgVar.invoke(new d.j.y.b.a(extendedCommunityProfile3));
                        return;
                    }
                    if (bVar instanceof CommunityProfileAction.c.b.f) {
                        ((CommunityProfileAction.c.b.f) bVar).getClass();
                        odgVar.invoke(new d.j.y.b.C1608d(null));
                        return;
                    } else {
                        if (!(bVar instanceof CommunityProfileAction.c.b.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((CommunityProfileAction.c.b.g) bVar).getClass();
                        odgVar.invoke(new d.j.y.b.e(null));
                        return;
                    }
                }
                if (!(cVar instanceof CommunityProfileAction.c.d)) {
                    if (!(cVar instanceof CommunityProfileAction.c.AbstractC1572c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CommunityProfileAction.c.AbstractC1572c abstractC1572c = (CommunityProfileAction.c.AbstractC1572c) cVar;
                    if (extendedCommunityProfile3 == null) {
                        return;
                    }
                    if (epx.f(abstractC1572c, CommunityProfileAction.c.AbstractC1572c.C1573c.b)) {
                        gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.d.b);
                        return;
                    }
                    if (epx.f(abstractC1572c, CommunityProfileAction.c.AbstractC1572c.e.b)) {
                        gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.g.b);
                        return;
                    }
                    if (epx.f(abstractC1572c, CommunityProfileAction.c.AbstractC1572c.a.b)) {
                        gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.b.b);
                        return;
                    }
                    if (abstractC1572c instanceof CommunityProfileAction.c.AbstractC1572c.g) {
                        ((CommunityProfileAction.c.AbstractC1572c.g) abstractC1572c).getClass();
                        odgVar.invoke(new d.j.y.c.a(0, extendedCommunityProfile3));
                        return;
                    }
                    if (abstractC1572c instanceof CommunityProfileAction.c.AbstractC1572c.f) {
                        ((CommunityProfileAction.c.AbstractC1572c.f) abstractC1572c).getClass();
                        gohVar.invoke(new CommunityProfileAction.g.d.f(false));
                        return;
                    } else if (epx.f(abstractC1572c, CommunityProfileAction.c.AbstractC1572c.b.b)) {
                        gohVar.invoke(CommunityProfileAction.g.a.b);
                        return;
                    } else if (abstractC1572c instanceof CommunityProfileAction.c.AbstractC1572c.d) {
                        gohVar.invoke(new CommunityProfileAction.g.c(((CommunityProfileAction.c.AbstractC1572c.d) abstractC1572c).b));
                        return;
                    } else {
                        if (!(abstractC1572c instanceof CommunityProfileAction.c.AbstractC1572c.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((CommunityProfileAction.c.AbstractC1572c.h) abstractC1572c).getClass();
                        throw null;
                    }
                }
                CommunityProfileAction.c.d dVar2 = (CommunityProfileAction.c.d) cVar;
                boolean z6 = dVar2 instanceof CommunityProfileAction.c.d.a;
                if (z6) {
                    CommunityProfileAction.c.d.a aVar2 = (CommunityProfileAction.c.d.a) dVar2;
                    if (z5) {
                        gohVar.invoke(new CommunityProfileAction.g.d.f(false));
                        return;
                    } else {
                        odgVar.invoke(new d.j.y.AbstractC1609d.a(aVar2.b));
                        return;
                    }
                }
                if (extendedCommunityProfile3 == null || z6) {
                    return;
                }
                if (dVar2 instanceof CommunityProfileAction.c.d.e) {
                    ((CommunityProfileAction.c.d.e) dVar2).getClass();
                    odgVar.invoke(new d.j.y.AbstractC1609d.b(extendedCommunityProfile3, null));
                    return;
                }
                if (dVar2 instanceof CommunityProfileAction.c.d.f) {
                    ((CommunityProfileAction.c.d.f) dVar2).getClass();
                    odgVar.invoke(new d.j.y.AbstractC1609d.c(extendedCommunityProfile3, null));
                    return;
                }
                if (epx.f(dVar2, CommunityProfileAction.c.d.C1575d.b)) {
                    gohVar.invoke(CommunityProfileAction.e.i.c.b);
                    return;
                }
                if (dVar2 instanceof CommunityProfileAction.c.d.b) {
                    gohVar.invoke(new CommunityProfileAction.e.i.a(((CommunityProfileAction.c.d.b) dVar2).b));
                    return;
                }
                if (epx.f(dVar2, CommunityProfileAction.c.d.C1574c.b)) {
                    gohVar.invoke(CommunityProfileAction.e.i.b.b);
                    return;
                }
                if (dVar2 instanceof CommunityProfileAction.c.d.g) {
                    ((CommunityProfileAction.c.d.g) dVar2).getClass();
                    gohVar.invoke(new CommunityProfileAction.e.i.g());
                    return;
                } else {
                    if (dVar2 instanceof CommunityProfileAction.c.d.h.b) {
                        ((CommunityProfileAction.c.d.h.b) dVar2).getClass();
                        throw null;
                    }
                    if (!epx.f(dVar2, CommunityProfileAction.c.d.h.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gohVar.invoke(CommunityProfileAction.e.AbstractC1583e.f.b);
                    return;
                }
            }
            return;
        }
        if (!z3) {
            return;
        }
        if (z3 && (extendedCommunityProfile = communityProfileState.b) != null && extendedCommunityProfile.n0) {
            CommunityProfileState.a aVar3 = communityProfileState.l;
            if (!aVar3.b || aVar3.a == null) {
                z = true;
                if (z) {
                    return;
                }
                ExtendedCommunityProfile extendedCommunityProfile4 = communityProfileState.b;
                ((CommunityProfileAction.m) communityProfileAction).getClass();
                if (arhVar.g && extendedCommunityProfile4 != null && extendedCommunityProfile4.n0) {
                    neh nehVar = arhVar.f;
                    VKList<Photo> vKList = nehVar.d;
                    if (vKList != null) {
                        int size = neh.c(vKList).size();
                        if (vKList.size() < vKList.i()) {
                            int i3 = size - 3;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            if (i3 <= 0 && !hg1.d(nehVar.c.a())) {
                                j1Var = nehVar.b(extendedCommunityProfile4, true).U(new mm6(new xv2(nehVar, 7), 12));
                            }
                        }
                    }
                    if (j1Var == null) {
                        return;
                    }
                    com.vk.im.ui.components.dialogs_list.b bVar2 = new com.vk.im.ui.components.dialogs_list.b(new zqh(arhVar, i2), i);
                    int i4 = kwg0.a;
                    arhVar.m.b(j1Var.subscribe(bVar2, new iwg0()));
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    public final void V(CommunityProfileAction.e.a aVar) {
        ceh cehVar = this.p;
        uw4 uw4Var = cehVar.d;
        io.reactivex.rxjava3.disposables.b bVar = cehVar.c;
        UserId userId = cehVar.a;
        if (!(aVar instanceof CommunityProfileAction.e.a.C1576a)) {
            if (!(aVar instanceof CommunityProfileAction.e.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ceh.b(userId, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_USER_CLOSE_OZON_INVITE_BANNER_ADB);
            bVar.b(itg0.m(rsg0.y0(yfb.x(new zqu().q(fkq0.a(userId), "ads_ozon_invite_banner")), null, null, 3)));
            uw4Var.invoke(d.c.a.b);
            return;
        }
        CommunityProfileAction.e.a.C1576a c1576a = (CommunityProfileAction.e.a.C1576a) aVar;
        String str = c1576a.c;
        ceh.b(userId, CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_OZON_INVITE_BANNER_ADB_BUTTON);
        cehVar.b.b(str);
        tfx tfxVar = new tfx("account.hideHelpHint", new wq(0), new xq(0));
        tfx.o(tfxVar, "hint_id", str, 0, 0, 12);
        bVar.b(itg0.m(rsg0.y0(yfb.x(tfxVar), null, null, 3)));
        cehVar.e.invoke(new d.j.d0(c1576a.b));
        uw4Var.invoke(d.c.a.b);
    }

    public final void W(String str) {
        if (str != null && !drm0.N(str)) {
            Y(new d.j.k0(str));
            return;
        }
        UserId userId = this.i.a;
        weh wehVar = this.u;
        int i = 12;
        wehVar.c.b(hg1.n(wehVar.b.L(userId), wehVar.a, false, null, 62).subscribe(new tz(new iz0(wehVar, 18), i), new c40(new b40(i), 14)));
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void X(CommunityProfileState communityProfileState, CommunityProfileAction.e.c cVar) {
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto;
        GroupCreationOnboarding groupCreationOnboarding;
        String str;
        Object obj;
        GroupCreationOnboarding groupCreationOnboarding2;
        GroupCreationOnboarding groupCreationOnboarding3;
        Object fVar;
        Object obj2;
        boolean z;
        mmh mmhVar = this.r;
        jnb jnbVar = mmhVar.c;
        kf8 kf8Var = mmhVar.d;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (cVar instanceof CommunityProfileAction.e.c.a) {
            if (extendedCommunityProfile == null || (groupCreationOnboarding3 = extendedCommunityProfile.K2) == null) {
                return;
            }
            GroupCreationOnboardingBlock groupCreationOnboardingBlock = groupCreationOnboarding3.e;
            ((vbk) mmhVar.k.getValue()).a(extendedCommunityProfile.a.c.b, cqm0.n(groupCreationOnboarding3.c));
            switch (mmh.a.$EnumSwitchMapping$0[groupCreationOnboardingBlock.b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    GroupCreationOnboardingModal groupCreationOnboardingModal = groupCreationOnboardingBlock.i;
                    if (groupCreationOnboardingModal != null) {
                        String str2 = groupCreationOnboardingModal.b;
                        String str3 = groupCreationOnboardingModal.d;
                        String str4 = groupCreationOnboardingModal.c;
                        UserId userId = extendedCommunityProfile.a.c;
                        List<GroupCreationOnboardingBlock.Option> D0 = j5g.D0(jw5.a(new z90(22), new lt0(23)), groupCreationOnboardingBlock.g);
                        ListBuilder e = e43.e();
                        for (GroupCreationOnboardingBlock.Option option : D0) {
                            Iterator<E> it = OnBoardingTaskType.i().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (epx.f(((OnBoardingTaskType) obj2).name(), option.d.name())) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            OnBoardingTaskType onBoardingTaskType = (OnBoardingTaskType) obj2;
                            if (onBoardingTaskType != null) {
                                GroupCreationOnboardingHighlight groupCreationOnboardingHighlight = mmh.a.$EnumSwitchMapping$1[onBoardingTaskType.ordinal()] == 1 ? GroupCreationOnboardingHighlight.ADS : null;
                                if (groupCreationOnboardingHighlight == null) {
                                    z = false;
                                } else {
                                    boolean d = mmhVar.b().d(userId, groupCreationOnboardingHighlight);
                                    if (!d) {
                                        mmhVar.b().c(userId, groupCreationOnboardingHighlight);
                                    }
                                    z = !d;
                                }
                                e.add(new OnBoardingTask(option.b, z, option.c, onBoardingTaskType, option.h ? OnBoardingTaskProgress.DONE : OnBoardingTaskProgress.IN_PROGRESS, option.i));
                            }
                        }
                        fVar = new d.j.q.f(str2, str3, str4, e.g(), extendedCommunityProfile.a.c, ((dvq0) mmhVar.g.getValue()).g(extendedCommunityProfile), extendedCommunityProfile.a.e);
                        break;
                    } else {
                        return;
                    }
                case 4:
                case 5:
                    fVar = new d.j.q.C1601d(extendedCommunityProfile, mmhVar.c(extendedCommunityProfile.a.c, groupCreationOnboarding3, GroupCreationOnboardingTooltip.Type.POST, GroupCreationOnboardingBlock.Step.POSTING, true));
                    break;
                case 6:
                    fVar = new d.j.q.a(extendedCommunityProfile);
                    break;
                default:
                    return;
            }
            kf8Var.invoke(fVar);
            return;
        }
        if (cVar instanceof CommunityProfileAction.e.c.b) {
            kf8Var.invoke(new d.j.q.e(((CommunityProfileAction.e.c.b) cVar).b, (extendedCommunityProfile == null || (groupCreationOnboarding2 = extendedCommunityProfile.K2) == null || !groupCreationOnboarding2.d) ? false : true));
            return;
        }
        if (cVar instanceof CommunityProfileAction.e.c.C1577c) {
            jnbVar.invoke(d.h.a.b);
            zqu zquVar = mmhVar.a;
            CommunityProfileAction.e.c.C1577c c1577c = (CommunityProfileAction.e.c.C1577c) cVar;
            UserId a = fkq0.a(c1577c.b);
            GroupsUpdateCreationOnboardingActionDto groupsUpdateCreationOnboardingActionDto = c1577c.c ? GroupsUpdateCreationOnboardingActionDto.CLOSE_ONBOARDING : GroupsUpdateCreationOnboardingActionDto.CLOSE_SCREEN;
            if (extendedCommunityProfile == null || (groupCreationOnboarding = extendedCommunityProfile.K2) == null || (str = groupCreationOnboarding.c) == null) {
                groupsUpdateCreationOnboardingScreenDto = null;
            } else {
                Iterator<E> it2 = GroupsUpdateCreationOnboardingScreenDto.i().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it2.next();
                    if (epx.f(((GroupsUpdateCreationOnboardingScreenDto) next).j(), str)) {
                        obj = next;
                        break;
                    }
                }
                groupsUpdateCreationOnboardingScreenDto = (GroupsUpdateCreationOnboardingScreenDto) obj;
            }
            zquVar.getClass();
            tfx tfxVar = new tfx("groups.updateCreationOnboarding", new n(15), new zq(16));
            tfx.n(tfxVar, "group_id", a, 1L, 0L, 8);
            tfx.o(tfxVar, "action", groupsUpdateCreationOnboardingActionDto.i(), 0, 0, 12);
            if (groupsUpdateCreationOnboardingScreenDto != null) {
                tfx.o(tfxVar, "screen", groupsUpdateCreationOnboardingScreenDto.j(), 0, 0, 12);
            }
            mmhVar.b.b(itg0.n(rsg0.W(yfb.x(tfxVar), 7)));
            return;
        }
        if (!(cVar instanceof CommunityProfileAction.e.c.d)) {
            throw new NoWhenBranchMatchedException();
        }
        CommunityProfileAction.e.c.d dVar = (CommunityProfileAction.e.c.d) cVar;
        if (extendedCommunityProfile == null) {
            return;
        }
        String str5 = "creation_onboarding_block";
        if (epx.f(dVar, CommunityProfileAction.e.c.d.b.b)) {
            jnbVar.invoke(new d.q("creation_onboarding_block"));
            kf8Var.invoke(new d.j.r(extendedCommunityProfile));
            return;
        }
        if (epx.f(dVar, CommunityProfileAction.e.c.d.C1579d.b)) {
            kf8Var.invoke(new d.j.s0(extendedCommunityProfile.a.c, "creation_onboarding_block"));
            return;
        }
        if (epx.f(dVar, CommunityProfileAction.e.c.d.f.b)) {
            rmh rmhVar = (rmh) mmhVar.i.getValue();
            rmhVar.b.a().c(rmhVar.a, new z63(rmhVar, extendedCommunityProfile.a.c, str5, 5));
            return;
        }
        if (epx.f(dVar, CommunityProfileAction.e.c.d.C1578c.b)) {
            cfh cfhVar = (cfh) mmhVar.j.getValue();
            UserId userId2 = extendedCommunityProfile.a.c;
            ExtendedCommunityProfile.c cVar2 = extendedCommunityProfile.b2;
            Integer num = cVar2 != null ? cVar2.a : null;
            String str6 = cVar2 != null ? cVar2.b : null;
            String str7 = extendedCommunityProfile.t0;
            String str8 = extendedCommunityProfile.V;
            Address address = extendedCommunityProfile.W1;
            cfhVar.a(userId2, new CommunityAddContactsParams(num, str6, str7, str8, address != null ? address.f : null), "creation_onboarding_block");
            return;
        }
        if (epx.f(dVar, CommunityProfileAction.e.c.d.C1580e.b)) {
            kf8Var.invoke(new d.j.j0(extendedCommunityProfile.a.c));
            return;
        }
        if (epx.f(dVar, CommunityProfileAction.e.c.d.g.b)) {
            kf8Var.invoke(new d.j.z0(mmh.a(extendedCommunityProfile, GroupCreationOnboardingBlock.Option.Status.GOODS)));
        } else if (epx.f(dVar, CommunityProfileAction.e.c.d.h.b)) {
            kf8Var.invoke(new d.j.a1(mmh.a(extendedCommunityProfile, GroupCreationOnboardingBlock.Option.Status.SERVICES)));
        } else {
            if (!epx.f(dVar, CommunityProfileAction.e.c.d.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            kf8Var.invoke(new d.j.g0(mmh.a(extendedCommunityProfile, GroupCreationOnboardingBlock.Option.Status.ADS)));
        }
    }

    public final void Y(com.vk.profile.community.impl.ui.profile.actions.d dVar) {
        ((f4z) this.f.b).b(dVar);
    }
}
