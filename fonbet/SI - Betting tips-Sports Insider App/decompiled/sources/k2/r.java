package k2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18747a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18748b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18749c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18750d;

    /* renamed from: e, reason: collision with root package name */
    public List f18751e;

    /* renamed from: f, reason: collision with root package name */
    public Object f18752f;

    /* renamed from: g, reason: collision with root package name */
    public Object f18753g;

    /* renamed from: h, reason: collision with root package name */
    public Object f18754h;

    public static final void a(r rVar, s2.a aVar) {
        Object h10;
        j1.f fVar = (j1.f) rVar.f18750d;
        f(aVar);
        b bVar = (b) rVar.f18749c;
        t tVar = bVar.f18636g;
        t tVar2 = t.f18775c;
        if (tVar == tVar2) {
            h8.b.l(aVar, "PRAGMA journal_mode = WAL");
        } else {
            h8.b.l(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (bVar.f18636g == tVar2) {
            h8.b.l(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            h8.b.l(aVar, "PRAGMA synchronous = FULL");
        }
        s2.c r02 = aVar.r0("PRAGMA user_version");
        try {
            r02.n0();
            int i5 = (int) r02.getLong(0);
            u6.h.g(r02, null);
            int i10 = fVar.f18198a;
            if (i5 != i10) {
                h8.b.l(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    gf.o oVar = gf.q.f10031a;
                    if (i5 == 0) {
                        rVar.j(aVar);
                    } else {
                        rVar.k(aVar, i5, i10);
                    }
                    h8.b.l(aVar, "PRAGMA user_version = " + i10);
                    h10 = Unit.f19194a;
                } catch (Throwable th2) {
                    gf.o oVar2 = gf.q.f10031a;
                    h10 = h8.b.h(th2);
                }
                if (!(h10 instanceof gf.p)) {
                    h8.b.l(aVar, "END TRANSACTION");
                }
                Throwable a7 = gf.q.a(h10);
                if (a7 != null) {
                    h8.b.l(aVar, "ROLLBACK TRANSACTION");
                    throw a7;
                }
            }
            rVar.l(aVar);
        } finally {
        }
    }

    public static void f(s2.a aVar) {
        s2.c r02 = aVar.r0("PRAGMA busy_timeout");
        try {
            r02.n0();
            long j = r02.getLong(0);
            u6.h.g(r02, null);
            if (j < 3000) {
                h8.b.l(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                u6.h.g(r02, th2);
                throw th3;
            }
        }
    }

    public void b(y.e eVar, int i5, ArrayList arrayList, y.k kVar) {
        y.n nVar = eVar.f25492d;
        y.k kVar2 = nVar.f25515c;
        y.e eVar2 = nVar.f25521i;
        y.e eVar3 = nVar.f25520h;
        if (kVar2 == null) {
            x.e eVar4 = (x.e) this.f18749c;
            if (nVar == eVar4.f25299d || nVar == eVar4.f25301e) {
                return;
            }
            if (kVar == null) {
                kVar = new y.k();
                kVar.f25503a = null;
                kVar.f25504b = new ArrayList();
                kVar.f25503a = nVar;
                arrayList.add(kVar);
            }
            nVar.f25515c = kVar;
            kVar.f25504b.add(nVar);
            Iterator it = eVar3.f25498k.iterator();
            while (it.hasNext()) {
                y.d dVar = (y.d) it.next();
                if (dVar instanceof y.e) {
                    b((y.e) dVar, i5, arrayList, kVar);
                }
            }
            Iterator it2 = eVar2.f25498k.iterator();
            while (it2.hasNext()) {
                y.d dVar2 = (y.d) it2.next();
                if (dVar2 instanceof y.e) {
                    b((y.e) dVar2, i5, arrayList, kVar);
                }
            }
            if (i5 == 1 && (nVar instanceof y.l)) {
                Iterator it3 = ((y.l) nVar).f25505k.f25498k.iterator();
                while (it3.hasNext()) {
                    y.d dVar3 = (y.d) it3.next();
                    if (dVar3 instanceof y.e) {
                        b((y.e) dVar3, i5, arrayList, kVar);
                    }
                }
            }
            Iterator it4 = eVar3.f25499l.iterator();
            while (it4.hasNext()) {
                b((y.e) it4.next(), i5, arrayList, kVar);
            }
            Iterator it5 = eVar2.f25499l.iterator();
            while (it5.hasNext()) {
                b((y.e) it5.next(), i5, arrayList, kVar);
            }
            if (i5 == 1 && (nVar instanceof y.l)) {
                Iterator it6 = ((y.l) nVar).f25505k.f25499l.iterator();
                while (it6.hasNext()) {
                    b((y.e) it6.next(), i5, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x000a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(x.e eVar) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        r rVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList = eVar.f25330q0;
        int[] iArr = eVar.f25320p0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            int[] iArr2 = dVar.f25320p0;
            x.c[] cVarArr = dVar.Q;
            x.c cVar = dVar.L;
            x.c cVar2 = dVar.J;
            x.c cVar3 = dVar.K;
            x.c cVar4 = dVar.I;
            int i26 = iArr2[0];
            int i27 = iArr2[1];
            if (dVar.f25305g0 == 8) {
                dVar.f25293a = true;
            } else {
                float f6 = dVar.f25326w;
                if (f6 < 1.0f && i26 == 3) {
                    dVar.f25321r = 2;
                }
                float f10 = dVar.f25329z;
                if (f10 < 1.0f && i27 == 3) {
                    dVar.f25322s = 2;
                }
                if (dVar.W > 0.0f) {
                    if (i26 == 3 && (i27 == 2 || i27 == 1)) {
                        dVar.f25321r = 3;
                    } else if (i27 == 3 && (i26 == 2 || i26 == 1)) {
                        dVar.f25322s = 3;
                    } else if (i26 == 3 && i27 == 3) {
                        if (dVar.f25321r == 0) {
                            dVar.f25321r = 3;
                        }
                        if (dVar.f25322s == 0) {
                            dVar.f25322s = 3;
                        }
                    }
                }
                if (i26 == 3 && dVar.f25321r == 1 && (cVar4.f25289f == null || cVar3.f25289f == null)) {
                    i26 = 2;
                }
                if (i27 == 3 && dVar.f25322s == 1 && (cVar2.f25289f == null || cVar.f25289f == null)) {
                    i27 = 2;
                }
                y.j jVar = dVar.f25299d;
                jVar.f25516d = i26;
                int i28 = dVar.f25321r;
                jVar.f25513a = i28;
                y.l lVar = dVar.f25301e;
                lVar.f25516d = i27;
                int i29 = dVar.f25322s;
                lVar.f25513a = i29;
                if (i26 != 4 && i26 != 1) {
                    i16 = 2;
                    if (i26 != 2) {
                        if (i26 == 3) {
                            i17 = i27;
                            i18 = 1;
                        } else if (i27 != i16 && i27 != 1) {
                            i17 = i27;
                            i19 = 3;
                            i18 = 1;
                            if (i17 == i19) {
                            }
                            i24 = 3;
                            if (i23 != i24) {
                            }
                        } else if (i28 == 3) {
                            if (i27 == i16) {
                                h(i16, 0, i16, 0, dVar);
                            }
                            int k6 = dVar.k();
                            h(1, (int) ((k6 * dVar.W) + 0.5f), 1, k6, dVar);
                            dVar.f25299d.f25517e.d(dVar.q());
                            dVar.f25301e.f25517e.d(dVar.k());
                            dVar.f25293a = true;
                        } else {
                            int i30 = i16;
                            if (i28 == 1) {
                                h(i30, 0, i27, 0, dVar);
                                dVar.f25299d.f25517e.f25500m = dVar.q();
                            } else {
                                i16 = i30;
                                if (i28 == 2) {
                                    int i31 = iArr[0];
                                    if (i31 == 1 || i31 == 4) {
                                        h(1, (int) ((f6 * eVar.q()) + 0.5f), i27, dVar.k(), dVar);
                                        dVar.f25299d.f25517e.d(dVar.q());
                                        dVar.f25301e.f25517e.d(dVar.k());
                                        dVar.f25293a = true;
                                    } else {
                                        i18 = 1;
                                        i17 = i27;
                                    }
                                } else {
                                    i18 = 1;
                                    i17 = i27;
                                    if (cVarArr[0].f25289f == null || cVarArr[1].f25289f == null) {
                                        h(i16, 0, i17, 0, dVar);
                                        dVar.f25299d.f25517e.d(dVar.q());
                                        dVar.f25301e.f25517e.d(dVar.k());
                                        dVar.f25293a = true;
                                    }
                                }
                                if (i17 == i19) {
                                    i20 = i17;
                                    i21 = i16;
                                    i22 = 1;
                                    i23 = i26;
                                } else if (i26 != i16 && i26 != i18) {
                                    i24 = i19;
                                    i20 = i17;
                                    i21 = i16;
                                    i22 = 1;
                                    i23 = i26;
                                    if (i23 != i24 && i20 == i24) {
                                        if (i28 != i22 || i29 == i22) {
                                            h(i21, 0, i21, 0, dVar);
                                            dVar.f25299d.f25517e.f25500m = dVar.q();
                                            dVar.f25301e.f25517e.f25500m = dVar.k();
                                        } else if (i29 == 2 && i28 == 2 && iArr[0] == i18 && iArr[i22] == i18) {
                                            h(i18, (int) ((f6 * eVar.q()) + 0.5f), i18, (int) ((f10 * eVar.k()) + 0.5f), dVar);
                                            dVar.f25299d.f25517e.d(dVar.q());
                                            dVar.f25301e.f25517e.d(dVar.k());
                                            dVar.f25293a = true;
                                        }
                                    }
                                } else if (i29 == i19) {
                                    if (i26 == i16) {
                                        i25 = i18;
                                        h(i16, 0, i16, 0, dVar);
                                    } else {
                                        i25 = i18;
                                    }
                                    int q = dVar.q();
                                    float f11 = dVar.W;
                                    if (dVar.X == -1) {
                                        f11 = 1.0f / f11;
                                    }
                                    h(i25, q, i25, (int) ((q * f11) + 0.5f), dVar);
                                    dVar.f25299d.f25517e.d(dVar.q());
                                    dVar.f25301e.f25517e.d(dVar.k());
                                    dVar.f25293a = true;
                                } else {
                                    int i32 = i17;
                                    int i33 = i18;
                                    int i34 = i16;
                                    if (i29 == 1) {
                                        h(i26, 0, i34, 0, dVar);
                                        dVar.f25301e.f25517e.f25500m = dVar.k();
                                    } else {
                                        int i35 = i26;
                                        if (i29 == 2) {
                                            int i36 = iArr[1];
                                            if (i36 == i33 || i36 == 4) {
                                                h(i35, dVar.q(), i33, (int) ((f10 * eVar.k()) + 0.5f), dVar);
                                                dVar.f25299d.f25517e.d(dVar.q());
                                                dVar.f25301e.f25517e.d(dVar.k());
                                                dVar.f25293a = true;
                                            } else {
                                                i20 = i32;
                                                i23 = i35;
                                                i18 = i33;
                                                i21 = i34;
                                                i22 = 1;
                                            }
                                        } else {
                                            i23 = i35;
                                            i18 = i33;
                                            if (cVarArr[2].f25289f == null || cVarArr[3].f25289f == null) {
                                                h(i34, 0, i32, 0, dVar);
                                                dVar.f25299d.f25517e.d(dVar.q());
                                                dVar.f25301e.f25517e.d(dVar.k());
                                                dVar.f25293a = true;
                                            } else {
                                                i20 = i32;
                                                i21 = i34;
                                                i22 = 1;
                                            }
                                        }
                                    }
                                }
                                i24 = 3;
                                if (i23 != i24) {
                                    if (i28 != i22) {
                                    }
                                    h(i21, 0, i21, 0, dVar);
                                    dVar.f25299d.f25517e.f25500m = dVar.q();
                                    dVar.f25301e.f25517e.f25500m = dVar.k();
                                }
                            }
                        }
                        i19 = 3;
                        if (i17 == i19) {
                        }
                        i24 = 3;
                        if (i23 != i24) {
                        }
                    }
                }
                if (i27 != 4) {
                    if (i27 != 1) {
                        i16 = 2;
                        if (i27 != 2) {
                            if (i26 == 3) {
                            }
                            i19 = 3;
                            if (i17 == i19) {
                            }
                            i24 = 3;
                            if (i23 != i24) {
                            }
                        }
                    } else {
                        i11 = i27;
                        i5 = 1;
                        i10 = i26;
                        int q3 = dVar.q();
                        if (i10 == 4) {
                            q3 = (eVar.q() - cVar4.f25290g) - cVar3.f25290g;
                            i10 = i5;
                        }
                        int k9 = dVar.k();
                        if (i11 != 4) {
                            i12 = (eVar.k() - cVar2.f25290g) - cVar.f25290g;
                            i13 = i5;
                            rVar = this;
                            i14 = q3;
                            i15 = i10;
                        } else {
                            i12 = k9;
                            i13 = i11;
                            i14 = q3;
                            i15 = i10;
                            rVar = this;
                        }
                        rVar.h(i15, i14, i13, i12, dVar);
                        dVar.f25299d.f25517e.d(dVar.q());
                        dVar.f25301e.f25517e.d(dVar.k());
                        dVar.f25293a = true;
                    }
                }
                i11 = i27;
                i10 = i26;
                i5 = 1;
                int q32 = dVar.q();
                if (i10 == 4) {
                }
                int k92 = dVar.k();
                if (i11 != 4) {
                }
                rVar.h(i15, i14, i13, i12, dVar);
                dVar.f25299d.f25517e.d(dVar.q());
                dVar.f25301e.f25517e.d(dVar.k());
                dVar.f25293a = true;
            }
        }
    }

    public void d() {
        x.e eVar = (x.e) this.f18749c;
        ArrayList arrayList = (ArrayList) this.f18754h;
        ArrayList arrayList2 = (ArrayList) this.f18751e;
        arrayList2.clear();
        x.e eVar2 = (x.e) this.f18750d;
        eVar2.f25299d.f();
        eVar2.f25301e.f();
        arrayList2.add(eVar2.f25299d);
        arrayList2.add(eVar2.f25301e);
        Iterator it = eVar2.f25330q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            if (dVar instanceof x.h) {
                y.h hVar = new y.h(dVar);
                dVar.f25299d.f();
                dVar.f25301e.f();
                hVar.f25518f = ((x.h) dVar).f25366u0;
                arrayList2.add(hVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f25295b == null) {
                        dVar.f25295b = new y.c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f25295b);
                } else {
                    arrayList2.add(dVar.f25299d);
                }
                if (dVar.y()) {
                    if (dVar.f25297c == null) {
                        dVar.f25297c = new y.c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f25297c);
                } else {
                    arrayList2.add(dVar.f25301e);
                }
                if (dVar instanceof x.i) {
                    arrayList2.add(new y.i(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((y.n) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            y.n nVar = (y.n) it3.next();
            if (nVar.f25514b != eVar2) {
                nVar.d();
            }
        }
        arrayList.clear();
        g(eVar.f25299d, 0, arrayList);
        g(eVar.f25301e, 1, arrayList);
        this.f18747a = false;
    }

    public int e(x.e eVar, int i5) {
        ArrayList arrayList;
        int i10;
        long max;
        float f6;
        x.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f18754h;
        int size = arrayList2.size();
        long j = 0;
        int i11 = 0;
        long j6 = 0;
        while (i11 < size) {
            y.n nVar = ((y.k) arrayList2.get(i11)).f25503a;
            if (!(nVar instanceof y.c) ? !(i5 != 0 ? (nVar instanceof y.l) : (nVar instanceof y.j)) : ((y.c) nVar).f25518f != i5) {
                y.e eVar3 = (i5 == 0 ? eVar2.f25299d : eVar2.f25301e).f25520h;
                y.e eVar4 = (i5 == 0 ? eVar2.f25299d : eVar2.f25301e).f25521i;
                y.e eVar5 = nVar.f25520h;
                y.e eVar6 = nVar.f25521i;
                boolean contains = eVar5.f25499l.contains(eVar3);
                boolean contains2 = eVar6.f25499l.contains(eVar4);
                long j10 = nVar.j();
                if (contains && contains2) {
                    long b10 = y.k.b(eVar5, j);
                    long a7 = y.k.a(eVar6, j);
                    long j11 = b10 - j10;
                    int i12 = eVar6.f25494f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j11 >= (-i12)) {
                        j11 += i12;
                    }
                    long j12 = eVar5.f25494f;
                    long j13 = ((-a7) - j10) - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    x.d dVar = nVar.f25514b;
                    if (i5 == 0) {
                        f6 = dVar.f25300d0;
                    } else if (i5 == 1) {
                        f6 = dVar.e0;
                    } else {
                        dVar.getClass();
                        f6 = -1.0f;
                    }
                    float f10 = f6 > 0.0f ? (long) ((j11 / (1.0f - f6)) + (j13 / f6)) : 0L;
                    max = (eVar5.f25494f + ((((long) ((f10 * f6) + 0.5f)) + j10) + ((long) d9.e.w(1.0f, f6, f10, 0.5f)))) - eVar6.f25494f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    max = contains ? Math.max(y.k.b(eVar5, eVar5.f25494f), eVar5.f25494f + j10) : contains2 ? Math.max(-y.k.a(eVar6, eVar6.f25494f), (-eVar6.f25494f) + j10) : (nVar.j() + eVar5.f25494f) - eVar6.f25494f;
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                max = j;
            }
            j6 = Math.max(j6, max);
            i11++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i10;
            j = 0;
        }
        return (int) j6;
    }

    public void g(y.n nVar, int i5, ArrayList arrayList) {
        y.e eVar = nVar.f25520h;
        y.e eVar2 = nVar.f25521i;
        Iterator it = eVar.f25498k.iterator();
        while (it.hasNext()) {
            y.d dVar = (y.d) it.next();
            if (dVar instanceof y.e) {
                b((y.e) dVar, i5, arrayList, null);
            } else if (dVar instanceof y.n) {
                b(((y.n) dVar).f25520h, i5, arrayList, null);
            }
        }
        Iterator it2 = eVar2.f25498k.iterator();
        while (it2.hasNext()) {
            y.d dVar2 = (y.d) it2.next();
            if (dVar2 instanceof y.e) {
                b((y.e) dVar2, i5, arrayList, null);
            } else if (dVar2 instanceof y.n) {
                b(((y.n) dVar2).f25521i, i5, arrayList, null);
            }
        }
        if (i5 == 1) {
            Iterator it3 = ((y.l) nVar).f25505k.f25498k.iterator();
            while (it3.hasNext()) {
                y.d dVar3 = (y.d) it3.next();
                if (dVar3 instanceof y.e) {
                    b((y.e) dVar3, i5, arrayList, null);
                }
            }
        }
    }

    public void h(int i5, int i10, int i11, int i12, x.d dVar) {
        y.b bVar = (y.b) this.f18753g;
        bVar.f25478a = i5;
        bVar.f25479b = i11;
        bVar.f25480c = i10;
        bVar.f25481d = i12;
        ((androidx.constraintlayout.widget.e) this.f18752f).b(dVar, bVar);
        dVar.O(bVar.f25482e);
        dVar.L(bVar.f25483f);
        dVar.E = bVar.f25485h;
        dVar.I(bVar.f25484g);
    }

    public void i() {
        y.a aVar;
        Iterator it = ((x.e) this.f18749c).f25330q0.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            if (!dVar.f25293a) {
                int[] iArr = dVar.f25320p0;
                boolean z5 = false;
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = dVar.f25321r;
                int i12 = dVar.f25322s;
                boolean z7 = i5 == 2 || (i5 == 3 && i11 == 1);
                if (i10 == 2 || (i10 == 3 && i12 == 1)) {
                    z5 = true;
                }
                y.f fVar = dVar.f25299d.f25517e;
                boolean z10 = fVar.j;
                y.f fVar2 = dVar.f25301e.f25517e;
                boolean z11 = fVar2.j;
                boolean z12 = z7;
                if (z10 && z11) {
                    h(1, fVar.f25495g, 1, fVar2.f25495g, dVar);
                    dVar.f25293a = true;
                } else if (z10 && z5) {
                    h(1, fVar.f25495g, 2, fVar2.f25495g, dVar);
                    if (i10 == 3) {
                        dVar.f25301e.f25517e.f25500m = dVar.k();
                    } else {
                        dVar.f25301e.f25517e.d(dVar.k());
                        dVar.f25293a = true;
                    }
                } else if (z11 && z12) {
                    h(2, fVar.f25495g, 1, fVar2.f25495g, dVar);
                    if (i5 == 3) {
                        dVar.f25299d.f25517e.f25500m = dVar.q();
                    } else {
                        dVar.f25299d.f25517e.d(dVar.q());
                        dVar.f25293a = true;
                    }
                }
                if (dVar.f25293a && (aVar = dVar.f25301e.f25506l) != null) {
                    aVar.d(dVar.f25294a0);
                }
            }
        }
    }

    public void j(s2.a connection) {
        j1.f fVar = (j1.f) this.f18750d;
        Intrinsics.checkNotNullParameter(connection, "connection");
        s2.c r02 = connection.r0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z5 = false;
            if (r02.n0()) {
                if (r02.getLong(0) == 0) {
                    z5 = true;
                }
            }
            u6.h.g(r02, null);
            fVar.a(connection);
            if (!z5) {
                g6.h0 g10 = fVar.g(connection);
                if (!g10.f9847a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g10.f9848b).toString());
                }
            }
            m(connection);
            fVar.c(connection);
            Iterator it = this.f18751e.iterator();
            while (it.hasNext()) {
                ((f3.a) it.next()).getClass();
                Intrinsics.checkNotNullParameter(connection, "connection");
                if (connection instanceof v2.a) {
                    t2.a db2 = ((v2.a) connection).f24390a;
                    Intrinsics.checkNotNullParameter(db2, "db");
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00aa A[EDGE_INSN: B:129:0x00aa->B:113:0x00aa BREAK  A[LOOP:4: B:91:0x002d->B:114:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(s2.a connection, int i5, int i10) {
        Iterable iterable;
        Pair pair;
        boolean z5;
        j1.f fVar = (j1.f) this.f18750d;
        Intrinsics.checkNotNullParameter(connection, "connection");
        b bVar = (b) this.f18749c;
        e3.i iVar = bVar.f18633d;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (i5 == i10) {
            iterable = kotlin.collections.e0.f19204a;
        } else {
            boolean z7 = i10 > i5;
            ArrayList arrayList = new ArrayList();
            int i11 = i5;
            do {
                if (z7) {
                    if (i11 >= i10) {
                        iterable = arrayList;
                        break;
                    }
                    if (z7) {
                        TreeMap treeMap = (TreeMap) iVar.f8523a.get(Integer.valueOf(i11));
                        if (treeMap != null) {
                            pair = new Pair(treeMap, treeMap.keySet());
                            if (pair != null) {
                            }
                        }
                        pair = null;
                        if (pair != null) {
                        }
                    } else {
                        TreeMap treeMap2 = (TreeMap) iVar.f8523a.get(Integer.valueOf(i11));
                        if (treeMap2 != null) {
                            pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                            if (pair != null) {
                                break;
                            }
                            Map map = (Map) pair.f19192a;
                            Iterator it = ((Iterable) pair.f19193b).iterator();
                            while (it.hasNext()) {
                                int intValue = ((Number) it.next()).intValue();
                                if (!z7) {
                                    if (i10 <= intValue && intValue < i11) {
                                        Object obj = map.get(Integer.valueOf(intValue));
                                        Intrinsics.checkNotNull(obj);
                                        arrayList.add(obj);
                                        i11 = intValue;
                                        z5 = true;
                                        break;
                                        break;
                                    }
                                } else if (i11 + 1 <= intValue && intValue <= i10) {
                                    Object obj2 = map.get(Integer.valueOf(intValue));
                                    Intrinsics.checkNotNull(obj2);
                                    arrayList.add(obj2);
                                    i11 = intValue;
                                    z5 = true;
                                    break;
                                }
                            }
                            z5 = false;
                        }
                        pair = null;
                        if (pair != null) {
                        }
                    }
                } else {
                    if (i11 <= i10) {
                        iterable = arrayList;
                        break;
                    }
                    if (z7) {
                    }
                }
            } while (z5);
            iterable = null;
        }
        if (iterable != null) {
            fVar.f(connection);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((n2.b) it2.next()).a(connection);
            }
            g6.h0 g10 = fVar.g(connection);
            if (g10.f9847a) {
                fVar.e(connection);
                m(connection);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + g10.f9848b).toString());
            }
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        boolean z10 = false;
        if (i5 <= i10 || !bVar.f18640l) {
            Set set = bVar.f18641m;
            if (bVar.f18639k && (set == null || !set.contains(Integer.valueOf(i5)))) {
                z10 = true;
            }
        }
        if (z10) {
            throw new IllegalStateException(("A migration from " + i5 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (bVar.f18646s) {
            s2.c r02 = connection.r0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                hf.e b10 = kotlin.collections.t.b();
                while (r02.n0()) {
                    String V = r02.V(0);
                    if (!kotlin.text.z.o(V, "sqlite_", false) && !Intrinsics.areEqual(V, "android_metadata")) {
                        b10.add(new Pair(V, Boolean.valueOf(Intrinsics.areEqual(r02.V(1), "view"))));
                    }
                }
                hf.e a7 = kotlin.collections.t.a(b10);
                u6.h.g(r02, null);
                ListIterator listIterator = a7.listIterator(0);
                while (true) {
                    hf.b bVar2 = (hf.b) listIterator;
                    if (!bVar2.hasNext()) {
                        break;
                    }
                    Pair pair2 = (Pair) bVar2.next();
                    String str = (String) pair2.f19192a;
                    if (((Boolean) pair2.f19193b).booleanValue()) {
                        h8.b.l(connection, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        h8.b.l(connection, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            fVar.b(connection);
        }
        Iterator it3 = this.f18751e.iterator();
        while (it3.hasNext()) {
            ((f3.a) it3.next()).getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof v2.a) {
                t2.a db2 = ((v2.a) connection).f24390a;
                Intrinsics.checkNotNullParameter(db2, "db");
            }
        }
        fVar.a(connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(s2.a connection) {
        boolean z5;
        Object h10;
        g6.h0 g10;
        Intrinsics.checkNotNullParameter(connection, "connection");
        j1.f fVar = (j1.f) this.f18750d;
        s2.c r02 = connection.r0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (r02.n0()) {
                if (r02.getLong(0) != 0) {
                    z5 = true;
                    u6.h.g(r02, null);
                    if (z5) {
                        h8.b.l(connection, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            gf.o oVar = gf.q.f10031a;
                            g10 = fVar.g(connection);
                        } catch (Throwable th2) {
                            gf.o oVar2 = gf.q.f10031a;
                            h10 = h8.b.h(th2);
                        }
                        if (!g10.f9847a) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g10.f9848b).toString());
                        }
                        fVar.e(connection);
                        m(connection);
                        h10 = Unit.f19194a;
                        if (!(h10 instanceof gf.p)) {
                            h8.b.l(connection, "END TRANSACTION");
                        }
                        Throwable a7 = gf.q.a(h10);
                        if (a7 != null) {
                            h8.b.l(connection, "ROLLBACK TRANSACTION");
                            throw a7;
                        }
                    } else {
                        r02 = connection.r0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String V = r02.n0() ? r02.V(0) : null;
                            u6.h.g(r02, null);
                            if (!Intrinsics.areEqual((String) fVar.f18199b, V) && !Intrinsics.areEqual((String) fVar.f18200c, V)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) fVar.f18199b) + ", found: " + V).toString());
                            }
                        } finally {
                        }
                    }
                    fVar.d(connection);
                    for (f3.a aVar : this.f18751e) {
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(connection, "connection");
                        if (connection instanceof v2.a) {
                            t2.a db2 = ((v2.a) connection).f24390a;
                            int i5 = aVar.f9320a;
                            Intrinsics.checkNotNullParameter(db2, "db");
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(db2, "db");
                                    db2.m();
                                    try {
                                        StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                                        ((e3.l) aVar.f9321b).getClass();
                                        sb2.append(System.currentTimeMillis() - f3.r.f9416a);
                                        sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                        db2.p(sb2.toString());
                                        db2.G();
                                        break;
                                    } finally {
                                        db2.S();
                                    }
                                default:
                                    ((a2.f) aVar.f9321b).invoke(db2);
                                    break;
                            }
                        }
                    }
                    this.f18747a = true;
                }
            }
            z5 = false;
            u6.h.g(r02, null);
            if (z5) {
            }
            fVar.d(connection);
            while (r1.hasNext()) {
            }
            this.f18747a = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public void m(s2.a aVar) {
        h8.b.l(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String hash = (String) ((j1.f) this.f18750d).f18199b;
        Intrinsics.checkNotNullParameter(hash, "hash");
        h8.b.l(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
    }
}
