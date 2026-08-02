package defpackage;

import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class u7 {
    public v7[] a;
    public int b;
    public int c;
    public kki d;

    public final v7 f() {
        v7 v7Var;
        kki kkiVar;
        synchronized (this) {
            try {
                v7[] v7VarArr = this.a;
                if (v7VarArr == null) {
                    v7VarArr = h();
                    this.a = v7VarArr;
                } else if (this.b >= v7VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(v7VarArr, v7VarArr.length * 2);
                    this.a = (v7[]) copyOf;
                    v7VarArr = (v7[]) copyOf;
                }
                int i = this.c;
                do {
                    v7Var = v7VarArr[i];
                    if (v7Var == null) {
                        v7Var = g();
                        v7VarArr[i] = v7Var;
                    }
                    i++;
                    if (i >= v7VarArr.length) {
                        i = 0;
                    }
                } while (!v7Var.a(this));
                this.c = i;
                this.b++;
                kkiVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kkiVar != null) {
            kkiVar.x(1);
        }
        return v7Var;
    }

    public abstract v7 g();

    public abstract v7[] h();

    public final void i(v7 v7Var) {
        kki kkiVar;
        int i;
        rq3[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                kkiVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                v7Var.getClass();
                b = v7Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (rq3 rq3Var : b) {
            if (rq3Var != null) {
                p2g p2gVar = w2g.b;
                rq3Var.resumeWith(Unit.a);
            }
        }
        if (kkiVar != null) {
            kkiVar.x(-1);
        }
    }

    public final kki j() {
        kki kkiVar;
        synchronized (this) {
            kkiVar = this.d;
            if (kkiVar == null) {
                int i = this.b;
                kkiVar = new kki(1, Integer.MAX_VALUE, a62.b);
                kkiVar.b(Integer.valueOf(i));
                this.d = kkiVar;
            }
        }
        return kkiVar;
    }
}
