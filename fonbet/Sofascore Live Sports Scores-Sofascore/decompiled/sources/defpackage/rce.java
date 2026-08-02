package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rce implements cwh {
    public final l62 a;
    public final x52 b;
    public b1h c;
    public int d;
    public boolean e;
    public long f;

    public rce(l62 l62Var) {
        this.a = l62Var;
        x52 u = l62Var.u();
        this.b = u;
        b1h b1hVar = u.a;
        this.c = b1hVar;
        this.d = b1hVar != null ? b1hVar.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.cwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(x52 x52Var, long j) {
        b1h b1hVar;
        x52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.e) {
            a70.r("closed");
            return 0L;
        }
        b1h b1hVar2 = this.c;
        x52 x52Var2 = this.b;
        if (b1hVar2 != null) {
            b1h b1hVar3 = x52Var2.a;
            if (b1hVar2 == b1hVar3) {
                int i = this.d;
                b1hVar3.getClass();
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
        if (this.c == null && (b1hVar = x52Var2.a) != null) {
            this.c = b1hVar;
            this.d = b1hVar.b;
        }
        long min = Math.min(j, x52Var2.b - this.f);
        this.b.p(x52Var, this.f, min);
        this.f += min;
        return min;
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.a.timeout();
    }
}
