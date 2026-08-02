package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cvd {
    public final int a;
    public final int b;

    public /* synthetic */ cvd(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar);

    public vu8 b(zz0 zz0Var) {
        return null;
    }

    public final String toString() {
        String simpleName = duf.a.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public cvd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
