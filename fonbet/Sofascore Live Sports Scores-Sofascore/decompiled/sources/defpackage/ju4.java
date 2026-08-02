package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ju4 extends rwd {
    public final up3 a;
    public final long b;
    public final /* synthetic */ Object c;

    public ju4(up3 up3Var, Object obj) {
        this.c = obj;
        if (up3Var == null) {
            up3 up3Var2 = qp3.a;
            up3Var = qp3.a;
        }
        this.a = up3Var;
        this.b = ((byte[]) obj).length;
    }

    @Override // defpackage.swd
    public final Long a() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.swd
    public final up3 b() {
        return this.a;
    }

    @Override // defpackage.rwd
    public final byte[] d() {
        return (byte[]) this.c;
    }
}
