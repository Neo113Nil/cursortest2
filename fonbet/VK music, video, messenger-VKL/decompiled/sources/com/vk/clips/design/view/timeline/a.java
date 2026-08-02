package com.vk.clips.design.view.timeline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.vk.clips.editor.sdk.design.R$styleable;
import com.vk.log.L;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.operators.observable.q;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.a00;
import xsna.bk1;
import xsna.e43;
import xsna.hr6;
import xsna.iah0;
import xsna.m33;
import xsna.sf;

/* compiled from: BaseVideoTimelineView.kt */
/* loaded from: classes16.dex */
public abstract class a extends View {
    public static final int P = iah0.a(14);
    public static final int Q = iah0.a(8);
    public static final int R = iah0.a(16);
    public static final int S = iah0.a(48);
    public static final int T = iah0.a(44);
    public static final int U = iah0.a(66);
    public static final int V = iah0.a(12);
    public float A;
    public float B;
    public boolean C;
    public volatile boolean D;
    public boolean E;
    public boolean F;
    public long G;
    public boolean H;
    public boolean I;
    public volatile String J;
    public long K;
    public float L;
    public int M;
    public boolean N;
    public final Rect O;
    public w b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public volatile int h;
    public volatile int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public ArrayList<Bitmap> p;
    public io.reactivex.rxjava3.disposables.c q;
    public Paint r;
    public Paint s;
    public Paint t;
    public Path u;
    public RectF v;
    public Path w;
    public Drawable x;
    public volatile long y;
    public float z;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = io.reactivex.rxjava3.schedulers.a.a();
        this.c = P;
        int i = R;
        this.d = i;
        this.e = i;
        this.f = i;
        this.g = -1;
        this.i = T;
        this.j = -1;
        this.k = V;
        this.l = U;
        this.m = S;
        this.o = -1;
        this.p = new ArrayList<>();
        this.B = 1.0f;
        this.F = true;
        this.H = true;
        this.O = new Rect();
        j(context, attributeSet);
        c(context);
    }

    public static final int getDEFAULT_MAX_BOUND_WIDTH() {
        return P;
    }

    public static final int getNONE() {
        return -1;
    }

    public static Bitmap i(int i, int i2, Bitmap bitmap) {
        float max = Math.max(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int width = (int) (bitmap.getWidth() * max);
        int height = (int) (bitmap.getHeight() * max);
        int i3 = (i - width) / 2;
        int i4 = (i2 - height) / 2;
        Rect rect = new Rect(i3, i4, width + i3, height + i4);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        return createBitmap;
    }

    public void a(Canvas canvas, int i) {
        Iterator<Bitmap> it = this.p.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Bitmap next = it.next();
            if (next != null) {
                canvas.drawBitmap(next, (this.h * i2) + this.d + this.c, i, (Paint) null);
            }
            i2++;
        }
    }

    public final Bitmap b(int i, MediaMetadataRetriever mediaMetadataRetriever) {
        Bitmap bitmap = null;
        try {
            long j = 1000;
            long j2 = this.y * i * j;
            if (this.D) {
                j2 += (this.y / 2) * j;
            }
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j2);
            if (frameAtTime == null) {
                return null;
            }
            bitmap = i(this.h, this.i, frameAtTime);
            frameAtTime.recycle();
            return bitmap;
        } catch (Exception e) {
            L.j(e, "baseTimeline");
            return bitmap;
        }
    }

    public final void c(Context context) {
        Paint paint = new Paint();
        this.t = paint;
        paint.setColor(getContext().getColor(R.color.vk_azure_300));
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setAlpha(184);
        com.vk.typography.b.j(textPaint, context, FontFamily.REGULAR, Float.valueOf(13.0f), 8);
        Paint paint2 = new Paint();
        this.r = paint2;
        int i = this.o;
        if (i == -1) {
            paint2.setColor(-855638017);
        } else {
            paint2.setColor(i);
        }
        Paint paint3 = new Paint();
        this.s = paint3;
        int i2 = this.j;
        if (i2 == -1) {
            paint3.setColor(0);
        } else {
            paint3.setColor(i2);
        }
        this.x = m33.a(this.n, context);
    }

    public abstract boolean d(a00 a00Var);

    public abstract boolean e(float f, int i, int i2);

    public abstract void f();

    public final void g() {
        Iterator<Bitmap> it = this.p.iterator();
        while (it.hasNext()) {
            Bitmap next = it.next();
            if (next != null) {
                next.recycle();
            }
        }
        this.p.clear();
        io.reactivex.rxjava3.disposables.c cVar = this.q;
        if (cVar != null) {
            cVar.dispose();
            this.q = null;
        }
    }

    public final boolean getDrawProgress() {
        return this.F;
    }

    public final int getDuration() {
        return this.M;
    }

    public final boolean getForceRedraw() {
        return this.N;
    }

    public final int getFrameHeight() {
        return this.i;
    }

    public final int getFrameWidth() {
        return this.h;
    }

    public final ArrayList<Bitmap> getFrames() {
        return this.p;
    }

    public final int getFramesCornerRadius() {
        return this.g;
    }

    public final int getFramesInBoundColor() {
        return this.j;
    }

    public final int getHorizontalOffset() {
        return this.d;
    }

    public final Paint getInboundFramesForegroundPaint() {
        return this.s;
    }

    public final int getLeftClipHorizontalOffset() {
        return this.e;
    }

    public final float getMProgress() {
        return this.z;
    }

    public final float getMProgressLeft() {
        return this.A;
    }

    public final float getMProgressRight() {
        return this.B;
    }

    public final String getMVideoPath() {
        return this.J;
    }

    public final int getMaxBoundWidth() {
        return this.c;
    }

    public final float getMinDelta() {
        return this.L;
    }

    public final long getMinProgressRangeMs() {
        return this.G;
    }

    public final Paint getPaintBorder() {
        return this.t;
    }

    public final boolean getPressedLeft() {
        return this.C;
    }

    public final boolean getProgressWindowMode() {
        return this.I;
    }

    public final io.reactivex.rxjava3.disposables.c getReloadFramesDisposable() {
        return this.q;
    }

    public final int getRightClipHorizontalOffset() {
        return this.f;
    }

    public final w getRxScheduler() {
        return this.b;
    }

    public final boolean getUseKeepFrameRatio() {
        return this.E;
    }

    public final boolean getUseMiddleKeyframe() {
        return this.D;
    }

    public final long getVideoLength() {
        return this.K;
    }

    public final boolean getWithProgressLine() {
        return this.H;
    }

    public void h() {
        if (this.J == null) {
            return;
        }
        this.q = new q(new bk1(this, 3)).r0(this.b).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sf(this, 4), new hr6(0));
    }

    public final void j(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        this.n = obtainStyledAttributes.getResourceId(6, R.drawable.timeline_video_selector);
        this.k = obtainStyledAttributes.getDimensionPixelSize(8, V);
        this.l = obtainStyledAttributes.getDimensionPixelSize(7, U);
        this.m = obtainStyledAttributes.getDimensionPixelSize(9, S);
        this.i = obtainStyledAttributes.getDimensionPixelSize(3, T);
        this.o = obtainStyledAttributes.getColor(5, -1);
        this.j = obtainStyledAttributes.getColor(4, -1);
        this.g = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (obtainStyledAttributes.getBoolean(2, false)) {
            this.v = new RectF();
            this.w = new Path();
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        io.reactivex.rxjava3.disposables.c cVar;
        Canvas canvas2 = canvas;
        int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - getPaddingStart();
        int i = this.d;
        int i2 = this.c;
        int i3 = (measuredWidth - (i * 2)) - (i2 * 2);
        float f = i3;
        int i4 = ((int) (this.A * f)) + i + i2;
        int i5 = ((int) (f * this.B)) + i + i2;
        boolean z = (this.v == null || this.w == null) ? false : true;
        int height = getHeight();
        int i6 = this.l;
        int i7 = height - i6;
        int i8 = ((i6 / 2) + i7) - (this.i / 2);
        canvas2.save();
        canvas2.clipRect(this.e, i8, (this.c * 2) + i3 + this.f, this.i + i8);
        if (this.N || (this.p.isEmpty() && ((cVar = this.q) == null || cVar.h()))) {
            this.N = false;
            h();
        } else {
            Path path = this.u;
            if (path != null) {
                canvas2.clipPath(path);
            }
            a(canvas2, i8);
        }
        int measuredWidth2 = (getMeasuredWidth() - getPaddingEnd()) - getPaddingStart();
        int i9 = this.d;
        int i10 = this.c;
        float f2 = (measuredWidth2 - (i9 * 2)) - (i10 * 2);
        int i11 = ((int) (this.A * f2)) + i9 + i10;
        int i12 = ((int) (f2 * this.B)) + i9 + i10;
        int height2 = getHeight();
        int i13 = this.l;
        int i14 = ((i13 / 2) + (height2 - i13)) - (this.i / 2);
        Paint paint = this.r;
        Paint paint2 = this.s;
        if (paint != null && paint2 != null) {
            float f3 = i14;
            float f4 = i11;
            canvas2.drawRect(this.e, f3, f4, this.i + i14, paint);
            float f5 = i12;
            canvas.drawRect(f5, f3, (this.c * 2) + this.f + r13, this.i + i14, paint);
            canvas2 = canvas;
            canvas2.drawRect(f4, f3, f5, i14 + this.i, paint2);
        }
        canvas2.restore();
        int i15 = ((this.l / 2) + i7) - (this.m / 2);
        if (z || this.I) {
            canvas2.save();
            RectF rectF = this.v;
            if (rectF != null) {
                rectF.left = i4 - this.c;
            }
            if (rectF != null) {
                rectF.right = this.c + i5;
            }
            if (rectF != null) {
                rectF.top = i15;
            }
            if (rectF != null) {
                rectF.bottom = this.m + i15;
            }
            float f6 = (this.m - this.i) / 2.0f;
            Path path2 = this.w;
            if (path2 != null) {
                path2.rewind();
            }
            int i16 = i4 == i5 ? 1 : 0;
            Path path3 = this.w;
            if (path3 != null) {
                float f7 = (i15 + this.m) - f6;
                float f8 = Q;
                path3.addRoundRect(i4, i15 + f6, i5 + i16, f7, f8, f8, Path.Direction.CCW);
            }
            Path path4 = this.w;
            if (path4 != null) {
                canvas2.clipPath(path4, Region.Op.DIFFERENCE);
            }
            RectF rectF2 = this.v;
            Paint paint3 = this.t;
            if (rectF2 != null && paint3 != null) {
                float f9 = Q;
                canvas2.drawRoundRect(rectF2, f9, f9, paint3);
            }
            canvas2.restore();
        }
        int width = ((int) (getWidth() * this.z)) + this.d + this.c;
        if (this.H && this.F) {
            Drawable drawable = this.x;
            if (drawable != null) {
                int i17 = this.k / 2;
                drawable.setBounds(width - i17, 0, i17 + width, getHeight());
            }
            Drawable drawable2 = this.x;
            if (drawable2 != null) {
                drawable2.draw(canvas2);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.O.set(0, 0, i, i2);
            setSystemGestureExclusionRects(e43.o(this.O));
        }
        if (this.g != -1) {
            this.u = new Path();
            int i5 = (i2 - (this.l / 2)) - (this.i / 2);
            Path path = this.u;
            if (path != null) {
                int i6 = this.d;
                int i7 = this.c;
                RectF rectF = new RectF(i6 + i7, i5, (i - i6) - i7, i5 + this.i);
                float f = this.g;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
            }
            Path path2 = this.u;
            if (path2 != null) {
                path2.close();
            }
        } else {
            this.u = null;
        }
        g();
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = this.v != null;
        int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - getPaddingStart();
        int i = this.d;
        int i2 = this.c;
        int i3 = (measuredWidth - (i * 2)) - (i2 * 2);
        float f = i3;
        int i4 = ((int) (this.A * f)) + i + i2;
        int i5 = ((int) (this.B * f)) + i + i2;
        int i6 = ((int) (this.z * f)) + i + i2;
        int max = z ? 0 : Math.max((int) (f * this.L), this.k * 2);
        int measuredHeight = getMeasuredHeight() - this.m;
        int measuredHeight2 = z ? getMeasuredHeight() : (getMeasuredHeight() / 2) - (this.m / 2);
        if (motionEvent.getAction() == 0) {
            return d(new a00(x, y, i4, i5, i6, measuredHeight2, measuredHeight, i3));
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            f();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            return e(x, i3, max);
        }
        return false;
    }

    public final void setDrawProgress(boolean z) {
        this.F = z;
    }

    public final void setDuration(int i) {
        this.M = i;
    }

    public final void setForceRedraw(boolean z) {
        this.N = z;
    }

    public final void setFrameHeight(int i) {
        this.i = i;
    }

    public final void setFrameWidth(int i) {
        this.h = i;
    }

    public final void setFrames(ArrayList<Bitmap> arrayList) {
        this.p = arrayList;
    }

    public final void setFramesCornerRadius(int i) {
        this.g = i;
    }

    public final void setFramesInBoundColor(int i) {
        this.j = i;
    }

    public final void setHorizontalOffset(int i) {
        this.d = i;
    }

    public final void setInboundFramesForegroundPaint(Paint paint) {
        this.s = paint;
    }

    public final void setLeftClipHorizontalOffset(int i) {
        this.e = i;
    }

    public final void setMProgress(float f) {
        this.z = f;
    }

    public final void setMProgressLeft(float f) {
        this.A = f;
    }

    public final void setMProgressRight(float f) {
        this.B = f;
    }

    public final void setMVideoPath(String str) {
        this.J = str;
    }

    public final void setMaxBoundWidth(int i) {
        this.c = i;
    }

    public final void setMinDelta(float f) {
        this.L = f;
    }

    public final void setMinProgressRangeMs(long j) {
        this.G = j;
    }

    public final void setPaintBorder(Paint paint) {
        this.t = paint;
    }

    public final void setPressedLeft(boolean z) {
        this.C = z;
    }

    public final void setProgressWindowMode(boolean z) {
        this.I = z;
    }

    public final void setReloadFramesDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.q = cVar;
    }

    public final void setRightClipHorizontalOffset(int i) {
        this.f = i;
    }

    public final void setRxScheduler(w wVar) {
        this.b = wVar;
    }

    public final void setUseKeepFrameRatio(boolean z) {
        this.E = z;
    }

    public final void setUseMiddleKeyframe(boolean z) {
        this.D = z;
    }

    public final void setVideoLength(long j) {
        this.K = j;
    }

    public final void setWithProgressLine(boolean z) {
        this.H = z;
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = io.reactivex.rxjava3.schedulers.a.a();
        this.c = P;
        int i2 = R;
        this.d = i2;
        this.e = i2;
        this.f = i2;
        this.g = -1;
        this.i = T;
        this.j = -1;
        this.k = V;
        this.l = U;
        this.m = S;
        this.o = -1;
        this.p = new ArrayList<>();
        this.B = 1.0f;
        this.F = true;
        this.H = true;
        this.O = new Rect();
        j(context, attributeSet);
        c(context);
    }
}
