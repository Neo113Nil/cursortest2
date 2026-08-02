package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rmk {
    public final y78 a;
    public j80 b;
    public j80 c;
    public j80 d;
    public final float e;

    public rmk(y78 y78Var) {
        this.a = y78Var;
        this.e = y78Var.q();
    }

    public final j80 a(long j, j80 j80Var, j80 j80Var2) {
        j80 j80Var3 = this.c;
        if (j80Var3 == null) {
            j80Var3 = j80Var.c();
            this.c = j80Var3;
        }
        int b = j80Var3.b();
        int i = 0;
        while (true) {
            j80 j80Var4 = this.c;
            if (i >= b) {
                if (j80Var4 != null) {
                    return j80Var4;
                }
                Intrinsics.i("velocityVector");
                throw null;
            }
            if (j80Var4 == null) {
                Intrinsics.i("velocityVector");
                throw null;
            }
            j80Var.getClass();
            j80Var4.e(this.a.y(j, j80Var2.a(i)), i);
            i++;
        }
    }
}
