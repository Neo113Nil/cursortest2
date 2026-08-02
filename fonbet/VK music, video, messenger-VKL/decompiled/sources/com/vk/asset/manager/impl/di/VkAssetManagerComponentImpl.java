package com.vk.asset.manager.impl.di;

import com.vk.asset.manager.api.di.VkAssetManagerComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.gbu0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xqf0;

/* compiled from: VkAssetManagerComponentImpl.kt */
/* loaded from: classes15.dex */
public final class VkAssetManagerComponentImpl implements VkAssetManagerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new xqf0(11));

    /* compiled from: VkAssetManagerComponentImpl.kt */
    public static final class a implements c8m<VkAssetManagerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkAssetManagerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkAssetManagerComponentImpl.class, "vkAssetManager", "getVkAssetManager()Lcom/vk/asset/manager/api/VkAssetManager;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.asset.manager.api.di.VkAssetManagerComponent
    public final gbu0 Se() {
        qcy<Object> qcyVar = b[0];
        return (gbu0) this.a.c();
    }
}
