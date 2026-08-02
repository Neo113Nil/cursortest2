package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cj4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ cj4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean D;
        Unit unit;
        nnh nnhVar;
        nnh nnhVar2;
        char c;
        long j;
        Object[] objArr;
        boolean z;
        switch (this.a) {
            case 0:
                IntRange intRange = (IntRange) this.b;
                kg2 kg2Var = (kg2) this.c;
                lg2 lg2Var = (lg2) this.d;
                Function1 function1 = (Function1) this.e;
                eg2 eg2Var = (eg2) this.f;
                Long l = (Long) this.g;
                gi4 gi4Var = (gi4) this.h;
                di4 di4Var = (di4) this.i;
                ci4 ci4Var = (ci4) this.j;
                t3e t3eVar = oj4.a;
                esa.e((esa) obj, ((intRange.b - intRange.a) + 1) * 12, null, null, new tc3(72599078, new dj4(kg2Var, lg2Var, function1, eg2Var, l, gi4Var, di4Var, ci4Var), true), 6);
                return Unit.a;
            default:
                kqf kqfVar = (kqf) this.b;
                y0d y0dVar = (y0d) this.c;
                y0d y0dVar2 = (y0d) this.d;
                List list = (List) this.e;
                List list2 = (List) this.f;
                y0dVar2 = (y0d) this.g;
                list = (List) this.h;
                y0dVar2 = (y0d) this.i;
                Set set = (Set) this.j;
                long longValue = ((Long) obj).longValue();
                fdi fdiVar = kqf.A;
                synchronized (kqfVar.d) {
                    D = kqfVar.D();
                }
                boolean z2 = 0;
                if (D) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        kqfVar.b.b.h(new yz(longValue, 5));
                        synchronized (snh.c) {
                            y0d y0dVar3 = snh.j.h;
                            if (y0dVar3 != null) {
                                z = y0dVar3.h();
                            }
                        }
                        if (z) {
                            snh.c();
                        }
                        Unit unit2 = Unit.a;
                    } finally {
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    kqfVar.O();
                    synchronized (kqfVar.d) {
                        try {
                            i1d i1dVar = kqfVar.j;
                            Object[] objArr2 = i1dVar.a;
                            int i = i1dVar.c;
                            for (int i2 = 0; i2 < i; i2++) {
                                list.add((sg3) objArr2[i2]);
                            }
                            kqfVar.j.n();
                            Unit unit3 = Unit.a;
                        } finally {
                        }
                    }
                    y0dVar.b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            nnh h = snh.h();
                            nnh rxjVar = h instanceof c1d ? new rxj((c1d) h, null, null, true, false) : new sxj(h, null, true, z2);
                            try {
                                try {
                                    nnh j2 = rxjVar.j();
                                    try {
                                        if (!list.isEmpty()) {
                                            kqfVar.a++;
                                            try {
                                                int size = list.size();
                                                for (int i3 = z2; i3 < size; i3++) {
                                                    y0dVar2.a((sg3) list.get(i3));
                                                }
                                                int size2 = list.size();
                                                for (int i4 = z2; i4 < size2; i4++) {
                                                    ((sg3) list.get(i4)).g();
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    kqfVar.N(th, null);
                                                    jqf.e(kqfVar, list, list2, list, y0dVar2, y0dVar2, y0dVar, y0dVar2);
                                                    unit = Unit.a;
                                                    nnh.q(j2);
                                                    rxjVar.c();
                                                    return unit;
                                                } finally {
                                                }
                                            }
                                        }
                                        try {
                                            if (y0dVar2.h()) {
                                                try {
                                                    y0dVar2.j(y0dVar2);
                                                    Object[] objArr3 = y0dVar2.b;
                                                    c = 7;
                                                    long[] jArr = y0dVar2.a;
                                                    j = 128;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        nnhVar = rxjVar;
                                                        int i5 = 0;
                                                        while (true) {
                                                            try {
                                                                long j3 = jArr[i5];
                                                                nnhVar2 = j2;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                                                    for (int i7 = 0; i7 < i6; i7++) {
                                                                        if ((j3 & 255) < 128) {
                                                                            try {
                                                                                ((sg3) objArr3[(i5 << 3) + i7]).i();
                                                                            } catch (Throwable th2) {
                                                                                th = th2;
                                                                                try {
                                                                                    kqfVar.N(th, null);
                                                                                    jqf.e(kqfVar, list, list2, list, y0dVar2, y0dVar2, y0dVar, y0dVar2);
                                                                                    unit = Unit.a;
                                                                                    nnh.q(nnhVar2);
                                                                                    nnhVar.c();
                                                                                    return unit;
                                                                                } finally {
                                                                                }
                                                                            }
                                                                        }
                                                                        j3 >>= 8;
                                                                    }
                                                                    if (i6 != 8) {
                                                                    }
                                                                }
                                                                if (i5 != length) {
                                                                    i5++;
                                                                    j2 = nnhVar2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                nnhVar2 = j2;
                                                            }
                                                        }
                                                    } else {
                                                        nnhVar2 = j2;
                                                        nnhVar = rxjVar;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    nnhVar2 = j2;
                                                    nnhVar = rxjVar;
                                                }
                                            } else {
                                                nnhVar2 = j2;
                                                nnhVar = rxjVar;
                                                c = 7;
                                                j = 128;
                                            }
                                            if (y0dVar2.h()) {
                                                try {
                                                    Object[] objArr4 = y0dVar2.b;
                                                    long[] jArr2 = y0dVar2.a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i8 = 0;
                                                        while (true) {
                                                            long j4 = jArr2[i8];
                                                            if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                                int i10 = 0;
                                                                while (i10 < i9) {
                                                                    if ((j4 & 255) < j) {
                                                                        ((sg3) objArr4[(i8 << 3) + i10]).j();
                                                                    }
                                                                    j4 >>= 8;
                                                                    i10++;
                                                                    objArr4 = objArr4;
                                                                }
                                                                objArr = objArr4;
                                                                if (i9 != 8) {
                                                                }
                                                            } else {
                                                                objArr = objArr4;
                                                            }
                                                            if (i8 != length2) {
                                                                i8++;
                                                                objArr4 = objArr;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        kqfVar.N(th5, null);
                                                        jqf.e(kqfVar, list, list2, list, y0dVar2, y0dVar2, y0dVar, y0dVar2);
                                                        unit = Unit.a;
                                                        y0dVar2.b();
                                                        nnh.q(nnhVar2);
                                                        nnhVar.c();
                                                        return unit;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            Unit unit4 = Unit.a;
                                            nnh.q(nnhVar2);
                                            nnhVar.c();
                                            synchronized (kqfVar.d) {
                                                if (kqfVar.C() != null) {
                                                    sf3.a("unexpected to get continuation here");
                                                }
                                            }
                                            snh.h().m();
                                            y0dVar2.b();
                                            y0dVar.b();
                                            kqfVar.r = null;
                                            Trace.endSection();
                                            return Unit.a;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            nnh.q(nnhVar2);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        nnhVar2 = j2;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    nnhVar.c();
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                nnhVar = rxjVar;
                                nnhVar.c();
                                throw th;
                            }
                        }
                        try {
                            int size3 = list.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                sg3 sg3Var = (sg3) list.get(i11);
                                sg3 M = kqfVar.M(sg3Var, y0dVar);
                                if (M != null) {
                                    list.add(M);
                                    Unit unit5 = Unit.a;
                                }
                                y0dVar2.a(sg3Var);
                            }
                            list.clear();
                            if (y0dVar.h() || kqfVar.j.c != 0) {
                                synchronized (kqfVar.d) {
                                    try {
                                        List H = kqfVar.H();
                                        int size4 = H.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            sg3 sg3Var2 = (sg3) H.get(i12);
                                            if (!y0dVar2.c(sg3Var2) && sg3Var2.x(set)) {
                                                list.add(sg3Var2);
                                            }
                                        }
                                        i1d i1dVar2 = kqfVar.j;
                                        int i13 = i1dVar2.c;
                                        int i14 = 0;
                                        int i15 = 0;
                                        while (true) {
                                            Object[] objArr5 = i1dVar2.a;
                                            if (i14 < i13) {
                                                sg3 sg3Var3 = (sg3) objArr5[i14];
                                                if (!y0dVar2.c(sg3Var3) && !list.contains(sg3Var3)) {
                                                    list.add(sg3Var3);
                                                    i15++;
                                                } else if (i15 > 0) {
                                                    Object[] objArr6 = i1dVar2.a;
                                                    objArr6[i14 - i15] = objArr6[i14];
                                                }
                                                i14++;
                                            } else {
                                                int i16 = i13 - i15;
                                                Arrays.fill(objArr5, i16, i13, (Object) null);
                                                i1dVar2.c = i16;
                                                Unit unit6 = Unit.a;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    jqf.f(list2, kqfVar);
                                    while (!list2.isEmpty()) {
                                        List L = kqfVar.L(list2, y0dVar);
                                        y0dVar2.getClass();
                                        L.getClass();
                                        Iterator it = L.iterator();
                                        while (it.hasNext()) {
                                            y0dVar2.k(it.next());
                                        }
                                        jqf.f(list2, kqfVar);
                                    }
                                } catch (Throwable th10) {
                                    kqfVar.N(th10, null);
                                    jqf.e(kqfVar, list, list2, list, y0dVar2, y0dVar2, y0dVar, y0dVar2);
                                    unit = Unit.a;
                                    return unit;
                                }
                            }
                            z2 = 0;
                        } catch (Throwable th11) {
                            try {
                                kqfVar.N(th11, null);
                                jqf.e(kqfVar, list, list2, list, y0dVar2, y0dVar2, y0dVar, y0dVar2);
                                unit = Unit.a;
                                list.clear();
                                return unit;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
                break;
        }
    }
}
