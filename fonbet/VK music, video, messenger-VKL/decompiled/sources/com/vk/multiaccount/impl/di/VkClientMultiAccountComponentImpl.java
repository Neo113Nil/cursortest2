package com.vk.multiaccount.impl.di;

import com.ironsource.C4641xe;
import com.vk.avatar.api.di.VKAvatarComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ep;
import xsna.ewy;
import xsna.fb8;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gb8;
import xsna.hb8;
import xsna.hlu0;
import xsna.hpf0;
import xsna.jlu0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xku0;

/* compiled from: VkClientMultiAccountComponentImpl.kt */
/* loaded from: classes.dex */
public final class VkClientMultiAccountComponentImpl implements VkClientMultiAccountComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final SessionManagementComponent a;
    public final MultiAccountComponent b;
    public final VKAvatarComponent c;
    public final nwy d = new nwy(new fb8(this, 13));
    public final ewy e = new ewy(new gb8(this, 8));
    public final ewy f = new ewy(new hb8(15));

    /* compiled from: VkClientMultiAccountComponentImpl.kt */
    public static final class a implements c8m<VkClientMultiAccountComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkClientMultiAccountComponentImpl((SessionManagementComponent) g8mVar.a(fpf0.a(SessionManagementComponent.class)), (MultiAccountComponent) g8mVar.a(fpf0.a(MultiAccountComponent.class)), (VKAvatarComponent) g8mVar.a(fpf0.a(VKAvatarComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkClientMultiAccountComponentImpl.class, "additionalInfoRepository", "getAdditionalInfoRepository()Lcom/vk/multiaccount/api/domain/repository/VkClientAdditionalUserInfoRepository;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, VkClientMultiAccountComponentImpl.class, "router", "getRouter()Lcom/vk/multiaccount/api/domain/interactor/VkClientMultiAccountRouter;", hpf0Var), ep.a(0, VkClientMultiAccountComponentImpl.class, C4641xe.d, "getExperiments()Lcom/vk/multiaccount/api/domain/interactor/VkClientMultiAccountExperiments;", hpf0Var)};
    }

    public VkClientMultiAccountComponentImpl(SessionManagementComponent sessionManagementComponent, MultiAccountComponent multiAccountComponent, VKAvatarComponent vKAvatarComponent) {
        this.a = sessionManagementComponent;
        this.b = multiAccountComponent;
        this.c = vKAvatarComponent;
    }

    @Override // com.vk.multiaccount.api.di.VkClientMultiAccountComponent
    public final xku0 Vc() {
        qcy<Object> qcyVar = g[0];
        return (xku0) this.d.c();
    }

    @Override // com.vk.multiaccount.api.di.VkClientMultiAccountComponent
    public final jlu0 a() {
        qcy<Object> qcyVar = g[1];
        return (jlu0) this.e.c();
    }

    @Override // com.vk.multiaccount.api.di.VkClientMultiAccountComponent
    public final hlu0 getExperiments() {
        qcy<Object> qcyVar = g[2];
        return (hlu0) this.f.c();
    }
}
