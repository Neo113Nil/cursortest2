package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fri implements hsg {
    public static final /* synthetic */ int e = 0;
    public final Context a;
    public final JobScheduler b;
    public final eri c;
    public final WorkDatabase d;

    static {
        rik.x("SystemJobScheduler");
    }

    public fri(Context context, WorkDatabase workDatabase, ti3 ti3Var) {
        JobScheduler a = dea.a(context);
        eri eriVar = new eri(context, ti3Var.d);
        this.a = context;
        this.b = a;
        this.c = eriVar;
        this.d = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            rik o = rik.o();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            o.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        int i = dea.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable unused) {
            rik.o().getClass();
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static qbl f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new qbl(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.hsg
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList d = d(context, jobScheduler);
        int i = 2;
        if (d == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = d.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                qbl f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a(jobScheduler, ((Integer) it2.next()).intValue());
        }
        bri d2 = this.d.d();
        d2.getClass();
        str.getClass();
        gz8.S(d2.a, false, true, new cfi(str, i));
    }

    @Override // defpackage.hsg
    public final void c(lcl... lclVarArr) {
        int intValue;
        WorkDatabase workDatabase = this.d;
        dad dadVar = new dad(workDatabase, 28);
        for (lcl lclVar : lclVarArr) {
            workDatabase.beginTransaction();
            try {
                lcl e2 = workDatabase.g().e(lclVar.a);
                if (e2 == null) {
                    rik.o().getClass();
                    workDatabase.setTransactionSuccessful();
                } else if (e2.b != sbl.a) {
                    rik.o().getClass();
                    workDatabase.setTransactionSuccessful();
                } else {
                    qbl p = rha.p(lclVar);
                    int i = p.b;
                    String str = p.a;
                    bri d = workDatabase.d();
                    d.getClass();
                    str.getClass();
                    ari ariVar = (ari) gz8.S(d.a, true, false, new pu9(str, i, 3));
                    if (ariVar != null) {
                        intValue = ariVar.c;
                    } else {
                        Object runInTransaction = ((WorkDatabase) dadVar.b).runInTransaction(new ji2(dadVar, 5));
                        runInTransaction.getClass();
                        intValue = ((Number) runInTransaction).intValue();
                    }
                    if (ariVar == null) {
                        ari ariVar2 = new ari(str, i, intValue);
                        bri d2 = workDatabase.d();
                        d2.getClass();
                        gz8.S(d2.a, false, true, new aaf(27, d2, ariVar2));
                    }
                    g(lclVar, intValue);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    @Override // defpackage.hsg
    public final boolean e() {
        return true;
    }

    public final void g(lcl lclVar, int i) {
        List<JobInfo> list;
        JobInfo a = this.c.a(lclVar, i);
        rik.o().getClass();
        try {
            if (this.b.schedule(a) == 0) {
                rik.o().getClass();
                if (lclVar.q && lclVar.r == pwd.a) {
                    lclVar.q = false;
                    rik.o().getClass();
                    g(lclVar, i);
                }
            }
        } catch (IllegalStateException e2) {
            int i2 = dea.a;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = i3 >= 31 ? 150 : 100;
            int size = ((List) gz8.S(this.d.g().a, true, false, new nxk(25))).size();
            Context context = this.a;
            String str = "<faulty JobScheduler failed to getPendingJobs>";
            if (i3 >= 34) {
                JobScheduler a2 = dea.a(context);
                try {
                    list = a2.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable unused) {
                    rik.o().getClass();
                    list = null;
                }
                if (list != null) {
                    ArrayList d = d(context, a2);
                    int size2 = d != null ? list.size() - d.size() : 0;
                    String i5 = size2 == 0 ? null : mz1.i(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList d2 = d(context, (JobScheduler) systemService);
                    int size3 = d2 != null ? d2.size() : 0;
                    str = CollectionsKt.f0(ph0.x(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", i5, size3 != 0 ? mz1.i(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList d3 = d(context, dea.a(context));
                if (d3 != null) {
                    str = d3.size() + " jobs from WorkManager";
                }
            }
            String h = fc6.h(size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.", dmi.t(i4, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", str, ".\nThere are "));
            rik.o().getClass();
            sw9.m(h, e2);
        } catch (Throwable unused2) {
            rik o = rik.o();
            lclVar.toString();
            o.getClass();
        }
    }
}
