package com.vk.movika.sdk.base.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.channels.impl.list.onboarding.di.ChannelsOnboardingDiComponent;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponentImpl;
import com.vk.method.selector.api.MethodSelectorComponent;
import com.vk.music.api.di.MusicCatalogSectionIdProviderComponent;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.newsfeed.impl.fragments.ClipsCommentThreadFragment;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinContainer;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinScrollView;
import xsna.a8b;
import xsna.b96;
import xsna.bpn0;
import xsna.ce4;
import xsna.cot;
import xsna.ddm0;
import xsna.ebd;
import xsna.ekd;
import xsna.fpf0;
import xsna.ghw0;
import xsna.gzs;
import xsna.ide;
import xsna.it4;
import xsna.izs;
import xsna.j96;
import xsna.k7m;
import xsna.ke90;
import xsna.l1;
import xsna.l7m;
import xsna.m1;
import xsna.m7m;
import xsna.nk9;
import xsna.psj0;
import xsna.q8b;
import xsna.qcy;
import xsna.rgc;
import xsna.s3q0;
import xsna.se4;
import xsna.sgc;
import xsna.st2;
import xsna.swe0;
import xsna.ttb;
import xsna.u59;
import xsna.u76;
import xsna.wa6;
import xsna.wzr0;
import xsna.x17;
import xsna.xq;
import xsna.ye0;
import xsna.z9l0;
import xsna.zak0;
import xsna.zd4;
import xsna.zn6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((y) obj).d.y.b(0L);
                return s3q0.a;
            case 1:
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                return ((AboutAppFragment) obj).requireArguments().getString("VIEW_URL");
            case 2:
                AbstractClipsGridListFragment abstractClipsGridListFragment = (AbstractClipsGridListFragment) obj;
                int i2 = AbstractClipsGridListFragment.e0;
                return ((ide) abstractClipsGridListFragment.getParentFragment()).w1(abstractClipsGridListFragment.S);
            case 3:
                ye0 ye0Var = (ye0) obj;
                return new wzr0(ye0Var.b, ye0Var.g.a.d, ye0Var.e);
            case 4:
                com.vk.clips.sdk.shared.item.ads.b bVar = (com.vk.clips.sdk.shared.item.ads.b) obj;
                return bVar.O(new cot(bVar.i));
            case 5:
                int i3 = AlbumDetailsFragment.p0;
                return (SharingComponent) m7m.d((AlbumDetailsFragment) obj).a(fpf0.a(SharingComponent.class));
            case 6:
                st2 st2Var = (st2) obj;
                AnonymCallJoinContainer anonymCallJoinContainer = st2Var.e;
                if (anonymCallJoinContainer != null) {
                    anonymCallJoinContainer.setLogoCollapsed(true);
                }
                AnonymCallJoinScrollView anonymCallJoinScrollView = st2Var.g;
                if (anonymCallJoinScrollView != null) {
                    anonymCallJoinScrollView.postDelayed(st2Var.y, 300L);
                }
                return s3q0.a;
            case 7:
                int i4 = AppChannelFragment.l1;
                return new q8b(new bpn0(new l1((AppChannelFragment) obj, 5)));
            case 8:
                int i5 = ArchiveFragment.e0;
                return (PhotosComponent) ((k7m) m7m.f((ArchiveFragment) obj)).a(fpf0.a(PhotosComponent.class));
            case 9:
                return new it4(((BridgeComponent) ((AttachmentMappersComponentImpl) obj).a.getValue()).s());
            case 10:
                int i6 = zd4.g1;
                Bundle requireArguments = ((zd4) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("launch_screen", AudioBookChapterBottomSheetLaunchPoint.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("launch_screen");
                    parcelable = (AudioBookChapterBottomSheetLaunchPoint) (parcelable3 instanceof AudioBookChapterBottomSheetLaunchPoint ? parcelable3 : null);
                }
                AudioBookChapterBottomSheetLaunchPoint audioBookChapterBottomSheetLaunchPoint = (AudioBookChapterBottomSheetLaunchPoint) parcelable;
                if (audioBookChapterBottomSheetLaunchPoint != null) {
                    return new se4(audioBookChapterBottomSheetLaunchPoint, new ce4());
                }
                throw new IllegalStateException("Need set launchPoint before open AudioBookBottomSheet");
            case 11:
                ((AutoSuggestStickersPopupWindow) obj).d.K();
                return s3q0.a;
            case 12:
                j96 j96Var = (j96) obj;
                ke90 ke90Var = j96Var.e;
                z9l0.a((u76) ke90Var.invoke());
                if (((psj0) j96Var.i.getValue()).d(WebStickerType.SERVICE_YC_ITEM)) {
                    return new ddm0((Activity) j96Var.c.invoke(), j96Var.getStickersDrawingView(), (u76) ke90Var.invoke(), (b96) j96Var.f.invoke(), j96Var.d.b);
                }
                return null;
            case 13:
                return ((MethodSelectorComponent) m7m.d((wa6) obj).mo408a(fpf0.a(MethodSelectorComponent.class))).a();
            case 14:
                izs<? super FeedbackResult, s3q0> izsVar = ((zn6) obj).g;
                if (izsVar != null) {
                    izsVar.invoke(FeedbackResult.STAR_1);
                }
                return s3q0.a;
            case 15:
                return Float.valueOf(swe0.g(((Number) ((zak0) ((x17) obj).d).getValue()).intValue(), 0, 100) / 100.0f);
            case 16:
                ((u59) obj).d.a(ghw0.c.a);
                return s3q0.a;
            case 17:
                return ((MusicCatalogSectionIdProviderComponent) ((k7m) m7m.f((CatalogRootViewHolder) obj)).mo408a(fpf0.a(MusicCatalogSectionIdProviderComponent.class))).dd();
            case 18:
                ((a8b) obj).d = null;
                return s3q0.a;
            case 19:
                s3q0 s3q0Var = s3q0.a;
                ((io.reactivex.rxjava3.subjects.f) obj).onNext(s3q0Var);
                return s3q0Var;
            case 20:
                int i7 = ChannelsListFragment.f0;
                return (ChannelsOnboardingDiComponent) m7m.d((ChannelsListFragment) obj).mo408a(fpf0.a(ChannelsOnboardingDiComponent.class));
            case 21:
                ChatFragment chatFragment = (ChatFragment) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                l7m d = m7m.d(chatFragment);
                return ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), chatFragment.no(), d).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
            case 22:
                ((ttb) obj).e.b();
                return s3q0.a;
            case 23:
                int i8 = sgc.n1;
                rgc rgcVar = (rgc) ((sgc) obj).f1;
                if (rgcVar != null) {
                    rgcVar.A();
                }
                return s3q0.a;
            case 24:
                int i9 = ClipFeedListFragment.a2;
                return ((ClipFeedListFragment) obj).no().p();
            case 25:
                ((ebd) obj).y = null;
                return s3q0.a;
            case 26:
                return (ClipsPlaylistsComponent) ((k7m) m7m.f((ekd) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 27:
                int i10 = ClipsCommentThreadFragment.A0;
                return ((AttachmentMappersComponent) m7m.d((ClipsCommentThreadFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 28:
                Integer num = ClipsEditorFragment.W;
                return new nk9(new bpn0(new m1((ClipsEditorFragment) obj, 24)));
            default:
                int i11 = ClipsFavoriteFoldersListFragment.U;
                return (ClipsFavoritesComponentImpl) ((k7m) m7m.f((ClipsFavoriteFoldersListFragment) obj)).mo408a(fpf0.a(ClipsFavoritesComponent.class));
        }
    }
}
