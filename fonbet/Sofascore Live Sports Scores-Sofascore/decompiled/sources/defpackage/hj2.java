package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class hj2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xbl b;

    public /* synthetic */ hj2(xbl xblVar, int i) {
        this.a = i;
        this.b = xblVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        xbl xblVar = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = xblVar.c;
                workDatabase.getClass();
                workDatabase.runInTransaction(new r0(24, workDatabase, xblVar));
                ssg.b(xblVar.b, workDatabase, xblVar.e);
                break;
            case 1:
                WorkDatabase workDatabase2 = xblVar.c;
                workDatabase2.getClass();
                workDatabase2.runInTransaction(new p3(8, workDatabase2, "widget_periodic_refresh", xblVar));
                ssg.b(xblVar.b, workDatabase2, xblVar.e);
                break;
            default:
                WorkDatabase workDatabase3 = xblVar.c;
                Context context = xblVar.a;
                int i2 = fri.e;
                if (Build.VERSION.SDK_INT >= 34) {
                    dea.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList d = fri.d(context, jobScheduler);
                if (d != null && !d.isEmpty()) {
                    Iterator it = d.iterator();
                    while (it.hasNext()) {
                        fri.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) gz8.S(workDatabase3.g().a, false, true, new pcl(3))).intValue();
                ssg.b(xblVar.b, workDatabase3, xblVar.e);
                break;
        }
        return Unit.a;
    }
}
