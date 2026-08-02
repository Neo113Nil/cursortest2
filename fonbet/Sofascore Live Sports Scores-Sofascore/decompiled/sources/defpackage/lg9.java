package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lg9 extends hg9 {
    public boolean e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (!this.e) {
            e(mg9.f);
        }
        this.c = true;
    }

    @Override // defpackage.hg9, defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        if (this.e) {
            return -1L;
        }
        long read = super.read(x52Var, j);
        if (read != -1) {
            return read;
        }
        this.e = true;
        e(q89.b);
        return -1L;
    }
}
