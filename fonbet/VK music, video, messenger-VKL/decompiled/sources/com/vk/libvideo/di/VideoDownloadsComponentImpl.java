package com.vk.libvideo.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.di.VideoDownloadsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.eis0;
import xsna.fpf0;
import xsna.g2c0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: VideoDownloadsComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoDownloadsComponentImpl implements VideoDownloadsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new g2c0(13));

    /* compiled from: VideoDownloadsComponentImpl.kt */
    public static final class a implements b7m<VideoDownloadsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoDownloadsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoDownloadsComponentImpl.class, "videoDownloadsRepository", "getVideoDownloadsRepository()Lcom/vk/libvideo/api/VideoDownloadsRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.libvideo.api.di.VideoDownloadsComponent
    public final eis0 Ud() {
        qcy<Object> qcyVar = b[0];
        return (eis0) this.a.c();
    }
}
