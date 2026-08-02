package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wk0 implements ejh {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public wk0(OutputStream outputStream, pij pijVar) {
        outputStream.getClass();
        this.b = outputStream;
        this.c = pijVar;
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        long j2;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        x52Var.getClass();
        switch (i) {
            case 0:
                yqo.x(x52Var.b, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    b1h b1hVar = x52Var.a;
                    b1hVar.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += b1hVar.c - b1hVar.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                b1hVar = b1hVar.f;
                                b1hVar.getClass();
                            }
                        }
                    }
                    qoh qohVar = (qoh) obj;
                    wk0 wk0Var = (wk0) obj2;
                    qohVar.h();
                    try {
                        wk0Var.W(x52Var, j2);
                        Unit unit = Unit.a;
                        if (qohVar.i()) {
                            throw qohVar.k(null);
                        }
                    } catch (IOException e) {
                        if (!qohVar.i()) {
                            throw e;
                        }
                        throw qohVar.k(e);
                    } finally {
                        qohVar.i();
                    }
                }
                return;
            default:
                yqo.x(x52Var.b, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((pij) obj2).f();
                    b1h b1hVar2 = x52Var.a;
                    b1hVar2.getClass();
                    int min = (int) Math.min(j4, b1hVar2.c - b1hVar2.b);
                    ((OutputStream) obj).write(b1hVar2.a, b1hVar2.b, min);
                    int i2 = b1hVar2.b + min;
                    b1hVar2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    x52Var.b -= j5;
                    if (i2 == b1hVar2.c) {
                        x52Var.a = b1hVar2.a();
                        o1h.a(b1hVar2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qoh qohVar = (qoh) obj;
                wk0 wk0Var = (wk0) this.c;
                qohVar.h();
                try {
                    wk0Var.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.ejh, java.io.Flushable
    public final void flush() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qoh qohVar = (qoh) obj;
                wk0 wk0Var = (wk0) this.c;
                qohVar.h();
                try {
                    wk0Var.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // defpackage.ejh
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
                return "AsyncTimeout.sink(" + ((wk0) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }

    public wk0(qoh qohVar, wk0 wk0Var) {
        this.b = qohVar;
        this.c = wk0Var;
    }
}
