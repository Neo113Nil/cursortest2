package com.vk.music.snippet.ui.presentation.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.iah0;

/* compiled from: SnippetLinesProgressView.kt */
/* loaded from: classes3.dex */
public final class SnippetLinesProgressView extends View {
    public static final int j = iah0.a(2);
    public static final int k = iah0.a(4);
    public static final int l = iah0.a(26);
    public static final int m = iah0.a(24);
    public final RectF b;
    public final Paint c;
    public final Paint d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;

    public SnippetLinesProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new RectF();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f = 10;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAlpha(51);
        paint2.setColor(-1);
        paint2.setStyle(style);
    }

    public final void a(Canvas canvas, Paint paint, float f, float f2) {
        int i = l;
        int i2 = j;
        RectF rectF = this.b;
        rectF.set(f, i, f2, i + i2);
        float f3 = i2 / 2.0f;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f == 0) {
            return;
        }
        int width = getWidth();
        int i = m;
        int i2 = this.f;
        int i3 = (width - (i * 2)) / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = k;
            int i6 = (i3 * i4) + i + i5;
            int i7 = (i6 + i3) - i5;
            int i8 = this.i;
            Paint paint = this.d;
            if (i4 < i8) {
                a(canvas, paint, i6, i7);
            } else {
                Paint paint2 = this.c;
                if (i8 == i4) {
                    float f = i6;
                    float f2 = ((i7 - i6) * this.e) + f;
                    a(canvas, paint2, f, i7);
                    a(canvas, paint, f, f2);
                } else {
                    a(canvas, paint2, i6, i7);
                }
            }
        }
    }

    public final void setCurrentTrackNum(int i) {
        this.i = i;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        invalidate();
    }

    public final void setTracksCount(int i) {
        this.f = i;
        invalidate();
    }
}
