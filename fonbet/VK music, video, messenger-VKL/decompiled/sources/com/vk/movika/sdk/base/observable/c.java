package com.vk.movika.sdk.base.observable;

import android.content.Context;
import android.location.Location;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioReactionConfigDto;
import com.vk.api.generated.audio.dto.AudioReactionsConfigDto;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.biometrics.lock.api.domain.model.PinLockLaunchMode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.BiometricsLockOnboardingFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.f;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.CheckLinkResponse;
import com.vk.dto.music.reactions.Reaction;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.channelcreation.impl.e;
import com.vk.im.channelcreation.impl.i;
import com.vk.log.L;
import com.vk.music.offline.configs.api.domain.model.ReactionsConfig;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vk.voip.ui.settings.participants_view.c;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.addpoll.AddPollView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.af2;
import xsna.ah;
import xsna.ao8;
import xsna.b520;
import xsna.b87;
import xsna.bp50;
import xsna.bwt0;
import xsna.c5g;
import xsna.cq8;
import xsna.cvk;
import xsna.dhr0;
import xsna.dm0;
import xsna.dnd;
import xsna.dp8;
import xsna.du4;
import xsna.e37;
import xsna.e370;
import xsna.e39;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fn0;
import xsna.fnd;
import xsna.g53;
import xsna.gg1;
import xsna.gm50;
import xsna.gnd;
import xsna.hyg0;
import xsna.i8;
import xsna.id9;
import xsna.iy0;
import xsna.izs;
import xsna.mde;
import xsna.nre;
import xsna.od9;
import xsna.p16;
import xsna.pls;
import xsna.pr2;
import xsna.px9;
import xsna.q69;
import xsna.qab;
import xsna.qaq0;
import xsna.qgi0;
import xsna.qls;
import xsna.qm;
import xsna.qyg0;
import xsna.rab;
import xsna.rew0;
import xsna.s3q0;
import xsna.sj;
import xsna.sm;
import xsna.tgi0;
import xsna.tj50;
import xsna.uaf;
import xsna.ure;
import xsna.va9;
import xsna.vab;
import xsna.vw9;
import xsna.w43;
import xsna.wr8;
import xsna.y8;
import xsna.yle;
import xsna.yz;
import xsna.za;
import xsna.zld;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dm0 dm0Var;
        int i = this.b;
        int i2 = 10;
        int i3 = 8;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.listener.c) obj).l((com.vk.movika.sdk.base.model.f) obj2);
                return s3q0.a;
            case 1:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) obj2;
                int i4 = AbsFriendsAndFollowersTabFragment.X;
                pls fo = absFriendsAndFollowersTabFragment.fo();
                fo.a.setVisibility(8);
                fo.e.setVisibility(8);
                fo.b.setVisibility(8);
                fo.c.setVisibility(0);
                fo.d.setVisibility(8);
                fo.f.setVisibility(8);
                fo.g.setSeparatorAllowed(false);
                gm50.a.a(absFriendsAndFollowersTabFragment, ((qls.c) obj).a, new za(absFriendsAndFollowersTabFragment, r5));
                return s3q0.a;
            case 2:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = (com.vk.superapp.browser.internal.ui.shortcats.a) obj2;
                WebGroup webGroup = (WebGroup) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).g0(new SuperappUiRouterBridge.a.c(webGroup), new yz(aVar, webGroup));
                return s3q0.a;
            case 3:
                fn0 fn0Var = (fn0) obj2;
                CheckLinkResponse checkLinkResponse = (CheckLinkResponse) obj;
                if (checkLinkResponse.b) {
                    AddPollView addPollView = fn0Var.d;
                    if (addPollView == null) {
                        addPollView = null;
                    }
                    addPollView.dismiss();
                    if (!fn0Var.b) {
                        fn0Var.b = true;
                        ActionLink actionLink = checkLinkResponse.d;
                        if (actionLink != null && (dm0Var = fn0Var.e) != null) {
                            dm0Var.b(actionLink);
                        }
                    }
                }
                fn0Var.f = null;
                return s3q0.a;
            case 4:
                ((gg1) obj2).p.b(i.r.a);
                return s3q0.a;
            case 5:
                ((w43) obj2).q1();
                return s3q0.a;
            case 6:
                VkTopBar vkTopBar = (VkTopBar) obj2;
                int i5 = AppRedirectsSettingsFragment.L0;
                qgi0.r((tgi0) obj, "AppRedirectsSettingsFragment_topbar_back_tag");
                Context context = vkTopBar.getContext();
                String string = context != null ? context.getString(R.string.accessibility_back) : null;
                if (string == null) {
                    string = "";
                }
                vkTopBar.setContentDescription(string);
                return s3q0.a;
            case 7:
                AudioReactionsConfigDto audioReactionsConfigDto = (AudioReactionsConfigDto) obj;
                ((du4) obj2).b.getClass();
                String title = audioReactionsConfigDto.getTitle();
                String e = audioReactionsConfigDto.e();
                List<AudioReactionConfigDto> d = audioReactionsConfigDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (AudioReactionConfigDto audioReactionConfigDto : d) {
                    arrayList.add(new Reaction(audioReactionConfigDto.getId(), audioReactionConfigDto.getTitle(), audioReactionConfigDto.getDescription(), audioReactionConfigDto.d(), audioReactionConfigDto.e()));
                }
                return new ReactionsConfig(title, e, arrayList);
            case 8:
                String str = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT SUM(auto_download_track.size_in_bytes) FROM auto_download_track WHERE uid = ? AND auto_download_track.auto_download_type = 1");
                try {
                    V0.D3(1, str);
                    r5 = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(r5);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 9:
                b520 b520Var = (b520) obj;
                ((bp50) ((p16) obj2).h.getValue()).d(b520Var);
                if (epx.f(b520Var.b, "copy")) {
                    cvk.u(R.string.ad_marker_copied, false);
                }
                return s3q0.a;
            case 10:
                return new sj((ViewGroup) obj, (e37.a) obj2);
            case 11:
                BiometricsLockOnboardingFragment biometricsLockOnboardingFragment = (BiometricsLockOnboardingFragment) obj2;
                com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.f fVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.f) obj;
                int i6 = BiometricsLockOnboardingFragment.T;
                if (fVar.equals(f.a.a)) {
                    biometricsLockOnboardingFragment.finish();
                } else {
                    if (!fVar.equals(f.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    biometricsLockOnboardingFragment.finish();
                    ((b87) biometricsLockOnboardingFragment.R.getValue()).e(biometricsLockOnboardingFragment.requireContext(), PinLockLaunchMode.DEFAULT);
                }
                return s3q0.a;
            case 12:
                wr8 wr8Var = (wr8) obj2;
                dp8 dp8Var = wr8Var.l;
                cq8 cq8Var = wr8Var.r;
                dp8Var.q(cq8Var != null ? cq8Var : null);
                return s3q0.a;
            case 13:
                return new e39((ViewGroup) obj, (q69) obj2);
            case 14:
                com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) obj2;
                VkButton vkButton = cVar.g;
                View view = cVar.f;
                View view2 = cVar.e;
                int i7 = c.b.$EnumSwitchMapping$0[((CallParticipantsViewModel.BottomControlState) obj).ordinal()];
                if (i7 == 1) {
                    bwt0.p0(view2, true);
                    dhr0.a.getClass();
                    view2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_contrast_themed, dhr0.s()));
                    bwt0.q0(view, 1.0f);
                    bwt0.p0(view, true);
                    view.setEnabled(false);
                    bwt0.q0(vkButton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f4m.s((int) vkButton.getResources().getDimension(R.dimen.voip_participants_share_button_start_margin), vkButton);
                    vkButton.setMode(VkButton.Mode.Secondary);
                    bwt0.p0(vkButton, true);
                    cVar.b(true);
                } else if (i7 == 2) {
                    bwt0.p0(view2, true);
                    dhr0.a.getClass();
                    view2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_contrast_themed, dhr0.s()));
                    bwt0.q0(view, 1.0f);
                    bwt0.p0(view, true);
                    view.setEnabled(true);
                    bwt0.q0(vkButton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f4m.s((int) vkButton.getResources().getDimension(R.dimen.voip_participants_share_button_start_margin), vkButton);
                    vkButton.setMode(VkButton.Mode.Secondary);
                    bwt0.p0(vkButton, true);
                    cVar.b(true);
                } else if (i7 == 3) {
                    bwt0.p0(view2, true);
                    dhr0.a.getClass();
                    view2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, dhr0.s()));
                    bwt0.q0(view, 1.0f);
                    bwt0.p0(view, true);
                    view.setEnabled(true);
                    bwt0.q0(vkButton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f4m.s(0, vkButton);
                    vkButton.setMode(VkButton.Mode.Secondary);
                    bwt0.p0(vkButton, false);
                    cVar.b(true);
                } else if (i7 == 4) {
                    bwt0.p0(view2, true);
                    dhr0.a.getClass();
                    view2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, dhr0.s()));
                    bwt0.q0(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    bwt0.p0(view, false);
                    bwt0.q0(vkButton, 1.0f);
                    f4m.s(0, vkButton);
                    vkButton.setMode(VkButton.Mode.Primary);
                    bwt0.p0(vkButton, true);
                    cVar.b(true);
                } else {
                    if (i7 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bwt0.p0(view2, false);
                    cVar.b(false);
                }
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((pr2) obj).a.equals(((rew0) ((va9) obj2).f.getValue()).f()));
            case 16:
                ((id9) obj2).b(((od9) obj).a);
                return s3q0.a;
            case 17:
                com.vk.cameraui.impl.a aVar2 = (com.vk.cameraui.impl.a) obj2;
                aVar2.C = null;
                aVar2.p = (Location) obj;
                return s3q0.a;
            case 18:
                L.i((Throwable) obj);
                ((vw9) obj2).T(new px9.h.b());
                return s3q0.a;
            case 19:
                ((com.vk.im.channelcreation.impl.b) obj2).n(new i.d(new e.f(R.string.im_channel_editing)));
                return s3q0.a;
            case 20:
                ((com.vk.channels.impl.donut.b) obj2).c = null;
                return s3q0.a;
            case 21:
                return new vab.a(((tj50.a) obj).a(new qab(1, (rab) obj2, rab.class, "composeContent", "composeContent(Lcom/vk/channels/impl/reactions/quantity_selector/presentation/feature/ChannelReactionQuantitySelectorState;)Lcom/vk/channels/impl/reactions/quantity_selector/presentation/ui/state/ChannelReactionQuantitySelectorViewState$Data$Content;", 0), ao8.d));
            case 22:
                com.vk.im.ui.components.chat_profile.a aVar3 = (com.vk.im.ui.components.chat_profile.a) obj2;
                int itemId = ((MenuItem) obj).getItemId();
                if (itemId == R.id.action_chat_profile_share) {
                    aVar3.t(zxd0.s.b.a);
                } else if (itemId == R.id.action_chat_profile_settings) {
                    aVar3.t(zxd0.t.a);
                }
                return Boolean.TRUE;
            case 23:
                float floatValue = ((Float) obj).floatValue();
                int i8 = ClipFeedListFragment.a2;
                iy0 ko = ((ClipFeedListFragment) obj2).ko();
                if (ko != null) {
                    ko.p.I0(floatValue);
                }
                return s3q0.a;
            case 24:
                zld zldVar = (zld) obj2;
                File file = (File) obj;
                if (file == null) {
                    return s3q0.a;
                }
                zldVar.g.invoke(new ClipsChoosePreviewResult(file, true, zldVar.c.f, zldVar.k));
                return s3q0.a;
            case 25:
                tj50.a aVar4 = (tj50.a) obj;
                fnd fndVar = (fnd) ((dnd) obj2).d.getValue();
                fndVar.getClass();
                y8 y8Var = new y8(fndVar, i3);
                ao8 ao8Var = ao8.d;
                return new gnd.a.b(aVar4.a(y8Var, ao8Var), aVar4.a(new g53(fndVar, 9), ao8Var), aVar4.a(new qm(fndVar, i2), ao8Var), aVar4.a(new af2(fndVar, 6), ao8Var), aVar4.a(new sm(fndVar), ao8Var), aVar4.a(new i(11), ao8Var), aVar4.a(new i8(15), ao8Var));
            case 26:
                ClipInvolvementActionButton clipInvolvementActionButton = (ClipInvolvementActionButton) obj2;
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((qaq0) it.next()).a == ((ClipInvolvementActionButton.DonutLevel) clipInvolvementActionButton).e) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 27:
                AbstractClipsGridListFragment abstractClipsGridListFragment = ((mde) obj2).a;
                if (abstractClipsGridListFragment != null) {
                    abstractClipsGridListFragment.lb();
                }
                return s3q0.a;
            case 28:
                uaf.a((VkBanner) obj, new ah((yle) obj2, 28));
                return s3q0.a;
            default:
                nre nreVar = (nre) obj2;
                L.i((Throwable) obj);
                nreVar.p = true;
                nreVar.n.b(ure.b.a);
                return s3q0.a;
        }
    }
}
