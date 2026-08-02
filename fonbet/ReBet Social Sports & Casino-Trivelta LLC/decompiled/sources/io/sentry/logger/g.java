package io.sentry.logger;

import io.sentry.C4743e3;
import io.sentry.C4798p3;
import io.sentry.C4815r3;
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
    public final F3 f52180a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4755h0 f52181b;

    /* renamed from: c, reason: collision with root package name */
    public final Queue f52182c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4760i0 f52183d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Future f52184e;

    /* renamed from: f, reason: collision with root package name */
    public final C4843a f52185f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f52186g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f52187h;

    /* renamed from: i, reason: collision with root package name */
    public final A f52188i;

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f();
        }
    }

    public g(F3 f32, InterfaceC4755h0 interfaceC4755h0) {
        this(f32, interfaceC4755h0, new C4743e3(f32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        h();
        InterfaceC4765j0 d10 = this.f52185f.d();
        try {
            if (this.f52182c.isEmpty()) {
                this.f52186g = false;
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

    private void g() {
        ArrayList arrayList = new ArrayList(100);
        do {
            C4798p3 c4798p3 = (C4798p3) this.f52182c.poll();
            if (c4798p3 != null) {
                arrayList.add(c4798p3);
            }
            if (this.f52182c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f52181b.j(new C4815r3(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f52188i.a();
        }
    }

    private void h() {
        do {
            g();
        } while (this.f52182c.size() >= 100);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:7|8|(1:(2:11|(3:13|(1:15)|(2:17|18)(1:19))))|20|21|(1:23)(1:30)|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r5.f52186g = false;
        r5.f52180a.getLogger().b(io.sentry.EnumC4788n3.WARNING, "Logs batch processor flush task rejected", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(boolean z10, boolean z11) {
        if (this.f52186g && !z10) {
            return;
        }
        InterfaceC4765j0 d10 = this.f52185f.d();
        try {
            Future future = this.f52184e;
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
            this.f52186g = true;
            this.f52184e = this.f52183d.b(new b(), z11 ? 0 : 5000);
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

    @Override // io.sentry.logger.c
    public void a(boolean z10) {
        this.f52187h = true;
        if (z10) {
            i(true, true);
            this.f52183d.submit(new Runnable() { // from class: io.sentry.logger.f
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f52183d.a(g.this.f52180a.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.f52183d.a(this.f52180a.getShutdownTimeoutMillis());
            while (!this.f52182c.isEmpty()) {
                g();
            }
        }
    }

    @Override // io.sentry.logger.c
    public void b(long j10) {
        i(true, true);
        try {
            this.f52188i.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f52180a.getLogger().b(EnumC4788n3.ERROR, "Failed to flush log events", e10);
            Thread.currentThread().interrupt();
        }
    }

    public g(F3 f32, InterfaceC4755h0 interfaceC4755h0, InterfaceC4760i0 interfaceC4760i0) {
        this.f52185f = new C4843a();
        this.f52186g = false;
        this.f52187h = false;
        this.f52188i = new A();
        this.f52180a = f32;
        this.f52181b = interfaceC4755h0;
        this.f52182c = new ConcurrentLinkedQueue();
        this.f52183d = interfaceC4760i0;
    }
}
