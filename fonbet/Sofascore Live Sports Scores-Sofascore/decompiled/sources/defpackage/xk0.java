package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xk0 implements cwh {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public xk0(InputStream inputStream, pij pijVar) {
        inputStream.getClass();
        this.b = inputStream;
        this.c = pijVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qoh qohVar = (qoh) obj;
                xk0 xk0Var = (xk0) this.c;
                qohVar.h();
                try {
                    xk0Var.close();
                    Unit unit = Unit.a;
                    if (qohVar.i()) {
                        throw qohVar.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!qohVar.i()) {
                        throw e;
                    }
                    throw qohVar.k(e);
                } finally {
                    qohVar.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        x52Var.getClass();
        switch (i) {
            case 0:
                qoh qohVar = (qoh) obj;
                xk0 xk0Var = (xk0) obj2;
                qohVar.h();
                try {
                    long read = xk0Var.read(x52Var, j);
                    if (qohVar.i()) {
                        throw qohVar.k(null);
                    }
                    return read;
                } catch (IOException e) {
                    if (qohVar.i()) {
                        throw qohVar.k(e);
                    }
                    throw e;
                } finally {
                    qohVar.i();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    ogj.h(vxd.l(j, "byteCount < 0: "));
                    return 0L;
                }
                try {
                    ((pij) obj2).f();
                    b1h Q0 = x52Var.Q0(1);
                    int read2 = ((InputStream) obj).read(Q0.a, Q0.c, (int) Math.min(j, 8192 - Q0.c));
                    if (read2 == -1) {
                        if (Q0.b == Q0.c) {
                            x52Var.a = Q0.a();
                            o1h.a(Q0);
                        }
                        return -1L;
                    }
                    Q0.c += read2;
                    long j2 = read2;
                    x52Var.b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (vol.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        switch (this.a) {
            case 0:
                return (qoh) this.b;
            default:
                return (pij) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((xk0) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }

    public xk0(qoh qohVar, xk0 xk0Var) {
        this.b = qohVar;
        this.c = xk0Var;
    }
}
