package com.vk.libvideo.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.m33;

/* loaded from: classes3.dex */
public class ScrimInsetsView extends View {
    public final Drawable b;
    public final Drawable c;
    public boolean d;

    public ScrimInsetsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = true;
        Drawable a = m33.a(R.drawable.scrim_top, context);
        this.b = a;
        Drawable a2 = m33.a(R.drawable.scrim_bottom, context);
        this.c = a2;
        a.setAlpha(128);
        a2.setAlpha(128);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i = height / 2;
        if (this.d) {
            Drawable drawable = this.b;
            drawable.setBounds(0, 0, width, i);
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.c;
        drawable2.setBounds(0, i, width, height);
        drawable2.draw(canvas);
    }

    public void setDrawTop(boolean z) {
        if (this.d != z) {
            this.d = z;
            invalidate();
        }
    }
}
