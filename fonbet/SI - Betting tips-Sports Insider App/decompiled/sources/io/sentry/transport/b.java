package io.sentry.transport;

import com.google.android.gms.internal.measurement.y3;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.h0;
import io.sentry.k4;
import io.sentry.m4;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final l1.a f17115a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f17116b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.cache.d f17117c;

    /* renamed from: d, reason: collision with root package name */
    public final q f17118d = new q(-1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f17119e;

    public b(c cVar, l1.a aVar, h0 h0Var, io.sentry.cache.d dVar) {
        this.f17119e = cVar;
        y4.a.C(aVar, "Envelope is required.");
        this.f17115a = aVar;
        this.f17116b = h0Var;
        y4.a.C(dVar, "EnvelopeCache is required.");
        this.f17117c = dVar;
    }

    public static /* synthetic */ void a(b bVar, y3 y3Var, io.sentry.hints.k kVar) {
        bVar.f17119e.f17122c.getLogger().h(b5.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(y3Var.t()));
        kVar.b(y3Var.t());
    }

    public final y3 b() {
        Class cls;
        k4 a7;
        l1.a aVar = this.f17115a;
        ((m4) aVar.f19314b).f16644d = null;
        io.sentry.cache.d dVar = this.f17117c;
        h0 h0Var = this.f17116b;
        boolean y5 = dVar.y(aVar, h0Var);
        Object b10 = h0Var.b("sentry:typeCheckHint");
        boolean isInstance = io.sentry.hints.c.class.isInstance(h0Var.b("sentry:typeCheckHint"));
        c cVar = this.f17119e;
        if (isInstance && b10 != null) {
            io.sentry.hints.c cVar2 = (io.sentry.hints.c) b10;
            b6 b6Var = cVar.f17122c;
            if (cVar2.f(((m4) aVar.f19314b).f16641a)) {
                cVar2.f16480a.countDown();
                b6Var.getLogger().h(b5.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                b6Var.getLogger().h(b5.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        b6 b6Var2 = cVar.f17122c;
        if (!cVar.f17124e.a()) {
            Object b11 = h0Var.b("sentry:typeCheckHint");
            boolean isInstance2 = io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint"));
            q qVar = this.f17118d;
            if (isInstance2 && b11 != null) {
                ((io.sentry.hints.h) b11).c(true);
                return qVar;
            }
            if (!y5) {
                u6.h.r(io.sentry.hints.h.class, b11, b6Var2.getLogger());
                b6Var2.getClientReportRecorder().c(io.sentry.clientreport.e.NETWORK_ERROR, aVar);
            }
            return qVar;
        }
        l1.a n9 = b6Var2.getClientReportRecorder().n(aVar);
        try {
            a7 = b6Var2.getDateProvider().a();
            cls = io.sentry.hints.h.class;
        } catch (IOException e7) {
            e = e7;
            cls = io.sentry.hints.h.class;
        }
        try {
            ((m4) n9.f19314b).f16644d = com.google.android.play.core.appupdate.b.o(Double.valueOf(a7.d() / 1000000.0d).longValue());
            y3 d10 = cVar.f17125f.d(n9);
            if (d10.t()) {
                dVar.n(aVar);
                return d10;
            }
            String str = "The transport failed to send the envelope with response code " + d10.p();
            b6Var2.getLogger().h(b5.ERROR, str, new Object[0]);
            if (d10.p() >= 400) {
                dVar.n(aVar);
                if (d10.p() != 429) {
                    b6Var2.getClientReportRecorder().c(io.sentry.clientreport.e.NETWORK_ERROR, n9);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e9) {
            e = e9;
            Object b12 = h0Var.b("sentry:typeCheckHint");
            Class cls2 = cls;
            if (cls2.isInstance(h0Var.b("sentry:typeCheckHint")) && b12 != null) {
                ((io.sentry.hints.h) b12).c(true);
            } else if (!y5) {
                u6.h.r(cls2, b12, b6Var2.getLogger());
                b6Var2.getClientReportRecorder().c(io.sentry.clientreport.e.NETWORK_ERROR, n9);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17119e.f17126g = this;
        y3 y3Var = this.f17118d;
        try {
            y3Var = b();
            this.f17119e.f17122c.getLogger().h(b5.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f17119e.f17122c.getLogger().b(b5.ERROR, th2, "Envelope submission failed", new Object[0]);
                throw th2;
            } finally {
                h0 h0Var = this.f17116b;
                Object b10 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(h0Var.b("sentry:typeCheckHint")) && b10 != null) {
                    a(this, y3Var, (io.sentry.hints.k) b10);
                }
                this.f17119e.f17126g = null;
            }
        }
    }
}
