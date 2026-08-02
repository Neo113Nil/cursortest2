package com.vk.onboardingscreens.impl.di;

import com.ironsource.X3;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.sdk.base.logic.interactor.g;
import com.vk.onboardingscreens.api.di.OnboardingScreensComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ant;
import xsna.b7m;
import xsna.dzq0;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.lk;
import xsna.lo10;
import xsna.nwy;
import xsna.om60;
import xsna.qcy;
import xsna.wf40;
import xsna.x850;
import xsna.xyq0;

/* compiled from: OnboardingScreensComponentImpl.kt */
/* loaded from: classes4.dex */
public final class OnboardingScreensComponentImpl implements OnboardingScreensComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final AuthBridgeComponent a;
    public final nwy b = new nwy(new om60(3));
    public final nwy c = new nwy(new x850(this, 3));
    public final nwy d = new nwy(new g(26));
    public final nwy e = new nwy(new wf40(this, 5));
    public final ewy f = new ewy(new lo10(this, 9));
    public final ewy g = new ewy(new lk(28));

    /* compiled from: OnboardingScreensComponentImpl.kt */
    public static final class a implements b7m<OnboardingScreensComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new OnboardingScreensComponentImpl((AuthBridgeComponent) e7mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OnboardingScreensComponentImpl.class, X3.a.k, "getStorage()Lcom/vk/onboardingscreens/impl/recomthemes/data/UserRecomThemesStorage;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, OnboardingScreensComponentImpl.class, "localRepository", "getLocalRepository()Lcom/vk/onboardingscreens/impl/recomthemes/domain/repository/UserRecomThemesLocalRepository;", hpf0Var), ep.a(0, OnboardingScreensComponentImpl.class, "remoteRepository", "getRemoteRepository()Lcom/vk/onboardingscreens/impl/recomthemes/domain/repository/UserRecomThemesRemoteRepository;", hpf0Var), ep.a(0, OnboardingScreensComponentImpl.class, "userRecomThemesInteractor", "getUserRecomThemesInteractor()Lcom/vk/onboardingscreens/api/recomthemes/domain/interactor/UserRecomThemesInteractor;", hpf0Var), ep.a(0, OnboardingScreensComponentImpl.class, "userRecomThemesRouter", "getUserRecomThemesRouter()Lcom/vk/onboardingscreens/api/recomthemes/domain/router/UserRecomThemesRouter;", hpf0Var), ep.a(0, OnboardingScreensComponentImpl.class, "geoRequestRouter", "getGeoRequestRouter()Lcom/vk/onboardingscreens/api/georequest/domain/router/GeoRequestRouter;", hpf0Var)};
    }

    public OnboardingScreensComponentImpl(AuthBridgeComponent authBridgeComponent) {
        this.a = authBridgeComponent;
    }

    @Override // com.vk.onboardingscreens.api.di.OnboardingScreensComponent
    public final ant J5() {
        qcy<Object> qcyVar = h[5];
        return (ant) this.g.c();
    }

    @Override // com.vk.onboardingscreens.api.di.OnboardingScreensComponent
    public final xyq0 Ye() {
        qcy<Object> qcyVar = h[3];
        return (xyq0) this.e.c();
    }

    @Override // com.vk.onboardingscreens.api.di.OnboardingScreensComponent
    public final dzq0 a2() {
        qcy<Object> qcyVar = h[4];
        return (dzq0) this.f.c();
    }
}
