package com.vk.video.focus.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.video.focus.api.VideoFocusComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u0f;
import xsna.vwk;

/* compiled from: VideoFocusComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VideoFocusComponentImpl implements VideoFocusComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(VideoFocusComponentImpl.class, "interactor", "getInteractor()Lcom/vk/video/focus/api/VideoFocusInteractor;", 0), fp.c(0, VideoFocusComponentImpl.class, "frameRenderRepository", "getFrameRenderRepository()Lcom/vk/video/focus/impl/FrameRenderRepository;", fpf0.a)};
    public final nwy a = new nwy(new vwk(this, 7));
    public final nwy b = new nwy(new u0f(11));

    /* compiled from: VideoFocusComponentImpl.kt */
    public static final class a implements c8m<VideoFocusComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoFocusComponentImpl();
        }
    }

    @Override // com.vk.video.focus.api.VideoFocusComponent
    public final com.vk.video.focus.api.a b() {
        qcy<Object> qcyVar = c[0];
        return (com.vk.video.focus.api.a) this.a.c();
    }
}
