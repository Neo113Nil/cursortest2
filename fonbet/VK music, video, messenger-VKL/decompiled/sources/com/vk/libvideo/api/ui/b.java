package com.vk.libvideo.api.ui;

import android.view.View;
import com.vk.libvideo.api.ui.VideoResizer;
import xsna.tn10;

/* compiled from: ImageMatrixProvider.kt */
/* loaded from: classes2.dex */
public final class b implements tn10 {
    public final View b;

    public b(View view) {
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
        return VideoResizer.VideoFitType.CROP;
    }

    @Override // xsna.tn10
    public final int getContentWidth() {
        return this.b.getWidth();
    }

    @Override // xsna.tn10
    public final void setContentScaleType(VideoResizer.VideoFitType videoFitType) {
    }

    @Override // xsna.tn10
    public final void l(int i, int i2) {
    }
}
