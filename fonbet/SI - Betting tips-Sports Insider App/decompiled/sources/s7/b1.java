package s7;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f22658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f22661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, Runnable runnable, boolean z5, String str) {
        super(runnable, null);
        this.f22661d = d1Var;
        long andIncrement = d1.f22677k.getAndIncrement();
        this.f22658a = andIncrement;
        this.f22660c = str;
        this.f22659b = z5;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            n0 n0Var = ((f1) d1Var.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        boolean z5 = b1Var.f22659b;
        boolean z7 = this.f22659b;
        if (z7 != z5) {
            return !z7 ? 1 : -1;
        }
        long j = b1Var.f22658a;
        long j6 = this.f22658a;
        if (j6 < j) {
            return -1;
        }
        if (j6 > j) {
            return 1;
        }
        n0 n0Var = ((f1) this.f22661d.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22904g.b(Long.valueOf(j6), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        n0 n0Var = ((f1) this.f22661d.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22903f.b(th2, this.f22660c);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, Callable callable, boolean z5) {
        super(callable);
        this.f22661d = d1Var;
        long andIncrement = d1.f22677k.getAndIncrement();
        this.f22658a = andIncrement;
        this.f22660c = "Task exception on worker thread";
        this.f22659b = z5;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            n0 n0Var = ((f1) d1Var.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Tasks index overflow");
        }
    }
}
