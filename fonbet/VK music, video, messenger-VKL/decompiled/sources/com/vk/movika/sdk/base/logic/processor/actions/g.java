package com.vk.movika.sdk.base.logic.processor.actions;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonHeaderVh;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonCatalogRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.comments.e;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.stories.model.clickable.ClickableReply;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AllFriendsTabFragment;
import com.vk.im.chat.api.ChatComponent;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.search.integration.friends.api.di.SearchFriendsIntegrationComponent;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoToClipAttach;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bre;
import xsna.e2d;
import xsna.e3m;
import xsna.fnj;
import xsna.fpf0;
import xsna.g20;
import xsna.gzs;
import xsna.i4f;
import xsna.i5s;
import xsna.iah0;
import xsna.isc;
import xsna.jt;
import xsna.k0e;
import xsna.k7m;
import xsna.m33;
import xsna.m6e;
import xsna.m7e;
import xsna.m7m;
import xsna.mbc;
import xsna.nbs;
import xsna.nxb;
import xsna.p8u0;
import xsna.qcy;
import xsna.qr6;
import xsna.r4c;
import xsna.r7;
import xsna.rmb;
import xsna.rt5;
import xsna.s3q0;
import xsna.u44;
import xsna.u48;
import xsna.vth0;
import xsna.wgb;
import xsna.x6d;
import xsna.xfc0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        AppBarLayout appBarLayout;
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 3;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                List list = (List) ((j.a) obj2).f.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (com.vk.movika.sdk.base.utils.d.a((com.vk.movika.sdk.base.model.f) obj3, fpf0.a(com.vk.movika.sdk.base.model.actions.c.class))) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 1:
                Context context = ((com.vk.photos.root.albumdetails.presentation.c) obj2).b;
                HashSet hashSet = iah0.a;
                if (!fnj.c(context) && !iah0.s(context)) {
                    i2 = 6;
                }
                return Integer.valueOf(i2);
            case 2:
                AllFriendsTabFragment allFriendsTabFragment = (AllFriendsTabFragment) obj2;
                int i3 = AllFriendsTabFragment.c0;
                ((SearchFriendsIntegrationComponent) ((k7m) m7m.f(allFriendsTabFragment)).mo408a(fpf0.a(SearchFriendsIntegrationComponent.class))).getClass();
                return new vth0(allFriendsTabFragment.R, allFriendsTabFragment);
            case 3:
                int i4 = ArticleAuthorPageFragment.f0;
                ((f) obj2).invoke();
                return s3q0.a;
            case 4:
                int i5 = u44.a.$EnumSwitchMapping$0[((u44) obj2).b.f.ordinal()];
                if (i5 == 1) {
                    return MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_CHANNEL;
                }
                if (i5 == 2) {
                    return MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_UPLOAD;
                }
                if (i5 == 3) {
                    return MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_EDIT;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                AudioBookPersonHeaderVh audioBookPersonHeaderVh = ((AudioBookPersonCatalogRootVh) obj2).s;
                AudioBookPersonHeaderVh audioBookPersonHeaderVh2 = audioBookPersonHeaderVh != null ? audioBookPersonHeaderVh : null;
                if (audioBookPersonHeaderVh2 != null && (appBarLayout = audioBookPersonHeaderVh2.e) != null) {
                    appBarLayout.setExpanded(false);
                }
                return s3q0.a;
            case 6:
                int i6 = rt5.r1;
                return (BridgeComponent) m7m.d((rt5) obj2).a(fpf0.a(BridgeComponent.class));
            case 7:
                return "UPLOAD_TRACE doUpload: last chunk uploaded but server reports incomplete upload for attach " + ((qr6) obj2).o;
            case 8:
                int i7 = BiometricsLockSettingsFragment.Y;
                return ((BiometricsLockComponent) ((k7m) m7m.f((BiometricsLockSettingsFragment) obj2)).a(fpf0.a(BiometricsLockComponent.class))).H();
            case 9:
                return ((u48) obj2).findViewById(R.id.vs_bottom_panel_container);
            case 10:
                return new xfc0(new r7((com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d) obj2, 14));
            case 11:
                com.vk.channels.impl.comments.e eVar = (com.vk.channels.impl.comments.e) obj2;
                e.b bVar = eVar.k;
                return new com.vk.channels.impl.comments.h((bVar != null ? bVar : null).c, new g20(eVar, 17));
            case 12:
                int i8 = ChannelFragment.a1;
                return ((ImReportersComponent) m7m.d((ChannelFragment) obj2).a(fpf0.a(ImReportersComponent.class))).K();
            case 13:
                int i9 = ChannelMonetizationFragment.T;
                ((ChannelMonetizationFragment) obj2).finish();
                return s3q0.a;
            case 14:
                return i5s.a(new StringBuilder(), ((wgb) obj2).s, ": loadRecommendations: fetch from network");
            case 15:
                Context context2 = ((rmb) obj2).c.getContext();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vk_icon_pause_24, context2);
            case 16:
                ChatProfileActionsView chatProfileActionsView = (ChatProfileActionsView) obj2;
                int i10 = ChatProfileActionsView.z;
                return new View[]{chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action1), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action2), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action3), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action4), chatProfileActionsView.findViewById(R.id.vkim_chat_profile_action5)};
            case 17:
                int i11 = nxb.k1;
                Bundle arguments = ((nxb) obj2).getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = arguments.getParcelable("owner_id", Peer.class);
                        obj = (Parcelable) parcelable;
                    } else {
                        Object parcelable2 = arguments.getParcelable("owner_id");
                        obj = (Peer) (parcelable2 instanceof Peer ? parcelable2 : null);
                    }
                    Peer peer = (Peer) obj;
                    if (peer != null) {
                        return peer;
                    }
                }
                return Peer.Unknown.e;
            case 18:
                return ((ChatComponent) ((r4c) obj2).a.a(fpf0.a(ChatComponent.class))).Cf();
            case 19:
                return new p8u0(((mbc) obj2).requireContext(), false, 10);
            case 20:
                List<ClickableSticker> list2 = ((ClickableStickers) obj2).d;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((ClickableSticker) it.next()) instanceof ClickableReply) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 21:
                qcy<Object>[] qcyVarArr = isc.t1;
                return ((isc) obj2).eo().g();
            case 22:
                int i12 = ClipFeedListFragment.a2;
                return new nbs(((ClipFeedListFragment) obj2).D);
            case 23:
                m7e m7eVar = ClipFeedSideControlsView.r;
                return new i4f(new ClipFeedSideControlsView.b(0, (ClipFeedSideControlsView) obj2, ClipFeedSideControlsView.class, "getActivity", "getActivity()Landroid/app/Activity;", 0));
            case 24:
                return new ErrorOverlayRenderDelegate(((x6d) ((e2d) obj2).a.getValue()).k, new jt(12));
            case 25:
                return ((ViewGroup) ((k0e) obj2).h.getValue()).findViewById(R.id.swap_editor_overlay_view);
            case 26:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                int i13 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, a.b.b);
                return s3q0.a;
            case 27:
                return ((m6e.a) obj2).a;
            case 28:
                Object obj4 = ClipsOwnerSwipeFragment.k0;
                return ((ClipsViewerComponentImpl) ((ClipsOwnerSwipeFragment) obj2).Q.getValue()).Lf();
            default:
                bre.b bVar2 = bre.s1;
                return (ClipsPlaylistsComponentImpl) m7m.d((bre) obj2).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
        }
    }
}
