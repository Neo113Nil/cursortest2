package com.vk.libvideo.impl.di;

import android.view.View;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.popupmanager.api.di.PopupManagerComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.eg1;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.h0w0;
import xsna.j0w0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qqt0;
import xsna.wzv0;
import xsna.xzv0;
import xsna.ywb0;
import xsna.yzv0;

/* compiled from: VkVideoPromoComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VkVideoPromoComponentImpl implements VkVideoPromoComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(VkVideoPromoComponentImpl.class, "vkVideoPromoManager", "getVkVideoPromoManager()Lcom/vk/libvideo/ui/vkvideopromo/VkVideoPromoManagerImpl;", 0), fp.c(0, VkVideoPromoComponentImpl.class, "vkVideoFeedButtonPromoManagerFactory", "getVkVideoFeedButtonPromoManagerFactory()Lcom/vk/libvideo/impl/di/VkVideoPromoComponentImpl$VkVideoFeedButtonPromoManagerFactoryImpl;", fpf0.a)};
    public final nwy a;
    public final nwy b;

    /* compiled from: VkVideoPromoComponentImpl.kt */
    public static final class a implements c8m<VkVideoPromoComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkVideoPromoComponentImpl((VideoGrowthComponent) g8mVar.a(fpf0.a(VideoGrowthComponent.class)), (PopupManagerComponent) g8mVar.a(fpf0.a(PopupManagerComponent.class)));
        }
    }

    /* compiled from: VkVideoPromoComponentImpl.kt */
    public static final class b implements xzv0 {
        public final VideoGrowthComponent a;
        public final ywb0 b;

        public b(VideoGrowthComponent videoGrowthComponent, ywb0 ywb0Var) {
            this.a = videoGrowthComponent;
            this.b = ywb0Var;
        }

        @Override // xsna.xzv0
        public final wzv0 a(View view) {
            return new yzv0(this.a, this.b, view);
        }
    }

    public VkVideoPromoComponentImpl(VideoGrowthComponent videoGrowthComponent, PopupManagerComponent popupManagerComponent) {
        this.a = new nwy(new qqt0(videoGrowthComponent, 4));
        this.b = new nwy(new eg1(20, videoGrowthComponent, popupManagerComponent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VkVideoPromoComponent
    public final h0w0 Ka() {
        qcy<Object> qcyVar = c[0];
        return (j0w0) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VkVideoPromoComponent
    public final xzv0 d7() {
        qcy<Object> qcyVar = c[1];
        return (b) this.b.c();
    }
}
