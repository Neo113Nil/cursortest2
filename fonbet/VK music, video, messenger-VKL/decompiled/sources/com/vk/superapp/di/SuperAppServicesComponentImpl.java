package com.vk.superapp.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.protect.di.ProtectAppComponent;
import com.vk.superapp.widget_settings.p004new.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.abn0;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.fbn0;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.k5f0;
import xsna.ke80;
import xsna.l7n0;
import xsna.nwy;
import xsna.qcy;
import xsna.t970;
import xsna.vqf0;
import xsna.wqf0;
import xsna.wzb0;
import xsna.x1c0;
import xsna.xqf0;

/* compiled from: SuperAppServicesComponentImpl.kt */
/* loaded from: classes6.dex */
public final class SuperAppServicesComponentImpl implements SuperAppServicesComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final nwy a = new nwy(new vqf0(5));
    public final nwy b;
    public final ewy c;
    public final ewy d;
    public final nwy e;

    /* compiled from: SuperAppServicesComponentImpl.kt */
    public static final class a implements b7m<SuperAppServicesComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SuperAppServicesComponentImpl((ProtectAppComponent) e7mVar.a(fpf0.a(ProtectAppComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuperAppServicesComponentImpl.class, "widgetSettingInteractor", "getWidgetSettingInteractor()Lcom/vk/superapp/widget_settings/new/WidgetSettingsInteractorImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, SuperAppServicesComponentImpl.class, "menuApplicationsCache", "getMenuApplicationsCache()Lcom/vk/superapp/MenuApplicationsCache;", hpf0Var), ep.a(0, SuperAppServicesComponentImpl.class, "redesignConfiguration", "getRedesignConfiguration()Lcom/vk/superapp/RedesignConfiguration;", hpf0Var), ep.a(0, SuperAppServicesComponentImpl.class, "superAppRequestFactory", "getSuperAppRequestFactory()Lcom/vk/superapp/SuperAppRequestFactory;", hpf0Var), ep.a(0, SuperAppServicesComponentImpl.class, "onboardingPanelTracker", "getOnboardingPanelTracker()Lcom/vk/superapp/OnboardingPanelTracker;", hpf0Var), ep.a(0, SuperAppServicesComponentImpl.class, "securityIndicatorRepository", "getSecurityIndicatorRepository()Lcom/vk/superapp/SuperAppSecurityIndicatorRepository;", hpf0Var), ep.a(0, SuperAppServicesComponentImpl.class, "superAppAppsPickerFactory", "getSuperAppAppsPickerFactory()Lcom/vk/superapp/SuperAppAppsPickerFactory;", hpf0Var)};
    }

    public SuperAppServicesComponentImpl(ProtectAppComponent protectAppComponent) {
        new nwy(new wqf0(5));
        new nwy(new xqf0(5));
        this.b = new nwy(new k5f0(7));
        this.c = new ewy(new t970(9));
        this.d = new ewy(new wzb0(protectAppComponent, 16));
        this.e = new nwy(new x1c0(9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.superapp.di.SuperAppServicesComponent
    public final b Tb() {
        qcy<Object> qcyVar = f[0];
        return (b) this.a.c();
    }

    @Override // com.vk.superapp.di.SuperAppServicesComponent
    public final abn0 a6() {
        qcy<Object> qcyVar = f[3];
        return (abn0) this.b.c();
    }

    @Override // com.vk.superapp.di.SuperAppServicesComponent
    public final fbn0 e9() {
        qcy<Object> qcyVar = f[5];
        return (fbn0) this.d.c();
    }

    @Override // com.vk.superapp.di.SuperAppServicesComponent
    public final l7n0 nd() {
        qcy<Object> qcyVar = f[6];
        return (l7n0) this.e.c();
    }

    @Override // com.vk.superapp.di.SuperAppServicesComponent
    public final ke80 w5() {
        qcy<Object> qcyVar = f[4];
        return (ke80) this.c.c();
    }
}
