package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uqj extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, hwd, iwd {
    public final GestureDetector e;
    public final Object g;
    public final /* synthetic */ int a = 0;
    public final PointF b = new PointF();
    public final PointF c = new PointF();
    public final float d = 25.0f;
    public volatile float f = 3.1415927f;

    public uqj(Context context, lxh lxhVar) {
        this.g = lxhVar;
        this.e = new GestureDetector(context, this);
    }

    @Override // defpackage.hwd, defpackage.iwd
    public final void a(float[] fArr, float f) {
        switch (this.a) {
            case 0:
                this.f = -f;
                break;
            default:
                this.f = -f;
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int i = this.a;
        PointF pointF = this.b;
        switch (i) {
            case 0:
                pointF.set(motionEvent.getX(), motionEvent.getY());
                break;
            default:
                pointF.set(motionEvent.getX(), motionEvent.getY());
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 0:
                float x = (motionEvent2.getX() - this.b.x) / this.d;
                float y = motionEvent2.getY();
                PointF pointF = this.b;
                float f3 = (y - pointF.y) / this.d;
                pointF.set(motionEvent2.getX(), motionEvent2.getY());
                double d = this.f;
                float cos = (float) Math.cos(d);
                float sin = (float) Math.sin(d);
                PointF pointF2 = this.c;
                pointF2.x -= (cos * x) - (sin * f3);
                float f4 = (cos * f3) + (sin * x) + pointF2.y;
                pointF2.y = f4;
                pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
                lxh lxhVar = (lxh) this.g;
                PointF pointF3 = this.c;
                synchronized (lxhVar) {
                    float f5 = pointF3.y;
                    lxhVar.g = f5;
                    Matrix.setRotateM(lxhVar.e, 0, -f5, (float) Math.cos(lxhVar.h), (float) Math.sin(lxhVar.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Matrix.setRotateM(lxhVar.f, 0, -pointF3.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return true;
            default:
                float x2 = (motionEvent2.getX() - this.b.x) / this.d;
                float y2 = motionEvent2.getY();
                PointF pointF4 = this.b;
                float f6 = (y2 - pointF4.y) / this.d;
                pointF4.set(motionEvent2.getX(), motionEvent2.getY());
                double d2 = this.f;
                float cos2 = (float) Math.cos(d2);
                float sin2 = (float) Math.sin(d2);
                PointF pointF5 = this.c;
                pointF5.x -= (cos2 * x2) - (sin2 * f6);
                float f7 = (cos2 * f6) + (sin2 * x2) + pointF5.y;
                pointF5.y = f7;
                pointF5.y = Math.max(-45.0f, Math.min(45.0f, f7));
                lxh lxhVar2 = (lxh) this.g;
                PointF pointF6 = this.c;
                synchronized (lxhVar2) {
                    float f8 = pointF6.y;
                    lxhVar2.g = f8;
                    Matrix.setRotateM(lxhVar2.e, 0, -f8, (float) Math.cos(lxhVar2.h), (float) Math.sin(lxhVar2.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Matrix.setRotateM(lxhVar2.f, 0, -pointF6.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((mxh) ((lxh) obj).l).performClick();
            default:
                return ((nxh) ((lxh) obj).l).performClick();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
        }
        return this.e.onTouchEvent(motionEvent);
    }

    public uqj(Context context, lxh lxhVar, byte b) {
        this.g = lxhVar;
        this.e = new GestureDetector(context, this);
    }
}
