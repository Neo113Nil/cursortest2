package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ssg {
    public static final /* synthetic */ int a = 0;

    static {
        rik.x("Schedulers");
    }

    public static void a(qcl qclVar, bgf bgfVar, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qclVar.g(currentTimeMillis, ((lcl) it.next()).a);
            }
        }
    }

    public static void b(ti3 ti3Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        qcl g = workDatabase.g();
        workDatabase.beginTransaction();
        try {
            k6g k6gVar = g.a;
            k6g k6gVar2 = g.a;
            List list2 = (List) gz8.S(k6gVar, true, false, new nxk(29));
            a(g, ti3Var.d, list2);
            List list3 = (List) gz8.S(k6gVar2, true, false, new nxk(26));
            a(g, ti3Var.d, list3);
            list3.addAll(list2);
            List list4 = (List) gz8.S(k6gVar2, true, false, new pcl(2));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (list3.size() > 0) {
                lcl[] lclVarArr = (lcl[]) list3.toArray(new lcl[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hsg hsgVar = (hsg) it.next();
                    if (hsgVar.e()) {
                        hsgVar.c(lclVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                lcl[] lclVarArr2 = (lcl[]) list4.toArray(new lcl[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    hsg hsgVar2 = (hsg) it2.next();
                    if (!hsgVar2.e()) {
                        hsgVar2.c(lclVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
