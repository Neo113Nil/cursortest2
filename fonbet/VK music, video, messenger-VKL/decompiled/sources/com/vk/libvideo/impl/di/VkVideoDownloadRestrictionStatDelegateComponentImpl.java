package com.vk.libvideo.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.promo.stats.VkVideoDownloadRestrictionStatDelegateComponent;
import com.vk.libvideo.api.promo.stats.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dqm0;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: VkVideoDownloadRestrictionStatDelegateComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VkVideoDownloadRestrictionStatDelegateComponentImpl implements VkVideoDownloadRestrictionStatDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new dqm0(9));

    /* compiled from: VkVideoDownloadRestrictionStatDelegateComponentImpl.kt */
    public static final class a implements c8m<VkVideoDownloadRestrictionStatDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkVideoDownloadRestrictionStatDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkVideoDownloadRestrictionStatDelegateComponentImpl.class, "downloadRestrictionStatDelegate", "getDownloadRestrictionStatDelegate()Lcom/vk/libvideo/api/promo/stats/VkVideoDownloadRestrictionStatDelegate;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.libvideo.api.promo.stats.VkVideoDownloadRestrictionStatDelegateComponent
    public final b V6() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
