package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ge2 extends jn8 {
    public final /* synthetic */ ie2 b;
    public final /* synthetic */ n72 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge2(ie2 ie2Var, n72 n72Var, ejh ejhVar) {
        super(ejhVar);
        this.b = ie2Var;
        this.c = n72Var;
    }

    @Override // defpackage.jn8, defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ie2 ie2Var = this.b;
        n72 n72Var = this.c;
        synchronized (ie2Var) {
            if (n72Var.a) {
                return;
            }
            n72Var.a = true;
            super.close();
            ((en0) this.c.b).i();
        }
    }
}
