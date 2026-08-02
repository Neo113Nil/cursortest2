package com.vk.libvideo.api.ui;

import android.view.View;
import com.vk.libvideo.api.ui.VideoResizer;
import xsna.tn10;
import xsna.u11;

/* compiled from: ViewMatrixProvider.kt */
/* loaded from: classes2.dex */
public final class c implements tn10 {
    public final View b;
    public VideoResizer.VideoFitType c = VideoResizer.VideoFitType.CROP;

    public c(View view) {
        this.b = view;
    }

    @Override // xsna.tn10
    public final View b() {
        return this.b;
    }

    @Override // xsna.tn10
    public final int getContentHeight() {
        return this.b.getHeight();
    }

    @Override // xsna.tn10
    public final VideoResizer.VideoFitType getContentScaleType() {
        return this.c;
    }

    @Override // xsna.tn10
    public final int getContentWidth() {
        return this.b.getWidth();
    }

    @Override // xsna.tn10
    public final void l(int i, int i2) {
        u11.h(i, i2, this.b);
    }

    @Override // xsna.tn10
    public final void setContentScaleType(VideoResizer.VideoFitType videoFitType) {
        this.c = videoFitType;
    }
}
