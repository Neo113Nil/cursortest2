package com.vk.tabbar.core.impl.di;

import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.menu.di.MenuComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.er6;
import xsna.eun0;
import xsna.fp;
import xsna.fpf0;
import xsna.g3o;
import xsna.g8m;
import xsna.gun0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wtn0;

/* compiled from: TabbarCoreComponentImpl.kt */
/* loaded from: classes11.dex */
public final class TabbarCoreComponentImpl implements TabbarCoreComponent {
    public static final /* synthetic */ qcy<Object>[] g = {new PropertyReference1Impl(TabbarCoreComponentImpl.class, "tabbarRepository", "getTabbarRepository()Lcom/vk/tabbar/core/api/domain/repository/TabbarRepository;", 0), fp.c(0, TabbarCoreComponentImpl.class, "tabbarInteractor", "getTabbarInteractor()Lcom/vk/tabbar/core/api/domain/TabbarInteractor;", fpf0.a)};
    public final SessionManagementComponent a;
    public final DataRepositoryComponent b;
    public final MenuComponent c;
    public final InfoBridgeComponent d;
    public final nwy e = new nwy(new er6(9));
    public final nwy f = new nwy(new g3o(this, 8));

    /* compiled from: TabbarCoreComponentImpl.kt */
    public static final class a implements c8m<TabbarCoreComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new TabbarCoreComponentImpl((SessionManagementComponent) g8mVar.a(fpf0.a(SessionManagementComponent.class)), (DataRepositoryComponent) g8mVar.a(fpf0.a(DataRepositoryComponent.class)), (MenuComponent) g8mVar.a(fpf0.a(MenuComponent.class)), (InfoBridgeComponent) g8mVar.a(fpf0.a(InfoBridgeComponent.class)));
        }
    }

    public TabbarCoreComponentImpl(SessionManagementComponent sessionManagementComponent, DataRepositoryComponent dataRepositoryComponent, MenuComponent menuComponent, InfoBridgeComponent infoBridgeComponent) {
        this.a = sessionManagementComponent;
        this.b = dataRepositoryComponent;
        this.c = menuComponent;
        this.d = infoBridgeComponent;
    }

    @Override // com.vk.tabbar.core.api.di.TabbarCoreComponent
    public final gun0 m8() {
        return new gun0();
    }

    @Override // com.vk.tabbar.core.api.di.TabbarCoreComponent
    public final eun0 o6() {
        qcy<Object> qcyVar = g[0];
        return (eun0) this.e.c();
    }

    @Override // com.vk.tabbar.core.api.di.TabbarCoreComponent
    public final wtn0 y8() {
        qcy<Object> qcyVar = g[1];
        return (wtn0) this.f.c();
    }
}
