package com.vk.attachpicker.videotrim;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.appfeature.attachpicker.R$styleable;
import com.vk.attachpicker.screen.m;
import com.vk.attachpicker.videotrim.VideoTimelineView;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.filters.di.FiltersComponent;
import com.vk.media.player.video.view.SystemVideoView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.asu0;
import xsna.d750;
import xsna.e43;
import xsna.iah0;
import xsna.j6i;
import xsna.kd7;
import xsna.le50;
import xsna.m33;
import xsna.m7m;
import xsna.oeq0;
import xsna.tfr;
import xsna.w8i;

/* loaded from: classes15.dex */
public class VideoTimelineView extends View implements w8i {
    public static final int m0 = iah0.a(16);
    public static final int n0 = iah0.a(48);
    public static final int o0 = iah0.a(44);
    public static final int p0 = iah0.a(66);
    public static final int q0 = iah0.a(12);
    public static final int r0 = iah0.a(14);
    public static final int s0 = iah0.a(8);
    public static final int t0 = iah0.a(4);
    public final Bitmap A;
    public final Bitmap B;
    public final Drawable C;
    public final Drawable D;
    public volatile long E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public boolean O;
    public boolean P;
    public volatile boolean Q;
    public volatile boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public int b;
    public boolean b0;
    public int c;
    public Float c0;
    public int d;
    public boolean d0;
    public int e;
    public long e0;
    public final int f;
    public boolean f0;
    public volatile int g;
    public volatile String g0;
    public volatile int h;
    public List<a> h0;
    public final int i;
    public long i0;
    public final int j;
    public float j0;
    public final int k;
    public final tfr k0;
    public final int l;
    public final Rect l0;
    public final int m;
    public final int n;
    public int o;
    public b p;
    public final ArrayList<Bitmap> q;

    @Nullable
    public io.reactivex.rxjava3.disposables.c r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final Paint v;
    public final TextPaint w;

    @Nullable
    public Path x;
    public final RectF y;
    public final Path z;

    public static class a {
    }

    public interface b {
    }

    public interface c {
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = r0;
        int i = m0;
        this.c = i;
        this.d = i;
        this.e = i;
        this.f = -1;
        this.g = 0;
        int i2 = o0;
        this.h = i2;
        int i3 = q0;
        this.i = i3;
        int i4 = p0;
        this.j = i4;
        int i5 = n0;
        this.k = i5;
        this.l = R.drawable.picker_bg_trimming_zone;
        this.m = R.drawable.picker_ic_trimming_thumb;
        this.n = -1;
        this.o = -1;
        this.p = null;
        this.q = new ArrayList<>();
        this.r = null;
        this.x = null;
        this.E = 0L;
        this.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.G = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.H = 1.0f;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = -1.0f;
        this.M = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = false;
        this.a0 = true;
        this.b0 = false;
        this.d0 = true;
        this.e0 = 0L;
        this.f0 = false;
        this.h0 = Collections.EMPTY_LIST;
        this.i0 = 0L;
        this.j0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.k0 = ((FiltersComponent) j6i.c(m7m.f(this), FiltersComponent.class)).r7();
        this.l0 = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
        this.l = obtainStyledAttributes.getResourceId(0, R.drawable.picker_bg_trimming_zone);
        this.m = obtainStyledAttributes.getResourceId(6, R.drawable.picker_ic_trimming_thumb);
        this.i = obtainStyledAttributes.getDimensionPixelSize(8, i3);
        this.j = obtainStyledAttributes.getDimensionPixelSize(7, i4);
        this.k = obtainStyledAttributes.getDimensionPixelSize(9, i5);
        this.h = obtainStyledAttributes.getDimensionPixelSize(3, i2);
        this.n = obtainStyledAttributes.getColor(5, -1);
        this.o = obtainStyledAttributes.getColor(4, -1);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (obtainStyledAttributes.getBoolean(2, false)) {
            this.y = new RectF();
            this.z = new Path();
        }
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.v = paint;
        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        Paint paint2 = new Paint();
        this.u = paint2;
        paint2.setColor(getContext().getColor(R.color.vk_azure_300));
        this.u.setDither(true);
        this.u.setStyle(Paint.Style.FILL);
        this.u.setStrokeJoin(Paint.Join.ROUND);
        this.u.setStrokeCap(Paint.Cap.ROUND);
        this.u.setAntiAlias(true);
        TextPaint textPaint = new TextPaint(1);
        this.w = textPaint;
        textPaint.setColor(-1);
        this.w.setAlpha(184);
        com.vk.typography.b.j(this.w, context, FontFamily.REGULAR, Float.valueOf(13.0f), 8);
        Paint paint3 = new Paint();
        this.s = paint3;
        int i6 = this.n;
        if (i6 == -1) {
            paint3.setColor(-855638017);
        } else {
            paint3.setColor(i6);
        }
        Paint paint4 = new Paint();
        this.t = paint4;
        int i7 = this.o;
        if (i7 == -1) {
            paint4.setColor(0);
        } else {
            paint4.setColor(i7);
        }
        this.D = m33.a(this.m, context);
        this.C = m33.a(this.l, context);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) m33.a(R.drawable.vk_icon_deprecated_ic_chevron_16, getContext());
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            this.A = bitmap;
            this.B = kd7.k(bitmap, 180, false);
        }
    }

    @Nullable
    public final Bitmap a(int i, MediaMetadataRetriever mediaMetadataRetriever) {
        Bitmap bitmap = null;
        try {
            long j = this.E * i * 1000;
            if (this.Q) {
                j += (this.E / 2) * 1000;
            }
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j);
            if (frameAtTime != null) {
                long j2 = j / 1000;
                Iterator<a> it = this.h0.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                    if (0 <= j2 && 0 > j2) {
                        getContext();
                        throw null;
                    }
                }
            }
            if (frameAtTime == null) {
                return frameAtTime;
            }
            try {
                Bitmap p = MediaUtils.a.p(this.g, this.h, frameAtTime);
                frameAtTime.recycle();
                return p;
            } catch (Exception e) {
                bitmap = frameAtTime;
                e = e;
                com.vk.metrics.eventtracking.b.a.q(e);
                L.j(e, "timeline");
                return bitmap;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void b() {
        b bVar = this.p;
        if (bVar != null) {
            float progress = getProgress();
            m mVar = m.this;
            if (progress < mVar.v.getLeftProgress()) {
                progress = mVar.v.getLeftProgress();
                mVar.v.setProgress(progress);
            } else if (progress > mVar.v.getRightProgress()) {
                progress = mVar.v.getRightProgress();
                mVar.v.setProgress(progress);
            }
            SystemVideoView systemVideoView = mVar.r;
            if (systemVideoView == null) {
                return;
            }
            mVar.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            try {
                systemVideoView.g((int) (systemVideoView.getDuration() * progress));
            } catch (Exception e) {
                L.i(e);
            }
            m.n(mVar, (int) (progress * mVar.C));
        }
    }

    public final void c() {
        ArrayList<Bitmap> arrayList = this.q;
        Iterator<Bitmap> it = arrayList.iterator();
        while (it.hasNext()) {
            Bitmap next = it.next();
            if (next != null) {
                next.recycle();
            }
        }
        arrayList.clear();
        io.reactivex.rxjava3.disposables.c cVar = this.r;
        if (cVar != null) {
            cVar.dispose();
            this.r = null;
        }
    }

    public final int d(float f, int i, int i2, int i3, boolean z) {
        int i4 = (int) (f - this.M);
        if (i4 >= i2) {
            if (i4 > i3) {
                i2 = i3;
            } else {
                int i5 = this.c;
                int i6 = this.b;
                int i7 = i5 + i6;
                if (i4 < i7) {
                    i2 = i7;
                } else {
                    i2 = i5 + i + i6;
                    if (i4 <= i2) {
                        i2 = i4;
                    }
                }
            }
        }
        this.F = ((i2 - this.c) - this.b) / i;
        if (this.b0) {
            e();
        }
        if (this.p != null) {
            if (z && this.P) {
                long currentTimeMillis = System.currentTimeMillis();
                this.O = true;
                if (currentTimeMillis - this.N > 130) {
                    b();
                    this.N = currentTimeMillis;
                    return i2;
                }
            } else {
                b();
            }
        }
        return i2;
    }

    public final void e() {
        if (this.c0 != null) {
            float min = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getProgress() - (this.c0.floatValue() / 2.0f)), 1.0f - this.c0.floatValue());
            this.G = min;
            this.H = this.c0.floatValue() + min;
        }
    }

    public float getLeftProgress() {
        return this.G;
    }

    public long getMinProgressRangeMs() {
        return this.e0;
    }

    public float getProgress() {
        return this.F;
    }

    public float getRightProgress() {
        return this.H;
    }

    public long getWindowVideoLength() {
        return this.i0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        io.reactivex.rxjava3.disposables.c cVar;
        final int i;
        int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - getPaddingStart();
        int i2 = this.c;
        int i3 = this.b;
        int i4 = (measuredWidth - (i2 * 2)) - (i3 * 2);
        float f = i4;
        int i5 = ((int) (this.G * f)) + i2 + i3;
        int i6 = ((int) (this.H * f)) + i2 + i3;
        int i7 = ((int) (f * this.F)) + i2 + i3;
        boolean z = (this.y == null || this.z == null) ? false : true;
        int height = getHeight();
        int i8 = this.j;
        int i9 = height - i8;
        int i10 = ((i8 / 2) + i9) - (this.h / 2);
        canvas.save();
        canvas.clipRect(this.d, i10, (this.b * 2) + this.e + i4, this.h + i10);
        if (!this.q.isEmpty() || ((cVar = this.r) != null && !cVar.h())) {
            Path path = this.x;
            if (path != null) {
                canvas.clipPath(path);
            }
            Iterator<Bitmap> it = this.q.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Bitmap next = it.next();
                if (next != null) {
                    canvas.drawBitmap(next, (this.g * i11) + this.c + this.b, i10, (Paint) null);
                }
                i11++;
            }
        } else if (this.g0 != null && !this.R) {
            int measuredWidth2 = ((getMeasuredWidth() - iah0.a(16)) - getPaddingEnd()) - getPaddingStart();
            if (this.S) {
                this.g = (int) (this.h * 0.5625f);
                i = (int) Math.ceil(measuredWidth2 / this.g);
            } else {
                int i12 = measuredWidth2 / this.h;
                this.g = (int) Math.ceil(measuredWidth2 / i12);
                i = i12;
            }
            long j = i;
            this.E = j != 0 ? this.i0 / j : 0L;
            q qVar = new q(new s() { // from class: xsna.ekt0
                @Override // io.reactivex.rxjava3.core.s
                public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                    VideoTimelineView videoTimelineView = VideoTimelineView.this;
                    int i13 = i;
                    int i14 = VideoTimelineView.m0;
                    if (rVar.h()) {
                        rVar.onComplete();
                        return;
                    }
                    MediaMetadataRetriever mediaMetadataRetriever = null;
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Exception e) {
                        e = e;
                    }
                    if (videoTimelineView.g0 == null) {
                        throw new NullPointerException();
                    }
                    Uri parse = Uri.parse(videoTimelineView.g0);
                    MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                    try {
                        if (oeq0.e(parse)) {
                            mediaMetadataRetriever2.setDataSource(e43.a, parse);
                        } else {
                            mediaMetadataRetriever2.setDataSource(videoTimelineView.g0);
                        }
                        for (int i15 = 0; i15 < i13; i15++) {
                            if (rVar.h()) {
                                break;
                            }
                            Bitmap a2 = videoTimelineView.a(i15, mediaMetadataRetriever2);
                            if (a2 != null) {
                                rVar.onNext(a2);
                            }
                        }
                        mediaMetadataRetriever2.release();
                    } catch (Exception e2) {
                        e = e2;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        Exception exc = new Exception(e.getMessage() + ", path: " + videoTimelineView.g0, e);
                        com.vk.metrics.eventtracking.b.a.q(exc);
                        L.j(exc, "timeline");
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        rVar.onComplete();
                    } catch (Throwable th2) {
                        th = th2;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        throw th;
                    }
                    rVar.onComplete();
                }
            });
            asu0.a.getClass();
            m1 a0 = qVar.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            d750 d750Var = new d750(this, 27);
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            Objects.requireNonNull(bVar);
            this.r = a0.subscribe(d750Var, new le50(bVar, 25));
        }
        float f2 = i10;
        float f3 = i5;
        canvas.drawRect(this.d, f2, f3, this.h + i10, this.s);
        float f4 = i6;
        canvas.drawRect(f4, f2, (this.b * 2) + this.e + i4, this.h + i10, this.s);
        canvas.drawRect(f3, f2, f4, this.h + i10, this.t);
        canvas.restore();
        int i13 = (this.j / 2) + i9;
        int i14 = this.k;
        int i15 = i13 - (i14 / 2);
        if ((z && this.U) || this.b0) {
            canvas.save();
            RectF rectF = this.y;
            int i16 = this.b;
            rectF.left = i5 - i16;
            rectF.right = i16 + i6;
            float f5 = i15;
            rectF.top = f5;
            int i17 = this.k;
            rectF.bottom = i15 + i17;
            float f6 = (i17 - this.h) / 2.0f;
            this.z.rewind();
            int i18 = i5 == i6 ? 1 : 0;
            float f7 = (i15 + this.k) - f6;
            float f8 = s0;
            this.z.addRoundRect(f3, f5 + f6, i18 + i6, f7, f8, f8, Path.Direction.CCW);
            canvas.clipPath(this.z, Region.Op.DIFFERENCE);
            canvas.drawRoundRect(this.y, f8, f8, this.u);
            canvas.restore();
            if (this.a0) {
                float f9 = i9;
                canvas.drawBitmap(this.B, (f3 - (this.b / 2.0f)) - (r3.getWidth() / 2.0f), ((this.j / 2.0f) + f9) - (this.A.getHeight() / 2.0f), this.v);
                canvas.drawBitmap(this.A, ((this.b / 2.0f) + f4) - (this.B.getWidth() / 2.0f), ((this.j / 2.0f) + f9) - (this.A.getHeight() / 2.0f), this.v);
            }
        } else if (this.U) {
            Drawable drawable = this.C;
            int i19 = this.c / 2;
            drawable.setBounds(i5 - i19, i15, i19 + i6, i14 + i15);
            this.C.draw(canvas);
        }
        if (this.T && this.d0) {
            if (this.m == R.drawable.picker_ic_trimming_thumb) {
                int a2 = i9 - iah0.a(11);
                Drawable drawable2 = this.D;
                int i20 = this.i / 2;
                drawable2.setBounds(i7 - i20, a2, i20 + i7, this.j + a2);
            } else {
                Drawable drawable3 = this.D;
                int i21 = this.i / 2;
                drawable3.setBounds(i7 - i21, 0, i21 + i7, getHeight());
            }
            this.D.draw(canvas);
        }
        if (this.W) {
            String format = String.format("%.1f", Float.valueOf((getLeftProgress() * this.i0) / 1000.0f));
            String format2 = String.format("%.1f", Float.valueOf((getRightProgress() * this.i0) / 1000.0f));
            float f10 = i5 - this.b;
            int height2 = getHeight();
            int i22 = t0;
            canvas.drawText(format, f10, height2 + i22, this.w);
            canvas.drawText(format2, i6 - iah0.a(2), getHeight() + i22, this.w);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.l0.set(0, 0, i, i2);
            setSystemGestureExclusionRects(Collections.singletonList(this.l0));
        }
        if (this.f != -1) {
            this.x = new Path();
            int i5 = (i2 - (this.j / 2)) - (this.h / 2);
            Path path = this.x;
            int i6 = this.c;
            int i7 = this.b;
            RectF rectF = new RectF(i6 + i7, i5, (i - i6) - i7, i5 + this.h);
            float f = this.f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.x.close();
        } else {
            this.x = null;
        }
        c();
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = this.y != null;
            int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - getPaddingStart();
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (measuredWidth - (i2 * 2)) - (i3 * 2);
            float f = i4;
            int i5 = ((int) (this.G * f)) + i2 + i3;
            int i6 = ((int) (this.H * f)) + i2 + i3;
            int i7 = ((int) (this.F * f)) + i2 + i3;
            int max = z ? 0 : Math.max((int) (this.j0 * f), this.i * 2);
            int measuredHeight = getMeasuredHeight() - this.k;
            int measuredHeight2 = z ? getMeasuredHeight() : (getMeasuredHeight() / 2) - (this.k / 2);
            if (motionEvent.getAction() == 0) {
                int a2 = iah0.a(18);
                int a3 = iah0.a(6);
                if (this.f0) {
                    int i8 = r0;
                    i5 -= i8;
                    i6 += i8;
                }
                int i9 = i6;
                if (this.V) {
                    i = i5;
                    i7 = d(x, i4, i, i9, false);
                } else {
                    i = i5;
                }
                if ((this.T || this.b0) && i7 - a2 <= x && x <= i7 + a2 && y >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y <= measuredHeight2 && ((i - a2 > x || i < x) && (i9 + a2 < x || i9 > x))) {
                    this.K = true;
                    this.M = (int) (x - i7);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
                if (this.U && i - a2 <= x && x <= i + a3 && y >= measuredHeight && y <= getMeasuredHeight()) {
                    this.I = true;
                    this.M = (int) (x - i);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
                if (this.U && i9 - a3 <= x && x <= i9 + a2 && y >= measuredHeight && y <= getMeasuredHeight()) {
                    this.J = true;
                    this.M = (int) (x - i9);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.p != null) {
                        b();
                        e();
                        this.p.getClass();
                    }
                    this.I = false;
                    this.J = false;
                    this.K = false;
                    this.O = false;
                    return true;
                }
                if (motionEvent.getAction() == 2) {
                    int i10 = this.c;
                    int i11 = this.b;
                    int i12 = i10 + i11;
                    int i13 = i11 + i10 + i4;
                    if (this.I) {
                        int i14 = (int) (x - this.M);
                        if (i14 >= i12) {
                            int i15 = i13 - max;
                            i12 = i14 > i15 ? Math.max(i15, i12) : i14;
                        }
                        float f2 = ((i12 - this.c) - this.b) / f;
                        float f3 = this.H;
                        float f4 = f3 - f2;
                        float f5 = this.L;
                        if (f4 < f5) {
                            f2 = f3 - f5;
                        }
                        if (f2 <= f3) {
                            this.G = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f2, f3 - (this.e0 / getWindowVideoLength())));
                            b bVar = this.p;
                            if (bVar != null) {
                                float leftProgress = getLeftProgress();
                                m mVar = m.this;
                                Handler handler = mVar.g;
                                if (mVar.r != null) {
                                    handler.removeCallbacks(mVar.H);
                                    try {
                                        mVar.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        if (mVar.r.b()) {
                                            mVar.r.d();
                                            mVar.t.setVisibility(0);
                                        }
                                        mVar.r.g((int) (mVar.C * leftProgress));
                                    } catch (Exception e) {
                                        L.i(e);
                                    }
                                    if (mVar.v.getProgress() < mVar.v.getLeftProgress()) {
                                        VideoTimelineView videoTimelineView = mVar.v;
                                        videoTimelineView.setProgress(videoTimelineView.getLeftProgress());
                                        int leftProgress2 = (int) (mVar.v.getLeftProgress() * mVar.C);
                                        mVar.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        mVar.E = leftProgress2;
                                    } else if (mVar.v.getProgress() > mVar.v.getRightProgress()) {
                                        VideoTimelineView videoTimelineView2 = mVar.v;
                                        videoTimelineView2.setProgress(videoTimelineView2.getRightProgress());
                                        int rightProgress = (int) (mVar.v.getRightProgress() * mVar.C);
                                        mVar.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        mVar.E = rightProgress;
                                    }
                                    m.c cVar = mVar.I;
                                    handler.removeCallbacks(cVar);
                                    handler.postDelayed(cVar, 150L);
                                    m.p(mVar);
                                }
                            }
                            invalidate();
                        }
                    } else if (this.J) {
                        int i16 = (int) (x - this.M);
                        int i17 = i12 + max;
                        if (i16 < i17) {
                            i13 = Math.min(i17, i13);
                        } else if (i16 <= i13) {
                            i13 = i16;
                        }
                        float f6 = ((i13 - this.c) - this.b) / f;
                        float f7 = this.G;
                        float f8 = f6 - f7;
                        float f9 = this.L;
                        if (f8 < f9) {
                            f6 = f7 + f9;
                        }
                        if (f6 >= f7) {
                            this.H = Math.min(1.0f, Math.max(f6, (this.e0 / getWindowVideoLength()) + f7));
                            b bVar2 = this.p;
                            if (bVar2 != null) {
                                float rightProgress2 = getRightProgress();
                                m mVar2 = m.this;
                                Handler handler2 = mVar2.g;
                                if (mVar2.r != null) {
                                    handler2.removeCallbacks(mVar2.H);
                                    try {
                                        mVar2.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        if (mVar2.r.b()) {
                                            mVar2.r.d();
                                            mVar2.t.setVisibility(0);
                                        }
                                        mVar2.r.g((int) (mVar2.C * rightProgress2));
                                    } catch (Exception e2) {
                                        L.i(e2);
                                    }
                                    if (mVar2.v.getProgress() < mVar2.v.getLeftProgress()) {
                                        VideoTimelineView videoTimelineView3 = mVar2.v;
                                        videoTimelineView3.setProgress(videoTimelineView3.getLeftProgress());
                                        int leftProgress3 = (int) (mVar2.v.getLeftProgress() * mVar2.C);
                                        mVar2.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        mVar2.E = leftProgress3;
                                    } else if (mVar2.v.getProgress() > mVar2.v.getRightProgress()) {
                                        VideoTimelineView videoTimelineView4 = mVar2.v;
                                        videoTimelineView4.setProgress(videoTimelineView4.getRightProgress());
                                        int rightProgress3 = (int) (mVar2.v.getRightProgress() * mVar2.C);
                                        mVar2.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        mVar2.E = rightProgress3;
                                    }
                                    m.c cVar2 = mVar2.I;
                                    handler2.removeCallbacks(cVar2);
                                    handler2.postDelayed(cVar2, 150L);
                                    m.p(mVar2);
                                }
                            }
                        }
                        invalidate();
                    } else if (this.K) {
                        d(x, i4, i12, i13, true);
                        if (this.b0) {
                            e();
                        }
                        invalidate();
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void setCountBordersAsContentZone(boolean z) {
        this.f0 = z;
    }

    public void setDelegate(b bVar) {
        this.p = bVar;
    }

    public void setDrawArrows(boolean z) {
        this.a0 = z;
    }

    public void setDrawBoundTimeNumbers(boolean z) {
        this.W = z;
    }

    public void setDrawProgress(boolean z) {
        this.d0 = z;
    }

    public void setDuration(int i) {
        float f = i;
        this.L = 1.0f - (((f - 100.0f) * 1.0f) / f);
        this.j0 = 1000.0f / f;
    }

    public void setEnabledSelectedZones(boolean z) {
        this.U = z;
        invalidate();
    }

    public void setFramesInBoundColor(int i) {
        this.o = i;
        this.t.setColor(i);
        invalidate();
    }

    public void setHorizontalOffset(int i) {
        this.c = i;
    }

    public void setLeftClipHorizontalOffset(int i) {
        this.d = i;
    }

    public void setMaxBoundWidth(int i) {
        this.b = i;
    }

    public void setMinProgressRangeMs(long j) {
        this.e0 = j;
    }

    public void setMoveProgressByTap(boolean z) {
        this.V = z;
    }

    public void setPaintBorderAlpha(int i) {
        this.u.setAlpha(i);
        invalidate();
    }

    public void setProgress(float f) {
        if (this.O) {
            return;
        }
        this.F = f;
        invalidate();
    }

    public void setProgressLeft(float f) {
        this.G = f;
        invalidate();
    }

    public void setProgressMs(long j) {
        setProgress(j / this.i0);
    }

    public void setProgressRight(float f) {
        this.H = f;
        invalidate();
    }

    public void setProgressWindowMode(boolean z) {
        this.b0 = z;
    }

    public void setRightClipHorizontalOffset(int i) {
        this.e = Math.max(0, (this.c * 2) - i);
    }

    public void setUseKeepFrameRatio(boolean z) {
        this.S = z;
    }

    public void setUseMiddleKeyframe(boolean z) {
        this.Q = z;
    }

    public void setUseStickersProvider(boolean z) {
        this.R = z;
    }

    public void setUseUpdateProgressWhileMove(boolean z) {
        this.P = z;
    }

    public void setVideoFiltersInfo(List<a> list) {
        this.h0 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVideoPath(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Context context;
        String str2 = "timeline";
        this.g0 = str;
        Uri parse = Uri.parse(str);
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            boolean e2 = oeq0.e(parse);
            if (e2 != 0) {
                Context context2 = e43.a;
                mediaMetadataRetriever.setDataSource(context2, parse);
                context = context2;
            } else {
                mediaMetadataRetriever.setDataSource(str);
                context = e2;
            }
            this.i0 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e3) {
                com.vk.metrics.eventtracking.b.a.q(e3);
                Object[] objArr = {"timeline"};
                L.j(e3, objArr);
                str2 = objArr;
                mediaMetadataRetriever2 = context;
            }
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever3 = mediaMetadataRetriever;
            Exception exc = new Exception(e.getMessage() + ", path: " + str, e);
            com.vk.metrics.eventtracking.b.a.q(exc);
            L.j(exc, "timeline");
            str2 = str2;
            mediaMetadataRetriever2 = mediaMetadataRetriever3;
            if (mediaMetadataRetriever3 != null) {
                try {
                    mediaMetadataRetriever3.release();
                    str2 = str2;
                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                } catch (IOException e5) {
                    com.vk.metrics.eventtracking.b.a.q(e5);
                    Object[] objArr2 = {"timeline"};
                    L.j(e5, objArr2);
                    str2 = objArr2;
                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (IOException e6) {
                    com.vk.metrics.eventtracking.b.a.q(e6);
                    L.j(e6, str2);
                }
            }
            throw th;
        }
    }

    public void setWindowSize(Float f) {
        this.c0 = f;
        e();
        invalidate();
    }

    public void setWithProgressLine(boolean z) {
        this.T = z;
        invalidate();
    }

    public void setStickersProvider(c cVar) {
    }
}
