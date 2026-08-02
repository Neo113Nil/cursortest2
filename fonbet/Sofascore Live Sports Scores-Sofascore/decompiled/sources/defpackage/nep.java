package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nep extends map {
    public static final a5n b = new a5n(new nep(2), 1);
    public final int a;

    public nep(int i) {
        this.a = i;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        int Q0 = e7nVar.Q0();
        int i = Q0 - 1;
        if (i == 5 || i == 6) {
            return this.a + (-1) != 0 ? new ybp(e7nVar.f0()) : Double.valueOf(e7nVar.n0());
        }
        if (i == 8) {
            e7nVar.j0();
            return null;
        }
        String T = b0a.T(Q0);
        String I0 = e7nVar.I0();
        throw new o9p(fc6.o(new StringBuilder(T.length() + 33 + I0.length()), "Expecting number, got: ", T, "; at path ", I0), 16);
    }

    @Override // defpackage.map
    public final /* synthetic */ void write(f7n f7nVar, Object obj) {
        f7nVar.e0((Number) obj);
    }
}
