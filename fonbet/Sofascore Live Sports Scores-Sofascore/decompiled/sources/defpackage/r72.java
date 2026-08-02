package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class r72 {
    public static final t3e a = new t3e(16.0f, 8.0f, 16.0f, 8.0f);
    public static final float b = 64.0f;
    public static final float c = 36.0f;
    public static final float d = 1.0f;
    public static final t3e e = new t3e(8.0f, 8.0f, 8.0f, 8.0f);

    public static un4 a(long j, long j2, of3 of3Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ((p23) ((av8) of3Var).k(q23.a)).b();
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = q23.b(j3, of3Var);
        }
        long j4 = j2;
        ff5 ff5Var = q23.a;
        av8 av8Var = (av8) of3Var;
        long B = hkg.B(r13.c(((p23) av8Var.k(ff5Var)).a(), 0.12f), ((p23) av8Var.k(ff5Var)).c());
        av8 av8Var2 = (av8) of3Var;
        long a2 = ((p23) av8Var2.k(ff5Var)).a();
        long j5 = ((r13) av8Var2.k(mo3.a)).a;
        if (((p23) av8Var2.k(ff5Var)).d()) {
            hkg.e0(j5);
        } else {
            hkg.e0(j5);
        }
        return new un4(j3, j4, B, r13.c(a2, 0.38f));
    }
}
