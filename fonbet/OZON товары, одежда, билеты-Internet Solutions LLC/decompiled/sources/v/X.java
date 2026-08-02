package v;

import Am.C2438a;
import B90.C2621x;
import C.I;
import E.InterfaceC2894j;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageWriter;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.Q;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import u.C9887a;
import v.C10132s;
import v.X;
import w.C10368u;
import z.C10942A;
import z.C10949g;
import z.C10956n;

/* loaded from: classes8.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C10132s f101116a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final C10942A f101117b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f101118c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.I0 f101119d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Executor f101120e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final ScheduledExecutorService f101121f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f101122g;

    /* renamed from: h, reason: collision with root package name */
    private int f101123h = 1;

    static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C10132s f101124a;

        /* renamed from: b, reason: collision with root package name */
        private final C10956n f101125b;

        /* renamed from: c, reason: collision with root package name */
        private final int f101126c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f101127d = false;

        a(@NonNull C10132s c10132s, int i11, @NonNull C10956n c10956n) {
            this.f101124a = c10132s;
            this.f101126c = i11;
            this.f101125b = c10956n;
        }

        public static /* synthetic */ void d(a aVar, b.a aVar2) {
            aVar.f101124a.x().o(aVar2);
            aVar.f101125b.b();
        }

        @Override // v.X.e
        @NonNull
        public final com.google.common.util.concurrent.m<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!X.c(totalCaptureResult, this.f101126c)) {
                return I.k.h(Boolean.FALSE);
            }
            C.S.a("Camera2CapturePipeline", "Trigger AE");
            this.f101127d = true;
            I.d b11 = I.d.b(androidx.concurrent.futures.b.a(new b.c() { // from class: v.V
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    X.a.d(X.a.this, aVar);
                    return "AePreCapture";
                }
            }));
            W w11 = new W();
            Executor b12 = H.c.b();
            b11.getClass();
            return (I.d) I.k.m(b11, w11, b12);
        }

        @Override // v.X.e
        public final boolean b() {
            return this.f101126c == 0;
        }

        @Override // v.X.e
        public final void c() {
            if (this.f101127d) {
                C.S.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f101124a.x().f(false, true);
                this.f101125b.a();
            }
        }
    }

    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C10132s f101128a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f101129b = false;

        b(@NonNull C10132s c10132s) {
            this.f101128a = c10132s;
        }

        @Override // v.X.e
        @NonNull
        public final com.google.common.util.concurrent.m<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int intValue;
            com.google.common.util.concurrent.m<Boolean> h11 = I.k.h(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((intValue = num.intValue()) == 1 || intValue == 2)) {
                C.S.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C.S.a("Camera2CapturePipeline", "Trigger AF");
                    this.f101129b = true;
                    this.f101128a.x().p(false);
                }
            }
            return h11;
        }

        @Override // v.X.e
        public final boolean b() {
            return true;
        }

        @Override // v.X.e
        public final void c() {
            if (this.f101129b) {
                C.S.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f101128a.x().f(true, false);
            }
        }
    }

    static class c implements InterfaceC2894j {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f101130a;

        /* renamed from: b, reason: collision with root package name */
        private final d f101131b;

        /* renamed from: c, reason: collision with root package name */
        private int f101132c;

        c(d dVar, Executor executor, int i11) {
            this.f101131b = dVar;
            this.f101130a = executor;
            this.f101132c = i11;
        }

        public static /* synthetic */ void c(c cVar, b.a aVar) {
            cVar.f101131b.e();
            aVar.c(null);
        }

        @Override // E.InterfaceC2894j
        @NonNull
        public final com.google.common.util.concurrent.m<Void> a() {
            C.S.a("Camera2CapturePipeline", "invokePreCapture");
            I.d b11 = I.d.b(this.f101131b.f(this.f101132c));
            Z z11 = new Z();
            b11.getClass();
            return (I.d) I.k.m(b11, z11, this.f101130a);
        }

        @Override // E.InterfaceC2894j
        @NonNull
        public final com.google.common.util.concurrent.m<Void> b() {
            return androidx.concurrent.futures.b.a(new b.c() { // from class: v.Y
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    X.c.c(X.c.this, aVar);
                    return "invokePostCaptureFuture";
                }
            });
        }
    }

    static class d {

        /* renamed from: j, reason: collision with root package name */
        private static final long f101133j;

        /* renamed from: k, reason: collision with root package name */
        private static final long f101134k;

        /* renamed from: a, reason: collision with root package name */
        private final int f101135a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f101136b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f101137c;

        /* renamed from: d, reason: collision with root package name */
        private final C10132s f101138d;

        /* renamed from: e, reason: collision with root package name */
        private final C10956n f101139e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f101140f;

        /* renamed from: g, reason: collision with root package name */
        private long f101141g = f101133j;

        /* renamed from: h, reason: collision with root package name */
        final ArrayList f101142h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        private final a f101143i = new a();

        final class a implements e {
            a() {
            }

            @Override // v.X.e
            @NonNull
            public final com.google.common.util.concurrent.m<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = d.this.f101142h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a(totalCaptureResult));
                }
                return I.k.m(I.k.c(arrayList), new C10098g0(), H.c.b());
            }

            @Override // v.X.e
            public final boolean b() {
                Iterator it = d.this.f101142h.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // v.X.e
            public final void c() {
                Iterator it = d.this.f101142h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f101133j = timeUnit.toNanos(1L);
            f101134k = timeUnit.toNanos(5L);
        }

        d(int i11, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull C10132s c10132s, boolean z11, @NonNull C10956n c10956n) {
            this.f101135a = i11;
            this.f101136b = executor;
            this.f101137c = scheduledExecutorService;
            this.f101138d = c10132s;
            this.f101140f = z11;
            this.f101139e = c10956n;
        }

        public static com.google.common.util.concurrent.m a(d dVar, int i11, TotalCaptureResult totalCaptureResult) {
            dVar.getClass();
            if (X.c(totalCaptureResult, i11)) {
                dVar.f101141g = f101134k;
            }
            return dVar.f101143i.a(totalCaptureResult);
        }

        public static com.google.common.util.concurrent.m b(final d dVar, List list, int i11) {
            androidx.camera.core.p pVar;
            dVar.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                C10132s c10132s = dVar.f101138d;
                if (!hasNext) {
                    c10132s.Q(arrayList2);
                    return I.k.c(arrayList);
                }
                androidx.camera.core.impl.Q q11 = (androidx.camera.core.impl.Q) it.next();
                final Q.a j11 = Q.a.j(q11);
                InterfaceC5130z interfaceC5130z = null;
                if (q11.j() == 5 && !c10132s.f101348l.b()) {
                    d2 d2Var = c10132s.f101348l;
                    if (!d2Var.c()) {
                        try {
                            pVar = d2Var.f101236b.a();
                        } catch (NoSuchElementException unused) {
                            C.S.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
                            pVar = null;
                        }
                        if (pVar != null) {
                            Image image = pVar.getImage();
                            ImageWriter imageWriter = d2Var.f101244j;
                            if (imageWriter != null && image != null) {
                                try {
                                    imageWriter.queueInputImage(image);
                                    C.L x02 = pVar.x0();
                                    if (x02 instanceof J.c) {
                                        interfaceC5130z = ((J.c) x02).d();
                                    }
                                } catch (IllegalStateException e11) {
                                    C.S.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e11.getMessage());
                                }
                            }
                        }
                    }
                }
                if (interfaceC5130z != null) {
                    j11.o(interfaceC5130z);
                } else {
                    int i12 = (dVar.f101135a != 3 || dVar.f101140f) ? (q11.j() == -1 || q11.j() == 5) ? 2 : -1 : 4;
                    if (i12 != -1) {
                        j11.s(i12);
                    }
                }
                if (dVar.f101139e.c(i11)) {
                    C9887a.C2193a c2193a = new C9887a.C2193a();
                    c2193a.e(CaptureRequest.CONTROL_AE_MODE, 3);
                    j11.e(c2193a.c());
                }
                arrayList.add(androidx.concurrent.futures.b.a(new b.c() { // from class: v.c0
                    @Override // androidx.concurrent.futures.b.c
                    public final Object c(b.a aVar) {
                        X.d.this.getClass();
                        j11.c(new C10101h0(aVar));
                        return "submitStillCapture";
                    }
                }));
                arrayList2.add(j11.h());
            }
        }

        public static com.google.common.util.concurrent.m c(d dVar, Boolean bool) {
            dVar.getClass();
            if (!Boolean.TRUE.equals(bool)) {
                return I.k.h(null);
            }
            long j11 = dVar.f101141g;
            C10095f0 c10095f0 = new C10095f0();
            ScheduledExecutorService scheduledExecutorService = dVar.f101137c;
            long millis = TimeUnit.NANOSECONDS.toMillis(j11);
            f fVar = new f(c10095f0);
            C10132s c10132s = dVar.f101138d;
            c10132s.t(fVar);
            com.google.common.util.concurrent.m<TotalCaptureResult> c11 = fVar.c();
            c11.a(new U(c10132s, fVar), c10132s.f101339c);
            return androidx.concurrent.futures.b.a(new I.e(c11, scheduledExecutorService, millis));
        }

        @NonNull
        final I.d d(final int i11, @NonNull final List list) {
            I.d b11 = I.d.b(f(i11));
            I.a aVar = new I.a() { // from class: v.a0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    return X.d.b(X.d.this, list, i11);
                }
            };
            b11.getClass();
            Executor executor = this.f101136b;
            I.d dVar = (I.d) I.k.n(b11, aVar, executor);
            dVar.a(new Runnable() { // from class: v.b0
                @Override // java.lang.Runnable
                public final void run() {
                    X.d.this.e();
                }
            }, executor);
            return dVar;
        }

        public final void e() {
            this.f101143i.c();
        }

        @NonNull
        public final com.google.common.util.concurrent.m<TotalCaptureResult> f(final int i11) {
            com.google.common.util.concurrent.m<TotalCaptureResult> h11;
            com.google.common.util.concurrent.m<TotalCaptureResult> h12 = I.k.h(null);
            if (this.f101142h.isEmpty()) {
                return h12;
            }
            if (this.f101143i.b()) {
                f fVar = new f(null);
                C10132s c10132s = this.f101138d;
                c10132s.t(fVar);
                h11 = fVar.c();
                h11.a(new U(c10132s, fVar), c10132s.f101339c);
            } else {
                h11 = I.k.h(null);
            }
            I.d b11 = I.d.b(h11);
            I.a aVar = new I.a() { // from class: v.d0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    return X.d.a(X.d.this, i11, (TotalCaptureResult) obj);
                }
            };
            b11.getClass();
            Executor executor = this.f101136b;
            return (I.d) I.k.n((I.d) I.k.n(b11, aVar, executor), new I.a() { // from class: v.e0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    return X.d.c(X.d.this, (Boolean) obj);
                }
            }, executor);
        }
    }

    interface e {
        @NonNull
        com.google.common.util.concurrent.m<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    static class f implements C10132s.c {

        /* renamed from: a, reason: collision with root package name */
        private b.a<TotalCaptureResult> f101145a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.common.util.concurrent.m<TotalCaptureResult> f101146b = androidx.concurrent.futures.b.a(new b.c() { // from class: v.i0
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                X.f.this.f101145a = aVar;
                return "waitFor3AResult";
            }
        });

        /* renamed from: c, reason: collision with root package name */
        private final a f101147c;

        interface a {
            boolean a(@NonNull TotalCaptureResult totalCaptureResult);
        }

        f(a aVar) {
            this.f101147c = aVar;
        }

        @Override // v.C10132s.c
        public final boolean a(@NonNull TotalCaptureResult totalCaptureResult) {
            a aVar = this.f101147c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f101145a.c(totalCaptureResult);
            return true;
        }

        @NonNull
        public final com.google.common.util.concurrent.m<TotalCaptureResult> c() {
            return this.f101146b;
        }
    }

    static class g implements e {

        /* renamed from: f, reason: collision with root package name */
        private static final long f101148f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f101149g = 0;

        /* renamed from: a, reason: collision with root package name */
        private final C10132s f101150a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f101151b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f101152c;

        /* renamed from: d, reason: collision with root package name */
        private final I.i f101153d;

        /* renamed from: e, reason: collision with root package name */
        private final z.z f101154e;

        g(@NonNull C10132s c10132s, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull z.z zVar) {
            this.f101150a = c10132s;
            this.f101151b = executor;
            this.f101152c = scheduledExecutorService;
            this.f101154e = zVar;
            I.i B11 = c10132s.B();
            Objects.requireNonNull(B11);
            this.f101153d = B11;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, b.a aVar) {
            gVar.getClass();
            C.S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f101153d.a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (I.j) atomicReference.get());
            aVar.c(null);
        }

        public static com.google.common.util.concurrent.m e(g gVar) {
            C10125p0 c10125p0 = new C10125p0();
            ScheduledExecutorService scheduledExecutorService = gVar.f101152c;
            long millis = TimeUnit.NANOSECONDS.toMillis(f101148f);
            f fVar = new f(c10125p0);
            C10132s c10132s = gVar.f101150a;
            c10132s.t(fVar);
            com.google.common.util.concurrent.m<TotalCaptureResult> c11 = fVar.c();
            c11.a(new U(c10132s, fVar), c10132s.f101339c);
            return androidx.concurrent.futures.b.a(new I.e(c11, scheduledExecutorService, millis));
        }

        public static com.google.common.util.concurrent.m f(g gVar) {
            C10131r1 x11 = gVar.f101150a.x();
            x11.getClass();
            return androidx.concurrent.futures.b.a(new C10093e1(x11));
        }

        public static /* synthetic */ void g(g gVar, b.a aVar) {
            if (!gVar.f101154e.a()) {
                aVar.c(null);
                return;
            }
            C.S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f101150a.v(true);
            aVar.c(null);
        }

        public static com.google.common.util.concurrent.m i(g gVar, com.google.common.util.concurrent.m mVar) {
            gVar.getClass();
            return androidx.concurrent.futures.b.a(new I.e(mVar, gVar.f101152c, TimeUnit.SECONDS.toMillis(3L)));
        }

        @Override // v.X.e
        @NonNull
        public final com.google.common.util.concurrent.m<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C.S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            AtomicReference atomicReference = new AtomicReference();
            final com.google.common.util.concurrent.m a11 = androidx.concurrent.futures.b.a(new D3.l(atomicReference));
            I.d b11 = I.d.b(androidx.concurrent.futures.b.a(new C10133s0(0, this, atomicReference)));
            I.a aVar = new I.a() { // from class: v.t0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    com.google.common.util.concurrent.m i11;
                    i11 = X.g.this.f101150a.x().i(true);
                    return i11;
                }
            };
            b11.getClass();
            Executor executor = this.f101151b;
            return (I.d) I.k.m((I.d) I.k.n((I.d) I.k.n((I.d) I.k.n((I.d) I.k.n((I.d) I.k.n(b11, aVar, executor), new I.a() { // from class: v.u0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    final X.g gVar = X.g.this;
                    gVar.getClass();
                    return androidx.concurrent.futures.b.a(new b.c() { // from class: v.j0
                        @Override // androidx.concurrent.futures.b.c
                        public final Object c(b.a aVar2) {
                            X.g.g(X.g.this, aVar2);
                            return "EnableTorchInternal";
                        }
                    });
                }
            }, executor), new I.a() { // from class: v.k0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    return X.g.i(X.g.this, a11);
                }
            }, executor), new I.a() { // from class: v.l0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    return X.g.f(X.g.this);
                }
            }, executor), new I.a() { // from class: v.m0
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    return X.g.e(X.g.this);
                }
            }, executor), new C10119n0(), H.c.b());
        }

        @Override // v.X.e
        public final boolean b() {
            return false;
        }

        @Override // v.X.e
        public final void c() {
            C.S.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            boolean a11 = this.f101154e.a();
            C10132s c10132s = this.f101150a;
            if (a11) {
                c10132s.v(false);
            }
            c10132s.x().i(false).a(new RunnableC10130r0(), this.f101151b);
            c10132s.x().f(false, true);
            ScheduledExecutorService e11 = H.c.e();
            I.i iVar = this.f101153d;
            Objects.requireNonNull(iVar);
            e11.execute(new MW.a(iVar, 4));
        }
    }

    static class h implements e {

        /* renamed from: g, reason: collision with root package name */
        private static final long f101155g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f101156h = 0;

        /* renamed from: a, reason: collision with root package name */
        private final C10132s f101157a;

        /* renamed from: b, reason: collision with root package name */
        private final int f101158b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f101159c = false;

        /* renamed from: d, reason: collision with root package name */
        private final Executor f101160d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f101161e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f101162f;

        h(@NonNull C10132s c10132s, int i11, @NonNull Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z11) {
            this.f101157a = c10132s;
            this.f101158b = i11;
            this.f101160d = executor;
            this.f101161e = scheduledExecutorService;
            this.f101162f = z11;
        }

        public static com.google.common.util.concurrent.m d(h hVar) {
            if (!hVar.f101162f) {
                return I.k.h(null);
            }
            C10131r1 x11 = hVar.f101157a.x();
            x11.getClass();
            return androidx.concurrent.futures.b.a(new C10093e1(x11));
        }

        public static com.google.common.util.concurrent.m f(h hVar) {
            C10142v0 c10142v0 = new C10142v0();
            ScheduledExecutorService scheduledExecutorService = hVar.f101161e;
            long millis = TimeUnit.NANOSECONDS.toMillis(f101155g);
            f fVar = new f(c10142v0);
            C10132s c10132s = hVar.f101157a;
            c10132s.t(fVar);
            com.google.common.util.concurrent.m<TotalCaptureResult> c11 = fVar.c();
            c11.a(new U(c10132s, fVar), c10132s.f101339c);
            return androidx.concurrent.futures.b.a(new I.e(c11, scheduledExecutorService, millis));
        }

        @Override // v.X.e
        @NonNull
        public final com.google.common.util.concurrent.m<Boolean> a(TotalCaptureResult totalCaptureResult) {
            int i11 = this.f101158b;
            C.S.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + X.c(totalCaptureResult, i11));
            if (X.c(totalCaptureResult, i11)) {
                if (!this.f101157a.M()) {
                    C.S.a("Camera2CapturePipeline", "Turn on torch");
                    this.f101159c = true;
                    I.d b11 = I.d.b(androidx.concurrent.futures.b.a(new b.c() { // from class: v.w0
                        @Override // androidx.concurrent.futures.b.c
                        public final Object c(b.a aVar) {
                            X.h.this.f101157a.G().c(aVar, true);
                            return "TorchOn";
                        }
                    }));
                    C10148x0 c10148x0 = new C10148x0(this);
                    b11.getClass();
                    Executor executor = this.f101160d;
                    return (I.d) I.k.m((I.d) I.k.n((I.d) I.k.n(b11, c10148x0, executor), new I.a() { // from class: v.y0
                        @Override // I.a, qc.o
                        public final com.google.common.util.concurrent.m apply(Object obj) {
                            return X.h.f(X.h.this);
                        }
                    }, executor), new C10154z0(), H.c.b());
                }
                C.S.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return I.k.h(Boolean.FALSE);
        }

        @Override // v.X.e
        public final boolean b() {
            return this.f101158b == 0;
        }

        @Override // v.X.e
        public final void c() {
            if (this.f101159c) {
                C10132s c10132s = this.f101157a;
                c10132s.G().c(null, false);
                C.S.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f101162f) {
                    c10132s.x().f(false, true);
                }
            }
        }
    }

    X(@NonNull C10132s c10132s, @NonNull C10368u c10368u, @NonNull androidx.camera.core.impl.I0 i02, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f101116a = c10132s;
        Integer num = (Integer) c10368u.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f101122g = num != null && num.intValue() == 2;
        this.f101120e = executor;
        this.f101121f = scheduledExecutorService;
        this.f101119d = i02;
        this.f101117b = new C10942A(i02);
        this.f101118c = C10949g.a(new C2621x(c10368u));
    }

    static boolean c(TotalCaptureResult totalCaptureResult, int i11) {
        C.S.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i11);
        if (i11 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            C.S.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return false;
            }
            if (i11 != 3) {
                throw new AssertionError(i11);
            }
        }
        return true;
    }

    final d a(int i11, int i12, int i13) {
        androidx.camera.core.impl.I0 i02 = this.f101119d;
        C10956n c10956n = new C10956n(i02);
        int i14 = this.f101123h;
        Executor executor = this.f101120e;
        ScheduledExecutorService scheduledExecutorService = this.f101121f;
        d dVar = new d(i14, executor, scheduledExecutorService, this.f101116a, this.f101122g, c10956n);
        ArrayList arrayList = dVar.f101142h;
        C10132s c10132s = this.f101116a;
        if (i11 == 0) {
            arrayList.add(new b(c10132s));
        }
        if (i12 == 3) {
            arrayList.add(new g(c10132s, executor, scheduledExecutorService, new z.z(i02)));
        } else if (this.f101118c) {
            C10942A c10942a = this.f101117b;
            if (c10942a.a() || this.f101123h == 3 || i13 == 1) {
                arrayList.add(new h(this.f101116a, i12, executor, scheduledExecutorService, (c10942a.a() || c10132s.J()) ? false : true));
            } else {
                arrayList.add(new a(c10132s, i12, c10956n));
            }
        }
        StringBuilder a11 = C2438a.a("createPipeline: captureMode = ", i11, ", flashMode = ", ", flashType = ", i12);
        a11.append(i13);
        a11.append(", pipeline tasks = ");
        a11.append(arrayList);
        C.S.a("Camera2CapturePipeline", a11.toString());
        return dVar;
    }

    @NonNull
    final InterfaceC2894j b(int i11, int i12, int i13) {
        return new c(a(i11, i12, i13), this.f101120e, i12);
    }

    public final void d(int i11) {
        this.f101123h = i11;
    }
}
