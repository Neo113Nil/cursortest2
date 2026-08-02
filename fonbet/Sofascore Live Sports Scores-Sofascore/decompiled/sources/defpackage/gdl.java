package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gdl {
    public final lcl a;
    public final Context b;
    public final String c;
    public final l2a d;
    public final zbl e;
    public final ti3 f;
    public final g8f g;
    public final WorkDatabase h;
    public final qcl i;
    public final tx4 j;
    public final ArrayList k;
    public final aea l;

    public gdl(ng2 ng2Var) {
        lcl lclVar = (lcl) ng2Var.e;
        this.a = lclVar;
        this.b = (Context) ng2Var.g;
        this.c = lclVar.a;
        this.d = (l2a) ng2Var.h;
        this.e = (zbl) ng2Var.b;
        this.f = (ti3) ng2Var.a;
        this.g = (g8f) ng2Var.c;
        WorkDatabase workDatabase = (WorkDatabase) ng2Var.d;
        this.h = workDatabase;
        this.i = workDatabase.g();
        this.j = workDatabase.b();
        ArrayList arrayList = (ArrayList) ng2Var.f;
        this.k = arrayList;
        CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
        this.l = bea.a();
    }

    public final void a(int i) {
        sbl sblVar = sbl.a;
        qcl qclVar = this.i;
        String str = this.c;
        qclVar.j(sblVar, str);
        qclVar.i(System.currentTimeMillis(), str);
        qclVar.h(this.a.v, str);
        qclVar.g(-1L, str);
        qclVar.k(i, str);
    }

    public final void b() {
        long currentTimeMillis = System.currentTimeMillis();
        qcl qclVar = this.i;
        String str = this.c;
        qclVar.i(currentTimeMillis, str);
        qclVar.j(sbl.a, str);
        k6g k6gVar = qclVar.a;
        ((Number) gz8.S(k6gVar, false, true, new cfi(str, 14))).intValue();
        qclVar.h(this.a.v, str);
        gz8.S(k6gVar, false, true, new cfi(str, 15));
        qclVar.g(-1L, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        edl edlVar;
        int i;
        OverwritingInputMerger overwritingInputMerger;
        md4 l;
        ti3 ti3Var = this.f;
        ucl uclVar = ti3Var.e;
        try {
            if (sq3Var instanceof edl) {
                edlVar = (edl) sq3Var;
                int i2 = edlVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    edlVar.t = i2 - Integer.MIN_VALUE;
                    edl edlVar2 = edlVar;
                    Object obj = edlVar2.r;
                    lu3 lu3Var = lu3.a;
                    i = edlVar2.t;
                    if (i != 0) {
                        y6a.M(obj);
                        boolean M = h5a.M();
                        lcl lclVar = this.a;
                        String str = lclVar.x;
                        if (M && str != null) {
                            int hashCode = lclVar.hashCode();
                            if (Build.VERSION.SDK_INT >= 29) {
                                yrj.a(h5a.U(str), hashCode);
                            } else {
                                String U = h5a.U(str);
                                try {
                                    Method method = h5a.g;
                                    if (method == null) {
                                        method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                        h5a.g = method;
                                    }
                                    method.invoke(null, Long.valueOf(h5a.e), U, Integer.valueOf(hashCode));
                                } catch (Exception e) {
                                    h5a.L(e);
                                }
                            }
                        }
                        final int i3 = 0;
                        Callable callable = new Callable(this) { // from class: ycl
                            public final /* synthetic */ gdl b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i4 = i3;
                                gdl gdlVar = this.b;
                                switch (i4) {
                                    case 0:
                                        lcl lclVar2 = gdlVar.a;
                                        sbl sblVar = lclVar2.b;
                                        sbl sblVar2 = sbl.a;
                                        if (sblVar != sblVar2) {
                                            int i5 = hdl.a;
                                            rik.o().getClass();
                                            return Boolean.TRUE;
                                        }
                                        if ((!lclVar2.c() && (lclVar2.b != sblVar2 || lclVar2.k <= 0)) || System.currentTimeMillis() >= lclVar2.a()) {
                                            return Boolean.FALSE;
                                        }
                                        rik o = rik.o();
                                        int i6 = hdl.a;
                                        o.getClass();
                                        return Boolean.TRUE;
                                    default:
                                        qcl qclVar = gdlVar.i;
                                        String str2 = gdlVar.c;
                                        boolean z = false;
                                        if (qclVar.d(str2) == sbl.a) {
                                            qclVar.j(sbl.b, str2);
                                            ((Number) gz8.S(qclVar.a, false, true, new cfi(str2, 17))).intValue();
                                            qclVar.k(-256, str2);
                                            z = true;
                                        }
                                        return Boolean.valueOf(z);
                                }
                            }
                        };
                        WorkDatabase workDatabase = this.h;
                        if (((Boolean) workDatabase.runInTransaction(callable)).booleanValue()) {
                            return new bdl();
                        }
                        boolean c = lclVar.c();
                        String str2 = this.c;
                        if (c) {
                            l = lclVar.e;
                        } else {
                            String str3 = lclVar.d;
                            str3.getClass();
                            int i4 = e4a.a;
                            try {
                                Object newInstance = Class.forName(str3).getDeclaredConstructor(null).newInstance(null);
                                newInstance.getClass();
                                overwritingInputMerger = (OverwritingInputMerger) newInstance;
                            } catch (Exception unused) {
                                rik.o().getClass();
                                overwritingInputMerger = null;
                            }
                            if (overwritingInputMerger == null) {
                                int i5 = hdl.a;
                                rik.o().getClass();
                                return new zcl();
                            }
                            List c2 = a.c(lclVar.e);
                            qcl qclVar = this.i;
                            qclVar.getClass();
                            str2.getClass();
                            ArrayList w0 = CollectionsKt.w0((List) gz8.S(qclVar.a, true, false, new cfi(str2, 16)), c2);
                            hpo hpoVar = new hpo(18);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it = w0.iterator();
                            while (it.hasNext()) {
                                Map unmodifiableMap = Collections.unmodifiableMap(((md4) it.next()).a);
                                unmodifiableMap.getClass();
                                linkedHashMap.putAll(unmodifiableMap);
                            }
                            hpoVar.C(linkedHashMap);
                            l = hpoVar.l();
                        }
                        UUID fromString = UUID.fromString(str2);
                        int i6 = lclVar.k;
                        ExecutorService executorService = ti3Var.a;
                        hs4 hs4Var = ti3Var.b;
                        zbl zblVar = this.e;
                        fcl fclVar = new fcl(workDatabase, zblVar);
                        pbl pblVar = new pbl(workDatabase, this.g, zblVar);
                        WorkerParameters workerParameters = new WorkerParameters();
                        workerParameters.a = fromString;
                        workerParameters.b = l;
                        workerParameters.c = new HashSet(this.k);
                        workerParameters.d = this.d;
                        workerParameters.e = i6;
                        workerParameters.f = executorService;
                        workerParameters.g = hs4Var;
                        workerParameters.h = zblVar;
                        workerParameters.i = uclVar;
                        workerParameters.j = fclVar;
                        workerParameters.k = pblVar;
                        try {
                            kdb b = uclVar.b(this.b, lclVar.c, workerParameters);
                            b.setUsed();
                            CoroutineContext.Element element = edlVar2.getContext().get(uic.g);
                            element.getClass();
                            yda ydaVar = (yda) element;
                            ydaVar.n(new c30(b, M, str, this, 7));
                            final int i7 = 1;
                            Object runInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(this) { // from class: ycl
                                public final /* synthetic */ gdl b;

                                {
                                    this.b = this;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i42 = i7;
                                    gdl gdlVar = this.b;
                                    switch (i42) {
                                        case 0:
                                            lcl lclVar2 = gdlVar.a;
                                            sbl sblVar = lclVar2.b;
                                            sbl sblVar2 = sbl.a;
                                            if (sblVar != sblVar2) {
                                                int i52 = hdl.a;
                                                rik.o().getClass();
                                                return Boolean.TRUE;
                                            }
                                            if ((!lclVar2.c() && (lclVar2.b != sblVar2 || lclVar2.k <= 0)) || System.currentTimeMillis() >= lclVar2.a()) {
                                                return Boolean.FALSE;
                                            }
                                            rik o = rik.o();
                                            int i62 = hdl.a;
                                            o.getClass();
                                            return Boolean.TRUE;
                                        default:
                                            qcl qclVar2 = gdlVar.i;
                                            String str22 = gdlVar.c;
                                            boolean z = false;
                                            if (qclVar2.d(str22) == sbl.a) {
                                                qclVar2.j(sbl.b, str22);
                                                ((Number) gz8.S(qclVar2.a, false, true, new cfi(str22, 17))).intValue();
                                                qclVar2.k(-256, str22);
                                                z = true;
                                            }
                                            return Boolean.valueOf(z);
                                    }
                                }
                            });
                            runInTransaction.getClass();
                            if (!((Boolean) runInTransaction).booleanValue()) {
                                return new bdl();
                            }
                            if (ydaVar.isCancelled()) {
                                return new bdl();
                            }
                            wog wogVar = zblVar.d;
                            wogVar.getClass();
                            au3 P = fz8.P(wogVar);
                            fdl fdlVar = new fdl(this, b, pblVar, null, 0);
                            edlVar2.t = 1;
                            obj = xw3.R(P, fdlVar, edlVar2);
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                        } catch (Throwable unused2) {
                            int i8 = hdl.a;
                            rik.o().getClass();
                            return new zcl();
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    jdb jdbVar = (jdb) obj;
                    jdbVar.getClass();
                    return new adl(jdbVar);
                }
            }
            if (i != 0) {
            }
            jdb jdbVar2 = (jdb) obj;
            jdbVar2.getClass();
            return new adl(jdbVar2);
        } catch (CancellationException e2) {
            int i9 = hdl.a;
            rik.o().getClass();
            throw e2;
        } catch (Throwable unused3) {
            int i10 = hdl.a;
            rik.o().getClass();
            return new zcl();
        }
        edlVar = new edl(this, sq3Var);
        edl edlVar22 = edlVar;
        Object obj2 = edlVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = edlVar22.t;
    }

    public final void d(jdb jdbVar) {
        String str = this.c;
        ArrayList l = b.l(str);
        while (true) {
            boolean isEmpty = l.isEmpty();
            qcl qclVar = this.i;
            if (isEmpty) {
                md4 md4Var = ((gdb) jdbVar).a;
                md4Var.getClass();
                qclVar.h(this.a.v, str);
                gz8.S(qclVar.a, false, true, new bcl(4, md4Var, str));
                return;
            }
            String str2 = (String) o13.D(l);
            if (qclVar.d(str2) != sbl.f) {
                qclVar.j(sbl.d, str2);
            }
            l.addAll(this.j.a(str2));
        }
    }
}
