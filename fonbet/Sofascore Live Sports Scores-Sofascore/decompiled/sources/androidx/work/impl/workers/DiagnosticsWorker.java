package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.bgf;
import defpackage.bri;
import defpackage.ccl;
import defpackage.gz8;
import defpackage.h15;
import defpackage.jdb;
import defpackage.k6g;
import defpackage.nxk;
import defpackage.pcl;
import defpackage.prd;
import defpackage.qcl;
import defpackage.rik;
import defpackage.scl;
import defpackage.xbl;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final jdb doWork() {
        xbl d = xbl.d(getApplicationContext());
        d.getClass();
        WorkDatabase workDatabase = d.c;
        workDatabase.getClass();
        qcl g = workDatabase.g();
        ccl e = workDatabase.e();
        scl h = workDatabase.h();
        bri d2 = workDatabase.d();
        bgf bgfVar = d.b.d;
        List list = (List) gz8.S(g.a, true, false, new prd(System.currentTimeMillis() - 86400000, 8));
        k6g k6gVar = g.a;
        List list2 = (List) gz8.S(k6gVar, true, false, new nxk(27));
        List list3 = (List) gz8.S(k6gVar, true, false, new pcl(2));
        if (!list.isEmpty()) {
            rik o = rik.o();
            int i = h15.a;
            o.getClass();
            rik o2 = rik.o();
            h15.a(e, h, d2, list);
            o2.getClass();
        }
        if (!list2.isEmpty()) {
            rik o3 = rik.o();
            int i2 = h15.a;
            o3.getClass();
            rik o4 = rik.o();
            h15.a(e, h, d2, list2);
            o4.getClass();
        }
        if (!list3.isEmpty()) {
            rik o5 = rik.o();
            int i3 = h15.a;
            o5.getClass();
            rik o6 = rik.o();
            h15.a(e, h, d2, list3);
            o6.getClass();
        }
        return jdb.a();
    }
}
