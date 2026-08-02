package com.vk.libvideo.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.j1t0;
import xsna.nwy;
import xsna.qcy;
import xsna.v3t0;

/* compiled from: VideoPlaybackSpeedComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoPlaybackSpeedComponentImpl implements VideoPlaybackSpeedComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new j1t0(1));

    /* compiled from: VideoPlaybackSpeedComponentImpl.kt */
    public static final class a implements b7m<VideoPlaybackSpeedComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoPlaybackSpeedComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoPlaybackSpeedComponentImpl.class, "playbackSpeedRepository", "getPlaybackSpeedRepository()Lcom/vk/libvideo/api/VideoPlaybackSpeedRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.libvideo.api.di.VideoPlaybackSpeedComponent
    public final v3t0 m0() {
        qcy<Object> qcyVar = b[0];
        return (v3t0) this.a.c();
    }
}
