package defpackage;

import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.service.SyncWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ppi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ List u;
    public final /* synthetic */ List v;
    public final /* synthetic */ SyncWorker w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppi(List list, List list2, SyncWorker syncWorker, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = list;
        this.v = list2;
        this.w = syncWorker;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                ppi ppiVar = new ppi(this.u, this.v, this.w, rq3Var, 0);
                ppiVar.t = obj;
                return ppiVar;
            default:
                ppi ppiVar2 = new ppi(this.u, this.v, this.w, rq3Var, 1);
                ppiVar2.t = obj;
                return ppiVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ppi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0115, code lost:
    
        if (defpackage.gz8.T(r23, r3.a, new defpackage.cl(r3, r1, r9, 22)) == r12) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if (r1 == r12) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        if (r3 == r12) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0258, code lost:
    
        if (defpackage.m6k.u(r4, r23) == r6) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0205, code lost:
    
        if (r3 == r6) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cd, code lost:
    
        if (r3 == r6) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.coroutines.CoroutineContext, rq3] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object r;
        Object u;
        Object k;
        rq3 rq3Var;
        Object u2;
        int i = this.r;
        y9f y9fVar = ugj.a;
        List list = this.u;
        List list2 = this.v;
        int i2 = 1;
        int i3 = 2;
        switch (i) {
            case 0:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                SyncWorker syncWorker = this.w;
                rq3 rq3Var2 = null;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                y6a.M(obj);
                                y9fVar.getClass();
                                break;
                            } else {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            y6a.M(obj);
                            u = obj;
                            ArrayList W = CollectionsKt.W((Iterable) u);
                            ArrayList arrayList = new ArrayList(k13.r(W, 10));
                            Iterator it = W.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                ?? r21 = rq3Var2;
                                arrayList.add(xw3.t(ku3Var, r21, new t3(syncWorker, (UniqueTournament) pair.a, ((Boolean) pair.b).booleanValue(), (rq3) r21, 13), 3));
                                rq3Var2 = r21;
                            }
                            this.t = rq3Var2;
                            this.s = 3;
                            break;
                        }
                    } else {
                        y6a.M(obj);
                        r = obj;
                    }
                } else {
                    ArrayList u3 = fc6.u(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!list2.contains(new Integer(((Number) obj2).intValue()))) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        u3.add(new DbMyUniqueTournament(((Number) it2.next()).intValue(), false));
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new DbMyUniqueTournament(((Number) it3.next()).intValue(), true));
                    }
                    u3.addAll(arrayList3);
                    this.t = ku3Var;
                    this.s = 1;
                    r = s9a.r(new f54(syncWorker, u3, (rq3) null), this);
                    break;
                }
                Set set = (Set) r;
                ArrayList arrayList4 = new ArrayList(k13.r(set, 10));
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(xw3.t(ku3Var, null, new vki(syncWorker, (DbMyUniqueTournament) it4.next(), rq3Var2, i2), 3));
                }
                this.t = ku3Var;
                this.s = 2;
                u = m6k.u(arrayList4, this);
                break;
            default:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                SyncWorker syncWorker2 = this.w;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                y6a.M(obj);
                                y9fVar.getClass();
                                break;
                            } else {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            y6a.M(obj);
                            u2 = obj;
                            rq3Var = null;
                            ArrayList W2 = CollectionsKt.W((Iterable) u2);
                            wve wveVar = syncWorker2.g;
                            this.t = rq3Var;
                            this.s = 3;
                            aoe aoeVar = wveVar.a;
                            break;
                        }
                    } else {
                        y6a.M(obj);
                        k = obj;
                    }
                } else {
                    ArrayList u4 = fc6.u(obj);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : list) {
                        if (!list2.contains(new Integer(((Number) obj3).intValue()))) {
                            arrayList5.add(obj3);
                        }
                    }
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        u4.add(new DbMyPlayer(((Number) it5.next()).intValue(), false));
                    }
                    ArrayList arrayList6 = new ArrayList(k13.r(list2, 10));
                    Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(new DbMyPlayer(((Number) it6.next()).intValue(), true));
                    }
                    u4.addAll(arrayList6);
                    this.t = ku3Var2;
                    this.s = 1;
                    k = syncWorker2.k(u4, this);
                    break;
                }
                Set set2 = (Set) k;
                ArrayList arrayList7 = new ArrayList(k13.r(set2, 10));
                Iterator it7 = set2.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(xw3.t(ku3Var2, null, new vki(syncWorker2, (DbMyPlayer) it7.next(), null, i3), 3));
                }
                rq3Var = null;
                this.t = null;
                this.s = 2;
                u2 = m6k.u(arrayList7, this);
                break;
        }
        return Unit.a;
    }
}
