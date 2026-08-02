package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f2363b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2362a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final s f2364c = new s(0);

    public static u c(d dVar, boolean z5) {
        int[] iArr;
        int[] iArr2;
        int i5;
        x xVar;
        int i10;
        w wVar;
        int i11;
        x xVar2;
        x xVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = dVar.i();
        int h10 = dVar.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = new w();
        int i21 = 0;
        wVar2.f2573a = 0;
        wVar2.f2574b = i20;
        wVar2.f2575c = 0;
        wVar2.f2576d = h10;
        arrayList2.add(wVar2);
        int i22 = i20 + h10;
        int i23 = 1;
        int i24 = (((i22 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i24];
        int i25 = i24 / 2;
        int[] iArr4 = new int[i24];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            w wVar3 = (w) arrayList2.remove(arrayList2.size() - i23);
            if (wVar3.b() >= i23 && wVar3.a() >= i23) {
                int a7 = ((wVar3.a() + wVar3.b()) + i23) / 2;
                int i26 = i23 + i25;
                iArr3[i26] = wVar3.f2573a;
                iArr4[i26] = wVar3.f2574b;
                int i27 = i21;
                while (i27 < a7) {
                    int i28 = Math.abs(wVar3.b() - wVar3.a()) % 2 == i23 ? i23 : i21;
                    int b10 = wVar3.b() - wVar3.a();
                    int i29 = -i27;
                    int i30 = i29;
                    while (true) {
                        if (i30 > i27) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i11 = i21;
                            i5 = i25;
                            xVar2 = null;
                            break;
                        }
                        if (i30 == i29 || (i30 != i27 && iArr3[i30 + 1 + i25] > iArr3[(i30 - 1) + i25])) {
                            i16 = iArr3[i30 + 1 + i25];
                            i17 = i16;
                        } else {
                            i16 = iArr3[(i30 - 1) + i25];
                            i17 = i16 + 1;
                        }
                        iArr = iArr4;
                        int i31 = ((i17 - wVar3.f2573a) + wVar3.f2575c) - i30;
                        if (i27 == 0 || i17 != i16) {
                            i18 = i31;
                        } else {
                            i18 = i31;
                            i31--;
                        }
                        int i32 = i18;
                        iArr2 = iArr3;
                        int i33 = i17;
                        int i34 = i32;
                        i5 = i25;
                        while (i33 < wVar3.f2574b && i34 < wVar3.f2576d && dVar.b(i33, i34)) {
                            i33++;
                            i34++;
                        }
                        iArr2[i30 + i5] = i33;
                        if (i28 != 0) {
                            int i35 = b10 - i30;
                            i19 = i30;
                            if (i35 >= i29 + 1 && i35 <= i27 - 1 && iArr[i35 + i5] <= i33) {
                                xVar2 = new x();
                                xVar2.f2586a = i16;
                                xVar2.f2587b = i31;
                                xVar2.f2588c = i33;
                                xVar2.f2589d = i34;
                                i11 = 0;
                                xVar2.f2590e = false;
                                break;
                            }
                        } else {
                            i19 = i30;
                        }
                        i30 = i19 + 2;
                        i21 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i25 = i5;
                    }
                    if (xVar2 != null) {
                        xVar = xVar2;
                        break;
                    }
                    int i36 = (wVar3.b() - wVar3.a()) % 2 == 0 ? 1 : i11;
                    int b11 = wVar3.b() - wVar3.a();
                    int i37 = i29;
                    while (true) {
                        if (i37 > i27) {
                            xVar3 = null;
                            break;
                        }
                        if (i37 == i29 || (i37 != i27 && iArr[i37 + 1 + i5] < iArr[(i37 - 1) + i5])) {
                            i12 = iArr[i37 + 1 + i5];
                            i13 = i12;
                        } else {
                            i12 = iArr[(i37 - 1) + i5];
                            i13 = i12 - 1;
                        }
                        int i38 = wVar3.f2576d - ((wVar3.f2574b - i13) - i37);
                        int i39 = (i27 == 0 || i13 != i12) ? i38 : i38 + 1;
                        while (i13 > wVar3.f2573a && i38 > wVar3.f2575c) {
                            i14 = i36;
                            if (!dVar.b(i13 - 1, i38 - 1)) {
                                break;
                            }
                            i13--;
                            i38--;
                            i36 = i14;
                        }
                        i14 = i36;
                        iArr[i37 + i5] = i13;
                        if (i14 != 0 && (i15 = b11 - i37) >= i29 && i15 <= i27 && iArr2[i15 + i5] >= i13) {
                            xVar3 = new x();
                            xVar3.f2586a = i13;
                            xVar3.f2587b = i38;
                            xVar3.f2588c = i12;
                            xVar3.f2589d = i39;
                            xVar3.f2590e = true;
                            break;
                        }
                        i37 += 2;
                        i36 = i14;
                    }
                    if (xVar3 != null) {
                        xVar = xVar3;
                        break;
                    }
                    i27++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i25 = i5;
                    i23 = 1;
                    i21 = 0;
                }
            }
            iArr = iArr4;
            iArr2 = iArr3;
            i5 = i25;
            xVar = null;
            if (xVar != null) {
                if (xVar.a() > 0) {
                    int i40 = xVar.f2589d;
                    int i41 = xVar.f2587b;
                    int i42 = i40 - i41;
                    int i43 = xVar.f2588c;
                    int i44 = xVar.f2586a;
                    int i45 = i43 - i44;
                    arrayList.add(i42 != i45 ? xVar.f2590e ? new t(i44, i41, xVar.a()) : i42 > i45 ? new t(i44, i41 + 1, xVar.a()) : new t(i44 + 1, i41, xVar.a()) : new t(i44, i41, i45));
                }
                if (arrayList3.isEmpty()) {
                    wVar = new w();
                    i10 = 1;
                } else {
                    i10 = 1;
                    wVar = (w) arrayList3.remove(arrayList3.size() - 1);
                }
                wVar.f2573a = wVar3.f2573a;
                wVar.f2575c = wVar3.f2575c;
                wVar.f2574b = xVar.f2586a;
                wVar.f2576d = xVar.f2587b;
                arrayList2.add(wVar);
                wVar3.f2574b = wVar3.f2574b;
                wVar3.f2576d = wVar3.f2576d;
                wVar3.f2573a = xVar.f2588c;
                wVar3.f2575c = xVar.f2589d;
                arrayList2.add(wVar3);
            } else {
                i10 = 1;
                arrayList3.add(wVar3);
            }
            iArr4 = iArr;
            i23 = i10;
            iArr3 = iArr2;
            i25 = i5;
            i21 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, f2364c);
        return new u(dVar, arrayList, iArr3, iArr5, z5);
    }

    public static int d(z1 z1Var, q0 q0Var, View view, View view2, k1 k1Var, boolean z5) {
        if (k1Var.getChildCount() == 0 || z1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(k1Var.getPosition(view) - k1Var.getPosition(view2)) + 1;
        }
        return Math.min(q0Var.l(), q0Var.b(view2) - q0Var.e(view));
    }

    public static int e(z1 z1Var, q0 q0Var, View view, View view2, k1 k1Var, boolean z5, boolean z7) {
        if (k1Var.getChildCount() == 0 || z1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z7 ? Math.max(0, (z1Var.b() - Math.max(k1Var.getPosition(view), k1Var.getPosition(view2))) - 1) : Math.max(0, Math.min(k1Var.getPosition(view), k1Var.getPosition(view2)));
        if (z5) {
            return Math.round((max * (Math.abs(q0Var.b(view2) - q0Var.e(view)) / (Math.abs(k1Var.getPosition(view) - k1Var.getPosition(view2)) + 1))) + (q0Var.k() - q0Var.e(view)));
        }
        return max;
    }

    public static int f(z1 z1Var, q0 q0Var, View view, View view2, k1 k1Var, boolean z5) {
        if (k1Var.getChildCount() == 0 || z1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return z1Var.b();
        }
        return (int) (((q0Var.b(view2) - q0Var.e(view)) / (Math.abs(k1Var.getPosition(view) - k1Var.getPosition(view2)) + 1)) * z1Var.b());
    }

    public abstract boolean a(int i5, int i10);

    public abstract boolean b(int i5, int i10);

    public abstract Object g(int i5, int i10);

    public abstract int h();

    public abstract int i();
}
