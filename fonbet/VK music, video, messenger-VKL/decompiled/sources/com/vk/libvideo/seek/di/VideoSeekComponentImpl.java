package com.vk.libvideo.seek.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.rcs0;
import xsna.zet0;

/* compiled from: VideoSeekComponentImpl.kt */
/* loaded from: classes3.dex */
public final class VideoSeekComponentImpl implements VideoSeekComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new rcs0(4));

    /* compiled from: VideoSeekComponentImpl.kt */
    public static final class a implements b7m<VideoSeekComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoSeekComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoSeekComponentImpl.class, "eventsTracker", "getEventsTracker()Lcom/vk/libvideo/api/seek/tracker/VideoSeekEventsTracker;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.libvideo.api.seek.di.VideoSeekComponent
    public final zet0 E1() {
        qcy<Object> qcyVar = b[0];
        return (zet0) this.a.c();
    }
}
