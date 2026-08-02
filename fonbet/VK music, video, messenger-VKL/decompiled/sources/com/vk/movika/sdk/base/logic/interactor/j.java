package com.vk.movika.sdk.base.logic.interactor;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.design.view.preview.ClipsVideoAndPhotoView;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment.b;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.documents.api.di.DocumentsComponent;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.masks.Mask;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.categories.impl.presentation.CategoriesFragment;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.controls.view.state.Mode;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.a3b;
import xsna.aq2;
import xsna.asu0;
import xsna.bc90;
import xsna.blj;
import xsna.bwt0;
import xsna.dka;
import xsna.e5d;
import xsna.e7m;
import xsna.eka;
import xsna.epx;
import xsna.fj6;
import xsna.fka;
import xsna.fpf0;
import xsna.g620;
import xsna.g8m;
import xsna.gka;
import xsna.go9;
import xsna.gzs;
import xsna.h3p0;
import xsna.i10;
import xsna.j7;
import xsna.k7m;
import xsna.l9f;
import xsna.lw0;
import xsna.m7m;
import xsna.mxa;
import xsna.nov;
import xsna.ozj0;
import xsna.p5s0;
import xsna.p5u0;
import xsna.qcy;
import xsna.r370;
import xsna.r8m0;
import xsna.rkd;
import xsna.s3q0;
import xsna.s9e;
import xsna.sa9;
import xsna.tam0;
import xsna.tt0;
import xsna.u440;
import xsna.uk50;
import xsna.um50;
import xsna.ur5;
import xsna.ur9;
import xsna.v1d;
import xsna.va9;
import xsna.vm50;
import xsna.wa9;
import xsna.x50;
import xsna.xwk;
import xsna.y1m0;
import xsna.yaa0;
import xsna.ym50;
import xsna.zcl0;
import xsna.zof;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0218  */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        Boolean b;
        Boolean bool;
        boolean z2;
        WebServiceInfo webServiceInfo;
        nov novVar;
        nov novVar2;
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 14;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return go9.b("Manifest does not contain container with id ", ((com.vk.movika.sdk.base.model.f) obj2).a);
            case 1:
                int i4 = AbsFollowersListFragment.Y;
                h3p0.b((AbsFollowersListFragment) obj2);
                return s3q0.a;
            case 2:
                ((i10) obj2).f(Mode.HIDE, true);
                return s3q0.a;
            case 3:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                lw0 lw0Var = cVar.g;
                return new p5s0(lw0Var.k(), lw0Var.f(), (ViewGroup) cVar.findViewById(R.id.fullscreen_ads_container));
            case 4:
                com.vk.photos.root.albumdetails.presentation.c cVar2 = ((AlbumDetailsFragment) obj2).m0;
                return bwt0.F((cVar2 != null ? cVar2 : null).g.getRecyclerView());
            case 5:
                int i5 = AlbumsFragment.j0;
                return ((PhotosComponent) ((AlbumsFragment) obj2).T.getValue()).i3();
            case 6:
                int i6 = AttachDocumentsFragment.R0;
                return ((DocumentsComponent) m7m.d((AttachDocumentsFragment) obj2).mo408a(fpf0.a(DocumentsComponent.class))).F7();
            case 7:
                bc90 bc90Var = (bc90) obj2;
                return Integer.valueOf(bc90Var.a ? OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND : bc90Var.b);
            case 8:
                return (VideoQueueComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) obj2).d)).mo408a(fpf0.a(VideoQueueComponent.class));
            case 9:
                AvatarView avatarView = (AvatarView) obj2;
                AvatarView.a aVar = AvatarView.y;
                return new ur5(avatarView.getContext(), avatarView.w);
            case 10:
                return ((VkOnboardingComponent) ((k7m) m7m.f((u440) obj2)).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 11:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj2;
                aq2 aq2Var = basePhotoListFragment.Y;
                (aq2Var != null ? aq2Var : null).e0();
                fj6 io2 = basePhotoListFragment.io();
                if (io2 != null) {
                    io2.d();
                }
                return s3q0.a;
            case 12:
                va9 va9Var = (va9) obj2;
                j1 b2 = va9Var.d.b();
                io.reactivex.rxjava3.subjects.d<va9.g> dVar = va9Var.h;
                dVar.getClass();
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
                y yVar = new y(dVar, qVar, aVar2);
                io.reactivex.rxjava3.core.q<R> s0 = va9Var.i.b0(va9.c.class).s0(new tt0(new com.vk.im.engine.internal.storage.delegates.messages.b(va9Var, i2), 5));
                va9Var.c.a.getClass();
                io.reactivex.rxjava3.core.q j = io.reactivex.rxjava3.core.q.j(b2, yVar, s0, com.vk.voip.ui.c.M0(), new j7(new sa9(i3), 8));
                j.getClass();
                va9Var.j.b(io.reactivex.rxjava3.kotlin.c.f(2, new y(j, qVar, aVar2).a0(asu0.a.d()), null, new x50(4), new wa9(1, va9Var, va9.class, "handleVmojiComplexState", "handleVmojiComplexState(Lcom/vk/voip/ui/vmoji/CallVmojiDelegate$VmojiComponentsState;)V", 0)));
                return s3q0.a;
            case 13:
                com.vk.cameraui.impl.a aVar3 = (com.vk.cameraui.impl.a) obj2;
                zcl0 stickersState = aVar3.b.getStickersState();
                boolean t = stickersState.t();
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = stickersState.a;
                if (!t) {
                    int i7 = 0;
                    while (true) {
                        if (i7 == copyOnWriteArrayList.size()) {
                            novVar2 = null;
                        } else if (copyOnWriteArrayList.get(i7) instanceof r8m0) {
                            novVar2 = copyOnWriteArrayList.get(i7);
                        } else {
                            i7++;
                        }
                    }
                    if (((r8m0) novVar2) == null) {
                        z = false;
                        y1m0 e0 = aVar3.e0();
                        b = e0.b();
                        bool = Boolean.TRUE;
                        if (!epx.f(b, bool)) {
                            int i8 = 0;
                            while (true) {
                                if (i8 == copyOnWriteArrayList.size()) {
                                    novVar = null;
                                } else if (copyOnWriteArrayList.get(i8) instanceof blj) {
                                    novVar = copyOnWriteArrayList.get(i8);
                                } else {
                                    i8++;
                                }
                            }
                            if (((blj) novVar) == null && !stickersState.t()) {
                                z2 = false;
                                Mask selectedMask = aVar3.b.getSelectedMask();
                                String Db = selectedMask != null ? selectedMask.Db() : null;
                                Boolean a = e0.a();
                                boolean booleanValue = a != null ? a.booleanValue() : aVar3.n0();
                                WebStoryBox webStoryBox = aVar3.c.u;
                                boolean f = (webStoryBox != null || (webServiceInfo = webStoryBox.i) == null) ? false : epx.f(webServiceInfo.h, bool);
                                yaa0 yaa0Var = new yaa0(null);
                                ArrayList arrayList = new ArrayList();
                                Serializer.c<BackgroundInfo> cVar3 = BackgroundInfo.CREATOR;
                                com.vk.cameraui.impl.a.k0(aVar3, Collections.singletonList(new tam0(yaa0Var, arrayList, true, BackgroundInfo.a.a(), null, z, z2, null, null, null, null, Db, booleanValue, null, null, null, f, null, null, 452496)), false, false, 14);
                                return s3q0.a;
                            }
                        }
                        z2 = true;
                        Mask selectedMask2 = aVar3.b.getSelectedMask();
                        if (selectedMask2 != null) {
                        }
                        Boolean a2 = e0.a();
                        boolean booleanValue2 = a2 != null ? a2.booleanValue() : aVar3.n0();
                        WebStoryBox webStoryBox2 = aVar3.c.u;
                        if (webStoryBox2 != null) {
                        }
                        yaa0 yaa0Var2 = new yaa0(null);
                        ArrayList arrayList2 = new ArrayList();
                        Serializer.c<BackgroundInfo> cVar32 = BackgroundInfo.CREATOR;
                        com.vk.cameraui.impl.a.k0(aVar3, Collections.singletonList(new tam0(yaa0Var2, arrayList2, true, BackgroundInfo.a.a(), null, z, z2, null, null, null, null, Db, booleanValue2, null, null, null, f, null, null, 452496)), false, false, 14);
                        return s3q0.a;
                    }
                }
                z = true;
                y1m0 e02 = aVar3.e0();
                b = e02.b();
                bool = Boolean.TRUE;
                if (!epx.f(b, bool)) {
                }
                z2 = true;
                Mask selectedMask22 = aVar3.b.getSelectedMask();
                if (selectedMask22 != null) {
                }
                Boolean a22 = e02.a();
                boolean booleanValue22 = a22 != null ? a22.booleanValue() : aVar3.n0();
                WebStoryBox webStoryBox22 = aVar3.c.u;
                if (webStoryBox22 != null) {
                }
                yaa0 yaa0Var22 = new yaa0(null);
                ArrayList arrayList22 = new ArrayList();
                Serializer.c<BackgroundInfo> cVar322 = BackgroundInfo.CREATOR;
                com.vk.cameraui.impl.a.k0(aVar3, Collections.singletonList(new tam0(yaa0Var22, arrayList22, true, BackgroundInfo.a.a(), null, z, z2, null, null, null, null, Db, booleanValue22, null, null, null, f, null, null, 452496)), false, false, 14);
                return s3q0.a;
            case 14:
                return ((NewsFeedComponent) ((k7m) m7m.f((ur9) obj2)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 15:
                qcy<Object>[] qcyVarArr = CategoriesFragment.P;
                Bundle requireArguments = ((CategoriesFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("categories_tree", MarketBridgeCategory.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("categories_tree");
                    obj = (MarketBridgeCategory) (parcelable2 instanceof MarketBridgeCategory ? parcelable2 : null);
                }
                return new dka(new um50(new eka((MarketBridgeCategory) obj, i3), new fka(), new gka(), new vm50(), ym50.b, uk50.a.a));
            case 16:
                return (VKEnhancedImageView) ((ViewGroup) ((mxa) obj2).a.getValue()).findViewById(R.id.im_channel_deactivated_img);
            case 17:
                ChannelFragment channelFragment = (ChannelFragment) obj2;
                return new p5u0(channelFragment.p0, new ChannelFragment.h(1, (a3b) channelFragment.H0.getValue(), a3b.class, "updateMessagesContentCompletable", "updateMessagesContentCompletable(Ljava/util/Collection;)Lio/reactivex/rxjava3/core/Completable;", 0));
            case 18:
                int i9 = ClipFeedListFragment.a2;
                return ((ClipFeedListFragment) obj2).qo().Mf();
            case 19:
                ((v1d) obj2).a.a(e5d.b);
                return s3q0.a;
            case 20:
                xwk.d().e().a((Activity) obj2, rkd.c);
                return s3q0.a;
            case 21:
                return (NewsfeedMappersComponent) ((e7m) obj2).b(fpf0.a(NewsfeedMappersComponent.class));
            case 22:
                return ((s9e) obj2).b.getValue().f4();
            case 23:
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                Serializable serializable = ((ClipsGridFragment) obj2).requireArguments().getSerializable("ClipsGridFragment.forced_tab");
                ClipsRouter.GridForcedTab gridForcedTab = serializable instanceof ClipsRouter.GridForcedTab ? (ClipsRouter.GridForcedTab) serializable : null;
                return gridForcedTab == null ? ClipsRouter.GridForcedTab.NONE : gridForcedTab;
            case 24:
                int i10 = ClipsInterestsFragment.Y;
                return Integer.valueOf(((ClipsInterestsFragment) obj2).kn().getResources().getDimensionPixelSize(R.dimen.clips_interests_avatar_size));
            case 25:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) obj2;
                Object obj3 = ClipsOwnerSwipeFragment.k0;
                if (((zof) clipsOwnerSwipeFragment.R.getValue()).H().a()) {
                    return clipsOwnerSwipeFragment.new b();
                }
                return null;
            case 26:
                return ((ClipsConfigViewersComponent) ((g8m) obj2).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 27:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((l9f) obj2)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 28:
                float f2 = ClipsVideoAndPhotoView.e;
                return (VkImageSimple) ((ClipsVideoAndPhotoView) obj2).findViewById(R.id.photo);
            default:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj2;
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return clipsViewerComponentImpl.Jf().a() ? r370.a : new ozj0(g620.f().e(), clipsViewerComponentImpl.Jf());
        }
    }
}
