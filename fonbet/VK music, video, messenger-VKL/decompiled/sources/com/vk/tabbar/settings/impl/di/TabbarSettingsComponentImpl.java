package com.vk.tabbar.settings.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.menu.di.MenuComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn;
import xsna.bpf;
import xsna.c8m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gbl;
import xsna.hbl;
import xsna.hpf0;
import xsna.j55;
import xsna.jwn0;
import xsna.k55;
import xsna.kun0;
import xsna.mun0;
import xsna.nwy;
import xsna.pvn0;
import xsna.pwj0;
import xsna.qcy;
import xsna.rvn0;
import xsna.s12;
import xsna.u94;
import xsna.utn0;
import xsna.wwn0;
import xsna.z58;

/* compiled from: TabbarSettingsComponentImpl.kt */
/* loaded from: classes11.dex */
public final class TabbarSettingsComponentImpl implements TabbarSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] p;
    public final SessionManagementComponent a;
    public final MenuComponent b;
    public final TabbarCoreComponent c;
    public final DataRepositoryComponent d;
    public final AuthBridgeComponent e;
    public final InfoBridgeComponent f;
    public final ewy g = new ewy(new s12(8));
    public final ewy h = new ewy(new bpf(this, 5));
    public final nwy i = new nwy(new j55(12));
    public final nwy j = new nwy(new k55(7));
    public final nwy k = new nwy(new u94(8));
    public final nwy l = new nwy(new bn(this, 5));
    public final nwy m = new nwy(new gbl(this, 3));
    public final nwy n = new nwy(new hbl(this, 3));
    public final nwy o = new nwy(new z58(10));

    /* compiled from: TabbarSettingsComponentImpl.kt */
    public static final class a implements c8m<TabbarSettingsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new TabbarSettingsComponentImpl((SessionManagementComponent) g8mVar.a(fpf0.a(SessionManagementComponent.class)), (MenuComponent) g8mVar.a(fpf0.a(MenuComponent.class)), (TabbarCoreComponent) g8mVar.a(fpf0.a(TabbarCoreComponent.class)), (DataRepositoryComponent) g8mVar.a(fpf0.a(DataRepositoryComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (InfoBridgeComponent) g8mVar.a(fpf0.a(InfoBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(TabbarSettingsComponentImpl.class, "tabbarSettingsRouter", "getTabbarSettingsRouter()Lcom/vk/tabbar/settings/api/TabbarSettingsRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        p = new qcy[]{propertyReference1Impl, fp.c(0, TabbarSettingsComponentImpl.class, "tabbarHiddenTabsHintDelegate", "getTabbarHiddenTabsHintDelegate()Lcom/vk/tabbar/settings/api/TabbarHiddenTabsHintDelegate;", hpf0Var), ep.a(0, TabbarSettingsComponentImpl.class, "tabbarSettingsAnalytics", "getTabbarSettingsAnalytics()Lcom/vk/tabbar/settings/api/TabbarSettingsAnalytics;", hpf0Var), ep.a(0, TabbarSettingsComponentImpl.class, "tabbarSettingsResponseMapper", "getTabbarSettingsResponseMapper()Lcom/vk/tabbar/settings/impl/mapper/TabbarSettingsResponseMapper;", hpf0Var), ep.a(0, TabbarSettingsComponentImpl.class, "tabbarSettingsRepository", "getTabbarSettingsRepository()Lcom/vk/tabbar/settings/impl/TabbarSettingsRepository;", hpf0Var), ep.a(0, TabbarSettingsComponentImpl.class, "tabbarSettingsInteractor", "getTabbarSettingsInteractor()Lcom/vk/tabbar/settings/api/TabbarSettingsInteractor;", hpf0Var), ep.a(0, TabbarSettingsComponentImpl.class, "tabbarSuggestInteractor", "getTabbarSuggestInteractor()Lcom/vk/tabbar/settings/api/TabbarSuggestInteractor;", hpf0Var), ep.a(0, TabbarSettingsComponentImpl.class, "tabbarSettingsGroupDelegate", "getTabbarSettingsGroupDelegate()Lcom/vk/tabbar/settings/api/TabbarSettingsGroupDelegate;", hpf0Var), ep.a(0, TabbarSettingsComponentImpl.class, "tabbarSettingsAdapterFactory", "getTabbarSettingsAdapterFactory()Lcom/vk/tabbar/settings/api/adapter/TabbarSettingsAdapterFactory;", hpf0Var)};
    }

    public TabbarSettingsComponentImpl(SessionManagementComponent sessionManagementComponent, MenuComponent menuComponent, TabbarCoreComponent tabbarCoreComponent, DataRepositoryComponent dataRepositoryComponent, AuthBridgeComponent authBridgeComponent, InfoBridgeComponent infoBridgeComponent) {
        this.a = sessionManagementComponent;
        this.b = menuComponent;
        this.c = tabbarCoreComponent;
        this.d = dataRepositoryComponent;
        this.e = authBridgeComponent;
        this.f = infoBridgeComponent;
    }

    @Override // com.vk.tabbar.settings.api.di.TabbarSettingsComponent
    public final kun0 Ac() {
        qcy<Object> qcyVar = p[8];
        return (kun0) this.o.c();
    }

    @Override // com.vk.tabbar.settings.api.di.TabbarSettingsComponent
    public final jwn0 Ue() {
        qcy<Object> qcyVar = p[0];
        return (jwn0) this.g.c();
    }

    @Override // com.vk.tabbar.settings.api.di.TabbarSettingsComponent
    public final pvn0 b1() {
        qcy<Object> qcyVar = p[7];
        return (pvn0) this.n.c();
    }

    @Override // com.vk.tabbar.settings.api.di.TabbarSettingsComponent
    public final wwn0 c1() {
        qcy<Object> qcyVar = p[6];
        return (wwn0) this.m.c();
    }

    @Override // com.vk.tabbar.settings.api.di.TabbarSettingsComponent
    public final utn0 p4() {
        qcy<Object> qcyVar = p[1];
        return (utn0) this.h.c();
    }

    @Override // com.vk.tabbar.settings.api.di.TabbarSettingsComponent
    public final rvn0 tf() {
        qcy<Object> qcyVar = p[5];
        return (rvn0) this.l.c();
    }

    @Override // com.vk.tabbar.settings.api.di.TabbarSettingsComponent
    public final mun0 wc() {
        qcy<Object> qcyVar = p[2];
        return (mun0) this.i.c();
    }
}
