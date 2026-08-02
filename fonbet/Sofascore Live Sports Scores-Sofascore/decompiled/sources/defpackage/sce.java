package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sce implements qnf {
    public final bwh a;
    public final w52 b;
    public a1h c;
    public int d;
    public boolean e;
    public long f;

    public sce(bwh bwhVar) {
        this.a = bwhVar;
        w52 u = bwhVar.u();
        this.b = u;
        a1h a1hVar = u.a;
        this.c = a1hVar;
        this.d = a1hVar != null ? a1hVar.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.qnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long X(w52 w52Var, long j) {
        a1h a1hVar;
        if (this.e) {
            a70.r("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            ogj.h(vxd.m("byteCount (", j, ") < 0"));
            return 0L;
        }
        a1h a1hVar2 = this.c;
        w52 w52Var2 = this.b;
        if (a1hVar2 != null) {
            a1h a1hVar3 = w52Var2.a;
            if (a1hVar2 == a1hVar3) {
                int i = this.d;
                a1hVar3.getClass();
            }
            a70.r("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.a.request(this.f + 1)) {
            return -1L;
        }
        if (this.c == null && (a1hVar = w52Var2.a) != null) {
            this.c = a1hVar;
            this.d = a1hVar.b;
        }
        long min = Math.min(j, w52Var2.c - this.f);
        long j2 = this.f;
        long j3 = j2 + min;
        ww9.v(w52Var2.c, j2, j3);
        if (j2 != j3) {
            long j4 = j3 - j2;
            w52Var.c += j4;
            a1h a1hVar4 = w52Var2.a;
            while (true) {
                a1hVar4.getClass();
                long j5 = a1hVar4.c - a1hVar4.b;
                if (j2 < j5) {
                    break;
                }
                j2 -= j5;
                a1hVar4 = a1hVar4.f;
            }
            while (j4 > 0) {
                a1hVar4.getClass();
                a1h e = a1hVar4.e();
                int i2 = e.b + ((int) j2);
                e.b = i2;
                e.c = Math.min(i2 + ((int) j4), e.c);
                if (w52Var.a == null) {
                    w52Var.a = e;
                    w52Var.b = e;
                } else {
                    a1h a1hVar5 = w52Var.b;
                    a1hVar5.getClass();
                    a1hVar5.d(e);
                    w52Var.b = e;
                }
                j4 -= e.c - e.b;
                a1hVar4 = a1hVar4.f;
                j2 = 0;
            }
        }
        this.f += min;
        return min;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }
}
