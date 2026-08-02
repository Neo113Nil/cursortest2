package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jqf extends hoi implements ct8 {
    public /* synthetic */ wuc A;
    public final /* synthetic */ kqf B;
    public List r;
    public List s;
    public List t;
    public y0d u;
    public y0d v;
    public y0d w;
    public Set x;
    public y0d y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqf(kqf kqfVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.B = kqfVar;
    }

    public static final void e(kqf kqfVar, List list, List list2, List list3, y0d y0dVar, y0d y0dVar2, y0d y0dVar3, y0d y0dVar4) {
        char c;
        long j;
        long j2;
        synchronized (kqfVar.d) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    sg3 sg3Var = (sg3) list3.get(i);
                    sg3Var.a();
                    kqfVar.P(sg3Var);
                }
                list3.clear();
                Object[] objArr = y0dVar.b;
                long[] jArr = y0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    sg3 sg3Var2 = (sg3) objArr[(i2 << 3) + i4];
                                    sg3Var2.a();
                                    kqfVar.P(sg3Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                y0dVar.b();
                Object[] objArr2 = y0dVar2.b;
                long[] jArr2 = y0dVar2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((sg3) objArr2[(i5 << 3) + i7]).j();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                y0dVar2.b();
                y0dVar3.b();
                Object[] objArr3 = y0dVar4.b;
                long[] jArr3 = y0dVar4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    sg3 sg3Var3 = (sg3) objArr3[(i8 << 3) + i10];
                                    sg3Var3.a();
                                    kqfVar.P(sg3Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                y0dVar4.b();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(List list, kqf kqfVar) {
        list.clear();
        synchronized (kqfVar.d) {
            try {
                ArrayList arrayList = kqfVar.l;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((twc) arrayList.get(i));
                }
                kqfVar.l.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jqf jqfVar = new jqf(this.B, (rq3) obj3);
        jqfVar.A = (wuc) obj2;
        jqfVar.invokeSuspend(Unit.a);
        return lu3.a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0142 -> B:6:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0239 -> B:40:0x009b). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wuc wucVar;
        y0d y0dVar;
        y0d y0dVar2;
        List list;
        Set set;
        List list2;
        y0d y0dVar3;
        List list3;
        y0d y0dVar4;
        y0d y0dVar5;
        kqf kqfVar;
        kqf kqfVar2;
        Object obj2;
        lj2 lj2Var;
        lu3 lu3Var;
        wuc wucVar2;
        l0d l0dVar;
        Object[] objArr;
        lu3 lu3Var2 = lu3.a;
        int i = this.z;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            y6a.M(obj);
            wucVar = this.A;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            y0d y0dVar6 = rrg.a;
            y0dVar = new y0d();
            y0d y0dVar7 = new y0d();
            y0d y0dVar8 = new y0d();
            srg srgVar = new srg(y0dVar8);
            y0dVar2 = new y0d();
            list = arrayList;
            set = srgVar;
            list2 = arrayList2;
            y0dVar3 = y0dVar8;
            list3 = arrayList3;
            y0dVar4 = y0dVar7;
            kqfVar2 = this.B;
            fdi fdiVar = kqf.A;
            synchronized (kqfVar2.d) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0d y0dVar9 = this.y;
                set = this.x;
                y0dVar3 = this.w;
                y0dVar4 = this.v;
                y0dVar = this.u;
                list3 = this.t;
                list2 = this.s;
                list = this.r;
                wuc wucVar3 = this.A;
                y6a.M(obj);
                y0dVar2 = y0dVar9;
                wucVar = wucVar3;
                kqf kqfVar3 = this.B;
                fdi fdiVar2 = kqf.A;
                synchronized (kqfVar3.d) {
                    try {
                        if (kqfVar3.m.j()) {
                            l0d d = uyc.d(kqfVar3.m);
                            kqfVar3.m.a();
                            k1d k1dVar = kqfVar3.n;
                            ((x0d) k1dVar.b).a();
                            ((x0d) k1dVar.c).a();
                            kqfVar3.p.a();
                            l0dVar = new l0d(d.b);
                            Object[] objArr2 = d.a;
                            int i4 = d.b;
                            lu3Var = lu3Var2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                twc twcVar = (twc) objArr2[i5];
                                l0dVar.a(new Pair(twcVar, kqfVar3.o.g(twcVar)));
                                i5 = i6 + 1;
                                wucVar = wucVar;
                                objArr2 = objArr2;
                            }
                            wucVar2 = wucVar;
                            kqfVar3.o.a();
                        } else {
                            lu3Var = lu3Var2;
                            wucVar2 = wucVar;
                            l0dVar = yjd.b;
                            l0dVar.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr3 = l0dVar.a;
                int i7 = l0dVar.b;
                int i8 = 0;
                while (i8 < i7) {
                    Pair pair = (Pair) objArr3[i8];
                    twc twcVar2 = (twc) pair.a;
                    swc swcVar = (swc) pair.b;
                    if (swcVar != null) {
                        sg3 sg3Var = twcVar2.c;
                        qn2 qn2Var = sg3Var.u;
                        try {
                            qn2Var.m(sg3Var.e, sg3Var.v.C());
                            mlh n = swcVar.a.n();
                            try {
                                objArr = objArr3;
                                n.m(n.t, new fv2(qn2Var, 1));
                                n.I();
                                Unit unit = Unit.a;
                                n.e(true);
                                qn2Var.f();
                            } catch (Throwable th2) {
                                n.e(false);
                                throw th2;
                            }
                        } finally {
                            qn2Var.d();
                        }
                    } else {
                        objArr = objArr3;
                    }
                    i8++;
                    objArr3 = objArr;
                }
                l2a l2aVar = this.B.c;
                ((em0) l2aVar.b).set(0);
                ((p03) l2aVar.c).h(new a7d(11));
                i3 = 1;
                lu3Var2 = lu3Var;
                wucVar = wucVar2;
                i2 = 2;
                kqfVar2 = this.B;
                fdi fdiVar3 = kqf.A;
                synchronized (kqfVar2.d) {
                }
                kqf kqfVar4 = this.B;
                this.A = wucVar;
                this.r = list;
                this.s = list2;
                this.t = list3;
                this.u = y0dVar;
                this.v = y0dVar4;
                this.w = y0dVar3;
                this.x = set;
                this.y = y0dVar2;
                this.z = i3;
                if (kqfVar4.G()) {
                    obj2 = Unit.a;
                } else {
                    lj2 lj2Var2 = new lj2(i3, z9a.b(this));
                    lj2Var2.t();
                    synchronized (kqfVar4.d) {
                        if (kqfVar4.G()) {
                            lj2Var = lj2Var2;
                        } else {
                            kqfVar4.s = lj2Var2;
                            lj2Var = null;
                        }
                    }
                    if (lj2Var != null) {
                        p2g p2gVar = w2g.b;
                        lj2Var.resumeWith(Unit.a);
                    }
                    obj2 = lj2Var2.q();
                    if (obj2 != lu3.a) {
                        obj2 = Unit.a;
                    }
                }
                if (obj2 != lu3Var2) {
                    y0dVar5 = y0dVar2;
                    Set set2 = set;
                    y0d y0dVar10 = y0dVar3;
                    y0d y0dVar11 = y0dVar4;
                    y0d y0dVar12 = y0dVar;
                    List list4 = list3;
                    List list5 = list2;
                    List list6 = list;
                    kqfVar = this.B;
                    fdi fdiVar4 = kqf.A;
                    if (kqfVar.O()) {
                        y0dVar3 = y0dVar10;
                        y0dVar2 = y0dVar5;
                        list = list6;
                        list2 = list5;
                        y0dVar = y0dVar12;
                        list3 = list4;
                        y0dVar4 = y0dVar11;
                        set = set2;
                        kqfVar2 = this.B;
                        fdi fdiVar32 = kqf.A;
                        synchronized (kqfVar2.d) {
                        }
                    } else {
                        cj4 cj4Var = new cj4(this.B, y0dVar10, y0dVar5, list6, list5, y0dVar12, list4, y0dVar11, set2, 1);
                        y0dVar3 = y0dVar10;
                        y0dVar2 = y0dVar5;
                        list = list6;
                        list2 = list5;
                        y0dVar = y0dVar12;
                        list3 = list4;
                        y0dVar4 = y0dVar11;
                        this.A = wucVar;
                        this.r = list;
                        this.s = list2;
                        this.t = list3;
                        this.u = y0dVar;
                        this.v = y0dVar4;
                        this.w = y0dVar3;
                        this.x = set2;
                        this.y = y0dVar2;
                        this.z = i2;
                        if (wucVar.p(cj4Var, this) != lu3Var2) {
                            set = set2;
                            kqf kqfVar32 = this.B;
                            fdi fdiVar22 = kqf.A;
                            synchronized (kqfVar32.d) {
                            }
                        }
                    }
                }
                return lu3Var2;
            }
            y0d y0dVar13 = this.y;
            set = this.x;
            y0dVar3 = this.w;
            y0dVar4 = this.v;
            y0dVar = this.u;
            list3 = this.t;
            list2 = this.s;
            list = this.r;
            wuc wucVar4 = this.A;
            y6a.M(obj);
            y0dVar5 = y0dVar13;
            wucVar = wucVar4;
            Set set22 = set;
            y0d y0dVar102 = y0dVar3;
            y0d y0dVar112 = y0dVar4;
            y0d y0dVar122 = y0dVar;
            List list42 = list3;
            List list52 = list2;
            List list62 = list;
            kqfVar = this.B;
            fdi fdiVar42 = kqf.A;
            if (kqfVar.O()) {
            }
        }
    }
}
