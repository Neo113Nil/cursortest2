package com.vk.superapp.vkworkout.widget.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.ip;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.t2w0;

/* compiled from: VkWorkoutWidgetComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VkWorkoutWidgetComponentImpl implements VkWorkoutWidgetComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final VkHealthPermissionsComponent a;
    public final nwy b = new nwy(new ip(this, 9));

    /* compiled from: VkWorkoutWidgetComponentImpl.kt */
    public static final class a implements c8m<VkWorkoutWidgetComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkWorkoutWidgetComponentImpl((VkHealthPermissionsComponent) g8mVar.a(fpf0.a(VkHealthPermissionsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkWorkoutWidgetComponentImpl.class, "vkWorkoutWidgetManager", "getVkWorkoutWidgetManager()Lcom/vk/superapp/vkworkout/widget/api/VkWorkoutWidgetManager;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public VkWorkoutWidgetComponentImpl(VkHealthPermissionsComponent vkHealthPermissionsComponent) {
        this.a = vkHealthPermissionsComponent;
    }

    @Override // com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent
    public final t2w0 v5() {
        qcy<Object> qcyVar = c[0];
        return (t2w0) this.b.c();
    }
}
