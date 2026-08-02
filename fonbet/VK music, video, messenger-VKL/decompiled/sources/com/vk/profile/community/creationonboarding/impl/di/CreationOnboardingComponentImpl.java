package com.vk.profile.community.creationonboarding.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.f4;
import xsna.fp;
import xsna.fpf0;
import xsna.h0h;
import xsna.hpf0;
import xsna.i0h;
import xsna.nh0;
import xsna.nwy;
import xsna.qcy;
import xsna.vbk;
import xsna.wbk;
import xsna.xbk;
import xsna.ybk;

/* compiled from: CreationOnboardingComponentImpl.kt */
/* loaded from: classes5.dex */
public final class CreationOnboardingComponentImpl implements CreationOnboardingComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new nh0(11));
    public final nwy b = new nwy(new com.vk.movika.sdk.base.model.props.a(6));
    public final nwy c = new nwy(new f4(12));

    /* compiled from: CreationOnboardingComponentImpl.kt */
    public static final class a implements b7m<CreationOnboardingComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CreationOnboardingComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CreationOnboardingComponentImpl.class, "router", "getRouter()Lcom/vk/profile/community/creationonboarding/impl/router/CreationOnboardingRouterImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, CreationOnboardingComponentImpl.class, "analytics", "getAnalytics()Lcom/vk/profile/community/creationonboarding/impl/analytics/CreationOnboardingAnalyticsImpl;", hpf0Var), ep.a(0, CreationOnboardingComponentImpl.class, "stateStorage", "getStateStorage()Lcom/vk/profile/community/creationonboarding/impl/storage/CommunityCreationOnboardingStateStorageImpl;", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent
    public final h0h Zd() {
        qcy<Object> qcyVar = d[2];
        return (i0h) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent
    public final xbk a() {
        qcy<Object> qcyVar = d[0];
        return (ybk) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent
    public final vbk d() {
        qcy<Object> qcyVar = d[1];
        return (wbk) this.b.c();
    }
}
