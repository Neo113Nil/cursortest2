package Y2;

import Q2.C1493d;
import android.os.Build;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Y2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1815f {
    public static final void a(WorkDatabase workDatabase, androidx.work.a configuration, R2.G continuation) {
        int i10;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        List mutableListOf = CollectionsKt.mutableListOf(continuation);
        int i11 = 0;
        while (!mutableListOf.isEmpty()) {
            R2.G g10 = (R2.G) CollectionsKt.removeLast(mutableListOf);
            List g11 = g10.g();
            Intrinsics.checkNotNullExpressionValue(g11, "current.work");
            List list = g11;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((Q2.M) it.next()).d().constraints.g() && (i10 = i10 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i11 += i10;
            List f10 = g10.f();
            if (f10 != null) {
                mutableListOf.addAll(f10);
            }
        }
        if (i11 == 0) {
            return;
        }
        int z10 = workDatabase.l().z();
        int b10 = configuration.b();
        if (z10 + i11 <= b10) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + b10 + ";\nalready enqueued count: " + z10 + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final WorkSpec b(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        C1493d c1493d = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (Intrinsics.areEqual(str, ConstraintTrackingWorker.class.getName()) || !(c1493d.h() || c1493d.k())) {
            return workSpec;
        }
        androidx.work.b a10 = new b.a().c(workSpec.input).f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return WorkSpec.e(workSpec, null, null, name, null, a10, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    public static final WorkSpec c(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        boolean e10 = workSpec.input.e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean e11 = workSpec.input.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean e12 = workSpec.input.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (e10 || !e11 || !e12) {
            return workSpec;
        }
        return WorkSpec.e(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new b.a().c(workSpec.input).f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.workerClassName).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    public static final WorkSpec d(List schedulers, WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        WorkSpec c10 = c(workSpec);
        return Build.VERSION.SDK_INT < 26 ? b(c10) : c10;
    }
}
