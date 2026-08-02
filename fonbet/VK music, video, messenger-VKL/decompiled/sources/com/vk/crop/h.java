package com.vk.crop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.Property;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.crop.CropImageView;
import com.vkontakte.android.R;
import xsna.bn10;
import xsna.e3m;
import xsna.iah0;
import xsna.lik;
import xsna.m33;
import xsna.qq2;
import xsna.wq;
import xsna.zj3;

/* compiled from: RectCropOverlayView.java */
/* loaded from: classes17.dex */
public final class h extends com.vk.crop.d {
    public static final int R = iah0.a(16);
    public static final a S = new a(Float.class, "linesAlpha");
    public static final b T = new b(Integer.class, "overlayColor");
    public static final int U;
    public static final int V;
    public float A;
    public float B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final Drawable H;
    public final Drawable I;
    public final Drawable J;
    public final Drawable K;
    public d L;
    public boolean M;
    public float N;
    public int O;
    public AnimatorSet P;
    public boolean Q;
    public final int f;
    public final int g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final RectF n;
    public final RectF o;
    public final Path p;
    public final Path q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public int z;

    /* compiled from: RectCropOverlayView.java */
    public class a extends Property<h, Float> {
        @Override // android.util.Property
        public final Float get(h hVar) {
            return Float.valueOf(hVar.N);
        }

        @Override // android.util.Property
        public final void set(h hVar, Float f) {
            h hVar2 = hVar;
            hVar2.N = f.floatValue();
            hVar2.invalidate();
        }
    }

    /* compiled from: RectCropOverlayView.java */
    public class b extends Property<h, Integer> {
        @Override // android.util.Property
        public final Integer get(h hVar) {
            return Integer.valueOf(hVar.O);
        }

        @Override // android.util.Property
        public final void set(h hVar, Integer num) {
            h hVar2 = hVar;
            Integer num2 = num;
            hVar2.O = num2.intValue();
            hVar2.t.setColor(num2.intValue());
            hVar2.invalidate();
        }
    }

    /* compiled from: RectCropOverlayView.java */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h.this.P = null;
        }
    }

    /* compiled from: RectCropOverlayView.java */
    public interface d {
    }

    static {
        int a2 = iah0.a(40);
        int a3 = iah0.a(10.9f);
        U = a3;
        V = a2 - a3;
    }

    public h(Context context) {
        super(context);
        int a2 = iah0.a(0.5f);
        int a3 = iah0.a(2);
        this.f = iah0.a(16);
        this.g = iah0.a(64);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new Path();
        this.q = new Path();
        Paint paint = new Paint();
        this.r = paint;
        Paint paint2 = new Paint();
        this.s = paint2;
        Paint paint3 = new Paint();
        Paint paint4 = new Paint();
        this.t = paint4;
        this.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f = R;
        this.v = f;
        this.w = f;
        this.x = iah0.f().widthPixels - r5;
        this.y = iah0.f().widthPixels - r5;
        this.D = f;
        this.E = f;
        this.F = f;
        this.G = f;
        this.M = true;
        this.O = -419430401;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(a3);
        paint.setColor(-6710887);
        paint2.setColor(1728053247);
        paint2.setStrokeWidth(a2);
        paint2.setStyle(style);
        paint4.setColor(this.O);
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        paint3.setStyle(style2);
        paint3.setColor(-1);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        this.H = m33.a(R.drawable.picker_ic_gallery_crop_corner_topleft, context2);
        this.I = m33.a(R.drawable.picker_ic_gallery_crop_corner_topright, context2);
        this.J = m33.a(R.drawable.picker_ic_gallery_crop_corner_bottomright, context2);
        this.K = m33.a(R.drawable.picker_ic_gallery_crop_corner_bottomleft, context2);
        this.H.setCallback(this);
        this.I.setCallback(this);
        this.J.setCallback(this);
        this.K.setCallback(this);
    }

    private float getXMinCropSide() {
        float f = this.u;
        int i = this.g;
        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= 1.0f ? i : i * f : i;
    }

    private float getYMinCropSide() {
        float f = this.u;
        int i = this.g;
        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= 1.0f ? i / f : i : i;
    }

    @Override // com.vk.crop.d
    public final RectF a(float f) {
        return lik.a(f, getMeasuredWidth(), getMeasuredHeight(), this.D, this.E, this.F, this.G);
    }

    @Override // com.vk.crop.d
    public final void b(float f) {
        float f2 = this.u;
        RectF a2 = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? a(f2) : a(f);
        this.v = a2.left;
        this.w = a2.top;
        this.x = a2.right;
        this.y = a2.bottom;
        invalidate();
    }

    @Override // com.vk.crop.d
    public final void c(float f, float f2) {
        this.u = f2;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            b(f);
        }
    }

    public final float d(float f) {
        float f2;
        float xMinCropSide;
        float f3 = this.x;
        if (f <= f3 && f3 - f >= getXMinCropSide()) {
            if (this.x - f > g()) {
                f2 = this.x;
                xMinCropSide = g();
            }
            return bn10.b(f, this.D, getMeasuredWidth() - this.F);
        }
        f2 = this.x;
        xMinCropSide = getXMinCropSide();
        f = f2 - xMinCropSide;
        return bn10.b(f, this.D, getMeasuredWidth() - this.F);
    }

    public final float e(float f) {
        float f2 = this.w;
        if (f < f2 || f - f2 < getYMinCropSide()) {
            f = this.w + getYMinCropSide();
        } else if (f - this.w > f()) {
            f = this.w + f();
        }
        return bn10.b(f, this.E, getMeasuredHeight() - this.G);
    }

    public final float f() {
        float measuredWidth = (getMeasuredWidth() - this.D) - this.F;
        float measuredHeight = (getMeasuredHeight() - this.E) - this.G;
        float f = this.u;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = measuredWidth / measuredHeight;
            if (f == 1.0f) {
                return Math.min(measuredWidth, measuredHeight);
            }
            if (f <= 1.0f ? f2 < f : f2 <= f) {
                return (int) (measuredWidth / f);
            }
        }
        return measuredHeight;
    }

    public final float g() {
        float measuredWidth = (getMeasuredWidth() - this.D) - this.F;
        float measuredHeight = (getMeasuredHeight() - this.E) - this.G;
        float f = this.u;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = measuredWidth / measuredHeight;
            if (f == 1.0f) {
                return Math.min(measuredWidth, measuredHeight);
            }
            if (f <= 1.0f ? f2 >= f : f2 > f) {
                return (int) (measuredHeight * f);
            }
        }
        return measuredWidth;
    }

    public float getBottomSidePadding() {
        return this.G;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCenterX() {
        float f = this.v;
        return wq.a(this.x, f, 2.0f, f);
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCenterY() {
        float f = this.w;
        return wq.a(this.y, f, 2.0f, f);
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCropAspectRatio() {
        return (this.x - this.v) / (this.y - this.w);
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCropHeight() {
        return this.y - this.w;
    }

    @Override // com.vk.crop.d
    public RectF getCropRect() {
        return new RectF(this.v, this.w, this.x, this.y);
    }

    @Override // com.vk.crop.d
    public float getCropScale() {
        float f;
        int height;
        if (getWidth() < getHeight()) {
            f = this.x - this.v;
            height = getWidth();
        } else {
            f = this.y - this.w;
            height = getHeight();
        }
        return f / height;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCropWidth() {
        return this.x - this.v;
    }

    public float getForcedAspectRatio() {
        return this.u;
    }

    public float getLeftSidePadding() {
        return this.D;
    }

    public float getRightSidePadding() {
        return this.F;
    }

    public float getTopSidePadding() {
        return this.E;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getX0() {
        return this.v;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getX1() {
        return this.x;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getY0() {
        return this.w;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getY1() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.p;
        path.reset();
        float width = canvas.getWidth();
        float f = this.w;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f, direction);
        path.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.y, canvas.getWidth(), canvas.getHeight(), direction);
        path.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.v, canvas.getHeight(), direction);
        path.addRect(this.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), direction);
        canvas.drawPath(path, this.t);
        Path path2 = this.q;
        path2.reset();
        float f2 = this.x;
        float f3 = this.v;
        int i = (int) ((f2 - f3) / 3.0f);
        float f4 = this.y;
        float f5 = this.w;
        int i2 = (int) ((f4 - f5) / 3.0f);
        float f6 = i;
        path2.moveTo(f3 + f6, f5);
        path2.lineTo(this.v + f6, this.y);
        float f7 = i * 2;
        path2.moveTo(this.v + f7, this.w);
        path2.lineTo(this.v + f7, this.y);
        float f8 = i2;
        path2.moveTo(this.v, this.w + f8);
        path2.lineTo(this.x, this.w + f8);
        float f9 = i2 * 2;
        path2.moveTo(this.v, this.w + f9);
        path2.lineTo(this.x, this.w + f9);
        int i3 = (int) (this.N * 255.0f);
        Paint paint = this.s;
        paint.setAlpha(i3);
        canvas.drawPath(path2, paint);
        canvas.drawRect(this.v, this.w, this.x, this.y, this.r);
        int i4 = (int) this.v;
        int i5 = (int) this.x;
        int i6 = (int) this.w;
        int i7 = (int) this.y;
        int i8 = U;
        int i9 = V;
        this.H.setBounds(i4 - i8, i6 - i8, i4 + i9, i6 + i9);
        this.H.draw(canvas);
        this.I.setBounds(i5 - i9, i6 - i8, i5 + i8, i6 + i9);
        this.I.draw(canvas);
        this.J.setBounds(i5 - i9, i7 - i9, i5 + i8, i7 + i8);
        this.J.draw(canvas);
        this.K.setBounds(i4 - i8, i7 - i9, i4 + i9, i7 + i8);
        this.K.draw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v80, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v82 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ?? r3;
        if (this.M) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                float f = this.x;
                RectF rectF = this.o;
                RectF rectF2 = this.n;
                RectF rectF3 = this.m;
                RectF rectF4 = this.l;
                RectF rectF5 = this.j;
                RectF rectF6 = this.k;
                RectF rectF7 = this.i;
                RectF rectF8 = this.h;
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f2 = this.v;
                    float f3 = this.f;
                    float f4 = this.w;
                    rectF8.set(f2 - f3, f4 - f3, f2 + f3, f4 + f3);
                    float f5 = this.x;
                    float f6 = this.w;
                    rectF7.set(f5 - f3, f6 - f3, f5 + f3, f6 + f3);
                    float f7 = this.x;
                    float f8 = this.y;
                    rectF6.set(f7 - f3, f8 - f3, f7 + f3, f8 + f3);
                    float f9 = this.v;
                    float f10 = this.y;
                    rectF5.set(f9 - f3, f10 - f3, f9 + f3, f10 + f3);
                    float f11 = this.v;
                    rectF4.set(f11 - f3, this.w, f11 + f3, this.y);
                    float f12 = this.v;
                    float f13 = this.w;
                    rectF3.set(f12, f13 - f3, this.x, f13 + f3);
                    float f14 = this.x;
                    rectF2.set(f14 - f3, this.w, f14 + f3, this.y);
                    float f15 = this.v;
                    float f16 = this.y;
                    rectF.set(f15, f16 - f3, this.x, f16 + f3);
                }
                if (rectF8.contains(x, y)) {
                    this.z = 1;
                } else if (rectF7.contains(x, y)) {
                    this.z = 2;
                } else if (rectF6.contains(x, y)) {
                    this.z = 3;
                } else if (rectF5.contains(x, y)) {
                    this.z = 4;
                } else if (rectF4.contains(x, y)) {
                    this.z = 5;
                } else if (rectF3.contains(x, y)) {
                    this.z = 6;
                } else if (rectF2.contains(x, y)) {
                    this.z = 7;
                } else {
                    if (!rectF.contains(x, y)) {
                        r3 = 0;
                        this.z = 0;
                        if (this.z != 0) {
                            return r3;
                        }
                        this.C = motionEvent.getPointerId(r3);
                        this.A = x;
                        this.B = y;
                        setLinesAndTransparentOverlayVisible(true);
                        return true;
                    }
                    this.z = 8;
                }
                r3 = 0;
                if (this.z != 0) {
                }
            } else {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.z = 0;
                    d dVar = this.L;
                    if (dVar != null) {
                        CropImageView cropImageView = com.vk.crop.c.this.f;
                        z = true;
                        cropImageView.c(true, true, true);
                        CropImageView.a aVar = cropImageView.i;
                        aVar.removeMessages(0);
                        aVar.sendMessageDelayed(Message.obtain(aVar, 0), 800L);
                    } else {
                        z = true;
                    }
                    setLinesAndTransparentOverlayVisible(false);
                    return z;
                }
                if (motionEvent.getAction() == 2 && this.z != 0 && this.C == motionEvent.getPointerId(0)) {
                    float f17 = x - this.A;
                    float f18 = y - this.B;
                    switch (this.z) {
                        case 1:
                            if (this.u != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                if (Math.abs(f17) <= Math.abs(f18)) {
                                    setY0(this.w + f18);
                                    setX0(((this.w - this.y) * this.u) + this.x);
                                    break;
                                } else {
                                    setX0(this.v + f17);
                                    float f19 = this.v - this.x;
                                    float f20 = this.y;
                                    float f21 = this.u;
                                    setY0(((f20 * f21) + f19) / f21);
                                    break;
                                }
                            } else {
                                setX0(this.v + f17);
                                setY0(this.w + f18);
                                break;
                            }
                        case 2:
                            if (this.u != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                if (Math.abs(f17) <= Math.abs(f18)) {
                                    setY0(this.w + f18);
                                    setX1(((this.y - this.w) * this.u) + this.v);
                                    break;
                                } else {
                                    setX1(this.x + f17);
                                    float f22 = this.v - this.x;
                                    float f23 = this.y;
                                    float f24 = this.u;
                                    setY0(((f23 * f24) + f22) / f24);
                                    break;
                                }
                            } else {
                                setX1(this.x + f17);
                                setY0(this.w + f18);
                                break;
                            }
                        case 3:
                            if (this.u != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                if (Math.abs(f17) <= Math.abs(f18)) {
                                    setY1(this.y + f18);
                                    setX1(((this.y - this.w) * this.u) + this.v);
                                    break;
                                } else {
                                    setX1(this.x + f17);
                                    float f25 = this.u;
                                    setY1((((this.w * f25) - this.v) + this.x) / f25);
                                    break;
                                }
                            } else {
                                setX1(this.x + f17);
                                setY1(this.y + f18);
                                break;
                            }
                        case 4:
                            if (this.u != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                if (Math.abs(f17) <= Math.abs(f18)) {
                                    setY1(this.y + f18);
                                    float f26 = this.u;
                                    if (f26 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        this.v = d(((this.w - this.y) * f26) + this.x);
                                        break;
                                    }
                                } else {
                                    setX0(this.v + f17);
                                    float f27 = this.u;
                                    if (f27 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        this.y = e((((this.w * f27) - this.v) + this.x) / f27);
                                        break;
                                    }
                                }
                            } else {
                                setX0(this.v + f17);
                                setY1(this.y + f18);
                                break;
                            }
                            break;
                        case 5:
                            if (this.u == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                setX0(this.v + f17);
                                break;
                            }
                            break;
                        case 6:
                            if (this.u == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                setY0(this.w + f18);
                                break;
                            }
                            break;
                        case 7:
                            if (this.u == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                setX1(this.x + f17);
                                break;
                            }
                            break;
                        case 8:
                            if (this.u == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                setY1(this.y + f18);
                                break;
                            }
                            break;
                    }
                    this.A = x;
                    this.B = y;
                    d dVar2 = this.L;
                    if (dVar2 == null) {
                        return true;
                    }
                    CropImageView cropImageView2 = com.vk.crop.c.this.f;
                    int i = CropImageView.j;
                    cropImageView2.i.removeMessages(0);
                    com.vk.crop.b bVar = cropImageView2.e;
                    if (bVar != null) {
                        bVar.d(false);
                    }
                    cropImageView2.c(false, true, false);
                    return true;
                }
            }
        }
        return false;
    }

    public void setBottomSidePadding(float f) {
        this.G = f;
    }

    public void setLeftSidePadding(float f) {
        this.D = f;
    }

    @Override // com.vk.crop.d
    public void setLinesAndTransparentOverlayVisible(boolean z) {
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null && z != this.Q) {
            animatorSet.cancel();
            this.P = null;
        } else if (animatorSet != null && z == this.Q) {
            return;
        }
        this.Q = z;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, S, z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i = z ? 1728053247 : -419430401;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = qq2.a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, T, i);
        ofInt.setEvaluator(zj3.a);
        animatorSet2.playTogether(ofFloat, ofInt);
        this.P.setDuration(z ? 200L : 400L);
        if (!z) {
            this.P.setStartDelay(800L);
        }
        this.P.addListener(new c());
        this.P.start();
    }

    @Override // com.vk.crop.d
    public void setOnCropChangeListener(d dVar) {
        this.L = dVar;
    }

    public void setRightSidePadding(float f) {
        this.F = f;
    }

    @Override // com.vk.crop.d
    public void setTopSidePadding(float f) {
        this.E = f;
    }

    @Override // com.vk.crop.d
    public void setTouchEnabled(boolean z) {
        this.M = z;
    }

    @Override // com.vk.crop.d
    public void setX0(float f) {
        this.v = d(f);
        invalidate();
    }

    @Override // com.vk.crop.d
    public void setX1(float f) {
        float f2 = this.v;
        if (f < f2 || f - f2 < getXMinCropSide()) {
            f = this.v + getXMinCropSide();
        } else if (f - this.v > g()) {
            f = this.v + g();
        }
        this.x = bn10.b(f, this.D, getMeasuredWidth() - this.F);
        invalidate();
    }

    @Override // com.vk.crop.d
    public void setY0(float f) {
        float f2;
        float yMinCropSide;
        float f3 = this.y;
        if (f <= f3 && f3 - f >= getYMinCropSide()) {
            if (this.y - f > f()) {
                f2 = this.y;
                yMinCropSide = f();
            }
            this.w = bn10.b(f, this.E, getMeasuredHeight() - this.G);
            invalidate();
        }
        f2 = this.y;
        yMinCropSide = getYMinCropSide();
        f = f2 - yMinCropSide;
        this.w = bn10.b(f, this.E, getMeasuredHeight() - this.G);
        invalidate();
    }

    @Override // com.vk.crop.d
    public void setY1(float f) {
        this.y = e(f);
        invalidate();
    }
}
