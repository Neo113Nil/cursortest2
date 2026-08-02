package eg;

import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class t0 implements Runnable, Comparable, o0 {

    @Nullable
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f9224a;

    /* renamed from: b, reason: collision with root package name */
    public int f9225b = -1;

    public t0(long j) {
        this.f9224a = j;
    }

    @Override // eg.o0
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                com.android.billingclient.api.a aVar = c0.f9151b;
                if (obj == aVar) {
                    return;
                }
                u0 u0Var = obj instanceof u0 ? (u0) obj : null;
                if (u0Var != null) {
                    u0Var.b(this);
                }
                this._heap = aVar;
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final jg.b0 c() {
        Object obj = this._heap;
        if (obj instanceof jg.b0) {
            return (jg.b0) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f9224a - ((t0) obj).f9224a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, u0 u0Var, v0 v0Var) {
        synchronized (this) {
            if (this._heap == c0.f9151b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f18487a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (v0.f9229i.get(v0Var) == 1) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.f9226c = j;
                    } else {
                        long j6 = t0Var.f9224a;
                        if (j6 - j < 0) {
                            j = j6;
                        }
                        if (j - u0Var.f9226c > 0) {
                            u0Var.f9226c = j;
                        }
                    }
                    long j10 = this.f9224a;
                    long j11 = u0Var.f9226c;
                    if (j10 - j11 < 0) {
                        this.f9224a = j11;
                    }
                    u0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void e(u0 u0Var) {
        if (this._heap == c0.f9151b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u0Var;
    }

    public String toString() {
        return d9.e.j(new StringBuilder("Delayed[nanos="), this.f9224a, ']');
    }
}
