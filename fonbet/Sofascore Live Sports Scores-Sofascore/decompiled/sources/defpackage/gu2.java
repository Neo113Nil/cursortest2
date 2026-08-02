package defpackage;

import com.sofascore.model.newNetwork.ChronologicalListIndexesResponse;
import com.sofascore.model.newNetwork.PageInfo;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gu2 extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(List list, List list2, int i, long j, long j2, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = list;
        this.w = list2;
        this.s = i;
        this.t = j;
        this.u = j2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                return new gu2((ku2) obj3, (String) obj2, this.t, this.u, rq3Var);
            case 1:
                return new gu2((List) obj3, (List) obj2, this.s, this.t, this.u, rq3Var);
            default:
                return new gu2((ynb) obj3, (Function1) obj2, this.u, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((gu2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (defpackage.n4o.z(r4, r24) == r9) goto L27;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        List<PageInfo> list;
        Object value;
        Object value2;
        long b;
        Object value3;
        int i = this.r;
        long j = this.u;
        Object obj2 = this.v;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                ku2 ku2Var = (ku2) obj2;
                DateTimeFormatter dateTimeFormatter = ku2Var.j;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                rq3 rq3Var = null;
                if (i2 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = ku2Var.e;
                    this.s = 1;
                    vyhVar.getClass();
                    P = yaa.P(new yw(vyhVar, ku2Var.l, (String) obj3, rq3Var, 15), this);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                ChronologicalListIndexesResponse chronologicalListIndexesResponse = (ChronologicalListIndexesResponse) yaa.x((x2g) P);
                if (chronologicalListIndexesResponse == null || (list = chronologicalListIndexesResponse.getPages()) == null) {
                    list = km5.a;
                }
                long j2 = this.t;
                String str = (String) obj3;
                ArrayList arrayList = new ArrayList();
                for (PageInfo pageInfo : list) {
                    LocalDateTime parse = LocalDateTime.parse(pageInfo.getMinStartDate(), dateTimeFormatter);
                    ZoneOffset zoneOffset = ZoneOffset.UTC;
                    long epochSecond = parse.toInstant(zoneOffset).getEpochSecond();
                    long epochSecond2 = LocalDateTime.parse(pageInfo.getMaxStartDate(), dateTimeFormatter).toInstant(zoneOffset).getEpochSecond();
                    eu2 eu2Var = (epochSecond > j2 || epochSecond2 < j) ? null : new eu2(str, pageInfo.getPage(), epochSecond, epochSecond2, pageInfo.getEventFilters());
                    if (eu2Var != null) {
                        arrayList.add(eu2Var);
                    }
                }
                return arrayList;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ArrayList w0 = CollectionsKt.w0((List) obj3, (List) obj2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = w0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((c9g) next).b)) {
                        arrayList2.add(next);
                    }
                }
                long j3 = this.t;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (j3 - j < rik.w((c9g) next2)) {
                        arrayList3.add(next2);
                    }
                }
                return CollectionsKt.L0(CollectionsKt.H0(arrayList3, new y73(27)), this.s);
            default:
                ynb ynbVar = (ynb) obj2;
                lu3 lu3Var3 = lu3.a;
                int i3 = this.s;
                try {
                    if (i3 == 0) {
                        y6a.M(obj);
                        fdi fdiVar = ynbVar.i;
                        do {
                            value2 = fdiVar.getValue();
                            ((Boolean) value2).getClass();
                        } while (!fdiVar.k(value2, Boolean.TRUE));
                        xhj.a.getClass();
                        xuc.a.getClass();
                        b = xuc.b();
                        this.t = b;
                        this.s = 1;
                        if (((Function1) obj3).invoke(this) == lu3Var3) {
                            return lu3Var3;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            fdi fdiVar2 = ynbVar.i;
                            do {
                                value3 = fdiVar2.getValue();
                                ((Boolean) value3).getClass();
                            } while (!fdiVar2.k(value3, Boolean.FALSE));
                            return Unit.a;
                        }
                        b = this.t;
                        y6a.M(obj);
                    }
                    xd5 xd5Var = new xd5(xd5.h(j, whj.b(b)));
                    xd5.b.getClass();
                    xd5 xd5Var2 = new xd5(0L);
                    if (xd5Var.compareTo(xd5Var2) < 0) {
                        xd5Var = xd5Var2;
                    }
                    long j4 = xd5Var.a;
                    this.t = b;
                    this.s = 2;
                    break;
                } catch (Throwable th) {
                    fdi fdiVar3 = ynbVar.i;
                    do {
                        value = fdiVar3.getValue();
                        ((Boolean) value).getClass();
                    } while (!fdiVar3.k(value, Boolean.FALSE));
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(ynb ynbVar, Function1 function1, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = ynbVar;
        this.w = function1;
        this.u = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(ku2 ku2Var, String str, long j, long j2, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = ku2Var;
        this.w = str;
        this.t = j;
        this.u = j2;
    }
}
