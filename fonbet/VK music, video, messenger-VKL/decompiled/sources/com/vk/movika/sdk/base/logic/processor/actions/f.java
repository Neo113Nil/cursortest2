package com.vk.movika.sdk.base.logic.processor.actions;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.camera.editor.stories.impl.bottompanel.BottomControlPanelSkeletonView;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonHeaderVh;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonCatalogRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.upload.vk.impl.rules.ClipsPublishRulesFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.a;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.cart.impl.di.CartInternalComponent;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.api.di.VideoClipsControllersConfigComponent;
import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.arg;
import xsna.azl;
import xsna.bwc;
import xsna.cvk;
import xsna.d3t;
import xsna.e3m;
import xsna.e43;
import xsna.e8v0;
import xsna.eb7;
import xsna.epx;
import xsna.ewy;
import xsna.fb7;
import xsna.fnj;
import xsna.fpf0;
import xsna.gn3;
import xsna.gue;
import xsna.gy;
import xsna.gzs;
import xsna.iah0;
import xsna.isc;
import xsna.jj8;
import xsna.k0e;
import xsna.k7m;
import xsna.krv0;
import xsna.m33;
import xsna.m4;
import xsna.m7c;
import xsna.m7e;
import xsna.m7m;
import xsna.pbh;
import xsna.pm3;
import xsna.qcy;
import xsna.r4c;
import xsna.rmb;
import xsna.roe;
import xsna.s3q0;
import xsna.t4p;
import xsna.u48;
import xsna.ucb;
import xsna.uyc;
import xsna.vj8;
import xsna.xge;
import xsna.xh5;
import xsna.y1q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        pm3 pm3Var;
        AppBarLayout appBarLayout;
        Window window;
        s3q0 s3q0Var;
        int i = this.b;
        boolean z = true;
        Window window2 = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                j.a aVar = (j.a) obj;
                com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) aVar.i.getValue();
                Long l = fVar != null ? fVar.d : null;
                ArrayList c = a.c(aVar.a, aVar.d);
                ArrayList arrayList = new ArrayList();
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    com.vk.movika.sdk.base.model.f fVar2 = (com.vk.movika.sdk.base.model.f) next;
                    if (com.vk.movika.sdk.base.utils.d.c(fVar2) && epx.f(fVar2.d, l)) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            case 1:
                Context context = ((com.vk.photos.root.albumdetails.presentation.c) obj).b;
                HashSet hashSet = iah0.a;
                return Integer.valueOf((fnj.c(context) || iah0.s(context)) ? 3 : 6);
            case 2:
                return Float.valueOf(((azl) obj).I0(125));
            case 3:
                ArticleAuthorPageFragment articleAuthorPageFragment = (ArticleAuthorPageFragment) obj;
                gn3 gn3Var = articleAuthorPageFragment.a0;
                if (gn3Var == null || (pm3Var = gn3Var.e) == null) {
                    return null;
                }
                ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) articleAuthorPageFragment.e0.getValue();
                UserId userId = pm3Var.a.b;
                ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                profileFragmentProviderComponent.ye(userId, null).k(articleAuthorPageFragment.getActivity());
                return s3q0.a;
            case 4:
                AudioBookPersonCatalogRootVh audioBookPersonCatalogRootVh = (AudioBookPersonCatalogRootVh) obj;
                AudioBookPersonHeaderVh audioBookPersonHeaderVh = audioBookPersonCatalogRootVh.s;
                AudioBookPersonHeaderVh audioBookPersonHeaderVh2 = audioBookPersonHeaderVh != null ? audioBookPersonHeaderVh : null;
                if (audioBookPersonHeaderVh2 != null && (appBarLayout = audioBookPersonHeaderVh2.e) != null) {
                    appBarLayout.setExpanded(true);
                }
                audioBookPersonCatalogRootVh.w.d();
                return s3q0.a;
            case 5:
                xh5 xh5Var = ((com.vk.libvideo.autoplay.b) obj).c;
                if (xh5Var != null) {
                    return xh5Var.a;
                }
                return null;
            case 6:
                int i2 = BiometricsLockSettingsFragment.Y;
                return ((BiometricsLockComponent) ((k7m) m7m.f((BiometricsLockSettingsFragment) obj)).a(fpf0.a(BiometricsLockComponent.class))).a();
            case 7:
                ((eb7) obj).d.b(fb7.a.a);
                return s3q0.a;
            case 8:
                return (BottomControlPanelSkeletonView) ((u48) obj).findViewById(R.id.bottom_panel_skeleton);
            case 9:
                com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d dVar = (com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d) obj;
                return new com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.a(new com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.c(1, dVar, com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d.class, "clickButtonListener", "clickButtonListener(Lcom/vk/newsfeed/impl/posting/viewpresenter/bottom/attachment/BottomPanelPostingItem$Button;)V", 0), new gy(dVar, 2), dVar.g);
            case 10:
                return new vj8(((jj8) obj).itemView.getContext());
            case 11:
                int i3 = ChannelFragment.a1;
                return new ucb(new m4((ChannelFragment) obj, 13));
            case 12:
                Context context2 = ((rmb) obj).c.getContext();
                e3m.a aVar2 = e3m.a;
                return m33.a(R.drawable.vk_icon_play_24, context2);
            case 13:
                ChatFragment.d dVar2 = ChatFragment.w1;
                ((ChatFragment) obj).wo();
                return s3q0.a;
            case 14:
                ChatProfileActionsView chatProfileActionsView = (ChatProfileActionsView) obj;
                int i4 = ChatProfileActionsView.z;
                return new View[]{chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action1_v2), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action2_v2), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action3_v2), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action4_v2), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action5_v2)};
            case 15:
                ewy ewyVar = ((CartInternalComponent) ((r4c) obj).a.mo408a(fpf0.a(CartInternalComponent.class))).a;
                qcy<Object> qcyVar = CartInternalComponent.b[0];
                return (m7c) ewyVar.c();
            case 16:
                List<ClickableSticker> list = ((ClickableStickers) obj).d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((ClickableSticker) it2.next()) instanceof ClickableMusic) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 17:
                qcy<Object>[] qcyVarArr = isc.t1;
                return ((isc) obj).eo().k();
            case 18:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i5 = ClipFeedListFragment.a2;
                ListBuilder e = e43.e();
                e.add(clipFeedListFragment.mo());
                uyc uycVar = (uyc) clipFeedListFragment.F0.getValue();
                if (uycVar != null) {
                    e.add(uycVar);
                }
                return new bwc(e.g());
            case 19:
                m7e m7eVar = ClipFeedSideControlsView.r;
                ((VideoClipsControllersConfigComponent) ((k7m) m7m.c((ClipFeedSideControlsView) obj)).a(fpf0.a(VideoClipsControllersConfigComponent.class))).getClass();
                return null;
            case 20:
                return (ViewGroup) ((k0e) obj).b.inflate();
            case 21:
                ClipsGridDraftsListFragment.a aVar3 = new ClipsGridDraftsListFragment.a(ClipsGridDraftsListFragment.class, null, null);
                aVar3.j.putBoolean("ClipsGridListFragment.force_dark_theme", ((a.C0712a) obj).a);
                return aVar3.f();
            case 22:
                return (ClipsInterestsComponentImpl) ((k7m) m7m.f((xge) obj)).a(fpf0.a(ClipsInterestsComponent.class));
            case 23:
                Object obj2 = ClipsOwnerSwipeFragment.k0;
                return new roe(new ClipsOwnerSwipeFragment.d(0, (ClipsOwnerSwipeFragment) obj, ClipsOwnerSwipeFragment.class, "getArguments", "getArguments()Landroid/os/Bundle;", 0));
            case 24:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((gue) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 25:
                int i6 = ClipsPublishRulesFragment.N;
                ((ClipsPublishRulesFragment) obj).finish();
                return s3q0.a;
            case 26:
                com.vk.attachpicker.screen.f fVar3 = (com.vk.attachpicker.screen.f) obj;
                cvk.u(R.string.picker_image_format_invalid, false);
                d3t d3tVar = fVar3.j;
                Integer num = fVar3.r;
                if (num != null) {
                    int intValue = num.intValue();
                    com.vk.core.simplescreen.a c2 = d3tVar.c();
                    if (c2 == null || (window = c2.getWindow()) == null) {
                        Activity d = fVar3.d();
                        if (d != null) {
                            window2 = d.getWindow();
                        }
                    } else {
                        window2 = window;
                    }
                    krv0.s(window2, intValue);
                }
                d3tVar.a(t4p.a.c.a);
                ((y1q0) fVar3.k.getValue()).a();
                s3q0 s3q0Var2 = s3q0.a;
                fVar3.c();
                return s3q0.a;
            case 27:
                s3q0Var = CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4((CommonInitAwaitingGetHeaderBiddingToken) obj);
                return s3q0Var;
            case 28:
                return (VkMiniInfoCell) ((arg) obj).a.findViewById(R.id.community_address_phone_mini_info_cell);
            default:
                pbh.a aVar4 = (pbh.a) obj;
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = aVar4.p;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.g.b);
                }
                aVar4.o.invoke();
                return s3q0.a;
        }
    }
}
