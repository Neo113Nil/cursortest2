package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector.OnGestureListener f51002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51004c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51005d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51006e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51007f;

    /* renamed from: g, reason: collision with root package name */
    public float f51008g;

    /* renamed from: h, reason: collision with root package name */
    public float f51009h;

    /* renamed from: i, reason: collision with root package name */
    public float f51010i;

    /* renamed from: j, reason: collision with root package name */
    public float f51011j;

    /* renamed from: k, reason: collision with root package name */
    public MotionEvent f51012k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f51013l;

    /* renamed from: m, reason: collision with root package name */
    public final C4843a f51014m = new C4843a();

    public c(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f51002a = onGestureListener;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f51003b = scaledTouchSlop * scaledTouchSlop;
        this.f51004c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f51005d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void a(MotionEvent motionEvent) {
        InterfaceC4765j0 d10 = this.f51014m.d();
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f51013l == null) {
                this.f51013l = VelocityTracker.obtain();
            }
            this.f51013l.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.f51008g = motionEvent.getX();
                float y10 = motionEvent.getY();
                this.f51009h = y10;
                this.f51010i = this.f51008g;
                this.f51011j = y10;
                this.f51006e = true;
                this.f51007f = false;
                MotionEvent motionEvent2 = this.f51012k;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f51012k = MotionEvent.obtain(motionEvent);
                this.f51002a.onDown(motionEvent);
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x10 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    float f10 = x10 - this.f51008g;
                    float f11 = y11 - this.f51009h;
                    if ((f10 * f10) + (f11 * f11) > this.f51003b) {
                        this.f51002a.onScroll(this.f51012k, motionEvent, this.f51010i - x10, this.f51011j - y11);
                        this.f51006e = false;
                        this.f51010i = x10;
                        this.f51011j = y11;
                    }
                } else if (actionMasked == 3) {
                    b();
                } else if (actionMasked == 5) {
                    this.f51006e = false;
                    this.f51007f = true;
                }
            } else if (this.f51007f) {
                b();
            } else {
                if (this.f51006e) {
                    this.f51002a.onSingleTapUp(motionEvent);
                } else {
                    int pointerId = motionEvent.getPointerId(0);
                    this.f51013l.computeCurrentVelocity(1000, this.f51005d);
                    float xVelocity = this.f51013l.getXVelocity(pointerId);
                    float yVelocity = this.f51013l.getYVelocity(pointerId);
                    if (Math.abs(xVelocity) > this.f51004c || Math.abs(yVelocity) > this.f51004c) {
                        this.f51002a.onFling(this.f51012k, motionEvent, xVelocity, yVelocity);
                    }
                }
                b();
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void b() {
        InterfaceC4765j0 d10 = this.f51014m.d();
        try {
            MotionEvent motionEvent = this.f51012k;
            this.f51012k = null;
            VelocityTracker velocityTracker = this.f51013l;
            this.f51013l = null;
            if (d10 != null) {
                d10.close();
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
