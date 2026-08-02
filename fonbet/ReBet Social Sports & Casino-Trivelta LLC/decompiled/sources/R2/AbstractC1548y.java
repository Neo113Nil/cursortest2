package R2;

import Q2.AbstractC1508t;
import Q2.InterfaceC1491b;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: R2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1548y {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10075a = AbstractC1508t.i("Schedulers");

    public static /* synthetic */ void b(List list, X2.h hVar, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1545v) it.next()).a(hVar.b());
        }
        f(aVar, workDatabase, list);
    }

    public static InterfaceC1545v c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        androidx.work.impl.background.systemjob.m mVar = new androidx.work.impl.background.systemjob.m(context, workDatabase, aVar);
        Y2.A.c(context, SystemJobService.class, true);
        AbstractC1508t.e().a(f10075a, "Created SystemJobScheduler and enabled SystemJobService");
        return mVar;
    }

    public static void d(androidx.work.impl.model.c cVar, InterfaceC1491b interfaceC1491b, List list) {
        if (list.size() > 0) {
            long a10 = interfaceC1491b.a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cVar.o(((WorkSpec) it.next()).com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String, a10);
            }
        }
    }

    public static void e(final List list, C1543t c1543t, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        c1543t.e(new InterfaceC1530f() { // from class: R2.w
            @Override // R2.InterfaceC1530f
            public final void c(X2.h hVar, boolean z10) {
                executor.execute(new Runnable() { // from class: R2.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1548y.b(r1, hVar, r3, r4);
                    }
                });
            }
        });
    }

    public static void f(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.c l10 = workDatabase.l();
        workDatabase.beginTransaction();
        try {
            List v10 = l10.v();
            d(l10, aVar.a(), v10);
            List r10 = l10.r(aVar.h());
            d(l10, aVar.a(), r10);
            if (v10 != null) {
                r10.addAll(v10);
            }
            List l11 = l10.l(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (r10.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) r10.toArray(new WorkSpec[r10.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1545v interfaceC1545v = (InterfaceC1545v) it.next();
                    if (interfaceC1545v.d()) {
                        interfaceC1545v.b(workSpecArr);
                    }
                }
            }
            if (l11.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) l11.toArray(new WorkSpec[l11.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1545v interfaceC1545v2 = (InterfaceC1545v) it2.next();
                    if (!interfaceC1545v2.d()) {
                        interfaceC1545v2.b(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}
