package com.vk.libvideo.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.di.VideoHistoryRecordComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.buc0;
import xsna.e7m;
import xsna.fpf0;
import xsna.kps0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: VideoHistoryRecordComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoHistoryRecordComponentImpl implements VideoHistoryRecordComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new buc0(15));

    /* compiled from: VideoHistoryRecordComponentImpl.kt */
    public static final class a implements b7m<VideoHistoryRecordComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoHistoryRecordComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoHistoryRecordComponentImpl.class, "videoHistoryRecordRepository", "getVideoHistoryRecordRepository()Lcom/vk/libvideo/history/VideoHistoryRecordRepositoryImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VideoHistoryRecordComponent
    public final kps0 S7() {
        qcy<Object> qcyVar = b[0];
        return (kps0) this.a.c();
    }
}
