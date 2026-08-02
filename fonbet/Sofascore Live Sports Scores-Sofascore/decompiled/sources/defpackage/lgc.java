package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lgc implements ipg {
    public final ipg a;
    public final long b;

    public lgc(ipg ipgVar, long j) {
        this.a = ipgVar;
        this.b = j;
    }

    @Override // defpackage.ipg
    public final int a(fp4 fp4Var, hm4 hm4Var, int i) {
        int a = this.a.a(fp4Var, hm4Var, i);
        if (a == -4) {
            hm4Var.j = Math.max(0L, hm4Var.j + this.b);
        }
        return a;
    }

    @Override // defpackage.ipg
    public final boolean isReady() {
        return this.a.isReady();
    }

    @Override // defpackage.ipg
    public final void maybeThrowError() {
        this.a.maybeThrowError();
    }

    @Override // defpackage.ipg
    public final int skipData(long j) {
        return this.a.skipData(j - this.b);
    }
}
