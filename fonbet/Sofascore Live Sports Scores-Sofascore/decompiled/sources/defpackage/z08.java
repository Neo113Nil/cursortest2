package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z08 implements ejh {
    public final tha a;
    public long b;
    public boolean c;

    public z08(tha thaVar) {
        thaVar.getClass();
        this.a = thaVar;
        this.b = 0L;
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        if (this.c) {
            a70.r("closed");
            return;
        }
        tha thaVar = this.a;
        long j2 = this.b;
        thaVar.getClass();
        yqo.x(x52Var.b, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            b1h b1hVar = x52Var.a;
            b1hVar.getClass();
            int min = (int) Math.min(j3 - j2, b1hVar.c - b1hVar.b);
            byte[] bArr = b1hVar.a;
            int i = b1hVar.b;
            synchronized (thaVar) {
                bArr.getClass();
                thaVar.e.seek(j2);
                thaVar.e.write(bArr, i, min);
            }
            int i2 = b1hVar.b + min;
            b1hVar.b = i2;
            long j4 = min;
            j2 += j4;
            x52Var.b -= j4;
            if (i2 == b1hVar.c) {
                x52Var.a = b1hVar.a();
                o1h.a(b1hVar);
            }
        }
        this.b += j;
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tha thaVar = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = thaVar.d;
        reentrantLock.lock();
        try {
            int i = thaVar.c - 1;
            thaVar.c = i;
            if (i == 0 && thaVar.b) {
                Unit unit = Unit.a;
                synchronized (thaVar) {
                    thaVar.e.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ejh, java.io.Flushable
    public final void flush() {
        if (this.c) {
            a70.r("closed");
            return;
        }
        tha thaVar = this.a;
        synchronized (thaVar) {
            thaVar.e.getFD().sync();
        }
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        return pij.d;
    }
}
