package com.vk.video.stability.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.video.stability.api.di.VideoAppStabilityComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.f84;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.y1s0;

/* compiled from: VideoAppStabilityComponentImpl.kt */
/* loaded from: classes6.dex */
public final class VideoAppStabilityComponentImpl implements VideoAppStabilityComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new f84(26));

    /* compiled from: VideoAppStabilityComponentImpl.kt */
    public static final class a implements c8m<VideoAppStabilityComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoAppStabilityComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoAppStabilityComponentImpl.class, "videoAppStabilityRepository", "getVideoAppStabilityRepository()Lcom/vk/video/stability/api/VideoAppStabilityRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.video.stability.api.di.VideoAppStabilityComponent
    public final y1s0 G7() {
        qcy<Object> qcyVar = b[0];
        return (y1s0) this.a.c();
    }
}
