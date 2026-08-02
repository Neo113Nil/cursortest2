package com.vk.video.bugreport.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import xsna.b7m;
import xsna.bpn0;
import xsna.e7m;
import xsna.gwd0;
import xsna.ljt0;

/* compiled from: VideoTechBugreportComponentImpl.kt */
/* loaded from: classes5.dex */
public final class VideoTechBugreportComponentImpl implements VideoTechBugreportComponent {
    public final bpn0 a = new bpn0(new gwd0(15));

    /* compiled from: VideoTechBugreportComponentImpl.kt */
    public static final class a implements b7m<VideoTechBugreportComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoTechBugreportComponentImpl();
        }
    }

    @Override // com.vk.video.bugreport.api.di.VideoTechBugreportComponent
    public final ljt0 getReporter() {
        return (ljt0) this.a.getValue();
    }
}
