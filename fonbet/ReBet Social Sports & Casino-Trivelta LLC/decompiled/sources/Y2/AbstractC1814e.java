package Y2;

import Q2.AbstractC1508t;
import Q2.EnumC1497h;
import Q2.K;
import R2.AbstractC1548y;
import R2.Y;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: Y2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1814e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13951a = AbstractC1508t.i("EnqueueRunnable");

    public static boolean a(R2.G g10) {
        Y h10 = g10.h();
        WorkDatabase s10 = h10.s();
        s10.beginTransaction();
        try {
            AbstractC1815f.a(s10, h10.f(), g10);
            boolean e10 = e(g10);
            s10.setTransactionSuccessful();
            return e10;
        } finally {
            s10.endTransaction();
        }
    }

    public static void b(R2.G g10) {
        if (!g10.i()) {
            if (a(g10)) {
                f(g10);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + g10 + ")");
        }
    }

    public static boolean c(R2.G g10) {
        boolean d10 = d(g10.h(), g10.g(), (String[]) R2.G.m(g10).toArray(new String[0]), g10.e(), g10.c());
        g10.l();
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(Y y10, List list, String[] strArr, String str, EnumC1497h enumC1497h) {
        boolean z10;
        boolean z11;
        boolean z12;
        Y y11;
        WorkDatabase workDatabase;
        boolean z13;
        Iterator it;
        WorkDatabase workDatabase2;
        String[] strArr2 = strArr;
        long a10 = y10.f().a().a();
        WorkDatabase s10 = y10.s();
        boolean z14 = strArr2 != null && strArr2.length > 0;
        if (z14) {
            z10 = false;
            z11 = false;
            z12 = true;
            for (String str2 : strArr2) {
                WorkSpec i10 = s10.l().i(str2);
                if (i10 == null) {
                    AbstractC1508t.e().c(f13951a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                K.c cVar = i10.state;
                z12 &= cVar == K.c.SUCCEEDED;
                if (cVar == K.c.FAILED) {
                    z11 = true;
                } else if (cVar == K.c.CANCELLED) {
                    z10 = true;
                }
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z14) {
            List<WorkSpec.b> p10 = s10.l().p(str);
            if (!p10.isEmpty()) {
                if (enumC1497h != EnumC1497h.APPEND && enumC1497h != EnumC1497h.APPEND_OR_REPLACE) {
                    if (enumC1497h == EnumC1497h.KEEP) {
                        Iterator it2 = p10.iterator();
                        while (it2.hasNext()) {
                            K.c cVar2 = ((WorkSpec.b) it2.next()).f23959b;
                            if (cVar2 == K.c.ENQUEUED || cVar2 == K.c.RUNNING) {
                                return false;
                            }
                        }
                    }
                    y11 = y10;
                    AbstractC1813d.f(str, y11);
                    androidx.work.impl.model.c l10 = s10.l();
                    Iterator it3 = p10.iterator();
                    while (it3.hasNext()) {
                        l10.a(((WorkSpec.b) it3.next()).f23958a);
                    }
                    workDatabase = s10;
                    z13 = true;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return z13;
                }
                y11 = y10;
                X2.a g10 = s10.g();
                List arrayList = new ArrayList();
                for (WorkSpec.b bVar : p10) {
                    if (g10.d(bVar.f23958a)) {
                        workDatabase2 = s10;
                    } else {
                        K.c cVar3 = bVar.f23959b;
                        workDatabase2 = s10;
                        boolean z15 = (cVar3 == K.c.SUCCEEDED) & z12;
                        if (cVar3 == K.c.FAILED) {
                            z11 = true;
                        } else if (cVar3 == K.c.CANCELLED) {
                            z10 = true;
                        }
                        arrayList.add(bVar.f23958a);
                        z12 = z15;
                    }
                    s10 = workDatabase2;
                }
                workDatabase = s10;
                if (enumC1497h == EnumC1497h.APPEND_OR_REPLACE && (z10 || z11)) {
                    androidx.work.impl.model.c l11 = workDatabase.l();
                    Iterator it4 = l11.p(str).iterator();
                    while (it4.hasNext()) {
                        l11.a(((WorkSpec.b) it4.next()).f23958a);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z10 = false;
                    z11 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z14 = strArr2.length > 0;
                z13 = false;
                it = list.iterator();
                while (it.hasNext()) {
                    Q2.M m10 = (Q2.M) it.next();
                    WorkSpec d10 = m10.d();
                    if (!z14 || z12) {
                        d10.lastEnqueueTime = a10;
                    } else if (z11) {
                        d10.state = K.c.FAILED;
                    } else if (z10) {
                        d10.state = K.c.CANCELLED;
                    } else {
                        d10.state = K.c.BLOCKED;
                    }
                    if (d10.state == K.c.ENQUEUED) {
                        z13 = true;
                    }
                    workDatabase.l().e(AbstractC1815f.d(y11.q(), d10));
                    if (z14) {
                        int length = strArr2.length;
                        int i11 = 0;
                        while (i11 < length) {
                            workDatabase.g().a(new Dependency(m10.b(), strArr2[i11]));
                            i11++;
                            it = it;
                            strArr2 = strArr2;
                        }
                    }
                    String[] strArr3 = strArr2;
                    Iterator it5 = it;
                    workDatabase.m().c(m10.b(), m10.c());
                    if (!isEmpty) {
                        workDatabase.j().a(new WorkName(str, m10.b()));
                    }
                    it = it5;
                    strArr2 = strArr3;
                }
                return z13;
            }
        }
        y11 = y10;
        workDatabase = s10;
        z13 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        return z13;
    }

    public static boolean e(R2.G g10) {
        List<R2.G> f10 = g10.f();
        boolean z10 = false;
        if (f10 != null) {
            for (R2.G g11 : f10) {
                if (g11.k()) {
                    AbstractC1508t.e().k(f13951a, "Already enqueued work ids (" + TextUtils.join(", ", g11.d()) + ")");
                } else {
                    z10 |= e(g11);
                }
            }
        }
        return c(g10) | z10;
    }

    public static void f(R2.G g10) {
        Y h10 = g10.h();
        AbstractC1548y.f(h10.f(), h10.s(), h10.q());
    }
}
