package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2103o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19250a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2105p f19251b;

    /* renamed from: c, reason: collision with root package name */
    public final b f19252c;

    /* renamed from: d, reason: collision with root package name */
    public final a f19253d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f19254e;

    /* renamed from: f, reason: collision with root package name */
    public float f19255f;

    /* renamed from: g, reason: collision with root package name */
    public int f19256g;

    /* renamed from: h, reason: collision with root package name */
    public int f19257h;

    /* renamed from: i, reason: collision with root package name */
    public int f19258i;
    private final int[] mFlingVelocityThresholds;

    /* renamed from: androidx.core.view.o$a */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* renamed from: androidx.core.view.o$b */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C2103o(Context context, InterfaceC2105p interfaceC2105p) {
        this(context, interfaceC2105p, new b() { // from class: androidx.core.view.m
            @Override // androidx.core.view.C2103o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C2103o.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.n
            @Override // androidx.core.view.C2103o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                float f10;
                f10 = C2103o.f(velocityTracker, motionEvent, i10);
                return f10;
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC2088g0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = AbstractC2088g0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        AbstractC2076a0.a(velocityTracker, motionEvent);
        AbstractC2076a0.b(velocityTracker, 1000);
        return AbstractC2076a0.d(velocityTracker, i10);
    }

    public final boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f19257h == source && this.f19258i == deviceId && this.f19256g == i10) {
            return false;
        }
        this.f19252c.a(this.f19250a, this.mFlingVelocityThresholds, motionEvent, i10);
        this.f19257h = source;
        this.f19258i = deviceId;
        this.f19256g = i10;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i10) {
        if (this.f19254e == null) {
            this.f19254e = VelocityTracker.obtain();
        }
        return this.f19253d.a(this.f19254e, motionEvent, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean d10 = d(motionEvent, i10);
        if (this.mFlingVelocityThresholds[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f19254e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f19254e = null;
                return;
            }
            return;
        }
        float e10 = e(motionEvent, i10) * this.f19251b.b();
        float signum = Math.signum(e10);
        if (d10 || (signum != Math.signum(this.f19255f) && signum != 0.0f)) {
            this.f19251b.c();
        }
        float abs = Math.abs(e10);
        int[] iArr = this.mFlingVelocityThresholds;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e10, iArr[1]));
        this.f19255f = this.f19251b.a(max) ? max : 0.0f;
    }

    public C2103o(Context context, InterfaceC2105p interfaceC2105p, b bVar, a aVar) {
        this.f19256g = -1;
        this.f19257h = -1;
        this.f19258i = -1;
        this.mFlingVelocityThresholds = new int[]{Integer.MAX_VALUE, 0};
        this.f19250a = context;
        this.f19251b = interfaceC2105p;
        this.f19252c = bVar;
        this.f19253d = aVar;
    }
}
