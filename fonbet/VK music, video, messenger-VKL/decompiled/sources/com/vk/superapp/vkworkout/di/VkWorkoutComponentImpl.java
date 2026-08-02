package com.vk.superapp.vkworkout.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bp;
import xsna.c8m;
import xsna.cp;
import xsna.dp;
import xsna.ep;
import xsna.ewy;
import xsna.f2w0;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.z1w0;

/* compiled from: VkWorkoutComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VkWorkoutComponentImpl implements VkWorkoutComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final VkHealthPermissionsComponent a;
    public final VkWorkoutWidgetBridgeComponent b;
    public final nwy c = new nwy(new bp(this, 9));
    public final nwy d = new nwy(new cp(this, 8));
    public final ewy e = new ewy(new dp(this, 4));

    /* compiled from: VkWorkoutComponentImpl.kt */
    public static final class a implements c8m<VkWorkoutComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkWorkoutComponentImpl((VkHealthPermissionsComponent) g8mVar.a(fpf0.a(VkHealthPermissionsComponent.class)), (VkWorkoutWidgetBridgeComponent) g8mVar.a(fpf0.a(VkWorkoutWidgetBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkWorkoutComponentImpl.class, "vkWorkoutManager", "getVkWorkoutManager()Lcom/vk/superapp/vkworkout/VkWorkoutManager;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, VkWorkoutComponentImpl.class, "vkWorkoutCommandsFactory", "getVkWorkoutCommandsFactory()Lcom/vk/superapp/vkworkout/VkWorkoutCommandsFactory;", hpf0Var), ep.a(0, VkWorkoutComponentImpl.class, "vkWorkoutBridgeDelegatesFactory", "getVkWorkoutBridgeDelegatesFactory()Lcom/vk/superapp/vkworkout/VkWorkoutBridgeDelegatesFactory;", hpf0Var)};
    }

    public VkWorkoutComponentImpl(VkHealthPermissionsComponent vkHealthPermissionsComponent, VkWorkoutWidgetBridgeComponent vkWorkoutWidgetBridgeComponent) {
        this.a = vkHealthPermissionsComponent;
        this.b = vkWorkoutWidgetBridgeComponent;
    }

    @Override // com.vk.superapp.vkworkout.di.VkWorkoutComponent
    public final VkWorkoutBridgeDelegatesFactory Kc() {
        qcy<Object> qcyVar = f[2];
        return (VkWorkoutBridgeDelegatesFactory) this.e.c();
    }

    @Override // com.vk.superapp.vkworkout.di.VkWorkoutComponent
    public final f2w0 Te() {
        qcy<Object> qcyVar = f[0];
        return (f2w0) this.c.c();
    }

    @Override // com.vk.superapp.vkworkout.di.VkWorkoutComponent
    public final z1w0 je() {
        qcy<Object> qcyVar = f[1];
        return (z1w0) this.d.c();
    }
}
