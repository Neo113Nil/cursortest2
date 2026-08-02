package com.vk.superapp.vkhealth.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkhealth.api.di.VkHealthComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vksteps.di.VkStepsComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.v0v;
import xsna.w62;

/* compiled from: VkHealthComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VkHealthComponentImpl implements VkHealthComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final VkHealthPermissionsComponent a;
    public final VkWorkoutComponent b;
    public final VkWorkoutWidgetComponent c;
    public final VkStepsComponent d;
    public final nwy e = new nwy(new w62(this, 7));

    /* compiled from: VkHealthComponentImpl.kt */
    public static final class a implements c8m<VkHealthComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkHealthComponentImpl((VkHealthPermissionsComponent) g8mVar.a(fpf0.a(VkHealthPermissionsComponent.class)), (VkWorkoutComponent) g8mVar.a(fpf0.a(VkWorkoutComponent.class)), (VkWorkoutWidgetComponent) g8mVar.a(fpf0.a(VkWorkoutWidgetComponent.class)), (VkStepsComponent) g8mVar.a(fpf0.a(VkStepsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkHealthComponentImpl.class, "healthUtils", "getHealthUtils()Lcom/vk/superapp/vkhealth/api/HealthUtils;", 0);
        fpf0.a.getClass();
        f = new qcy[]{propertyReference1Impl};
    }

    public VkHealthComponentImpl(VkHealthPermissionsComponent vkHealthPermissionsComponent, VkWorkoutComponent vkWorkoutComponent, VkWorkoutWidgetComponent vkWorkoutWidgetComponent, VkStepsComponent vkStepsComponent) {
        this.a = vkHealthPermissionsComponent;
        this.b = vkWorkoutComponent;
        this.c = vkWorkoutWidgetComponent;
        this.d = vkStepsComponent;
    }

    @Override // com.vk.superapp.vkhealth.api.di.VkHealthComponent
    public final v0v Ee() {
        qcy<Object> qcyVar = f[0];
        return (v0v) this.e.c();
    }
}
