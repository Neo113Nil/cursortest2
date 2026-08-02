package com.vk.clips.interests.impl.di;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.di.component.DiScopedComponent;
import defpackage.r;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cie;
import xsna.eie;
import xsna.ep;
import xsna.ewy;
import xsna.f1;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hhe;
import xsna.hpf0;
import xsna.i70;
import xsna.i9;
import xsna.j70;
import xsna.l9;
import xsna.nwy;
import xsna.pd4;
import xsna.pge;
import xsna.pr0;
import xsna.pr1;
import xsna.pwj0;
import xsna.qc;
import xsna.qcy;
import xsna.qhe;
import xsna.qo0;
import xsna.t5;
import xsna.uge;
import xsna.uz;
import xsna.x0;
import xsna.xge;

/* compiled from: ClipsInterestsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsInterestsComponentImpl implements ClipsInterestsComponent {
    public static final /* synthetic */ qcy<Object>[] o;
    public final nwy a = new nwy(new i70(this, 23));
    public final nwy b = new nwy(new pd4(3));
    public final nwy c = new nwy(new t5(this, 27));
    public final nwy d = new nwy(new qo0(6));
    public final nwy e = new nwy(new f1(this, 20));
    public final nwy f = new nwy(new l9(7));
    public final nwy g = new nwy(new j70(this, 24));
    public final nwy h = new nwy(new r(this, 29));
    public final nwy i = new nwy(new pr0(8));
    public final ewy j = new ewy(new x0(6));
    public final nwy k = new nwy(new uz(6));
    public final nwy l = new nwy(new pr1(7));
    public final ewy m = new ewy(new i9(14));
    public final ewy n = new ewy(new qc(this, 19));

    /* compiled from: ClipsInterestsComponentImpl.kt */
    public static final class a implements c8m<ClipsInterestsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsInterestsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsInterestsComponentImpl.class, "interestsInteractor", "getInterestsInteractor()Lcom/vk/clips/interests/api/ClipsInterestsInteractor;", 0);
        hpf0 hpf0Var = fpf0.a;
        o = new qcy[]{propertyReference1Impl, fp.c(0, ClipsInterestsComponentImpl.class, "interestsNavigatorProvider", "getInterestsNavigatorProvider()Lcom/vk/clips/interests/api/ClipsInterestsNavigatorProvider;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "interestsRepository", "getInterestsRepository$impl_release()Lcom/vk/clips/interests/impl/domain/ClipsInterestsRepository;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "statReporter", "getStatReporter$impl_release()Lcom/vk/clips/interests/impl/stat/ClipsInterestsStatReporter;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "interestsLauncherImpl", "getInterestsLauncherImpl()Lcom/vk/clips/interests/impl/navigation/ClipsInterestsLauncherImpl;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "interestsStatusHolder", "getInterestsStatusHolder()Lcom/vk/clips/interests/impl/domain/ClipsInterestsStatusHolder;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "interestsMemoryStorage", "getInterestsMemoryStorage()Lcom/vk/clips/interests/impl/data/storage/memory/ClipsInterestsMemoryStorage;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "interestsUserRecomRemoteStorage", "getInterestsUserRecomRemoteStorage()Lcom/vk/clips/interests/impl/data/storage/remote/ClipsInterestsRemoteStorage;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "usersRecominterestsDtoMapper", "getUsersRecominterestsDtoMapper()Lcom/vk/clips/interests/impl/data/storage/remote/mapper/ClipsUsersRecomInterestsDtoMapper;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "interestsRepositoryMapper", "getInterestsRepositoryMapper()Lcom/vk/clips/interests/impl/data/mapper/ClipsInterestsRepositoryMapper;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "interestsSchedulers", "getInterestsSchedulers()Lcom/vk/clips/interests/impl/rx/ClipsInterestsSchedulers;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "assetsRepository", "getAssetsRepository()Lcom/vk/clips/interests/impl/data/AssetsRepository;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "nestedInterestsLauncherImpl", "getNestedInterestsLauncherImpl()Lcom/vk/clips/interests/impl/navigation/ClipsNestedInterestsLauncher;", hpf0Var), ep.a(0, ClipsInterestsComponentImpl.class, "nestedInterestsOnboardingLauncher", "getNestedInterestsOnboardingLauncher()Lcom/vk/clips/interests/impl/navigation/ClipsNestedInterestsOnboardingLauncherImpl;", hpf0Var)};
    }

    public final qhe Df() {
        qcy<Object> qcyVar = o[2];
        return (qhe) this.c.c();
    }

    public final cie Ef() {
        qcy<Object> qcyVar = o[3];
        return (cie) this.d.c();
    }

    @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
    public final hhe Rd() {
        qcy<Object> qcyVar = o[1];
        return (hhe) this.b.c();
    }

    @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
    public final pge Re() {
        qcy<Object> qcyVar = o[0];
        return (pge) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
    public final uge e() {
        qcy<Object> qcyVar = o[4];
        return (xge) this.e.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
    public final ClipsInterestsStatusProvider n5() {
        qcy<Object> qcyVar = o[5];
        return (eie) this.f.c();
    }
}
