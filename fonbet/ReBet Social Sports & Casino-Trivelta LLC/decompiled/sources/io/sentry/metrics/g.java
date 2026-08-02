package io.sentry.metrics;

import io.sentry.C4743e3;
import io.sentry.C4857v3;
import io.sentry.C4862w3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4755h0;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4765j0;
import io.sentry.transport.A;
import io.sentry.util.C4843a;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f52202a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4755h0 f52203b;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4760i0 f52205d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Future f52206e;

    /* renamed from: f, reason: collision with root package name */
    public final C4843a f52207f = new C4843a();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f52208g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f52209h = false;

    /* renamed from: i, reason: collision with root package name */
    public final A f52210i = new A();

    /* renamed from: c, reason: collision with root package name */
    public final Queue f52204c = new ConcurrentLinkedQueue();

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f();
        }
    }

    public g(F3 f32, InterfaceC4755h0 interfaceC4755h0) {
        this.f52202a = f32;
        this.f52203b = interfaceC4755h0;
        this.f52205d = new C4743e3(f32);
    }

    @Override // io.sentry.metrics.c
    public void a(boolean z10) {
        this.f52209h = true;
        if (z10) {
            i(true, true);
            this.f52205d.submit(new Runnable() { // from class: io.sentry.metrics.f
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f52205d.a(g.this.f52202a.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.f52205d.a(this.f52202a.getShutdownTimeoutMillis());
            while (!this.f52204c.isEmpty()) {
                g();
            }
        }
    }

    @Override // io.sentry.metrics.c
    public void b(long j10) {
        i(true, true);
        try {
            this.f52210i.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f52202a.getLogger().b(EnumC4788n3.ERROR, "Failed to flush metrics events", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final void f() {
        h();
        InterfaceC4765j0 d10 = this.f52207f.d();
        try {
            if (this.f52204c.isEmpty()) {
                this.f52208g = false;
            } else {
                i(true, false);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            C4857v3 c4857v3 = (C4857v3) this.f52204c.poll();
            if (c4857v3 != null) {
                arrayList.add(c4857v3);
            }
            if (this.f52204c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f52203b.k(new C4862w3(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f52210i.a();
        }
    }

    public final void h() {
        do {
            g();
        } while (this.f52204c.size() >= 1000);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:7|8|(1:(2:11|(3:13|(1:15)|(2:17|18)(1:19))))|20|21|(1:23)(1:30)|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r5.f52208g = false;
        r5.f52202a.getLogger().b(io.sentry.EnumC4788n3.WARNING, "Metrics batch processor flush task rejected", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z10, boolean z11) {
        if (this.f52208g && !z10) {
            return;
        }
        InterfaceC4765j0 d10 = this.f52207f.d();
        try {
            Future future = this.f52206e;
            if (!z10) {
                if (future != null) {
                    if (!future.isDone()) {
                        if (future.isCancelled()) {
                        }
                        if (d10 == null) {
                            d10.close();
                            return;
                        }
                        return;
                    }
                }
            }
            this.f52208g = true;
            this.f52206e = this.f52205d.b(new b(), z11 ? 0 : 5000);
            if (d10 == null) {
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
