package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ct9 extends d7e {
    public final nr9 f;

    public ct9(nr9 nr9Var) {
        this.f = nr9Var;
    }

    @Override // defpackage.d7e
    public final long i() {
        nr9 nr9Var = this.f;
        int width = nr9Var.getWidth();
        float f = width > 0 ? width : Float.NaN;
        return (Float.floatToRawIntBits(nr9Var.getHeight() > 0 ? r6 : Float.NaN) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        nr9 nr9Var = this.f;
        int width = nr9Var.getWidth();
        float intBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / width : 1.0f;
        int height = nr9Var.getHeight();
        float intBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / height : 1.0f;
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            ((hpo) L0.a).G(intBitsToFloat, intBitsToFloat2, 0L);
            nr9Var.c(xx.b(ha5Var.L0().t()));
        } finally {
            mz1.v(L0, D);
        }
    }
}
