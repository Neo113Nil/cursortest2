package t2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import androidx.media3.common.a;
import b1.C2338G;
import b1.C2357k;
import b1.z;
import e1.AbstractC4134a;
import e1.C4147n;
import e1.InterfaceC4141h;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import t2.InterfaceC6383a;

/* loaded from: classes.dex */
public final class G0 implements InterfaceC6383a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f65042a;

    /* renamed from: b, reason: collision with root package name */
    public final E f65043b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4141h f65044c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6383a.c f65045d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65046e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f65047f;

    /* renamed from: g, reason: collision with root package name */
    public L0 f65048g;

    /* renamed from: h, reason: collision with root package name */
    public int f65049h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f65050i;

    public class a implements Ta.h {
        public a() {
        }

        @Override // Ta.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Bitmap bitmap) {
            final androidx.media3.common.a aVar;
            boolean hasGainmap;
            G0.this.f65050i = 50;
            androidx.media3.common.a P10 = new a.b().h0(bitmap.getHeight()).F0(bitmap.getWidth()).y0("image/raw").V(C2357k.f24597h).P();
            try {
                if (G0.this.f65046e && Build.VERSION.SDK_INT >= 34) {
                    hasGainmap = bitmap.hasGainmap();
                    if (hasGainmap) {
                        aVar = P10.b().y0("image/jpeg_r").P();
                        G0.this.f65045d.b(P10, 2);
                        G0.this.f65047f.submit(new Runnable() { // from class: t2.F0
                            @Override // java.lang.Runnable
                            public final void run() {
                                G0.this.j(bitmap, aVar);
                            }
                        });
                        return;
                    }
                }
                G0.this.f65045d.b(P10, 2);
                G0.this.f65047f.submit(new Runnable() { // from class: t2.F0
                    @Override // java.lang.Runnable
                    public final void run() {
                        G0.this.j(bitmap, aVar);
                    }
                });
                return;
            } catch (RuntimeException e10) {
                G0.this.f65045d.d(C6427w0.a(e10, 1000));
                return;
            }
            aVar = P10;
        }

        @Override // Ta.h
        public void onFailure(Throwable th2) {
            G0.this.f65045d.d(C6427w0.a(th2, 2000));
        }
    }

    public static final class b implements InterfaceC6383a.b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f65052a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC4141h f65053b;

        public b(Context context, InterfaceC4141h interfaceC4141h) {
            this.f65052a = context;
            this.f65053b = interfaceC4141h;
        }

        @Override // t2.InterfaceC6383a.b
        public InterfaceC6383a a(E e10, Looper looper, InterfaceC6383a.c cVar, InterfaceC6383a.C0908a c0908a) {
            return new G0(this.f65052a, e10, cVar, this.f65053b, c0908a.f65193b, null);
        }
    }

    public /* synthetic */ G0(Context context, E e10, InterfaceC6383a.c cVar, InterfaceC4141h interfaceC4141h, boolean z10, a aVar) {
        this(context, e10, cVar, interfaceC4141h, z10);
    }

    @Override // t2.InterfaceC6383a
    public int e(K0 k02) {
        if (this.f65049h == 2) {
            k02.f65093a = this.f65050i;
        }
        return this.f65049h;
    }

    @Override // t2.InterfaceC6383a
    public com.google.common.collect.B g() {
        return com.google.common.collect.B.m();
    }

    public final void j(final Bitmap bitmap, final androidx.media3.common.a aVar) {
        try {
            L0 l02 = this.f65048g;
            if (l02 == null) {
                this.f65048g = this.f65045d.a(aVar);
                this.f65047f.schedule(new Runnable() { // from class: t2.D0
                    @Override // java.lang.Runnable
                    public final void run() {
                        G0.this.j(bitmap, aVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            int b10 = l02.b(bitmap, new C4147n(this.f65043b.f65017e, r4.f65018f));
            if (b10 == 1) {
                this.f65050i = 100;
                this.f65048g.g();
            } else if (b10 == 2) {
                this.f65047f.schedule(new Runnable() { // from class: t2.E0
                    @Override // java.lang.Runnable
                    public final void run() {
                        G0.this.j(bitmap, aVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                if (b10 != 3) {
                    throw new IllegalStateException();
                }
                this.f65050i = 100;
            }
        } catch (RuntimeException e10) {
            this.f65045d.d(C6427w0.a(e10, 1000));
        } catch (C6427w0 e11) {
            this.f65045d.d(e11);
        }
    }

    @Override // t2.InterfaceC6383a
    public void release() {
        this.f65049h = 0;
        this.f65047f.shutdownNow();
    }

    @Override // t2.InterfaceC6383a
    public void start() {
        Ta.o c10;
        this.f65049h = 2;
        this.f65045d.f(this.f65043b.f65017e);
        this.f65045d.c(1);
        String d10 = k1.d(this.f65042a, this.f65043b.f65013a);
        if (d10 == null || !this.f65044c.a(d10)) {
            c10 = Ta.i.c(C2338G.d("Attempted to load a Bitmap from unsupported MIME type: " + d10));
        } else {
            c10 = this.f65044c.b(((z.h) AbstractC4134a.e(this.f65043b.f65013a.f24655b)).f24749a);
        }
        Ta.i.a(c10, new a(), this.f65047f);
    }

    public G0(Context context, E e10, InterfaceC6383a.c cVar, InterfaceC4141h interfaceC4141h, boolean z10) {
        AbstractC4134a.g(e10.f65017e != -9223372036854775807L);
        AbstractC4134a.g(e10.f65018f != -2147483647);
        this.f65042a = context;
        this.f65043b = e10;
        this.f65045d = cVar;
        this.f65044c = interfaceC4141h;
        this.f65046e = z10;
        this.f65047f = Executors.newSingleThreadScheduledExecutor();
        this.f65049h = 0;
    }
}
