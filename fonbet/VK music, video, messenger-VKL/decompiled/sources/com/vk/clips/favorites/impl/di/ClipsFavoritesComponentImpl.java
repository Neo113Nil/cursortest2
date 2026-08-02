package com.vk.clips.favorites.impl.di;

import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.movika.sdk.base.logic.interactor.b;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.ui.g0;
import com.vk.movika.sdk.base.ui.v;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.c5e;
import xsna.d2;
import xsna.e4e;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.hy2;
import xsna.iy2;
import xsna.j5e;
import xsna.m5e;
import xsna.msy;
import xsna.nwy;
import xsna.oo;
import xsna.qcy;
import xsna.s5e;
import xsna.t61;
import xsna.u5e;
import xsna.wm1;

/* compiled from: ClipsFavoritesComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsFavoritesComponentImpl implements ClipsFavoritesComponent {
    public static final /* synthetic */ qcy<Object>[] l;
    public final Object a;
    public final nwy b = new nwy(new d2(7));
    public final nwy c = new nwy(new v(8));
    public final nwy d = new nwy(new b(this, 19));
    public final nwy e = new nwy(new t61(11));
    public final nwy f = new nwy(new hy2(5));
    public final nwy g = new nwy(new g0(12));
    public final nwy h = new nwy(new iy2(10));
    public final nwy i = new nwy(new oo(this, 18));
    public final nwy j = new nwy(new h(this, 18));
    public final nwy k = new nwy(new wm1(this, 17));

    /* compiled from: ClipsFavoritesComponentImpl.kt */
    public static final class a implements b7m<ClipsFavoritesComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsFavoritesComponentImpl(msy.a(LazyThreadSafetyMode.NONE, new j(e7mVar, 21)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsFavoritesComponentImpl.class, "favoritesNavigatorFactory", "getFavoritesNavigatorFactory()Lcom/vk/clips/favorites/api/ClipsFavoritesNavigatorFactory;", 0);
        hpf0 hpf0Var = fpf0.a;
        l = new qcy[]{propertyReference1Impl, fp.c(0, ClipsFavoritesComponentImpl.class, "launcher", "getLauncher()Lcom/vk/clips/favorites/api/ClipsFavoritesLauncher;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "interactor", "getInteractor()Lcom/vk/clips/favorites/api/ClipsFavoritesInteractor;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "shortVideoService", "getShortVideoService()Lcom/vk/internal/api/shortVideo/ShortVideoService;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "wallService", "getWallService()Lcom/vk/internal/api/wall/WallService;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "clipsFavoritesEventsSourceImpl", "getClipsFavoritesEventsSourceImpl()Lcom/vk/clips/favorites/impl/domain/ClipsFavoritesEventsSourceImpl;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "clipsFavoritesResponseMapper", "getClipsFavoritesResponseMapper()Lcom/vk/clips/favorites/impl/data/mapping/ClipsFavoritesContentResponseMapper;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "wallGetByIdResponseDtoToNewsEntryMapper", "getWallGetByIdResponseDtoToNewsEntryMapper()Lcom/vk/mapper/newsfeed/wallget/WallGetByIdResponseDtoToNewsEntryMapper;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "snackbarLauncher", "getSnackbarLauncher$impl_release()Lcom/vk/clips/favorites/impl/ui/snackbar/ClipsFavoritesSnackbarLauncher;", hpf0Var), ep.a(0, ClipsFavoritesComponentImpl.class, "repository", "getRepository$impl_release()Lcom/vk/clips/favorites/impl/data/ClipsFavoritesRepository;", hpf0Var)};
    }

    public ClipsFavoritesComponentImpl(Lazy<? extends NewsfeedMappersComponent> lazy) {
        this.a = lazy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e4e Df() {
        qcy<Object> qcyVar = l[5];
        return (e4e) this.g.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s5e Ef() {
        qcy<Object> qcyVar = l[9];
        return (s5e) this.k.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u5e Ff() {
        qcy<Object> qcyVar = l[8];
        return (u5e) this.j.c();
    }

    @Override // com.vk.clips.favorites.api.di.ClipsFavoritesComponent
    public final c5e b() {
        qcy<Object> qcyVar = l[2];
        return (c5e) this.d.c();
    }

    @Override // com.vk.clips.favorites.api.di.ClipsFavoritesComponent
    public final m5e b8() {
        qcy<Object> qcyVar = l[0];
        return (m5e) this.b.c();
    }

    @Override // com.vk.clips.favorites.api.di.ClipsFavoritesComponent
    public final j5e e() {
        qcy<Object> qcyVar = l[1];
        return (j5e) this.c.c();
    }
}
