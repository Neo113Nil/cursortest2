package com.vk.superapp.vksteps.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cmv0;
import xsna.ep;
import xsna.ewy;
import xsna.fat;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gat;
import xsna.hmv0;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qy8;

/* compiled from: VkStepsComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VkStepsComponentImpl implements VkStepsComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final VkHealthPermissionsComponent a;
    public final nwy b = new nwy(new fat(this, 11));
    public final nwy c = new nwy(new gat(this, 13));
    public final ewy d = new ewy(new qy8(this, 18));

    /* compiled from: VkStepsComponentImpl.kt */
    public static final class a implements c8m<VkStepsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkStepsComponentImpl((VkHealthPermissionsComponent) g8mVar.a(fpf0.a(VkHealthPermissionsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkStepsComponentImpl.class, "vkStepsManager", "getVkStepsManager()Lcom/vk/superapp/vksteps/VkStepsManager;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, VkStepsComponentImpl.class, "vkStepsCommandsFactory", "getVkStepsCommandsFactory()Lcom/vk/superapp/vksteps/VkStepsCommandsFactory;", hpf0Var), ep.a(0, VkStepsComponentImpl.class, "vkStepsBridgeDelegatesFactory", "getVkStepsBridgeDelegatesFactory()Lcom/vk/superapp/vksteps/VkStepsBridgeDelegatesFactory;", hpf0Var)};
    }

    public VkStepsComponentImpl(VkHealthPermissionsComponent vkHealthPermissionsComponent) {
        this.a = vkHealthPermissionsComponent;
    }

    @Override // com.vk.superapp.vksteps.di.VkStepsComponent
    public final VkStepsBridgeDelegatesFactory H0() {
        qcy<Object> qcyVar = e[2];
        return (VkStepsBridgeDelegatesFactory) this.d.c();
    }

    @Override // com.vk.superapp.vksteps.di.VkStepsComponent
    public final cmv0 I5() {
        qcy<Object> qcyVar = e[1];
        return (cmv0) this.c.c();
    }

    @Override // com.vk.superapp.vksteps.di.VkStepsComponent
    public final hmv0 l3() {
        qcy<Object> qcyVar = e[0];
        return (hmv0) this.b.c();
    }
}
