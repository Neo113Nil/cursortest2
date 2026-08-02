package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import xsna.efz;
import xsna.ggz;
import xsna.hv6;

/* compiled from: DiffUtil.java */
/* loaded from: classes12.dex */
public final class m {
    public static final a a = new a();

    /* compiled from: DiffUtil.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        @Nullable
        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: DiffUtil.java */
    public static class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class d {
        public final ArrayList a;
        public final int[] b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
            int i;
            c cVar;
            int i2;
            this.a = arrayList;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f = newListSize;
            this.g = z;
            c cVar2 = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar2 == null || cVar2.a != 0 || cVar2.b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar3 = (c) it.next();
                for (int i3 = 0; i3 < cVar3.c; i3++) {
                    int i4 = cVar3.a + i3;
                    int i5 = cVar3.b + i3;
                    int i6 = bVar.areContentsTheSame(i4, i5) ? 1 : 2;
                    iArr[i4] = (i5 << 4) | i6;
                    iArr2[i5] = (i4 << 4) | i6;
                }
            }
            if (this.g) {
                Iterator it2 = arrayList.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    while (true) {
                        i = cVar4.a;
                        if (i7 < i) {
                            if (iArr[i7] == 0) {
                                int size = arrayList.size();
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i8 < size) {
                                        cVar = (c) arrayList.get(i8);
                                        while (true) {
                                            i2 = cVar.b;
                                            if (i9 < i2) {
                                                if (iArr2[i9] == 0 && bVar.areItemsTheSame(i7, i9)) {
                                                    int i10 = bVar.areContentsTheSame(i7, i9) ? 8 : 4;
                                                    iArr[i7] = (i9 << 4) | i10;
                                                    iArr2[i9] = i10 | (i7 << 4);
                                                } else {
                                                    i9++;
                                                }
                                            }
                                        }
                                    }
                                    i9 = cVar.c + i2;
                                    i8++;
                                }
                            }
                            i7++;
                        }
                    }
                    i7 = cVar4.c + i;
                }
            }
        }

        @Nullable
        public static f d(ArrayDeque arrayDeque, int i, boolean z) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.a == i && fVar.c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z) {
                    fVar2.b--;
                } else {
                    fVar2.b++;
                }
            }
            return fVar;
        }

        public final int a(int i) {
            int i2 = this.e;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(efz.a(i, i2, "Index out of bounds - passed position = ", ", old list size = "));
            }
            int i3 = this.b[i];
            if ((i3 & 15) == 0) {
                return -1;
            }
            return i3 >> 4;
        }

        public final void b(@NonNull RecyclerView.Adapter adapter) {
            c(new androidx.recyclerview.widget.b(adapter));
        }

        public final void c(@NonNull ggz ggzVar) {
            int[] iArr;
            b bVar;
            int i;
            int i2;
            ArrayList arrayList;
            d dVar = this;
            hv6 hv6Var = ggzVar instanceof hv6 ? (hv6) ggzVar : new hv6(ggzVar);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = dVar.a;
            boolean z = true;
            int size = arrayList2.size() - 1;
            int i3 = dVar.e;
            int i4 = dVar.f;
            int i5 = i3;
            while (size >= 0) {
                c cVar = (c) arrayList2.get(size);
                int i6 = cVar.a;
                int i7 = cVar.c;
                int i8 = i6 + i7;
                int i9 = cVar.b;
                int i10 = i9 + i7;
                while (true) {
                    iArr = dVar.b;
                    bVar = dVar.d;
                    boolean z2 = z;
                    i = 0;
                    if (i5 <= i8) {
                        break;
                    }
                    i5--;
                    int i11 = iArr[i5];
                    if ((i11 & 12) != 0) {
                        arrayList = arrayList2;
                        int i12 = i11 >> 4;
                        f d = d(arrayDeque, i12, false);
                        if (d != null) {
                            int i13 = (i3 - d.b) - 1;
                            hv6Var.onMoved(i5, i13);
                            if ((i11 & 4) != 0) {
                                hv6Var.onChanged(i13, z2 ? 1 : 0, bVar.getChangePayload(i5, i12));
                            }
                        } else {
                            arrayDeque.add(new f(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                        }
                    } else {
                        arrayList = arrayList2;
                        hv6Var.onRemoved(i5, z2 ? 1 : 0);
                        i3--;
                    }
                    arrayList2 = arrayList;
                    z = true;
                }
                ArrayList arrayList3 = arrayList2;
                while (i4 > i10) {
                    i4--;
                    int i14 = dVar.c[i4];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        f d2 = d(arrayDeque, i15, true);
                        if (d2 == null) {
                            arrayDeque.add(new f(i4, i3 - i5, false));
                            i2 = 0;
                        } else {
                            i2 = 0;
                            hv6Var.onMoved((i3 - d2.b) - 1, i5);
                            if ((i14 & 4) != 0) {
                                hv6Var.onChanged(i5, 1, bVar.getChangePayload(i15, i4));
                            }
                        }
                    } else {
                        i2 = i;
                        hv6Var.onInserted(i5, 1);
                        i3++;
                    }
                    dVar = this;
                    i = i2;
                }
                int i16 = i9;
                int i17 = i6;
                while (i < i7) {
                    if ((iArr[i17] & 15) == 2) {
                        hv6Var.onChanged(i17, 1, bVar.getChangePayload(i17, i16));
                    }
                    i17++;
                    i16++;
                    i++;
                }
                size--;
                dVar = this;
                z = true;
                i4 = i9;
                i5 = i6;
                arrayList2 = arrayList3;
            }
            hv6Var.a();
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class e<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class f {
        public final int a;
        public int b;
        public final boolean c;

        public f(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class g {
        public int a;
        public int b;
        public int c;
        public int d;

        public final int a() {
            return this.d - this.c;
        }

        public final int b() {
            return this.b - this.a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public final int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
    }

    @NonNull
    public static d a(@NonNull b bVar, boolean z) {
        int[] iArr;
        int[] iArr2;
        int i;
        h hVar;
        int i2;
        g gVar;
        int i3;
        h hVar2;
        h hVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        g gVar2 = new g();
        int i12 = 0;
        gVar2.a = 0;
        gVar2.b = oldListSize;
        gVar2.c = 0;
        gVar2.d = newListSize;
        arrayList2.add(gVar2);
        int i13 = oldListSize + newListSize;
        int i14 = 1;
        int i15 = (((i13 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i15];
        int i16 = i15 / 2;
        int[] iArr4 = new int[i15];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar3 = (g) arrayList2.remove(arrayList2.size() - i14);
            if (gVar3.b() >= i14 && gVar3.a() >= i14) {
                int a2 = ((gVar3.a() + gVar3.b()) + i14) / 2;
                int i17 = i14 + i16;
                iArr3[i17] = gVar3.a;
                iArr4[i17] = gVar3.b;
                int i18 = i12;
                while (i18 < a2) {
                    int i19 = Math.abs(gVar3.b() - gVar3.a()) % 2 == i14 ? i14 : i12;
                    int b2 = gVar3.b() - gVar3.a();
                    int i20 = -i18;
                    int i21 = i20;
                    while (true) {
                        if (i21 > i18) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i3 = i12;
                            i = i16;
                            hVar2 = null;
                            break;
                        }
                        if (i21 == i20 || (i21 != i18 && iArr3[i21 + 1 + i16] > iArr3[(i21 - 1) + i16])) {
                            i8 = iArr3[i21 + 1 + i16];
                            i9 = i8;
                        } else {
                            i8 = iArr3[(i21 - 1) + i16];
                            i9 = i8 + 1;
                        }
                        iArr = iArr4;
                        int i22 = ((i9 - gVar3.a) + gVar3.c) - i21;
                        if (i18 == 0 || i9 != i8) {
                            i10 = i22;
                        } else {
                            i10 = i22;
                            i22--;
                        }
                        int i23 = i10;
                        iArr2 = iArr3;
                        int i24 = i9;
                        int i25 = i23;
                        i = i16;
                        while (i24 < gVar3.b && i25 < gVar3.d && bVar.areItemsTheSame(i24, i25)) {
                            i24++;
                            i25++;
                        }
                        iArr2[i21 + i] = i24;
                        if (i19 != 0) {
                            int i26 = b2 - i21;
                            i11 = i21;
                            if (i26 >= i20 + 1 && i26 <= i18 - 1 && iArr[i26 + i] <= i24) {
                                hVar2 = new h();
                                hVar2.a = i8;
                                hVar2.b = i22;
                                hVar2.c = i24;
                                hVar2.d = i25;
                                i3 = 0;
                                hVar2.e = false;
                                break;
                            }
                        } else {
                            i11 = i21;
                        }
                        i21 = i11 + 2;
                        i12 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i16 = i;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        break;
                    }
                    int i27 = (gVar3.b() - gVar3.a()) % 2 == 0 ? 1 : i3;
                    int b3 = gVar3.b() - gVar3.a();
                    int i28 = i20;
                    while (true) {
                        if (i28 > i18) {
                            hVar3 = null;
                            break;
                        }
                        if (i28 == i20 || (i28 != i18 && iArr[i28 + 1 + i] < iArr[(i28 - 1) + i])) {
                            i4 = iArr[i28 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr[(i28 - 1) + i];
                            i5 = i4 - 1;
                        }
                        int i29 = gVar3.d - ((gVar3.b - i5) - i28);
                        int i30 = (i18 == 0 || i5 != i4) ? i29 : i29 + 1;
                        while (i5 > gVar3.a && i29 > gVar3.c) {
                            i6 = i27;
                            if (!bVar.areItemsTheSame(i5 - 1, i29 - 1)) {
                                break;
                            }
                            i5--;
                            i29--;
                            i27 = i6;
                        }
                        i6 = i27;
                        iArr[i28 + i] = i5;
                        if (i6 != 0 && (i7 = b3 - i28) >= i20 && i7 <= i18 && iArr2[i7 + i] >= i5) {
                            hVar3 = new h();
                            hVar3.a = i5;
                            hVar3.b = i29;
                            hVar3.c = i4;
                            hVar3.d = i30;
                            hVar3.e = true;
                            break;
                        }
                        i28 += 2;
                        i27 = i6;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i18++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i16 = i;
                    i14 = 1;
                    i12 = 0;
                }
            }
            iArr = iArr4;
            iArr2 = iArr3;
            i = i16;
            hVar = null;
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i31 = hVar.d;
                    int i32 = hVar.b;
                    int i33 = i31 - i32;
                    int i34 = hVar.c;
                    int i35 = hVar.a;
                    int i36 = i34 - i35;
                    arrayList.add(i33 != i36 ? hVar.e ? new c(i35, i32, hVar.a()) : i33 > i36 ? new c(i35, i32 + 1, hVar.a()) : new c(i35 + 1, i32, hVar.a()) : new c(i35, i32, i36));
                }
                if (arrayList3.isEmpty()) {
                    gVar = new g();
                    i2 = 1;
                } else {
                    i2 = 1;
                    gVar = (g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.a = gVar3.a;
                gVar.c = gVar3.c;
                gVar.b = hVar.a;
                gVar.d = hVar.b;
                arrayList2.add(gVar);
                gVar3.b = gVar3.b;
                gVar3.d = gVar3.d;
                gVar3.a = hVar.c;
                gVar3.c = hVar.d;
                arrayList2.add(gVar3);
            } else {
                i2 = 1;
                arrayList3.add(gVar3);
            }
            iArr4 = iArr;
            i14 = i2;
            iArr3 = iArr2;
            i16 = i;
            i12 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, a);
        return new d(bVar, arrayList, iArr3, iArr5, z);
    }
}
