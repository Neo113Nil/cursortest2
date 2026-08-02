package v;

import C.InterfaceC2689i;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u.C9887a;
import v.C10132s;
import z.C10954l;

/* renamed from: v.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10131r1 {

    /* renamed from: u, reason: collision with root package name */
    private static final MeteringRectangle[] f101316u = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    private final C10132s f101317a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f101318b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f101319c;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final C10954l f101322f;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f101325i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f101326j;

    /* renamed from: o, reason: collision with root package name */
    private MeteringRectangle[] f101331o;

    /* renamed from: p, reason: collision with root package name */
    private MeteringRectangle[] f101332p;

    /* renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f101333q;

    /* renamed from: r, reason: collision with root package name */
    b.a<C.D> f101334r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f101335s;

    /* renamed from: t, reason: collision with root package name */
    private C10108j1 f101336t;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f101320d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile Rational f101321e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f101323g = false;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    Integer f101324h = 0;

    /* renamed from: k, reason: collision with root package name */
    long f101327k = 0;

    /* renamed from: l, reason: collision with root package name */
    boolean f101328l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f101329m = 1;

    /* renamed from: n, reason: collision with root package name */
    private C10117m1 f101330n = null;

    /* renamed from: v.r1$a */
    final class a extends AbstractC5111p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.a f101337a;

        a(b.a aVar) {
            this.f101337a = aVar;
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void a(int i11) {
            b.a aVar = this.f101337a;
            if (aVar != null) {
                aVar.e(new InterfaceC2689i.a("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void b(int i11, @NonNull InterfaceC5130z interfaceC5130z) {
            b.a aVar = this.f101337a;
            if (aVar != null) {
                C.S.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                aVar.c(null);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void c(int i11, @NonNull androidx.camera.core.impl.r rVar) {
            this.f101337a.e(new E.c());
        }
    }

    C10131r1(@NonNull C10132s c10132s, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull androidx.camera.core.impl.I0 i02) {
        MeteringRectangle[] meteringRectangleArr = f101316u;
        this.f101331o = meteringRectangleArr;
        this.f101332p = meteringRectangleArr;
        this.f101333q = meteringRectangleArr;
        this.f101334r = null;
        this.f101335s = false;
        this.f101336t = null;
        this.f101317a = c10132s;
        this.f101318b = executor;
        this.f101319c = scheduledExecutorService;
        this.f101322f = new C10954l(i02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [v.j1, v.s$c] */
    public static void a(final C10131r1 c10131r1, boolean z11, final b.a aVar) {
        C10132s c10132s = c10131r1.f101317a;
        c10132s.f101338b.f101365a.remove(c10131r1.f101336t);
        c10131r1.f101335s = z11;
        if (!c10131r1.f101320d) {
            aVar.e(new InterfaceC2689i.a("Camera is not active."));
            return;
        }
        final long R11 = c10131r1.f101317a.R();
        ?? r32 = new C10132s.c() { // from class: v.j1
            @Override // v.C10132s.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C10131r1.b(C10131r1.this, R11, aVar, totalCaptureResult);
            }
        };
        c10131r1.f101336t = r32;
        c10131r1.f101317a.t(r32);
    }

    public static /* synthetic */ boolean b(C10131r1 c10131r1, long j11, b.a aVar, TotalCaptureResult totalCaptureResult) {
        c10131r1.getClass();
        boolean z11 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        C.S.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z11);
        if (z11 != c10131r1.f101335s || !C10132s.L(totalCaptureResult, j11)) {
            return false;
        }
        C.S.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z11);
        aVar.c(null);
        return true;
    }

    public static boolean c(C10131r1 c10131r1, boolean z11, long j11, TotalCaptureResult totalCaptureResult) {
        c10131r1.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (c10131r1.f101331o.length > 0) {
            if (!z11 || num == null) {
                c10131r1.f101328l = true;
            } else if (c10131r1.f101324h.intValue() == 3) {
                if (num.intValue() == 4) {
                    c10131r1.f101328l = true;
                } else if (num.intValue() == 5) {
                    c10131r1.f101328l = true;
                }
            }
        }
        if (c10131r1.f101328l && C10132s.L(totalCaptureResult, j11)) {
            c10131r1.h();
            return true;
        }
        if (!c10131r1.f101324h.equals(num) && num != null) {
            c10131r1.f101324h = num;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [v.m1, v.s$c] */
    public static void d(final C10131r1 c10131r1, b.a aVar, C.C c11) {
        Rational rational;
        final long R11;
        if (!c10131r1.f101320d) {
            aVar.e(new InterfaceC2689i.a("Camera is not active."));
            return;
        }
        Rect w11 = c10131r1.f101317a.w();
        if (c10131r1.f101321e != null) {
            rational = c10131r1.f101321e;
        } else {
            Rect w12 = c10131r1.f101317a.w();
            rational = new Rational(w12.width(), w12.height());
        }
        List<MeteringRectangle> j11 = c10131r1.j(c11.c(), c10131r1.f101317a.z(), rational, w11, 1);
        List<MeteringRectangle> j12 = c10131r1.j(c11.b(), c10131r1.f101317a.y(), rational, w11, 2);
        List<MeteringRectangle> j13 = c10131r1.j(c11.d(), c10131r1.f101317a.A(), rational, w11, 4);
        if (j11.isEmpty() && j12.isEmpty() && j13.isEmpty()) {
            aVar.e(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        c10131r1.f101317a.f101338b.f101365a.remove(c10131r1.f101330n);
        b.a<C.D> aVar2 = c10131r1.f101334r;
        if (aVar2 != null) {
            aVar2.e(new InterfaceC2689i.a("Cancelled by another startFocusAndMetering()"));
            c10131r1.f101334r = null;
        }
        c10131r1.f101317a.f101338b.f101365a.remove(null);
        ScheduledFuture<?> scheduledFuture = c10131r1.f101325i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            c10131r1.f101325i = null;
        }
        c10131r1.f101334r = aVar;
        MeteringRectangle[] meteringRectangleArr = f101316u;
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) j11.toArray(meteringRectangleArr);
        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) j12.toArray(meteringRectangleArr);
        MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) j13.toArray(meteringRectangleArr);
        C10117m1 c10117m1 = c10131r1.f101330n;
        C10132s c10132s = c10131r1.f101317a;
        c10132s.f101338b.f101365a.remove(c10117m1);
        ScheduledFuture<?> scheduledFuture2 = c10131r1.f101325i;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            c10131r1.f101325i = null;
        }
        ScheduledFuture<?> scheduledFuture3 = c10131r1.f101326j;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(true);
            c10131r1.f101326j = null;
        }
        c10131r1.f101331o = meteringRectangleArr2;
        c10131r1.f101332p = meteringRectangleArr3;
        c10131r1.f101333q = meteringRectangleArr4;
        if (meteringRectangleArr2.length > 0) {
            c10131r1.f101323g = true;
            c10131r1.f101328l = false;
            R11 = c10132s.R();
            c10131r1.p(true);
        } else {
            c10131r1.f101323g = false;
            c10131r1.f101328l = true;
            R11 = c10132s.R();
        }
        c10131r1.f101324h = 0;
        final boolean z11 = c10132s.F(1) == 1;
        ?? r82 = new C10132s.c() { // from class: v.m1
            @Override // v.C10132s.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C10131r1.c(C10131r1.this, z11, R11, totalCaptureResult);
            }
        };
        c10131r1.f101330n = r82;
        c10132s.t(r82);
        final long j14 = c10131r1.f101327k + 1;
        c10131r1.f101327k = j14;
        Runnable runnable = new Runnable() { // from class: v.n1
            @Override // java.lang.Runnable
            public final void run() {
                final C10131r1 c10131r12 = C10131r1.this;
                c10131r12.getClass();
                final long j15 = j14;
                c10131r12.f101318b.execute(new Runnable() { // from class: v.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10131r1 c10131r13 = C10131r1.this;
                        if (j15 == c10131r13.f101327k) {
                            c10131r13.h();
                        }
                    }
                });
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = c10131r1.f101319c;
        c10131r1.f101326j = scheduledExecutorService.schedule(runnable, 5000L, timeUnit);
        if (c11.e()) {
            c10131r1.f101325i = scheduledExecutorService.schedule(new Runnable() { // from class: v.o1
                @Override // java.lang.Runnable
                public final void run() {
                    final C10131r1 c10131r12 = C10131r1.this;
                    c10131r12.getClass();
                    final long j15 = j14;
                    c10131r12.f101318b.execute(new Runnable() { // from class: v.p1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10131r1 c10131r13 = C10131r1.this;
                            if (j15 == c10131r13.f101327k) {
                                c10131r13.g();
                            }
                        }
                    });
                }
            }, c11.a(), timeUnit);
        }
    }

    @NonNull
    private List<MeteringRectangle> j(@NonNull List<C.U> list, int i11, @NonNull Rational rational, @NonNull Rect rect, int i12) {
        if (list.isEmpty() || i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (C.U u11 : list) {
            if (arrayList.size() == i11) {
                break;
            }
            if (u11.b() >= 0.0f && u11.b() <= 1.0f && u11.c() >= 0.0f && u11.c() <= 1.0f) {
                Rational a11 = u11.a() != null ? u11.a() : rational;
                PointF a12 = this.f101322f.a(u11, i12);
                if (!a11.equals(rational2)) {
                    if (a11.compareTo(rational2) > 0) {
                        float doubleValue = (float) (a11.doubleValue() / rational2.doubleValue());
                        a12.y = (1.0f / doubleValue) * (((float) ((doubleValue - 1.0d) / 2.0d)) + a12.y);
                    } else {
                        float doubleValue2 = (float) (rational2.doubleValue() / a11.doubleValue());
                        a12.x = (1.0f / doubleValue2) * (((float) ((doubleValue2 - 1.0d) / 2.0d)) + a12.x);
                    }
                }
                int width = (int) ((a12.x * rect.width()) + rect.left);
                int height = (int) ((a12.y * rect.height()) + rect.top);
                int width2 = ((int) (rect.width() * 0.15f)) / 2;
                int height2 = ((int) (0.15f * rect.height())) / 2;
                Rect rect2 = new Rect(width - width2, height - height2, width + width2, height + height2);
                rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                    arrayList.add(meteringRectangle);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    final void e(@NonNull C9887a.C2193a c2193a) {
        int i11 = this.f101323g ? 1 : this.f101329m != 3 ? 4 : 3;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Object valueOf = Integer.valueOf(this.f101317a.F(i11));
        T.b bVar = T.b.REQUIRED;
        c2193a.f(key, valueOf, bVar);
        MeteringRectangle[] meteringRectangleArr = this.f101331o;
        if (meteringRectangleArr.length != 0) {
            c2193a.f(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, bVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f101332p;
        if (meteringRectangleArr2.length != 0) {
            c2193a.f(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, bVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f101333q;
        if (meteringRectangleArr3.length != 0) {
            c2193a.f(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, bVar);
        }
    }

    final void f(boolean z11, boolean z12) {
        if (this.f101320d) {
            Q.a aVar = new Q.a();
            aVar.t();
            aVar.s(this.f101329m);
            C9887a.C2193a c2193a = new C9887a.C2193a();
            if (z11) {
                c2193a.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z12) {
                c2193a.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c2193a.c());
            this.f101317a.Q(Collections.singletonList(aVar.h()));
        }
    }

    final void g() {
        C10132s c10132s = this.f101317a;
        c10132s.f101338b.f101365a.remove(null);
        c10132s.f101338b.f101365a.remove(this.f101330n);
        b.a<C.D> aVar = this.f101334r;
        if (aVar != null) {
            aVar.e(new InterfaceC2689i.a("Cancelled by cancelFocusAndMetering()"));
            this.f101334r = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f101325i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f101325i = null;
        }
        ScheduledFuture<?> scheduledFuture2 = this.f101326j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f101326j = null;
        }
        if (this.f101331o.length > 0) {
            f(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f101316u;
        this.f101331o = meteringRectangleArr;
        this.f101332p = meteringRectangleArr;
        this.f101333q = meteringRectangleArr;
        this.f101323g = false;
        c10132s.R();
    }

    final void h() {
        ScheduledFuture<?> scheduledFuture = this.f101326j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f101326j = null;
        }
        b.a<C.D> aVar = this.f101334r;
        if (aVar != null) {
            aVar.c(new C.D());
            this.f101334r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.common.util.concurrent.m<Void> i(final boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i11);
            return I.k.h(null);
        }
        if (this.f101317a.D(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return I.k.h(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return androidx.concurrent.futures.b.a(new b.c() { // from class: v.f1
            @Override // androidx.concurrent.futures.b.c
            public final Object c(final b.a aVar) {
                final C10131r1 c10131r1 = C10131r1.this;
                c10131r1.getClass();
                final boolean z12 = z11;
                c10131r1.f101318b.execute(new Runnable() { // from class: v.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10131r1.a(C10131r1.this, z12, aVar);
                    }
                });
                return "enableExternalFlashAeMode";
            }
        });
    }

    final boolean k() {
        return this.f101335s;
    }

    final void l(boolean z11) {
        if (z11 == this.f101320d) {
            return;
        }
        this.f101320d = z11;
        if (this.f101320d) {
            return;
        }
        g();
    }

    public final void m(Rational rational) {
        this.f101321e = rational;
    }

    final void n(int i11) {
        this.f101329m = i11;
    }

    final void o(b.a<Void> aVar) {
        C.S.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f101320d) {
            aVar.e(new InterfaceC2689i.a("Camera is not active."));
            return;
        }
        Q.a aVar2 = new Q.a();
        aVar2.s(this.f101329m);
        aVar2.t();
        C9887a.C2193a c2193a = new C9887a.C2193a();
        c2193a.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c2193a.c());
        aVar2.c(new a(aVar));
        this.f101317a.Q(Collections.singletonList(aVar2.h()));
    }

    final void p(boolean z11) {
        if (this.f101320d) {
            Q.a aVar = new Q.a();
            aVar.s(this.f101329m);
            aVar.t();
            C9887a.C2193a c2193a = new C9887a.C2193a();
            c2193a.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z11) {
                c2193a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f101317a.D(1)), T.b.HIGH_PRIORITY_REQUIRED);
            }
            aVar.e(c2193a.c());
            aVar.c(new C10129q1());
            this.f101317a.Q(Collections.singletonList(aVar.h()));
        }
    }
}
