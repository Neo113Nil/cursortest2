package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ss4 implements cwh {
    public final InputStream a;
    public final qoh b;
    public final /* synthetic */ g7h c;

    public ss4(g7h g7hVar) {
        this.c = g7hVar;
        Socket socket = (Socket) g7hVar.b;
        this.a = socket.getInputStream();
        this.b = new qoh(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        g7h g7hVar = this.c;
        qoh qohVar = this.b;
        qohVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) g7hVar.c;
            Socket socket = (Socket) g7hVar.b;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
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

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        qoh qohVar = this.b;
        qohVar.f();
        b1h Q0 = x52Var.Q0(1);
        int min = (int) Math.min(j, 8192 - Q0.c);
        try {
            qohVar.h();
            try {
                int read = this.a.read(Q0.a, Q0.c, min);
                if (qohVar.i()) {
                    throw qohVar.k(null);
                }
                if (read != -1) {
                    Q0.c += read;
                    long j2 = read;
                    x52Var.b += j2;
                    return j2;
                }
                if (Q0.b != Q0.c) {
                    return -1L;
                }
                x52Var.a = Q0.a();
                o1h.a(Q0);
                return -1L;
            } catch (IOException e) {
                if (qohVar.i()) {
                    throw qohVar.k(e);
                }
                throw e;
            } finally {
                qohVar.i();
            }
        } catch (AssertionError e2) {
            if (vol.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
