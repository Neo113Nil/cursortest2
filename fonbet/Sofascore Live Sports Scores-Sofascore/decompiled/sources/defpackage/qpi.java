package defpackage;

import com.sofascore.results.service.SyncWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qpi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public Set s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ SyncWorker v;
    public final /* synthetic */ List w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpi(SyncWorker syncWorker, List list, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = syncWorker;
        this.w = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        List list = this.w;
        SyncWorker syncWorker = this.v;
        switch (i) {
            case 0:
                qpi qpiVar = new qpi(syncWorker, list, rq3Var, 0);
                qpiVar.u = obj;
                return qpiVar;
            default:
                qpi qpiVar2 = new qpi(syncWorker, list, rq3Var, 1);
                qpiVar2.u = obj;
                return qpiVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qpi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r6 == r11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
    
        if (r1.O0(r3, r17) == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bc, code lost:
    
        if (r1.S(r3, r17) == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
    
        if (r3 != r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0142, code lost:
    
        if (r3 == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f2, code lost:
    
        if (r6 == r12) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182 A[LOOP:3: B:69:0x017c->B:71:0x0182, LOOP_END] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Set set;
        Iterator it;
        Set set2;
        Object u;
        Object A;
        Set set3;
        int i = this.r;
        y9f y9fVar = ugj.a;
        List list = this.w;
        SyncWorker syncWorker = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                w3b w3bVar = syncWorker.d;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                int i3 = 0;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.u = ku3Var;
                    this.t = 1;
                    b = w3bVar.b(this);
                    break;
                } else if (i2 == 1) {
                    y6a.M(obj);
                    b = obj;
                } else if (i2 == 2) {
                    set = this.s;
                    y6a.M(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!set.contains(new Integer(((Number) obj2).intValue()))) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(xw3.t(ku3Var, null, new npi(syncWorker, ((Number) it.next()).intValue(), null, 4), 3));
                    }
                    set2 = null;
                    this.u = null;
                    this.s = null;
                    this.t = 3;
                    u = m6k.u(arrayList2, this);
                    break;
                } else if (i2 == 3) {
                    Set set4 = this.s;
                    y6a.M(obj);
                    u = obj;
                    set2 = null;
                    ArrayList W = CollectionsKt.W((Iterable) u);
                    this.u = set2;
                    this.s = set2;
                    this.t = 4;
                    break;
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set5 = this.s;
                        y6a.M(obj);
                        y9fVar.getClass();
                        return Unit.a;
                    }
                    Set set6 = this.s;
                    y6a.M(obj);
                    ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
                    for (Object obj3 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            b.q();
                            throw null;
                        }
                        arrayList3.add(new Pair(new Integer(((Number) obj3).intValue()), new Integer(i3)));
                        i3 = i4;
                    }
                    this.u = null;
                    this.s = null;
                    this.t = 5;
                    break;
                }
                set = (Set) b;
                Set e = y9h.e(set, CollectionsKt.Q0(list));
                if (!e.isEmpty()) {
                    this.u = ku3Var;
                    this.s = set;
                    this.t = 2;
                    irj irjVar = w3bVar.a;
                    StringBuilder q = fc6.q("DELETE FROM pinned_tournaments_table WHERE id IN (");
                    pea.m(e.size(), q);
                    q.append(")");
                    Object U = gz8.U(this, irjVar.a, false, true, new dvi(26, q.toString(), e));
                    if (U != lu3Var) {
                        U = Unit.a;
                    }
                    if (U != lu3Var) {
                        U = Unit.a;
                        break;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                while (r7.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList(k13.r(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                }
                set2 = null;
                this.u = null;
                this.s = null;
                this.t = 3;
                u = m6k.u(arrayList22, this);
                break;
            default:
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.t;
                if (i5 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = syncWorker.k;
                    this.u = ku3Var2;
                    this.t = 1;
                    A = wi7Var.A(this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set7 = this.s;
                        y6a.M(obj);
                        set3 = set7;
                        y9fVar.getClass();
                        return set3;
                    }
                    y6a.M(obj);
                    A = obj;
                }
                HashSet Q0 = CollectionsKt.Q0((Iterable) A);
                HashSet Q02 = CollectionsKt.Q0(list);
                Set e2 = y9h.e(Q02, Q0);
                Set e3 = y9h.e(Q0, Q02);
                ArrayList arrayList5 = new ArrayList(k13.r(e3, 10));
                Iterator it2 = e3.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(xw3.t(ku3Var2, null, new npi(syncWorker, ((Number) it2.next()).intValue(), rq3Var, 7), 3));
                }
                this.u = null;
                this.s = e2;
                this.t = 2;
                if (m6k.u(arrayList5, this) != lu3Var2) {
                    set3 = e2;
                    y9fVar.getClass();
                    return set3;
                }
                return lu3Var2;
        }
    }
}
