package com.vk.superapp.vkworkout.widget.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutWidgetBridgeComponent;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.w2w0;
import xsna.w62;

/* compiled from: VkWorkoutWidgetBridgeComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VkWorkoutWidgetBridgeComponentImpl implements VkWorkoutWidgetBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final VkWorkoutWidgetComponent a;
    public final nwy b = new nwy(new w62(this, 8));

    /* compiled from: VkWorkoutWidgetBridgeComponentImpl.kt */
    public static final class a implements c8m<VkWorkoutWidgetBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkWorkoutWidgetBridgeComponentImpl((VkWorkoutWidgetComponent) g8mVar.a(fpf0.a(VkWorkoutWidgetComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkWorkoutWidgetBridgeComponentImpl.class, "vkWorkoutWidgetManagerProxy", "getVkWorkoutWidgetManagerProxy()Lcom/vk/superapp/vkworkout/VkWorkoutWidgetManagerProxy;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public VkWorkoutWidgetBridgeComponentImpl(VkWorkoutWidgetComponent vkWorkoutWidgetComponent) {
        this.a = vkWorkoutWidgetComponent;
    }

    @Override // com.vk.superapp.vkworkout.di.VkWorkoutWidgetBridgeComponent
    public final w2w0 W4() {
        qcy<Object> qcyVar = c[0];
        return (w2w0) this.b.c();
    }
}
