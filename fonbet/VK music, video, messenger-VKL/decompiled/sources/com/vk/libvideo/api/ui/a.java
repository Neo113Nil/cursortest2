package com.vk.libvideo.api.ui;

import android.view.View;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import xsna.tn10;
import xsna.u11;

/* compiled from: CropMatrixProvider.kt */
/* loaded from: classes2.dex */
public final class a implements tn10 {
    public final View b;

    public a(VideoAdLayout videoAdLayout) {
        this.b = videoAdLayout;
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
        return VideoResizer.VideoFitType.CROP;
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
    }
}
