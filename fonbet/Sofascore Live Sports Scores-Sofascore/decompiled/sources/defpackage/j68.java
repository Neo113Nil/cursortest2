package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j68 extends kn8 {
    public final long b;
    public final boolean c;
    public long d;

    public j68(cwh cwhVar, long j, boolean z) {
        super(cwhVar);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.kn8, defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(x52Var, j);
        if (read != -1) {
            this.d += read;
        }
        long j5 = this.d;
        if ((j5 >= j3 || read != -1) && j5 <= j3) {
            return read;
        }
        if (read > 0 && j5 > j3) {
            long j6 = x52Var.b - (j5 - j3);
            x52 x52Var2 = new x52();
            x52Var2.M0(x52Var);
            x52Var.W(x52Var2, j6);
            x52Var2.k();
        }
        StringBuilder o = ljg.o("expected ", j3, " bytes but got ");
        o.append(this.d);
        throw new IOException(o.toString());
    }
}
