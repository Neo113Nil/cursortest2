package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ba2 {
    public final ArrayDeque a;

    public ba2(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque();
                break;
            case 2:
                this.a = new ArrayDeque(16);
                break;
            default:
                this.a = new ArrayDeque(0);
                break;
        }
    }

    public synchronized void a(fy8 fy8Var) {
        fy8Var.b = null;
        fy8Var.c = null;
        this.a.offer(fy8Var);
    }

    public void b() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + d());
    }

    public void c(long j) {
        long d = d();
        if (d != j) {
            if (d != -1) {
                if (d != -2) {
                    return;
                } else {
                    d = -2;
                }
            }
            StringBuilder o = ljg.o("expected non-string scope or scope ", j, " but found ");
            o.append(d);
            throw new IOException(o.toString());
        }
    }

    public long d() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }
}
