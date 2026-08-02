package com.vk.libvideo.design.view.play;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import xsna.bwt0;
import xsna.hlo;

/* loaded from: classes2.dex */
public class PlayButton extends AppCompatImageView {
    public int b;
    public int c;
    public int d;
    public hlo e;

    public PlayButton(Context context) {
        super(context);
        this.d = -1;
    }

    @Override // android.view.View
    public final void dispatchDrawableHotspotChanged(float f, float f2) {
        super.dispatchDrawableHotspotChanged(getWidth() >> 1, getHeight() >> 1);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        hlo hloVar = this.e;
        if (hloVar != null) {
            hloVar.a(canvas, getWidth(), getHeight());
        }
        super.draw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(getWidth() >> 1, getHeight() >> 1);
    }

    public void setDrawer(hlo hloVar) {
        this.e = hloVar;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        if (i == 0) {
            if (this.b != 0 && getBackground() == null) {
                setBackgroundResource(this.b);
            }
            if (this.c != 0 && getDrawable() == null) {
                setImageResource(this.c);
                if (this.d != -1) {
                    bwt0.o0(this, getContext().getColor(this.d));
                }
            }
        }
        super.setVisibility(i);
    }

    public PlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
    }
}
