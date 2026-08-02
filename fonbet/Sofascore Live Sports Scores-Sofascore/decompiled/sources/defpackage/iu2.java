package defpackage;

import com.sofascore.model.mvvm.model.Event;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iu2 extends hoi implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ArrayList C;
    public int r;
    public int s;
    public int t;
    public List u;
    public fsf v;
    public fsf w;
    public dsf x;
    public int y;
    public final /* synthetic */ ku2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu2(ku2 ku2Var, int i, boolean z, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = ku2Var;
        this.A = i;
        this.B = z;
        this.C = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new iu2(this.z, this.A, this.B, this.C, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iu2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0097, code lost:
    
        if (r8 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0202, code lost:
    
        if (r4 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0204, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0176, code lost:
    
        if (r9 == r5) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0097 -> B:91:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0202 -> B:7:0x0205). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0176 -> B:68:0x017a). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int k;
        List arrayList;
        fsf fsfVar;
        fsf fsfVar2;
        dsf dsfVar;
        boolean z;
        fsf fsfVar3;
        List list;
        int k2;
        int i;
        int i2;
        int i3;
        List list2;
        dsf dsfVar2;
        fsf fsfVar4;
        int i4;
        List list3;
        dsf dsfVar3;
        int i5;
        fsf fsfVar5;
        int k3;
        boolean z2;
        g9i g9iVar;
        ArrayList arrayList2;
        boolean z3;
        fu2 fu2Var;
        fdi fdiVar;
        Object value;
        Integer num;
        du2 a;
        ku2 ku2Var = this.z;
        long j = ku2Var.h;
        boolean z4 = ku2Var.i;
        lu3 lu3Var = lu3.a;
        int i6 = this.y;
        ArrayList arrayList3 = this.C;
        boolean z5 = this.B;
        int i7 = this.A;
        if (i6 == 0) {
            y6a.M(obj);
            k = ku2Var.k(i7, z5);
            arrayList = new ArrayList();
            if (arrayList.size() < 15) {
            }
            fsfVar = new fsf();
            fsfVar2 = new fsf();
            List list4 = ku2Var.n;
            if (z5) {
            }
            dsfVar = new dsf();
            Integer num2 = new Integer(0);
            if (z4) {
            }
            if (num2 == null) {
            }
            dsfVar.a = r9;
            if (ku2Var.o) {
            }
            z = z4;
            if (fsfVar2.a != null) {
            }
            list2 = arrayList;
            dsfVar2 = dsfVar;
            fsfVar4 = fsfVar2;
            ArrayList u = mx9.u(ku2Var.i(), list2, null, null, false, false, false, false, null, 7676);
            Integer num3 = new Integer(0);
            if (z) {
            }
            dsfVar2.a = num3 == null ? num3.intValue() : ku2Var.l(u, j, new b42(19));
            if (list2.isEmpty()) {
            }
            fdiVar = ku2Var.q;
            do {
                value = fdiVar.getValue();
                du2 du2Var = (du2) value;
                if (ku2Var.o) {
                }
            } while (!fdiVar.k(value, a));
            ku2Var.o = z3;
            ku2Var.u = g9iVar;
            return Unit.a;
        }
        if (i6 == 1) {
            k = this.r;
            arrayList = this.u;
            y6a.M(obj);
            Object n = obj;
            List list5 = (List) n;
            if (z5) {
                arrayList3.add(0, new Integer(k));
                arrayList.addAll(0, list5);
                i3 = k - 1;
            } else {
                arrayList3.add(new Integer(k));
                arrayList.addAll(list5);
                i3 = k + 1;
            }
            k = ku2Var.k(i3, z5);
            if (arrayList.size() < 15 || k < 0 || k >= ku2Var.n.size()) {
                fsfVar = new fsf();
                fsfVar2 = new fsf();
                List list42 = ku2Var.n;
                if (z5) {
                    fsfVar2.a = (k >= list42.size() || k < 0) ? null : new Integer(k);
                    fsfVar.a = i7 > 0 ? new Integer(i7 - 1) : null;
                } else {
                    fsfVar2.a = i7 < list42.size() + (-1) ? new Integer(i7 + 1) : null;
                    fsfVar.a = k >= 0 ? new Integer(k) : null;
                }
                dsfVar = new dsf();
                Integer num22 = new Integer(0);
                if (z4) {
                    num22 = null;
                }
                int intValue = num22 == null ? num22.intValue() : ku2Var.l(arrayList, j, new b42(18));
                dsfVar.a = intValue;
                if (ku2Var.o || i7 <= 0 || !z4 || (intValue != 0 && arrayList.size() >= 15)) {
                    z = z4;
                    if (fsfVar2.a != null) {
                    }
                    list2 = arrayList;
                    dsfVar2 = dsfVar;
                    fsfVar4 = fsfVar2;
                    ArrayList u2 = mx9.u(ku2Var.i(), list2, null, null, false, false, false, false, null, 7676);
                    Integer num32 = new Integer(0);
                    if (z) {
                    }
                    dsfVar2.a = num32 == null ? num32.intValue() : ku2Var.l(u2, j, new b42(19));
                    if (list2.isEmpty()) {
                    }
                    fdiVar = ku2Var.q;
                    do {
                        value = fdiVar.getValue();
                        du2 du2Var2 = (du2) value;
                        if (ku2Var.o) {
                        }
                    } while (!fdiVar.k(value, a));
                    ku2Var.o = z3;
                    ku2Var.u = g9iVar;
                    return Unit.a;
                }
                fsfVar3 = fsfVar2;
                list = arrayList;
                k2 = ku2Var.k(i7 - 1, true);
                i = k;
                i2 = 0;
                if (i2 == 0) {
                }
                z = z4;
                fsfVar.a = k2 <= 0 ? new Integer(k2 - 1) : null;
                k = i;
                arrayList = list;
                fsfVar2 = fsfVar3;
                if (fsfVar2.a != null) {
                }
                list2 = arrayList;
                dsfVar2 = dsfVar;
                fsfVar4 = fsfVar2;
                ArrayList u22 = mx9.u(ku2Var.i(), list2, null, null, false, false, false, false, null, 7676);
                Integer num322 = new Integer(0);
                if (z) {
                }
                dsfVar2.a = num322 == null ? num322.intValue() : ku2Var.l(u22, j, new b42(19));
                if (list2.isEmpty()) {
                }
                fdiVar = ku2Var.q;
                do {
                    value = fdiVar.getValue();
                    du2 du2Var22 = (du2) value;
                    if (ku2Var.o) {
                    }
                } while (!fdiVar.k(value, a));
                ku2Var.o = z3;
                ku2Var.u = g9iVar;
                return Unit.a;
            }
            eu2 eu2Var = (eu2) ku2Var.n.get(k);
            this.u = arrayList;
            this.v = null;
            this.r = k;
            this.y = 1;
            n = ku2Var.n(eu2Var, this);
        } else if (i6 == 2) {
            i2 = this.t;
            k2 = this.s;
            i = this.r;
            dsfVar = this.x;
            fsfVar3 = this.w;
            fsfVar = this.v;
            list = this.u;
            y6a.M(obj);
            Object n2 = obj;
            boolean z6 = z4;
            List list6 = (List) n2;
            if (list6.isEmpty()) {
                k2 = ku2Var.k(k2 - 1, true);
                z4 = z6;
            } else {
                arrayList3.add(0, new Integer(k2));
                list.addAll(0, list6);
                z4 = z6;
                i2 = 1;
            }
            if (i2 == 0 || k2 < 0) {
                z = z4;
                fsfVar.a = k2 <= 0 ? new Integer(k2 - 1) : null;
                k = i;
                arrayList = list;
                fsfVar2 = fsfVar3;
                if (fsfVar2.a != null || !ku2Var.o || !z || arrayList.size() - dsfVar.a >= 15) {
                    list2 = arrayList;
                    dsfVar2 = dsfVar;
                    fsfVar4 = fsfVar2;
                    ArrayList u222 = mx9.u(ku2Var.i(), list2, null, null, false, false, false, false, null, 7676);
                    Integer num3222 = new Integer(0);
                    if (z) {
                    }
                    dsfVar2.a = num3222 == null ? num3222.intValue() : ku2Var.l(u222, j, new b42(19));
                    if (list2.isEmpty()) {
                    }
                    fdiVar = ku2Var.q;
                    do {
                        value = fdiVar.getValue();
                        du2 du2Var222 = (du2) value;
                        if (ku2Var.o) {
                        }
                    } while (!fdiVar.k(value, a));
                    ku2Var.o = z3;
                    ku2Var.u = g9iVar;
                    return Unit.a;
                }
                i4 = k;
                list3 = arrayList;
                dsfVar3 = dsfVar;
                fsfVar4 = fsfVar2;
                i5 = 0;
                fsfVar5 = fsfVar;
                k3 = ku2Var.k(((Number) fsfVar2.a).intValue(), false);
                if (i5 == 0) {
                }
                fsfVar4.a = k3 >= ku2Var.n.size() - 1 ? new Integer(k3 + 1) : null;
                dsfVar2 = dsfVar3;
                fsfVar = fsfVar5;
                list2 = list3;
                ArrayList u2222 = mx9.u(ku2Var.i(), list2, null, null, false, false, false, false, null, 7676);
                Integer num32222 = new Integer(0);
                if (z) {
                }
                dsfVar2.a = num32222 == null ? num32222.intValue() : ku2Var.l(u2222, j, new b42(19));
                if (list2.isEmpty()) {
                }
                fdiVar = ku2Var.q;
                do {
                    value = fdiVar.getValue();
                    du2 du2Var2222 = (du2) value;
                    if (ku2Var.o) {
                    }
                } while (!fdiVar.k(value, a));
                ku2Var.o = z3;
                ku2Var.u = g9iVar;
                return Unit.a;
            }
            eu2 eu2Var2 = (eu2) ku2Var.n.get(k2);
            this.u = list;
            this.v = fsfVar;
            this.w = fsfVar3;
            this.x = dsfVar;
            this.r = i;
            this.s = k2;
            this.t = i2;
            z6 = z4;
            this.y = 2;
            n2 = ku2Var.n(eu2Var2, this);
        } else {
            if (i6 != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i5 = this.t;
            k3 = this.s;
            i4 = this.r;
            dsfVar3 = this.x;
            fsfVar4 = this.w;
            fsfVar5 = this.v;
            list3 = this.u;
            y6a.M(obj);
            z = z4;
            Object n3 = obj;
            List list7 = (List) n3;
            if (list7.isEmpty()) {
                k3 = ku2Var.k(k3 + 1, true);
            } else {
                arrayList3.add(new Integer(k3));
                list3.addAll(list7);
                i5 = 1;
            }
            if (i5 == 0 || k3 < 0 || k3 < 0 || k3 >= ku2Var.n.size()) {
                fsfVar4.a = k3 >= ku2Var.n.size() - 1 ? new Integer(k3 + 1) : null;
                dsfVar2 = dsfVar3;
                fsfVar = fsfVar5;
                list2 = list3;
                ArrayList u22222 = mx9.u(ku2Var.i(), list2, null, null, false, false, false, false, null, 7676);
                Integer num322222 = new Integer(0);
                if (z) {
                    num322222 = null;
                }
                dsfVar2.a = num322222 == null ? num322222.intValue() : ku2Var.l(u22222, j, new b42(19));
                if (list2.isEmpty()) {
                    arrayList2 = u22222;
                    z3 = 0;
                    z2 = z5;
                    g9iVar = null;
                    fu2Var = new fu2(arrayList3, arrayList2, ((Event) CollectionsKt.Y(list2)).getStartTimestamp(), ((Event) CollectionsKt.h0(list2)).getStartTimestamp());
                } else {
                    z2 = z5;
                    g9iVar = null;
                    arrayList2 = u22222;
                    z3 = 0;
                    fu2Var = null;
                }
                fdiVar = ku2Var.q;
                do {
                    value = fdiVar.getValue();
                    du2 du2Var22222 = (du2) value;
                    if (ku2Var.o) {
                        xbb b = a.b();
                        if (z2 && fu2Var != null) {
                            b.add(fu2Var);
                        }
                        b.addAll(du2Var22222.c);
                        if (!z2 && fu2Var != null) {
                            b.add(fu2Var);
                        }
                        xbb a2 = a.a(b);
                        Integer num4 = du2Var22222.b;
                        if (z2) {
                            num = new Integer(arrayList2.size() + (num4 != null ? num4.intValue() : z3));
                        } else {
                            num = num4;
                        }
                        a = du2.a(du2Var22222, num, a2, (Integer) fsfVar.a, (Integer) fsfVar4.a, 1);
                    } else {
                        Integer num5 = new Integer(dsfVar2.a);
                        List c = fu2Var != null ? a.c(fu2Var) : km5.a;
                        Integer num6 = (Integer) fsfVar.a;
                        Integer num7 = (Integer) fsfVar4.a;
                        du2Var22222.getClass();
                        c.getClass();
                        a = new du2(true, num5, c, num6, num7);
                    }
                } while (!fdiVar.k(value, a));
                ku2Var.o = z3;
                ku2Var.u = g9iVar;
                return Unit.a;
            }
            eu2 eu2Var3 = (eu2) ku2Var.n.get(k3);
            this.u = list3;
            this.v = fsfVar5;
            this.w = fsfVar4;
            this.x = dsfVar3;
            this.r = i4;
            this.s = k3;
            this.t = i5;
            this.y = 3;
            n3 = ku2Var.n(eu2Var3, this);
        }
    }
}
