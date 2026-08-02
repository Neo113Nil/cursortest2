package com.vk.libvideo.design.view.seek;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import xsna.d3m;
import xsna.hv1;
import xsna.i0q0;
import xsna.iah0;
import xsna.m33;
import xsna.or4;
import xsna.pro0;
import xsna.vnk;

/* compiled from: VideoFastSeekView.kt */
/* loaded from: classes2.dex */
public final class VideoFastSeekView extends ViewGroup {
    public static final int C = iah0.a(16);
    public static final int D = iah0.a(2);
    public static final float E = iah0.a(20);
    public static final int F;
    public final hv1 A;
    public b B;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final vnk h;
    public StaticLayout i;
    public Float j;
    public final TextPaint k;
    public a l;
    public a m;
    public String n;
    public Float o;
    public boolean p;
    public boolean q;
    public float r;
    public long s;
    public int t;
    public int u;
    public int v;
    public int w;
    public VideoFastSeekView$Companion$Type x;
    public final or4 y;
    public boolean z;

    /* compiled from: VideoFastSeekView.kt */
    public final class a implements Runnable {
        public final boolean b;
        public final AnimatorSet c;

        public a(boolean z) {
            this.b = z;
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = animatorSet;
            animatorSet.playTogether(b(z ? VideoFastSeekView.this.e : VideoFastSeekView.this.b, 0L), b(z ? VideoFastSeekView.this.f : VideoFastSeekView.this.c, 200L), b(z ? VideoFastSeekView.this.g : VideoFastSeekView.this.d, 400L));
        }

        public static AnimatorSet b(ImageView imageView, long j) {
            Property property = ViewGroup.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.setStartDelay(j);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat2.setDuration(200L);
            ofFloat2.setStartDelay(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2);
            return animatorSet;
        }

        public final void a() {
            this.c.cancel();
            VideoFastSeekView videoFastSeekView = VideoFastSeekView.this;
            boolean z = this.b;
            (z ? videoFastSeekView.e : videoFastSeekView.b).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            (z ? videoFastSeekView.f : videoFastSeekView.c).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            (z ? videoFastSeekView.g : videoFastSeekView.d).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnimatorSet animatorSet = this.c;
            if (animatorSet.isStarted()) {
                return;
            }
            animatorSet.start();
        }
    }

    /* compiled from: VideoFastSeekView.kt */
    public interface b {
        void p();
    }

    static {
        iah0.a(160);
        F = iah0.a(32);
    }

    public VideoFastSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.x = VideoFastSeekView$Companion$Type.NONE;
        this.y = new or4(this, 17);
        this.A = new hv1(this, 22);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        ImageView imageView4 = new ImageView(context);
        this.e = imageView4;
        ImageView imageView5 = new ImageView(context);
        this.f = imageView5;
        ImageView imageView6 = new ImageView(context);
        this.g = imageView6;
        imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView5.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView6.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView.setRotation(180.0f);
        imageView2.setRotation(180.0f);
        imageView3.setRotation(180.0f);
        int color = context.getColor(R.color.white);
        Drawable a2 = m33.a(com.vkontakte.android.R.drawable.ic_fast_forward_arrow, context);
        if (a2 != null) {
            a2.mutate().setTint(color);
        }
        imageView.setImageResource(com.vkontakte.android.R.drawable.ic_fast_forward_arrow);
        imageView2.setImageResource(com.vkontakte.android.R.drawable.ic_fast_forward_arrow);
        imageView3.setImageResource(com.vkontakte.android.R.drawable.ic_fast_forward_arrow);
        imageView4.setImageResource(com.vkontakte.android.R.drawable.ic_fast_forward_arrow);
        imageView5.setImageResource(com.vkontakte.android.R.drawable.ic_fast_forward_arrow);
        imageView6.setImageResource(com.vkontakte.android.R.drawable.ic_fast_forward_arrow);
        int i = C;
        addView(imageView, i, i);
        addView(imageView2, i, i);
        addView(imageView3, i, i);
        addView(imageView4, i, i);
        addView(imageView5, i, i);
        addView(imageView6, i, i);
        TextPaint textPaint = new TextPaint();
        this.k = textPaint;
        textPaint.setColor(color);
        textPaint.setAntiAlias(true);
        com.vk.typography.b.j(textPaint, context, FontFamily.REGULAR, Float.valueOf(16.0f), 8);
        setWillNotDraw(false);
        setLayerType(2, null);
        vnk vnkVar = new vnk(context);
        this.h = vnkVar;
        setBackground(vnkVar);
    }

    public final void a(boolean z, PointF pointF, VideoFastSeekView$Companion$Type videoFastSeekView$Companion$Type) {
        this.t = videoFastSeekView$Companion$Type == this.x ? this.t : 0;
        this.x = videoFastSeekView$Companion$Type;
        String str = this.n;
        int i = 10;
        if (b() && this.q == z) {
            i = 10 + this.t;
        }
        this.t = i;
        this.n = getResources().getString(com.vkontakte.android.R.string.n_seconds, Integer.valueOf(this.t));
        this.p = str == null || str.length() != this.n.length();
        this.s = SystemClock.elapsedRealtime();
        d3m.c(this, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (z) {
            if (this.l == null) {
                this.l = new a(true);
            }
            a aVar = this.l;
            if (aVar != null) {
                aVar.run();
            }
            a aVar2 = this.m;
            if (aVar2 != null) {
                aVar2.a();
            }
            this.m = null;
        } else {
            if (this.m == null) {
                this.m = new a(false);
            }
            a aVar3 = this.m;
            if (aVar3 != null) {
                aVar3.run();
            }
            a aVar4 = this.l;
            if (aVar4 != null) {
                aVar4.a();
            }
            this.l = null;
        }
        int i2 = this.i != null ? 150 : 50;
        vnk vnkVar = this.h;
        vnkVar.l = i2;
        VideoFastSeekView$Companion$Type videoFastSeekView$Companion$Type2 = VideoFastSeekView$Companion$Type.SEEK;
        boolean z2 = videoFastSeekView$Companion$Type == videoFastSeekView$Companion$Type2;
        ObjectAnimator objectAnimator = vnkVar.a;
        ObjectAnimator objectAnimator2 = vnkVar.b;
        ObjectAnimator objectAnimator3 = vnkVar.c;
        vnkVar.d = z;
        vnkVar.n = z2;
        vnkVar.e = pointF;
        if (!vnkVar.m) {
            objectAnimator3.setIntValues(i2);
            objectAnimator3.setStartDelay(0L);
            objectAnimator3.start();
            objectAnimator2.setFloatValues(1.0f);
            objectAnimator2.setStartDelay(0L);
            objectAnimator2.start();
        }
        if (vnkVar.f.getAlpha() > 0) {
            objectAnimator.setFloatValues(50.0f, vnkVar.k);
            objectAnimator.start();
        } else {
            vnkVar.m = true;
            objectAnimator3.setIntValues(0, vnkVar.l);
            objectAnimator3.setStartDelay(0L);
            objectAnimator3.start();
            objectAnimator2.setFloatValues(0.5f, 1.0f);
            objectAnimator2.setStartDelay(0L);
            objectAnimator2.start();
            objectAnimator.setFloatValues(50.0f, vnkVar.k);
            objectAnimator.start();
        }
        vnkVar.invalidateSelf();
        if (this.q != z) {
            this.o = null;
        }
        or4 or4Var = this.y;
        pro0.d(or4Var);
        pro0.d(this.A);
        if (videoFastSeekView$Companion$Type != videoFastSeekView$Companion$Type2) {
            i0q0.d(1000L, or4Var);
        }
        this.q = z;
        invalidate();
    }

    public final boolean b() {
        return SystemClock.elapsedRealtime() - this.s < 700;
    }

    public final boolean c() {
        return this.z && b();
    }

    public final b getCallback() {
        return this.B;
    }

    public final void hide() {
        pro0.d(this.y);
        hv1 hv1Var = this.A;
        pro0.d(hv1Var);
        if (this.x != VideoFastSeekView$Companion$Type.SEEK) {
            i0q0.d(500L, hv1Var);
        }
        d3m.e(this, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        vnk vnkVar = this.h;
        if (vnkVar.n) {
            vnkVar.n = false;
            vnkVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.i = null;
        this.j = null;
        this.o = null;
        this.t = 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        String str;
        if (this.i != null) {
            canvas.drawColor(-1728053248);
        }
        if (!b() || (str = this.n) == null) {
            canvas2 = canvas;
        } else {
            boolean z = this.p;
            TextPaint textPaint = this.k;
            if (z || this.r == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.p = false;
                this.o = null;
                this.r = textPaint.measureText(str, 0, str.length());
            }
            float f = this.u;
            float f2 = E;
            float height = f + f2 + (this.e.getHeight() / 2);
            if (this.o == null) {
                this.o = this.q ? Float.valueOf(Math.min(this.w - (this.r / 2), (canvas.getWidth() - this.r) - f2)) : Float.valueOf(this.v - (this.r / 2));
            }
            canvas2 = canvas;
            canvas2.drawText(str, 0, str.length(), this.o.floatValue(), height, (Paint) textPaint);
        }
        StaticLayout staticLayout = this.i;
        if (staticLayout != null) {
            canvas2.save();
            float height2 = this.u - (staticLayout.getHeight() / 2.0f);
            if (this.j == null) {
                boolean z2 = this.q;
                int i = F;
                this.j = z2 ? Float.valueOf(((this.w - (this.r / 2)) - i) - staticLayout.getWidth()) : Float.valueOf((this.r / 2) + this.v + i);
            }
            canvas2.translate(this.j.floatValue(), height2);
            staticLayout.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.u = (i4 - i2) / 2;
        int i5 = (i3 - i) / 5;
        this.v = i5;
        this.w = i5 * 4;
        ImageView imageView = this.e;
        int measuredWidth = imageView.getMeasuredWidth() / 2;
        int measuredHeight = imageView.getMeasuredHeight() / 2;
        int i6 = D + C;
        int i7 = this.v;
        int i8 = this.u;
        this.d.layout((i7 - measuredWidth) - i6, i8 - measuredHeight, (i7 + measuredWidth) - i6, i8 + measuredHeight);
        int i9 = this.v;
        int i10 = this.u;
        this.c.layout(i9 - measuredWidth, i10 - measuredHeight, i9 + measuredWidth, i10 + measuredHeight);
        int i11 = this.v;
        int i12 = this.u;
        this.b.layout((i11 - measuredWidth) + i6, i12 - measuredHeight, i11 + measuredWidth + i6, i12 + measuredHeight);
        int i13 = this.w;
        int i14 = this.u;
        imageView.layout((i13 - measuredWidth) - i6, i14 - measuredHeight, (i13 + measuredWidth) - i6, i14 + measuredHeight);
        int i15 = this.w;
        int i16 = this.u;
        this.f.layout(i15 - measuredWidth, i16 - measuredHeight, i15 + measuredWidth, i16 + measuredHeight);
        int i17 = this.w;
        int i18 = this.u;
        this.g.layout((i17 - measuredWidth) + i6, i18 - measuredHeight, i17 + measuredWidth + i6, i18 + measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C, 1073741824);
        this.b.measure(makeMeasureSpec, makeMeasureSpec);
        this.c.measure(makeMeasureSpec, makeMeasureSpec);
        this.d.measure(makeMeasureSpec, makeMeasureSpec);
        this.e.measure(makeMeasureSpec, makeMeasureSpec);
        this.f.measure(makeMeasureSpec, makeMeasureSpec);
        this.g.measure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void setCallback(b bVar) {
        this.B = bVar;
    }
}
