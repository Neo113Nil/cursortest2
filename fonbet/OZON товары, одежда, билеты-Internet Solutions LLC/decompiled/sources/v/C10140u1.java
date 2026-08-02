package v;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5106m0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.c1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import l2.C7852a;
import w.C10368u;
import z.C10965w;

/* renamed from: v.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10140u1 {

    /* renamed from: a, reason: collision with root package name */
    private C5106m0 f101385a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private androidx.camera.core.impl.O0 f101386b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final b f101387c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final Size f101388d;

    /* renamed from: e, reason: collision with root package name */
    private final C10147x f101389e;

    /* renamed from: f, reason: collision with root package name */
    private O0.c f101390f;

    /* renamed from: v.u1$a */
    final class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f101391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f101392b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f101391a = surface;
            this.f101392b = surfaceTexture;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }

        @Override // I.c
        public final void onSuccess(Void r12) {
            this.f101391a.release();
            this.f101392b.release();
        }
    }

    /* renamed from: v.u1$b */
    private static class b implements androidx.camera.core.impl.b1<androidx.camera.core.w> {

        /* renamed from: G, reason: collision with root package name */
        @NonNull
        private final C5123v0 f101393G;

        b() {
            C5123v0 R11 = C5123v0.R();
            R11.U(androidx.camera.core.impl.b1.f38269x, new F0());
            R11.U(InterfaceC5100j0.f38330j, 34);
            R11.U(J.m.f12652c, C10140u1.class);
            R11.U(J.m.f12651b, C10140u1.class.getCanonicalName() + "-" + UUID.randomUUID());
            this.f101393G = R11;
        }

        @Override // androidx.camera.core.impl.b1
        @NonNull
        public final c1.b N() {
            return c1.b.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.J0
        @NonNull
        public final androidx.camera.core.impl.T s() {
            return this.f101393G;
        }
    }

    C10140u1(@NonNull C10368u c10368u, @NonNull C10081a1 c10081a1, C10147x c10147x) {
        Size size;
        C10965w c10965w = new C10965w();
        Size size2 = null;
        this.f101390f = null;
        this.f101387c = new b();
        this.f101389e = c10147x;
        Size[] c11 = c10368u.b().c(34);
        if (c11 == null) {
            C.S.c("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            Size[] a11 = c10965w.a(c11);
            List asList = Arrays.asList(a11);
            Collections.sort(asList, new C7852a(1));
            Size e11 = c10081a1.e();
            long min = Math.min(e11.getWidth() * e11.getHeight(), 307200L);
            int length = a11.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Size size3 = a11[i11];
                long width = size3.getWidth() * size3.getHeight();
                if (width == min) {
                    size = size3;
                    break;
                } else if (width <= min) {
                    i11++;
                    size2 = size3;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) asList.get(0);
        }
        this.f101388d = size;
        C.S.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.f101386b = c();
    }

    public static void a(C10140u1 c10140u1) {
        c10140u1.f101386b = c10140u1.c();
        C10147x c10147x = c10140u1.f101389e;
        if (c10147x != null) {
            L.x(c10147x.f101403a);
        }
    }

    final void b() {
        C.S.a("MeteringRepeating", "MeteringRepeating clear!");
        C5106m0 c5106m0 = this.f101385a;
        if (c5106m0 != null) {
            c5106m0.d();
        }
        this.f101385a = null;
    }

    @NonNull
    final androidx.camera.core.impl.O0 c() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.f101388d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        O0.b m11 = O0.b.m(this.f101387c, size);
        m11.v(1);
        C5106m0 c5106m0 = new C5106m0(surface);
        this.f101385a = c5106m0;
        I.k.b(c5106m0.k(), new a(surface, surfaceTexture), H.c.b());
        m11.i(this.f101385a, C.A.f4076d, -1);
        O0.c cVar = this.f101390f;
        if (cVar != null) {
            cVar.b();
        }
        O0.c cVar2 = new O0.c(new O0.d() { // from class: v.t1
            @Override // androidx.camera.core.impl.O0.d
            public final void a(androidx.camera.core.impl.O0 o02, O0.g gVar) {
                C10140u1.a(C10140u1.this);
            }
        });
        this.f101390f = cVar2;
        m11.p(cVar2);
        return m11.k();
    }

    @NonNull
    final Size d() {
        return this.f101388d;
    }

    @NonNull
    final androidx.camera.core.impl.O0 e() {
        return this.f101386b;
    }

    @NonNull
    final androidx.camera.core.impl.b1<?> f() {
        return this.f101387c;
    }
}
