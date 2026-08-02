package com.vk.superapp.health.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.health.js.bridge.api.di.JsHealthDelegateComponent;
import com.vk.superapp.health.js.bridge.api.di.b;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vksteps.di.VkStepsComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.qfj;

/* compiled from: JsHealthDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsHealthDelegateComponentImpl implements JsHealthDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final VkHealthPermissionsComponent a;
    public final VkWorkoutComponent b;
    public final VkStepsComponent c;
    public final ewy d = new ewy(new qfj(this, 13));

    /* compiled from: JsHealthDelegateComponentImpl.kt */
    public static final class a implements c8m<JsHealthDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsHealthDelegateComponentImpl((VkHealthPermissionsComponent) g8mVar.a(fpf0.a(VkHealthPermissionsComponent.class)), (VkWorkoutComponent) g8mVar.a(fpf0.a(VkWorkoutComponent.class)), (VkStepsComponent) g8mVar.a(fpf0.a(VkStepsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsHealthDelegateComponentImpl.class, "jsHealthDelegateFactory", "getJsHealthDelegateFactory()Lcom/vk/superapp/health/js/bridge/api/di/JsHealthDelegateFactory;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
    }

    public JsHealthDelegateComponentImpl(VkHealthPermissionsComponent vkHealthPermissionsComponent, VkWorkoutComponent vkWorkoutComponent, VkStepsComponent vkStepsComponent) {
        this.a = vkHealthPermissionsComponent;
        this.b = vkWorkoutComponent;
        this.c = vkStepsComponent;
    }

    @Override // com.vk.superapp.health.js.bridge.api.di.JsHealthDelegateComponent
    public final b L4() {
        qcy<Object> qcyVar = e[0];
        return (b) this.d.c();
    }
}
