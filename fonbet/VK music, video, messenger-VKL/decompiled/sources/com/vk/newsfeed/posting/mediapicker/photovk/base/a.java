package com.vk.newsfeed.posting.mediapicker.photovk.base;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl.c;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.cell.VkCell;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.msg.BombView;
import com.vk.music.bottomsheets.audiobook.di.AudioBookBottomSheetComponentImpl;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vkontakte.android.R;
import xsna.a4d;
import xsna.ae7;
import xsna.b1r;
import xsna.bmc;
import xsna.bz7;
import xsna.c8f;
import xsna.cfd;
import xsna.d9f;
import xsna.do3;
import xsna.drm0;
import xsna.ekd;
import xsna.fpf0;
import xsna.gzs;
import xsna.ham;
import xsna.i5b;
import xsna.id6;
import xsna.ig3;
import xsna.j7f;
import xsna.k6f;
import xsna.k7m;
import xsna.kke;
import xsna.m7m;
import xsna.nmg0;
import xsna.ow0;
import xsna.pt2;
import xsna.qcy;
import xsna.r5b;
import xsna.rdf;
import xsna.s38;
import xsna.s3q0;
import xsna.st2;
import xsna.t34;
import xsna.tte;
import xsna.v8d;
import xsna.wj6;
import xsna.x6d;
import xsna.xn50;
import xsna.y7f;
import xsna.y7f.g;
import xsna.yh8;
import xsna.zh8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Context mo2getContext;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((wj6) obj).h();
                return s3q0.a;
            case 1:
                ow0 ow0Var = (ow0) obj;
                return new b1r(ow0Var.b.p(), ow0Var.b.F());
            case 2:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj;
                int i3 = AlbumDetailsFragment.p0;
                return albumDetailsFragment.ho().F4().c(albumDetailsFragment.io()).d();
            case 3:
                pt2.a aVar = ((st2) obj).A;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
            case 4:
                ArchiveFragment archiveFragment = (ArchiveFragment) obj;
                int i4 = ArchiveFragment.e0;
                ig3.k.d dVar = ig3.k.d.b;
                archiveFragment.getClass();
                xn50.a.c(archiveFragment, dVar);
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((AttachedClipsState) obj).j().size() < 20);
            case 6:
                return ((AudioBookBottomSheetComponentImpl) obj).a.s();
            case 7:
                ((id6) obj).b.po().scrollToPosition(0);
                return s3q0.a;
            case 8:
                BlacklistFragment blacklistFragment = (BlacklistFragment) obj;
                int i5 = BlacklistFragment.V;
                return new ae7(new t34(blacklistFragment, 2), new do3(blacklistFragment, i2));
            case 9:
                int i6 = BombView.v;
                return new BombView.d((BombView) obj);
            case 10:
                int i7 = BookingNavHostFragment.S;
                return ((BridgeComponent) ((k7m) m7m.f((BookingNavHostFragment) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 11:
                qcy<Object>[] qcyVarArr = BookingStartScreenFragment.S;
                return new bz7((BookingScreenParams) ((BookingStartScreenFragment) obj).O.getValue());
            case 12:
                s38 s38Var = (s38) obj;
                FragmentImpl m = s38Var.g.m();
                if (m != null && (mo2getContext = m.mo2getContext()) != null) {
                    s38Var.h.f(mo2getContext);
                }
                return s3q0.a;
            case 13:
                yh8 yh8Var = (yh8) obj;
                zh8.a aVar2 = zh8.a.a;
                if (yh8Var.s) {
                    yh8Var.p.onNext(aVar2);
                }
                return s3q0.a;
            case 14:
                return (StoriesSettingsComponent) ((nmg0) obj).a(fpf0.a(StoriesSettingsComponent.class));
            case 15:
                i5b i5bVar = (i5b) obj;
                return new r5b(i5bVar, i5bVar.j);
            case 16:
                ChatFragment chatFragment = (ChatFragment) obj;
                ChatFragment.d dVar2 = ChatFragment.w1;
                return new ham(chatFragment.oo(), chatFragment);
            case 17:
                ((bmc) obj).b.a(a4d.b);
                return s3q0.a;
            case 18:
                return (ViewGroup) obj;
            case 19:
                int i8 = ClipFeedListFragment.a2;
                return ((ClipsConfigViewersComponent) m7m.d((ClipFeedListFragment) obj).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 20:
                ((x6d) obj).e.a.a(ClipItemViewEvent.b.b);
                return s3q0.a;
            case 21:
                cfd cfdVar = (cfd) obj;
                return new cfd.a(cfdVar, (v8d) cfdVar.z0.getValue());
            case 22:
                return (VkCell) ((View) obj).findViewById(R.id.clips_authors_cell);
            case 23:
                return ((BridgeComponent) ((ekd) obj).m.getValue()).x();
            case 24:
                ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem = (ClipsCoauthorSelectorUserItem) obj;
                Parcelable.Creator<ClipsCoauthorSelectorUserItem> creator = ClipsCoauthorSelectorUserItem.CREATOR;
                return drm0.r0(clipsCoauthorSelectorUserItem.c + ' ' + clipsCoauthorSelectorUserItem.d).toString();
            case 25:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((kke) obj)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 26:
                tte.c cVar = tte.o1;
                return (ClipsPlaylistsComponentImpl) ((k7m) m7m.f((tte) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 27:
                y7f y7fVar = (y7f) obj;
                k6f k6fVar = y7fVar.a;
                Context B = k6fVar.B();
                j7f j7fVar = y7fVar.b;
                return new c8f(B, (d9f) j7fVar.a.getValue(), k6fVar.hd(), y7fVar.new g(), j7fVar);
            case 28:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj;
                String str = ClipsUploadFragmentImpl.a0;
                return new rdf(clipsUploadFragmentImpl.requireContext(), clipsUploadFragmentImpl, clipsUploadFragmentImpl.getParentFragmentManager(), m7m.d(clipsUploadFragmentImpl));
            default:
                qcy<Object>[] qcyVarArr2 = ClipsViewersSdkComponentImpl.l;
                return ((ClipsViewersSdkComponentImpl) obj).new c();
        }
    }
}
