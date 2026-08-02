package h5;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.r;
import androidx.work.v;
import g5.C6627B;
import g5.C6628a;
import g5.C6644q;
import g5.InterfaceC6629b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC6807e implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final String f64974c = androidx.work.o.i("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.v f64975a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.n f64976b;

    public RunnableC6807e(@NonNull androidx.work.impl.v vVar, @NonNull androidx.work.impl.n nVar) {
        this.f64975a = vVar;
        this.f64976b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean b(@NonNull androidx.work.impl.v vVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        androidx.work.impl.C c11;
        List<? extends androidx.work.x> list;
        boolean z14;
        boolean z15;
        List<? extends androidx.work.x> list2;
        vVar.getClass();
        HashSet A11 = androidx.work.impl.v.A(vVar);
        androidx.work.impl.C x11 = vVar.x();
        List<? extends androidx.work.x> w11 = vVar.w();
        String[] strArr = (String[]) A11.toArray(new String[0]);
        String v11 = vVar.v();
        androidx.work.g u11 = vVar.u();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase n11 = x11.n();
        boolean z16 = strArr != null && strArr.length > 0;
        if (z16) {
            z12 = false;
            z13 = false;
            z11 = true;
            for (String str : strArr) {
                C6627B m11 = n11.f().m(str);
                if (m11 == null) {
                    androidx.work.o.e().c(f64974c, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    break;
                }
                v.a aVar = m11.f63800b;
                z11 &= aVar == v.a.SUCCEEDED;
                if (aVar == v.a.FAILED) {
                    z13 = true;
                } else if (aVar == v.a.CANCELLED) {
                    z12 = true;
                }
            }
        } else {
            z11 = true;
            z12 = false;
            z13 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(v11);
        if (!isEmpty && !z16) {
            ArrayList p11 = n11.f().p(v11);
            if (!p11.isEmpty()) {
                if (u11 != androidx.work.g.APPEND && u11 != androidx.work.g.APPEND_OR_REPLACE) {
                    if (u11 == androidx.work.g.KEEP) {
                        Iterator it = p11.iterator();
                        while (it.hasNext()) {
                            v.a aVar2 = ((C6627B.a) it.next()).f63820b;
                            if (aVar2 != v.a.ENQUEUED && aVar2 != v.a.RUNNING) {
                            }
                            z15 = false;
                        }
                    }
                    new C6805c(x11, v11, false).run();
                    g5.C f7 = n11.f();
                    Iterator it2 = p11.iterator();
                    while (it2.hasNext()) {
                        f7.delete(((C6627B.a) it2.next()).f63819a);
                    }
                    c11 = x11;
                    list = w11;
                    z14 = true;
                    while (r2.hasNext()) {
                    }
                    z15 = z14;
                    vVar.z();
                    return z15;
                }
                InterfaceC6629b a11 = n11.a();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = p11.iterator();
                while (it3.hasNext()) {
                    C6627B.a aVar3 = (C6627B.a) it3.next();
                    androidx.work.impl.C c12 = x11;
                    if (a11.d(aVar3.f63819a)) {
                        list2 = w11;
                    } else {
                        v.a aVar4 = v.a.SUCCEEDED;
                        list2 = w11;
                        v.a aVar5 = aVar3.f63820b;
                        boolean z17 = (aVar5 == aVar4) & z11;
                        if (aVar5 == v.a.FAILED) {
                            z13 = true;
                        } else if (aVar5 == v.a.CANCELLED) {
                            z12 = true;
                        }
                        arrayList.add(aVar3.f63819a);
                        z11 = z17;
                    }
                    x11 = c12;
                    w11 = list2;
                }
                c11 = x11;
                list = w11;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (u11 == androidx.work.g.APPEND_OR_REPLACE && (z12 || z13)) {
                    g5.C f11 = n11.f();
                    Iterator it4 = f11.p(v11).iterator();
                    while (it4.hasNext()) {
                        f11.delete(((C6627B.a) it4.next()).f63819a);
                    }
                    z12 = false;
                    z13 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z16 = strArr.length > 0;
                z14 = false;
                for (androidx.work.x xVar : list) {
                    C6627B workSpec = xVar.c();
                    if (!z16 || z11) {
                        workSpec.f63812n = currentTimeMillis;
                    } else if (z13) {
                        workSpec.f63800b = v.a.FAILED;
                    } else if (z12) {
                        workSpec.f63800b = v.a.CANCELLED;
                    } else {
                        workSpec.f63800b = v.a.BLOCKED;
                    }
                    if (workSpec.f63800b == v.a.ENQUEUED) {
                        z14 = true;
                    }
                    g5.C f12 = n11.f();
                    List<androidx.work.impl.r> schedulers = c11.l();
                    boolean z18 = z14;
                    Intrinsics.checkNotNullParameter(schedulers, "schedulers");
                    Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                    f12.b(workSpec);
                    if (z16) {
                        int length = strArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            n11.a().a(new C6628a(xVar.a(), strArr[i11]));
                            i11++;
                            strArr = strArr;
                        }
                    }
                    String[] strArr2 = strArr;
                    n11.g().b(xVar.a(), xVar.b());
                    if (!isEmpty) {
                        n11.d().a(new C6644q(v11, xVar.a()));
                    }
                    z14 = z18;
                    strArr = strArr2;
                }
                z15 = z14;
                vVar.z();
                return z15;
            }
        }
        c11 = x11;
        list = w11;
        z14 = false;
        while (r2.hasNext()) {
        }
        z15 = z14;
        vVar.z();
        return z15;
    }

    @NonNull
    public final androidx.work.impl.n a() {
        return this.f64976b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.n nVar = this.f64976b;
        androidx.work.impl.v vVar = this.f64975a;
        try {
            if (vVar.y()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + vVar + ")");
            }
            WorkDatabase n11 = vVar.x().n();
            n11.beginTransaction();
            try {
                boolean b11 = b(vVar);
                n11.setTransactionSuccessful();
                if (b11) {
                    l.a(vVar.x().g(), RescheduleReceiver.class, true);
                    androidx.work.impl.C x11 = vVar.x();
                    androidx.work.impl.s.b(x11.h(), x11.n(), x11.l());
                }
                nVar.a(androidx.work.r.f45549a);
            } finally {
                n11.endTransaction();
            }
        } catch (Throwable th2) {
            nVar.a(new r.a.C0824a(th2));
        }
    }
}
