package com.vk.photos.root.di;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.common.a;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ag6;
import xsna.ag7;
import xsna.bg6;
import xsna.bj1;
import xsna.c24;
import xsna.c8m;
import xsna.ch1;
import xsna.cia;
import xsna.dia;
import xsna.e550;
import xsna.eha0;
import xsna.el1;
import xsna.ep;
import xsna.ewy;
import xsna.exw;
import xsna.f8a0;
import xsna.fb8;
import xsna.fp;
import xsna.fpf0;
import xsna.g67;
import xsna.g8m;
import xsna.gzs;
import xsna.hpf0;
import xsna.k03;
import xsna.kb8;
import xsna.m15;
import xsna.mpn0;
import xsna.nwy;
import xsna.oca0;
import xsna.oga0;
import xsna.p5m;
import xsna.phx;
import xsna.pwj0;
import xsna.qcy;
import xsna.qfa0;
import xsna.qga0;
import xsna.r;
import xsna.rwe;
import xsna.s0e0;
import xsna.s65;
import xsna.sb8;
import xsna.vi3;
import xsna.x7a0;
import xsna.xsa;
import xsna.zf6;

/* compiled from: PhotosComponentImpl.kt */
/* loaded from: classes.dex */
public final class PhotosComponentImpl implements PhotosComponent {
    public static final /* synthetic */ qcy<Object>[] u;
    public final nwy a;
    public final nwy b;
    public final nwy l;
    public final nwy r;
    public final nwy c = new nwy(new rwe(8));
    public final nwy d = new nwy(new g67(this, 5));
    public final nwy e = new nwy(new zf6(this, 11));
    public final nwy f = new nwy(new ag6(this, 8));
    public final nwy g = new nwy(new bg6(this, 10));
    public final nwy h = new nwy(new xsa(this, 8));
    public final nwy i = new nwy(new s65(9));
    public final nwy j = new nwy(new c24(8));
    public final nwy k = new nwy(new kb8(this, 7));
    public final nwy m = new nwy(new p5m(5));
    public final nwy n = new nwy(new m15(this, 9));
    public final nwy o = new nwy(new cia(this, 8));
    public final ewy p = new ewy(new dia(this, 6));
    public final nwy q = new nwy(new k03(9));
    public final nwy s = new nwy(new sb8(this, 6));
    public final ewy t = new ewy(new ag7(4));

    /* compiled from: PhotosComponentImpl.kt */
    public static final class a implements c8m<PhotosComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PhotosComponentImpl(this.a, (BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class)), (NewsFeedBridgeComponent) g8mVar.a(fpf0.a(NewsFeedBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PhotosComponentImpl.class, "photosUtils", "getPhotosUtils()Lcom/vk/photos/root/util/PhotosUtils;", 0);
        hpf0 hpf0Var = fpf0.a;
        u = new qcy[]{propertyReference1Impl, fp.c(0, PhotosComponentImpl.class, "profileUtils", "getProfileUtils()Lcom/vk/photos/root/util/ProfileUtils;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumPrivacyUtil", "getAlbumPrivacyUtil()Lcom/vk/profile/core/util/AlbumPrivacyUtil;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumUtils", "getAlbumUtils()Lcom/vk/photos/root/util/AlbumUtils;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photoFlowRepository", "getPhotoFlowRepository()Lcom/vk/photos/root/photoflow/domain/PhotoFlowRepository;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photoFlowInteractor", "getPhotoFlowInteractor()Lcom/vk/photos/root/photoflow/domain/PhotoFlowInteractor;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumsRepositoryImpl", "getAlbumsRepositoryImpl()Lcom/vk/photos/root/albums/data/AlbumsRepositoryImpl;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumsRepository", "getAlbumsRepository()Lcom/vk/photos/root/photoflow/domain/AlbumsRepository;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photosRxBusProvider", "getPhotosRxBusProvider()Lcom/vk/photos/root/rxbus/PhotosRxBusProvider;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photoTagsRepository", "getPhotoTagsRepository()Lcom/vk/photos/root/photoflow/domain/PhotoTagsRepository;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photoTagsInteractor", "getPhotoTagsInteractor()Lcom/vk/photos/root/photoflow/domain/PhotoTagsInteractor;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photoUploadInteractorFactory", "getPhotoUploadInteractorFactory()Lcom/vk/photos/root/common/PhotoUploadInteractor$Factory;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumPrivacyRepository", "getAlbumPrivacyRepository()Lcom/vk/photos/root/photoflow/domain/SystemAlbumPrivacyRepository;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photosRepository", "getPhotosRepository()Lcom/vk/photos/root/common/PhotosRepository;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumDetailsRepository", "getAlbumDetailsRepository()Lcom/vk/photos/root/albumdetails/domain/AlbumDetailsRepository;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumDetailsInteractor", "getAlbumDetailsInteractor()Lcom/vk/photos/root/albumdetails/domain/AlbumDetailsInteractor;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "albumPhotoEventsHandler", "getAlbumPhotoEventsHandler()Lcom/vk/photos/root/albums/domain/AlbumPhotoEventsHandler;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photosRouter", "getPhotosRouter()Lcom/vk/photos/root/PhotosRouter;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "archiveRepository", "getArchiveRepository()Lcom/vk/photos/root/photoflow/domain/ArchiveRepository;", hpf0Var), ep.a(0, PhotosComponentImpl.class, "photosMetricsCollector", "getPhotosMetricsCollector()Lcom/vk/photos/root/analytics/PhotosMetricsCollector;", hpf0Var)};
    }

    public PhotosComponentImpl(final Context context, final BridgeComponent bridgeComponent, NewsFeedBridgeComponent newsFeedBridgeComponent) {
        this.a = new nwy(new exw(context, 2));
        this.b = new nwy(new fb8(bridgeComponent, 8));
        this.l = new nwy(new gzs() { // from class: xsna.mea0
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new a.C1500a(context, bridgeComponent.s());
            }
        });
        this.r = new nwy(new phx(1, bridgeComponent, newsFeedBridgeComponent));
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final bj1 D7() {
        qcy<Object> qcyVar = u[16];
        return (bj1) this.q.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final qfa0 F4() {
        qcy<Object> qcyVar = u[19];
        return (qfa0) this.t.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final ch1 G6() {
        qcy<Object> qcyVar = u[15];
        return (ch1) this.p.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final oca0 J3() {
        qcy<Object> qcyVar = u[10];
        return (oca0) this.k.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final x7a0 L9() {
        qcy<Object> qcyVar = u[5];
        return (x7a0) this.f.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final eha0 Od() {
        qcy<Object> qcyVar = u[0];
        return (eha0) this.a.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final vi3 Y5() {
        qcy<Object> qcyVar = u[18];
        return (vi3) this.s.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final el1 d3() {
        qcy<Object> qcyVar = u[3];
        return (el1) this.d.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final AlbumsRepository i3() {
        qcy<Object> qcyVar = u[7];
        return (AlbumsRepository) this.h.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final gzs<FragmentImpl> m2(UserId userId) {
        return b.A.a(Features.Type.FEATURE_CORE_VK_PHOTO_PICKER) ? new e550(userId, 7) : new r(23);
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final PhotoUploadInteractor.a o5() {
        qcy<Object> qcyVar = u[11];
        return (PhotoUploadInteractor.a) this.l.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final qga0 p7() {
        qcy<Object> qcyVar = u[8];
        return (qga0) this.i.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final f8a0 r1() {
        qcy<Object> qcyVar = u[4];
        return (f8a0) this.e.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final oga0 r4() {
        qcy<Object> qcyVar = u[17];
        return (oga0) this.r.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final mpn0 t9() {
        qcy<Object> qcyVar = u[12];
        return (mpn0) this.m.c();
    }

    @Override // com.vk.photos.root.di.PhotosComponent
    public final s0e0 z8() {
        qcy<Object> qcyVar = u[1];
        return (s0e0) this.b.c();
    }
}
