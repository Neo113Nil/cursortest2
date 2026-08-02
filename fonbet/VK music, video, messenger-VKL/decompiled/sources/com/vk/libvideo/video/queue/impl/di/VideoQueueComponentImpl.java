package com.vk.libvideo.video.queue.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.att0;
import xsna.b7m;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.k0m0;
import xsna.nwy;
import xsna.pm60;
import xsna.qcy;
import xsna.zst0;

/* compiled from: VideoQueueComponentImpl.kt */
/* loaded from: classes3.dex */
public final class VideoQueueComponentImpl implements VideoQueueComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(VideoQueueComponentImpl.class, "videosQueue", "getVideosQueue()Lcom/vk/libvideo/video/queue/api/VideosQueue;", 0), fp.c(0, VideoQueueComponentImpl.class, "videosQueueBackgroundManager", "getVideosQueueBackgroundManager()Lcom/vk/libvideo/video/queue/api/VideosQueueBackgroundManager;", fpf0.a)};
    public final nwy a = new nwy(new pm60(14));
    public final nwy b = new nwy(new k0m0(5));

    /* compiled from: VideoQueueComponentImpl.kt */
    public static final class a implements b7m<VideoQueueComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoQueueComponentImpl();
        }
    }

    @Override // com.vk.libvideo.video.queue.api.di.VideoQueueComponent
    public final zst0 fc() {
        qcy<Object> qcyVar = c[0];
        return (zst0) this.a.c();
    }

    @Override // com.vk.libvideo.video.queue.api.di.VideoQueueComponent
    public final att0 z9() {
        qcy<Object> qcyVar = c[1];
        return (att0) this.b.c();
    }
}
