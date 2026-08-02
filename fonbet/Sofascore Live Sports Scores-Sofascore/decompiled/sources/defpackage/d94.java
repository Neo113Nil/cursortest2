package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.github.chrisbanes.photoview.PhotoView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d94 {
    public int a = -1;
    public int b = 0;
    public final ScaleGestureDetector c;
    public VelocityTracker d;
    public boolean e;
    public float f;
    public float g;
    public final float h;
    public final float i;
    public final e3c j;

    public d94(Context context, e3c e3cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        this.j = e3cVar;
        this.c = new ScaleGestureDetector(context, new c94(this));
    }

    public final void a(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        int i;
        int i2;
        int i3;
        int i4;
        float x3;
        float y3;
        int i5;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            e3c e3cVar = this.j;
            if (action == 1) {
                this.a = -1;
                if (this.e && this.d != null) {
                    try {
                        x2 = motionEvent.getX(this.b);
                    } catch (Exception unused) {
                        x2 = motionEvent.getX();
                    }
                    this.f = x2;
                    try {
                        y2 = motionEvent.getY(this.b);
                    } catch (Exception unused2) {
                        y2 = motionEvent.getY();
                    }
                    this.g = y2;
                    this.d.addMovement(motionEvent);
                    this.d.computeCurrentVelocity(1000);
                    float xVelocity = this.d.getXVelocity();
                    float yVelocity = this.d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.i) {
                        zfe zfeVar = (zfe) e3cVar.b;
                        PhotoView photoView = zfeVar.h;
                        y94 y94Var = new y94(zfeVar, photoView.getContext());
                        zfeVar.s = y94Var;
                        int width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
                        int height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
                        int i6 = (int) (-xVelocity);
                        int i7 = (int) (-yVelocity);
                        zfeVar.b();
                        Matrix c = zfeVar.c();
                        RectF rectF = zfeVar.n;
                        if (photoView.getDrawable() != null) {
                            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r13.getIntrinsicWidth(), r13.getIntrinsicHeight());
                            c.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int round = Math.round(-rectF.left);
                            float f = width;
                            if (f < rectF.width()) {
                                i = Math.round(rectF.width() - f);
                                i2 = 0;
                            } else {
                                i = round;
                                i2 = i;
                            }
                            int round2 = Math.round(-rectF.top);
                            float f2 = height;
                            if (f2 < rectF.height()) {
                                i3 = Math.round(rectF.height() - f2);
                                i4 = 0;
                            } else {
                                i3 = round2;
                                i4 = i3;
                            }
                            y94Var.b = round;
                            y94Var.c = round2;
                            if (round != i || round2 != i3) {
                                ((OverScroller) y94Var.d).fling(round, round2, i6, i7, i2, i, i4, i3, 0, 0);
                            }
                        }
                        photoView.post(zfeVar.s);
                    }
                }
                VelocityTracker velocityTracker = this.d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.d = null;
                }
            } else if (action == 2) {
                try {
                    x3 = motionEvent.getX(this.b);
                } catch (Exception unused3) {
                    x3 = motionEvent.getX();
                }
                try {
                    y3 = motionEvent.getY(this.b);
                } catch (Exception unused4) {
                    y3 = motionEvent.getY();
                }
                float f3 = x3 - this.f;
                float f4 = y3 - this.g;
                boolean z = this.e;
                if (!z) {
                    z = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.h);
                    this.e = z;
                }
                if (z) {
                    zfe zfeVar2 = (zfe) e3cVar.b;
                    d94 d94Var = zfeVar2.j;
                    if (!d94Var.c.isInProgress()) {
                        zfeVar2.m.postTranslate(f3, f4);
                        zfeVar2.a();
                        ViewParent parent = zfeVar2.h.getParent();
                        if (zfeVar2.f && !d94Var.c.isInProgress() && !zfeVar2.g) {
                            int i8 = zfeVar2.t;
                            if ((i8 == 2 || ((i8 == 0 && f3 >= 1.0f) || ((i8 == 1 && f3 <= -1.0f) || (((i5 = zfeVar2.u) == 0 && f4 >= 1.0f) || (i5 == 1 && f4 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f = x3;
                    this.g = y3;
                    VelocityTracker velocityTracker2 = this.d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.a = -1;
                VelocityTracker velocityTracker3 = this.d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.a) {
                    int i9 = action2 != 0 ? 0 : 1;
                    this.a = motionEvent.getPointerId(i9);
                    this.f = motionEvent.getX(i9);
                    this.g = motionEvent.getY(i9);
                }
            }
        } else {
            this.a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.b);
            } catch (Exception unused5) {
                x = motionEvent.getX();
            }
            this.f = x;
            try {
                y = motionEvent.getY(this.b);
            } catch (Exception unused6) {
                y = motionEvent.getY();
            }
            this.g = y;
            this.e = false;
        }
        int i10 = this.a;
        this.b = motionEvent.findPointerIndex(i10 != -1 ? i10 : 0);
    }
}
