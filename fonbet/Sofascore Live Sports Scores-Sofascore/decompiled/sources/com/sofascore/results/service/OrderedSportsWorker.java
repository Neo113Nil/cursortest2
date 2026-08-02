package com.sofascore.results.service;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.newNetwork.CountrySport;
import com.sofascore.results.helper.SofaBackupAgent;
import defpackage.a5f;
import defpackage.a70;
import defpackage.aik;
import defpackage.bwd;
import defpackage.cwd;
import defpackage.dmi;
import defpackage.fsf;
import defpackage.gdb;
import defpackage.gz8;
import defpackage.gzh;
import defpackage.hc9;
import defpackage.jdb;
import defpackage.k13;
import defpackage.ke0;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.uic;
import defpackage.wpb;
import defpackage.xbb;
import defpackage.y6a;
import defpackage.z1h;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/results/service/OrderedSportsWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lgzh;", "sportOrderRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgzh;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderedSportsWorker extends AbstractRetryCoroutineWorker {
    public final gzh b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedSportsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull gzh gzhVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        gzhVar.getClass();
        this.b = gzhVar;
        this.c = 2;
    }

    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    public final Object a(rq3 rq3Var) {
        String e = getInputData().e("PREFERRED_FIRST_SPORT");
        return e != null ? d(e, (sq3) rq3Var) : c((sq3) rq3Var);
    }

    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /* renamed from: b, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        if (r5.c(r11, r0) != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0053, code lost:
    
        if (r12 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed A[LOOP:1: B:34:0x00e7->B:36:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        bwd bwdVar;
        int i;
        List list;
        fsf fsfVar;
        List list2;
        fsf fsfVar2;
        CharSequence charSequence;
        Iterator it;
        Iterator it2;
        if (sq3Var instanceof bwd) {
            bwdVar = (bwd) sq3Var;
            int i2 = bwdVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bwdVar.w = i2 - Integer.MIN_VALUE;
                Object obj = bwdVar.u;
                lu3 lu3Var = lu3.a;
                i = bwdVar.w;
                int i3 = 0;
                gzh gzhVar = this.b;
                if (i != 0) {
                    y6a.M(obj);
                    bwdVar.w = 1;
                    obj = gzhVar.a(bwdVar);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        return jdb.a();
                    }
                    fsfVar = bwdVar.t;
                    fsfVar2 = bwdVar.s;
                    list2 = bwdVar.r;
                    y6a.M(obj);
                    fsfVar.a = obj;
                    charSequence = (CharSequence) fsfVar2.a;
                    if (charSequence != null || charSequence.length() == 0) {
                        Calendar calendar = ke0.a;
                        Context applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        fsfVar2.a = ke0.b(applicationContext);
                    }
                    List<String> entries = Sports.INSTANCE.getEntries();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (entries.contains(((CountrySport) obj2).getSport().getSlug())) {
                            arrayList.add(obj2);
                        }
                    }
                    List H0 = CollectionsKt.H0(arrayList, new wpb(10));
                    ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                    it = H0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((CountrySport) it.next()).getSport().getSlug());
                    }
                    Map map = SofaBackupAgent.b;
                    aik.h0();
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            b.q();
                            throw null;
                        }
                        String str = (String) next;
                        arrayList3.add(new DbSportOrder(str, i3, Intrinsics.c(str, fsfVar2.a)));
                        i3 = i4;
                    }
                    bwdVar.r = null;
                    bwdVar.s = null;
                    bwdVar.t = null;
                    bwdVar.w = 3;
                }
                list = (List) obj;
                if (list != null) {
                    return new gdb();
                }
                fsfVar = new fsf();
                bwdVar.r = list;
                bwdVar.s = fsfVar;
                bwdVar.t = fsfVar;
                bwdVar.w = 2;
                Object U = gz8.U(bwdVar, gzhVar.a.a, true, false, new z1h(22));
                if (U != lu3Var) {
                    list2 = list;
                    obj = U;
                    fsfVar2 = fsfVar;
                    fsfVar.a = obj;
                    charSequence = (CharSequence) fsfVar2.a;
                    if (charSequence != null) {
                    }
                    Calendar calendar2 = ke0.a;
                    Context applicationContext2 = getApplicationContext();
                    applicationContext2.getClass();
                    fsfVar2.a = ke0.b(applicationContext2);
                    List<String> entries2 = Sports.INSTANCE.getEntries();
                    ArrayList arrayList4 = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    List H02 = CollectionsKt.H0(arrayList4, new wpb(10));
                    ArrayList arrayList22 = new ArrayList(k13.r(H02, 10));
                    it = H02.iterator();
                    while (it.hasNext()) {
                    }
                    Map map2 = SofaBackupAgent.b;
                    aik.h0();
                    ArrayList arrayList32 = new ArrayList(k13.r(arrayList22, 10));
                    it2 = arrayList22.iterator();
                    while (it2.hasNext()) {
                    }
                    bwdVar.r = null;
                    bwdVar.s = null;
                    bwdVar.t = null;
                    bwdVar.w = 3;
                }
                return lu3Var;
            }
        }
        bwdVar = new bwd(this, sq3Var);
        Object obj3 = bwdVar.u;
        lu3 lu3Var2 = lu3.a;
        i = bwdVar.w;
        int i32 = 0;
        gzh gzhVar2 = this.b;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0110, code lost:
    
        if (r14.c(r2, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0045, code lost:
    
        if (r14 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, sq3 sq3Var) {
        cwd cwdVar;
        int i;
        List list;
        SharedPreferences d;
        if (sq3Var instanceof cwd) {
            cwdVar = (cwd) sq3Var;
            int i2 = cwdVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cwdVar.u = i2 - Integer.MIN_VALUE;
                Object obj = cwdVar.s;
                lu3 lu3Var = lu3.a;
                i = cwdVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    gzh gzhVar = this.b;
                    cwdVar.r = str;
                    cwdVar.u = 1;
                    obj = gzhVar.a(cwdVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Context applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext2);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "UserHasCustomizedSportOrder", true);
                        Unit unit = Unit.a;
                        i3.apply();
                        Map map = SofaBackupAgent.b;
                        aik.h0();
                        return jdb.a();
                    }
                    str = cwdVar.r;
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list != null) {
                    return new gdb();
                }
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CountrySport) it.next()).getSport().getSlug());
                }
                Iterator it2 = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object next = it2.next();
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    String str2 = (String) next;
                    str2.getClass();
                    if (str2.equals(str)) {
                        break;
                    }
                    i4++;
                }
                Integer valueOf = Integer.valueOf(i4);
                if (i4 == -1) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    return jdb.a();
                }
                int intValue = valueOf.intValue();
                if (intValue == 0) {
                    return jdb.a();
                }
                xbb b = a.b();
                b.add(arrayList.get(intValue));
                b.addAll(arrayList.subList(0, intValue));
                b.addAll(arrayList.subList(intValue + 1, arrayList.size()));
                xbb a = a.a(b);
                gzh gzhVar2 = this.b;
                ArrayList arrayList2 = new ArrayList(k13.r(a, 10));
                ListIterator listIterator = a.listIterator(0);
                int i5 = 0;
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (hc9Var.hasNext()) {
                        Object next2 = hc9Var.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            b.q();
                            throw null;
                        }
                        arrayList2.add(new DbSportOrder((String) next2, i5, i5 == 0));
                        i5 = i6;
                    } else {
                        cwdVar.r = null;
                        cwdVar.u = 2;
                    }
                }
                return lu3Var;
            }
        }
        cwdVar = new cwd(this, sq3Var);
        Object obj2 = cwdVar.s;
        lu3 lu3Var2 = lu3.a;
        i = cwdVar.u;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
    }
}
