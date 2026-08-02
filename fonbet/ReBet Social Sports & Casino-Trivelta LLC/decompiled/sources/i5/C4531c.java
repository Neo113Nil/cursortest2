package i5;

import Ph.P;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import e5.AbstractC4178a;
import f5.C4260a;
import f5.MobileVitalsSnapshot;
import f5.e;
import f5.k;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import s5.C6339a;

/* renamed from: i5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4531c extends k {

    /* renamed from: h, reason: collision with root package name */
    public final Handler f48112h;

    /* renamed from: i, reason: collision with root package name */
    public final C4260a f48113i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f48114j;

    /* renamed from: k, reason: collision with root package name */
    public AtomicInteger f48115k;

    /* renamed from: l, reason: collision with root package name */
    public AtomicBoolean f48116l;

    /* renamed from: m, reason: collision with root package name */
    public Choreographer f48117m;

    /* renamed from: n, reason: collision with root package name */
    public final a f48118n;

    /* renamed from: i5.c$a */
    public static final class a implements Choreographer.FrameCallback {
        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            if (C4531c.this.B().get()) {
                C4531c.this.f48115k.incrementAndGet();
                Choreographer choreographer = C4531c.this.f48117m;
                if (choreographer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("choreographer");
                    choreographer = null;
                }
                choreographer.postFrameCallback(this);
            }
        }
    }

    public /* synthetic */ C4531c(long j10, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1000L : j10, (i10 & 2) != 0 ? C6339a.f64787a.a() : p10);
    }

    public static final void Z1(C4531c c4531c) {
        if (c4531c.f48117m == null || !c4531c.f48116l.get()) {
            return;
        }
        Choreographer choreographer = c4531c.f48117m;
        if (choreographer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("choreographer");
            choreographer = null;
        }
        choreographer.removeFrameCallback(c4531c.f48118n);
        c4531c.f48116l.set(false);
    }

    public static final void a2(C4531c c4531c) {
        c4531c.f48117m = Choreographer.getInstance();
        if (c4531c.f48116l.getAndSet(true)) {
            return;
        }
        Choreographer choreographer = c4531c.f48117m;
        if (choreographer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("choreographer");
            choreographer = null;
        }
        choreographer.postFrameCallback(c4531c.f48118n);
    }

    @Override // f5.k
    public void A0() {
        this.f48115k.set(0);
        this.f48114j = r().a();
        this.f48112h.post(new Runnable() { // from class: i5.b
            @Override // java.lang.Runnable
            public final void run() {
                C4531c.a2(C4531c.this);
            }
        });
    }

    @Override // f5.k
    public void U() {
        this.f48112h.post(new Runnable() { // from class: i5.a
            @Override // java.lang.Runnable
            public final void run() {
                C4531c.Z1(C4531c.this);
            }
        });
        this.f48113i.b();
        this.f48115k.set(0);
    }

    public void Y1() {
        this.f48114j = r().a();
        this.f48113i.b();
        this.f48115k.set(0);
    }

    public Map b2(boolean z10) {
        MobileVitalsSnapshot c10 = this.f48113i.c(AbstractC4178a.d.f45650b);
        Map emptyMap = Double.isNaN(c10.getAvg()) ? MapsKt.emptyMap() : MapsKt.mapOf(TuplesKt.to(e.f46399c, c10));
        if (z10) {
            Y1();
        }
        return emptyMap;
    }

    @Override // k5.InterfaceC5199a
    public void k1() {
        if (B().get()) {
            long a10 = r().a();
            long j10 = a10 - this.f48114j;
            this.f48114j = a10;
            int andSet = this.f48115k.getAndSet(0);
            if (j10 > 0) {
                this.f48113i.a((andSet * 1000.0d) / j10);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4531c(long j10, P detectorScope) {
        super(j10, detectorScope, null, 4, null);
        Intrinsics.checkNotNullParameter(detectorScope, "detectorScope");
        this.f48112h = new Handler(Looper.getMainLooper());
        this.f48113i = new C4260a(0, 1, null);
        this.f48115k = new AtomicInteger();
        this.f48116l = new AtomicBoolean(false);
        this.f48118n = new a();
    }
}
