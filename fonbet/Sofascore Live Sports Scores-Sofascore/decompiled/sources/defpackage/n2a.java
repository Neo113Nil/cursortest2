package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n2a implements cwh {
    public final lof a;
    public final Inflater b;
    public int c;
    public boolean d;

    public n2a(lof lofVar, Inflater inflater) {
        this.a = lofVar;
        this.b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[SYNTHETIC] */
    @Override // defpackage.cwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(x52 x52Var, long j) {
        long j2;
        x52Var.getClass();
        while (j >= 0) {
            if (this.d) {
                a70.r("closed");
                return 0L;
            }
            lof lofVar = this.a;
            Inflater inflater = this.b;
            if (j != 0) {
                try {
                    b1h Q0 = x52Var.Q0(1);
                    int min = (int) Math.min(j, 8192 - Q0.c);
                    if (inflater.needsInput() && !lofVar.w()) {
                        b1h b1hVar = lofVar.b.a;
                        b1hVar.getClass();
                        int i = b1hVar.c;
                        int i2 = b1hVar.b;
                        int i3 = i - i2;
                        this.c = i3;
                        inflater.setInput(b1hVar.a, i2, i3);
                    }
                    int inflate = inflater.inflate(Q0.a, Q0.c, min);
                    int i4 = this.c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.c -= remaining;
                        lofVar.skip(remaining);
                    }
                    if (inflate > 0) {
                        Q0.c += inflate;
                        j2 = inflate;
                        x52Var.b += j2;
                        if (j2 <= 0) {
                            return j2;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (lofVar.w()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (Q0.b == Q0.c) {
                        x52Var.a = Q0.a();
                        o1h.a(Q0);
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            j2 = 0;
            if (j2 <= 0) {
            }
        }
        ogj.h(vxd.l(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.a.a.timeout();
    }
}
