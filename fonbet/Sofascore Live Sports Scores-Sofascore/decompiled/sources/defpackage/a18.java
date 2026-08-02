package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a18 implements cwh {
    public final tha a;
    public long b;
    public boolean c;

    public a18(tha thaVar, long j) {
        this.a = thaVar;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        long j2;
        long j3;
        int i;
        x52Var.getClass();
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        tha thaVar = this.a;
        long j4 = this.b;
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            b1h Q0 = x52Var.Q0(1);
            byte[] bArr = Q0.a;
            int i2 = Q0.c;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (thaVar) {
                bArr.getClass();
                thaVar.e.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = thaVar.e.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (Q0.b == Q0.c) {
                    x52Var.a = Q0.a();
                    o1h.a(Q0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                Q0.c += i;
                long j7 = i;
                j6 += j7;
                x52Var.b += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return pij.d;
    }
}
