package androidx.work.impl.background.systemjob;

import Q2.AbstractC1508t;
import Q2.C;
import Q2.K;
import R2.InterfaceC1545v;
import X2.p;
import Y2.C1822m;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public class m implements InterfaceC1545v {

    /* renamed from: f, reason: collision with root package name */
    public static final String f23852f = AbstractC1508t.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f23853a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f23854b;

    /* renamed from: c, reason: collision with root package name */
    public final k f23855c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f23856d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.a f23857e;

    public m(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, d.c(context), new k(context, aVar.a(), aVar.s()));
    }

    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List g10 = g(context, jobScheduler);
        if (g10 == null || g10.isEmpty()) {
            return;
        }
        Iterator it = g10.iterator();
        while (it.hasNext()) {
            e(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            AbstractC1508t.e().d(f23852f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            X2.h h10 = h(jobInfo);
            if (h10 != null && str.equals(h10.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b10 = d.b(jobScheduler);
        if (b10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b10.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b10) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static X2.h h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new X2.h(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler c10 = d.c(context);
        List<JobInfo> g10 = g(context, c10);
        List c11 = workDatabase.i().c();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                X2.h h10 = h(jobInfo);
                if (h10 != null) {
                    hashSet.add(h10.b());
                } else {
                    e(c10, jobInfo.getId());
                }
            }
        }
        Iterator it = c11.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                AbstractC1508t.e().a(f23852f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        workDatabase.beginTransaction();
        try {
            androidx.work.impl.model.c l10 = workDatabase.l();
            Iterator it2 = c11.iterator();
            while (it2.hasNext()) {
                l10.o((String) it2.next(), -1L);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            return z10;
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    @Override // R2.InterfaceC1545v
    public void a(String str) {
        List f10 = f(this.f23853a, this.f23854b, str);
        if (f10 == null || f10.isEmpty()) {
            return;
        }
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            e(this.f23854b, ((Integer) it.next()).intValue());
        }
        this.f23856d.i().g(str);
    }

    @Override // R2.InterfaceC1545v
    public void b(WorkSpec... workSpecArr) {
        C1822m c1822m = new C1822m(this.f23856d);
        for (WorkSpec workSpec : workSpecArr) {
            this.f23856d.beginTransaction();
            try {
                WorkSpec i10 = this.f23856d.l().i(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
                if (i10 == null) {
                    AbstractC1508t.e().k(f23852f, "Skipping scheduling " + workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String + " because it's no longer in the DB");
                    this.f23856d.setTransactionSuccessful();
                } else if (i10.state != K.c.ENQUEUED) {
                    AbstractC1508t.e().k(f23852f, "Skipping scheduling " + workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String + " because it is no longer enqueued");
                    this.f23856d.setTransactionSuccessful();
                } else {
                    X2.h a10 = p.a(workSpec);
                    SystemIdInfo a11 = this.f23856d.i().a(a10);
                    int e10 = a11 != null ? a11.systemId : c1822m.e(this.f23857e.i(), this.f23857e.g());
                    if (a11 == null) {
                        this.f23856d.i().e(X2.g.a(a10, e10));
                    }
                    j(workSpec, e10);
                    this.f23856d.setTransactionSuccessful();
                }
            } finally {
                this.f23856d.endTransaction();
            }
        }
    }

    @Override // R2.InterfaceC1545v
    public boolean d() {
        return true;
    }

    public void j(WorkSpec workSpec, int i10) {
        JobInfo a10 = this.f23855c.a(workSpec, i10);
        AbstractC1508t e10 = AbstractC1508t.e();
        String str = f23852f;
        e10.a(str, "Scheduling work ID " + workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String + "Job ID " + i10);
        try {
            if (this.f23854b.schedule(a10) == 0) {
                AbstractC1508t.e().k(str, "Unable to schedule work ID " + workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == C.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    AbstractC1508t.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String));
                    j(workSpec, i10);
                }
            }
        } catch (IllegalStateException e11) {
            String a11 = d.a(this.f23853a, this.f23856d, this.f23857e);
            AbstractC1508t.e().c(f23852f, a11);
            IllegalStateException illegalStateException = new IllegalStateException(a11, e11);
            InterfaceC6772a l10 = this.f23857e.l();
            if (l10 == null) {
                throw illegalStateException;
            }
            l10.accept(illegalStateException);
        } catch (Throwable th2) {
            AbstractC1508t.e().d(f23852f, "Unable to schedule " + workSpec, th2);
        }
    }

    public m(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, k kVar) {
        this.f23853a = context;
        this.f23854b = jobScheduler;
        this.f23855c = kVar;
        this.f23856d = workDatabase;
        this.f23857e = aVar;
    }
}
