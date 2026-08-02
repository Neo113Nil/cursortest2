package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i25 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final o02 d;
    public final int e;
    public final int f;
    public final boolean g;

    public i25(o02 o02Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        h25 h25Var;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = o02Var;
        int X = o02Var.X();
        this.e = X;
        int W = o02Var.W();
        this.f = W;
        this.g = true;
        h25 h25Var2 = arrayList.isEmpty() ? null : (h25) arrayList.get(0);
        if (h25Var2 == null || h25Var2.a != 0 || h25Var2.b != 0) {
            arrayList.add(0, new h25(0, 0, 0));
        }
        arrayList.add(new h25(X, W, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h25 h25Var3 = (h25) it.next();
            for (int i3 = 0; i3 < h25Var3.c; i3++) {
                int i4 = h25Var3.a + i3;
                int i5 = h25Var3.b + i3;
                int i6 = o02Var.H(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                h25 h25Var4 = (h25) it2.next();
                while (true) {
                    i = h25Var4.a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    h25Var = (h25) arrayList.get(i8);
                                    while (true) {
                                        i2 = h25Var.b;
                                        if (i9 < i2) {
                                            if (iArr2[i9] == 0 && o02Var.I(i7, i9)) {
                                                int i10 = o02Var.H(i7, i9) ? 8 : 4;
                                                iArr[i7] = (i9 << 4) | i10;
                                                iArr2[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = h25Var.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = h25Var4.c + i;
            }
        }
    }

    public static k25 c(ArrayDeque arrayDeque, int i, boolean z) {
        k25 k25Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                k25Var = null;
                break;
            }
            k25Var = (k25) it.next();
            if (k25Var.a == i && k25Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            k25 k25Var2 = (k25) it.next();
            if (z) {
                k25Var2.b--;
            } else {
                k25Var2.b++;
            }
        }
        return k25Var;
    }

    public final int a(int i) {
        int i2 = this.e;
        if (i < 0 || i >= i2) {
            zzl.r(dmi.k(i, i2, "Index out of bounds - passed position = ", ", old list size = "));
            return 0;
        }
        int i3 = this.b[i];
        if ((i3 & 15) == 0) {
            return -1;
        }
        return i3 >> 4;
    }

    public final void b(xcb xcbVar) {
        int[] iArr;
        o02 o02Var;
        int i;
        int i2;
        ArrayList arrayList;
        i25 i25Var = this;
        ft1 ft1Var = xcbVar instanceof ft1 ? (ft1) xcbVar : new ft1(xcbVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = i25Var.a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = i25Var.e;
        int i4 = i25Var.f;
        int i5 = i3;
        while (size >= 0) {
            h25 h25Var = (h25) arrayList2.get(size);
            int i6 = h25Var.a;
            int i7 = h25Var.c;
            int i8 = i6 + i7;
            int i9 = h25Var.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = i25Var.b;
                o02Var = i25Var.d;
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
                    k25 c = c(arrayDeque, i12, false);
                    if (c != null) {
                        int i13 = (i3 - c.b) - 1;
                        ft1Var.h(i5, i13);
                        if ((i11 & 4) != 0) {
                            ft1Var.g(i13, z2 ? 1 : 0, o02Var.R(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new k25(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    ft1Var.f(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = i25Var.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    k25 c2 = c(arrayDeque, i15, true);
                    if (c2 == null) {
                        arrayDeque.add(new k25(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        ft1Var.h((i3 - c2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            ft1Var.g(i5, 1, o02Var.R(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    ft1Var.d(i5, 1);
                    i3++;
                }
                i25Var = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    ft1Var.g(i17, 1, o02Var.R(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            i25Var = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        ft1Var.a();
    }
}
