package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nhj implements jpg {
    public final jpg a;
    public final long b;

    public nhj(jpg jpgVar, long j) {
        this.a = jpgVar;
        this.b = j;
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        int e = this.a.e(fp4Var, im4Var, i);
        if (e == -4) {
            im4Var.k += this.b;
        }
        return e;
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        return this.a.isReady();
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
        this.a.maybeThrowError();
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        return this.a.skipData(j - this.b);
    }
}
