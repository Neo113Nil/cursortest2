package com.vk.profile.community.impl.ui.profile.actions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Size;
import android.view.LayoutInflater;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Z3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupAgeMark;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.catalog.MarketCatalogSectionId;
import com.vk.ecomm.market.api.good.router.model.MarketBusinessOnboardingParams;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.lists.ListDataSet;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vk.movika.sdk.base.logic.interactor.m;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;
import com.vk.profile.community.creationonboarding.api.models.CommunityCreationOnboardingFinishArguments;
import com.vk.profile.community.creationonboarding.api.models.CreationOnboardingArguments;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;
import com.vk.profile.community.impl.ui.CommunityAction;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.core.npo.OrganizationModalVariant;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCoownersItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.b0;
import defpackage.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a0a;
import xsna.a2i;
import xsna.av20;
import xsna.b7h;
import xsna.bhh;
import xsna.bvn;
import xsna.bwd0;
import xsna.ci7;
import xsna.cvk;
import xsna.cwh;
import xsna.d920;
import xsna.dhr0;
import xsna.drm0;
import xsna.dw20;
import xsna.e1r0;
import xsna.e3m;
import xsna.e43;
import xsna.e670;
import xsna.egc0;
import xsna.enj;
import xsna.epx;
import xsna.f1w;
import xsna.fkq0;
import xsna.fl4;
import xsna.fnj;
import xsna.fpf0;
import xsna.fvr;
import xsna.g2h;
import xsna.g2v;
import xsna.g5z;
import xsna.g620;
import xsna.gau;
import xsna.god;
import xsna.gpu0;
import xsna.gqh;
import xsna.gzs;
import xsna.h7u0;
import xsna.hn9;
import xsna.i4e;
import xsna.iah0;
import xsna.iax;
import xsna.ikv0;
import xsna.itg0;
import xsna.j5g;
import xsna.ja9;
import xsna.jeq0;
import xsna.kbx0;
import xsna.l7h;
import xsna.lbh;
import xsna.mot0;
import xsna.mrh;
import xsna.myc0;
import xsna.myn;
import xsna.n9p0;
import xsna.nrh;
import xsna.o1i;
import xsna.o2i;
import xsna.oap;
import xsna.oga0;
import xsna.on00;
import xsna.p0e0;
import xsna.p1e;
import xsna.p8;
import xsna.q1i;
import xsna.qg1;
import xsna.qrh;
import xsna.qt0;
import xsna.r1i;
import xsna.r1w;
import xsna.ra;
import xsna.rf3;
import xsna.rk8;
import xsna.rmh;
import xsna.rml0;
import xsna.rp1;
import xsna.rsg0;
import xsna.rz00;
import xsna.s1i;
import xsna.s3q0;
import xsna.sau;
import xsna.su50;
import xsna.sz00;
import xsna.t1i;
import xsna.tzp0;
import xsna.u;
import xsna.u1i;
import xsna.uth;
import xsna.vki0;
import xsna.vrh;
import xsna.vth;
import xsna.wth;
import xsna.wx0;
import xsna.x66;
import xsna.xth;
import xsna.y57;
import xsna.yah;
import xsna.yb1;
import xsna.ydt0;
import xsna.ynh;
import xsna.ysg0;
import xsna.yw5;
import xsna.z1i;
import xsna.z63;

/* compiled from: CommunityProfileSideEffectDelegate.kt */
/* loaded from: classes5.dex */
public final class e {
    public final Context a;
    public final com.vk.profile.community.impl.ui.profile.c b;
    public final wth c;
    public final uth d;
    public final CommunityProfileFragment e;
    public final com.vk.profile.community.impl.ui.profile.b f;
    public final p8 g;
    public final i4e h;
    public final a i;
    public final b j;
    public final c k;

    public e(Context context, com.vk.profile.community.impl.ui.profile.c cVar, wth wthVar, uth uthVar, CommunityProfileFragment communityProfileFragment, yah yahVar, com.vk.profile.community.impl.ui.profile.b bVar, p8 p8Var, i4e i4eVar) {
        this.a = context;
        this.b = cVar;
        this.c = wthVar;
        this.d = uthVar;
        this.e = communityProfileFragment;
        this.f = bVar;
        this.g = p8Var;
        this.h = i4eVar;
        this.i = new a(bVar.d);
        this.j = new b(yahVar);
        this.k = new c(context, cVar, communityProfileFragment, bVar, p8Var);
    }

    public static void a(ikv0.a aVar) {
        Context context = aVar.a;
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            aVar.k = 1;
            aVar.p = Integer.valueOf(iah0.a(48));
        }
    }

    public static void h() {
        cvk.u(R.string.invitation_sent, false);
    }

    public final void b(d.j.l0 l0Var) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        UserId userId = l0Var.a;
        ClipsRouter.c(g620.f().a(), this.b.a.requireContext(), Collections.singletonList(new ClipFeedTab.CoauthorInvitations(userId)), null, null, fpf0.a(ClipFeedTab.CoauthorInvitations.class), null, null, true, null, 1900);
        UiTrackingScreen b = UiTracker.j.b();
        if (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        new god(mobileOfficialAppsCoreNavStat$EventScreen, new MobileOfficialAppsClipsStat$TypeClipCoownersItem(MobileOfficialAppsClipsStat$TypeClipCoownersItem.Type.OPEN_MODAL_COOWNERS, new MobileOfficialAppsClipsStat$TypeClipsClipItem(0, userId.b, null, 4, null))).q();
    }

    public final void c(d.l lVar) {
        iax iaxVar = this.c.b;
        if (epx.f(lVar, d.l.a.a)) {
            iaxVar.c();
        } else if (epx.f(lVar, d.l.b.a)) {
            iaxVar.p();
        } else {
            if (!(lVar instanceof d.l.c)) {
                throw new NoWhenBranchMatchedException();
            }
            iaxVar.a(((d.l.c) lVar).a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v118, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v125, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v202, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v239, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v158, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v163, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v166, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v112, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v152, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v99, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v39, types: [kotlin.collections.EmptyList] */
    public final void d(d dVar) {
        ClipsAuthor clipsAuthor;
        Intent launchIntentForPackage;
        ExtendedUserProfile.a aVar;
        String str;
        ArrayList arrayList;
        dw20.a i;
        int i2 = 1;
        if (!(dVar instanceof d.j)) {
            if (dVar instanceof d.e) {
                e((d.e) dVar);
                return;
            }
            if (dVar instanceof d.f) {
                d.f fVar = (d.f) dVar;
                ysg0<gqh> ysg0Var = this.i.a;
                if (fVar instanceof d.f.b) {
                    ysg0Var.a(new gqh.a(true));
                    return;
                } else {
                    if (!(fVar instanceof d.f.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ysg0Var.a(new gqh.a(false));
                    return;
                }
            }
            if (epx.f(dVar, d.o.a)) {
                j();
                return;
            }
            if (dVar instanceof d.g) {
                this.j.a((d.g) dVar);
                return;
            }
            if (dVar instanceof d.k) {
                f((d.k) dVar);
                return;
            }
            if (epx.f(dVar, d.m.a)) {
                h();
                return;
            }
            if (dVar instanceof d.n) {
                this.h.invoke(((d.n) dVar).a);
                return;
            }
            if (dVar instanceof d.b) {
                g((d.b) dVar);
                return;
            }
            if (dVar instanceof d.l) {
                c((d.l) dVar);
                return;
            }
            if (dVar instanceof d.AbstractC1593d.a) {
                fvr.l(this.a, ((d.AbstractC1593d.a) dVar).a);
                return;
            }
            if (dVar instanceof d.i) {
                this.g.invoke(CommunityProfileAction.n.a.m.b);
                return;
            }
            if (dVar instanceof d.h) {
                this.g.invoke(new CommunityProfileAction.n.c(((d.h) dVar).a));
                return;
            }
            if (epx.f(dVar, d.a.a)) {
                this.f.a().a().c();
                return;
            } else if (dVar instanceof d.j.l0) {
                b((d.j.l0) dVar);
                return;
            } else {
                if (!(dVar instanceof d.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                i((d.c) dVar);
                return;
            }
        }
        c cVar = this.k;
        d.j jVar = (d.j) dVar;
        cVar.getClass();
        int i3 = 4;
        kbx0.c cVar2 = null;
        if (jVar instanceof d.j.b) {
            com.vk.profile.community.impl.ui.profile.c cVar3 = cVar.b;
            ExtendedCommunityProfile extendedCommunityProfile = ((d.j.b) jVar).a;
            o1i b = cVar3.b(extendedCommunityProfile, cVar.c);
            z1i z1iVar = new z1i(extendedCommunityProfile, b, new a2i());
            Context requireContext = cVar3.a.requireContext();
            int f = e3m.f(R.attr.vk_ui_icon_accent, requireContext);
            int f2 = e3m.f(R.attr.vk_ui_text_primary, requireContext);
            ListDataSet listDataSet = new ListDataSet();
            listDataSet.s(extendedCommunityProfile);
            com.vk.profile.community.impl.ui.view.a aVar2 = new com.vk.profile.community.impl.ui.view.a(listDataSet, b, new ra(z1iVar, 27));
            yb1 yb1Var = new yb1(3, z1iVar, requireContext);
            av20.a aVar3 = new av20.a();
            dhr0.a.getClass();
            aVar3.d(R.layout.actions_popup_item, LayoutInflater.from(dhr0.E()));
            aVar3.d = new t1i(requireContext, f2, f);
            aVar3.e = new u1i(yb1Var);
            av20 b2 = aVar3.b();
            vki0 b3 = g5z.b(new r1i(z1iVar, requireContext, null));
            if (b3.hasNext()) {
                Object next = b3.next();
                if (b3.hasNext()) {
                    ArrayList b4 = y57.b(next);
                    while (b3.hasNext()) {
                        b4.add(b3.next());
                    }
                    arrayList = b4;
                } else {
                    arrayList = Collections.singletonList(next);
                }
            } else {
                arrayList = EmptyList.b;
            }
            b2.setItems(arrayList);
            s3q0 s3q0Var = s3q0.a;
            RecyclerView.Adapter[] adapterArr = (RecyclerView.Adapter[]) e43.l(aVar2, b2).toArray(new RecyclerView.Adapter[0]);
            d920 y0 = d920.y0((RecyclerView.Adapter[]) Arrays.copyOf(adapterArr, adapterArr.length));
            dw20.b f0 = new dw20.b(requireContext, null).Z(new q1i(z1iVar, 0)).f0(new qt0(18));
            gpu0 gpu0Var = new gpu0(requireContext);
            gpu0Var.c = R.attr.vk_ui_separator_primary;
            gpu0Var.Ng();
            gpu0Var.e = 0;
            gpu0Var.j = new s1i(0);
            i = f0.l0(gpu0Var).i(y0, (r3 & 2) == 0, false);
            z1iVar.d = ((dw20.b) i).I0("community_settings_actions_menu_tag");
            return;
        }
        if (jVar instanceof d.j.AbstractC1595d) {
            d.j.AbstractC1595d abstractC1595d = (d.j.AbstractC1595d) jVar;
            com.vk.profile.community.impl.ui.profile.c cVar4 = cVar.b;
            CommunityProfileFragment communityProfileFragment = cVar4.a;
            ynh ynhVar = cVar4.d;
            ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType strikeRestrictionType = abstractC1595d.b;
            if (strikeRestrictionType == null ? true : ((o2i) ynhVar.j.getValue()).b(communityProfileFragment.requireContext(), bwd0.i(abstractC1595d.a()), strikeRestrictionType)) {
                if (abstractC1595d instanceof d.j.AbstractC1595d.g) {
                    ((oga0) ynhVar.w.getValue()).g(communityProfileFragment.requireContext(), ((d.j.AbstractC1595d.g) abstractC1595d).c, true);
                    return;
                }
                if (abstractC1595d instanceof d.j.AbstractC1595d.a) {
                    ynhVar.c().j(cVar4.a, fkq0.e(bwd0.i(((d.j.AbstractC1595d.a) abstractC1595d).c)), (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : "chat-create", (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
                    return;
                }
                if (abstractC1595d instanceof d.j.AbstractC1595d.i) {
                    mot0.b(mot0.a.a, communityProfileFragment.requireContext(), bwd0.i(((d.j.AbstractC1595d.i) abstractC1595d).c), 0, PostingCreationEntryPoint.GroupWallButton.toString(), 20);
                    return;
                }
                if (abstractC1595d instanceof d.j.AbstractC1595d.f) {
                    ((su50) ynhVar.z.getValue()).c(bwd0.i(((d.j.AbstractC1595d.f) abstractC1595d).c), MobileOfficialAppsCoreNavStat$EventScreen.GROUP, EmptyList.b).l(communityProfileFragment);
                    return;
                }
                if (abstractC1595d instanceof d.j.AbstractC1595d.c) {
                    ((n9p0) cVar4.d.y.getValue()).a(cVar4.a.requireContext(), fkq0.a(bwd0.i(((d.j.AbstractC1595d.c) abstractC1595d).c)), true);
                    return;
                }
                if (abstractC1595d instanceof d.j.AbstractC1595d.b) {
                    ((p1e) ynhVar.D.getValue()).a(communityProfileFragment.requireContext(), new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLUB_TAB, null, null, false, false, ((d.j.AbstractC1595d.b) abstractC1595d).c.a.c, true, null, 158, null));
                    return;
                }
                if (abstractC1595d instanceof d.j.AbstractC1595d.C1596d) {
                    ((bvn) cVar4.d.J.getValue()).b(cVar4.a.requireContext(), bwd0.i(((d.j.AbstractC1595d.C1596d) abstractC1595d).c), true);
                    return;
                } else if (abstractC1595d instanceof d.j.AbstractC1595d.e) {
                    cVar4.j(((d.j.AbstractC1595d.e) abstractC1595d).d);
                    return;
                } else {
                    if (!(abstractC1595d instanceof d.j.AbstractC1595d.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar4.j(((d.j.AbstractC1595d.h) abstractC1595d).d);
                    return;
                }
            }
            return;
        }
        if (jVar instanceof d.j.c) {
            cVar.b.a(null);
            return;
        }
        if (jVar instanceof d.j.e) {
            rmh rmhVar = (rmh) cVar.b.d.D0.getValue();
            rmhVar.b.a().c(rmhVar.a, new z63(rmhVar, null, "onboarding_2025", 5));
            return;
        }
        if (jVar instanceof d.j.f) {
            com.vk.profile.community.impl.ui.profile.c cVar5 = cVar.b;
            ExtendedCommunityProfile extendedCommunityProfile2 = ((d.j.f) jVar).a;
            if (((com.vk.im.engine.models.c) cVar5.d.s0.getValue()).i()) {
                g2v.c().b().G(cVar5.a.requireContext(), com.vk.dto.common.a.a(bwd0.i(extendedCommunityProfile2)));
                return;
            }
            cVar5.d.c().n(cVar5.a, "https://m." + a0a.d + "/mail?community=" + fkq0.e(bwd0.i(extendedCommunityProfile2)), extendedCommunityProfile2.a.e);
            return;
        }
        if (jVar instanceof d.j.g) {
            xth xthVar = cVar.d.f.c;
            ExtendedCommunityProfile extendedCommunityProfile3 = ((d.j.g) jVar).a;
            Context mo2getContext = xthVar.a.mo2getContext();
            if (mo2getContext == null) {
                return;
            }
            GroupAgeMark groupAgeMark = extendedCommunityProfile3.O2;
            if (groupAgeMark != GroupAgeMark.NO) {
                GroupAgeMark groupAgeMark2 = GroupAgeMark.OVER_16;
                cVar2 = new kbx0.c(extendedCommunityProfile3.O2 == groupAgeMark2 ? R.drawable.vk_icon_16_circle_outline_56 : R.drawable.vk_icon_18_circle_outline_56, groupAgeMark == groupAgeMark2 ? mo2getContext.getString(R.string.community_age_mark_16_title) : mo2getContext.getString(R.string.community_age_mark_18_title), extendedCommunityProfile3.O2 == groupAgeMark2 ? mo2getContext.getString(R.string.community_age_mark_message_16) : mo2getContext.getString(R.string.community_age_mark_message), mo2getContext.getString(R.string.community_age_mark_done), null, true);
            }
            if (cVar2 == null) {
                return;
            }
            xthVar.b.a(xthVar, new l(13), new m(8), cVar2);
            return;
        }
        if (jVar instanceof d.j.a) {
            d.j.a aVar4 = (d.j.a) jVar;
            com.vk.profile.community.impl.ui.profile.c cVar6 = cVar.b;
            Context mo2getContext2 = cVar6.a.mo2getContext();
            if (mo2getContext2 == null || (aVar = aVar4.a.S1) == null || (str = aVar.a) == null) {
                return;
            }
            String str2 = drm0.N(str) ? null : str;
            if (str2 == null) {
                return;
            }
            int i4 = u.h1;
            u.a.a(mo2getContext2, str2, new e0(6, aVar4, cVar6));
            return;
        }
        if (jVar instanceof d.j.h) {
            cVar.q(((d.j.h) jVar).a);
            return;
        }
        if (jVar instanceof d.j.i) {
            d.j.i iVar = (d.j.i) jVar;
            com.vk.profile.community.impl.ui.profile.c cVar7 = cVar.b;
            ExtendedCommunityProfile extendedCommunityProfile4 = iVar.a;
            String str3 = iVar.b;
            ja9 ja9Var = extendedCommunityProfile4.X1;
            if (ja9Var != null) {
                CommunityProfileFragment communityProfileFragment2 = cVar7.a;
                ynh ynhVar2 = cVar7.d;
                Context requireContext2 = communityProfileFragment2.requireContext();
                int i5 = ja9Var.a;
                if (i5 == 0) {
                    p0e0.a(extendedCommunityProfile4.a.c, "email", str3);
                    try {
                        requireContext2.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(ja9Var.e, new StringBuilder("mailto:"))));
                        return;
                    } catch (Throwable unused) {
                        cvk.u(R.string.error_open_app, false);
                        return;
                    }
                }
                if (i5 == 1) {
                    p0e0.a(extendedCommunityProfile4.a.c, NotificationCompat.CATEGORY_CALL, str3);
                    try {
                        requireContext2.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(ja9Var.f, new StringBuilder("tel:"))));
                        return;
                    } catch (Throwable unused2) {
                        cvk.u(R.string.error_open_app, false);
                        return;
                    }
                }
                if (i5 == 2) {
                    p0e0.a(extendedCommunityProfile4.a.c, "vk_call", str3);
                    itg0.i(4, rsg0.y0(new e1r0(ja9Var.c, new String[]{"first_name_dat", "last_name_dat", "photo_base"}), null, null, 3), null, new yw5(requireContext2, ynhVar2, new qg1(1, extendedCommunityProfile4, str3), i2), new ci7(i3));
                    return;
                }
                if (i5 != 3) {
                    if (i5 == 5) {
                        p0e0.a(extendedCommunityProfile4.a.c, "mobile_app", str3);
                        String str4 = ja9Var.i;
                        String queryParameter = str4 == null ? null : Uri.parse(str4).getQueryParameter("id");
                        if (queryParameter == null) {
                            String str5 = ja9Var.i;
                            if (str5 == null) {
                                queryParameter = null;
                            } else {
                                Uri parse = Uri.parse(str5);
                                queryParameter = (String) j5g.b0(parse.getPathSegments().indexOf(MBridgeConstans.DYNAMIC_VIEW_WX_APP) + 1, parse.getPathSegments());
                            }
                        }
                        if (myc0.f(ja9Var.g) && myc0.f(queryParameter)) {
                            launchIntentForPackage = new Intent(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(ja9Var.g)));
                            launchIntentForPackage.setPackage(queryParameter);
                            if (requireContext2.getPackageManager().queryIntentActivities(launchIntentForPackage, 131072).isEmpty()) {
                                launchIntentForPackage = requireContext2.getPackageManager().getLaunchIntentForPackage(queryParameter);
                            }
                        } else {
                            launchIntentForPackage = myc0.f(queryParameter) ? requireContext2.getPackageManager().getLaunchIntentForPackage(queryParameter) : myc0.f(ja9Var.g) ? new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(ja9Var.g)) : null;
                        }
                        if (launchIntentForPackage != null && !requireContext2.getPackageManager().queryIntentActivities(launchIntentForPackage, 131072).isEmpty()) {
                            try {
                                requireContext2.startActivity(launchIntentForPackage);
                                return;
                            } catch (Throwable unused3) {
                                cvk.u(R.string.error_open_app, false);
                            }
                        }
                        if (queryParameter == null) {
                            queryParameter = requireContext2.getPackageName();
                        }
                        gau.e(requireContext2, 4, queryParameter);
                        return;
                    }
                    if (i5 == 6) {
                        p0e0.a(extendedCommunityProfile4.a.c, "community_app", str3);
                        ynhVar2.f().a(requireContext2, "https://" + a0a.d + "/app" + ja9Var.d + '_' + extendedCommunityProfile4.a.c);
                        return;
                    }
                    if (i5 != 7) {
                        return;
                    }
                }
                String str6 = ja9Var.g;
                if (str6 != null) {
                    if (ja9Var.h) {
                        p0e0.a(extendedCommunityProfile4.a.c, "vk_link", str3);
                        ynhVar2.f().a(requireContext2, str6);
                        return;
                    } else {
                        p0e0.a(extendedCommunityProfile4.a.c, "link", str3);
                        ((rk8) ynhVar2.i0.getValue()).f(requireContext2, null, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67104767), str6);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (jVar instanceof d.j.C1597j) {
            com.vk.profile.community.impl.ui.profile.c cVar8 = cVar.b;
            String str7 = ((d.j.C1597j) jVar).a;
            Context B = cVar8.a.B();
            if (B == null) {
                return;
            }
            enj.o(B, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("tel:".concat(str7))), null);
            return;
        }
        if (jVar instanceof d.j.k) {
            cVar.d.f.d.b(((d.j.k) jVar).a);
            return;
        }
        if (jVar instanceof d.j.l) {
            com.vk.profile.community.impl.ui.profile.c cVar9 = cVar.b;
            ExtendedCommunityProfile extendedCommunityProfile5 = ((d.j.l) jVar).a;
            cVar9.b.c(extendedCommunityProfile5, CommunityAction.EDIT_GROUP);
            cVar9.d.c().j(cVar9.a, fkq0.e(extendedCommunityProfile5.a.c), (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : 999, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
            return;
        }
        if (jVar instanceof d.j.m) {
            Context context = cVar.a;
            h7u0.a aVar5 = new h7u0.a(context);
            aVar5.h0(context.getString(R.string.community_author_header_delete_photo_confirm_title));
            aVar5.d0(context.getString(R.string.delete), new x66(i2, cVar, (d.j.m) jVar));
            aVar5.X(context.getString(R.string.cancel), null);
            aVar5.m();
            return;
        }
        if (jVar instanceof d.j.n) {
            d.j.n nVar = (d.j.n) jVar;
            com.vk.profile.community.impl.ui.profile.c cVar10 = cVar.b;
            if (nVar instanceof d.j.n.l) {
                ((oga0) cVar10.d.w.getValue()).g(cVar10.a.requireContext(), ((d.j.n.l) nVar).a, false);
                return;
            }
            if (nVar instanceof d.j.n.k) {
                ((oga0) cVar10.d.w.getValue()).m(cVar10.a.requireContext(), bwd0.i(((d.j.n.k) nVar).a), CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, null);
                return;
            }
            if (nVar instanceof d.j.n.C1598d) {
                d.j.n.C1598d c1598d = (d.j.n.C1598d) nVar;
                ((CommunityChatsComponent) cVar10.d.X0.getValue()).a().a(c1598d.a.a0, cVar10.a.requireContext(), fkq0.e(bwd0.i(c1598d.a)));
                return;
            }
            if (nVar instanceof d.j.n.q) {
                ydt0.y((ydt0) cVar10.d.n0.getValue(), cVar10.a.requireContext(), bwd0.i(((d.j.n.q) nVar).a), "videos_group", null, null, null, null, null, null, Z3.l);
                return;
            }
            if (nVar instanceof d.j.n.p) {
                ((ydt0) cVar10.d.n0.getValue()).A(cVar10.a.requireContext(), (r27 & 2) != 0 ? null : new oap.a(jeq0.g("https://" + a0a.d + "/video/@club" + fkq0.e(bwd0.i(((d.j.n.p) nVar).a)) + "/playlists")), null, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
                return;
            }
            if (nVar instanceof d.j.n.C1599j) {
                ((su50) cVar10.d.z.getValue()).b(bwd0.i(((d.j.n.C1599j) nVar).a), MobileOfficialAppsCoreNavStat$EventScreen.GROUP, false).l(cVar10.a);
                return;
            }
            if (nVar instanceof d.j.n.f) {
                ((n9p0) cVar10.d.y.getValue()).a(cVar10.a.requireContext(), fkq0.a(bwd0.i(((d.j.n.f) nVar).a)), false);
                return;
            }
            if (nVar instanceof d.j.n.c) {
                cVar10.l(((d.j.n.c) nVar).a);
                return;
            }
            if (nVar instanceof d.j.n.b) {
                cVar10.l(((d.j.n.b) nVar).a);
                return;
            }
            if (nVar instanceof d.j.n.e) {
                ExtendedCommunityProfile extendedCommunityProfile6 = ((d.j.n.e) nVar).a;
                UserProfile userProfile = extendedCommunityProfile6.a;
                if (userProfile != null) {
                    Owner l0 = userProfile.l0();
                    HashMap<String, Integer> hashMap = extendedCommunityProfile6.Z0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(hashMap.size()));
                    Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(((Map.Entry) it.next()).getKey(), Long.valueOf(((Number) r8.getValue()).intValue()));
                    }
                    clipsAuthor = new ClipsAuthor(l0, new LinkedHashMap(linkedHashMap), extendedCommunityProfile6.Z, extendedCommunityProfile6.A0, extendedCommunityProfile6.a1, extendedCommunityProfile6.Y, extendedCommunityProfile6.a0, extendedCommunityProfile6.O0, null, 256, null);
                } else {
                    clipsAuthor = null;
                }
                if (clipsAuthor == null) {
                    return;
                }
                ClipsRouter.j((ClipsRouter) cVar10.d.F.getValue(), cVar10.a.requireContext(), new ClipGridParams.Data.Profile(clipsAuthor), (clipsAuthor.h >= 2) && extendedCommunityProfile6.l0, null, null, 56);
                return;
            }
            if (nVar instanceof d.j.n.m) {
                ((fl4) cVar10.d.y0.getValue()).v(cVar10.a.requireContext(), bwd0.i(((d.j.n.m) nVar).a), MusicPlaybackLaunchContext.D);
                return;
            }
            if (nVar instanceof d.j.n.g) {
                ((bvn) cVar10.d.J.getValue()).b(cVar10.a.requireContext(), bwd0.i(((d.j.n.g) nVar).a), false);
                return;
            }
            if (nVar instanceof d.j.n.a) {
                cVar10.d.c().t(cVar10.a.requireContext(), bwd0.i(((d.j.n.a) nVar).a));
                return;
            }
            if (nVar instanceof d.j.n.h) {
                mrh d = cVar10.d();
                d.j.n.h hVar = (d.j.n.h) nVar;
                rml0.a((rml0) d.b.U.getValue(), d.a.requireContext(), hVar.a, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.GROUP, hVar.b, null, null, null, null, false, null, false, false, null, false, 8185, null), 8);
                return;
            } else if (nVar instanceof d.j.n.i) {
                mrh d2 = cVar10.d();
                ((rml0) d2.b.U.getValue()).b(d2.a.requireContext(), ((d.j.n.i) nVar).a);
                return;
            } else if (nVar instanceof d.j.n.C1600n) {
                mrh d3 = cVar10.d();
                d.j.n.C1600n c1600n = (d.j.n.C1600n) nVar;
                com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) d3.b.X.getValue(), d3.a.requireContext(), c1600n.a, null, null, null, false, c1600n.b, null, 296);
                return;
            } else {
                if (!(nVar instanceof d.j.n.o)) {
                    throw new NoWhenBranchMatchedException();
                }
                mrh d4 = cVar10.d();
                com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) d4.b.X.getValue(), d4.a.requireContext(), ((d.j.n.o) nVar).a, null, MarketCatalogSectionId.ALBUM.h(), null, true, null, null, 448);
                return;
            }
        }
        if (jVar instanceof d.j.o) {
            ((cwh) cVar.b.n.getValue()).b();
            return;
        }
        if (jVar instanceof d.j.p) {
            com.vk.profile.community.impl.ui.profile.c cVar11 = cVar.b;
            ExtendedCommunityProfile extendedCommunityProfile7 = ((d.j.p) jVar).a;
            Context mo2getContext3 = cVar11.a.mo2getContext();
            if (mo2getContext3 == null) {
                return;
            }
            com.vk.storycamera.builder.a aVar6 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.COMMUNITY_AVATAR);
            aVar6.E0 = true;
            UserProfile userProfile2 = extendedCommunityProfile7.a;
            aVar6.q(userProfile2.c, userProfile2.e, userProfile2.h);
            if (!cVar11.h.c()) {
                aVar6.h = Collections.singletonList(StoryCameraMode.CLIPS);
            }
            aVar6.C(mo2getContext3);
            g2h g2hVar = new g2h(bwd0.i(extendedCommunityProfile7));
            g2hVar.b = "avatar";
            g2hVar.d = "story";
            g2hVar.a();
            return;
        }
        if (jVar instanceof d.j.q) {
            d.j.q qVar = (d.j.q) jVar;
            com.vk.profile.community.impl.ui.profile.c cVar12 = cVar.b;
            if (qVar instanceof d.j.q.f) {
                d.j.q.f fVar2 = (d.j.q.f) qVar;
                cVar12.d.b().a().c(cVar12.a.requireContext(), new CreationOnboardingArguments(fVar2.b, fVar2.a, fVar2.c, fVar2.f, fVar2.g, fVar2.e, fVar2.d), new bhh(cVar, i2));
                return;
            }
            if (qVar instanceof d.j.q.C1601d) {
                d.j.q.C1601d c1601d = (d.j.q.C1601d) qVar;
                ExtendedCommunityProfile extendedCommunityProfile8 = c1601d.a;
                String str8 = c1601d.b;
                PostingCreationEntryPoint postingCreationEntryPoint = PostingCreationEntryPoint.CommunityCreationOnboardingBlock;
                egc0 egc0Var = (egc0) cVar12.i.invoke(extendedCommunityProfile8);
                egc0Var.v0(egc0Var.Y2(), postingCreationEntryPoint, str8);
                return;
            }
            if (qVar instanceof d.j.q.a) {
                ((p1e) cVar12.d.D.getValue()).a(cVar12.a.requireContext(), new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.COMMUNITY_CREATION_ONBOARDING_BLOCK, null, null, false, false, ((d.j.q.a) qVar).a.a.c, true, null, 158, null));
                return;
            }
            if (qVar instanceof d.j.q.e) {
                cVar12.d.b().a().b(cVar12.a.requireContext(), ((d.j.q.e) qVar).b, new b0(12, cVar, qVar));
                return;
            }
            if (qVar instanceof d.j.q.b) {
                d.j.q.b bVar = (d.j.q.b) qVar;
                cVar12.d.b().a().a(cVar12.a.requireContext(), new CommunityCreationOnboardingFinishArguments(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e));
                return;
            } else {
                if (!(qVar instanceof d.j.q.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                d.j.q.c cVar13 = (d.j.q.c) qVar;
                ((sz00) cVar12.d.V.getValue()).e(cVar12.a.requireContext(), new rz00(cVar13.e, CommonMarketStat$TypeRefSource.COMMUNITY_GOODS, null, null, null, null, null, null, null, null, null, null, null, null, null, new MarketBusinessOnboardingParams(cVar13.a, cVar13.b, cVar13.c, cVar13.d), 32764));
                return;
            }
        }
        if (jVar instanceof d.j.r) {
            cVar.b.b(((d.j.r) jVar).a, cVar.c).f();
            return;
        }
        if (jVar instanceof d.j.s) {
            sau.a aVar7 = new sau.a(cVar.b.a.requireContext(), tzp0.a(null, 3));
            aVar7.I(true);
            int a = iah0.a(8);
            aVar7.n0(a);
            aVar7.p0(a);
            aVar7.o0(a);
            aVar7.m0(a);
            aVar7.x(0);
            aVar7.u(0);
            aVar7.I0(null);
            return;
        }
        if (jVar instanceof d.j.t) {
            cVar.b.e((d.j.t) jVar);
            return;
        }
        if (jVar instanceof d.j.u) {
            com.vk.profile.community.impl.ui.profile.c cVar14 = cVar.b;
            ((CommunityDetailsComponent) cVar14.d.S0.getValue()).a().d(cVar14.a.requireContext(), fkq0.e(bwd0.i(((d.j.u) jVar).a)));
            return;
        }
        if (jVar instanceof d.j.v) {
            cVar.b.e((d.j.v) jVar);
            return;
        }
        if (jVar instanceof d.j.w) {
            cVar.b.b(((d.j.w) jVar).a, cVar.c).i();
            return;
        }
        if (jVar instanceof d.j.x) {
            cVar.u((d.j.x) jVar);
            return;
        }
        if (jVar instanceof d.j.y) {
            cVar.f.a((d.j.y) jVar);
            return;
        }
        if (jVar instanceof d.j.z) {
            cVar.B((d.j.z) jVar);
            return;
        }
        if (jVar instanceof d.j.a0) {
            cVar.v((d.j.a0) jVar);
            return;
        }
        if (jVar instanceof d.j.b0) {
            new e670.a(cVar.b.a.requireContext(), OrganizationModalVariant.NON_PROFIT).I0(null);
            return;
        }
        if (jVar instanceof d.j.c0) {
            com.vk.profile.community.impl.ui.profile.c cVar15 = cVar.b;
            ExtendedCommunityProfile extendedCommunityProfile9 = ((d.j.c0) jVar).a;
            CommunityProfileFragment communityProfileFragment3 = cVar.c;
            o1i.a.InterfaceC3433a fo = communityProfileFragment3.fo();
            if (fo == null) {
                return;
            }
            lbh.a(extendedCommunityProfile9, new vrh(cVar15.b(extendedCommunityProfile9, communityProfileFragment3)), fo);
            return;
        }
        if (jVar instanceof d.j.d0) {
            cVar.b.j(((d.j.d0) jVar).a);
            return;
        }
        if (jVar instanceof d.j.f0) {
            cVar.b((d.j.f0) jVar);
            return;
        }
        if (jVar instanceof d.j.g0) {
            cVar.b.j(((d.j.g0) jVar).a);
            return;
        }
        if (jVar instanceof d.j.e0) {
            cVar.a((d.j.e0) jVar);
            return;
        }
        if (jVar instanceof d.j.h0) {
            cVar.c((d.j.h0) jVar);
            return;
        }
        if (jVar instanceof d.j.i0) {
            cVar.p((d.j.i0) jVar);
            return;
        }
        if (jVar instanceof d.j.k0) {
            cVar.b.j(((d.j.k0) jVar).a);
            return;
        }
        if (jVar instanceof d.j.m0) {
            cVar.d((d.j.m0) jVar);
            return;
        }
        if (jVar instanceof d.j.j0) {
            cVar.e((d.j.j0) jVar);
            return;
        }
        if (jVar instanceof d.j.n0) {
            cVar.b.f(((d.j.n0) jVar).a);
            return;
        }
        if (jVar instanceof d.j.o0) {
            cVar.f((d.j.o0) jVar);
            return;
        }
        if (jVar instanceof d.j.p0) {
            cVar.g((d.j.p0) jVar);
            return;
        }
        if (jVar instanceof d.j.q0) {
            cVar.h((d.j.q0) jVar);
            return;
        }
        if (jVar instanceof d.j.r0) {
            cVar.r((d.j.r0) jVar);
            return;
        }
        if (jVar instanceof d.j.s0) {
            cVar.i((d.j.s0) jVar);
            return;
        }
        if (jVar instanceof d.j.t0) {
            cVar.C((d.j.t0) jVar);
            return;
        }
        if (jVar instanceof d.j.u0) {
            cVar.D((d.j.u0) jVar);
            return;
        }
        if (jVar instanceof d.j.v0) {
            cVar.j((d.j.v0) jVar);
            return;
        }
        if (jVar instanceof d.j.w0) {
            cVar.b.g(null);
            return;
        }
        if (jVar instanceof d.j.x0) {
            cVar.b.h(null);
            return;
        }
        if (jVar instanceof d.j.y0) {
            cVar.E((d.j.y0) jVar);
            return;
        }
        if (jVar instanceof d.j.z0) {
            cVar.k((d.j.z0) jVar);
            return;
        }
        if (jVar instanceof d.j.a1) {
            cVar.l((d.j.a1) jVar);
            return;
        }
        if (jVar instanceof d.j.b1) {
            cVar.m((d.j.b1) jVar);
            return;
        }
        if (jVar instanceof d.j.c1) {
            cVar.n();
            return;
        }
        if (jVar instanceof d.j.d1) {
            cVar.o((d.j.d1) jVar);
            return;
        }
        if (jVar instanceof d.j.e1) {
            return;
        }
        if (jVar instanceof d.j.f1) {
            cVar.w((d.j.f1) jVar);
            return;
        }
        if (jVar instanceof d.j.g1) {
            cVar.y((d.j.g1) jVar);
            return;
        }
        if (jVar instanceof d.j.h1) {
            cVar.t((d.j.h1) jVar);
            return;
        }
        if (jVar instanceof d.j.i1) {
            cVar.z((d.j.i1) jVar);
            return;
        }
        if (jVar instanceof d.j.j1) {
            cVar.A((d.j.j1) jVar);
            return;
        }
        if (jVar instanceof d.j.k1) {
            cVar.x((d.j.k1) jVar);
            return;
        }
        if (jVar instanceof d.j.l1) {
            cVar.s((d.j.l1) jVar);
        } else if (jVar instanceof d.j.m1) {
            cVar.F();
        } else {
            if (!(jVar instanceof d.j.n1)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.G((d.j.n1) jVar);
        }
    }

    public final void e(d.e eVar) {
        boolean z = eVar.b;
        ExtendedCommunityProfile extendedCommunityProfile = eVar.a;
        if (!z) {
            b7h.b(this.c.a, extendedCommunityProfile, null, null, 14);
            return;
        }
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        Context mo2getContext = cVar.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        new l7h(new qrh(cVar.b(extendedCommunityProfile, this.e), 0)).d(mo2getContext);
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(d.k kVar) {
        CommunityProfileDeeplinkParams communityProfileDeeplinkParams;
        boolean z = kVar.b;
        boolean z2 = kVar.c;
        ExtendedCommunityProfile extendedCommunityProfile = kVar.a;
        boolean z3 = kVar.d;
        com.vk.profile.community.impl.ui.profile.b bVar = this.f;
        if (!z) {
            bVar.f.b.c();
        }
        if (!z3) {
            ((cwh) this.b.n.getValue()).g = extendedCommunityProfile.C2;
        }
        if (!z) {
            nrh nrhVar = this.c.c;
            nrhVar.getClass();
            Peer a = com.vk.dto.common.a.a(bwd0.i(extendedCommunityProfile));
            a.getClass();
            if (!a.Ab(Peer.Type.GROUP)) {
                a = null;
            }
            if (nrhVar.a.i() && extendedCommunityProfile.k2 && a != null) {
                ((r1w) nrhVar.c.invoke(a)).e(((f1w) nrhVar.b.invoke(a)).c().g(a), EngineInvalidateSource.UPDATE_COMMUNITY);
            }
        }
        uth uthVar = this.d;
        if (!z && !z2 && !z3 && (communityProfileDeeplinkParams = uthVar.a) != null && communityProfileDeeplinkParams.e) {
            this.g.invoke(CommunityProfileAction.e.i.f.b);
        }
        if (!kVar.b && !z3) {
            String str = uthVar.b;
            if (str != null) {
                bVar.f.e.d(extendedCommunityProfile, str);
                return;
            }
            return;
        }
        if (z2) {
            myn mynVar = bVar.e;
            mynVar.b.clear();
            mynVar.c.set(false);
        }
    }

    public final void g(d.b bVar) {
        Pair pair;
        if (bVar instanceof d.b.a) {
            pair = ((d.b.a) bVar).b ? new Pair(Integer.valueOf(R.string.community_clip_uploaded_with_post_snackbar_title), new com.vk.catalog2.common.ui.holders.b(8, this, bVar)) : new Pair(Integer.valueOf(R.string.community_clip_uploaded_snackbar_title), new com.vk.voip.a(8, this, bVar));
        } else if (bVar instanceof d.b.c) {
            pair = ((d.b.c) bVar).b ? new Pair(Integer.valueOf(R.string.community_video_uploaded_with_post_snackbar_title), new wx0(7, this, bVar)) : new Pair(Integer.valueOf(R.string.community_video_uploaded_snackbar_title), new hn9(7, this, bVar));
        } else {
            if (!(bVar instanceof d.b.C1592b)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(R.string.story_published_success), new rp1(8, this, bVar));
        }
        int intValue = ((Number) pair.d()).intValue();
        gzs gzsVar = (gzs) pair.g();
        Context context = this.a;
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.f.a;
        aVar.u = new ikv0.d(context.getString(intValue), (String) null, (ikv0.d.a) null, 6);
        if (gzsVar != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.community_content_uploaded_snackbar_action), new vth(0, gzsVar));
        }
        aVar.e = 6000L;
        a(aVar);
        aVar.n();
    }

    public final void i(d.c cVar) {
        int i;
        if (cVar instanceof d.c.b) {
            i = R.drawable.vk_icon_check_circle_outline_28;
        } else {
            if (!(cVar instanceof d.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_error_circle_outline_28;
        }
        Context context = this.a;
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(i, Integer.valueOf(cVar.c), (Size) null, 12);
        String string = context.getString(cVar.a);
        Integer num = cVar.b;
        aVar.u = new ikv0.d(string, num != null ? context.getString(num.intValue()) : null, (ikv0.d.a) null, 4);
        a(aVar);
        aVar.n();
    }

    public final void j() {
        Context context = this.a;
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(R.string.community_tabs_settings_applied), (String) null, (ikv0.d.a) null, 6);
        a(aVar);
        aVar.n();
    }
}
