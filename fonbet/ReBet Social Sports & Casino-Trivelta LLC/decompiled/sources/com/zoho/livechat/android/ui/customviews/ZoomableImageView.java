package com.zoho.livechat.android.ui.customviews;

import a1.C1908a;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import cg.g;
import com.zoho.livechat.android.provider.MobilistenInitProvider;

/* loaded from: classes4.dex */
public class ZoomableImageView extends AppCompatImageView {

    /* renamed from: J, reason: collision with root package name */
    public static Matrix f44324J;

    /* renamed from: A, reason: collision with root package name */
    public float f44325A;

    /* renamed from: B, reason: collision with root package name */
    public float f44326B;

    /* renamed from: C, reason: collision with root package name */
    public float f44327C;

    /* renamed from: D, reason: collision with root package name */
    public float f44328D;

    /* renamed from: E, reason: collision with root package name */
    public float f44329E;

    /* renamed from: F, reason: collision with root package name */
    public float f44330F;

    /* renamed from: G, reason: collision with root package name */
    public ScaleGestureDetector f44331G;

    /* renamed from: H, reason: collision with root package name */
    public GestureDetector f44332H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f44333I;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f44334d;

    /* renamed from: e, reason: collision with root package name */
    public int f44335e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44336f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44337g;

    /* renamed from: h, reason: collision with root package name */
    public PointF f44338h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f44339i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f44340j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44341k;

    /* renamed from: l, reason: collision with root package name */
    public float f44342l;

    /* renamed from: m, reason: collision with root package name */
    float[] f44343m;

    /* renamed from: n, reason: collision with root package name */
    public float f44344n;

    /* renamed from: o, reason: collision with root package name */
    public int f44345o;

    /* renamed from: p, reason: collision with root package name */
    public float f44346p;

    /* renamed from: q, reason: collision with root package name */
    public float f44347q;

    /* renamed from: r, reason: collision with root package name */
    public float f44348r;

    /* renamed from: s, reason: collision with root package name */
    public float f44349s;

    /* renamed from: t, reason: collision with root package name */
    public float f44350t;

    /* renamed from: u, reason: collision with root package name */
    public View f44351u;

    /* renamed from: v, reason: collision with root package name */
    public long f44352v;

    /* renamed from: w, reason: collision with root package name */
    public float f44353w;

    /* renamed from: x, reason: collision with root package name */
    public float f44354x;

    /* renamed from: y, reason: collision with root package name */
    public float f44355y;

    /* renamed from: z, reason: collision with root package name */
    public float f44356z;

    public class a implements View.OnTouchListener {

        /* renamed from: com.zoho.livechat.android.ui.customviews.ZoomableImageView$a$a, reason: collision with other inner class name */
        public class RunnableC0642a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f44358a;

            public RunnableC0642a(float f10) {
                this.f44358a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                ZoomableImageView.this.f44334d.postTranslate(0.0f, this.f44358a);
                ZoomableImageView zoomableImageView = ZoomableImageView.this;
                zoomableImageView.setImageMatrix(zoomableImageView.f44334d);
                ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
                int i10 = zoomableImageView2.f44345o + 1;
                zoomableImageView2.f44345o = i10;
                if (i10 < 20) {
                    zoomableImageView2.f44340j.postDelayed(this, 15L);
                } else {
                    zoomableImageView2.f44351u.setBackgroundColor(Color.parseColor("#ff000000"));
                }
            }
        }

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ZoomableImageView.this.f44331G.onTouchEvent(motionEvent);
            ZoomableImageView.this.f44332H.onTouchEvent(motionEvent);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.f44334d.getValues(zoomableImageView.f44343m);
            float[] fArr = ZoomableImageView.this.f44343m;
            float f10 = fArr[2];
            float f11 = fArr[5];
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            if (action == 0) {
                if (ZoomableImageView.this.f44351u != null) {
                    ZoomableImageView.this.f44351u.setBackgroundColor(Color.parseColor("#000000"));
                }
                ZoomableImageView.this.f44352v = System.currentTimeMillis();
                ZoomableImageView.this.f44338h.set(motionEvent.getX(), motionEvent.getY());
                ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
                zoomableImageView2.f44339i.set(zoomableImageView2.f44338h);
                ZoomableImageView zoomableImageView3 = ZoomableImageView.this;
                zoomableImageView3.f44335e = 1;
                zoomableImageView3.f44328D = zoomableImageView3.getTop();
            } else if (action == 1) {
                if (ZoomableImageView.this.f44351u != null && ZoomableImageView.this.f44341k && ZoomableImageView.this.f44353w == 1.0d && ((int) (Math.abs(motionEvent.getY() - ZoomableImageView.this.f44339i.y) / (System.currentTimeMillis() - ZoomableImageView.this.f44352v))) < 1) {
                    ZoomableImageView zoomableImageView4 = ZoomableImageView.this;
                    float f12 = zoomableImageView4.f44339i.y - pointF.y;
                    zoomableImageView4.f44345o = 0;
                    ZoomableImageView.this.f44340j.postDelayed(new RunnableC0642a(f12 / 20.0f), 15L);
                }
                int abs = (int) Math.abs(pointF.x - ZoomableImageView.this.f44339i.x);
                int abs2 = (int) Math.abs(pointF.y - ZoomableImageView.this.f44339i.y);
                ZoomableImageView zoomableImageView5 = ZoomableImageView.this;
                zoomableImageView5.f44335e = 0;
                if (abs < 3 && abs2 < 3) {
                    zoomableImageView5.performClick();
                }
            } else if (action == 2) {
                ZoomableImageView zoomableImageView6 = ZoomableImageView.this;
                if (zoomableImageView6.f44335e == 1) {
                    zoomableImageView6.r(f10, f11, pointF);
                }
            } else if (action == 6) {
                ZoomableImageView.this.f44335e = 0;
            }
            ZoomableImageView zoomableImageView7 = ZoomableImageView.this;
            zoomableImageView7.setImageMatrix(zoomableImageView7.f44334d);
            ZoomableImageView.this.invalidate();
            return false;
        }
    }

    public class b implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

        /* renamed from: a, reason: collision with root package name */
        public float f44360a = 2.0f;

        /* renamed from: b, reason: collision with root package name */
        public int f44361b = 0;

        /* renamed from: c, reason: collision with root package name */
        public Context f44362c;

        public b(Context context) {
            this.f44362c = context;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (this.f44361b != 1) {
                ZoomableImageView.this.f44331G.onTouchEvent(motionEvent);
                ZoomableImageView.this.p(this.f44360a, motionEvent.getX(), motionEvent.getY());
                this.f44361b++;
            } else {
                ZoomableImageView.this.m();
                ZoomableImageView.this.p(1.0f, motionEvent.getX(), motionEvent.getY());
                this.f44361b = 0;
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            ZoomableImageView.this.f44341k = false;
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C1908a.b(MobilistenInitProvider.k().getBaseContext()).d(new Intent("201"));
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float min = (float) Math.min(Math.max(0.95f, scaleGestureDetector.getScaleFactor()), 1.05d);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.p(min, zoomableImageView.f44331G.getFocusX(), ZoomableImageView.this.f44331G.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            ZoomableImageView.l(ZoomableImageView.this);
            ZoomableImageView.this.f44335e = 2;
            return true;
        }

        public /* synthetic */ c(ZoomableImageView zoomableImageView, a aVar) {
            this();
        }
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44334d = new Matrix();
        this.f44335e = 0;
        this.f44336f = true;
        this.f44337g = false;
        this.f44338h = new PointF();
        this.f44339i = new PointF();
        this.f44340j = new Handler();
        this.f44341k = true;
        this.f44342l = 1.0f;
        this.f44344n = 3.0f;
        this.f44345o = 0;
        this.f44350t = 0.0f;
        this.f44353w = 1.0f;
        this.f44333I = false;
        q(context);
        b bVar = new b(context);
        GestureDetector gestureDetector = new GestureDetector(context, bVar);
        this.f44332H = gestureDetector;
        gestureDetector.setOnDoubleTapListener(bVar);
    }

    public static /* synthetic */ g l(ZoomableImageView zoomableImageView) {
        zoomableImageView.getClass();
        return null;
    }

    public void m() {
        float min = Math.min(this.f44348r / this.f44326B, this.f44349s / this.f44327C);
        this.f44350t = min;
        this.f44334d.setScale(min, min);
        setImageMatrix(this.f44334d);
        this.f44353w = 1.0f;
        float f10 = this.f44349s;
        float f11 = this.f44350t;
        float f12 = f10 - (this.f44327C * f11);
        float f13 = this.f44348r - (f11 * this.f44326B);
        float f14 = f12 / 2.0f;
        this.f44347q = f14;
        float f15 = f13 / 2.0f;
        this.f44346p = f15;
        this.f44329E = f15;
        this.f44330F = f14;
        this.f44334d.postTranslate(f15, f14);
        float f16 = this.f44348r;
        float f17 = this.f44346p;
        this.f44356z = f16 - (f17 * 2.0f);
        float f18 = this.f44349s;
        float f19 = this.f44347q;
        this.f44325A = f18 - (f19 * 2.0f);
        float f20 = this.f44353w;
        this.f44354x = ((f16 * f20) - f16) - ((f17 * 2.0f) * f20);
        this.f44355y = ((f18 * f20) - f18) - ((f19 * 2.0f) * f20);
        setImageMatrix(this.f44334d);
        Matrix matrix = new Matrix();
        f44324J = matrix;
        matrix.set(this.f44334d);
    }

    public void n() {
        this.f44337g = false;
        m();
        invalidate();
    }

    public void o(boolean z10) {
        this.f44333I = z10;
        q(getContext());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f44348r = View.MeasureSpec.getSize(i10);
        this.f44349s = View.MeasureSpec.getSize(i11);
        if (this.f44337g) {
            return;
        }
        m();
        this.f44337g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16 = this.f44353w;
        float f17 = f16 * f10;
        this.f44353w = f17;
        float f18 = this.f44344n;
        if (f17 <= f18) {
            f18 = this.f44342l;
            if (f17 < f18) {
                this.f44353w = f18;
            }
            f13 = this.f44348r;
            f14 = this.f44353w;
            this.f44354x = ((f13 * f14) - f13) - ((this.f44346p * 2.0f) * f14);
            f15 = this.f44349s;
            this.f44355y = ((f15 * f14) - f15) - ((this.f44347q * 2.0f) * f14);
            if (this.f44356z * f14 <= f13 && this.f44325A * f14 > f15) {
                this.f44334d.postScale(f10, f10, f11, f12);
                this.f44334d.getValues(this.f44343m);
                float[] fArr = this.f44343m;
                float f19 = fArr[2];
                float f20 = fArr[5];
                if (f10 < 1.0f) {
                    float f21 = this.f44354x;
                    if (f19 < (-f21)) {
                        this.f44334d.postTranslate(-(f19 + f21), 0.0f);
                    } else if (f19 > 0.0f) {
                        this.f44334d.postTranslate(-f19, 0.0f);
                    }
                    float f22 = this.f44355y;
                    if (f20 < (-f22)) {
                        this.f44334d.postTranslate(0.0f, -(f20 + f22));
                        return;
                    } else {
                        if (f20 > 0.0f) {
                            this.f44334d.postTranslate(0.0f, -f20);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            this.f44334d.postScale(f10, f10, f13 / 2.0f, f15 / 2.0f);
            if (f10 >= 1.0f) {
                this.f44334d.getValues(this.f44343m);
                float[] fArr2 = this.f44343m;
                float f23 = fArr2[2];
                float f24 = fArr2[5];
                if (f10 < 1.0f) {
                    if (Math.round(this.f44356z * this.f44353w) < this.f44348r) {
                        float f25 = this.f44355y;
                        if (f24 < (-f25)) {
                            this.f44334d.postTranslate(0.0f, -(f24 + f25));
                            return;
                        } else {
                            if (f24 > 0.0f) {
                                this.f44334d.postTranslate(0.0f, -f24);
                                return;
                            }
                            return;
                        }
                    }
                    float f26 = this.f44354x;
                    if (f23 < (-f26)) {
                        this.f44334d.postTranslate(-(f23 + f26), 0.0f);
                        return;
                    } else {
                        if (f23 > 0.0f) {
                            this.f44334d.postTranslate(-f23, 0.0f);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.f44353w = f18;
        f10 = f18 / f16;
        f13 = this.f44348r;
        f14 = this.f44353w;
        this.f44354x = ((f13 * f14) - f13) - ((this.f44346p * 2.0f) * f14);
        f15 = this.f44349s;
        this.f44355y = ((f15 * f14) - f15) - ((this.f44347q * 2.0f) * f14);
        if (this.f44356z * f14 <= f13) {
        }
        this.f44334d.postScale(f10, f10, f13 / 2.0f, f15 / 2.0f);
        if (f10 >= 1.0f) {
        }
    }

    public void q(Context context) {
        super.setClickable(true);
        this.f44331G = new ScaleGestureDetector(context, new c(this, null));
        this.f44334d.setTranslate(1.0f, 1.0f);
        this.f44343m = new float[9];
        setImageMatrix(this.f44334d);
        setScaleType(ImageView.ScaleType.MATRIX);
        if (this.f44333I) {
            setOnTouchListener(null);
        } else {
            setOnTouchListener(new a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(float f10, float f11, PointF pointF) {
        float f12;
        View view;
        View view2;
        View view3;
        float f13 = pointF.x;
        PointF pointF2 = this.f44338h;
        float f14 = f13 - pointF2.x;
        float f15 = pointF.y - pointF2.y;
        float round = Math.round(this.f44356z * this.f44353w);
        float round2 = Math.round(this.f44325A * this.f44353w);
        if (this.f44353w == 1.0d) {
            boolean z10 = this.f44341k;
        }
        float f16 = this.f44348r;
        float f17 = 0.0f;
        if (round <= f16 && round2 <= this.f44349s && this.f44351u != null) {
            this.f44341k = true;
            float f18 = pointF.y;
            float f19 = this.f44339i.y;
            float f20 = 1.0f - ((f18 - f19) / 1000.0f);
            if (f20 >= 1.0f) {
                f20 = 1.0f - ((f19 - f18) / 1000.0f);
            }
            if (getDrawable() != null) {
                getDrawable().setAlpha(255);
            }
            setAlpha(255);
            int i10 = 255 - ((int) (255.0f - (f20 * 255.0f)));
            int i11 = i10 <= 255 ? i10 : 255;
            String hexString = Integer.toHexString(i11 >= 0 ? i11 : 0);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            View view4 = this.f44351u;
            if (view4 != null) {
                view4.setBackgroundColor(Color.parseColor("#" + hexString + "000000"));
            }
        } else if (round < f16) {
            float f21 = f11 + f15;
            if (f21 <= 0.0f) {
                float f22 = this.f44355y;
                if (f21 < (-f22)) {
                    f11 += f22;
                }
                view3 = this.f44351u;
                if (view3 != null) {
                    view3.setBackgroundColor(Color.parseColor("#000000"));
                }
                this.f44341k = false;
            }
            f15 = -f11;
            view3 = this.f44351u;
            if (view3 != null) {
            }
            this.f44341k = false;
        } else {
            if (round2 < this.f44349s) {
                float f23 = f10 + f14;
                if (f23 <= 0.0f) {
                    float f24 = this.f44354x;
                    if (f23 < (-f24)) {
                        f10 += f24;
                    }
                    view2 = this.f44351u;
                    if (view2 != null) {
                        view2.setBackgroundColor(Color.parseColor("#000000"));
                    }
                    this.f44341k = false;
                    f15 = 0.0f;
                }
                f14 = -f10;
                view2 = this.f44351u;
                if (view2 != null) {
                }
                this.f44341k = false;
                f15 = 0.0f;
            } else {
                float f25 = f10 + f14;
                if (f25 <= 0.0f) {
                    float f26 = this.f44354x;
                    if (f25 < (-f26)) {
                        f10 += f26;
                    }
                    f12 = f11 + f15;
                    if (f12 <= 0.0f) {
                        float f27 = this.f44355y;
                        if (f12 < (-f27)) {
                            f11 += f27;
                        }
                        view = this.f44351u;
                        if (view != null) {
                            view.setBackgroundColor(Color.parseColor("#000000"));
                        }
                        this.f44341k = false;
                    }
                    f15 = -f11;
                    view = this.f44351u;
                    if (view != null) {
                    }
                    this.f44341k = false;
                }
                f14 = -f10;
                f12 = f11 + f15;
                if (f12 <= 0.0f) {
                }
                f15 = -f11;
                view = this.f44351u;
                if (view != null) {
                }
                this.f44341k = false;
            }
            f17 = f14;
        }
        this.f44334d.postTranslate(f17, f15);
        this.f44338h.set(pointF.x, pointF.y);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap != null) {
            this.f44326B = bitmap.getWidth();
            this.f44327C = bitmap.getHeight();
            m();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            this.f44326B = drawable.getIntrinsicWidth();
            this.f44327C = drawable.getIntrinsicHeight();
            m();
        }
    }

    public void setMaxZoom(float f10) {
        this.f44344n = f10;
    }

    public void setListener(g gVar) {
    }
}
