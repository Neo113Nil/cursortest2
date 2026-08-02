package f3;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9376a = e3.x.g("Schedulers");

    public static void a(m3.s sVar, e3.l lVar, List list) {
        if (list.size() > 0) {
            lVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sVar.e(currentTimeMillis, ((m3.o) it.next()).f20331a);
            }
        }
    }

    public static void b(e3.c cVar, WorkDatabase workDatabase, List list) {
        List list2;
        if (list == null || list.size() == 0) {
            return;
        }
        m3.s y5 = workDatabase.y();
        workDatabase.b();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                list2 = (List) x.n0(y5.f20360a, true, false, new k2.d0(7));
                a(y5, cVar.f8478d, list2);
            } else {
                list2 = null;
            }
            List list3 = (List) x.n0(y5.f20360a, true, false, new eb.b(cVar.f8487n, 7));
            a(y5, cVar.f8478d, list3);
            if (list2 != null) {
                list3.addAll(list2);
            }
            List list4 = (List) x.n0(y5.f20360a, true, false, new k2.d0(10));
            workDatabase.r();
            workDatabase.f();
            if (list3.size() > 0) {
                m3.o[] oVarArr = (m3.o[]) list3.toArray(new m3.o[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.c()) {
                        hVar.e(oVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                m3.o[] oVarArr2 = (m3.o[]) list4.toArray(new m3.o[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.c()) {
                        hVar2.e(oVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
