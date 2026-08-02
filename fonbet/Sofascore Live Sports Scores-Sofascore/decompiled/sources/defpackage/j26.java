package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class j26 implements Runnable, Comparable, q55 {

    @Nullable
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public j26(long j) {
        this.a = j;
    }

    public final int b(long j, k26 k26Var, l26 l26Var) {
        synchronized (this) {
            if (this._heap == m26.a) {
                return 2;
            }
            synchronized (k26Var) {
                try {
                    j26[] j26VarArr = k26Var.a;
                    j26 j26Var = j26VarArr != null ? j26VarArr[0] : null;
                    int i = l26.j;
                    if (rh0.a.getIntVolatile(l26Var, l26.h) == 1) {
                        return 1;
                    }
                    if (j26Var == null) {
                        k26Var.c = j;
                    } else {
                        long j2 = j26Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = k26Var.c;
                        if (j - j3 > 0) {
                            k26Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.a - j < 0) {
                        this.a = j;
                    }
                    k26Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(k26 k26Var) {
        if (this._heap != m26.a) {
            this._heap = k26Var;
        } else {
            a70.p("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((j26) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.q55
    public final void d() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ih2 ih2Var = m26.a;
                if (obj == ih2Var) {
                    return;
                }
                k26 k26Var = obj instanceof k26 ? (k26) obj : null;
                if (k26Var != null) {
                    synchronized (k26Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof ggj ? (ggj) obj2 : null) != null) {
                            k26Var.c(this.b);
                        }
                    }
                }
                this._heap = ih2Var;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return fn0.n(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
