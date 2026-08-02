package n3;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import e3.i0;
import e3.m0;
import e3.x;
import f3.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import m3.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20825a = x.g("EnqueueRunnable");

    public static void a(f3.p pVar) {
        boolean z5;
        v vVar = pVar.f9406a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(pVar.f9410e);
        HashSet r02 = f3.p.r0(pVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(pVar.f9410e);
                z5 = false;
                break;
            } else if (r02.contains((String) it.next())) {
                z5 = true;
                break;
            }
        }
        if (z5) {
            throw new IllegalStateException("WorkContinuation has cycles (" + pVar + ")");
        }
        WorkDatabase workDatabase = vVar.f9428c;
        e3.c cVar = vVar.f9427b;
        workDatabase.b();
        try {
            j.b(workDatabase, cVar, pVar);
            boolean b10 = b(pVar);
            workDatabase.r();
            if (b10) {
                f3.j.b(cVar, vVar.f9428c, vVar.f9430e);
            }
        } finally {
            workDatabase.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(f3.p pVar) {
        boolean z5;
        boolean z7;
        boolean z10;
        List list;
        boolean z11;
        WorkDatabase workDatabase;
        boolean z12;
        Iterator it;
        boolean z13;
        boolean z14;
        HashSet r02 = f3.p.r0(pVar);
        v workManagerImpl = pVar.f9406a;
        List list2 = pVar.f9409d;
        String[] strArr = (String[]) r02.toArray(new String[0]);
        String name = pVar.f9407b;
        e3.o oVar = pVar.f9408c;
        workManagerImpl.f9427b.f8478d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = workManagerImpl.f9428c;
        boolean z15 = strArr != null && strArr.length > 0;
        if (z15) {
            z7 = false;
            z10 = false;
            z5 = true;
            for (String str : strArr) {
                m3.o c2 = workDatabase2.y().c(str);
                if (c2 == null) {
                    x.e().c(f20825a, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    break;
                }
                i0 i0Var = c2.f20332b;
                z5 &= i0Var == i0.f8526c;
                if (i0Var == i0.f8527d) {
                    z10 = true;
                } else if (i0Var == i0.f8529f) {
                    z7 = true;
                }
            }
        } else {
            z5 = true;
            z7 = false;
            z10 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(name);
        if (!isEmpty && !z15) {
            List d10 = workDatabase2.y().d(name);
            if (!d10.isEmpty()) {
                if (oVar != e3.o.f8553c && oVar != e3.o.f8554d) {
                    if (oVar == e3.o.f8552b) {
                        Iterator it2 = d10.iterator();
                        while (it2.hasNext()) {
                            i0 i0Var2 = ((m3.n) it2.next()).f20329b;
                            if (i0Var2 != i0.f8524a && i0Var2 != i0.f8525b) {
                            }
                            z14 = false;
                            z13 = true;
                        }
                    }
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
                    Intrinsics.checkNotNullExpressionValue(workDatabase2, "getWorkDatabase(...)");
                    workDatabase2.q(new b(workDatabase2, name, workManagerImpl, 0));
                    m3.s y5 = workDatabase2.y();
                    Iterator it3 = d10.iterator();
                    while (it3.hasNext()) {
                        y5.a(((m3.n) it3.next()).f20328a);
                    }
                    list = list2;
                    z11 = isEmpty;
                    workDatabase = workDatabase2;
                    z12 = true;
                    it = list.iterator();
                    boolean z16 = z12;
                    while (it.hasNext()) {
                    }
                    z13 = true;
                    z14 = z16;
                    pVar.f9412g = z13;
                    return z14;
                }
                m3.c t3 = workDatabase2.t();
                ArrayList arrayList = new ArrayList();
                Iterator it4 = d10.iterator();
                while (it4.hasNext()) {
                    m3.n nVar = (m3.n) it4.next();
                    List list3 = list2;
                    String id2 = nVar.f20328a;
                    t3.getClass();
                    boolean z17 = isEmpty;
                    Intrinsics.checkNotNullParameter(id2, "id");
                    WorkDatabase workDatabase3 = workDatabase2;
                    Iterator it5 = it4;
                    if (!((Boolean) f3.x.n0(t3.f20304a, true, false, new a2.k(id2, 7))).booleanValue()) {
                        i0 i0Var3 = nVar.f20329b;
                        boolean z18 = (i0Var3 == i0.f8526c) & z5;
                        if (i0Var3 == i0.f8527d) {
                            z10 = true;
                        } else if (i0Var3 == i0.f8529f) {
                            z7 = true;
                        }
                        arrayList.add(nVar.f20328a);
                        z5 = z18;
                    }
                    list2 = list3;
                    isEmpty = z17;
                    workDatabase2 = workDatabase3;
                    it4 = it5;
                }
                list = list2;
                z11 = isEmpty;
                workDatabase = workDatabase2;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (oVar == e3.o.f8554d && (z7 || z10)) {
                    m3.s y10 = workDatabase.y();
                    Iterator it6 = y10.d(name).iterator();
                    while (it6.hasNext()) {
                        y10.a(((m3.n) it6.next()).f20328a);
                    }
                    z7 = false;
                    z10 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z15 = strArr.length > 0;
                z12 = false;
                it = list.iterator();
                boolean z162 = z12;
                while (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    m3.o oVar2 = m0Var.f8546b;
                    UUID uuid = m0Var.f8545a;
                    if (!z15 || z5) {
                        oVar2.f20343n = currentTimeMillis;
                    } else if (z10) {
                        oVar2.f20332b = i0.f8527d;
                    } else if (z7) {
                        oVar2.f20332b = i0.f8529f;
                    } else {
                        oVar2.f20332b = i0.f8528e;
                    }
                    if (oVar2.f20332b == i0.f8524a) {
                        z162 = true;
                    }
                    m3.s y11 = workDatabase.y();
                    m3.o workSpec = j.c(workManagerImpl.f9430e, oVar2);
                    y11.getClass();
                    Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                    v vVar = workManagerImpl;
                    Iterator it7 = it;
                    f3.x.n0(y11.f20360a, false, true, new m3.q(y11, workSpec, 0));
                    if (z15) {
                        int i5 = 0;
                        for (int length = strArr.length; i5 < length; length = length) {
                            String str2 = strArr[i5];
                            String[] strArr2 = strArr;
                            String uuid2 = uuid.toString();
                            Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                            m3.a dependency = new m3.a(uuid2, str2);
                            m3.c t5 = workDatabase.t();
                            t5.getClass();
                            Intrinsics.checkNotNullParameter(dependency, "dependency");
                            f3.x.n0(t5.f20304a, false, true, new fg.d(5, t5, dependency));
                            i5++;
                            strArr = strArr2;
                        }
                    }
                    String[] strArr3 = strArr;
                    u z19 = workDatabase.z();
                    String uuid3 = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid3, "toString(...)");
                    z19.a(uuid3, m0Var.f8547c);
                    if (!z11) {
                        m3.l w10 = workDatabase.w();
                        String uuid4 = uuid.toString();
                        Intrinsics.checkNotNullExpressionValue(uuid4, "toString(...)");
                        m3.k workName = new m3.k(name, uuid4);
                        w10.getClass();
                        Intrinsics.checkNotNullParameter(workName, "workName");
                        f3.x.n0(w10.f20325a, false, true, new fg.d(8, w10, workName));
                    }
                    workManagerImpl = vVar;
                    it = it7;
                    strArr = strArr3;
                }
                z13 = true;
                z14 = z162;
                pVar.f9412g = z13;
                return z14;
            }
        }
        list = list2;
        z11 = isEmpty;
        workDatabase = workDatabase2;
        z12 = false;
        it = list.iterator();
        boolean z1622 = z12;
        while (it.hasNext()) {
        }
        z13 = true;
        z14 = z1622;
        pVar.f9412g = z13;
        return z14;
    }
}
