package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.im.ui.R$styleable;
import xsna.an10;
import xsna.epx;
import xsna.gz80;
import xsna.x9;

/* compiled from: AudioMsgStatusView.kt */
/* loaded from: classes2.dex */
public final class AudioMsgStatusView extends View {
    public Drawable b;
    public Drawable c;
    public int d;
    public int e;
    public CharSequence f;
    public View.OnClickListener g;
    public Drawable h;
    public Drawable i;
    public int j;
    public int k;
    public CharSequence l;
    public View.OnClickListener m;
    public final a n;
    public final b o;
    public int p;
    public int q;
    public int r;
    public int s;
    public final Path t;
    public boolean u;
    public boolean v;

    public AudioMsgStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.n = aVar;
        b bVar = new b();
        this.o = bVar;
        this.q = 45;
        this.t = new Path();
        aVar.setCallback(this);
        bVar.setCallback(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        setColor(obtainStyledAttributes.getColor(1, -16777216));
        setPlayIconDrawable(obtainStyledAttributes.getDrawable(12));
        setPlayIconOffsetX(obtainStyledAttributes.getDimensionPixelSize(13, 0));
        setPlayIconOffsetY(obtainStyledAttributes.getDimensionPixelSize(14, 0));
        setPlayContentDescription(obtainStyledAttributes.getString(11));
        setPauseIconDrawable(obtainStyledAttributes.getDrawable(8));
        setPauseIconOffsetX(obtainStyledAttributes.getDimensionPixelSize(9, 0));
        setPauseIconOffsetY(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        setPauseContentDescription(obtainStyledAttributes.getString(7));
        setCircleStrokeSize(obtainStyledAttributes.getDimensionPixelSize(0, a(1.5f)));
        setDotPositionDegree(obtainStyledAttributes.getInt(3, 45));
        setDotSize(obtainStyledAttributes.getDimensionPixelSize(4, an10.b((float) Math.floor(5 * Resources.getSystem().getDisplayMetrics().density))));
        setDotClipSize(obtainStyledAttributes.getDimensionPixelSize(2, an10.b((float) Math.floor(2 * Resources.getSystem().getDisplayMetrics().density))));
        setPlaying(obtainStyledAttributes.getBoolean(6, false));
        setListened(obtainStyledAttributes.getBoolean(5, false));
        obtainStyledAttributes.recycle();
    }

    public static int a(float f) {
        return an10.b((float) Math.floor(f * Resources.getSystem().getDisplayMetrics().density));
    }

    public final int getCircleStrokeSize() {
        return an10.b(this.n.a.getStrokeWidth());
    }

    public final int getColor() {
        return this.p;
    }

    public final int getDotClipSize() {
        return this.s;
    }

    public final int getDotPositionDegree() {
        return this.q;
    }

    public final int getDotSize() {
        return this.r;
    }

    public final CharSequence getPauseContentDescription() {
        return this.l;
    }

    public final Drawable getPauseIconDrawable() {
        return this.h;
    }

    public final int getPauseIconOffsetX() {
        return this.j;
    }

    public final int getPauseIconOffsetY() {
        return this.k;
    }

    public final CharSequence getPlayContentDescription() {
        return this.f;
    }

    public final Drawable getPlayIconDrawable() {
        return this.b;
    }

    public final int getPlayIconOffsetX() {
        return this.d;
    }

    public final int getPlayIconOffsetY() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = this.v;
        a aVar = this.n;
        if (z) {
            aVar.draw(canvas);
        } else {
            canvas.save();
            boolean a2 = gz80.a(26);
            Path path = this.t;
            if (a2) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            aVar.draw(canvas);
            canvas.restore();
            this.o.draw(canvas);
        }
        if (this.u) {
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        int i5 = (measuredWidth - paddingLeft) / 2;
        int i6 = (measuredHeight - paddingTop) / 2;
        float min = (Math.min(r0, r1) / 2.0f) - 0;
        this.n.setBounds(paddingLeft, paddingTop, measuredWidth, measuredHeight);
        double radians = (float) Math.toRadians(this.q % 360);
        float cos = (((float) Math.cos(radians)) * min) + i5;
        float sin = (min * ((float) Math.sin(radians))) + i6;
        int b2 = an10.b(cos - (this.r / 2)) - a(0.6f);
        int b3 = an10.b(sin - (this.r / 2)) - a(0.6f);
        int i7 = this.r;
        this.o.setBounds(b2, b3, b2 + i7, i7 + b3);
        Path path = this.t;
        path.reset();
        path.addCircle(cos, sin, (this.r / 2.0f) + this.s, Path.Direction.CW);
        path.close();
        Drawable drawable = this.b;
        if (drawable != null) {
            int intrinsicWidth = (i5 - (drawable.getIntrinsicWidth() / 2)) + this.d;
            int intrinsicHeight = (i6 - (drawable.getIntrinsicHeight() / 2)) + this.e;
            drawable.setBounds(intrinsicWidth, intrinsicHeight, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + intrinsicHeight);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            int intrinsicWidth2 = (i5 - (drawable2.getIntrinsicWidth() / 2)) + this.j;
            int intrinsicHeight2 = (i6 - (drawable2.getIntrinsicHeight() / 2)) + this.k;
            drawable2.setBounds(intrinsicWidth2, intrinsicHeight2, drawable2.getIntrinsicWidth() + intrinsicWidth2, drawable2.getIntrinsicHeight() + intrinsicHeight2);
        }
    }

    public final void setCircleStrokeSize(int i) {
        a aVar = this.n;
        if (an10.b(aVar.a.getStrokeWidth()) != i) {
            aVar.a.setStrokeWidth(i);
            aVar.invalidateSelf();
            requestLayout();
            invalidate();
        }
    }

    public final void setColor(int i) {
        if (this.p != i) {
            this.p = i;
            a aVar = this.n;
            aVar.a.setColor(i);
            aVar.invalidateSelf();
            b bVar = this.o;
            bVar.a.setColor(i);
            bVar.invalidateSelf();
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setTint(i);
            }
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                drawable2.setTint(i);
            }
            invalidate();
        }
    }

    public final void setDotClipSize(int i) {
        if (this.s != i) {
            this.s = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setDotPositionDegree(int i) {
        if (this.q != i) {
            this.q = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setDotSize(int i) {
        if (this.r != i) {
            this.r = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setListened(boolean z) {
        if (this.v != z) {
            this.v = z;
            invalidate();
        }
    }

    public final void setPauseClickListener(View.OnClickListener onClickListener) {
        this.m = onClickListener;
        if (!this.u) {
            onClickListener = this.g;
        }
        setOnClickListener(onClickListener);
    }

    public final void setPauseContentDescription(CharSequence charSequence) {
        this.l = charSequence;
        if (!this.u) {
            charSequence = this.f;
        }
        setContentDescription(charSequence);
    }

    public final void setPauseIconDrawable(Drawable drawable) {
        Drawable mutate;
        if (epx.f(this.i, drawable)) {
            return;
        }
        Drawable drawable2 = this.h;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setCallback(this);
            mutate.setTint(this.p);
            drawable3 = mutate;
        }
        this.h = drawable3;
        this.i = drawable;
        requestLayout();
        invalidate();
    }

    public final void setPauseIconOffsetX(int i) {
        if (this.j != i) {
            this.j = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setPauseIconOffsetY(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setPlayClickListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
        if (this.u) {
            onClickListener = this.m;
        }
        setOnClickListener(onClickListener);
    }

    public final void setPlayContentDescription(CharSequence charSequence) {
        this.f = charSequence;
        if (this.u) {
            charSequence = this.l;
        }
        setContentDescription(charSequence);
    }

    public final void setPlayIconDrawable(Drawable drawable) {
        Drawable mutate;
        if (epx.f(this.c, drawable)) {
            return;
        }
        Drawable drawable2 = this.b;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setCallback(this);
            mutate.setTint(this.p);
            drawable3 = mutate;
        }
        this.b = drawable3;
        this.c = drawable;
        requestLayout();
        invalidate();
    }

    public final void setPlayIconOffsetX(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setPlayIconOffsetY(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setPlaying(boolean z) {
        if (this.u != z) {
            this.u = z;
            invalidate();
            setContentDescription(this.u ? this.l : this.f);
            setOnClickListener(this.u ? this.m : this.g);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable.equals(this.b) || drawable.equals(this.h) || drawable.equals(this.n) || drawable.equals(this.o) || super.verifyDrawable(drawable);
    }

    public final void setPauseContentDescription(int i) {
        setPauseContentDescription(i == 0 ? null : getContext().getString(i));
    }

    public final void setPlayContentDescription(int i) {
        setPlayContentDescription(i == 0 ? null : getContext().getString(i));
    }

    /* compiled from: AudioMsgStatusView.kt */
    public static final class a extends Drawable {
        public final Paint a;

        public a() {
            Paint c = x9.c(true);
            c.setStyle(Paint.Style.STROKE);
            c.setStrokeWidth(1.0f);
            c.setColor(-16777216);
            this.a = c;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            float width = getBounds().width();
            Paint paint = this.a;
            canvas.drawCircle(exactCenterX, exactCenterY, Math.min(width - paint.getStrokeWidth(), getBounds().height() - paint.getStrokeWidth()) / 2.0f, paint);
            new Path();
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* compiled from: AudioMsgStatusView.kt */
    public static final class b extends Drawable {
        public final Paint a;

        public b() {
            Paint c = x9.c(true);
            c.setStyle(Paint.Style.FILL);
            c.setColor(-16777216);
            this.a = c;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, this.a);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
