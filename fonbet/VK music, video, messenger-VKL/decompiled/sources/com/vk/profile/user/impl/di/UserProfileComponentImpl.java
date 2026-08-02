package com.vk.profile.user.impl.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cy20;
import xsna.e1m0;
import xsna.e7m;
import xsna.ep;
import xsna.evq0;
import xsna.f7q0;
import xsna.fd90;
import xsna.fp;
import xsna.fpf0;
import xsna.gwd0;
import xsna.hpf0;
import xsna.jnj0;
import xsna.joz;
import xsna.k4;
import xsna.m1r0;
import xsna.nwy;
import xsna.nyd0;
import xsna.qcy;
import xsna.rh80;
import xsna.std0;
import xsna.syk0;
import xsna.v43;
import xsna.w0o0;
import xsna.wqf0;
import xsna.wrq0;

/* compiled from: UserProfileComponentImpl.kt */
/* loaded from: classes5.dex */
public final class UserProfileComponentImpl implements UserProfileComponent {
    public static final /* synthetic */ qcy<Object>[] m;
    public final BridgeComponent a;
    public final NewsFeedBridgeComponent b;
    public final LinksBridgeComponent c;
    public final nwy h;
    public final nwy k;
    public final nwy d = new nwy(new cy20(17));
    public final nwy e = new nwy(new e1m0(4));
    public final nwy f = new nwy(new w0o0(2));
    public final nwy g = new nwy(new fd90(13));
    public final nwy i = new nwy(new f7q0(1));
    public final nwy j = new nwy(new gwd0(10));
    public final nwy l = new nwy(new wqf0(7));

    /* compiled from: UserProfileComponentImpl.kt */
    public static final class a implements b7m<UserProfileComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new UserProfileComponentImpl((AppContextDiComponent) e7mVar.a(fpf0.a(AppContextDiComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (NewsFeedBridgeComponent) e7mVar.a(fpf0.a(NewsFeedBridgeComponent.class)), (LinksBridgeComponent) e7mVar.a(fpf0.a(LinksBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(UserProfileComponentImpl.class, "profileMetricsCollector", "getProfileMetricsCollector()Lcom/vk/profile/user/impl/analytics/ProfileMetricsCollectorImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        m = new qcy[]{propertyReference1Impl, fp.c(0, UserProfileComponentImpl.class, "onboardingRouter", "getOnboardingRouter()Lcom/vk/profile/user/impl/ui/onboarding/OnboardingRouterImpl;", hpf0Var), ep.a(0, UserProfileComponentImpl.class, "profileActionsFactory", "getProfileActionsFactory()Lcom/vk/profile/user/impl/domain/actions/ProfileActionFactory;", hpf0Var), ep.a(0, UserProfileComponentImpl.class, "silentModeInteractor", "getSilentModeInteractor()Lcom/vk/profile/user/impl/silentmode/SilentModeInteractorImpl;", hpf0Var), ep.a(0, UserProfileComponentImpl.class, "userProfileUtil", "getUserProfileUtil()Lcom/vk/profile/user/impl/util/UserProfileUtilImpl;", hpf0Var), ep.a(0, UserProfileComponentImpl.class, "lkPasskeyRouter", "getLkPasskeyRouter()Lcom/vk/profile/user/impl/ui/passkey/LkPasskeyRouterImpl;", hpf0Var), ep.a(0, UserProfileComponentImpl.class, "usersRxBusProvider", "getUsersRxBusProvider()Lcom/vk/profile/user/api/rxbus/UsersRxBusProvider;", hpf0Var), ep.a(0, UserProfileComponentImpl.class, "statisticsMiniAppRouter", "getStatisticsMiniAppRouter()Lcom/vk/profile/user/api/stat/StatisticsMiniAppRouter;", hpf0Var), ep.a(0, UserProfileComponentImpl.class, "userProfileMainWallContentRepository", "getUserProfileMainWallContentRepository()Lcom/vk/profile/user/api/data/UserProfileMainWallContentRepository;", hpf0Var)};
    }

    public UserProfileComponentImpl(AppContextDiComponent appContextDiComponent, BridgeComponent bridgeComponent, NewsFeedBridgeComponent newsFeedBridgeComponent, LinksBridgeComponent linksBridgeComponent) {
        this.a = bridgeComponent;
        this.b = newsFeedBridgeComponent;
        this.c = linksBridgeComponent;
        this.h = new nwy(new k4(18, appContextDiComponent, this));
        this.k = new nwy(new v43(19, appContextDiComponent, this));
    }

    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final m1r0 D8() {
        qcy<Object> qcyVar = m[6];
        return (m1r0) this.j.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final evq0 Jc() {
        qcy<Object> qcyVar = m[4];
        return (evq0) this.h.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final joz M7() {
        qcy<Object> qcyVar = m[5];
        return (joz) this.i.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final std0 U0() {
        qcy<Object> qcyVar = m[2];
        return (std0) this.f.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final jnj0 X2() {
        qcy<Object> qcyVar = m[3];
        return (jnj0) this.g.c();
    }

    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final wrq0 fa() {
        qcy<Object> qcyVar = m[8];
        return (wrq0) this.l.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final rh80 g3() {
        qcy<Object> qcyVar = m[1];
        return (rh80) this.e.c();
    }

    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final syk0 m3() {
        qcy<Object> qcyVar = m[7];
        return (syk0) this.k.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileComponent
    public final nyd0 mc() {
        qcy<Object> qcyVar = m[0];
        return (nyd0) this.d.c();
    }
}
