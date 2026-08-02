package com.vk.video.ui.share.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.share.api.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.jql0;
import xsna.nwy;
import xsna.nyk0;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: VideoShareComponentImpl.kt */
/* loaded from: classes7.dex */
public final class VideoShareComponentImpl implements VideoShareComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(VideoShareComponentImpl.class, "videoShareLauncher", "getVideoShareLauncher()Lcom/vk/video/ui/share/api/VideoShareLauncher;", 0), fp.c(0, VideoShareComponentImpl.class, "videoShareLinkModifier", "getVideoShareLinkModifier()Lcom/vk/video/ui/share/api/VideoShareLinkModifier;", fpf0.a)};
    public final nwy a = new nwy(new nyk0(5));
    public final nwy b = new nwy(new jql0(3));

    /* compiled from: VideoShareComponentImpl.kt */
    public static final class a implements c8m<VideoShareComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoShareComponentImpl();
        }
    }

    @Override // com.vk.video.ui.share.api.VideoShareComponent
    public final b S() {
        qcy<Object> qcyVar = c[1];
        return (b) this.b.c();
    }

    @Override // com.vk.video.ui.share.api.VideoShareComponent
    public final com.vk.video.ui.share.api.a p0() {
        qcy<Object> qcyVar = c[0];
        return (com.vk.video.ui.share.api.a) this.a.c();
    }
}
