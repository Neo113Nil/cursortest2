package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.service.SyncWorker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n1f extends hoi implements Function2 {
    public final /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ int r = 1;
    public Iterator s;
    public int t;
    public int u;
    public int v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1f(List list, List list2, SyncWorker syncWorker, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = list;
        this.A = list2;
        this.B = syncWorker;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.A;
        switch (i) {
            case 0:
                return new n1f((p1f) this.y, (Activity) obj2, rq3Var);
            default:
                n1f n1fVar = new n1f((List) this.z, (List) obj2, (SyncWorker) this.B, rq3Var);
                n1fVar.w = obj;
                return n1fVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((n1f) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x018d, code lost:
    
        if (r2.p(r6, r5) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        if (r1 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
    
        if (r1 == r4) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    /* JADX WARN: Type inference failed for: r1v13, types: [j1f[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [j1f[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x018d -> B:10:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0197 -> B:10:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x021f -> B:58:0x0220). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        ArrayList arrayList;
        Activity activity;
        int i;
        int i2;
        p1f p1fVar;
        boolean z;
        Object m;
        Object u;
        Iterator it2;
        int i3;
        Pair pair;
        Object obj2;
        Iterator it3;
        SyncWorker syncWorker;
        int i4;
        int i5;
        n1f n1fVar = this;
        int i6 = n1fVar.r;
        Object obj3 = n1fVar.A;
        rq3 rq3Var = null;
        switch (i6) {
            case 0:
                p1f p1fVar2 = (p1f) n1fVar.y;
                lu3 lu3Var = lu3.a;
                int i7 = n1fVar.v;
                if (i7 == 0) {
                    y6a.M(obj);
                    List list = j1f.g;
                    ArrayList arrayList2 = new ArrayList();
                    it = list.iterator();
                    arrayList = arrayList2;
                    activity = (Activity) obj3;
                    i = 0;
                    i2 = 0;
                    p1fVar = p1fVar2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = n1fVar.u;
                    int i9 = n1fVar.t;
                    Object obj4 = n1fVar.w;
                    Iterator it4 = n1fVar.s;
                    Collection collection = (Collection) n1fVar.B;
                    Activity activity2 = (Activity) n1fVar.z;
                    p1f p1fVar3 = (p1f) n1fVar.x;
                    y6a.M(obj);
                    it = it4;
                    arrayList = collection;
                    activity = activity2;
                    i = i8;
                    p1fVar = p1fVar3;
                    i2 = i9;
                    Object d = obj;
                    if (((Boolean) d).booleanValue()) {
                        arrayList.add(obj4);
                    }
                    n1fVar = this;
                    if (it.hasNext()) {
                        Object next = it.next();
                        SharedPreferences sharedPreferences = p1fVar.a;
                        Context context = p1fVar.b;
                        n1fVar.x = p1fVar;
                        n1fVar.z = activity;
                        n1fVar.B = arrayList;
                        n1fVar.s = it;
                        n1fVar.w = next;
                        n1fVar.t = i2;
                        n1fVar.u = i;
                        n1fVar.v = 1;
                        d = p1fVar.d((j1f) next, sharedPreferences, context, activity, n1fVar);
                        if (d == lu3Var) {
                            return lu3Var;
                        }
                        obj4 = next;
                        if (((Boolean) d).booleanValue()) {
                        }
                        n1fVar = this;
                        if (it.hasNext()) {
                            b7 Z = l6g.Z(CollectionsKt.H0(arrayList, new wpb(21)));
                            if (Z == null || !Z.isEmpty()) {
                                ListIterator<Object> listIterator = Z.listIterator(0);
                                while (listIterator.hasNext()) {
                                    if (((j1f) listIterator.next()).b == j7f.a) {
                                        z = true;
                                        long j = p1fVar2.a.getLong("last_shown_pop_up_timestamp", 0L);
                                        if (!z) {
                                            ArrayList arrayList3 = new ArrayList();
                                            ListIterator<Object> listIterator2 = Z.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                Object next2 = listIterator2.next();
                                                if (((j1f) next2).b == j7f.a) {
                                                    arrayList3.add(next2);
                                                }
                                            }
                                            return l6g.Z(arrayList3);
                                        }
                                        wd5 wd5Var = xd5.b;
                                        if (xd5.k(wkn.S(yaa.w() - j, be5.SECONDS), be5.HOURS) < 12) {
                                            return rlh.b;
                                        }
                                        if (Z == null || !Z.isEmpty()) {
                                            ListIterator<Object> listIterator3 = Z.listIterator(0);
                                            while (listIterator3.hasNext()) {
                                                if (((j1f) listIterator3.next()).b == j7f.b) {
                                                    ?? r1 = new j1f[1];
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ListIterator<Object> listIterator4 = Z.listIterator(0);
                                                    while (listIterator4.hasNext()) {
                                                        Object next3 = listIterator4.next();
                                                        if (((j1f) next3).b == j7f.b) {
                                                            arrayList4.add(next3);
                                                        }
                                                    }
                                                    Iterator it5 = arrayList4.iterator();
                                                    if (!it5.hasNext()) {
                                                        yhk.d();
                                                        return null;
                                                    }
                                                    Object next4 = it5.next();
                                                    if (it5.hasNext()) {
                                                        int indexOf = j1f.g.indexOf((j1f) next4);
                                                        do {
                                                            Object next5 = it5.next();
                                                            int indexOf2 = j1f.g.indexOf((j1f) next5);
                                                            if (indexOf > indexOf2) {
                                                                next4 = next5;
                                                                indexOf = indexOf2;
                                                            }
                                                        } while (it5.hasNext());
                                                    }
                                                    r1[0] = next4;
                                                    return l6g.K(r1);
                                                }
                                            }
                                        }
                                        if (Z.isEmpty()) {
                                            return rlh.b;
                                        }
                                        ?? r12 = new j1f[1];
                                        ListIterator<Object> listIterator5 = Z.listIterator(0);
                                        if (!listIterator5.hasNext()) {
                                            yhk.d();
                                            return null;
                                        }
                                        Object next6 = listIterator5.next();
                                        if (listIterator5.hasNext()) {
                                            int a = ((j1f) next6).a();
                                            do {
                                                Object next7 = listIterator5.next();
                                                int a2 = ((j1f) next7).a();
                                                if (a > a2) {
                                                    next6 = next7;
                                                    a = a2;
                                                }
                                            } while (listIterator5.hasNext());
                                        }
                                        r12[0] = next6;
                                        return l6g.K(r12);
                                    }
                                }
                            }
                            z = false;
                            long j2 = p1fVar2.a.getLong("last_shown_pop_up_timestamp", 0L);
                            if (!z) {
                            }
                        }
                    }
                }
                break;
            default:
                List list2 = (List) obj3;
                SyncWorker syncWorker2 = (SyncWorker) n1fVar.B;
                ku3 ku3Var = (ku3) n1fVar.w;
                lu3 lu3Var2 = lu3.a;
                int i10 = n1fVar.v;
                int i11 = 3;
                if (i10 == 0) {
                    ArrayList u2 = fc6.u(obj);
                    List list3 = (List) n1fVar.z;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list3) {
                        if (!list2.contains(new Integer(((Number) obj5).intValue()))) {
                            arrayList5.add(obj5);
                        }
                    }
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        u2.add(new DbMyTeam(((Number) it6.next()).intValue(), false));
                    }
                    ArrayList arrayList6 = new ArrayList(k13.r(list2, 10));
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(new DbMyTeam(((Number) it7.next()).intValue(), true));
                    }
                    u2.addAll(arrayList6);
                    n1fVar.w = ku3Var;
                    n1fVar.v = 1;
                    m = syncWorker2.m(u2, n1fVar);
                    break;
                } else if (i10 == 1) {
                    y6a.M(obj);
                    m = obj;
                } else if (i10 == 2) {
                    y6a.M(obj);
                    u = obj;
                    it2 = CollectionsKt.W((Iterable) u).iterator();
                    i3 = 0;
                    if (!it2.hasNext()) {
                    }
                } else if (i10 == 3) {
                    int i12 = n1fVar.u;
                    int i13 = n1fVar.t;
                    Pair pair2 = (Pair) n1fVar.y;
                    it3 = n1fVar.s;
                    SyncWorker syncWorker3 = (SyncWorker) n1fVar.x;
                    y6a.M(obj);
                    i4 = i12;
                    i5 = i13;
                    pair = pair2;
                    syncWorker = syncWorker3;
                    obj2 = obj;
                    if (!((Boolean) obj2).booleanValue()) {
                    }
                    SyncWorker syncWorker4 = syncWorker;
                    i3 = i5;
                    syncWorker2 = syncWorker4;
                    it2 = it3;
                    if (!it2.hasNext()) {
                    }
                } else {
                    if (i10 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = n1fVar.t;
                    Iterator it8 = n1fVar.s;
                    syncWorker = (SyncWorker) n1fVar.x;
                    y6a.M(obj);
                    it3 = it8;
                    SyncWorker syncWorker42 = syncWorker;
                    i3 = i5;
                    syncWorker2 = syncWorker42;
                    it2 = it3;
                    if (!it2.hasNext()) {
                        Pair pair3 = (Pair) it2.next();
                        j0j j0jVar = syncWorker2.h;
                        n1fVar.w = null;
                        n1fVar.x = syncWorker2;
                        n1fVar.s = it2;
                        n1fVar.y = pair3;
                        n1fVar.t = i3;
                        n1fVar.u = 0;
                        n1fVar.v = 3;
                        fvi fviVar = j0jVar.a;
                        obj2 = gz8.T(n1fVar, fviVar.a, new fzh(fviVar, pair3, rq3Var, i11));
                        if (obj2 != lu3Var2) {
                            int i14 = i3;
                            syncWorker = syncWorker2;
                            i5 = i14;
                            pair = pair3;
                            it3 = it2;
                            i4 = 0;
                            if (!((Boolean) obj2).booleanValue()) {
                                int id = ((Team) pair.a).getId();
                                n1fVar.w = null;
                                n1fVar.x = syncWorker;
                                n1fVar.s = it3;
                                n1fVar.y = null;
                                n1fVar.t = i5;
                                n1fVar.u = i4;
                                n1fVar.v = 4;
                                break;
                            }
                            SyncWorker syncWorker422 = syncWorker;
                            i3 = i5;
                            syncWorker2 = syncWorker422;
                            it2 = it3;
                            if (!it2.hasNext()) {
                                ugj.a.getClass();
                                return Unit.a;
                            }
                        }
                        return lu3Var2;
                    }
                }
                Set set = (Set) m;
                ArrayList arrayList7 = new ArrayList(k13.r(set, 10));
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    arrayList7.add(xw3.t(ku3Var, null, new vki(syncWorker2, (DbMyTeam) it9.next(), rq3Var, i11), 3));
                }
                n1fVar.w = null;
                n1fVar.v = 2;
                u = m6k.u(arrayList7, n1fVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1f(p1f p1fVar, Activity activity, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = p1fVar;
        this.A = activity;
    }
}
