package com.vk.libvideo.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.k0m0;
import xsna.nwy;
import xsna.qcy;
import xsna.wit0;

/* compiled from: VideoSubscriptionComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoSubscriptionComponentImpl implements VideoSubscriptionComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new k0m0(7));

    /* compiled from: VideoSubscriptionComponentImpl.kt */
    public static final class a implements b7m<VideoSubscriptionComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoSubscriptionComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoSubscriptionComponentImpl.class, "videoSubscriptionRepository", "getVideoSubscriptionRepository()Lcom/vk/libvideo/bottomsheet/about/delegate/author/repository/VideoSubscriptionRepositoryImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VideoSubscriptionComponent
    public final wit0 g0() {
        qcy<Object> qcyVar = b[0];
        return (wit0) this.a.c();
    }
}
