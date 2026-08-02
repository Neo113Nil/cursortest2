package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.lazy.layout.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rqa {
    public int a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public Object g;
    public final Object h;
    public final Object i;
    public Object j;
    public final Object k;

    /* JADX WARN: Multi-variable type inference failed */
    public rqa(Context context, String str, taa taaVar) {
        context.getClass();
        str.getClass();
        this.b = str;
        this.c = taaVar;
        this.d = context.getApplicationContext();
        this.e = taaVar.a.getCoroutineScope();
        this.f = new AtomicBoolean(true);
        this.h = beh.a(0, 0, a62.a);
        this.i = new wj9(this, taaVar.b, false, 29);
        this.j = new yxc(this);
        this.k = new zxc(this, 0 == true ? 1 : 0);
    }

    public static void c(xqa xqaVar, int i, pqa pqaVar) {
        int i2 = 0;
        long i3 = xqaVar.i(0);
        long a = xqaVar.e() ? r6a.a(0, i, 1, i3) : r6a.a(i, 0, 2, i3);
        lqa[] lqaVarArr = pqaVar.a;
        int length = lqaVarArr.length;
        int i4 = 0;
        while (i2 < length) {
            lqa lqaVar = lqaVarArr[i2];
            int i5 = i4 + 1;
            if (lqaVar != null) {
                lqaVar.l = r6a.d(a, r6a.c(xqaVar.i(i4), i3));
            }
            i2++;
            i4 = i5;
        }
    }

    public static int i(int[] iArr, xqa xqaVar) {
        int j = xqaVar.j();
        int c = xqaVar.c() + j;
        int i = 0;
        while (j < c) {
            int f = xqaVar.f() + iArr[j];
            iArr[j] = f;
            i = Math.max(i, f);
            j++;
        }
        return i;
    }

    public lqa a(int i, Object obj) {
        pqa pqaVar = (pqa) ((x0d) this.b).g(obj);
        if (pqaVar != null) {
            return pqaVar.a[i];
        }
        return null;
    }

    public long b() {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            lqa lqaVar = (lqa) arrayList.get(i);
            n29 n29Var = lqaVar.n;
            if (n29Var != null) {
                j = (Math.max((int) (j & 4294967295L), ((int) (lqaVar.l & 4294967295L)) + ((int) (n29Var.u & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), ((int) (lqaVar.l >> 32)) + ((int) (n29Var.u >> 32))) << 32);
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0540  */
    /* JADX WARN: Type inference failed for: r10v21, types: [kotlin.coroutines.CoroutineContext, nu3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(int i, int i2, int i3, ArrayList arrayList, c cVar, t01 t01Var, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, ku3 ku3Var, k29 k29Var) {
        rq3 rq3Var;
        char c;
        long j;
        ArrayList arrayList2;
        int length;
        c cVar2;
        y0d y0dVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList7;
        Object[] objArr;
        int i10;
        long j2;
        ArrayList arrayList8;
        y0d y0dVar2;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Object[] objArr2;
        ArrayList arrayList11;
        ArrayList arrayList12;
        xqa xqaVar;
        int i11;
        int i12;
        rq3 rq3Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        y0d y0dVar3;
        ArrayList arrayList13;
        y0d y0dVar4;
        ArrayList arrayList14;
        long j3;
        int i17;
        ArrayList arrayList15 = (ArrayList) this.i;
        y0d y0dVar5 = (y0d) this.d;
        ArrayList arrayList16 = (ArrayList) this.f;
        ArrayList arrayList17 = (ArrayList) this.e;
        ArrayList arrayList18 = (ArrayList) this.h;
        ArrayList arrayList19 = (ArrayList) this.g;
        x0d x0dVar = (x0d) this.b;
        c cVar3 = (c) this.c;
        this.c = cVar;
        int size = arrayList.size();
        int i18 = 0;
        loop0: while (true) {
            rq3Var = null;
            if (i18 < size) {
                int i19 = i18;
                xqa xqaVar2 = (xqa) arrayList.get(i18);
                int i20 = size;
                int b = xqaVar2.b();
                int i21 = 0;
                while (i21 < b) {
                    int i22 = b;
                    Object g = xqaVar2.g(i21);
                    xqa xqaVar3 = xqaVar2;
                    if ((g instanceof aqa ? (aqa) g : null) != null) {
                        break loop0;
                    }
                    i21++;
                    b = i22;
                    xqaVar2 = xqaVar3;
                }
                i18 = i19 + 1;
                size = i20;
            } else if (x0dVar.i()) {
                e();
                return;
            }
        }
        int i23 = this.a;
        xqa xqaVar4 = (xqa) CollectionsKt.firstOrNull(arrayList);
        this.a = xqaVar4 != null ? xqaVar4.getIndex() : 0;
        if (z) {
            c = ' ';
            j = i & 4294967295L;
        } else {
            c = ' ';
            j = i << 32;
        }
        boolean z4 = z2 || !z3;
        char c2 = c;
        Object[] objArr3 = x0dVar.b;
        long[] jArr = x0dVar.a;
        int length2 = jArr.length - 2;
        ArrayList arrayList20 = arrayList18;
        ArrayList arrayList21 = arrayList19;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j4 = jArr[i24];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    int i26 = 0;
                    while (i26 < i25) {
                        if ((j4 & 255) < 128) {
                            i17 = i26;
                            y0dVar5.a(objArr3[(i24 << 3) + i26]);
                        } else {
                            i17 = i26;
                        }
                        j4 >>= 8;
                        i26 = i17 + 1;
                    }
                    if (i25 != 8) {
                        break;
                    }
                }
                if (i24 == length2) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        int size2 = arrayList.size();
        int i27 = 0;
        while (i27 < size2) {
            xqa xqaVar5 = (xqa) arrayList.get(i27);
            y0dVar5.l(xqaVar5.getKey());
            int b2 = xqaVar5.b();
            int i28 = 0;
            while (true) {
                if (i28 >= b2) {
                    i14 = size2;
                    i15 = i23;
                    i16 = i27;
                    y0dVar3 = y0dVar5;
                    arrayList13 = arrayList16;
                    f(xqaVar5.getKey());
                    Unit unit = Unit.a;
                    break;
                }
                i14 = size2;
                Object g2 = xqaVar5.g(i28);
                i16 = i27;
                if ((g2 instanceof aqa ? (aqa) g2 : null) != null) {
                    pqa pqaVar = (pqa) x0dVar.g(xqaVar5.getKey());
                    int a = cVar3 != null ? cVar3.a(xqaVar5.getKey()) : -1;
                    boolean z5 = a == -1 && cVar3 != null;
                    if (pqaVar == null) {
                        pqa pqaVar2 = new pqa(this);
                        pqa.b(pqaVar2, xqaVar5, ku3Var, k29Var, i5, i6);
                        x0dVar.m(xqaVar5.getKey(), pqaVar2);
                        if (xqaVar5.getIndex() == a || a == -1) {
                            long i29 = xqaVar5.i(0);
                            if (xqaVar5.e()) {
                                i15 = i23;
                                j3 = i29 & 4294967295L;
                            } else {
                                i15 = i23;
                                j3 = i29 >> c2;
                            }
                            c(xqaVar5, (int) j3, pqaVar2);
                            if (z5) {
                                for (lqa lqaVar : pqaVar2.a) {
                                    if (lqaVar != null) {
                                        lqaVar.a();
                                        Unit unit2 = Unit.a;
                                    }
                                }
                            }
                            Unit unit3 = Unit.a;
                        } else {
                            if (a < i23) {
                                arrayList17.add(xqaVar5);
                            } else {
                                arrayList16.add(xqaVar5);
                            }
                            i15 = i23;
                        }
                        y0dVar3 = y0dVar5;
                        arrayList13 = arrayList16;
                    } else {
                        i15 = i23;
                        if (z4) {
                            pqa.b(pqaVar, xqaVar5, ku3Var, k29Var, i5, i6);
                            lqa[] lqaVarArr = pqaVar.a;
                            int length3 = lqaVarArr.length;
                            int i30 = 0;
                            while (i30 < length3) {
                                lqa[] lqaVarArr2 = lqaVarArr;
                                lqa lqaVar2 = lqaVarArr2[i30];
                                boolean z6 = z5;
                                int i31 = length3;
                                if (lqaVar2 != null) {
                                    y0dVar4 = y0dVar5;
                                    arrayList14 = arrayList16;
                                    if (!r6a.b(lqaVar2.l, 9223372034707292159L)) {
                                        lqaVar2.l = r6a.d(lqaVar2.l, j);
                                    }
                                } else {
                                    y0dVar4 = y0dVar5;
                                    arrayList14 = arrayList16;
                                }
                                i30++;
                                lqaVarArr = lqaVarArr2;
                                z5 = z6;
                                length3 = i31;
                                y0dVar5 = y0dVar4;
                                arrayList16 = arrayList14;
                            }
                            y0dVar3 = y0dVar5;
                            arrayList13 = arrayList16;
                            if (z5) {
                                for (lqa lqaVar3 : pqaVar.a) {
                                    if (lqaVar3 != null) {
                                        if (lqaVar3.b()) {
                                            arrayList15.remove(lqaVar3);
                                            oqa oqaVar = (oqa) this.j;
                                            if (oqaVar != null) {
                                                n9e.E(oqaVar);
                                                Unit unit4 = Unit.a;
                                            }
                                        }
                                        lqaVar3.a();
                                    }
                                }
                            }
                            h(xqaVar5, false);
                        } else {
                            y0dVar3 = y0dVar5;
                            arrayList13 = arrayList16;
                        }
                        Unit unit5 = Unit.a;
                    }
                } else {
                    i28++;
                    size2 = i14;
                    i27 = i16;
                }
            }
            i27 = i16 + 1;
            size2 = i14;
            i23 = i15;
            y0dVar5 = y0dVar3;
            arrayList16 = arrayList13;
        }
        y0d y0dVar6 = y0dVar5;
        ArrayList arrayList22 = arrayList16;
        int[] iArr = new int[i4];
        if (z4 && cVar3 != null) {
            if (arrayList17.isEmpty()) {
                i13 = 0;
            } else {
                if (arrayList17.size() > 1) {
                    n13.u(new qqa(cVar3, 2), arrayList17);
                }
                int size3 = arrayList17.size();
                for (int i32 = 0; i32 < size3; i32++) {
                    xqa xqaVar6 = (xqa) arrayList17.get(i32);
                    int i33 = i5 - i(iArr, xqaVar6);
                    Object g3 = x0dVar.g(xqaVar6.getKey());
                    g3.getClass();
                    c(xqaVar6, i33, (pqa) g3);
                    h(xqaVar6, false);
                }
                i13 = 0;
                Arrays.fill(iArr, 0, i4, 0);
            }
            if (!arrayList22.isEmpty()) {
                if (arrayList22.size() > 1) {
                    arrayList2 = arrayList22;
                    n13.u(new qqa(cVar3, i13), arrayList2);
                } else {
                    arrayList2 = arrayList22;
                }
                int size4 = arrayList2.size();
                for (int i34 = 0; i34 < size4; i34++) {
                    xqa xqaVar7 = (xqa) arrayList2.get(i34);
                    int i35 = (i(iArr, xqaVar7) + i6) - xqaVar7.f();
                    Object g4 = x0dVar.g(xqaVar7.getKey());
                    g4.getClass();
                    c(xqaVar7, i35, (pqa) g4);
                    h(xqaVar7, false);
                }
                Arrays.fill(iArr, 0, i4, 0);
                y0d y0dVar7 = y0dVar6;
                Object[] objArr4 = y0dVar7.b;
                long[] jArr2 = y0dVar7.a;
                length = jArr2.length - 2;
                if (length < 0) {
                    int i36 = 0;
                    while (true) {
                        long j5 = jArr2[i36];
                        Object[] objArr5 = objArr4;
                        long[] jArr3 = jArr2;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i37 = 8 - ((~(i36 - length)) >>> 31);
                            int i38 = 0;
                            while (i38 < i37) {
                                if ((j5 & 255) < 128) {
                                    i10 = i38;
                                    Object obj = objArr5[(i36 << 3) + i38];
                                    j2 = j5;
                                    pqa pqaVar3 = (pqa) x0dVar.g(obj);
                                    if (pqaVar3 == null) {
                                        arrayList8 = arrayList15;
                                        y0dVar2 = y0dVar7;
                                        arrayList9 = arrayList2;
                                        arrayList10 = arrayList17;
                                        objArr2 = objArr5;
                                    } else {
                                        y0dVar2 = y0dVar7;
                                        int a2 = cVar.a(obj);
                                        arrayList9 = arrayList2;
                                        arrayList10 = arrayList17;
                                        int min = Math.min(i4, pqaVar3.e);
                                        pqaVar3.e = min;
                                        objArr2 = objArr5;
                                        pqaVar3.d = Math.min(i4 - min, pqaVar3.d);
                                        if (a2 == -1) {
                                            lqa[] lqaVarArr3 = pqaVar3.a;
                                            int length4 = lqaVarArr3.length;
                                            int i39 = 0;
                                            boolean z7 = false;
                                            int i40 = 0;
                                            while (i39 < length4) {
                                                lqa[] lqaVarArr4 = lqaVarArr3;
                                                lqa lqaVar4 = lqaVarArr4[i39];
                                                int i41 = i40 + 1;
                                                if (lqaVar4 != null) {
                                                    if (lqaVar4.b()) {
                                                        Unit unit6 = Unit.a;
                                                        i11 = length4;
                                                        i12 = i39;
                                                        rq3Var2 = rq3Var;
                                                        z7 = true;
                                                    } else {
                                                        i11 = length4;
                                                        if (((Boolean) ((eoh) lqaVar4.k).getValue()).booleanValue()) {
                                                            lqaVar4.c();
                                                            pqaVar3.a[i40] = rq3Var;
                                                            arrayList15.remove(lqaVar4);
                                                            oqa oqaVar2 = (oqa) this.j;
                                                            if (oqaVar2 != null) {
                                                                n9e.E(oqaVar2);
                                                                Unit unit7 = Unit.a;
                                                            }
                                                        } else {
                                                            n29 n29Var = lqaVar4.n;
                                                            if (n29Var != null) {
                                                                j38 j38Var = lqaVar4.f;
                                                                if (!lqaVar4.b() && j38Var != null) {
                                                                    i12 = i39;
                                                                    ((eoh) lqaVar4.j).setValue(Boolean.TRUE);
                                                                    ?? r10 = rq3Var;
                                                                    xw3.L(lqaVar4.a, r10, r10, new zi7(lqaVar4, j38Var, n29Var, rq3Var, 17), 3);
                                                                    rq3Var2 = r10;
                                                                    if (lqaVar4.b()) {
                                                                        lqaVar4.c();
                                                                        pqaVar3.a[i40] = rq3Var2;
                                                                    } else {
                                                                        arrayList15.add(lqaVar4);
                                                                        oqa oqaVar3 = (oqa) this.j;
                                                                        if (oqaVar3 != null) {
                                                                            n9e.E(oqaVar3);
                                                                            Unit unit8 = Unit.a;
                                                                        }
                                                                        z7 = true;
                                                                    }
                                                                    Unit unit9 = Unit.a;
                                                                }
                                                            }
                                                            i12 = i39;
                                                            rq3Var2 = rq3Var;
                                                            if (lqaVar4.b()) {
                                                            }
                                                            Unit unit92 = Unit.a;
                                                        }
                                                    }
                                                    i39 = i12 + 1;
                                                    rq3Var = rq3Var2;
                                                    lqaVarArr3 = lqaVarArr4;
                                                    i40 = i41;
                                                    length4 = i11;
                                                } else {
                                                    i11 = length4;
                                                }
                                                i12 = i39;
                                                rq3Var2 = rq3Var;
                                                i39 = i12 + 1;
                                                rq3Var = rq3Var2;
                                                lqaVarArr3 = lqaVarArr4;
                                                i40 = i41;
                                                length4 = i11;
                                            }
                                            if (!z7) {
                                                f(obj);
                                            }
                                            Unit unit10 = Unit.a;
                                            arrayList8 = arrayList15;
                                        } else {
                                            an3 an3Var = pqaVar3.b;
                                            an3Var.getClass();
                                            xqa v = t01Var.v(a2, pqaVar3.d, pqaVar3.e, an3Var.a);
                                            v.h();
                                            lqa[] lqaVarArr5 = pqaVar3.a;
                                            int length5 = lqaVarArr5.length;
                                            int i42 = 0;
                                            while (true) {
                                                if (i42 < length5) {
                                                    arrayList8 = arrayList15;
                                                    lqa lqaVar5 = lqaVarArr5[i42];
                                                    if (lqaVar5 != null) {
                                                        xqaVar = v;
                                                        if (((Boolean) ((eoh) lqaVar5.h).getValue()).booleanValue()) {
                                                            break;
                                                        }
                                                    } else {
                                                        xqaVar = v;
                                                    }
                                                    i42++;
                                                    arrayList15 = arrayList8;
                                                    v = xqaVar;
                                                } else {
                                                    arrayList8 = arrayList15;
                                                    xqaVar = v;
                                                    if (cVar3 != null && a2 == cVar3.a(obj)) {
                                                        f(obj);
                                                        Unit unit11 = Unit.a;
                                                    }
                                                }
                                            }
                                            pqaVar3.a(xqaVar, ku3Var, k29Var, i5, i6, pqaVar3.c);
                                            xqa xqaVar8 = xqaVar;
                                            if (a2 < this.a) {
                                                arrayList12 = arrayList21;
                                                arrayList12.add(xqaVar8);
                                                arrayList11 = arrayList20;
                                            } else {
                                                arrayList11 = arrayList20;
                                                arrayList12 = arrayList21;
                                                arrayList11.add(xqaVar8);
                                            }
                                        }
                                    }
                                    arrayList11 = arrayList20;
                                    arrayList12 = arrayList21;
                                } else {
                                    i10 = i38;
                                    j2 = j5;
                                    arrayList8 = arrayList15;
                                    y0dVar2 = y0dVar7;
                                    arrayList9 = arrayList2;
                                    arrayList10 = arrayList17;
                                    objArr2 = objArr5;
                                    arrayList11 = arrayList20;
                                    arrayList12 = arrayList21;
                                }
                                arrayList21 = arrayList12;
                                j5 = j2 >> 8;
                                i38 = i10 + 1;
                                arrayList20 = arrayList11;
                                arrayList15 = arrayList8;
                                y0dVar7 = y0dVar2;
                                arrayList2 = arrayList9;
                                arrayList17 = arrayList10;
                                objArr5 = objArr2;
                                rq3Var = null;
                            }
                            cVar2 = cVar;
                            arrayList7 = arrayList15;
                            y0dVar = y0dVar7;
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList17;
                            objArr = objArr5;
                            arrayList5 = arrayList20;
                            arrayList6 = arrayList21;
                            if (i37 != 8) {
                                break;
                            }
                        } else {
                            cVar2 = cVar;
                            arrayList7 = arrayList15;
                            y0dVar = y0dVar7;
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList17;
                            objArr = objArr5;
                            arrayList5 = arrayList20;
                            arrayList6 = arrayList21;
                        }
                        if (i36 == length) {
                            break;
                        }
                        i36++;
                        arrayList21 = arrayList6;
                        arrayList20 = arrayList5;
                        arrayList15 = arrayList7;
                        jArr2 = jArr3;
                        y0dVar7 = y0dVar;
                        arrayList2 = arrayList3;
                        arrayList17 = arrayList4;
                        objArr4 = objArr;
                        rq3Var = null;
                    }
                } else {
                    cVar2 = cVar;
                    y0dVar = y0dVar7;
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList17;
                    arrayList5 = arrayList20;
                    arrayList6 = arrayList21;
                }
                if (arrayList6.isEmpty()) {
                    if (arrayList6.size() > 1) {
                        n13.u(new qqa(cVar2, 3), arrayList6);
                    }
                    int size5 = arrayList6.size();
                    for (int i43 = 0; i43 < size5; i43++) {
                        xqa xqaVar9 = (xqa) arrayList6.get(i43);
                        Object g5 = x0dVar.g(xqaVar9.getKey());
                        g5.getClass();
                        pqa pqaVar4 = (pqa) g5;
                        int i44 = i(iArr, xqaVar9);
                        if (z2) {
                            xqa xqaVar10 = (xqa) CollectionsKt.Y(arrayList);
                            long i45 = xqaVar10.i(0);
                            i9 = (int) (xqaVar10.e() ? i45 & 4294967295L : i45 >> c2);
                        } else {
                            i9 = pqaVar4.f;
                        }
                        xqaVar9.a(i9 - i44, pqaVar4.c, i2, i3);
                        if (z4) {
                            h(xqaVar9, true);
                        }
                    }
                    i7 = i2;
                    i8 = i3;
                    Arrays.fill(iArr, 0, i4, 0);
                } else {
                    i7 = i2;
                    i8 = i3;
                }
                if (!arrayList5.isEmpty()) {
                    if (arrayList5.size() > 1) {
                        n13.u(new qqa(cVar2, 1), arrayList5);
                    }
                    int size6 = arrayList5.size();
                    for (int i46 = 0; i46 < size6; i46++) {
                        xqa xqaVar11 = (xqa) arrayList5.get(i46);
                        Object g6 = x0dVar.g(xqaVar11.getKey());
                        g6.getClass();
                        pqa pqaVar5 = (pqa) g6;
                        xqaVar11.a((pqaVar5.g - xqaVar11.f()) + i(iArr, xqaVar11), pqaVar5.c, i7, i8);
                        if (z4) {
                            h(xqaVar11, true);
                        }
                    }
                }
                Collections.reverse(arrayList6);
                Unit unit12 = Unit.a;
                arrayList.addAll(0, arrayList6);
                arrayList.addAll(arrayList5);
                arrayList4.clear();
                arrayList3.clear();
                arrayList6.clear();
                arrayList5.clear();
                y0dVar.b();
            }
        }
        arrayList2 = arrayList22;
        y0d y0dVar72 = y0dVar6;
        Object[] objArr42 = y0dVar72.b;
        long[] jArr22 = y0dVar72.a;
        length = jArr22.length - 2;
        if (length < 0) {
        }
        if (arrayList6.isEmpty()) {
        }
        if (!arrayList5.isEmpty()) {
        }
        Collections.reverse(arrayList6);
        Unit unit122 = Unit.a;
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList3.clear();
        arrayList6.clear();
        arrayList5.clear();
        y0dVar.b();
    }

    public void e() {
        x0d x0dVar = (x0d) this.b;
        if (x0dVar.j()) {
            Object[] objArr = x0dVar.c;
            long[] jArr = x0dVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (lqa lqaVar : ((pqa) objArr[(i << 3) + i3]).a) {
                                    if (lqaVar != null) {
                                        lqaVar.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            x0dVar.a();
        }
    }

    public void f(Object obj) {
        pqa pqaVar = (pqa) ((x0d) this.b).k(obj);
        if (pqaVar != null) {
            for (lqa lqaVar : pqaVar.a) {
                if (lqaVar != null) {
                    lqaVar.c();
                }
            }
        }
    }

    public void g(Intent intent) {
        intent.getClass();
        if (((AtomicBoolean) this.f).compareAndSet(true, false)) {
            ((Context) this.d).bindService(intent, (zxc) this.k, 1);
            taa taaVar = (taa) this.c;
            wj9 wj9Var = (wj9) this.i;
            wj9Var.getClass();
            LinkedHashMap linkedHashMap = taaVar.d;
            i1k i1kVar = taaVar.c;
            Pair j = i1kVar.j((String[]) wj9Var.b);
            String[] strArr = (String[]) j.a;
            int[] iArr = (int[]) j.b;
            vkd vkdVar = new vkd(wj9Var, iArr, strArr);
            ReentrantLock reentrantLock = taaVar.e;
            reentrantLock.lock();
            try {
                vkd vkdVar2 = linkedHashMap.containsKey(wj9Var) ? (vkd) rub.a(wj9Var, linkedHashMap) : (vkd) linkedHashMap.put(wj9Var, vkdVar);
                reentrantLock.unlock();
                if (vkdVar2 == null) {
                    ((pkd) i1kVar.h).a(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public void h(xqa xqaVar, boolean z) {
        Object g = ((x0d) this.b).g(xqaVar.getKey());
        g.getClass();
        lqa[] lqaVarArr = ((pqa) g).a;
        int length = lqaVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            lqa lqaVar = lqaVarArr[i];
            int i3 = i2 + 1;
            if (lqaVar != null) {
                long i4 = xqaVar.i(i2);
                long j = lqaVar.l;
                if (!r6a.b(j, 9223372034707292159L) && !r6a.b(j, i4)) {
                    long c = r6a.c(i4, j);
                    j38 j38Var = lqaVar.e;
                    if (j38Var != null) {
                        long c2 = r6a.c(((r6a) ((eoh) lqaVar.q).getValue()).a, c);
                        lqaVar.d(c2);
                        ((eoh) lqaVar.h).setValue(Boolean.TRUE);
                        lqaVar.g = z;
                        xw3.L(lqaVar.a, null, null, new h2(lqaVar, j38Var, c2, (rq3) null, 2), 3);
                    }
                }
                lqaVar.l = i4;
            }
            i++;
            i2 = i3;
        }
    }

    public rqa() {
        long[] jArr = qrg.a;
        this.b = new x0d();
        y0d y0dVar = rrg.a;
        this.d = new y0d();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new nqa(this);
    }
}
