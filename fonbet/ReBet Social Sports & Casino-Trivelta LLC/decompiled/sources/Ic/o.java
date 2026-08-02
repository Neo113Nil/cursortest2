package Ic;

import Ic.AbstractC1350d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class o extends AbstractC1350d {

    /* renamed from: S, reason: collision with root package name */
    public static final a f5620S = new a(null);

    /* renamed from: I, reason: collision with root package name */
    public long f5621I;

    /* renamed from: J, reason: collision with root package name */
    public final float f5622J;

    /* renamed from: K, reason: collision with root package name */
    public float f5623K;

    /* renamed from: L, reason: collision with root package name */
    public int f5624L;

    /* renamed from: M, reason: collision with root package name */
    public float f5625M;

    /* renamed from: N, reason: collision with root package name */
    public float f5626N;

    /* renamed from: O, reason: collision with root package name */
    public long f5627O;

    /* renamed from: P, reason: collision with root package name */
    public long f5628P;

    /* renamed from: Q, reason: collision with root package name */
    public Handler f5629Q;

    /* renamed from: R, reason: collision with root package name */
    public int f5630R;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends AbstractC1350d.c {

        /* renamed from: d, reason: collision with root package name */
        public static final a f5631d = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public final Class f5632b = o.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5633c = "LongPressGestureHandler";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5633c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5632b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public o a(Context context) {
            Intrinsics.checkNotNull(context);
            return new o(context);
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.d c(o handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.d(handler);
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(o handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            if (config.hasKey("minDurationMs")) {
                handler.a1(config.getInt("minDurationMs"));
            }
            if (config.hasKey("maxDist")) {
                handler.f5623K = PixelUtil.toPixelFromDIP(config.getDouble("maxDist"));
            }
            if (config.hasKey("numberOfPointers")) {
                handler.D0(config.getInt("numberOfPointers"));
            }
        }
    }

    public o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5621I = 500L;
        G0(true);
        float f10 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.f5622J = f10;
        this.f5623K = f10;
        this.f5624L = 1;
    }

    public static /* synthetic */ Pair X0(o oVar, MotionEvent motionEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return oVar.W0(motionEvent, z10);
    }

    public static final void Z0(o oVar) {
        oVar.k();
    }

    public final Pair W0(MotionEvent motionEvent, boolean z10) {
        if (z10) {
            int pointerCount = motionEvent.getPointerCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (i10 != motionEvent.getActionIndex()) {
                    f10 += motionEvent.getX(i10);
                    f11 += motionEvent.getY(i10);
                }
            }
            return new Pair(Float.valueOf(f10 / (motionEvent.getPointerCount() - 1)), Float.valueOf(f11 / (motionEvent.getPointerCount() - 1)));
        }
        IntRange until = RangesKt.until(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(motionEvent.getX(((IntIterator) it).nextInt())));
        }
        float averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
        IntRange until2 = RangesKt.until(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until2, 10));
        Iterator<Integer> it2 = until2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((IntIterator) it2).nextInt())));
        }
        return new Pair(Float.valueOf(averageOfFloat), Float.valueOf((float) CollectionsKt.averageOfFloat(arrayList2)));
    }

    public final int Y0() {
        return (int) (this.f5628P - this.f5627O);
    }

    public final void a1(long j10) {
        this.f5621I = j10;
    }

    @Override // Ic.AbstractC1350d
    public void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (S() == 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f5628P = uptimeMillis;
                this.f5627O = uptimeMillis;
                p();
                Pair X02 = X0(this, sourceEvent, false, 2, null);
                float floatValue = ((Number) X02.component1()).floatValue();
                float floatValue2 = ((Number) X02.component2()).floatValue();
                this.f5625M = floatValue;
                this.f5626N = floatValue2;
                this.f5630R++;
            }
            if (sourceEvent.getActionMasked() == 5) {
                this.f5630R++;
                Pair X03 = X0(this, sourceEvent, false, 2, null);
                float floatValue3 = ((Number) X03.component1()).floatValue();
                float floatValue4 = ((Number) X03.component2()).floatValue();
                this.f5625M = floatValue3;
                this.f5626N = floatValue4;
                if (this.f5630R > this.f5624L) {
                    D();
                    this.f5630R = 0;
                }
            }
            if (S() == 2 && this.f5630R == this.f5624L && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f5629Q = handler;
                long j10 = this.f5621I;
                if (j10 > 0) {
                    Intrinsics.checkNotNull(handler);
                    handler.postDelayed(new Runnable() { // from class: Ic.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.Z0(o.this);
                        }
                    }, this.f5621I);
                } else if (j10 == 0) {
                    k();
                }
            }
            if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
                this.f5630R--;
                Handler handler2 = this.f5629Q;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.f5629Q = null;
                }
                if (S() == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (sourceEvent.getActionMasked() == 6) {
                int i10 = this.f5630R - 1;
                this.f5630R = i10;
                if (i10 < this.f5624L && S() != 4) {
                    D();
                    this.f5630R = 0;
                    return;
                }
                Pair W02 = W0(sourceEvent, true);
                float floatValue5 = ((Number) W02.component1()).floatValue();
                float floatValue6 = ((Number) W02.component2()).floatValue();
                this.f5625M = floatValue5;
                this.f5626N = floatValue6;
                return;
            }
            Pair X04 = X0(this, sourceEvent, false, 2, null);
            float floatValue7 = ((Number) X04.component1()).floatValue();
            float floatValue8 = ((Number) X04.component2()).floatValue();
            float f10 = floatValue7 - this.f5625M;
            float f11 = floatValue8 - this.f5626N;
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f5623K;
            if (f12 > f13 * f13) {
                if (S() == 4) {
                    q();
                } else {
                    D();
                }
            }
        }
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        super.o0();
        this.f5630R = 0;
    }

    @Override // Ic.AbstractC1350d
    public void p0(int i10, int i11) {
        Handler handler = this.f5629Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f5629Q = null;
        }
    }

    @Override // Ic.AbstractC1350d
    public void s0() {
        super.s0();
        this.f5621I = 500L;
        this.f5623K = this.f5622J;
        G0(true);
    }

    @Override // Ic.AbstractC1350d
    public void v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5628P = SystemClock.uptimeMillis();
        super.v(event);
    }

    @Override // Ic.AbstractC1350d
    public void w(int i10, int i11) {
        this.f5628P = SystemClock.uptimeMillis();
        super.w(i10, i11);
    }
}
