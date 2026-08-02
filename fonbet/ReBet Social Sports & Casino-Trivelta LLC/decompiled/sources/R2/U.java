package R2;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface U {
    default void a(C1549z workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        c(workSpecId, i10);
    }

    default void b(C1549z workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        d(workSpecId, null);
    }

    void c(C1549z c1549z, int i10);

    void d(C1549z c1549z, WorkerParameters.a aVar);

    default void e(C1549z workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        c(workSpecId, -512);
    }
}
