package com.vk.video.ui.slider.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.movika.tools.controls.seekbar.f;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.slider.api.VideoSliderHolderComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.eht0;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.lw60;
import xsna.msy;
import xsna.mw60;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: VideoSliderHolderComponentImpl.kt */
/* loaded from: classes7.dex */
public final class VideoSliderHolderComponentImpl implements VideoSliderHolderComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a;

    /* compiled from: VideoSliderHolderComponentImpl.kt */
    public static final class a implements c8m<VideoSliderHolderComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            lw60 lw60Var = new lw60(g8mVar, 1);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new VideoSliderHolderComponentImpl(msy.a(lazyThreadSafetyMode, lw60Var), msy.a(lazyThreadSafetyMode, new mw60(g8mVar, 1)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoSliderHolderComponentImpl.class, "videoSliderItemFactory", "getVideoSliderItemFactory()Lcom/vk/catalog2/common/ui/holders/api/video/VideoSliderItemFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public VideoSliderHolderComponentImpl(Lazy<? extends VideoShareComponent> lazy, Lazy<? extends DonutVideoComponent> lazy2) {
        this.a = new ewy(new f(25, lazy, lazy2));
    }

    @Override // com.vk.video.ui.slider.api.VideoSliderHolderComponent
    public final eht0 da() {
        qcy<Object> qcyVar = b[0];
        return (eht0) this.a.c();
    }
}
