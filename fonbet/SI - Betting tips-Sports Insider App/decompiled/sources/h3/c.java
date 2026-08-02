package h3;

import a2.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import d9.e;
import da.q;
import e3.f0;
import e3.i0;
import e3.x;
import f3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import k2.d0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import m3.i;
import m3.j;
import m3.o;
import m3.s;
import m4.g;
import n3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final String f10349f = x.g("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10350a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f10351b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10352c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f10353d;

    /* renamed from: e, reason: collision with root package name */
    public final e3.c f10354e;

    public c(Context context, WorkDatabase workDatabase, e3.c cVar) {
        JobScheduler b10 = a.b(context);
        b bVar = new b(context, cVar.f8478d, cVar.f8488o);
        this.f10350a = context;
        this.f10351b = b10;
        this.f10352c = bVar;
        this.f10353d = workDatabase;
        this.f10354e = cVar;
    }

    public static void a(JobScheduler jobScheduler, int i5) {
        try {
            jobScheduler.cancel(i5);
        } catch (Throwable th2) {
            x.e().d(f10349f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i5)), th2);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler, String str) {
        ArrayList f6 = f(context, jobScheduler);
        if (f6 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = f6.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            j g10 = g(jobInfo);
            if (g10 != null && str.equals(g10.f20321a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> a7 = a.a(jobScheduler);
        if (a7 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a7.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : a7) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // f3.h
    public final boolean c() {
        return true;
    }

    @Override // f3.h
    public final void d(String workSpecId) {
        Context context = this.f10350a;
        JobScheduler jobScheduler = this.f10351b;
        ArrayList b10 = b(context, jobScheduler, workSpecId);
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        i v5 = this.f10353d.v();
        v5.getClass();
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        f3.x.n0(v5.f20319a, false, true, new k(workSpecId, 11));
    }

    @Override // f3.h
    public final void e(o... oVarArr) {
        int intValue;
        ArrayList b10;
        int intValue2;
        o[] oVarArr2 = oVarArr;
        WorkDatabase workDatabase = this.f10353d;
        final f fVar = new f(workDatabase, 0);
        int length = oVarArr2.length;
        int i5 = 0;
        while (i5 < length) {
            o oVar = oVarArr2[i5];
            workDatabase.b();
            try {
                s y5 = workDatabase.y();
                String str = oVar.f20331a;
                o c2 = y5.c(str);
                String str2 = f10349f;
                if (c2 == null) {
                    x.e().h(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (c2.f20332b != i0.f8524a) {
                    x.e().h(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    j generationalId = g.j(oVar);
                    m3.g a7 = workDatabase.v().a(generationalId);
                    e3.c cVar = this.f10354e;
                    WorkDatabase workDatabase2 = fVar.f20834a;
                    if (a7 != null) {
                        intValue = a7.f20315c;
                    } else {
                        cVar.getClass();
                        final int i10 = cVar.f8485l;
                        Object o3 = workDatabase2.o(new Callable() { // from class: n3.e
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase3 = f.this.f20834a;
                                Long a10 = workDatabase3.u().a("next_job_scheduler_id");
                                int i11 = 0;
                                int longValue = a10 != null ? (int) a10.longValue() : 0;
                                workDatabase3.u().b(new m3.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i10) {
                                    workDatabase3.u().b(new m3.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = longValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(o3, "runInTransaction(...)");
                        intValue = ((Number) o3).intValue();
                    }
                    if (a7 == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        m3.g systemIdInfo = new m3.g(generationalId.f20321a, generationalId.f20322b, intValue);
                        i v5 = workDatabase.v();
                        v5.getClass();
                        Intrinsics.checkNotNullParameter(systemIdInfo, "systemIdInfo");
                        f3.x.n0(v5.f20319a, false, true, new fg.d(7, v5, systemIdInfo));
                    }
                    h(oVar, intValue);
                    if (Build.VERSION.SDK_INT == 23 && (b10 = b(this.f10350a, this.f10351b, str)) != null) {
                        int indexOf = b10.indexOf(Integer.valueOf(intValue));
                        if (indexOf >= 0) {
                            b10.remove(indexOf);
                        }
                        if (b10.isEmpty()) {
                            cVar.getClass();
                            final int i11 = cVar.f8485l;
                            Object o4 = workDatabase2.o(new Callable() { // from class: n3.e
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    WorkDatabase workDatabase3 = f.this.f20834a;
                                    Long a10 = workDatabase3.u().a("next_job_scheduler_id");
                                    int i112 = 0;
                                    int longValue = a10 != null ? (int) a10.longValue() : 0;
                                    workDatabase3.u().b(new m3.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                    if (longValue < 0 || longValue > i11) {
                                        workDatabase3.u().b(new m3.d("next_job_scheduler_id", Long.valueOf(1)));
                                    } else {
                                        i112 = longValue;
                                    }
                                    return Integer.valueOf(i112);
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(o4, "runInTransaction(...)");
                            intValue2 = ((Number) o4).intValue();
                        } else {
                            intValue2 = ((Integer) b10.get(0)).intValue();
                        }
                        h(oVar, intValue2);
                    }
                    workDatabase.r();
                    i5++;
                    oVarArr2 = oVarArr;
                }
                workDatabase.f();
                i5++;
                oVarArr2 = oVarArr;
            } finally {
                workDatabase.f();
            }
        }
    }

    public final void h(o oVar, int i5) {
        String str;
        JobInfo a7 = this.f10352c.a(oVar, i5);
        x e7 = x.e();
        StringBuilder sb2 = new StringBuilder("Scheduling work ID ");
        String str2 = oVar.f20331a;
        sb2.append(str2);
        sb2.append("Job ID ");
        sb2.append(i5);
        String sb3 = sb2.toString();
        String str3 = f10349f;
        e7.a(str3, sb3);
        try {
            if (this.f10351b.schedule(a7) == 0) {
                x.e().h(str3, "Unable to schedule work ID " + str2);
                if (oVar.q && oVar.f20346r == f0.f8515a) {
                    oVar.q = false;
                    x.e().a(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    h(oVar, i5);
                }
            }
        } catch (IllegalStateException e9) {
            String str4 = a.f10344a;
            Context context = this.f10350a;
            Intrinsics.checkNotNullParameter(context, "context");
            WorkDatabase workDatabase = this.f10353d;
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            e3.c configuration = this.f10354e;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            int i10 = Build.VERSION.SDK_INT;
            int i11 = i10 >= 31 ? 150 : 100;
            int size = ((List) f3.x.n0(workDatabase.y().f20360a, true, false, new d0(5))).size();
            String str5 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i10 >= 34) {
                JobScheduler b10 = a.b(context);
                List a10 = a.a(b10);
                if (a10 != null) {
                    ArrayList f6 = f(context, b10);
                    int size2 = f6 != null ? a10.size() - f6.size() : 0;
                    String str6 = null;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList f10 = f(context, (JobScheduler) systemService);
                    int size3 = f10 != null ? f10.size() : 0;
                    if (size3 != 0) {
                        str6 = size3 + " from WorkManager in the default namespace";
                    }
                    String[] elements = {a10.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str6};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    str5 = CollectionsKt.J(p.q(elements), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList f11 = f(context, a.b(context));
                if (f11 != null) {
                    str5 = f11.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb4 = new StringBuilder("JobScheduler ");
            sb4.append(i11);
            sb4.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb4.append(str5);
            sb4.append(".\nThere are ");
            sb4.append(size);
            sb4.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String i12 = e.i(sb4, configuration.f8487n, '.');
            x.e().c(str3, i12);
            IllegalStateException illegalStateException = new IllegalStateException(i12, e9);
            q qVar = configuration.f8483i;
            if (qVar == null) {
                throw illegalStateException;
            }
            qVar.accept(illegalStateException);
        } catch (Throwable th2) {
            x.e().d(str3, "Unable to schedule " + oVar, th2);
        }
    }
}
