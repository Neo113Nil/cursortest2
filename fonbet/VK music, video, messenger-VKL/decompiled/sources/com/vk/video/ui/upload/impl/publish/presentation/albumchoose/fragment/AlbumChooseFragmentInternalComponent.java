package com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.in0;
import xsna.mh;
import xsna.nd1;
import xsna.nh;
import xsna.nwy;
import xsna.pd1;
import xsna.qcy;
import xsna.sv0;

/* compiled from: AlbumChooseFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class AlbumChooseFragmentInternalComponent implements DiScopedComponent<pd1> {
    public static final a g;
    public static final /* synthetic */ qcy<Object>[] h;
    public final pd1 a;
    public final nwy b = new nwy(new in0(this, 1));
    public final nwy c = new nwy(new nd1(0));
    public final nwy d = new nwy(new mh(this, 3));
    public final nwy e = new nwy(new nh(2));
    public final nwy f = new nwy(new sv0(1));

    /* compiled from: AlbumChooseFragmentInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AlbumChooseFragmentInternalComponent.class, "videoFeaturesRepository", "getVideoFeaturesRepository()Lcom/vk/libvideo/api/features/VideoFeaturesRepository;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, AlbumChooseFragmentInternalComponent.class, "publishNetworkApi", "getPublishNetworkApi()Lcom/vk/video/ui/upload/impl/publish/domain/repository/PublishNetworkApi;", hpf0Var), ep.a(0, AlbumChooseFragmentInternalComponent.class, "albumsInteractor", "getAlbumsInteractor()Lcom/vk/video/ui/upload/impl/publish/domain/interactor/AlbumsInteractor;", hpf0Var), ep.a(0, AlbumChooseFragmentInternalComponent.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", hpf0Var), ep.a(0, AlbumChooseFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/ui/upload/impl/publish/presentation/albumchoose/feature/store/AlbumChooseViewStateMapper;", hpf0Var)};
        g = new a();
    }

    public AlbumChooseFragmentInternalComponent(pd1 pd1Var) {
        this.a = pd1Var;
    }
}
