package Y2;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Y2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1822m {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f13956a;

    public C1822m(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f13956a = workDatabase;
    }

    public static final Integer d(C1822m c1822m) {
        int d10;
        d10 = AbstractC1823n.d(c1822m.f13956a, "next_alarm_manager_id");
        return Integer.valueOf(d10);
    }

    public static final Integer f(C1822m c1822m, int i10, int i11) {
        int d10;
        d10 = AbstractC1823n.d(c1822m.f13956a, "next_job_scheduler_id");
        if (i10 > d10 || d10 > i11) {
            AbstractC1823n.e(c1822m.f13956a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = d10;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object runInTransaction = this.f13956a.runInTransaction((Callable<Object>) new Callable() { // from class: Y2.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer d10;
                d10 = C1822m.d(C1822m.this);
                return d10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        return ((Number) runInTransaction).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object runInTransaction = this.f13956a.runInTransaction((Callable<Object>) new Callable() { // from class: Y2.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f10;
                f10 = C1822m.f(C1822m.this, i10, i11);
                return f10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…d\n            }\n        )");
        return ((Number) runInTransaction).intValue();
    }
}
