package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rdi implements qdi {
    public final em0 a = new em0(0);

    public final boolean f(int i) {
        return (this.a.get() & i) != 0;
    }

    public final void g(int i) {
        em0 em0Var;
        int i2;
        do {
            em0Var = this.a;
            i2 = em0Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!em0Var.compareAndSet(i2, i2 | i));
    }
}
