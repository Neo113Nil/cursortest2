package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import jd.h;

/* loaded from: classes4.dex */
public class GestureCropImageView extends com.yalantis.ucrop.view.a {

    /* renamed from: C, reason: collision with root package name */
    public ScaleGestureDetector f42282C;

    /* renamed from: D, reason: collision with root package name */
    public h f42283D;

    /* renamed from: E, reason: collision with root package name */
    public GestureDetector f42284E;

    /* renamed from: F, reason: collision with root package name */
    public float f42285F;

    /* renamed from: G, reason: collision with root package name */
    public float f42286G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f42287H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f42288I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f42289J;

    /* renamed from: K, reason: collision with root package name */
    public int f42290K;

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.D(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            GestureCropImageView.this.o(-f10, -f11);
            return true;
        }
    }

    public class c extends h.b {
        public c() {
        }

        @Override // jd.h.a
        public boolean a(h hVar) {
            GestureCropImageView.this.m(hVar.c(), GestureCropImageView.this.f42285F, GestureCropImageView.this.f42286G);
            return true;
        }
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.n(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.f42285F, GestureCropImageView.this.f42286G);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void K() {
        this.f42284E = new GestureDetector(getContext(), new b(), null, true);
        this.f42282C = new ScaleGestureDetector(getContext(), new d());
        this.f42283D = new h(new c());
    }

    public int getDoubleTapScaleSteps() {
        return this.f42290K;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f42290K));
    }

    @Override // com.yalantis.ucrop.view.b
    public void k() {
        super.k();
        K();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            v();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f42285F = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.f42286G = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.f42289J) {
            this.f42284E.onTouchEvent(motionEvent);
        }
        if (this.f42288I) {
            this.f42282C.onTouchEvent(motionEvent);
        }
        if (this.f42287H) {
            this.f42283D.d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            B();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.f42290K = i10;
    }

    public void setGestureEnabled(boolean z10) {
        this.f42289J = z10;
    }

    public void setRotateEnabled(boolean z10) {
        this.f42287H = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.f42288I = z10;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42287H = true;
        this.f42288I = true;
        this.f42289J = true;
        this.f42290K = 5;
    }
}
