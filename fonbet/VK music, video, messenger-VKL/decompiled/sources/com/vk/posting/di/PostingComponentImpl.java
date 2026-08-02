package com.vk.posting.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.clc0;
import xsna.cp3;
import xsna.d14;
import xsna.dac0;
import xsna.e7m;
import xsna.ek;
import xsna.ep;
import xsna.fhc0;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.ilc0;
import xsna.msy;
import xsna.nwy;
import xsna.o6;
import xsna.p6y;
import xsna.qcy;
import xsna.uq50;
import xsna.vt30;
import xsna.w2a0;
import xsna.x850;
import xsna.xs6;
import xsna.y2t0;
import xsna.yj1;

/* compiled from: PostingComponentImpl.kt */
/* loaded from: classes2.dex */
public final class PostingComponentImpl implements PostingComponent {
    public static final /* synthetic */ qcy<Object>[] j;
    public final Object a;
    public final Object b;
    public final nwy c = new nwy(new o6(25));
    public final nwy d = new nwy(new xs6(21));
    public final nwy e = new nwy(new d14(23));
    public final nwy f = new nwy(new p6y(this, 25));
    public final nwy g = new nwy(new w2a0(2));
    public final nwy h = new nwy(new ek(24));
    public final nwy i = new nwy(new dac0(this, 1));

    /* compiled from: PostingComponentImpl.kt */
    public static final class a implements b7m<PostingComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            uq50 uq50Var = new uq50(e7mVar, 19);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new PostingComponentImpl(msy.a(lazyThreadSafetyMode, uq50Var), msy.a(lazyThreadSafetyMode, new x850(e7mVar, 14)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PostingComponentImpl.class, "postingRouter", "getPostingRouter()Lcom/vk/posting/PostingRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        j = new qcy[]{propertyReference1Impl, fp.c(0, PostingComponentImpl.class, "articleRepository", "getArticleRepository()Lcom/vk/posting/domain/repository/ArticlePickerRepository;", hpf0Var), ep.a(0, PostingComponentImpl.class, "albumRepository", "getAlbumRepository()Lcom/vk/posting/domain/repository/AlbumPickerRepository;", hpf0Var), ep.a(0, PostingComponentImpl.class, "videoRepository", "getVideoRepository()Lcom/vk/posting/domain/repository/VideoPickerRepository;", hpf0Var), ep.a(0, PostingComponentImpl.class, "extendedProfilesRepository", "getExtendedProfilesRepository()Lcom/vk/repository/data/api/ExtendedProfilesRepository;", hpf0Var), ep.a(0, PostingComponentImpl.class, "metricsCollector", "getMetricsCollector()Lcom/vk/posting/domain/PostingMetricsCollector;", hpf0Var), ep.a(0, PostingComponentImpl.class, "postingRepository", "getPostingRepository()Lcom/vk/posting/domain/repository/PostingRepository;", hpf0Var), ep.a(0, PostingComponentImpl.class, "postingInteractor", "getPostingInteractor()Lcom/vk/posting/domain/PostingInteractor;", hpf0Var)};
    }

    public PostingComponentImpl(Lazy<? extends NewsfeedMappersComponent> lazy, Lazy<? extends VideoApiHelperComponent> lazy2) {
        this.a = lazy;
        this.b = lazy2;
        new nwy(new vt30(this, 20));
    }

    @Override // com.vk.posting.di.PostingComponent
    public final ExtendedProfilesRepository C() {
        qcy<Object> qcyVar = j[4];
        return (ExtendedProfilesRepository) this.g.c();
    }

    @Override // com.vk.posting.di.PostingComponent
    public final yj1 Fa() {
        qcy<Object> qcyVar = j[2];
        return (yj1) this.e.c();
    }

    @Override // com.vk.posting.di.PostingComponent
    public final clc0 G4() {
        qcy<Object> qcyVar = j[6];
        return (clc0) this.i.c();
    }

    @Override // com.vk.posting.di.PostingComponent
    public final fhc0 H6() {
        qcy<Object> qcyVar = j[5];
        return (fhc0) this.h.c();
    }

    @Override // com.vk.posting.di.PostingComponent
    public final ilc0 W9() {
        qcy<Object> qcyVar = j[0];
        return (ilc0) this.c.c();
    }

    @Override // com.vk.posting.di.PostingComponent
    public final y2t0 c8() {
        qcy<Object> qcyVar = j[3];
        return (y2t0) this.f.c();
    }

    @Override // com.vk.posting.di.PostingComponent
    public final cp3 d0() {
        qcy<Object> qcyVar = j[1];
        return (cp3) this.d.c();
    }
}
