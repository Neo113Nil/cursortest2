package com.vk.profile.community.impl.ui.profile;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.catalog.MarketCatalogSectionId;
import com.vk.profile.community.details.api.CommunityAddContactsParams;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a0a;
import xsna.ajg0;
import xsna.anm0;
import xsna.b3i;
import xsna.bbj0;
import xsna.bjc;
import xsna.bwd0;
import xsna.c63;
import xsna.cfh;
import xsna.cwh;
import xsna.d3h;
import xsna.d5j;
import xsna.d70;
import xsna.dhc;
import xsna.dnh;
import xsna.dw20;
import xsna.e3m;
import xsna.e43;
import xsna.fkq0;
import xsna.fy9;
import xsna.g1i;
import xsna.g2v;
import xsna.gpu0;
import xsna.gyh;
import xsna.hib;
import xsna.iah0;
import xsna.if6;
import xsna.ij8;
import xsna.in0;
import xsna.iph;
import xsna.j20;
import xsna.jf6;
import xsna.jgj;
import xsna.k1h;
import xsna.kbe;
import xsna.kbj0;
import xsna.krv0;
import xsna.m1h;
import xsna.m7m;
import xsna.maz;
import xsna.mrh;
import xsna.msy;
import xsna.ngc;
import xsna.o1i;
import xsna.o2i;
import xsna.oz50;
import xsna.qoh;
import xsna.r8;
import xsna.rmh;
import xsna.rml0;
import xsna.s200;
import xsna.s8;
import xsna.smh;
import xsna.sz00;
import xsna.t8q0;
import xsna.tmh;
import xsna.tmh.c;
import xsna.to80;
import xsna.umh;
import xsna.v1h;
import xsna.vmh;
import xsna.we0;
import xsna.ww50;
import xsna.xv00;
import xsna.yce;
import xsna.ydt0;
import xsna.ynh;
import xsna.yrn;
import xsna.zah;
import xsna.zof;
import xsna.zvw;

/* compiled from: CommunityProfileNavigator.kt */
/* loaded from: classes5.dex */
public final class c {
    public final CommunityProfileFragment a;
    public final zah b;
    public final b3i c;
    public final ynh d;
    public final b e;
    public final String f;
    public final in0 g;
    public final zof h;
    public final r8 i;
    public final com.vk.movika.sdk.base.logic.processor.actions.d j;
    public final s8 k;
    public final qoh l;
    public final io.reactivex.rxjava3.disposables.b m = new io.reactivex.rxjava3.disposables.b();
    public final Object n;
    public final Object o;
    public final Object p;

    /* compiled from: CommunityProfileNavigator.kt */
    public static final class a implements d3h.a {
        public final /* synthetic */ ExtendedCommunityProfile b;

        public a(ExtendedCommunityProfile extendedCommunityProfile) {
            this.b = extendedCommunityProfile;
        }

        @Override // xsna.d3h.a
        public final void a() {
            c.this.k.invoke(new CommunityProfileAction.s(new t8q0(false)));
        }

        @Override // xsna.d3h.a
        public final void b(String str) {
            c.this.k.invoke(new CommunityProfileAction.e.a.b(str));
        }

        @Override // xsna.d3h.a
        public final void c() {
            c.this.k.invoke(CommunityProfileAction.e.AbstractC1583e.l.b);
        }

        @Override // xsna.d3h.a
        public final void d() {
            c.this.k.invoke(new CommunityProfileAction.o(true));
        }

        @Override // xsna.d3h.a
        public final void e(ExtendedCommunityProfile extendedCommunityProfile) {
            c.this.k.invoke(new CommunityProfileAction.w(0, extendedCommunityProfile));
        }

        @Override // xsna.d3h.a
        public final void f(UserId userId) {
            c.this.k.invoke(new CommunityProfileAction.e.c.b(userId));
        }

        @Override // xsna.d3h.a
        public final void g() {
            c.this.k.invoke(CommunityProfileAction.k.b);
        }

        @Override // xsna.d3h.a
        public final void h() {
            c.this.k.invoke(CommunityProfileAction.e.c.a.b);
        }

        @Override // xsna.d3h.a
        public final void i() {
            c.this.k.invoke(CommunityProfileAction.e.AbstractC1583e.k.b);
        }

        @Override // xsna.d3h.a
        public final String j() {
            ArrayList<StoriesContainer> arrayList = this.b.d2;
            return (arrayList == null || arrayList.isEmpty()) ? "without_cover" : c.this.e.f.f.b != null ? "opened_live_cover" : "live_cover";
        }

        @Override // xsna.d3h.a
        public final void k(ExtendedCommunityProfile extendedCommunityProfile, String str) {
            c.this.k.invoke(new CommunityProfileAction.e.AbstractC1583e.c(extendedCommunityProfile, str));
        }

        @Override // xsna.d3h.a
        public final void l(String str, String str2) {
            c.this.k.invoke(new CommunityProfileAction.e.a.C1576a(str, str2));
        }

        @Override // xsna.d3h.a
        public final void m(io.reactivex.rxjava3.disposables.c cVar) {
            c.this.m.b(cVar);
        }

        @Override // xsna.d3h.a
        public final void n() {
            c.this.k.invoke(CommunityProfileAction.e.f.b);
        }
    }

    public c(CommunityProfileFragment communityProfileFragment, zah zahVar, b3i b3iVar, ynh ynhVar, b bVar, String str, in0 in0Var, zof zofVar, r8 r8Var, com.vk.movika.sdk.base.logic.processor.actions.d dVar, s8 s8Var, qoh qohVar) {
        this.a = communityProfileFragment;
        this.b = zahVar;
        this.c = b3iVar;
        this.d = ynhVar;
        this.e = bVar;
        this.f = str;
        this.g = in0Var;
        this.h = zofVar;
        this.i = r8Var;
        this.j = dVar;
        this.k = s8Var;
        this.l = qohVar;
        dnh dnhVar = new dnh(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n = msy.a(lazyThreadSafetyMode, dnhVar);
        this.o = msy.a(lazyThreadSafetyMode, new yce(this, 7));
        this.p = msy.a(lazyThreadSafetyMode, new kbe(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(ExtendedCommunityProfile extendedCommunityProfile) {
        cfh cfhVar = (cfh) this.d.G0.getValue();
        UserId userId = extendedCommunityProfile.a.c;
        ExtendedCommunityProfile.c cVar = extendedCommunityProfile.b2;
        Integer num = cVar != null ? cVar.a : null;
        String str = cVar != null ? cVar.b : null;
        Integer num2 = num;
        String str2 = extendedCommunityProfile.t0;
        String str3 = null;
        String str4 = str;
        String str5 = extendedCommunityProfile.V;
        Address address = extendedCommunityProfile.W1;
        if (address != null) {
            str3 = address.f;
        }
        cfhVar.a(userId, new CommunityAddContactsParams(num2, str4, str2, str5, str3), "onboarding_2025");
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    public final o1i b(ExtendedCommunityProfile extendedCommunityProfile, o1i.a aVar) {
        ynh ynhVar = this.d;
        return new o1i(this.a, extendedCommunityProfile, aVar, this.b, this.c, (anm0) ynhVar.d.getValue(), (bbj0) ynhVar.e.getValue(), (d70) ynhVar.f.getValue(), this.f, (ajg0) ynhVar.g.getValue(), (gyh) ynhVar.i.getValue(), (o2i) ynhVar.j.getValue(), this.e.f.b, (com.vk.friends.groupinvite.api.domain.a) ynhVar.r.getValue(), ynhVar.f());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    public final d3h c(ExtendedCommunityProfile extendedCommunityProfile) {
        a aVar = new a(extendedCommunityProfile);
        ynh ynhVar = this.d;
        return new d3h(this.a, extendedCommunityProfile, aVar, this.f, (com.vk.ecomm.avito.api.a) ynhVar.u.getValue(), (rmh) ynhVar.D0.getValue(), (cfh) ynhVar.G0.getValue(), (xv00) ynhVar.s.getValue(), (cwh) this.n.getValue(), this.b, this.c, (anm0) ynhVar.d.getValue(), (to80) ynhVar.m0.getValue(), (rml0) ynhVar.U.getValue(), ynhVar.f(), null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mrh d() {
        return (mrh) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(d.j jVar) {
        if (jVar instanceof d.j.t0) {
            mrh d = d();
            d.j.t0 t0Var = (d.j.t0) jVar;
            fy9.a((fy9) d.b.a0.getValue(), d.a.requireContext(), bwd0.i(t0Var.a), null, t0Var.b, 4);
            return;
        }
        if (jVar instanceof d.j.t) {
            mrh d2 = d();
            ((sz00) d2.b.V.getValue()).b(d2.a.requireContext(), ((d.j.t) jVar).a);
            return;
        }
        if (jVar instanceof d.j.o0) {
            j(((d.j.o0) jVar).a);
            return;
        }
        if (jVar instanceof d.j.v) {
            iph iphVar = (iph) this.p.getValue();
            d.j.v vVar = (d.j.v) jVar;
            c cVar = iphVar.d;
            CommunityProfileFragment communityProfileFragment = iphVar.a;
            if (communityProfileFragment.mo2getContext() == null) {
                return;
            }
            if (vVar instanceof d.j.v.C1604d) {
                maz.c(iphVar.c, communityProfileFragment.requireContext(), ((d.j.v.C1604d) vVar).a, LaunchContext.A, null, null, 24);
                return;
            }
            if (vVar instanceof d.j.v.f) {
                kbj0.e(iphVar.b, communityProfileFragment.requireContext(), new LinkAttachment(((d.j.v.f) vVar).a), false, null, false, null, 60);
                return;
            }
            if (vVar instanceof d.j.v.a) {
                UserId userId = ((d.j.v.a) vVar).a;
                Uri.Builder builder = new Uri.Builder();
                builder.appendPath("community_manage");
                builder.appendEncodedPath("#");
                builder.appendPath("primary-block-menu-add");
                builder.appendQueryParameter("group_id", String.valueOf(userId));
                cVar.n(userId, builder.build().toString());
                return;
            }
            if (vVar instanceof d.j.v.b) {
                d.j.v.b bVar = (d.j.v.b) vVar;
                UserId userId2 = bVar.b;
                Uri.Builder builder2 = new Uri.Builder();
                builder2.appendPath("community_manage");
                builder2.appendEncodedPath("#");
                builder2.appendPath("primary-block-menu-item-edit");
                builder2.appendEncodedPath(String.valueOf(bVar.a));
                builder2.appendQueryParameter("group_id", String.valueOf(userId2));
                cVar.n(userId2, builder2.build().toString());
                return;
            }
            if (vVar instanceof d.j.v.c) {
                UserId userId3 = ((d.j.v.c) vVar).a;
                Uri.Builder builder3 = new Uri.Builder();
                builder3.appendPath("community_manage");
                builder3.appendEncodedPath("#");
                builder3.appendPath("primary-block-menu-settings");
                builder3.appendQueryParameter("group_id", String.valueOf(userId3));
                builder3.appendQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "reorder");
                cVar.n(userId3, builder3.build().toString());
                return;
            }
            if (!(vVar instanceof d.j.v.e)) {
                throw new NoWhenBranchMatchedException();
            }
            UserId userId4 = ((d.j.v.e) vVar).a;
            Uri.Builder builder4 = new Uri.Builder();
            builder4.appendPath("community_manage");
            builder4.appendEncodedPath("#");
            builder4.appendPath("primary-block-menu-settings");
            builder4.appendQueryParameter("group_id", String.valueOf(userId4));
            cVar.n(userId4, builder4.build().toString());
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(ExtendedCommunityProfile extendedCommunityProfile) {
        dw20 dw20Var;
        tmh tmhVar = this.e.f.g;
        ?? r3 = tmhVar.e;
        v1h v1hVar = new v1h(tmhVar.a(), new vmh(tmhVar, extendedCommunityProfile), tmhVar.c);
        tmhVar.j = v1hVar;
        ArrayList b = v1hVar.b(extendedCommunityProfile);
        zvw zvwVar = tmhVar.f;
        zvwVar.setItems(b);
        tmh.c cVar = tmhVar.new c();
        ww50 v = s200.v(tmhVar.b.a);
        if (v != null) {
            v.S(cVar);
        }
        RecyclerView recyclerView = new RecyclerView(tmhVar.a());
        recyclerView.setFocusable(false);
        recyclerView.setId(R.id.vk_community_recycler_id);
        recyclerView.setAdapter(zvwVar);
        recyclerView.setNestedScrollingEnabled(((Boolean) r3.getValue()).booleanValue());
        tmhVar.a();
        recyclerView.setLayoutManager(new tmh.b());
        we0 we0Var = new we0(b, 3);
        recyclerView.addItemDecoration(new if6.e(we0Var));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        yrn yrnVar = new yrn(R.attr.vk_ui_separator_primary_alpha, e3m.a(R.dimen.divider_width, context));
        yrnVar.n = true;
        yrnVar.m = new jf6(we0Var);
        float f = 16;
        yrnVar.l(iah0.a(f), 0, iah0.a(f), 0);
        recyclerView.addItemDecoration(yrnVar);
        gpu0 gpu0Var = new gpu0(tmhVar.a());
        gpu0Var.j = new umh(tmhVar);
        recyclerView.addItemDecoration(gpu0Var);
        tmhVar.a();
        dw20.b f0 = ((dw20.b) new dw20.b(tmhVar.a(), null).v0(R.string.community_description_about).s(krv0.e(R.drawable.vk_icon_cancel_outline_28, tmhVar.a)).m(R.attr.vk_ui_background_content).D0(recyclerView, false)).f0(new ij8(5, tmhVar, recyclerView));
        if (((Boolean) r3.getValue()).booleanValue()) {
            f0.c(new jgj(recyclerView, 0, 0, 42));
        } else {
            f0.c(new d5j(recyclerView));
        }
        tmhVar.g = f0.Z(new smh(0, tmhVar, cVar)).I0("details_bottom_sheet_tag");
        if (((Boolean) r3.getValue()).booleanValue() && extendedCommunityProfile.V2 != null && (dw20Var = tmhVar.g) != null) {
            g1i g1iVar = new g1i();
            g1i g1iVar2 = tmhVar.k;
            if (g1iVar2 != null) {
                io.reactivex.rxjava3.disposables.c cVar2 = g1iVar2.c;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                io.reactivex.rxjava3.disposables.c cVar3 = g1iVar2.d;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
            }
            tmhVar.k = g1iVar;
            g1iVar.e.a(new j20(8, dw20Var, new m1h(new k1h(m7m.d(dw20Var)))), dw20Var);
            g1iVar.a(extendedCommunityProfile, new hib(v1hVar, extendedCommunityProfile, tmhVar, 2));
        }
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 46, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(bwd0.i(extendedCommunityProfile).b, null, null, new CommonCommunitiesStat$ClickEvent(CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_INFO, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null), 30), 2)).q();
    }

    public final void g(ExtendedCommunityProfile extendedCommunityProfile) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("gid", fkq0.e(extendedCommunityProfile.a.c));
        CommunityProfileFragment communityProfileFragment = this.a;
        bundle.putCharSequence("title", communityProfileFragment.requireContext().getString(R.string.group_members));
        bundle.putInt("type", extendedCommunityProfile.Y);
        bundle.putBoolean("_can_go_back", true);
        bundle.putBoolean("start_from_friends", false);
        bundle.putBoolean("members_is_hidden", (extendedCommunityProfile.x || bwd0.a(extendedCommunityProfile)) ? false : true);
        bundle.putBoolean("has_donut_tab", extendedCommunityProfile.t2 != null && extendedCommunityProfile.a0 >= 2);
        CommonCommunitiesStat$ClickEvent.Source source = CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY;
        bundle.putSerializable("source", source);
        bundle.putSerializable("screen", MobileOfficialAppsCoreNavStat$EventScreen.GROUP);
        new oz50(GroupMembersFragment.class, null, bundle).k(communityProfileFragment.requireContext());
        zah.b(this.b, extendedCommunityProfile.a.c, CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_SUBSCRIBED_LIST, source, null, 24);
    }

    public final void h(ExtendedCommunityProfile extendedCommunityProfile) {
        g2v.c().b().t(this.a.requireContext(), (int) bwd0.i(extendedCommunityProfile).b, null, "community_page", "vkapp_profile_page");
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT;
        zah zahVar = this.b;
        SearchStatsLoggingInfo searchStatsLoggingInfo = zahVar.b;
        if (searchStatsLoggingInfo != null) {
            zahVar.a.a(action, searchStatsLoggingInfo);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(VideoFile videoFile) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
        if (videoFile == null || fragmentActivity == null) {
            return;
        }
        ((ydt0) this.d.n0.getValue()).k(fragmentActivity, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
    }

    public final void j(String str) {
        if (str == null) {
            return;
        }
        maz f = this.d.f();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        maz.c(f, context, str, LaunchContext.A, null, null, 24);
    }

    public final View k(CommunityProfileFragment communityProfileFragment) {
        o1i.a.InterfaceC3433a fo = communityProfileFragment.fo();
        if (fo != null) {
            return ((o1i.a.InterfaceC3433a.C3434a) fo).b;
        }
        if (fo instanceof o1i.a.InterfaceC3433a.b) {
            return ((o1i.a.InterfaceC3433a.b) fo).a;
        }
        if (fo == null) {
            return this.a.getView();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void l(ExtendedCommunityProfile extendedCommunityProfile) {
        maz.c(this.d.f(), this.a.kn(), "https://" + a0a.d + "/audios" + bwd0.i(extendedCommunityProfile), LaunchContext.A, null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(UserId userId) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
        if (fragmentActivity == null) {
            return;
        }
        ClipFeedTab.Profile profile = new ClipFeedTab.Profile(null, userId);
        ynh ynhVar = this.d;
        ClipsRouter clipsRouter = (ClipsRouter) ynhVar.F.getValue();
        zof zofVar = this.h;
        ClipsRouter.b(clipsRouter, fragmentActivity, profile, null, null, null, null, zofVar.H().isEnabled() && zofVar.H().b() && ynhVar.c().e(userId), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    public final void n(UserId userId, String str) {
        this.d.c().j(this.a, userId, (r19 & 4) != 0 ? null : str, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : 999, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void o(String str, int i, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        mrh d = d();
        ((dhc) d.b.Z.getValue()).d(d.a.requireContext(), new ngc(null, MarketCatalogSectionId.ALBUM.h(), userId, null, null, null, null, null, null, null, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.GROUP, commonMarketStat$TypeRefSource, null, null, null, null, true, null, false, false, null, true, 3961, null), Integer.valueOf(i), false, str, 3473379));
    }
}
