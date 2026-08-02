package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class no5 {
    static {
        rik.x("EnqueueRunnable");
    }

    public static void a(lbl lblVar) {
        boolean z;
        xbl xblVar = lblVar.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(lblVar.e);
        HashSet b = lbl.b(lblVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(lblVar.e);
                z = false;
                break;
            } else if (b.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            ilg.f(lblVar, ")", "WorkContinuation has cycles (");
            return;
        }
        WorkDatabase workDatabase = xblVar.c;
        ti3 ti3Var = xblVar.b;
        workDatabase.beginTransaction();
        try {
            xw3.w(workDatabase, ti3Var, lblVar);
            boolean b2 = b(lblVar);
            workDatabase.setTransactionSuccessful();
            if (b2) {
                ssg.b(ti3Var, xblVar.c, xblVar.e);
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(lbl lblVar) {
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        Iterator it;
        boolean z6;
        boolean z7;
        HashSet b = lbl.b(lblVar);
        xbl xblVar = lblVar.a;
        List list2 = lblVar.d;
        String[] strArr = (String[]) b.toArray(new String[0]);
        String str = lblVar.b;
        nf6 nf6Var = lblVar.c;
        bgf bgfVar = xblVar.b.d;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = xblVar.c;
        boolean z8 = strArr != null && strArr.length > 0;
        if (z8) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str2 : strArr) {
                lcl e = workDatabase2.g().e(str2);
                if (e == null) {
                    rik.o().getClass();
                    break;
                }
                sbl sblVar = e.b;
                z &= sblVar == sbl.c;
                if (sblVar == sbl.d) {
                    z3 = true;
                } else if (sblVar == sbl.f) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z8) {
            List f = workDatabase2.g().f(str);
            if (!f.isEmpty()) {
                if (nf6Var != nf6.c && nf6Var != nf6.d) {
                    if (nf6Var == nf6.b) {
                        Iterator it2 = f.iterator();
                        while (it2.hasNext()) {
                            sbl sblVar2 = ((jcl) it2.next()).b;
                            if (sblVar2 != sbl.a && sblVar2 != sbl.b) {
                            }
                            z6 = true;
                            z7 = false;
                        }
                    }
                    workDatabase2.getClass();
                    workDatabase2.runInTransaction(new p3(8, workDatabase2, str, xblVar));
                    qcl g = workDatabase2.g();
                    Iterator it3 = f.iterator();
                    while (it3.hasNext()) {
                        g.c(((jcl) it3.next()).a);
                    }
                    list = list2;
                    z4 = isEmpty;
                    workDatabase = workDatabase2;
                    z5 = true;
                    it = list.iterator();
                    boolean z9 = z5;
                    while (it.hasNext()) {
                    }
                    z6 = true;
                    z7 = z9;
                    lblVar.g = z6;
                    return z7;
                }
                tx4 b2 = workDatabase2.b();
                ArrayList arrayList = new ArrayList();
                Iterator it4 = f.iterator();
                while (it4.hasNext()) {
                    jcl jclVar = (jcl) it4.next();
                    List list3 = list2;
                    String str3 = jclVar.a;
                    b2.getClass();
                    str3.getClass();
                    boolean z10 = isEmpty;
                    WorkDatabase workDatabase3 = workDatabase2;
                    Iterator it5 = it4;
                    if (!((Boolean) gz8.S(b2.a, true, false, new jp1(str3, 9))).booleanValue()) {
                        sbl sblVar3 = jclVar.b;
                        boolean z11 = (sblVar3 == sbl.c) & z;
                        if (sblVar3 == sbl.d) {
                            z3 = true;
                        } else if (sblVar3 == sbl.f) {
                            z2 = true;
                        }
                        arrayList.add(jclVar.a);
                        z = z11;
                    }
                    list2 = list3;
                    isEmpty = z10;
                    workDatabase2 = workDatabase3;
                    it4 = it5;
                }
                list = list2;
                z4 = isEmpty;
                workDatabase = workDatabase2;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (nf6Var == nf6.d && (z2 || z3)) {
                    qcl g2 = workDatabase.g();
                    Iterator it6 = g2.f(str).iterator();
                    while (it6.hasNext()) {
                        g2.c(((jcl) it6.next()).a);
                    }
                    z2 = false;
                    z3 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z8 = strArr.length > 0;
                z5 = false;
                it = list.iterator();
                boolean z92 = z5;
                while (it.hasNext()) {
                    icl iclVar = (icl) it.next();
                    lcl lclVar = iclVar.b;
                    UUID uuid = iclVar.a;
                    if (!z8 || z) {
                        lclVar.n = currentTimeMillis;
                    } else if (z3) {
                        lclVar.b = sbl.d;
                    } else if (z2) {
                        lclVar.b = sbl.f;
                    } else {
                        lclVar.b = sbl.e;
                    }
                    if (lclVar.b == sbl.a) {
                        z92 = true;
                    }
                    qcl g3 = workDatabase.g();
                    lcl S = xw3.S(xblVar.e, lclVar);
                    g3.getClass();
                    xbl xblVar2 = xblVar;
                    Iterator it7 = it;
                    gz8.S(g3.a, false, true, new ncl(g3, S, 0));
                    if (z8) {
                        int i = 0;
                        for (int length = strArr.length; i < length; length = length) {
                            String str4 = strArr[i];
                            String uuid2 = uuid.toString();
                            uuid2.getClass();
                            px4 px4Var = new px4(uuid2, str4);
                            tx4 b3 = workDatabase.b();
                            b3.getClass();
                            gz8.S(b3.a, false, true, new r82(13, b3, px4Var));
                            i++;
                            strArr = strArr;
                        }
                    }
                    String[] strArr2 = strArr;
                    scl h = workDatabase.h();
                    String uuid3 = uuid.toString();
                    uuid3.getClass();
                    h.a(uuid3, iclVar.c);
                    if (!z4) {
                        ccl e2 = workDatabase.e();
                        String uuid4 = uuid.toString();
                        uuid4.getClass();
                        acl aclVar = new acl(str, uuid4);
                        e2.getClass();
                        gz8.S(e2.a, false, true, new bcl(0, e2, aclVar));
                    }
                    xblVar = xblVar2;
                    it = it7;
                    strArr = strArr2;
                }
                z6 = true;
                z7 = z92;
                lblVar.g = z6;
                return z7;
            }
        }
        list = list2;
        z4 = isEmpty;
        workDatabase = workDatabase2;
        z5 = false;
        it = list.iterator();
        boolean z922 = z5;
        while (it.hasNext()) {
        }
        z6 = true;
        z7 = z922;
        lblVar.g = z6;
        return z7;
    }
}
