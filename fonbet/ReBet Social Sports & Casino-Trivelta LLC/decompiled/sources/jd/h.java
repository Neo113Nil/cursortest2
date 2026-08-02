package jd;

import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public float f53968a;

    /* renamed from: b, reason: collision with root package name */
    public float f53969b;

    /* renamed from: c, reason: collision with root package name */
    public float f53970c;

    /* renamed from: d, reason: collision with root package name */
    public float f53971d;

    /* renamed from: e, reason: collision with root package name */
    public int f53972e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f53973f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f53974g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f53975h;

    /* renamed from: i, reason: collision with root package name */
    public a f53976i;

    public interface a {
        boolean a(h hVar);
    }

    public static class b implements a {
    }

    public h(a aVar) {
        this.f53976i = aVar;
    }

    public final float a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return b((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    public final float b(float f10, float f11) {
        float f12 = (f11 % 360.0f) - (f10 % 360.0f);
        this.f53974g = f12;
        if (f12 < -180.0f) {
            this.f53974g = f12 + 360.0f;
        } else if (f12 > 180.0f) {
            this.f53974g = f12 - 360.0f;
        }
        return this.f53974g;
    }

    public float c() {
        return this.f53974g;
    }

    public boolean d(MotionEvent motionEvent) {
        h hVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f53970c = motionEvent.getX();
            this.f53971d = motionEvent.getY();
            this.f53972e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.f53974g = 0.0f;
            this.f53975h = true;
        } else if (actionMasked == 1) {
            this.f53972e = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f53968a = motionEvent.getX();
                this.f53969b = motionEvent.getY();
                this.f53973f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.f53974g = 0.0f;
                this.f53975h = true;
            } else if (actionMasked == 6) {
                this.f53973f = -1;
            }
        } else if (this.f53972e != -1 && this.f53973f != -1 && motionEvent.getPointerCount() > this.f53973f) {
            float x10 = motionEvent.getX(this.f53972e);
            float y10 = motionEvent.getY(this.f53972e);
            float x11 = motionEvent.getX(this.f53973f);
            float y11 = motionEvent.getY(this.f53973f);
            if (this.f53975h) {
                this.f53974g = 0.0f;
                this.f53975h = false;
                hVar = this;
            } else {
                a(this.f53968a, this.f53969b, this.f53970c, this.f53971d, x11, y11, x10, y10);
                hVar = this;
            }
            a aVar = hVar.f53976i;
            if (aVar != null) {
                aVar.a(this);
            }
            hVar.f53968a = x11;
            hVar.f53969b = y11;
            hVar.f53970c = x10;
            hVar.f53971d = y10;
        }
        return true;
    }
}
