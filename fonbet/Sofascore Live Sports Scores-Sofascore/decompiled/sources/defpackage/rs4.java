package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rs4 implements ejh {
    public final OutputStream a;
    public final qoh b;
    public final /* synthetic */ g7h c;

    public rs4(g7h g7hVar) {
        this.c = g7hVar;
        Socket socket = (Socket) g7hVar.b;
        this.a = socket.getOutputStream();
        this.b = new qoh(socket);
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        yqo.x(x52Var.b, 0L, j);
        while (j > 0) {
            qoh qohVar = this.b;
            qohVar.f();
            b1h b1hVar = x52Var.a;
            b1hVar.getClass();
            int min = (int) Math.min(j, b1hVar.c - b1hVar.b);
            qohVar.h();
            try {
                try {
                    this.a.write(b1hVar.a, b1hVar.b, min);
                    Unit unit = Unit.a;
                    if (qohVar.i()) {
                        throw qohVar.k(null);
                    }
                    int i = b1hVar.b + min;
                    b1hVar.b = i;
                    long j2 = min;
                    j -= j2;
                    x52Var.b -= j2;
                    if (i == b1hVar.c) {
                        x52Var.a = b1hVar.a();
                        o1h.a(b1hVar);
                    }
                } catch (IOException e) {
                    if (!qohVar.i()) {
                        throw e;
                    }
                    throw qohVar.k(e);
                }
            } catch (Throwable th) {
                qohVar.i();
                throw th;
            }
        }
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.a;
        g7h g7hVar = this.c;
        qoh qohVar = this.b;
        qohVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) g7hVar.c;
            Socket socket = (Socket) g7hVar.b;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                Unit unit = Unit.a;
                if (qohVar.i()) {
                    throw qohVar.k(null);
                }
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

    @Override // defpackage.ejh, java.io.Flushable
    public final void flush() {
        qoh qohVar = this.b;
        qohVar.h();
        try {
            this.a.flush();
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

    @Override // defpackage.ejh
    public final pij timeout() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }
}
