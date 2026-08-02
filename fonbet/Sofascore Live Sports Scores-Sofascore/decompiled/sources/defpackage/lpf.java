package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lpf implements bwh {
    public final sce a;
    public boolean b;
    public final w52 c = new w52();

    public lpf(sce sceVar) {
        this.a = sceVar;
    }

    @Override // defpackage.qnf
    public final long X(w52 w52Var, long j) {
        if (this.b) {
            a70.r("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount: "));
            return 0L;
        }
        w52 w52Var2 = this.c;
        if (w52Var2.c == 0 && this.a.X(w52Var2, 8192L) == -1) {
            return -1L;
        }
        return w52Var2.X(w52Var, Math.min(j, w52Var2.c));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.e = true;
        w52 w52Var = this.c;
        w52Var.skip(w52Var.c);
    }

    @Override // defpackage.bwh
    public final void o(long j) {
        if (!request(j)) {
            throw new EOFException(vxd.m("Source doesn't contain required number of bytes (", j, ")."));
        }
    }

    @Override // defpackage.bwh
    public final byte readByte() {
        o(1L);
        return this.c.readByte();
    }

    @Override // defpackage.bwh
    public final boolean request(long j) {
        w52 w52Var;
        if (this.b) {
            a70.r("Source is closed.");
            return false;
        }
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount: "));
            return false;
        }
        do {
            w52Var = this.c;
            if (w52Var.c >= j) {
                return true;
            }
        } while (this.a.X(w52Var, 8192L) != -1);
        return false;
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // defpackage.bwh
    public final w52 u() {
        return this.c;
    }

    @Override // defpackage.bwh
    public final boolean w() {
        if (this.b) {
            a70.r("Source is closed.");
            return false;
        }
        w52 w52Var = this.c;
        return w52Var.w() && this.a.X(w52Var, 8192L) == -1;
    }
}
