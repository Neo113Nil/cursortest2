package com.vk.movika.impl.view.full.extend_seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import xsna.zjw;

/* compiled from: PreviewFrameLayout.kt */
/* loaded from: classes3.dex */
public final class PreviewFrameLayout extends FrameLayout {
    public final SeekPreviewImageView b;
    public final int c;
    public zjw d;

    public PreviewFrameLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final zjw getImageLoader() {
        return this.d;
    }

    public final void setImageLoader(zjw zjwVar) {
        if (zjwVar != null) {
            this.b.setImageLoader(zjwVar);
        }
        this.d = zjwVar;
    }

    public PreviewFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PreviewFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PreviewFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PreviewFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        SeekPreviewImageView seekPreviewImageView = new SeekPreviewImageView(context, null, 0, 14, 0);
        this.b = seekPreviewImageView;
        int dimension = (int) getResources().getDimension(R.dimen.interactive_extend_seek_view_size);
        this.c = dimension;
        seekPreviewImageView.setBackgroundColor(-16777216);
        seekPreviewImageView.setShowBorder(false);
        seekPreviewImageView.setOutlineProvider(null);
        seekPreviewImageView.setClipToOutline(false);
        setLayoutParams(new FrameLayout.LayoutParams(dimension, dimension));
        addView(seekPreviewImageView, new FrameLayout.LayoutParams(-1, -1));
    }
}
