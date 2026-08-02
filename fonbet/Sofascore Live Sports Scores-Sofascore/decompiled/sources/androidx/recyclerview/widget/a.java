package androidx.recyclerview.widget;

import defpackage.a70;
import defpackage.e3c;
import defpackage.eh;
import defpackage.is8;
import defpackage.s0f;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a {
    public final k d;
    public final s0f a = new s0f(30);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int f = 0;
    public final e3c e = new e3c(this, 5);

    public a(k kVar) {
        this.d = kVar;
    }

    public final boolean a(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            eh ehVar = (eh) arrayList.get(i2);
            int i3 = ehVar.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = ehVar.b;
                    int i5 = ehVar.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(ehVar.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a((eh) arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        k kVar = this.d;
        RecyclerView recyclerView = kVar.a;
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eh ehVar = (eh) arrayList.get(i);
            int i2 = ehVar.a;
            if (i2 == 1) {
                kVar.a(ehVar);
                recyclerView.offsetPositionRecordsForInsert(ehVar.b, ehVar.d);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                kVar.a(ehVar);
                int i3 = ehVar.b;
                int i4 = ehVar.d;
                recyclerView.offsetPositionRecordsForRemove(i3, i4, true);
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.c += i4;
            } else if (i2 == 4) {
                kVar.a(ehVar);
                recyclerView.viewRangeUpdate(ehVar.b, ehVar.d, ehVar.c);
                recyclerView.mItemsChanged = true;
            } else if (i2 == 8) {
                kVar.a(ehVar);
                recyclerView.offsetPositionRecordsForMove(ehVar.b, ehVar.d);
                recyclerView.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(eh ehVar) {
        int i;
        s0f s0fVar;
        int i2 = ehVar.a;
        if (i2 == 1 || i2 == 8) {
            a70.p("should not dispatch add or move for pre layout");
            return;
        }
        int l = l(ehVar.b, i2);
        int i3 = ehVar.b;
        int i4 = ehVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                is8.c(ehVar, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = ehVar.d;
            s0fVar = this.a;
            if (i5 >= i7) {
                break;
            }
            int l2 = l((i * i5) + ehVar.b, ehVar.a);
            int i8 = ehVar.a;
            if (i8 == 2 ? l2 != l : !(i8 == 4 && l2 == l + 1)) {
                eh h = h(i8, l, i6, ehVar.c);
                e(h, i3);
                h.c = null;
                s0fVar.b(h);
                if (ehVar.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                l = l2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = ehVar.c;
        ehVar.c = null;
        s0fVar.b(ehVar);
        if (i6 > 0) {
            eh h2 = h(ehVar.a, l, i6, obj);
            e(h2, i3);
            h2.c = null;
            s0fVar.b(h2);
        }
    }

    public final void e(eh ehVar, int i) {
        k kVar = this.d;
        RecyclerView recyclerView = kVar.a;
        kVar.a(ehVar);
        int i2 = ehVar.a;
        if (i2 != 2) {
            if (i2 != 4) {
                a70.p("only remove and update ops can be dispatched in first pass");
                return;
            } else {
                recyclerView.viewRangeUpdate(i, ehVar.d, ehVar.c);
                recyclerView.mItemsChanged = true;
                return;
            }
        }
        int i3 = ehVar.d;
        recyclerView.offsetPositionRecordsForRemove(i, i3, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.c += i3;
    }

    public final int f(int i, int i2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            eh ehVar = (eh) arrayList.get(i2);
            int i3 = ehVar.a;
            int i4 = ehVar.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = ehVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (ehVar.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = ehVar.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += ehVar.d;
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final eh h(int i, int i2, int i3, Object obj) {
        eh ehVar = (eh) this.a.c();
        if (ehVar != null) {
            ehVar.a = i;
            ehVar.b = i2;
            ehVar.d = i3;
            ehVar.c = obj;
            return ehVar;
        }
        eh ehVar2 = new eh();
        ehVar2.a = i;
        ehVar2.b = i2;
        ehVar2.d = i3;
        ehVar2.c = obj;
        return ehVar2;
    }

    public final void i(eh ehVar) {
        RecyclerView recyclerView = this.d.a;
        this.c.add(ehVar);
        int i = ehVar.a;
        if (i == 1) {
            recyclerView.offsetPositionRecordsForInsert(ehVar.b, ehVar.d);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            recyclerView.offsetPositionRecordsForRemove(ehVar.b, ehVar.d, false);
            recyclerView.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            recyclerView.viewRangeUpdate(ehVar.b, ehVar.d, ehVar.c);
            recyclerView.mItemsChanged = true;
        } else if (i != 8) {
            is8.c(ehVar, "Unknown update op type for ");
        } else {
            recyclerView.offsetPositionRecordsForMove(ehVar.b, ehVar.d);
            recyclerView.mItemsAddedOrRemoved = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        ArrayList arrayList;
        int i;
        char c;
        int i2;
        int i3;
        int i4;
        boolean z;
        char c2;
        eh h;
        int i5;
        int i6;
        eh h2;
        boolean z2;
        boolean z3;
        Object obj;
        eh ehVar;
        RecyclerView recyclerView = this.d.a;
        while (true) {
            arrayList = this.b;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                c = 65535;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((eh) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            i2 = 2;
            i3 = 4;
            if (size == -1) {
                break;
            }
            int i7 = size + 1;
            a aVar = (a) this.e.b;
            s0f s0fVar = aVar.a;
            eh ehVar2 = (eh) arrayList.get(size);
            eh ehVar3 = (eh) arrayList.get(i7);
            int i8 = ehVar3.a;
            if (i8 == 1) {
                int i9 = ehVar2.d;
                int i10 = ehVar3.b;
                int i11 = i9 < i10 ? -1 : 0;
                int i12 = ehVar2.b;
                if (i12 < i10) {
                    i11++;
                }
                if (i10 <= i12) {
                    ehVar2.b = i12 + ehVar3.d;
                }
                int i13 = ehVar3.b;
                if (i13 <= i9) {
                    ehVar2.d = i9 + ehVar3.d;
                }
                ehVar3.b = i13 + i11;
                arrayList.set(size, ehVar3);
                arrayList.set(i7, ehVar2);
            } else if (i8 == 2) {
                int i14 = ehVar2.b;
                int i15 = ehVar2.d;
                int i16 = ehVar3.b;
                if (i14 < i15) {
                    z3 = i16 == i14 && ehVar3.d == i15 - i14;
                    z2 = false;
                } else if (i16 == i15 + 1 && ehVar3.d == i14 - i15) {
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i15 < i16) {
                    i16--;
                    ehVar3.b = i16;
                } else {
                    int i17 = ehVar3.d;
                    if (i15 < i16 + i17) {
                        ehVar3.d = i17 - 1;
                        ehVar2.a = 2;
                        ehVar2.d = 1;
                        if (ehVar3.d == 0) {
                            arrayList.remove(i7);
                            ehVar3.c = null;
                            s0fVar.b(ehVar3);
                        }
                    }
                }
                int i18 = ehVar2.b;
                if (i18 <= i16) {
                    ehVar3.b = i16 + 1;
                } else {
                    int i19 = i16 + ehVar3.d;
                    if (i18 < i19) {
                        obj = null;
                        eh h3 = aVar.h(2, i18 + 1, i19 - i18, null);
                        ehVar3.d = ehVar2.b - ehVar3.b;
                        ehVar = h3;
                        if (z3) {
                            if (z2) {
                                if (ehVar != null) {
                                    int i20 = ehVar2.b;
                                    if (i20 > ehVar.b) {
                                        ehVar2.b = i20 - ehVar.d;
                                    }
                                    int i21 = ehVar2.d;
                                    if (i21 > ehVar.b) {
                                        ehVar2.d = i21 - ehVar.d;
                                    }
                                }
                                int i22 = ehVar2.b;
                                if (i22 > ehVar3.b) {
                                    ehVar2.b = i22 - ehVar3.d;
                                }
                                int i23 = ehVar2.d;
                                if (i23 > ehVar3.b) {
                                    ehVar2.d = i23 - ehVar3.d;
                                }
                            } else {
                                if (ehVar != null) {
                                    int i24 = ehVar2.b;
                                    if (i24 >= ehVar.b) {
                                        ehVar2.b = i24 - ehVar.d;
                                    }
                                    int i25 = ehVar2.d;
                                    if (i25 >= ehVar.b) {
                                        ehVar2.d = i25 - ehVar.d;
                                    }
                                }
                                int i26 = ehVar2.b;
                                if (i26 >= ehVar3.b) {
                                    ehVar2.b = i26 - ehVar3.d;
                                }
                                int i27 = ehVar2.d;
                                if (i27 >= ehVar3.b) {
                                    ehVar2.d = i27 - ehVar3.d;
                                }
                            }
                            arrayList.set(size, ehVar3);
                            if (ehVar2.b != ehVar2.d) {
                                arrayList.set(i7, ehVar2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (ehVar != null) {
                                arrayList.add(size, ehVar);
                            }
                        } else {
                            arrayList.set(size, ehVar3);
                            arrayList.remove(i7);
                            ehVar2.c = obj;
                            s0fVar.b(ehVar2);
                        }
                    }
                }
                obj = null;
                ehVar = null;
                if (z3) {
                }
            } else if (i8 == 4) {
                int i28 = ehVar2.d;
                int i29 = ehVar3.b;
                if (i28 < i29) {
                    ehVar3.b = i29 - 1;
                } else {
                    int i30 = ehVar3.d;
                    if (i28 < i29 + i30) {
                        ehVar3.d = i30 - 1;
                        h = aVar.h(4, ehVar2.b, 1, ehVar3.c);
                        i5 = ehVar2.b;
                        i6 = ehVar3.b;
                        if (i5 > i6) {
                            ehVar3.b = i6 + 1;
                        } else {
                            int i31 = i6 + ehVar3.d;
                            if (i5 < i31) {
                                int i32 = i31 - i5;
                                h2 = aVar.h(4, i5 + 1, i32, ehVar3.c);
                                ehVar3.d -= i32;
                                arrayList.set(i7, ehVar2);
                                if (ehVar3.d > 0) {
                                    arrayList.set(size, ehVar3);
                                } else {
                                    arrayList.remove(size);
                                    ehVar3.c = null;
                                    s0fVar.b(ehVar3);
                                }
                                if (h != null) {
                                    arrayList.add(size, h);
                                }
                                if (h2 != null) {
                                    arrayList.add(size, h2);
                                }
                            }
                        }
                        h2 = null;
                        arrayList.set(i7, ehVar2);
                        if (ehVar3.d > 0) {
                        }
                        if (h != null) {
                        }
                        if (h2 != null) {
                        }
                    }
                }
                h = null;
                i5 = ehVar2.b;
                i6 = ehVar3.b;
                if (i5 > i6) {
                }
                h2 = null;
                arrayList.set(i7, ehVar2);
                if (ehVar3.d > 0) {
                }
                if (h != null) {
                }
                if (h2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i33 = 0;
        while (i33 < size2) {
            eh ehVar4 = (eh) arrayList.get(i33);
            int i34 = ehVar4.a;
            if (i34 != 1) {
                s0f s0fVar2 = this.a;
                if (i34 == i2) {
                    int i35 = ehVar4.b;
                    int i36 = ehVar4.d + i35;
                    int i37 = i35;
                    int i38 = 0;
                    char c3 = 65535;
                    while (i37 < i36) {
                        u findViewHolderForPosition = recyclerView.findViewHolderForPosition(i37, true);
                        if (findViewHolderForPosition != null) {
                            if (recyclerView.mChildHelper.c.contains(findViewHolderForPosition.itemView)) {
                                int i39 = RecyclerView.HORIZONTAL;
                            }
                            if (findViewHolderForPosition == null || a(i37)) {
                                if (c3 != 0) {
                                    d(h(2, i35, i38, null));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    i(h(2, i35, i38, null));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c2 = 0;
                            }
                            if (z) {
                                i38++;
                            } else {
                                i37 -= i38;
                                i36 -= i38;
                                i38 = 1;
                            }
                            i37++;
                            c3 = c2;
                        }
                        findViewHolderForPosition = null;
                        if (findViewHolderForPosition == null) {
                        }
                        if (c3 != 0) {
                        }
                        c2 = 1;
                        if (z) {
                        }
                        i37++;
                        c3 = c2;
                    }
                    if (i38 != ehVar4.d) {
                        ehVar4.c = null;
                        s0fVar2.b(ehVar4);
                        i4 = 2;
                        ehVar4 = h(2, i35, i38, null);
                    } else {
                        i4 = 2;
                    }
                    if (c3 == 0) {
                        d(ehVar4);
                    } else {
                        i(ehVar4);
                    }
                } else if (i34 != i3) {
                    if (i34 == i) {
                        i(ehVar4);
                    }
                    i4 = i2;
                } else {
                    int i40 = ehVar4.b;
                    int i41 = ehVar4.d + i40;
                    char c4 = c;
                    int i42 = i40;
                    int i43 = 0;
                    while (i40 < i41) {
                        u findViewHolderForPosition2 = recyclerView.findViewHolderForPosition(i40, true);
                        if (findViewHolderForPosition2 != null) {
                            if (recyclerView.mChildHelper.c.contains(findViewHolderForPosition2.itemView)) {
                                int i44 = RecyclerView.HORIZONTAL;
                            }
                            if (findViewHolderForPosition2 == null || a(i40)) {
                                if (c4 == 0) {
                                    d(h(4, i42, i43, ehVar4.c));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                c4 = 1;
                            } else {
                                if (c4 == 1) {
                                    i(h(4, i42, i43, ehVar4.c));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                c4 = 0;
                            }
                            i43++;
                            i40++;
                        }
                        findViewHolderForPosition2 = null;
                        if (findViewHolderForPosition2 == null) {
                        }
                        if (c4 == 0) {
                        }
                        c4 = 1;
                        i43++;
                        i40++;
                    }
                    if (i43 != ehVar4.d) {
                        Object obj2 = ehVar4.c;
                        ehVar4.c = null;
                        s0fVar2.b(ehVar4);
                        ehVar4 = h(4, i42, i43, obj2);
                    }
                    if (c4 == 0) {
                        d(ehVar4);
                    } else {
                        i(ehVar4);
                    }
                    i4 = 2;
                }
            } else {
                i4 = i2;
                i(ehVar4);
            }
            i33++;
            i2 = i4;
            i = 8;
            c = 65535;
            i3 = 4;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eh ehVar = (eh) arrayList.get(i);
            ehVar.c = null;
            this.a.b(ehVar);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            eh ehVar = (eh) arrayList.get(size);
            int i5 = ehVar.a;
            int i6 = ehVar.b;
            if (i5 == 8) {
                int i7 = ehVar.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            ehVar.b = i6 + 1;
                            ehVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            ehVar.b = i6 - 1;
                            ehVar.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        ehVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        ehVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        ehVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        ehVar.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= ehVar.d;
                } else if (i5 == 2) {
                    i += ehVar.d;
                }
            } else if (i2 == 1) {
                ehVar.b = i6 + 1;
            } else if (i2 == 2) {
                ehVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            eh ehVar2 = (eh) arrayList.get(size2);
            int i8 = ehVar2.a;
            int i9 = ehVar2.d;
            s0f s0fVar = this.a;
            if (i8 == 8) {
                if (i9 == ehVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    ehVar2.c = null;
                    s0fVar.b(ehVar2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                ehVar2.c = null;
                s0fVar.b(ehVar2);
            }
        }
        return i;
    }
}
