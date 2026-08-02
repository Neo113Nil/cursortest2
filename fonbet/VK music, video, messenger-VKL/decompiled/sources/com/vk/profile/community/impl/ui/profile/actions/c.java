package com.vk.profile.community.impl.ui.profile.actions;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsWarningNotificationDto;
import com.vk.bridges.ImageViewer;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.params.ClipsMediaPickerTab;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.LinksParserData;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.libvideo.autoplay.b;
import com.vk.movika.sdk.base.flow.binding.g;
import com.vk.movika.sdk.base.hooks.k;
import com.vk.movika.sdk.base.ui.l;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPodcastSource;
import com.vk.music.player.StartPlayUserSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;
import com.vk.profile.community.details.api.di.links.data.LinkItemModel;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.scheduled_clips.CommunityScheduledClipsGridFragment;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.a;
import com.vk.profile.community.impl.ui.trust_mark.b;
import com.vk.profile.core.npo.OrganizationModalVariant;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsGridItem;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.t0;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ajg0;
import xsna.bjc;
import xsna.bpn0;
import xsna.bvn;
import xsna.bwd0;
import xsna.c5g;
import xsna.cn70;
import xsna.cpu;
import xsna.cqh;
import xsna.cqm0;
import xsna.cvd0;
import xsna.cwh;
import xsna.dhr0;
import xsna.dsh;
import xsna.e3m;
import xsna.e43;
import xsna.e670;
import xsna.egc0;
import xsna.emh;
import xsna.epx;
import xsna.ew3;
import xsna.fkq0;
import xsna.fl4;
import xsna.fpf0;
import xsna.fsk;
import xsna.g2h;
import xsna.h270;
import xsna.h3p0;
import xsna.hbx0;
import xsna.hmh;
import xsna.ibq;
import xsna.iea0;
import xsna.izs;
import xsna.jnj;
import xsna.jpf;
import xsna.jwn0;
import xsna.k6h;
import xsna.kbx0;
import xsna.kwc;
import xsna.l4i;
import xsna.lqk0;
import xsna.m7m;
import xsna.maz;
import xsna.me10;
import xsna.mrh;
import xsna.n9p0;
import xsna.o0r0;
import xsna.o1i;
import xsna.o25;
import xsna.oga0;
import xsna.orh;
import xsna.p1e;
import xsna.p8;
import xsna.pkd;
import xsna.q40;
import xsna.q9h;
import xsna.qoh;
import xsna.qz00;
import xsna.rl3;
import xsna.rrh;
import xsna.rz00;
import xsna.s3q0;
import xsna.saz;
import xsna.sst0;
import xsna.sz00;
import xsna.t0o;
import xsna.t8q0;
import xsna.taz;
import xsna.tfu0;
import xsna.trh;
import xsna.uc;
import xsna.ucl;
import xsna.urh;
import xsna.uzp0;
import xsna.v0o;
import xsna.vzd0;
import xsna.w2h;
import xsna.wk40;
import xsna.wnr0;
import xsna.wvl0;
import xsna.xqg;
import xsna.xth;
import xsna.xy1;
import xsna.y050;
import xsna.y1z;
import xsna.y2i;
import xsna.yde;
import xsna.ydt0;
import xsna.ynh;
import xsna.zah;
import xsna.zof;

/* compiled from: CommunityProfileNavigationSideEffectDelegate.kt */
/* loaded from: classes5.dex */
public final class c {
    public final Context a;
    public final com.vk.profile.community.impl.ui.profile.c b;
    public final CommunityProfileFragment c;
    public final com.vk.profile.community.impl.ui.profile.b d;
    public final p8 e;
    public final cqh f;

    /* compiled from: CommunityProfileNavigationSideEffectDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnBoardingTaskType.values().length];
            try {
                iArr[OnBoardingTaskType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnBoardingTaskType.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnBoardingTaskType.DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OnBoardingTaskType.CONTACTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OnBoardingTaskType.ACTION_BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OnBoardingTaskType.GOODS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OnBoardingTaskType.SERVICES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OnBoardingTaskType.ADS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityProfileNavigationSideEffectDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<com.vk.profile.community.impl.ui.trust_mark.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.profile.community.impl.ui.trust_mark.b bVar) {
            com.vk.profile.community.impl.ui.trust_mark.b bVar2 = bVar;
            p8 p8Var = ((c) this.receiver).e;
            if (bVar2 instanceof b.C1629b) {
                p8Var.invoke(CommunityProfileAction.e.j.b.b);
            } else if (bVar2 instanceof b.a) {
                p8Var.invoke(new CommunityProfileAction.e.j.a(((b.a) bVar2).a));
            } else {
                if (!(bVar2 instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                p8Var.invoke(new CommunityProfileAction.e.j.c());
            }
            return s3q0.a;
        }
    }

    public c(Context context, com.vk.profile.community.impl.ui.profile.c cVar, CommunityProfileFragment communityProfileFragment, com.vk.profile.community.impl.ui.profile.b bVar, p8 p8Var) {
        this.a = context;
        this.b = cVar;
        this.c = communityProfileFragment;
        this.d = bVar;
        this.e = p8Var;
        this.f = new cqh(cVar, communityProfileFragment, new orh(1, this, c.class, "navigateBack", "navigateBack(Z)V", 0));
    }

    public final void A(d.j.j1 j1Var) {
        ExtendedCommunityProfile extendedCommunityProfile = j1Var.a;
        SearchFeatures searchFeatures = SearchFeatures.SEARCH_INSIDE_COMMUNITY;
        searchFeatures.getClass();
        if (com.vk.toggle.b.A.a(searchFeatures) || !w2h.d(extendedCommunityProfile)) {
            return;
        }
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        cVar.d.c().l(cVar.a.requireContext(), extendedCommunityProfile.a.c);
    }

    public final void B(d.j.z zVar) {
        hbx0 hbx0Var;
        xth xthVar = this.d.f.c;
        ExtendedCommunityProfile extendedCommunityProfile = zVar.a;
        kbx0 kbx0Var = xthVar.b;
        FragmentImpl fragmentImpl = kbx0Var.a;
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext == null || (hbx0Var = extendedCommunityProfile.h2) == null) {
            return;
        }
        ew3 ew3Var = new ew3(kbx0Var, extendedCommunityProfile.a.c, hbx0Var);
        tfu0 tfu0Var = new tfu0(kbx0Var, 6);
        String str = hbx0Var.b;
        String str2 = hbx0Var.d;
        CharSequence d = ((LinksBridgeComponent) m7m.d(fragmentImpl).a(fpf0.a(LinksBridgeComponent.class))).p().a().d(hbx0Var.c, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382));
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        String str3 = hbx0Var.e;
        String str4 = (str3 == null || str3.length() == 0) ? null : str2;
        String str5 = (str3 == null || str3.length() == 0) ? str2 : str3;
        String str6 = hbx0Var.f;
        int i2 = 0;
        if (str6 != null && str6.length() != 0) {
            if (str6.equals(GroupsWarningNotificationDto.IconDto.HIDE_OUTLINE.i())) {
                i2 = R.drawable.vk_icon_hide_outline_56;
            } else {
                try {
                    i2 = mo2getContext.getResources().getIdentifier(String.format("vk_icon_%s_56", Arrays.copyOf(new Object[]{str6}, 1)), "drawable", mo2getContext.getPackageName());
                } catch (Throwable unused) {
                }
            }
        }
        kbx0Var.a(xthVar, ew3Var, tfu0Var, new kbx0.c(i2, str, d, str4, str5, hbx0Var.g));
    }

    public final void C(d.j.t0 t0Var) {
        this.b.e(t0Var);
    }

    public final void D(d.j.u0 u0Var) {
        this.b.j(u0Var.a);
    }

    public final void E(d.j.y0 y0Var) {
        ExtendedCommunityProfile extendedCommunityProfile = y0Var.a;
        PostingCreationEntryPoint postingCreationEntryPoint = PostingCreationEntryPoint.Other;
        egc0 egc0Var = (egc0) this.b.i.invoke(extendedCommunityProfile);
        egc0Var.v0(egc0Var.Y2(), postingCreationEntryPoint, null);
    }

    public final void F() {
        new e670.a(this.b.a.requireContext(), OrganizationModalVariant.VERIFIED_NON_PROFIT).I0(null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void G(d.j.n1 n1Var) {
        ExtendedCommunityProfile extendedCommunityProfile = n1Var.a;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        ((wnr0) cVar.d.f0.getValue()).d(cVar.a.requireContext(), extendedCommunityProfile.a3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(d.j.e0 e0Var) {
        UserId userId = e0Var.a;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        ((q9h) cVar.d.W.getValue()).c(cVar.a.requireContext(), userId);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(d.j.f0 f0Var) {
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        xqg xqgVar = (xqg) cVar.d.v.getValue();
        Context requireContext = cVar.a.requireContext();
        ExtendedCommunityProfile extendedCommunityProfile = f0Var.a;
        xqg.b(xqgVar, requireContext, fkq0.e(extendedCommunityProfile.a.c), extendedCommunityProfile.j, f0Var.b, null, f0Var.c, null, 80);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(d.j.h0 h0Var) {
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        Context mo2getContext = cVar.a.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        Artist artist = h0Var.a;
        wk40.d(((fl4) cVar.d.y0.getValue()).g(), mo2getContext, artist.b, null, jnj.a(artist.m), null, 48);
    }

    public final void d(d.j.m0 m0Var) {
        ModalActionSheetListItem modalActionSheetListItem;
        boolean z = m0Var.b;
        hmh hmhVar = this.b.e.f.h;
        Context context = hmhVar.a;
        a.C0785a c0785a = new a.C0785a();
        ListBuilder e = e43.e();
        if (z) {
            e.add(hmh.a.OpenLiveCover);
        }
        e.add(hmh.a.ChangeCover);
        e.add(hmh.a.DeleteCover);
        ListBuilder g = e.g();
        ArrayList arrayList = new ArrayList(c5g.u(g, 10));
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                c0785a.b = arrayList;
                c0785a.c = new emh(hmhVar, z, 0);
                c0785a.a(context, "cover_action_sheet_tag");
                return;
            }
            hmh.a aVar2 = (hmh.a) aVar.next();
            int i = hmh.b.$EnumSwitchMapping$0[aVar2.ordinal()];
            if (i == 1) {
                modalActionSheetListItem = new ModalActionSheetListItem(aVar2.ordinal(), null, context.getString(R.string.community_cover_action_change), null, null, 0, null, false, false, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            } else if (i == 2) {
                modalActionSheetListItem = new ModalActionSheetListItem(aVar2.ordinal(), ModalActionSheetListItem.Appearance.Negative, context.getString(R.string.community_cover_action_delete), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                modalActionSheetListItem = new ModalActionSheetListItem(aVar2.ordinal(), null, context.getString(R.string.community_live_cover_action_expand), null, null, 0, null, false, false, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            }
            arrayList.add(modalActionSheetListItem);
        }
    }

    public final void e(d.j.j0 j0Var) {
        UserId userId = j0Var.a;
        String str = j0Var.b;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        cVar.d.c().j(cVar.a, fkq0.a(userId), (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : X3.i.G0, (r19 & 16) != 0 ? null : 103, (r19 & 32) != 0 ? null : str, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
    }

    public final void f(d.j.o0 o0Var) {
        this.b.e(o0Var);
    }

    public final void g(d.j.p0 p0Var) {
        Context requireContext = this.b.a.requireContext();
        sst0.b.C3688b c3688b = p0Var.a;
        ExtendedCommunityProfile extendedCommunityProfile = p0Var.b;
        UserProfile userProfile = extendedCommunityProfile != null ? extendedCommunityProfile.a : null;
        String str = c3688b.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String str2 = userProfile != null ? userProfile.e : null;
        String o = userProfile != null ? userProfile.o(cn70.b(56)) : null;
        if (o == null) {
            o = "";
        }
        new t0o.a(requireContext, new v0o(o, context.getString(R.string.profile_photo_accessibility), context.getString(R.string.donut_levels_video_modal_hint_title, str2), c3688b.b ? context.getString(R.string.donut_levels_video_modal_hint_description, str) : context.getString(R.string.donut_levels_and_higher_video_modal_hint_description, str))).I0("DonutModalHintDialog");
    }

    public final void h(d.j.q0 q0Var) {
        this.b.o(q0Var.a, q0Var.b, q0Var.c, q0Var.d);
    }

    public final void i(d.j.s0 s0Var) {
        UserId userId = s0Var.a;
        String str = s0Var.b;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        cVar.d.c().j(cVar.a, fkq0.a(userId), (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : "live-covers", (r19 & 16) != 0 ? null : 102, (r19 & 32) != 0 ? null : str, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
    }

    public final void j(d.j.v0 v0Var) {
        this.e.invoke(new CommunityProfileAction.s(new t8q0(false)));
        String str = v0Var.a;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        maz.c(cVar.d.f(), cVar.a.requireContext(), str, LaunchContext.A, null, null, 24);
    }

    public final void k(d.j.z0 z0Var) {
        this.b.j(z0Var.a);
    }

    public final void l(d.j.a1 a1Var) {
        this.b.j(a1Var.a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(d.j.b1 b1Var) {
        UserId userId;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        Context mo2getContext = cVar.a.mo2getContext();
        if (mo2getContext == null || (userId = b1Var.a.a.c) == null) {
            return;
        }
        me10.b((me10) cVar.d.e0.getValue(), mo2getContext, userId, null, new l(7, cVar, b1Var), 4);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void n() {
        ((jwn0) this.b.d.w0.getValue()).c(this.a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ec A[LOOP:0: B:33:0x01e6->B:35:0x01ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04ec  */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(d.j.d1 d1Var) {
        GroupMarketInfo groupMarketInfo;
        GroupMarketInfo.CommunityTrustMarks communityTrustMarks;
        CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType blockType;
        b bVar;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark;
        Pair pair;
        ArrayList arrayList;
        Iterator it;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark2;
        ArrayList arrayList2;
        int size;
        List<? extends ExtendedUserProfile.Link> list;
        ExtendedCommunityProfile extendedCommunityProfile = d1Var.a;
        b bVar2 = new b(1, this, c.class, "handleOnTrustMarksDialogEvents", "handleOnTrustMarksDialogEvents(Lcom/vk/profile/community/impl/ui/trust_mark/CommunityTrustMarksBottomSheetEvents;)V", 0);
        Context mo2getContext = this.b.a.mo2getContext();
        if (mo2getContext == null || (groupMarketInfo = extendedCommunityProfile.J2) == null || (communityTrustMarks = groupMarketInfo.i) == null) {
            return;
        }
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark3 = communityTrustMarks.b;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code code = communityTrustMark3.b;
        UserId userId = extendedCommunityProfile.a.c;
        switch (l4i.$EnumSwitchMapping$0[code.ordinal()]) {
            case 1:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.VERIFIED_BUSINESS;
                break;
            case 2:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.POPULAR_SHOP;
                break;
            case 3:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.FRIENDS_TRUST_MARK;
                break;
            case 4:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.MANY_YEARS_IN_VK;
                break;
            case 5:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.YC_INTEGRATION;
                break;
            case 6:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.EXTERNAL_INTEGRATION;
                break;
            case 7:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.HAS_DERLIVERY;
                break;
            case 8:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.FREE_DELIVERY;
                break;
            case 9:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.SELF_DELIVERY;
                break;
            case 10:
            case 11:
            case 12:
                blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.BlockType.PURCHASE_INFO;
                break;
            default:
                blockType = null;
                break;
        }
        if (blockType != null) {
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(userId.b), null, null, null, 58, null), CommonCommunitiesStat$TypeCommunitiesClick.a.a(fkq0.a(userId).b, CommonCommunitiesStat$TypeCommunitiesClick.Source.COMMUNITY_HEADER_BLOCK, new CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem(CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.Event.CLICK_COMMUNITY_TRUST_MARKS, blockType)), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
        }
        boolean a2 = w2h.a(extendedCommunityProfile);
        CommunityTrustMarksArgs.TrustMarkData c2 = com.vk.profile.community.impl.ui.trust_mark.d.c(communityTrustMark3, false);
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark4 = communityTrustMarks.v;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark5 = communityTrustMarks.t;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark6 = communityTrustMarks.r;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark7 = communityTrustMarks.p;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark8 = communityTrustMarks.j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = communityTrustMarks.d;
        ArrayList arrayList3 = new ArrayList();
        if (a2) {
            if (communityTrustMark8 == null) {
                CommunityTrustMarksArgs.TrustMarkData.Type type = CommunityTrustMarksArgs.TrustMarkData.Type.DOCS;
                bVar = bVar2;
                arrayList3.add(new CommunityTrustMarksArgs.TrustMarkData(type, mo2getContext.getString(R.string.community_trust_marks_admin_block_docs_title), com.vk.profile.community.impl.ui.trust_mark.d.b(type), null, null, false, null, com.vk.profile.community.impl.ui.trust_mark.d.a(type), mo2getContext.getString(R.string.community_trust_marks_admin_block_docs_description), 120, null));
            } else {
                bVar = bVar2;
            }
            if (communityTrustMark7 == null && communityTrustMark6 == null && z) {
                CommunityTrustMarksArgs.TrustMarkData.Type type2 = CommunityTrustMarksArgs.TrustMarkData.Type.DELIVERY_TEXT;
                arrayList3.add(new CommunityTrustMarksArgs.TrustMarkData(type2, mo2getContext.getString(R.string.community_trust_marks_admin_block_delivery_title), com.vk.profile.community.impl.ui.trust_mark.d.b(type2), null, null, false, null, com.vk.profile.community.impl.ui.trust_mark.d.a(type2), null, 376, null));
            }
            if (communityTrustMark5 == null && z) {
                CommunityTrustMarksArgs.TrustMarkData.Type type3 = CommunityTrustMarksArgs.TrustMarkData.Type.PAYMENT_TEXT;
                arrayList3.add(new CommunityTrustMarksArgs.TrustMarkData(type3, mo2getContext.getString(R.string.community_trust_marks_admin_block_payment_title), com.vk.profile.community.impl.ui.trust_mark.d.b(type3), null, null, false, null, com.vk.profile.community.impl.ui.trust_mark.d.a(type3), null, 376, null));
            }
            if (communityTrustMark4 == null && z) {
                CommunityTrustMarksArgs.TrustMarkData.Type type4 = CommunityTrustMarksArgs.TrustMarkData.Type.REFUND;
                arrayList3.add(new CommunityTrustMarksArgs.TrustMarkData(type4, mo2getContext.getString(R.string.community_trust_marks_admin_block_refund_title), com.vk.profile.community.impl.ui.trust_mark.d.b(type4), null, null, false, null, com.vk.profile.community.impl.ui.trust_mark.d.a(type4), null, 376, null));
            }
            if (!arrayList3.isEmpty()) {
                communityTrustMark = communityTrustMark4;
                pair = new Pair(new CommunityTrustMarksArgs.GroupInfo(null, true, false, false, false, false, null, 125, null), arrayList3);
                if (pair != null) {
                }
                List I = rl3.I(new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark[]{communityTrustMark8, communityTrustMarks.k, communityTrustMarks.l, communityTrustMarks.m, communityTrustMarks.w});
                arrayList = new ArrayList(c5g.u(I, 10));
                it = I.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.vk.profile.community.impl.ui.trust_mark.d.c((GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark) it.next(), false));
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(new CommunityTrustMarksArgs.GroupInfo(mo2getContext.getString(R.string.community_trust_marks_about_the_store_header), false, false, false, false, false, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), arrayList);
                }
                communityTrustMark2 = communityTrustMarks.x;
                if (communityTrustMark2 != null || (list = communityTrustMark2.f) == null) {
                    arrayList2 = null;
                } else {
                    List<? extends ExtendedUserProfile.Link> list2 = list;
                    arrayList2 = new ArrayList(c5g.u(list2, 10));
                    for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                        ExtendedUserProfile.Link link = (ExtendedUserProfile.Link) it2.next();
                        arrayList2.add(new CommunityTrustMarksArgs.TrustMarkData(CommunityTrustMarksArgs.TrustMarkData.Type.LINKS, link.c, null, link.e, link.b, false, null, null, link.d, 228, null));
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    CommunityTrustMarksArgs.GroupInfo groupInfo = new CommunityTrustMarksArgs.GroupInfo(mo2getContext.getString(R.string.community_trust_marks_links_header), false, false, false, false, arrayList2.size() <= 2, Integer.valueOf(arrayList2.size()), 30, null);
                    size = arrayList2.size();
                    ArrayList arrayList4 = arrayList2;
                    if (size > 1) {
                        arrayList4 = arrayList2.subList(0, 2);
                    }
                    linkedHashMap.put(groupInfo, arrayList4);
                }
                if (communityTrustMarks.n != null) {
                    CommunityTrustMarksArgs.TrustMarkData.Type type5 = CommunityTrustMarksArgs.TrustMarkData.Type.YCLIENTS_SERVICE;
                    CommunityTrustMarksArgs.TrustMarkData trustMarkData = new CommunityTrustMarksArgs.TrustMarkData(type5, mo2getContext.getString(R.string.community_trust_marks_yclinets_terms_service_title), com.vk.profile.community.impl.ui.trust_mark.d.b(type5), null, null, false, null, com.vk.profile.community.impl.ui.trust_mark.d.a(type5), null, 376, null);
                    CommunityTrustMarksArgs.TrustMarkData.Type type6 = CommunityTrustMarksArgs.TrustMarkData.Type.YCLIENTS_DATE;
                }
                if (communityTrustMarks.o != null) {
                    CommunityTrustMarksArgs.TrustMarkData.Type type7 = CommunityTrustMarksArgs.TrustMarkData.Type.OZON_ORDER;
                    CommunityTrustMarksArgs.TrustMarkData trustMarkData2 = new CommunityTrustMarksArgs.TrustMarkData(type7, mo2getContext.getString(R.string.community_trust_marks_ozon_terms_order_title), com.vk.profile.community.impl.ui.trust_mark.d.b(type7), null, null, false, null, com.vk.profile.community.impl.ui.trust_mark.d.a(type7), null, 376, null);
                    CommunityTrustMarksArgs.TrustMarkData.Type type8 = CommunityTrustMarksArgs.TrustMarkData.Type.OZON_PAYMENT;
                    CommunityTrustMarksArgs.TrustMarkData trustMarkData3 = new CommunityTrustMarksArgs.TrustMarkData(type8, mo2getContext.getString(R.string.community_trust_marks_ozon_terms_payment_title), com.vk.profile.community.impl.ui.trust_mark.d.b(type8), null, null, false, null, com.vk.profile.community.impl.ui.trust_mark.d.a(type8), null, 376, null);
                    CommunityTrustMarksArgs.TrustMarkData.Type type9 = CommunityTrustMarksArgs.TrustMarkData.Type.OZON_DELIVERY;
                }
                if (!rl3.I(new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark[]{communityTrustMarks.p, communityTrustMarks.r, communityTrustMarks.s, communityTrustMarks.t, communityTrustMarks.u, communityTrustMarks.v}).isEmpty()) {
                    List I2 = rl3.I(new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark[]{communityTrustMark7, communityTrustMark6, communityTrustMarks.s});
                    ArrayList arrayList5 = new ArrayList(c5g.u(I2, 10));
                    Iterator it3 = I2.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(com.vk.profile.community.impl.ui.trust_mark.d.c((GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark) it3.next(), communityTrustMarks.f));
                    }
                    List I3 = rl3.I(new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark[]{communityTrustMark5, communityTrustMarks.u});
                    ArrayList arrayList6 = new ArrayList(c5g.u(I3, 10));
                    Iterator it4 = I3.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(com.vk.profile.community.impl.ui.trust_mark.d.c((GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark) it4.next(), false));
                    }
                    List m = e43.m(communityTrustMark);
                    ArrayList arrayList7 = new ArrayList(c5g.u(m, 10));
                    Iterator it5 = m.iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(com.vk.profile.community.impl.ui.trust_mark.d.c((GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark) it5.next(), false));
                    }
                    linkedHashMap.put(new CommunityTrustMarksArgs.GroupInfo(mo2getContext.getString(R.string.community_trust_marks_vk_terms_header), false, false, false, arrayList6.isEmpty() && arrayList7.isEmpty(), false, null, 110, null), arrayList5);
                    if (!arrayList6.isEmpty()) {
                        linkedHashMap.put(new CommunityTrustMarksArgs.GroupInfo(mo2getContext.getString(R.string.community_trust_marks_payment_terms_header), false, false, false, arrayList7.isEmpty(), false, null, 98, null), arrayList6);
                    }
                    if (!arrayList7.isEmpty()) {
                        linkedHashMap.put(new CommunityTrustMarksArgs.GroupInfo(mo2getContext.getString(R.string.community_trust_marks_refund_terms_header), false, false, false, false, false, null, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, null), arrayList7);
                    }
                }
                new a.C1628a(mo2getContext, extendedCommunityProfile, bVar, new CommunityTrustMarksArgs(a2, c2, linkedHashMap, new CommunityTrustMarksArgs.AdminButtons(communityTrustMarks.g, communityTrustMarks.h, communityTrustMarks.i), !communityTrustMarks.c ? new CommunityTrustMarksArgs.ActionButton(CommunityTrustMarksArgs.ActionButton.Type.YCLIENTS, R.string.community_trust_marks_yclients_button) : null, !z ? new CommunityTrustMarksArgs.ActionButton(CommunityTrustMarksArgs.ActionButton.Type.GOODS, R.string.community_trust_marks_good_button) : null, !communityTrustMarks.e ? new CommunityTrustMarksArgs.ActionButton(CommunityTrustMarksArgs.ActionButton.Type.SERVICES, R.string.community_trust_marks_service_button) : null), new urh(null, false)).I0(null);
            }
        } else {
            bVar = bVar2;
        }
        communityTrustMark = communityTrustMark4;
        pair = null;
        if (pair != null) {
        }
        List I4 = rl3.I(new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark[]{communityTrustMark8, communityTrustMarks.k, communityTrustMarks.l, communityTrustMarks.m, communityTrustMarks.w});
        arrayList = new ArrayList(c5g.u(I4, 10));
        it = I4.iterator();
        while (it.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        communityTrustMark2 = communityTrustMarks.x;
        if (communityTrustMark2 != null) {
        }
        arrayList2 = null;
        if (arrayList2 != null) {
            CommunityTrustMarksArgs.GroupInfo groupInfo2 = new CommunityTrustMarksArgs.GroupInfo(mo2getContext.getString(R.string.community_trust_marks_links_header), false, false, false, false, arrayList2.size() <= 2, Integer.valueOf(arrayList2.size()), 30, null);
            size = arrayList2.size();
            ArrayList arrayList42 = arrayList2;
            if (size > 1) {
            }
            linkedHashMap.put(groupInfo2, arrayList42);
        }
        if (communityTrustMarks.n != null) {
        }
        if (communityTrustMarks.o != null) {
        }
        if (!rl3.I(new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark[]{communityTrustMarks.p, communityTrustMarks.r, communityTrustMarks.s, communityTrustMarks.t, communityTrustMarks.u, communityTrustMarks.v}).isEmpty()) {
        }
        new a.C1628a(mo2getContext, extendedCommunityProfile, bVar, new CommunityTrustMarksArgs(a2, c2, linkedHashMap, new CommunityTrustMarksArgs.AdminButtons(communityTrustMarks.g, communityTrustMarks.h, communityTrustMarks.i), !communityTrustMarks.c ? new CommunityTrustMarksArgs.ActionButton(CommunityTrustMarksArgs.ActionButton.Type.YCLIENTS, R.string.community_trust_marks_yclients_button) : null, !z ? new CommunityTrustMarksArgs.ActionButton(CommunityTrustMarksArgs.ActionButton.Type.GOODS, R.string.community_trust_marks_good_button) : null, !communityTrustMarks.e ? new CommunityTrustMarksArgs.ActionButton(CommunityTrustMarksArgs.ActionButton.Type.SERVICES, R.string.community_trust_marks_service_button) : null), new urh(null, false)).I0(null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void p(d.j.i0 i0Var) {
        UserId userId;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        Context mo2getContext = cVar.a.mo2getContext();
        if (mo2getContext == null || (userId = i0Var.a.a.c) == null) {
            return;
        }
        ((com.vk.ecomm.avito.api.a) cVar.d.u.getValue()).a(mo2getContext, userId, i0Var.b, new g(10, cVar, i0Var));
    }

    public final void q(boolean z) {
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        CommunityProfileFragment communityProfileFragment = cVar.a;
        if (((Boolean) cVar.g.invoke()).booleanValue()) {
            return;
        }
        if (!z) {
            h3p0.b(communityProfileFragment);
            return;
        }
        FragmentActivity activity = communityProfileFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    public final void r(d.j.r0 r0Var) {
        cvd0.f fVar;
        boolean z;
        int i;
        boolean z2;
        UserId userId;
        int i2;
        ImageViewer.c<Photo> g;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        com.vk.profile.community.impl.ui.profile.b bVar = cVar.e;
        ynh ynhVar = cVar.d;
        CommunityProfileFragment communityProfileFragment = cVar.a;
        boolean z3 = true;
        if (r0Var instanceof d.j.r0.o) {
            d.j.r0.o oVar = (d.j.r0.o) r0Var;
            iea0 iea0Var = oVar.a;
            Photo photo = oVar.b;
            WeakReference<View> weakReference = oVar.c;
            int i3 = oVar.d;
            ExtendedCommunityProfile extendedCommunityProfile = oVar.e;
            int i4 = iea0Var.b;
            cvd0.d dVar = iea0Var.j;
            List list = dVar != null ? dVar.a : null;
            if (list == null) {
                list = EmptyList.b;
            }
            Iterator it = list.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                } else if (((Photo) it.next()).c == photo.c) {
                    break;
                } else {
                    i5++;
                }
            }
            int i6 = i5 == -1 ? 0 : i5;
            dsh dshVar = new dsh(list.size(), iea0Var.p, i4, new jpf(weakReference, 4), i3, new yde(extendedCommunityProfile, 1));
            g = ((ImageViewer) ynhVar.Q0.getValue()).g(i6, list, communityProfileFragment.requireContext(), dshVar, o25.a().c());
            dshVar.h = g;
            return;
        }
        if (r0Var instanceof d.j.r0.p) {
            oga0.a((oga0) ynhVar.w.getValue(), communityProfileFragment.requireContext(), ((d.j.r0.p) r0Var).a, null, 12);
            return;
        }
        if (r0Var instanceof d.j.r0.C1602d) {
            ynhVar.c().i(communityProfileFragment.requireContext(), ((d.j.r0.C1602d) r0Var).a.e);
            return;
        }
        if (r0Var instanceof d.j.r0.v) {
            ydt0.e((ydt0) ynhVar.n0.getValue(), communityProfileFragment.kn(), ((d.j.r0.v) r0Var).a, null, null, 28);
            return;
        }
        if (r0Var instanceof d.j.r0.u) {
            d.j.r0.u uVar = (d.j.r0.u) r0Var;
            uc ucVar = uVar.b;
            VideoFile videoFile = uVar.a;
            ucVar.w("COMMUNITY_VIDEO_TAB".toLowerCase(Locale.ROOT));
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            ucVar.k(videoFile, b.C1208b.a().e(videoFile, null), com.vk.libvideo.autoplay.a.t);
            uc.r(ucVar, communityProfileFragment.kn(), true, null, null, null, null, 252);
            return;
        }
        if (r0Var instanceof d.j.r0.n) {
            d.j.r0.n nVar = (d.j.r0.n) r0Var;
            String M = fsk.M(nVar.b.b);
            StoryViewerRouter storyViewerRouter = (StoryViewerRouter) ynhVar.n.getValue();
            FragmentActivity kn = communityProfileFragment.kn();
            List<Narrative> list2 = nVar.a;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new HighlightStoriesContainer((Narrative) it2.next(), 0, 2, null));
            }
            storyViewerRouter.h(kn, arrayList, M, null, (r42 & 16) != 0, MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SECTION, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE), null, (r42 & 512) != 0 ? null : null, new k(nVar, 17), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : new ucl(), (65536 & r42) != 0 ? null : new rrh(), (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
            return;
        }
        if (r0Var instanceof d.j.r0.g) {
            d.j.r0.g gVar = (d.j.r0.g) r0Var;
            ((n9p0) ynhVar.y.getValue()).b(gVar.a, 0, communityProfileFragment.requireContext(), fkq0.a(bwd0.i(gVar.b)), new trh());
            return;
        }
        if (r0Var instanceof d.j.r0.b) {
            d.j.r0.b bVar2 = (d.j.r0.b) r0Var;
            List<MusicTrack> list3 = bVar2.c;
            if (list3 != null) {
                int indexOf = list3.indexOf(bVar2.a);
                Integer valueOf = indexOf != -1 ? Integer.valueOf(indexOf) : null;
                if (valueOf != null) {
                    i2 = valueOf.intValue() + 1;
                    bVar.b.N0(new lqk0(new StartPlayUserSource(bVar2.b, i2), bVar2.a, list3, MusicPlaybackLaunchContext.k, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
                    return;
                }
            }
            i2 = 0;
            bVar.b.N0(new lqk0(new StartPlayUserSource(bVar2.b, i2), bVar2.a, list3, MusicPlaybackLaunchContext.k, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
            return;
        }
        if (r0Var instanceof d.j.r0.c) {
            ((fl4) ynhVar.y0.getValue()).U().a(communityProfileFragment.kn(), new y050.b.a(((d.j.r0.c) r0Var).a, MusicPlaybackLaunchContext.k.t(), null, null, null, 28));
            return;
        }
        if (r0Var instanceof d.j.r0.e) {
            d.j.r0.e eVar = (d.j.r0.e) r0Var;
            ExtendedCommunityProfile extendedCommunityProfile2 = eVar.d;
            zof zofVar = cVar.h;
            Clips clips = eVar.a;
            VideoFile videoFile2 = eVar.b;
            Iterator<T> it3 = extendedCommunityProfile2.D2.a.iterator();
            while (it3.hasNext() && !(((ibq.b) it3.next()) instanceof ibq.a)) {
            }
            WeakReference<View> weakReference2 = eVar.c;
            View view = weakReference2 != null ? weakReference2.get() : null;
            VkImage vkImage = view instanceof VkImage ? (VkImage) view : null;
            if (vkImage == null || (fVar = clips.j) == null) {
                return;
            }
            ArrayList arrayList2 = fVar.a;
            Iterator it4 = arrayList2.iterator();
            int i7 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    z = z3;
                    i = -1;
                    break;
                }
                z = z3;
                if (epx.f(((VideoFile) it4.next()).r1(), videoFile2.r1())) {
                    i = i7;
                    break;
                } else {
                    i7++;
                    z3 = z;
                }
            }
            if (i == -1) {
                return;
            }
            ClipFeedTab.Profile profile = new ClipFeedTab.Profile(null, extendedCommunityProfile2.a.c);
            h270 h270Var = new h270(vkImage, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, 252);
            bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
            h270Var.k(videoFile2, b.C1208b.a().e(videoFile2, null), com.vk.libvideo.autoplay.a.t);
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                arrayList3.add(((pkd) ynhVar.P0.getValue()).e0().c((VideoFile) it5.next()));
            }
            String str = clips.p;
            kwc kwcVar = new kwc(arrayList3, (str == null || str.length() == 0 || str.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str), i);
            ClipsRouter clipsRouter = (ClipsRouter) ynhVar.F.getValue();
            Context requireContext = communityProfileFragment.requireContext();
            if (zofVar.H().isEnabled() && zofVar.H().b()) {
                cpu c = ynhVar.c();
                UserProfile userProfile = extendedCommunityProfile2.a;
                if (userProfile == null || (userId = userProfile.c) == null) {
                    userId = UserId.d;
                }
                if (c.e(userId)) {
                    z2 = z;
                    ClipsRouter.b(clipsRouter, requireContext, profile, h270Var, kwcVar, null, null, z2, 112);
                    return;
                }
            }
            z2 = false;
            ClipsRouter.b(clipsRouter, requireContext, profile, h270Var, kwcVar, null, null, z2, 112);
            return;
        }
        if (r0Var instanceof d.j.r0.f) {
            ClipsPlaylist clipsPlaylist = ((d.j.r0.f) r0Var).a;
            ClipsRouter.c((ClipsRouter) ynhVar.F.getValue(), communityProfileFragment.requireContext(), Collections.singletonList(new ClipFeedTab.Playlist.FromBeginning(clipsPlaylist)), null, null, fpf0.a(ClipFeedTab.Playlist.FromBeginning.class), null, null, true, null, 1900);
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIPS_PLAYLIST, Long.valueOf(clipsPlaylist.b), Long.valueOf(clipsPlaylist.f.b), null, null, null, 56, null), new MobileOfficialAppsClipsStat$TypeClipsGridItem(MobileOfficialAppsClipsStat$TypeClipsGridItem.EventType.CLICK_TO_PLAYLIST, MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_COMMUNITY, null, null, null, 28, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b2, uzp0Var.a).q();
            return;
        }
        if (r0Var instanceof d.j.r0.q) {
            d.j.r0.q qVar = (d.j.r0.q) r0Var;
            UserId userId2 = qVar.c;
            List list4 = qVar.b;
            if (list4 == null) {
                list4 = EmptyList.b;
            }
            int indexOf2 = list4.indexOf(qVar.a);
            Integer valueOf2 = indexOf2 != -1 ? Integer.valueOf(indexOf2) : null;
            bVar.b.N0(new lqk0(new StartPlayPodcastSource(userId2, valueOf2 != null ? valueOf2.intValue() + 1 : 0), qVar.a, list4, MusicPlaybackLaunchContext.D.Eb(64), 0, ShuffleMode.SHUFFLE_OFF, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 944));
            return;
        }
        if (r0Var instanceof d.j.r0.h) {
            ((bvn) ynhVar.J.getValue()).c(communityProfileFragment.kn(), ((d.j.r0.h) r0Var).a);
            return;
        }
        if (r0Var instanceof d.j.r0.a) {
            String str2 = ((d.j.r0.a) r0Var).a.i;
            if (str2 == null) {
                return;
            }
            maz.c(ynhVar.f(), communityProfileFragment.requireContext(), str2, LaunchContext.A, null, null, 24);
            return;
        }
        if (r0Var instanceof d.j.r0.k) {
            mrh d = cVar.d();
            d.j.r0.k kVar = (d.j.r0.k) r0Var;
            ((sz00) d.b.V.getValue()).e(d.a.requireContext(), new rz00(kVar.a, kVar.b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532));
            return;
        }
        if (r0Var instanceof d.j.r0.l) {
            mrh d2 = cVar.d();
            d.j.r0.l lVar = (d.j.r0.l) r0Var;
            ((sz00) d2.b.V.getValue()).d(d2.a.requireContext(), new qz00(lVar.a, lVar.b, lVar.c, null, null, null, null, null, null, null, null, null, null, 1048568));
            return;
        }
        if (r0Var instanceof d.j.r0.m) {
            GoodAlbum goodAlbum = ((d.j.r0.m) r0Var).a;
            cVar.o(goodAlbum.d, goodAlbum.b, goodAlbum.c, null);
            return;
        }
        if (r0Var instanceof d.j.r0.s) {
            mrh d3 = cVar.d();
            d.j.r0.s sVar = (d.j.r0.s) r0Var;
            ((sz00) d3.b.V.getValue()).d(d3.a.requireContext(), new qz00(sVar.a, sVar.b, sVar.c, null, null, null, null, null, null, null, null, null, null, 1048568));
            return;
        }
        if (r0Var instanceof d.j.r0.t) {
            mrh d4 = cVar.d();
            com.vk.ecomm.storefrontservices.api.a aVar = (com.vk.ecomm.storefrontservices.api.a) d4.b.X.getValue();
            Context requireContext2 = d4.a.requireContext();
            GoodAlbum goodAlbum2 = ((d.j.r0.t) r0Var).a;
            com.vk.ecomm.storefrontservices.api.a.a(aVar, requireContext2, goodAlbum2.c, Integer.valueOf(goodAlbum2.b), null, goodAlbum2.d, false, null, null, 488);
            return;
        }
        if (r0Var instanceof d.j.r0.C1603j) {
            ((o0r0) ynhVar.M0.getValue()).m(communityProfileFragment.requireContext(), fkq0.e(fkq0.a(((d.j.r0.C1603j) r0Var).a.c)), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            return;
        }
        if (r0Var instanceof d.j.r0.i) {
            ((p1e) ynhVar.D.getValue()).a(communityProfileFragment.requireContext(), new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER, null, null, false, false, ((d.j.r0.i) r0Var).a, false, ClipsMediaPickerTab.Drafts, 94, null));
            return;
        }
        if (!(r0Var instanceof d.j.r0.r)) {
            throw new NoWhenBranchMatchedException();
        }
        UserId userId3 = ((d.j.r0.r) r0Var).a;
        CommunityScheduledClipsGridFragment.a aVar2 = new CommunityScheduledClipsGridFragment.a(CommunityScheduledClipsGridFragment.class, null, null);
        boolean c3 = dhr0.a.c(communityProfileFragment.requireContext());
        Bundle bundle = aVar2.j;
        bundle.putBoolean("CommunityScheduledClipsGridFragment.force_dark_theme", c3);
        bundle.putParcelable("CommunityScheduledClipsGridFragment.user_id", userId3);
        aVar2.l(communityProfileFragment);
    }

    public final void s(d.j.l1 l1Var) {
        UserId userId = l1Var.a;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        cVar.d.c().j(cVar.a, fkq0.e(userId), (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : "tabs-settings", (r19 & 16) != 0 ? null : 101, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
    }

    public final void t(d.j.h1 h1Var) {
        UserId userId = h1Var.a;
        boolean z = h1Var.b;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        ((k6h) cVar.d.h.getValue()).b(cVar.a.requireContext(), userId, z);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void u(d.j.x xVar) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        ExtendedCommunityProfile extendedCommunityProfile = xVar.a;
        boolean z = xVar.b;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        qoh qohVar = cVar.l;
        CommunityProfileFragment communityProfileFragment = this.c;
        o1i.a.InterfaceC3433a fo = communityProfileFragment.fo();
        if (fo != null) {
            o1i.a.InterfaceC3433a.C3434a c3434a = (o1i.a.InterfaceC3433a.C3434a) fo;
            xy1.a aVar = new xy1.a(c3434a.a, c3434a.b);
            y2i y2iVar = (y2i) cVar.d.W0.getValue();
            o1i b2 = cVar.b(extendedCommunityProfile, communityProfileFragment);
            UiTracker uiTracker = UiTracker.a;
            String name = UiTracker.c().name();
            String str = qohVar.c;
            if (str == null) {
                UiTrackingScreen b3 = UiTracker.j.b();
                str = (b3 == null || (mobileOfficialAppsCoreNavStat$EventScreen = b3.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name();
            }
            String h = FullSourceJoinApi.SourceType.COMMUNITY_NAVBAR.h();
            String str2 = qohVar.a;
            FullSourceJoinApi.EntryServiceType entryServiceType = qohVar.b;
            String i = entryServiceType != null ? entryServiceType.i() : null;
            y2iVar.a(extendedCommunityProfile, b2, aVar, z, new FullSourceJoinApi(cqm0.m(name), str != null ? cqm0.m(str) : null, h != null ? cqm0.m(h) : null, str2 != null ? cqm0.m(str2) : null, i != null ? cqm0.m(i) : null, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.w1h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final void v(d.j.a0 a0Var) {
        ?? r2;
        GroupMarketInfo.CommunityTrustMarks communityTrustMarks;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark;
        List<? extends ExtendedUserProfile.Link> list;
        ExtendedCommunityProfile extendedCommunityProfile = a0Var.a;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        ?? a2 = ((CommunityDetailsComponent) cVar.d.S0.getValue()).a();
        Context requireContext = cVar.a.requireContext();
        GroupMarketInfo groupMarketInfo = extendedCommunityProfile.J2;
        if (groupMarketInfo == null || (communityTrustMarks = groupMarketInfo.i) == null || (communityTrustMark = communityTrustMarks.x) == null || (list = communityTrustMark.f) == null) {
            r2 = EmptyList.b;
        } else {
            List<? extends ExtendedUserProfile.Link> list2 = list;
            r2 = new ArrayList(c5g.u(list2, 10));
            for (ExtendedUserProfile.Link link : list2) {
                r2.add(new LinkItemModel(UUID.randomUUID(), link.b, link.e, link.c, link.d));
            }
        }
        a2.a(requireContext, r2);
    }

    public final void w(d.j.f1 f1Var) {
        ExtendedCommunityProfile extendedCommunityProfile = f1Var.a;
        if (bwd0.c(extendedCommunityProfile)) {
            return;
        }
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        cVar.e.f.b.b(cVar.a.requireContext(), extendedCommunityProfile);
    }

    public final void x(d.j.k1 k1Var) {
        int i;
        Activity h;
        ExtendedCommunityProfile extendedCommunityProfile = k1Var.a;
        final vzd0 vzd0Var = k1Var.b;
        View view = k1Var.c;
        String str = k1Var.d;
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        ynh ynhVar = cVar.d;
        ArrayList<StoriesContainer> arrayList = extendedCommunityProfile.v1;
        if (arrayList.isEmpty()) {
            return;
        }
        StoriesContainer storiesContainer = arrayList.get(0);
        if (((wvl0) ynhVar.m.getValue()).e(storiesContainer.Ob(), arrayList) != null) {
            zah zahVar = cVar.b;
            MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_STORIES_OUT;
            SearchStatsLoggingInfo searchStatsLoggingInfo = zahVar.b;
            if (searchStatsLoggingInfo != null) {
                zahVar.a.a(action, searchStatsLoggingInfo);
            }
            vzd0Var.b();
            Context mo2getContext = cVar.a.mo2getContext();
            if (mo2getContext == null || (h = e3m.h(mo2getContext)) == null) {
                i = 0;
            } else {
                StoryViewerRouter storyViewerRouter = (StoryViewerRouter) ynhVar.n.getValue();
                String Ob = storiesContainer.Ob();
                MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.PROFILE;
                q40 q40Var = new q40(view, 26);
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: xsna.prh
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        vzd0.this.a();
                    }
                };
                i = 0;
                storyViewerRouter.h(h, arrayList, Ob, null, (r42 & 16) != 0, mobileOfficialAppsConStoriesStat$ViewEntryPoint, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, str, null, (r42 & 512) != 0 ? null : null, q40Var, (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : onDismissListener, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
            }
            g2h g2hVar = new g2h(extendedCommunityProfile.a.c);
            g2hVar.b = "avatar";
            g2hVar.d = arrayList.get(i).Cb() ? "story" : "seen_story";
            g2hVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void y(d.j.g1 g1Var) {
        ?? r0 = this.b.n;
        CommunityProfileDeeplinkParams communityProfileDeeplinkParams = g1Var.a;
        String str = communityProfileDeeplinkParams.c;
        Integer num = communityProfileDeeplinkParams.d;
        if (num == null) {
            ((cwh) r0.getValue()).a(str);
            return;
        }
        int intValue = num.intValue();
        cwh cwhVar = (cwh) r0.getValue();
        cwhVar.getClass();
        CreateCommunityReviewData createCommunityReviewData = new CreateCommunityReviewData(null, null, null, Integer.valueOf(intValue), 7, null);
        cwhVar.h = createCommunityReviewData;
        cwhVar.b.n(cwhVar.a.requireContext(), new CreateCommunityReviewArgs(cwhVar.e, createCommunityReviewData, str, null, null, 24, null));
        cwhVar.h = null;
    }

    public final void z(d.j.i1 i1Var) {
        ExtendedCommunityProfile extendedCommunityProfile = i1Var.a;
        ExtendedCommunityProfile.d dVar = extendedCommunityProfile.C2;
        if (dVar == null) {
            return;
        }
        com.vk.profile.community.impl.ui.profile.c cVar = this.b;
        ((ajg0) cVar.d.g.getValue()).j(bwd0.i(extendedCommunityProfile), dVar.a, dVar.b, cVar.a.requireContext());
    }
}
