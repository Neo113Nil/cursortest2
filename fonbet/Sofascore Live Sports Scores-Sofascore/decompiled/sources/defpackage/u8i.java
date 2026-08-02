package defpackage;

import com.sofascore.model.mvvm.model.StageIds;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.results.service.StageWorker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u8i extends hoi implements Function2 {
    public final /* synthetic */ Serializable A;
    public final /* synthetic */ int r = 1;
    public int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public Object v;
    public Object w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Serializable y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8i(StandingsResponse standingsResponse, boolean z, rbi rbiVar, String str, Integer num, Integer num2, Integer num3, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = standingsResponse;
        this.t = z;
        this.w = rbiVar;
        this.x = str;
        this.y = num;
        this.z = num2;
        this.A = num3;
        this.u = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Serializable serializable = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                boolean z = this.u;
                u8i u8iVar = new u8i((int[]) obj3, this.t, (StageWorker) obj2, (asf) serializable, z, rq3Var);
                u8iVar.x = obj;
                return u8iVar;
            default:
                boolean z2 = this.u;
                return new u8i((StandingsResponse) this.v, this.t, (rbi) this.w, (String) this.x, (Integer) obj3, (Integer) obj2, (Integer) serializable, z2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((u8i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0221, code lost:
    
        if (r1.q(r2, r26) == r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0109, code lost:
    
        if (r2 == r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f2, code lost:
    
        if (r3 == r10) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cb A[LOOP:0: B:30:0x01c5->B:32:0x01cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0208 A[LOOP:1: B:36:0x0202->B:38:0x0208, LOOP_END] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u;
        List<s8i> s;
        Object k;
        Set set;
        int i;
        Object obj2;
        Iterator it;
        int i2 = this.r;
        boolean z = this.t;
        boolean z2 = true;
        Serializable serializable = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i2) {
            case 0:
                asf asfVar = (asf) serializable;
                StageWorker stageWorker = (StageWorker) obj3;
                qa6 qa6Var = stageWorker.b;
                ku3 ku3Var = (ku3) this.x;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    int[] iArr = (int[]) obj4;
                    ArrayList arrayList = new ArrayList(iArr.length);
                    for (int i4 : iArr) {
                        arrayList.add(xw3.t(ku3Var, null, new ru8(stageWorker, i4, this.u, null), 3));
                    }
                    this.x = null;
                    this.s = 1;
                    u = m6k.u(arrayList, this);
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                    u = obj;
                } else if (i3 == 2) {
                    List list = (List) this.v;
                    y6a.M(obj);
                    s = list;
                    k = obj;
                    set = (Set) k;
                    if (s == null || !s.isEmpty()) {
                        i = 0;
                        for (s8i s8iVar : s) {
                            Iterator it2 = set.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (((StageIds) obj2).getId() == s8iVar.a.getId()) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            if (obj2 == null && (i = i + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    asfVar.a = i > 0;
                    int size = (s.size() + set.size()) - 500;
                    if (size > 0) {
                        List L0 = CollectionsKt.L0(set, size);
                        set.removeAll(CollectionsKt.W0(L0));
                        ArrayList arrayList2 = new ArrayList(k13.r(L0, 10));
                        Iterator it3 = L0.iterator();
                        while (it3.hasNext()) {
                            w1l.A(arrayList2, ((StageIds) it3.next()).getId());
                        }
                        this.x = null;
                        this.v = s;
                        this.w = set;
                        this.s = 3;
                        if (qa6Var.x(arrayList2, this) != lu3Var) {
                            z2 = true;
                            asfVar.a = z2;
                        }
                        return lu3Var;
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(s, 10));
                    while (r5.hasNext()) {
                    }
                    set.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList(k13.r(s, 10));
                    it = s.iterator();
                    while (it.hasNext()) {
                    }
                    this.x = null;
                    this.v = null;
                    this.w = null;
                    this.s = 4;
                } else {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) this.w;
                    s = (List) this.v;
                    y6a.M(obj);
                    asfVar.a = z2;
                    ArrayList arrayList32 = new ArrayList(k13.r(s, 10));
                    for (s8i s8iVar2 : s) {
                        arrayList32.add(new StageIds(s8iVar2.a.getId(), s8iVar2.b, s8iVar2.c, null, 8, null));
                    }
                    set.addAll(arrayList32);
                    ArrayList arrayList42 = new ArrayList(k13.r(s, 10));
                    it = s.iterator();
                    while (it.hasNext()) {
                        arrayList42.add(((s8i) it.next()).a);
                    }
                    this.x = null;
                    this.v = null;
                    this.w = null;
                    this.s = 4;
                    break;
                }
                s = k13.s((Iterable) u);
                if (z) {
                    this.x = null;
                    this.v = s;
                    this.s = 2;
                    k = qa6Var.k(this);
                    break;
                }
                ArrayList arrayList422 = new ArrayList(k13.r(s, 10));
                it = s.iterator();
                while (it.hasNext()) {
                }
                this.x = null;
                this.v = null;
                this.w = null;
                this.s = 4;
                break;
            default:
                rbi rbiVar = (rbi) this.w;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ((StandingsResponse) this.v).setHasHomeAwayStandings(z);
                rbiVar.m = new ibi((StandingsResponse) this.v, (String) this.x, (Integer) obj4, (Integer) obj3, (Integer) serializable, this.u);
                this.s = 1;
                Object r = s9a.r(new pj7((StandingsResponse) this.v, (String) this.x, rbiVar, (Integer) obj4, (Integer) obj3, this.u, (Integer) serializable, null), this);
                return r == lu3Var2 ? lu3Var2 : r;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u8i(int[] iArr, boolean z, StageWorker stageWorker, asf asfVar, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = iArr;
        this.t = z;
        this.z = stageWorker;
        this.A = asfVar;
        this.u = z2;
    }
}
