package androidx.recyclerview.widget;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public final v0 f2326d;

    /* renamed from: a, reason: collision with root package name */
    public final p0.d f2323a = new p0.d(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2324b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2325c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f2328f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final c f2327e = new c(this);

    public b(v0 v0Var) {
        this.f2326d = v0Var;
    }

    public final boolean a(int i5) {
        ArrayList arrayList = this.f2325c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f2316a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = aVar.f2317b;
                    int i13 = aVar.f2319d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i5) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(aVar.f2319d, i10 + 1) == i5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f2325c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f2326d.a((a) arrayList.get(i5));
        }
        k(arrayList);
        this.f2328f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f2324b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) arrayList.get(i5);
            int i10 = aVar.f2316a;
            v0 v0Var = this.f2326d;
            if (i10 == 1) {
                v0Var.a(aVar);
                int i11 = aVar.f2317b;
                int i12 = aVar.f2319d;
                RecyclerView recyclerView = v0Var.f2572a;
                recyclerView.offsetPositionRecordsForInsert(i11, i12);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i10 == 2) {
                v0Var.a(aVar);
                int i13 = aVar.f2317b;
                int i14 = aVar.f2319d;
                RecyclerView recyclerView2 = v0Var.f2572a;
                recyclerView2.offsetPositionRecordsForRemove(i13, i14, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f2597c += i14;
            } else if (i10 == 4) {
                v0Var.a(aVar);
                int i15 = aVar.f2317b;
                int i16 = aVar.f2319d;
                Object obj = aVar.f2318c;
                RecyclerView recyclerView3 = v0Var.f2572a;
                recyclerView3.viewRangeUpdate(i15, i16, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i10 == 8) {
                v0Var.a(aVar);
                int i17 = aVar.f2317b;
                int i18 = aVar.f2319d;
                RecyclerView recyclerView4 = v0Var.f2572a;
                recyclerView4.offsetPositionRecordsForMove(i17, i18);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f2328f = 0;
    }

    public final void d(a aVar) {
        int i5;
        p0.d dVar;
        int i10 = aVar.f2316a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int l6 = l(aVar.f2317b, i10);
        int i11 = aVar.f2317b;
        int i12 = aVar.f2316a;
        if (i12 == 2) {
            i5 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i5 = 1;
        }
        int i13 = 1;
        int i14 = 1;
        while (true) {
            int i15 = aVar.f2319d;
            dVar = this.f2323a;
            if (i13 >= i15) {
                break;
            }
            int l10 = l((i5 * i13) + aVar.f2317b, aVar.f2316a);
            int i16 = aVar.f2316a;
            if (i16 == 2 ? l10 != l6 : !(i16 == 4 && l10 == l6 + 1)) {
                a h10 = h(aVar.f2318c, i16, l6, i14);
                e(h10, i11);
                h10.f2318c = null;
                dVar.a(h10);
                if (aVar.f2316a == 4) {
                    i11 += i14;
                }
                i14 = 1;
                l6 = l10;
            } else {
                i14++;
            }
            i13++;
        }
        Object obj = aVar.f2318c;
        aVar.f2318c = null;
        dVar.a(aVar);
        if (i14 > 0) {
            a h11 = h(obj, aVar.f2316a, l6, i14);
            e(h11, i11);
            h11.f2318c = null;
            dVar.a(h11);
        }
    }

    public final void e(a aVar, int i5) {
        v0 v0Var = this.f2326d;
        v0Var.a(aVar);
        RecyclerView recyclerView = v0Var.f2572a;
        int i10 = aVar.f2316a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            recyclerView.viewRangeUpdate(i5, aVar.f2319d, aVar.f2318c);
            recyclerView.mItemsChanged = true;
            return;
        }
        int i11 = aVar.f2319d;
        recyclerView.offsetPositionRecordsForRemove(i5, i11, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f2597c += i11;
    }

    public final int f(int i5, int i10) {
        ArrayList arrayList = this.f2325c;
        int size = arrayList.size();
        while (i10 < size) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f2316a;
            if (i11 == 8) {
                int i12 = aVar.f2317b;
                if (i12 == i5) {
                    i5 = aVar.f2319d;
                } else {
                    if (i12 < i5) {
                        i5--;
                    }
                    if (aVar.f2319d <= i5) {
                        i5++;
                    }
                }
            } else {
                int i13 = aVar.f2317b;
                if (i13 > i5) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.f2319d;
                    if (i5 < i13 + i14) {
                        return -1;
                    }
                    i5 -= i14;
                } else if (i11 == 1) {
                    i5 += aVar.f2319d;
                }
            }
            i10++;
        }
        return i5;
    }

    public final boolean g() {
        return this.f2324b.size() > 0;
    }

    public final a h(Object obj, int i5, int i10, int i11) {
        a aVar = (a) this.f2323a.b();
        if (aVar != null) {
            aVar.f2316a = i5;
            aVar.f2317b = i10;
            aVar.f2319d = i11;
            aVar.f2318c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f2316a = i5;
        aVar2.f2317b = i10;
        aVar2.f2319d = i11;
        aVar2.f2318c = obj;
        return aVar2;
    }

    public final void i(a aVar) {
        this.f2325c.add(aVar);
        int i5 = aVar.f2316a;
        v0 v0Var = this.f2326d;
        if (i5 == 1) {
            int i10 = aVar.f2317b;
            int i11 = aVar.f2319d;
            RecyclerView recyclerView = v0Var.f2572a;
            recyclerView.offsetPositionRecordsForInsert(i10, i11);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i5 == 2) {
            int i12 = aVar.f2317b;
            int i13 = aVar.f2319d;
            RecyclerView recyclerView2 = v0Var.f2572a;
            recyclerView2.offsetPositionRecordsForRemove(i12, i13, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i5 == 4) {
            int i14 = aVar.f2317b;
            int i15 = aVar.f2319d;
            Object obj = aVar.f2318c;
            RecyclerView recyclerView3 = v0Var.f2572a;
            recyclerView3.viewRangeUpdate(i14, i15, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i5 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
        int i16 = aVar.f2317b;
        int i17 = aVar.f2319d;
        RecyclerView recyclerView4 = v0Var.f2572a;
        recyclerView4.offsetPositionRecordsForMove(i16, i17);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        ArrayList arrayList;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        a h10;
        int i14;
        int i15;
        a h11;
        boolean z5;
        boolean z7;
        Object obj;
        a aVar;
        c cVar = this.f2327e;
        cVar.getClass();
        while (true) {
            arrayList = this.f2324b;
            i5 = 1;
            int size = arrayList.size() - 1;
            boolean z10 = false;
            while (true) {
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).f2316a != 8) {
                    z10 = true;
                } else if (z10) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i16 = size + 1;
            b bVar = (b) cVar.f2330a;
            p0.d dVar = bVar.f2323a;
            a aVar2 = (a) arrayList.get(size);
            a aVar3 = (a) arrayList.get(i16);
            int i17 = aVar3.f2316a;
            if (i17 == 1) {
                int i18 = aVar2.f2319d;
                int i19 = aVar3.f2317b;
                int i20 = i18 < i19 ? -1 : 0;
                int i21 = aVar2.f2317b;
                if (i21 < i19) {
                    i20++;
                }
                if (i19 <= i21) {
                    aVar2.f2317b = i21 + aVar3.f2319d;
                }
                int i22 = aVar3.f2317b;
                if (i22 <= i18) {
                    aVar2.f2319d = i18 + aVar3.f2319d;
                }
                aVar3.f2317b = i22 + i20;
                arrayList.set(size, aVar3);
                arrayList.set(i16, aVar2);
            } else if (i17 == 2) {
                int i23 = aVar2.f2317b;
                int i24 = aVar2.f2319d;
                if (i23 < i24) {
                    z7 = aVar3.f2317b == i23 && aVar3.f2319d == i24 - i23;
                    z5 = false;
                } else if (aVar3.f2317b == i24 + 1 && aVar3.f2319d == i23 - i24) {
                    z7 = true;
                    z5 = true;
                } else {
                    z5 = true;
                    z7 = false;
                }
                int i25 = aVar3.f2317b;
                if (i24 < i25) {
                    aVar3.f2317b = i25 - 1;
                } else {
                    int i26 = aVar3.f2319d;
                    if (i24 < i25 + i26) {
                        aVar3.f2319d = i26 - 1;
                        aVar2.f2316a = 2;
                        aVar2.f2319d = 1;
                        if (aVar3.f2319d == 0) {
                            arrayList.remove(i16);
                            aVar3.f2318c = null;
                            dVar.a(aVar3);
                        }
                    }
                }
                int i27 = aVar2.f2317b;
                int i28 = aVar3.f2317b;
                if (i27 <= i28) {
                    aVar3.f2317b = i28 + 1;
                } else {
                    int i29 = i28 + aVar3.f2319d;
                    if (i27 < i29) {
                        obj = null;
                        a h12 = bVar.h(null, 2, i27 + 1, i29 - i27);
                        aVar3.f2319d = aVar2.f2317b - aVar3.f2317b;
                        aVar = h12;
                        if (z7) {
                            if (z5) {
                                if (aVar != null) {
                                    int i30 = aVar2.f2317b;
                                    if (i30 > aVar.f2317b) {
                                        aVar2.f2317b = i30 - aVar.f2319d;
                                    }
                                    int i31 = aVar2.f2319d;
                                    if (i31 > aVar.f2317b) {
                                        aVar2.f2319d = i31 - aVar.f2319d;
                                    }
                                }
                                int i32 = aVar2.f2317b;
                                if (i32 > aVar3.f2317b) {
                                    aVar2.f2317b = i32 - aVar3.f2319d;
                                }
                                int i33 = aVar2.f2319d;
                                if (i33 > aVar3.f2317b) {
                                    aVar2.f2319d = i33 - aVar3.f2319d;
                                }
                            } else {
                                if (aVar != null) {
                                    int i34 = aVar2.f2317b;
                                    if (i34 >= aVar.f2317b) {
                                        aVar2.f2317b = i34 - aVar.f2319d;
                                    }
                                    int i35 = aVar2.f2319d;
                                    if (i35 >= aVar.f2317b) {
                                        aVar2.f2319d = i35 - aVar.f2319d;
                                    }
                                }
                                int i36 = aVar2.f2317b;
                                if (i36 >= aVar3.f2317b) {
                                    aVar2.f2317b = i36 - aVar3.f2319d;
                                }
                                int i37 = aVar2.f2319d;
                                if (i37 >= aVar3.f2317b) {
                                    aVar2.f2319d = i37 - aVar3.f2319d;
                                }
                            }
                            arrayList.set(size, aVar3);
                            if (aVar2.f2317b != aVar2.f2319d) {
                                arrayList.set(i16, aVar2);
                            } else {
                                arrayList.remove(i16);
                            }
                            if (aVar != null) {
                                arrayList.add(size, aVar);
                            }
                        } else {
                            arrayList.set(size, aVar3);
                            arrayList.remove(i16);
                            aVar2.f2318c = obj;
                            dVar.a(aVar2);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z7) {
                }
            } else if (i17 == 4) {
                int i38 = aVar2.f2319d;
                int i39 = aVar3.f2317b;
                if (i38 < i39) {
                    aVar3.f2317b = i39 - 1;
                } else {
                    int i40 = aVar3.f2319d;
                    if (i38 < i39 + i40) {
                        aVar3.f2319d = i40 - 1;
                        h10 = bVar.h(aVar3.f2318c, 4, aVar2.f2317b, 1);
                        i14 = aVar2.f2317b;
                        i15 = aVar3.f2317b;
                        if (i14 > i15) {
                            aVar3.f2317b = i15 + 1;
                        } else {
                            int i41 = i15 + aVar3.f2319d;
                            if (i14 < i41) {
                                int i42 = i41 - i14;
                                h11 = bVar.h(aVar3.f2318c, 4, i14 + 1, i42);
                                aVar3.f2319d -= i42;
                                arrayList.set(i16, aVar2);
                                if (aVar3.f2319d > 0) {
                                    arrayList.set(size, aVar3);
                                } else {
                                    arrayList.remove(size);
                                    aVar3.f2318c = null;
                                    dVar.a(aVar3);
                                }
                                if (h10 != null) {
                                    arrayList.add(size, h10);
                                }
                                if (h11 != null) {
                                    arrayList.add(size, h11);
                                }
                            }
                        }
                        h11 = null;
                        arrayList.set(i16, aVar2);
                        if (aVar3.f2319d > 0) {
                        }
                        if (h10 != null) {
                        }
                        if (h11 != null) {
                        }
                    }
                }
                h10 = null;
                i14 = aVar2.f2317b;
                i15 = aVar3.f2317b;
                if (i14 > i15) {
                }
                h11 = null;
                arrayList.set(i16, aVar2);
                if (aVar3.f2319d > 0) {
                }
                if (h10 != null) {
                }
                if (h11 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i43 = 0;
        while (i43 < size2) {
            a aVar4 = (a) arrayList.get(i43);
            int i44 = aVar4.f2316a;
            if (i44 != i5) {
                p0.d dVar2 = this.f2323a;
                v0 v0Var = this.f2326d;
                if (i44 != 2) {
                    if (i44 == 4) {
                        int i45 = aVar4.f2317b;
                        int i46 = aVar4.f2319d + i45;
                        int i47 = i45;
                        int i48 = -1;
                        int i49 = 0;
                        while (i45 < i46) {
                            if (v0Var.b(i45) != null || a(i45)) {
                                if (i48 == 0) {
                                    d(h(aVar4.f2318c, 4, i47, i49));
                                    i47 = i45;
                                    i49 = 0;
                                }
                                i48 = i5;
                            } else {
                                if (i48 == i5) {
                                    i(h(aVar4.f2318c, 4, i47, i49));
                                    i47 = i45;
                                    i49 = 0;
                                }
                                i48 = 0;
                            }
                            i49 += i5;
                            i45++;
                        }
                        if (i49 != aVar4.f2319d) {
                            Object obj2 = aVar4.f2318c;
                            aVar4.f2318c = null;
                            dVar2.a(aVar4);
                            aVar4 = h(obj2, 4, i47, i49);
                        }
                        if (i48 == 0) {
                            d(aVar4);
                        } else {
                            i(aVar4);
                        }
                    } else if (i44 == i10) {
                        i(aVar4);
                    }
                    i11 = i5;
                } else {
                    int i50 = aVar4.f2317b;
                    int i51 = aVar4.f2319d + i50;
                    int i52 = i50;
                    int i53 = -1;
                    int i54 = 0;
                    while (i52 < i51) {
                        if (v0Var.b(i52) != null || a(i52)) {
                            i12 = i5;
                            if (i53 == 0) {
                                d(h(null, 2, i50, i54));
                                i13 = i12;
                            } else {
                                i13 = 0;
                            }
                            i53 = i12;
                        } else {
                            i12 = i5;
                            if (i53 == i5) {
                                i(h(null, 2, i50, i54));
                                i13 = i12;
                            } else {
                                i13 = 0;
                            }
                            i53 = 0;
                        }
                        if (i13 != 0) {
                            i52 -= i54;
                            i51 -= i54;
                            i54 = i12;
                        } else {
                            i54++;
                        }
                        i52++;
                        i5 = i12;
                    }
                    i11 = i5;
                    if (i54 != aVar4.f2319d) {
                        aVar4.f2318c = null;
                        dVar2.a(aVar4);
                        aVar4 = h(null, 2, i50, i54);
                    }
                    if (i53 == 0) {
                        d(aVar4);
                    } else {
                        i(aVar4);
                    }
                }
            } else {
                i11 = i5;
                i(aVar4);
            }
            i43++;
            i5 = i11;
            i10 = 8;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) arrayList.get(i5);
            aVar.f2318c = null;
            this.f2323a.a(aVar);
        }
        arrayList.clear();
    }

    public final int l(int i5, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.f2325c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i13 = aVar.f2316a;
            if (i13 == 8) {
                int i14 = aVar.f2317b;
                int i15 = aVar.f2319d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i5 < i12 || i5 > i11) {
                    if (i5 < i14) {
                        if (i10 == 1) {
                            aVar.f2317b = i14 + 1;
                            aVar.f2319d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.f2317b = i14 - 1;
                            aVar.f2319d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        aVar.f2319d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f2319d = i15 - 1;
                    }
                    i5++;
                } else {
                    if (i10 == 1) {
                        aVar.f2317b = i14 + 1;
                    } else if (i10 == 2) {
                        aVar.f2317b = i14 - 1;
                    }
                    i5--;
                }
            } else {
                int i16 = aVar.f2317b;
                if (i16 <= i5) {
                    if (i13 == 1) {
                        i5 -= aVar.f2319d;
                    } else if (i13 == 2) {
                        i5 += aVar.f2319d;
                    }
                } else if (i10 == 1) {
                    aVar.f2317b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f2317b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            int i17 = aVar2.f2316a;
            p0.d dVar = this.f2323a;
            if (i17 == 8) {
                int i18 = aVar2.f2319d;
                if (i18 == aVar2.f2317b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f2318c = null;
                    dVar.a(aVar2);
                }
            } else if (aVar2.f2319d <= 0) {
                arrayList.remove(size2);
                aVar2.f2318c = null;
                dVar.a(aVar2);
            }
        }
        return i5;
    }
}
