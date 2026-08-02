package Ic;

import Ic.AbstractC1350d;
import Ic.C;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.react.bridge.ReadableMap;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ic.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1348b extends AbstractC1350d {

    /* renamed from: Q, reason: collision with root package name */
    public static final a f5537Q = new a(null);

    /* renamed from: R, reason: collision with root package name */
    public static final double f5538R;

    /* renamed from: S, reason: collision with root package name */
    public static final double f5539S;

    /* renamed from: M, reason: collision with root package name */
    public Handler f5544M;

    /* renamed from: N, reason: collision with root package name */
    public int f5545N;

    /* renamed from: P, reason: collision with root package name */
    public VelocityTracker f5547P;

    /* renamed from: I, reason: collision with root package name */
    public int f5540I = 1;

    /* renamed from: J, reason: collision with root package name */
    public int f5541J = 1;

    /* renamed from: K, reason: collision with root package name */
    public final long f5542K = 800;

    /* renamed from: L, reason: collision with root package name */
    public final long f5543L = 2000;

    /* renamed from: O, reason: collision with root package name */
    public final Runnable f5546O = new Runnable() { // from class: Ic.a
        @Override // java.lang.Runnable
        public final void run() {
            C1348b.X0(C1348b.this);
        }
    };

    /* renamed from: Ic.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: Ic.b$b, reason: collision with other inner class name */
    public static final class C0121b extends AbstractC1350d.c {

        /* renamed from: d, reason: collision with root package name */
        public static final a f5548d = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public final Class f5549b = C1348b.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5550c = "FlingGestureHandler";

        /* renamed from: Ic.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5550c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5549b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1348b a(Context context) {
            return new C1348b();
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.a c(C1348b handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.a(handler);
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(C1348b handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfPointers")) {
                handler.Z0(config.getInt("numberOfPointers"));
            }
            if (config.hasKey(EventKeys.DIRECTION_KEY)) {
                handler.Y0(config.getInt(EventKeys.DIRECTION_KEY));
            }
        }
    }

    static {
        k kVar = k.f5610a;
        f5538R = kVar.a(30.0d);
        f5539S = kVar.a(60.0d);
    }

    public static final void X0(C1348b c1348b) {
        c1348b.D();
    }

    public static final boolean c1(C1348b c1348b, C c10, int i10, double d10) {
        return (c1348b.f5541J & i10) == i10 && c10.l(C.f5521f.a(i10), d10);
    }

    public final void V0(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        Intrinsics.checkNotNull(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    public final void W0(MotionEvent motionEvent) {
        if (b1(motionEvent)) {
            return;
        }
        D();
    }

    public final void Y0(int i10) {
        this.f5541J = i10;
    }

    public final void Z0(int i10) {
        this.f5540I = i10;
    }

    public final void a1(MotionEvent motionEvent) {
        this.f5547P = VelocityTracker.obtain();
        p();
        this.f5545N = 1;
        Handler handler = this.f5544M;
        if (handler == null) {
            this.f5544M = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f5544M;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.f5546O, this.f5542K);
    }

    public final boolean b1(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        V0(this.f5547P, motionEvent);
        C.a aVar = C.f5521f;
        VelocityTracker velocityTracker = this.f5547P;
        Intrinsics.checkNotNull(velocityTracker);
        C b10 = aVar.b(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.add(Boolean.valueOf(c1(this, b10, numArr[i10].intValue(), f5538R)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList2.add(Boolean.valueOf(c1(this, b10, numArr2[i11].intValue(), f5539S)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = z10 | z11;
        boolean z13 = b10.k() > ((double) this.f5543L);
        if (this.f5545N != this.f5540I || !z12 || !z13) {
            return false;
        }
        Handler handler = this.f5544M;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacksAndMessages(null);
        k();
        return true;
    }

    @Override // Ic.AbstractC1350d
    public void j0() {
        Handler handler = this.f5544M;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ic.AbstractC1350d
    public void l(boolean z10) {
        super.l(z10);
        B();
    }

    @Override // Ic.AbstractC1350d
    public void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            int S10 = S();
            if (S10 == 0) {
                a1(sourceEvent);
            }
            if (S10 == 2) {
                b1(sourceEvent);
                if (sourceEvent.getPointerCount() > this.f5545N) {
                    this.f5545N = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    W0(sourceEvent);
                }
            }
        }
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        VelocityTracker velocityTracker = this.f5547P;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f5547P = null;
        Handler handler = this.f5544M;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ic.AbstractC1350d
    public void s0() {
        super.s0();
        this.f5540I = 1;
        this.f5541J = 1;
    }
}
