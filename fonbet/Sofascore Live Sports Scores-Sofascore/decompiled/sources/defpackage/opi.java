package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.service.SyncWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class opi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ SyncWorker u;
    public final /* synthetic */ List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opi(SyncWorker syncWorker, List list, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = syncWorker;
        this.v = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        List list = this.v;
        SyncWorker syncWorker = this.u;
        switch (i) {
            case 0:
                opi opiVar = new opi(syncWorker, list, rq3Var, 0);
                opiVar.t = obj;
                return opiVar;
            case 1:
                opi opiVar2 = new opi(syncWorker, list, rq3Var, 1);
                opiVar2.t = obj;
                return opiVar2;
            case 2:
                opi opiVar3 = new opi(syncWorker, list, rq3Var, 2);
                opiVar3.t = obj;
                return opiVar3;
            case 3:
                opi opiVar4 = new opi(syncWorker, list, rq3Var, 3);
                opiVar4.t = obj;
                return opiVar4;
            default:
                opi opiVar5 = new opi(syncWorker, list, rq3Var, 4);
                opiVar5.t = obj;
                return opiVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((opi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x022d, code lost:
    
        if (r13 == r10) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f4, code lost:
    
        if (r13 == r10) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ae, code lost:
    
        if (defpackage.m6k.u(r3, r12) == r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0274, code lost:
    
        if (r13 == r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (r0.q(r13, r12) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r13 == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if (r13 == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        if (r0.q(r13, r12) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        if (r13 == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r13 == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
    
        if (r12 == r10) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017d, code lost:
    
        if (r13 == r10) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        if (r13 == r10) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0240, code lost:
    
        if (r0.p(r13, r12) == r10) goto L104;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        y9f y9fVar = ugj.a;
        List list = this.v;
        SyncWorker syncWorker = this.u;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.t = ku3Var;
                    this.s = 1;
                    obj = s9a.r(new qpi(syncWorker, list, rq3Var, i4), this);
                    break;
                } else if (i5 == 1) {
                    y6a.M(obj);
                } else if (i5 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    y9fVar.getClass();
                    break;
                }
                Set set = (Set) obj;
                ArrayList arrayList = new ArrayList(k13.r(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(xw3.t(ku3Var, null, new npi(syncWorker, ((Number) it.next()).intValue(), rq3Var, 0), 3));
                }
                this.t = null;
                this.s = 2;
                break;
            case 1:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.t = ku3Var2;
                    this.s = 1;
                    obj = syncWorker.i(list, this);
                    break;
                } else if (i6 == 1) {
                    y6a.M(obj);
                } else if (i6 == 2) {
                    y6a.M(obj);
                    ArrayList W = CollectionsKt.W((Iterable) obj);
                    qa6 qa6Var = syncWorker.e;
                    this.t = null;
                    this.s = 3;
                    break;
                } else if (i6 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    y9fVar.getClass();
                    break;
                }
                Set set2 = (Set) obj;
                ArrayList arrayList2 = new ArrayList(k13.r(set2, 10));
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(xw3.t(ku3Var2, null, new npi(syncWorker, ((Number) it2.next()).intValue(), rq3Var, i4), 3));
                }
                this.t = null;
                this.s = 2;
                obj = m6k.u(arrayList2, this);
                break;
            case 2:
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.t = ku3Var3;
                    this.s = 1;
                    obj = syncWorker.h(list, this);
                    break;
                } else if (i7 == 1) {
                    y6a.M(obj);
                } else if (i7 == 2) {
                    y6a.M(obj);
                    ArrayList W2 = CollectionsKt.W((Iterable) obj);
                    qa6 qa6Var2 = syncWorker.e;
                    this.t = null;
                    this.s = 3;
                    qa6Var2.getClass();
                    ArrayList arrayList3 = new ArrayList(k13.r(W2, 10));
                    Iterator it3 = W2.iterator();
                    while (it3.hasNext()) {
                        Event event = (Event) it3.next();
                        event.setMute(new Integer(1));
                        arrayList3.add(event);
                    }
                    Object p = qa6Var2.p(arrayList3, this);
                    if (p != lu3.a) {
                        p = Unit.a;
                        break;
                    }
                } else if (i7 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    y9fVar.getClass();
                    break;
                }
                Set set3 = (Set) obj;
                ArrayList arrayList4 = new ArrayList(k13.r(set3, 10));
                Iterator it4 = set3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(xw3.t(ku3Var3, null, new npi(syncWorker, ((Number) it4.next()).intValue(), rq3Var, i2), 3));
                }
                this.t = null;
                this.s = 2;
                obj = m6k.u(arrayList4, this);
                break;
            case 3:
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.t = ku3Var4;
                    this.s = 1;
                    obj = syncWorker.j(list, this);
                    break;
                } else if (i8 == 1) {
                    y6a.M(obj);
                } else if (i8 == 2) {
                    y6a.M(obj);
                    ArrayList W3 = CollectionsKt.W((Iterable) obj);
                    qa6 qa6Var3 = syncWorker.e;
                    this.t = null;
                    this.s = 3;
                    break;
                } else if (i8 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    y9fVar.getClass();
                    break;
                }
                Set set4 = (Set) obj;
                ArrayList arrayList5 = new ArrayList(k13.r(set4, 10));
                Iterator it5 = set4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(xw3.t(ku3Var4, null, new npi(syncWorker, ((Number) it5.next()).intValue(), rq3Var, i3), 3));
                }
                this.t = null;
                this.s = 2;
                obj = m6k.u(arrayList5, this);
                break;
            default:
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.t = ku3Var5;
                    this.s = 1;
                    obj = syncWorker.l(list, this);
                    break;
                } else if (i9 == 1) {
                    y6a.M(obj);
                } else if (i9 == 2) {
                    y6a.M(obj);
                    ArrayList W4 = CollectionsKt.W((Iterable) obj);
                    qa6 qa6Var4 = syncWorker.e;
                    this.t = null;
                    this.s = 3;
                    break;
                } else if (i9 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    y9fVar.getClass();
                    break;
                }
                Set set5 = (Set) obj;
                ArrayList arrayList6 = new ArrayList(k13.r(set5, 10));
                Iterator it6 = set5.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(xw3.t(ku3Var5, null, new npi(syncWorker, ((Number) it6.next()).intValue(), rq3Var, 5), 3));
                }
                this.t = null;
                this.s = 2;
                obj = m6k.u(arrayList6, this);
                break;
        }
        return Unit.a;
    }
}
