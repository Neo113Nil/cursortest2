package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import java.util.ArrayList;
import xsna.tk5;
import xsna.tvb0;

/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a {
    public final RecyclerView.f d;
    public final tvb0 a = new tvb0(30);
    public final ArrayList<C0080a> b = new ArrayList<>();
    public final ArrayList<C0080a> c = new ArrayList<>();
    public int f = 0;
    public final c0 e = new c0(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public static final class C0080a {
        public int a;
        public int b;
        public Object c;
        public int d;

        public C0080a(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0080a)) {
                    return false;
                }
                C0080a c0080a = (C0080a) obj;
                int i = this.a;
                if (i != c0080a.a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != c0080a.b || this.b != c0080a.d) {
                    if (this.d != c0080a.d || this.b != c0080a.b) {
                        return false;
                    }
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (!obj2.equals(c0080a.c)) {
                            return false;
                        }
                    } else if (c0080a.c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(X3.j.d);
            int i = this.a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            return tk5.c(sb, this.c, X3.j.e);
        }
    }

    public a(RecyclerView.f fVar) {
        this.d = fVar;
    }

    public final boolean a(int i) {
        ArrayList<C0080a> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0080a c0080a = arrayList.get(i2);
            int i3 = c0080a.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0080a.b;
                    int i5 = c0080a.d + i4;
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
                if (f(c0080a.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0080a> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a(arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0080a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0080a c0080a = arrayList.get(i);
            int i2 = c0080a.a;
            RecyclerView.f fVar = this.d;
            if (i2 == 1) {
                fVar.a(c0080a);
                int i3 = c0080a.b;
                int i4 = c0080a.d;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i3, i4);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                fVar.a(c0080a);
                int i5 = c0080a.b;
                int i6 = c0080a.d;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i5, i6, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.c += i6;
            } else if (i2 == 4) {
                fVar.a(c0080a);
                int i7 = c0080a.b;
                int i8 = c0080a.d;
                Object obj = c0080a.c;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i7, i8, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i2 == 8) {
                fVar.a(c0080a);
                int i9 = c0080a.b;
                int i10 = c0080a.d;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(C0080a c0080a) {
        int i;
        int i2 = c0080a.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int l = l(c0080a.b, i2);
        int i3 = c0080a.b;
        int i4 = c0080a.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0080a);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0080a.d; i6++) {
            int l2 = l((i * i6) + c0080a.b, c0080a.a);
            int i7 = c0080a.a;
            if (i7 == 2 ? l2 != l : !(i7 == 4 && l2 == l + 1)) {
                C0080a h = h(i7, l, i5, c0080a.c);
                e(h, i3);
                h.c = null;
                this.a.a(h);
                if (c0080a.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                l = l2;
            } else {
                i5++;
            }
        }
        Object obj = c0080a.c;
        c0080a.c = null;
        this.a.a(c0080a);
        if (i5 > 0) {
            C0080a h2 = h(c0080a.a, l, i5, obj);
            e(h2, i3);
            h2.c = null;
            this.a.a(h2);
        }
    }

    public final void e(C0080a c0080a, int i) {
        RecyclerView.f fVar = this.d;
        fVar.a(c0080a);
        int i2 = c0080a.a;
        if (i2 == 2) {
            int i3 = c0080a.d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i3, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.c += i3;
            return;
        }
        if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i4 = c0080a.d;
        Object obj = c0080a.c;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i, i4, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int f(int i, int i2) {
        ArrayList<C0080a> arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            C0080a c0080a = arrayList.get(i2);
            int i3 = c0080a.a;
            if (i3 == 8) {
                int i4 = c0080a.b;
                if (i4 == i) {
                    i = c0080a.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0080a.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0080a.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0080a.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0080a.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final C0080a h(int i, int i2, int i3, Object obj) {
        C0080a c0080a = (C0080a) this.a.c();
        if (c0080a == null) {
            return new C0080a(i, i2, i3, obj);
        }
        c0080a.a = i;
        c0080a.b = i2;
        c0080a.d = i3;
        c0080a.c = obj;
        return c0080a;
    }

    public final void i(C0080a c0080a) {
        this.c.add(c0080a);
        int i = c0080a.a;
        RecyclerView.f fVar = this.d;
        if (i == 1) {
            int i2 = c0080a.b;
            int i3 = c0080a.d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i2, i3);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c0080a.b;
            int i5 = c0080a.d;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i4, i5, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c0080a.b;
            int i7 = c0080a.d;
            Object obj = c0080a.c;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i6, i7, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c0080a);
        }
        int i8 = c0080a.b;
        int i9 = c0080a.d;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        ArrayList<C0080a> arrayList;
        int i;
        char c;
        Object obj;
        int i2;
        int i3;
        int i4;
        Object obj2;
        boolean z;
        char c2;
        C0080a h;
        int i5;
        int i6;
        C0080a h2;
        boolean z2;
        boolean z3;
        C0080a h3;
        c0 c0Var = this.e;
        c0Var.getClass();
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
                if (arrayList.get(size).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            obj = null;
            i2 = 2;
            i3 = 4;
            if (size == -1) {
                break;
            }
            int i7 = size + 1;
            a aVar = c0Var.a;
            C0080a c0080a = arrayList.get(size);
            C0080a c0080a2 = arrayList.get(i7);
            int i8 = c0080a2.a;
            if (i8 == 1) {
                int i9 = c0080a.d;
                int i10 = c0080a2.b;
                int i11 = i9 < i10 ? -1 : 0;
                int i12 = c0080a.b;
                if (i12 < i10) {
                    i11++;
                }
                if (i10 <= i12) {
                    c0080a.b = i12 + c0080a2.d;
                }
                int i13 = c0080a2.b;
                if (i13 <= i9) {
                    c0080a.d = i9 + c0080a2.d;
                }
                c0080a2.b = i13 + i11;
                arrayList.set(size, c0080a2);
                arrayList.set(i7, c0080a);
            } else if (i8 == 2) {
                int i14 = c0080a.b;
                int i15 = c0080a.d;
                if (i14 < i15) {
                    z3 = c0080a2.b == i14 && c0080a2.d == i15 - i14;
                    z2 = false;
                } else if (c0080a2.b == i15 + 1 && c0080a2.d == i14 - i15) {
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i16 = c0080a2.b;
                if (i15 < i16) {
                    c0080a2.b = i16 - 1;
                } else {
                    int i17 = c0080a2.d;
                    if (i15 < i16 + i17) {
                        c0080a2.d = i17 - 1;
                        c0080a.a = 2;
                        c0080a.d = 1;
                        if (c0080a2.d == 0) {
                            arrayList.remove(i7);
                            c0080a2.c = null;
                            aVar.a.a(c0080a2);
                        }
                    }
                }
                int i18 = c0080a.b;
                int i19 = c0080a2.b;
                if (i18 <= i19) {
                    c0080a2.b = i19 + 1;
                } else {
                    int i20 = i19 + c0080a2.d;
                    if (i18 < i20) {
                        h3 = aVar.h(2, i18 + 1, i20 - i18, null);
                        c0080a2.d = c0080a.b - c0080a2.b;
                        if (z3) {
                            if (z2) {
                                if (h3 != null) {
                                    int i21 = c0080a.b;
                                    if (i21 > h3.b) {
                                        c0080a.b = i21 - h3.d;
                                    }
                                    int i22 = c0080a.d;
                                    if (i22 > h3.b) {
                                        c0080a.d = i22 - h3.d;
                                    }
                                }
                                int i23 = c0080a.b;
                                if (i23 > c0080a2.b) {
                                    c0080a.b = i23 - c0080a2.d;
                                }
                                int i24 = c0080a.d;
                                if (i24 > c0080a2.b) {
                                    c0080a.d = i24 - c0080a2.d;
                                }
                            } else {
                                if (h3 != null) {
                                    int i25 = c0080a.b;
                                    if (i25 >= h3.b) {
                                        c0080a.b = i25 - h3.d;
                                    }
                                    int i26 = c0080a.d;
                                    if (i26 >= h3.b) {
                                        c0080a.d = i26 - h3.d;
                                    }
                                }
                                int i27 = c0080a.b;
                                if (i27 >= c0080a2.b) {
                                    c0080a.b = i27 - c0080a2.d;
                                }
                                int i28 = c0080a.d;
                                if (i28 >= c0080a2.b) {
                                    c0080a.d = i28 - c0080a2.d;
                                }
                            }
                            arrayList.set(size, c0080a2);
                            if (c0080a.b != c0080a.d) {
                                arrayList.set(i7, c0080a);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (h3 != null) {
                                arrayList.add(size, h3);
                            }
                        } else {
                            arrayList.set(size, c0080a2);
                            arrayList.remove(i7);
                            c0080a.c = null;
                            aVar.a.a(c0080a);
                        }
                    }
                }
                h3 = null;
                if (z3) {
                }
            } else if (i8 == 4) {
                int i29 = c0080a.d;
                int i30 = c0080a2.b;
                if (i29 < i30) {
                    c0080a2.b = i30 - 1;
                } else {
                    int i31 = c0080a2.d;
                    if (i29 < i30 + i31) {
                        c0080a2.d = i31 - 1;
                        h = aVar.h(4, c0080a.b, 1, c0080a2.c);
                        i5 = c0080a.b;
                        i6 = c0080a2.b;
                        if (i5 > i6) {
                            c0080a2.b = i6 + 1;
                        } else {
                            int i32 = i6 + c0080a2.d;
                            if (i5 < i32) {
                                int i33 = i32 - i5;
                                h2 = aVar.h(4, i5 + 1, i33, c0080a2.c);
                                c0080a2.d -= i33;
                                arrayList.set(i7, c0080a);
                                if (c0080a2.d > 0) {
                                    arrayList.set(size, c0080a2);
                                } else {
                                    arrayList.remove(size);
                                    c0080a2.c = null;
                                    aVar.a.a(c0080a2);
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
                        arrayList.set(i7, c0080a);
                        if (c0080a2.d > 0) {
                        }
                        if (h != null) {
                        }
                        if (h2 != null) {
                        }
                    }
                }
                h = null;
                i5 = c0080a.b;
                i6 = c0080a2.b;
                if (i5 > i6) {
                }
                h2 = null;
                arrayList.set(i7, c0080a);
                if (c0080a2.d > 0) {
                }
                if (h != null) {
                }
                if (h2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            C0080a c0080a3 = arrayList.get(i34);
            int i35 = c0080a3.a;
            if (i35 != 1) {
                tvb0 tvb0Var = this.a;
                RecyclerView.f fVar = this.d;
                if (i35 == i2) {
                    int i36 = c0080a3.b;
                    int i37 = c0080a3.d + i36;
                    int i38 = i36;
                    int i39 = 0;
                    char c3 = 65535;
                    while (i38 < i37) {
                        RecyclerView recyclerView = RecyclerView.this;
                        RecyclerView.e0 findViewHolderForPosition = recyclerView.findViewHolderForPosition(i38, true);
                        if (findViewHolderForPosition != null) {
                            if (recyclerView.mChildHelper.c.contains(findViewHolderForPosition.itemView)) {
                                boolean z5 = RecyclerView.sDebugAssertionsEnabled;
                            }
                            if (findViewHolderForPosition == null || a(i38)) {
                                if (c3 != 0) {
                                    d(h(2, i36, i39, null));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    i(h(2, i36, i39, null));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c2 = 0;
                            }
                            if (z) {
                                i39++;
                            } else {
                                i38 -= i39;
                                i37 -= i39;
                                i39 = 1;
                            }
                            i38++;
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
                        i38++;
                        c3 = c2;
                    }
                    obj2 = null;
                    if (i39 != c0080a3.d) {
                        c0080a3.c = null;
                        tvb0Var.a(c0080a3);
                        i4 = 2;
                        c0080a3 = h(2, i36, i39, null);
                    } else {
                        i4 = 2;
                    }
                    if (c3 == 0) {
                        d(c0080a3);
                    } else {
                        i(c0080a3);
                    }
                } else if (i35 != i3) {
                    if (i35 == i) {
                        i(c0080a3);
                    }
                    i4 = i2;
                    obj2 = obj;
                } else {
                    int i40 = c0080a3.b;
                    int i41 = c0080a3.d + i40;
                    int i42 = i40;
                    int i43 = 0;
                    while (i40 < i41) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.e0 findViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i40, true);
                        if (findViewHolderForPosition2 != null) {
                            if (recyclerView2.mChildHelper.c.contains(findViewHolderForPosition2.itemView)) {
                                boolean z6 = RecyclerView.sDebugAssertionsEnabled;
                            }
                            if (findViewHolderForPosition2 == null || a(i40)) {
                                if (c == 0) {
                                    d(h(4, i42, i43, c0080a3.c));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                c = 1;
                            } else {
                                if (c == 1) {
                                    i(h(4, i42, i43, c0080a3.c));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                c = 0;
                            }
                            i43++;
                            i40++;
                        }
                        findViewHolderForPosition2 = null;
                        if (findViewHolderForPosition2 == null) {
                        }
                        if (c == 0) {
                        }
                        c = 1;
                        i43++;
                        i40++;
                    }
                    if (i43 != c0080a3.d) {
                        Object obj3 = c0080a3.c;
                        c0080a3.c = null;
                        tvb0Var.a(c0080a3);
                        c0080a3 = h(4, i42, i43, obj3);
                    }
                    if (c == 0) {
                        d(c0080a3);
                    } else {
                        i(c0080a3);
                    }
                    obj2 = null;
                    i4 = 2;
                }
            } else {
                i4 = i2;
                obj2 = obj;
                i(c0080a3);
            }
            i34++;
            obj = obj2;
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
            C0080a c0080a = (C0080a) arrayList.get(i);
            c0080a.c = null;
            this.a.a(c0080a);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0080a> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0080a c0080a = arrayList.get(size);
            int i5 = c0080a.a;
            if (i5 == 8) {
                int i6 = c0080a.b;
                int i7 = c0080a.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0080a.b = i6 + 1;
                            c0080a.d = i7 + 1;
                        } else if (i2 == 2) {
                            c0080a.b = i6 - 1;
                            c0080a.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0080a.d = i7 + 1;
                    } else if (i2 == 2) {
                        c0080a.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0080a.b = i6 + 1;
                    } else if (i2 == 2) {
                        c0080a.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0080a.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0080a.d;
                    } else if (i5 == 2) {
                        i += c0080a.d;
                    }
                } else if (i2 == 1) {
                    c0080a.b = i8 + 1;
                } else if (i2 == 2) {
                    c0080a.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0080a c0080a2 = arrayList.get(size2);
            if (c0080a2.a == 8) {
                int i9 = c0080a2.d;
                if (i9 == c0080a2.b || i9 < 0) {
                    arrayList.remove(size2);
                    c0080a2.c = null;
                    this.a.a(c0080a2);
                }
            } else if (c0080a2.d <= 0) {
                arrayList.remove(size2);
                c0080a2.c = null;
                this.a.a(c0080a2);
            }
        }
        return i;
    }
}
