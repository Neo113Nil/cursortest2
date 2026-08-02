package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rt4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public rt4(sm8 sm8Var, int i) {
        this.a = (sm8Var.d & 1) != 0;
        this.b = hu4.d(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rt4 rt4Var = (rt4) obj;
        return w63.a.c(this.b, rt4Var.b).c(this.a, rt4Var.a).e();
    }
}
