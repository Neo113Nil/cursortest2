package G1;

import G1.d;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f3844c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3845d;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f3846e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f3842a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f3843b = new PointF();

    /* renamed from: f, reason: collision with root package name */
    public volatile float f3847f = 3.1415927f;

    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f3844c = aVar;
        this.f3845d = f10;
        this.f3846e = new GestureDetector(context, this);
    }

    @Override // G1.d.a
    public void a(float[] fArr, float f10) {
        this.f3847f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f3842a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f3842a.x) / this.f3845d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f3842a;
        float f12 = (y10 - pointF.y) / this.f3845d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f3847f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f3843b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f3844c.b(this.f3843b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f3844c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f3846e.onTouchEvent(motionEvent);
    }
}
