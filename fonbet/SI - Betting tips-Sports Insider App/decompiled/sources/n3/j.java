package n3;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import e3.i0;
import e3.m0;
import f3.j0;
import f3.v;
import f3.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.d0;
import kotlin.collections.u;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f20837a = {13, 15, 14};

    public static final void a(v vVar, String str) {
        j0 b10;
        WorkDatabase workDatabase = vVar.f9428c;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
        m3.s y5 = workDatabase.y();
        m3.c t3 = workDatabase.t();
        ArrayList g10 = u.g(str);
        while (!g10.isEmpty()) {
            String id2 = (String) z.s(g10);
            i0 b11 = y5.b(id2);
            if (b11 != i0.f8526c && b11 != i0.f8527d) {
                Intrinsics.checkNotNullParameter(id2, "id");
                ((Number) x.n0(y5.f20360a, false, true, new a2.k(id2, 17))).intValue();
            }
            g10.addAll(t3.a(id2));
        }
        f3.f fVar = vVar.f9431f;
        Intrinsics.checkNotNullExpressionValue(fVar, "getProcessor(...)");
        synchronized (fVar.f9362k) {
            e3.x.e().a(f3.f.f9352l, "Processor cancelling " + str);
            fVar.f9361i.add(str);
            b10 = fVar.b(str);
        }
        f3.f.e(str, b10, 1);
        Iterator it = vVar.f9430e.iterator();
        while (it.hasNext()) {
            ((f3.h) it.next()).d(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, e3.c configuration, f3.p continuation) {
        int i5;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList g10 = u.g(continuation);
        int i10 = 0;
        while (!g10.isEmpty()) {
            List list = ((f3.p) z.s(g10)).f9409d;
            Intrinsics.checkNotNullExpressionValue(list, "getWork(...)");
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i5 = 0;
                while (it.hasNext()) {
                    if (((m0) it.next()).f8546b.j.b() && (i5 = i5 + 1) < 0) {
                        u.i();
                        throw null;
                    }
                }
            } else {
                i5 = 0;
            }
            i10 += i5;
        }
        if (i10 == 0) {
            return;
        }
        int intValue = ((Number) x.n0(workDatabase.y().f20360a, true, false, new d0(8))).intValue();
        int i11 = configuration.f8486m;
        if (intValue + i10 <= i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
        sb2.append(i11);
        sb2.append(";\nalready enqueued count: ");
        sb2.append(intValue);
        sb2.append(";\ncurrent enqueue operation count: ");
        throw new IllegalArgumentException(r4.k.n(sb2, i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static final m3.o c(List schedulers, m3.o workSpec) {
        String str;
        String str2;
        m3.o workSpec2;
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        boolean c2 = workSpec.f20335e.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean c8 = workSpec.f20335e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean c10 = workSpec.f20335e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!c2 && c8 && c10) {
            String str3 = workSpec.f20333c;
            e3.i iVar = new e3.i(0);
            e3.j data = workSpec.f20335e;
            Intrinsics.checkNotNullParameter(data, "data");
            iVar.f(data.f8532a);
            Intrinsics.checkNotNullParameter("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", "key");
            iVar.f8523a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str3);
            str = "key";
            str2 = "data";
            workSpec2 = m3.o.b(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", iVar.c(), 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            str = "key";
            str2 = "data";
            workSpec2 = workSpec;
        }
        if (Build.VERSION.SDK_INT > 25) {
            return workSpec2;
        }
        Intrinsics.checkNotNullParameter(workSpec2, "workSpec");
        e3.f fVar = workSpec2.j;
        String str4 = workSpec2.f20333c;
        if (Intrinsics.areEqual(str4, ConstraintTrackingWorker.class.getName())) {
            return workSpec2;
        }
        if (!fVar.f8510e && !fVar.f8511f) {
            return workSpec2;
        }
        e3.i iVar2 = new e3.i(0);
        e3.j jVar = workSpec2.f20335e;
        Intrinsics.checkNotNullParameter(jVar, str2);
        iVar2.f(jVar.f8532a);
        Intrinsics.checkNotNullParameter("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
        iVar2.f8523a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
        e3.j c11 = iVar2.c();
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return m3.o.b(workSpec2, null, null, name, c11, 0, 0L, 0, 0, 0L, 0, 33554411);
    }
}
