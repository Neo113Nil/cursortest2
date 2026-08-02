package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import e3.u;
import f3.v;
import f3.x;
import hg.j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k2.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m3.i;
import m3.l;
import m3.s;
import org.jetbrains.annotations.NotNull;
import p3.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final u c() {
        v e7 = v.e(this.f8565a);
        Intrinsics.checkNotNullExpressionValue(e7, "getInstance(...)");
        WorkDatabase workDatabase = e7.f9428c;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
        s y5 = workDatabase.y();
        l w10 = workDatabase.w();
        m3.u z5 = workDatabase.z();
        i v5 = workDatabase.v();
        e7.f9427b.f8478d.getClass();
        List list = (List) x.n0(y5.f20360a, true, false, new j(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L), 1));
        List list2 = (List) x.n0(y5.f20360a, true, false, new d0(6));
        List list3 = (List) x.n0(y5.f20360a, true, false, new d0(10));
        if (!list.isEmpty()) {
            e3.x e9 = e3.x.e();
            String str = g.f21510a;
            e9.f(str, "Recently completed work:\n\n");
            e3.x.e().f(str, g.a(w10, z5, v5, list));
        }
        if (!list2.isEmpty()) {
            e3.x e10 = e3.x.e();
            String str2 = g.f21510a;
            e10.f(str2, "Running work:\n\n");
            e3.x.e().f(str2, g.a(w10, z5, v5, list2));
        }
        if (!list3.isEmpty()) {
            e3.x e11 = e3.x.e();
            String str3 = g.f21510a;
            e11.f(str3, "Enqueued work:\n\n");
            e3.x.e().f(str3, g.a(w10, z5, v5, list3));
        }
        u uVar = new u();
        Intrinsics.checkNotNullExpressionValue(uVar, "success(...)");
        return uVar;
    }
}
