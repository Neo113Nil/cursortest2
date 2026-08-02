package Ic;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f5701a;

    /* renamed from: b, reason: collision with root package name */
    public long f5702b;

    /* renamed from: c, reason: collision with root package name */
    public long f5703c;

    /* renamed from: d, reason: collision with root package name */
    public double f5704d;

    /* renamed from: e, reason: collision with root package name */
    public double f5705e;

    /* renamed from: f, reason: collision with root package name */
    public float f5706f;

    /* renamed from: g, reason: collision with root package name */
    public float f5707g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5708h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5709i;

    @NotNull
    private final int[] pointerIds = new int[2];

    public interface a {
        boolean a(w wVar);

        boolean b(w wVar);

        void c(w wVar);
    }

    public w(a aVar) {
        this.f5701a = aVar;
    }

    public final void a() {
        if (this.f5708h) {
            this.f5709i = false;
            this.f5708h = false;
            a aVar = this.f5701a;
            if (aVar != null) {
                aVar.c(this);
            }
        }
    }

    public final float b() {
        return this.f5706f;
    }

    public final float c() {
        return this.f5707g;
    }

    public final double d() {
        return this.f5705e;
    }

    public final long e() {
        return this.f5702b - this.f5703c;
    }

    public final boolean f(MotionEvent event) {
        a aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f5708h = false;
            this.pointerIds[0] = event.getPointerId(event.getActionIndex());
            this.pointerIds[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.f5708h || this.f5709i) {
                    this.pointerIds[1] = event.getPointerId(event.getActionIndex());
                    i(event);
                }
                if (!this.f5708h) {
                    this.f5708h = true;
                    this.f5703c = event.getEventTime();
                    this.f5704d = Double.NaN;
                    a aVar2 = this.f5701a;
                    if (aVar2 != null) {
                        aVar2.b(this);
                    }
                }
            } else if (actionMasked == 6 && this.f5708h) {
                int pointerId = event.getPointerId(event.getActionIndex());
                int[] iArr = this.pointerIds;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    g();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    g();
                }
            }
        } else if (this.f5708h) {
            i(event);
            if (!this.f5709i && (aVar = this.f5701a) != null) {
                aVar.a(this);
            }
        }
        return true;
    }

    public final void g() {
        if (this.f5709i) {
            return;
        }
        this.f5709i = true;
    }

    public final void h(double d10) {
        if (this.f5709i) {
            this.f5704d = d10;
            this.f5709i = false;
        }
    }

    public final void i(MotionEvent motionEvent) {
        this.f5703c = this.f5702b;
        this.f5702b = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.pointerIds[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.pointerIds[1]);
        if (findPointerIndex == -1 || findPointerIndex2 == -1) {
            return;
        }
        float x10 = motionEvent.getX(findPointerIndex);
        float y10 = motionEvent.getY(findPointerIndex);
        float x11 = motionEvent.getX(findPointerIndex2);
        float y11 = motionEvent.getY(findPointerIndex2);
        this.f5706f = (x10 + x11) * 0.5f;
        this.f5707g = (y10 + y11) * 0.5f;
        double d10 = -Math.atan2(y11 - y10, x11 - x10);
        h(d10);
        double d11 = Double.isNaN(this.f5704d) ? 0.0d : this.f5704d - d10;
        this.f5705e = d11;
        this.f5704d = d10;
        if (d11 > 3.141592653589793d) {
            this.f5705e = d11 - 3.141592653589793d;
        } else if (d11 < -3.141592653589793d) {
            this.f5705e = d11 + 3.141592653589793d;
        }
        double d12 = this.f5705e;
        if (d12 > 1.5707963267948966d) {
            this.f5705e = d12 - 3.141592653589793d;
        } else if (d12 < -1.5707963267948966d) {
            this.f5705e = d12 + 3.141592653589793d;
        }
    }
}
