package com.vk.superapp.vkhealth.permissions.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ayu0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wfl;

/* compiled from: VkHealthPermissionsComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VkHealthPermissionsComponentImpl implements VkHealthPermissionsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new wfl(10));

    /* compiled from: VkHealthPermissionsComponentImpl.kt */
    public static final class a implements c8m<VkHealthPermissionsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkHealthPermissionsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkHealthPermissionsComponentImpl.class, "vkHealthPermissionsManager", "getVkHealthPermissionsManager()Lcom/vk/superapp/vkhealth/permissions/api/VkHealthPermissionsManager;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent
    public final ayu0 Wb() {
        qcy<Object> qcyVar = b[0];
        return (ayu0) this.a.c();
    }
}
