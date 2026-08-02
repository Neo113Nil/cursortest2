package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class flh {
    public static final m39 h = new m39(8);
    public static final m39 i = new m39(10);
    public static final m39 j = new m39(9);
    public static final m39 k = new m39(11);
    public final /* synthetic */ int a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;

    public flh(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.g = new elh[5];
                this.b = new ArrayList();
                this.c = -1;
                break;
            default:
                this.g = new dlh[5];
                this.b = new ArrayList();
                this.c = -1;
                break;
        }
    }

    public void a(int i2, float f) {
        dlh dlhVar;
        elh elhVar;
        int i3 = this.a;
        ArrayList arrayList = this.b;
        Object obj = this.g;
        switch (i3) {
            case 0:
                dlh[] dlhVarArr = (dlh[]) obj;
                if (this.c != 1) {
                    Collections.sort(arrayList, h);
                    this.c = 1;
                }
                int i4 = this.f;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.f = i5;
                    dlhVar = dlhVarArr[i5];
                } else {
                    dlhVar = new dlh();
                }
                int i6 = this.d;
                this.d = i6 + 1;
                dlhVar.a = i6;
                dlhVar.b = i2;
                dlhVar.c = f;
                arrayList.add(dlhVar);
                this.e += i2;
                while (true) {
                    int i7 = this.e;
                    if (i7 <= 2000) {
                        break;
                    } else {
                        int i8 = i7 - 2000;
                        dlh dlhVar2 = (dlh) arrayList.get(0);
                        int i9 = dlhVar2.b;
                        if (i9 <= i8) {
                            this.e -= i9;
                            arrayList.remove(0);
                            int i10 = this.f;
                            if (i10 < 5) {
                                this.f = i10 + 1;
                                dlhVarArr[i10] = dlhVar2;
                            }
                        } else {
                            dlhVar2.b = i9 - i8;
                            this.e -= i8;
                        }
                    }
                }
            default:
                elh[] elhVarArr = (elh[]) obj;
                if (this.c != 1) {
                    Collections.sort(arrayList, j);
                    this.c = 1;
                }
                int i11 = this.f;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    this.f = i12;
                    elhVar = elhVarArr[i12];
                } else {
                    elhVar = new elh();
                }
                int i13 = this.d;
                this.d = i13 + 1;
                elhVar.a = i13;
                elhVar.b = i2;
                elhVar.c = f;
                arrayList.add(elhVar);
                this.e += i2;
                while (true) {
                    int i14 = this.e;
                    if (i14 <= 2000) {
                        break;
                    } else {
                        int i15 = i14 - 2000;
                        elh elhVar2 = (elh) arrayList.get(0);
                        int i16 = elhVar2.b;
                        if (i16 <= i15) {
                            this.e -= i16;
                            arrayList.remove(0);
                            int i17 = this.f;
                            if (i17 < 5) {
                                this.f = i17 + 1;
                                elhVarArr[i17] = elhVar2;
                            }
                        } else {
                            elhVar2.b = i16 - i15;
                            this.e -= i15;
                        }
                    }
                }
        }
    }

    public void b() {
        View view = (View) mz1.h(this.b, 1);
        d9i d9iVar = (d9i) view.getLayoutParams();
        this.d = ((StaggeredGridLayoutManager) this.g).c.b(view);
        d9iVar.getClass();
    }

    public void c() {
        this.b.clear();
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = 0;
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.g).h ? f(r1.size() - 1, -1) : f(0, this.b.size());
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.g).h ? f(0, this.b.size()) : f(r1.size() - 1, -1);
    }

    public int f(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int k2 = staggeredGridLayoutManager.c.k();
        int g = staggeredGridLayoutManager.c.g();
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View view = (View) this.b.get(i2);
            int e = staggeredGridLayoutManager.c.e(view);
            int b = staggeredGridLayoutManager.c.b(view);
            boolean z = e <= g;
            boolean z2 = b >= k2;
            if (z && z2 && (e < k2 || b > g)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i2 += i4;
        }
        return -1;
    }

    public int g(int i2) {
        int i3 = this.d;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.b.size() == 0) {
            return i2;
        }
        b();
        return this.d;
    }

    public View h(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        View view = null;
        ArrayList arrayList = this.b;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view2) >= i2) || ((!staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            View view3 = (View) arrayList.get(i4);
            if ((staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view3) <= i2) || ((!staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view3) >= i2) || !view3.hasFocusable())) {
                break;
            }
            i4++;
            view = view3;
        }
        return view;
    }

    public float i() {
        int i2 = this.a;
        ArrayList arrayList = this.b;
        int i3 = 0;
        switch (i2) {
            case 0:
                if (this.c != 0) {
                    Collections.sort(arrayList, i);
                    this.c = 0;
                }
                float f = 0.5f * this.e;
                int i4 = 0;
                while (i3 < arrayList.size()) {
                    dlh dlhVar = (dlh) arrayList.get(i3);
                    i4 += dlhVar.b;
                    if (i4 >= f) {
                        return dlhVar.c;
                    }
                    i3++;
                }
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((dlh) mz1.h(arrayList, 1)).c;
            default:
                if (this.c != 0) {
                    Collections.sort(arrayList, k);
                    this.c = 0;
                }
                float f2 = 0.5f * this.e;
                int i5 = 0;
                while (i3 < arrayList.size()) {
                    elh elhVar = (elh) arrayList.get(i3);
                    i5 += elhVar.b;
                    if (i5 >= f2) {
                        return elhVar.c;
                    }
                    i3++;
                }
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((elh) mz1.h(arrayList, 1)).c;
        }
    }

    public int j(int i2) {
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return i2;
        }
        View view = (View) arrayList.get(0);
        d9i d9iVar = (d9i) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).c.e(view);
        d9iVar.getClass();
        return this.c;
    }

    public flh(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.a = 2;
        this.g = staggeredGridLayoutManager;
        this.b = new ArrayList();
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = 0;
        this.f = i2;
    }
}
