package xf;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.impl.I;

/* renamed from: xf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10769a extends I {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f105541a;

    /* renamed from: b, reason: collision with root package name */
    private final f f105542b;

    /* renamed from: xf.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2280a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f105543a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f105544b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f105545c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f105546d;

        static {
            int[] iArr = new int[I.d.values().length];
            f105546d = iArr;
            try {
                iArr[I.d.CRONET_SOURCE_STATICALLY_LINKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105546d[I.d.CRONET_SOURCE_PLAY_SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105546d[I.d.CRONET_SOURCE_FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105546d[I.d.CRONET_SOURCE_PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105546d[I.d.CRONET_SOURCE_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[I.e.b.values().length];
            f105545c = iArr2;
            try {
                iArr2[I.e.b.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105545c[I.e.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f105545c[I.e.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[I.b.a.values().length];
            f105544b = iArr3;
            try {
                iArr3[I.b.a.API.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f105544b[I.b.a.IMPL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[I.e.a.values().length];
            f105543a = iArr4;
            try {
                iArr4[I.e.a.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f105543a[I.e.a.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C10769a() {
        f fVar = new f();
        this.f105541a = new AtomicInteger();
        this.f105542b = fVar;
    }

    private static int f(I.d dVar) {
        int i11 = C2280a.f105546d[dVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i12;
    }

    @Override // org.chromium.net.impl.I
    public final long a() {
        long nextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return nextLong >= -1 ? nextLong + 2 : nextLong;
    }

    @Override // org.chromium.net.impl.I
    public final void b(I.b bVar) {
        vf.c.c("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        long j11 = bVar.f78826a;
        int i11 = C2280a.f105544b[bVar.f78827b.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 0;
            }
        }
        int i13 = bVar.f78828c;
        int f7 = f(bVar.f78829d);
        int b11 = e.a(bVar.f78830e).b();
        int b12 = bVar.f78831f.b();
        int c11 = bVar.f78831f.c();
        int a11 = bVar.f78831f.a();
        int d11 = bVar.f78831f.d();
        I.f fVar = bVar.f78832g;
        int b13 = fVar == null ? -1 : fVar.b();
        I.f fVar2 = bVar.f78832g;
        int c12 = fVar2 == null ? -1 : fVar2.c();
        I.f fVar3 = bVar.f78832g;
        int a12 = fVar3 == null ? -1 : fVar3.a();
        I.f fVar4 = bVar.f78832g;
        C10770b.a(j11, i12, i13, f7, b11, b12, c11, a11, d11, b13, c12, a12, fVar4 != null ? fVar4.d() : -1, bVar.f78833h);
    }

    @Override // org.chromium.net.impl.I
    public final void c(long j11, I.a aVar, I.f fVar, I.d dVar) {
        int i11;
        if (dVar == null) {
            return;
        }
        try {
            vf.c.c("CronetLoggerImpl#writeCronetEngineCreation");
            c cVar = new c(aVar.b());
            int b11 = fVar.b();
            int c11 = fVar.c();
            int a11 = fVar.a();
            int d11 = fVar.d();
            int i12 = C2280a.f105546d[dVar.ordinal()];
            int i13 = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? 0 : 4 : 3 : 2 : 1;
            boolean d12 = aVar.d();
            boolean e11 = aVar.e();
            int c12 = aVar.c();
            if (c12 == 0) {
                i11 = 1;
            } else if (c12 == 1) {
                i11 = 2;
            } else if (c12 == 2) {
                i11 = 3;
            } else {
                if (c12 != 3) {
                    throw new IllegalArgumentException("Expected httpCacheMode to range from 0 to 3");
                }
                i11 = 4;
            }
            C10770b.c(j11, b11, c11, a11, d11, i13, d12, e11, i11, aVar.f(), aVar.g(), false, 0, cVar.d(), cVar.z().b(), cVar.l(), cVar.j(), cVar.h().b(), cVar.c().b(), cVar.o().b(), cVar.n().b(), cVar.e().b(), cVar.m(), cVar.k(), cVar.g().b(), cVar.b().b(), cVar.t().b(), cVar.s(), cVar.u(), cVar.v(), cVar.r().b(), cVar.x().b(), cVar.w(), cVar.y().b(), cVar.f().b(), aVar.a(), Process.myUid());
        } catch (Exception e12) {
            if (Log.isLoggable("a", 3)) {
                Log.d("a", "Failed to log CronetEngine:" + j11 + " creation: " + e12.getMessage());
            }
        }
    }

    @Override // org.chromium.net.impl.I
    public final void d(I.c cVar) {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        vf.c.c("CronetLoggerImpl#logCronetInitializedInfo");
        C10770b.d(cVar.f78834a, cVar.f78835b, cVar.f78836c, e.UNSET.b(), new long[0], new long[0], cVar.f78837d, f(cVar.f78838e), Process.myUid());
    }

    @Override // org.chromium.net.impl.I
    public final void e(long j11, I.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean a11 = this.f105542b.a();
        AtomicInteger atomicInteger = this.f105541a;
        if (!a11) {
            atomicInteger.incrementAndGet();
            return;
        }
        int andSet = atomicInteger.getAndSet(0);
        try {
            vf.c.c("CronetLoggerImpl#writeCronetTrafficReported");
            try {
                int c11 = F2.c.c(eVar.p());
                int b11 = F2.c.b(eVar.o());
                int e11 = F2.c.e(eVar.r());
                int d11 = F2.c.d(eVar.q());
                int s11 = eVar.s();
                long a12 = d.a(eVar.i());
                int millis = (int) eVar.g().toMillis();
                int millis2 = (int) eVar.u().toMillis();
                boolean w11 = eVar.w();
                boolean a13 = eVar.a();
                int i15 = C2280a.f105545c[eVar.t().ordinal()];
                if (i15 == 1) {
                    i13 = 3;
                    i14 = 1;
                } else if (i15 != 2) {
                    i13 = 3;
                    if (i15 != 3) {
                        i14 = 0;
                    } else {
                        i14 = 3;
                    }
                } else {
                    i13 = 3;
                    i14 = 2;
                }
                try {
                    int k11 = eVar.k();
                    int n11 = eVar.n();
                    int l11 = eVar.l();
                    int b12 = e.a(Boolean.FALSE).b();
                    int b13 = e.a(Boolean.valueOf(eVar.f())).b();
                    int v11 = eVar.v();
                    int j12 = eVar.j();
                    int m11 = eVar.m();
                    int b14 = eVar.b();
                    int i16 = b14 != 1 ? b14 != 2 ? 0 : 1 : 2;
                    int i17 = C2280a.f105543a[eVar.e().ordinal()];
                    i12 = 3;
                    try {
                        C10770b.b(j11, c11, b11, e11, d11, s11, a12, millis, millis2, w11, a13, andSet, i14, k11, n11, l11, b12, b13, v11, j12, m11, i16, i17 != 1 ? i17 != 2 ? 0 : 100 : 1, e.a(Boolean.valueOf(eVar.h())).b(), eVar.d(), f(eVar.c()));
                    } catch (Throwable th2) {
                        th = th2;
                        i11 = andSet;
                        try {
                            throw th;
                        } catch (Exception e12) {
                            e = e12;
                            atomicInteger.addAndGet(i11);
                            if (Log.isLoggable("a", i12)) {
                                Log.d("a", "Failed to log cronet traffic sample for CronetEngine " + j11 + ": " + e.getMessage());
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i12 = i13;
                }
            } catch (Throwable th4) {
                th = th4;
                i11 = andSet;
                i12 = 3;
            }
        } catch (Exception e13) {
            e = e13;
            i11 = andSet;
            i12 = 3;
        }
    }
}
