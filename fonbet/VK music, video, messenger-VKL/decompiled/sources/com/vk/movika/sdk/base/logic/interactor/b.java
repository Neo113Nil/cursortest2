package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.ads.api.di.AdsComponent;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;
import com.vk.clips.design.view.stikers.ClipsStickerDeleteAreaView;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.movika.sdk.base.logic.dto.a;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.anj;
import xsna.b96;
import xsna.bnc;
import xsna.cih;
import xsna.dvq0;
import xsna.e43;
import xsna.e4e;
import xsna.f8m0;
import xsna.fpf0;
import xsna.go9;
import xsna.gzs;
import xsna.h5e;
import xsna.hjh;
import xsna.hyd;
import xsna.i1j;
import xsna.iz8;
import xsna.j96;
import xsna.j9f;
import xsna.k7m;
import xsna.m7m;
import xsna.mdu0;
import xsna.nag;
import xsna.nwy;
import xsna.qcy;
import xsna.r4i;
import xsna.s3q0;
import xsna.s5e;
import xsna.t61;
import xsna.td5;
import xsna.trb;
import xsna.u59;
import xsna.u5e;
import xsna.u76;
import xsna.ud5;
import xsna.v450;
import xsna.vik;
import xsna.vtk0;
import xsna.xa80;
import xsna.xn50;
import xsna.y7f;
import xsna.ynh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Context context, AvatarView avatarView) {
        this.b = 4;
        this.c = avatarView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return go9.b("Can not handle! action.name = ", ((a.AbstractC1294a) obj).a);
            case 1:
                return ((com.vk.clips.sdk.shared.item.ads.c) obj).k.c();
            case 2:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj;
                int i2 = AlbumDetailsFragment.p0;
                a.j.AbstractC1478a.b bVar = a.j.AbstractC1478a.b.b;
                albumDetailsFragment.getClass();
                xn50.a.c(albumDetailsFragment, bVar);
                return s3q0.a;
            case 3:
                AuthorsCatalogRootVh authorsCatalogRootVh = (AuthorsCatalogRootVh) obj;
                vtk0.d().d(authorsCatalogRootVh.R(), new v450(new ud5(authorsCatalogRootVh, 0), new td5(authorsCatalogRootVh, 0)));
                return s3q0.a;
            case 4:
                AvatarView.a aVar = AvatarView.y;
                return new mdu0(((AvatarView) obj).w);
            case 5:
                int i3 = BaseAttachPickerFragment.y0;
                return new BaseAttachPickerFragment.f((BaseAttachPickerFragment) obj);
            case 6:
                j96 j96Var = (j96) obj;
                return new f8m0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) j96Var.e.invoke(), j96Var.d.b);
            case 7:
                com.vk.auth.verification.base.c cVar = (com.vk.auth.verification.base.c) ((com.vk.auth.verification.base.b) obj).a;
                if (cVar != null) {
                    cVar.e();
                }
                return s3q0.a;
            case 8:
                int i4 = BasePhotoListFragment.m0;
                return new BasePhotoListFragment.b((BasePhotoListFragment) obj);
            case 9:
                return CallModuleImpl.h((CallModuleImpl) obj);
            case 10:
                u59 u59Var = (u59) obj;
                int i5 = VoipMainMenuActionsFragment.V;
                u59Var.c(VoipMainMenuActionsFragment.a.a(u59Var), true);
                return s3q0.a;
            case 11:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                iz8 Q = cameraUIView.Q(false);
                View view = cameraUIView.c1;
                if (view != null) {
                    view.setBackgroundTintList(Q.d > cameraUIView.A ? anj.b(R.color.vk_white_alpha15, e43.a) : anj.b(R.color.vk_black_alpha60, e43.a));
                }
                return s3q0.a;
            case 12:
                int i6 = ChannelFragment.a1;
                return ((ImRxEventObserverComponent) m7m.d((ChannelFragment) obj).a(fpf0.a(ImRxEventObserverComponent.class))).l();
            case 13:
                return (ViewGroup) ((ViewStub) ((trb) obj).b.findViewById(R.id.dialog_header_container_stub)).inflate();
            case 14:
                qcy<Object>[] qcyVarArr = ClipCtaWithDonutFragment.T;
                return ((LinksBridgeComponent) m7m.d((ClipCtaWithDonutFragment) obj).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 15:
                return Boolean.valueOf(((ClipFeedTab) obj).Cb());
            case 16:
                return new bnc((BridgeComponent) obj);
            case 17:
                return (ClipsStickerDeleteAreaView) ((hyd) obj).i().findViewById(R.id.video_fullscreen_stickers_delete_area);
            case 18:
                int i7 = ClipsEntryPointsFragment.i0;
                ClipsEntryPointsParams jo = ((ClipsEntryPointsFragment) obj).jo();
                return Boolean.valueOf(jo != null ? jo.f : false);
            case 19:
                ClipsFavoritesComponentImpl clipsFavoritesComponentImpl = (ClipsFavoritesComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                s5e Ef = clipsFavoritesComponentImpl.Ef();
                u5e Ff = clipsFavoritesComponentImpl.Ff();
                nwy nwyVar = clipsFavoritesComponentImpl.g;
                qcy<Object> qcyVar = ClipsFavoritesComponentImpl.l[5];
                return new h5e(Ef, Ff, (e4e) nwyVar.c());
            case 20:
                int i8 = ClipsPlaylistPickerFragment.V;
                return Boolean.valueOf(((ClipsPlaylistPickerParams) ((ClipsPlaylistPickerFragment) obj).S.getValue()).G8());
            case 21:
                j9f j9fVar = (j9f) obj;
                return new vik(y7f.this.a.B(), new t61(13), j9fVar.b, new j9f.a(j9fVar));
            case 22:
                return ((AdsComponent) ((k7m) m7m.f((nag) obj)).mo408a(fpf0.a(AdsComponent.class))).h9();
            case 23:
                return ((SearchParamsComponent) ((k7m) m7m.f((CommunitiesCatalogRootVh) obj)).a(fpf0.a(SearchParamsComponent.class))).Db();
            case 24:
                xa80 xa80Var = (xa80) obj;
                if (xa80Var != null) {
                    xa80Var.b();
                }
                return s3q0.a;
            case 25:
                return new hjh(((cih) obj).d);
            case 26:
                return (dvq0) ((ynh) obj).B0.getValue();
            case 27:
                ((r4i) obj).c.a();
                return s3q0.a;
            case 28:
                return ((i1j) obj).c.findViewById(R.id.voip_room_participant_load_retry_button);
            default:
                int i9 = CreateAlbumFragment.Z;
                return ((PhotosComponent) m7m.d((CreateAlbumFragment) obj).a(fpf0.a(PhotosComponent.class))).z8();
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
