package com.vk.stories.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.jq;
import xsna.m33;
import xsna.t5m;
import xsna.xwk;

/* loaded from: classes6.dex */
public class StoryProgressView extends View {
    public static final int p = iah0.a(1);
    public static final int q = iah0.a(2);
    public static final int r = iah0.a(8);
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public int b;
    public int c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public int g;
    public int h;
    public float i;
    public boolean j;
    public boolean k;
    public Drawable l;

    @Nullable
    public AnimationDrawable m;
    public long n;
    public long o;

    static {
        float f = 20;
        s = iah0.a(f);
        t = iah0.a(f);
        int a = iah0.a(18);
        u = a;
        v = a / 2;
    }

    public StoryProgressView(Context context) {
        super(context);
        this.b = -1;
        this.c = iah0.a(3);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new RectF();
        this.g = 1;
        this.h = 0;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = true;
        this.k = false;
        this.m = null;
        this.n = 2147483647L;
        this.o = 0L;
        a();
    }

    public final void a() {
        this.l = m33.a(R.drawable.bg_story_progress_shadow, getContext());
        Paint paint = this.d;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAlpha(255);
        Paint paint2 = this.e;
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setAlpha(77);
    }

    public int getCurrentSection() {
        return this.h;
    }

    public int getHorizontalPadding() {
        return ((t5m.c() && "dreamlte".equalsIgnoreCase(Build.DEVICE)) || (t5m.c() && "dream2lte".equalsIgnoreCase(Build.DEVICE))) ? s : r;
    }

    public float getProgress() {
        return this.i;
    }

    public int getSectionCount() {
        return this.g;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int a;
        super.onDraw(canvas);
        if (this.g == 0) {
            return;
        }
        int i2 = this.b;
        if (i2 == -1) {
            i = (getWidth() - (getHorizontalPadding() * 2)) / this.g;
            a = getHorizontalPadding();
        } else {
            int i3 = q;
            i = i2 + i3;
            a = jq.a(this.b + i3, this.g, getWidth(), 2);
        }
        for (int i4 = 0; i4 < this.g; i4++) {
            int i5 = p;
            int i6 = (i * i4) + a + i5;
            int i7 = (i6 + i) - i5;
            int i8 = this.h;
            Paint paint = this.d;
            int i9 = r;
            RectF rectF = this.f;
            if (i4 >= i8 || !this.j) {
                Paint paint2 = this.e;
                if (i8 == i4) {
                    float f = i6;
                    float f2 = ((i7 - i6) * this.i) + f;
                    if (this.k) {
                        rectF.set(f2, i9, i7, i9 + this.c);
                        float f3 = this.c / 2.0f;
                        canvas.drawRoundRect(rectF, f3, f3, paint);
                        if (this.m != null) {
                            if (System.currentTimeMillis() - this.o > this.n) {
                                this.o = System.currentTimeMillis();
                                this.m.run();
                            }
                            AnimationDrawable animationDrawable = this.m;
                            float f4 = v;
                            animationDrawable.setBounds((int) (f2 - f4), i5, (int) (f2 + f4), u);
                            this.m.draw(canvas);
                        }
                    } else {
                        float f5 = i9;
                        rectF.set(f, f5, i7, this.c + i9);
                        float f6 = this.c / 2.0f;
                        canvas.drawRoundRect(rectF, f6, f6, paint2);
                        rectF.set(f, f5, f2, i9 + this.c);
                        float f7 = this.c / 2.0f;
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                    }
                } else {
                    rectF.set(i6, i9, i7, i9 + this.c);
                    float f8 = this.c / 2.0f;
                    canvas.drawRoundRect(rectF, f8, f8, paint2);
                }
            } else {
                rectF.set(i6, i9, i7, i9 + this.c);
                float f9 = this.c / 2.0f;
                canvas.drawRoundRect(rectF, f9, f9, paint);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(t, 1073741824));
        int i3 = this.b;
        if (i3 == -1) {
            this.l.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int i4 = q;
        int width = (getWidth() - (((i3 + i4) * this.g) / 2)) - i4;
        this.l.setBounds(width, 0, i4 + width, getMeasuredHeight());
    }

    public void setCurrentSection(int i) {
        this.h = i;
        invalidate();
    }

    public void setFillPreviousSections(boolean z) {
        this.j = z;
    }

    public void setProgress(float f) {
        this.i = xwk.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        invalidate();
    }

    public void setSectionCount(int i) {
        this.g = i;
        invalidate();
    }

    public StoryProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.c = iah0.a(3);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new RectF();
        this.g = 1;
        this.h = 0;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = true;
        this.k = false;
        this.m = null;
        this.n = 2147483647L;
        this.o = 0L;
        a();
    }
}
