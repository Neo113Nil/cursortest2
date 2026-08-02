package io.sentry.logger;

import com.android.billingclient.api.x0;
import com.google.firebase.messaging.x;
import io.sentry.android.core.f;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.clientreport.g;
import io.sentry.d5;
import io.sentry.e5;
import io.sentry.l;
import io.sentry.r;
import io.sentry.transport.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16625a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f16626b;

    /* renamed from: d, reason: collision with root package name */
    public final x f16628d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Future f16629e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.util.a f16630f = new io.sentry.util.a();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f16631g = false;

    /* renamed from: h, reason: collision with root package name */
    public final i2.d f16632h = new i2.d((byte) 0, 9);

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f16627c = new ConcurrentLinkedQueue();

    public d(b6 b6Var, x0 x0Var) {
        this.f16625a = b6Var;
        this.f16626b = x0Var;
        this.f16628d = new x(b6Var);
    }

    @Override // io.sentry.logger.b
    public void a(boolean z5) {
        x xVar = this.f16628d;
        if (z5) {
            e(true, true);
            xVar.submit(new f(10, this));
        } else {
            xVar.d(this.f16625a.getShutdownTimeoutMillis());
            while (!this.f16627c.isEmpty()) {
                c();
            }
        }
    }

    @Override // io.sentry.logger.b
    public final void b(long j) {
        e(true, true);
        try {
            i2.d dVar = this.f16632h;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.getClass();
            ((p) dVar.f10882b).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e7) {
            this.f16625a.getLogger().e(b5.ERROR, "Failed to flush log events", e7);
            Thread.currentThread().interrupt();
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f16627c;
            d5 d5Var = (d5) concurrentLinkedQueue.poll();
            if (d5Var != null) {
                arrayList.add(d5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        e5 e5Var = new e5(arrayList);
        x0 x0Var = this.f16626b;
        x0Var.getClass();
        try {
            x0Var.x(x0Var.p(e5Var), null);
        } catch (IOException e7) {
            ((b6) x0Var.f4116b).getLogger().b(b5.WARNING, e7, "Capturing logs failed.", new Object[0]);
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            p pVar = (p) this.f16632h.f10882b;
            int i10 = p.f17143a;
            pVar.releaseShared(1);
        }
    }

    @Override // io.sentry.logger.b
    public final void d(d5 d5Var) {
        i2.d dVar = this.f16632h;
        if (p.a((p) dVar.f10882b) < 1000) {
            p.b((p) dVar.f10882b);
            this.f16627c.offer(d5Var);
            e(false, false);
        } else {
            b6 b6Var = this.f16625a;
            g clientReportRecorder = b6Var.getClientReportRecorder();
            io.sentry.clientreport.e eVar = io.sentry.clientreport.e.QUEUE_OVERFLOW;
            clientReportRecorder.b(eVar, l.LogItem);
            b6Var.getClientReportRecorder().l(eVar, l.LogByte, io.sentry.util.d.a(b6Var.getSerializer(), b6Var.getLogger(), d5Var));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|7|8|(1:(2:11|(4:13|(1:15)|16|17)))|18|19|(1:21)(1:28)|22|23|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r5.f16631g = false;
        r5.f16625a.getLogger().e(io.sentry.b5.WARNING, "Logs batch processor flush task rejected", r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z5, boolean z7) {
        if (!this.f16631g || z5) {
            r a7 = this.f16630f.a();
            try {
                Future future = this.f16629e;
                if (!z5) {
                    if (future != null) {
                        if (!future.isDone()) {
                            if (future.isCancelled()) {
                            }
                            a7.close();
                        }
                    }
                }
                this.f16631g = true;
                this.f16629e = this.f16628d.l(new androidx.core.widget.b(16, this), z7 ? 0 : 5000);
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
