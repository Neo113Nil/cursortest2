package h5;

import androidx.work.impl.WorkDatabase;
import g5.C6632e;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6810h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WorkDatabase f64980a;

    public C6810h(@NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f64980a = workDatabase;
    }

    public static Integer a(C6810h this$0, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int a11 = Bl0.B.a(this$0.f64980a, "next_job_scheduler_id");
        if (a11 < 0 || a11 > i11) {
            this$0.f64980a.b().a(new C6632e("next_job_scheduler_id", Long.valueOf(1)));
            a11 = 0;
        }
        return Integer.valueOf(a11);
    }

    public static Integer b(C6810h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Integer.valueOf(Bl0.B.a(this$0.f64980a, "next_alarm_manager_id"));
    }

    public final int c() {
        Object runInTransaction = this.f64980a.runInTransaction((Callable<Object>) new Callable() { // from class: h5.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6810h.b(C6810h.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) runInTransaction).intValue();
    }

    public final int d(final int i11) {
        Object runInTransaction = this.f64980a.runInTransaction((Callable<Object>) new Callable() { // from class: h5.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6810h.a(C6810h.this, i11);
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) runInTransaction).intValue();
    }
}
