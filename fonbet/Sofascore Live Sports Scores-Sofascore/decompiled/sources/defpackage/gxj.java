package defpackage;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gxj implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public xwj a;
    public ViewGroup b;

    /* JADX WARN: Removed duplicated region for block: B:117:0x01eb A[EDGE_INSN: B:117:0x01eb->B:118:0x01eb BREAK  A[LOOP:1: B:18:0x0087->B:29:0x01e4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        dh0 dh0Var;
        dh0 dh0Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        int i6;
        nwj nwjVar;
        boolean z;
        int i7;
        oxj oxjVar;
        View view;
        View view2;
        boolean z2;
        int i8;
        xwj xwjVar = this.a;
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!hxj.c.remove(viewGroup)) {
            return true;
        }
        dh0 b = hxj.b();
        ArrayList arrayList3 = (ArrayList) b.get(viewGroup);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b.put(viewGroup, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            arrayList3.add(xwjVar);
            xwjVar.a(new fxj(this, b));
            i = 0;
            xwjVar.h(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((xwj) it.next()).C(viewGroup);
                }
            }
            xwjVar.k = new ArrayList();
            xwjVar.l = new ArrayList();
            ujg ujgVar = xwjVar.g;
            ujg ujgVar2 = xwjVar.h;
            dh0Var = new dh0((dh0) ujgVar.b);
            dh0Var2 = new dh0((dh0) ujgVar2.b);
            i2 = 0;
            while (true) {
                iArr = xwjVar.j;
                if (i2 < iArr.length) {
                    break;
                }
                int i9 = iArr[i2];
                if (i9 == z3) {
                    z = z3;
                    i7 = i2;
                    for (int i10 = dh0Var.c - 1; i10 >= 0; i10--) {
                        View view3 = (View) dh0Var.g(i10);
                        if (view3 != null && xwjVar.v(view3) && (oxjVar = (oxj) dh0Var2.remove(view3)) != null && xwjVar.v(oxjVar.b)) {
                            xwjVar.k.add((oxj) dh0Var.i(i10));
                            xwjVar.l.add(oxjVar);
                        }
                    }
                } else if (i9 == 2) {
                    z = z3;
                    i7 = i2;
                    dh0 dh0Var3 = (dh0) ujgVar.e;
                    dh0 dh0Var4 = (dh0) ujgVar2.e;
                    int i11 = dh0Var3.c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        View view4 = (View) dh0Var3.k(i12);
                        if (view4 != null && xwjVar.v(view4) && (view = (View) dh0Var4.get((String) dh0Var3.g(i12))) != null && xwjVar.v(view)) {
                            oxj oxjVar2 = (oxj) dh0Var.get(view4);
                            oxj oxjVar3 = (oxj) dh0Var2.get(view);
                            if (oxjVar2 != null && oxjVar3 != null) {
                                xwjVar.k.add(oxjVar2);
                                xwjVar.l.add(oxjVar3);
                                dh0Var.remove(view4);
                                dh0Var2.remove(view);
                            }
                        }
                    }
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        nkb nkbVar = (nkb) ujgVar.d;
                        nkb nkbVar2 = (nkb) ujgVar2.d;
                        int i13 = nkbVar.i();
                        int i14 = i;
                        while (i14 < i13) {
                            View view5 = (View) nkbVar.j(i14);
                            if (view5 == null || !xwjVar.v(view5)) {
                                z2 = z3;
                                i8 = i2;
                            } else {
                                i8 = i2;
                                View view6 = (View) nkbVar2.c(nkbVar.f(i14));
                                if (view6 == null || !xwjVar.v(view6)) {
                                    z2 = z3;
                                } else {
                                    oxj oxjVar4 = (oxj) dh0Var.get(view5);
                                    z2 = z3;
                                    oxj oxjVar5 = (oxj) dh0Var2.get(view6);
                                    if (oxjVar4 != null && oxjVar5 != null) {
                                        xwjVar.k.add(oxjVar4);
                                        xwjVar.l.add(oxjVar5);
                                        dh0Var.remove(view5);
                                        dh0Var2.remove(view6);
                                    }
                                }
                            }
                            i14++;
                            i2 = i8;
                            z3 = z2;
                        }
                    }
                    z = z3;
                    i7 = i2;
                } else {
                    z = z3;
                    i7 = i2;
                    SparseArray sparseArray = (SparseArray) ujgVar.c;
                    SparseArray sparseArray2 = (SparseArray) ujgVar2.c;
                    int size = sparseArray.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        View view7 = (View) sparseArray.valueAt(i15);
                        if (view7 != null && xwjVar.v(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i15))) != null && xwjVar.v(view2)) {
                            oxj oxjVar6 = (oxj) dh0Var.get(view7);
                            oxj oxjVar7 = (oxj) dh0Var2.get(view2);
                            if (oxjVar6 != null && oxjVar7 != null) {
                                xwjVar.k.add(oxjVar6);
                                xwjVar.l.add(oxjVar7);
                                dh0Var.remove(view7);
                                dh0Var2.remove(view2);
                            }
                        }
                    }
                }
                i2 = i7 + 1;
                z3 = z;
                i = 0;
            }
            boolean z4 = z3;
            for (i3 = 0; i3 < dh0Var.c; i3++) {
                oxj oxjVar8 = (oxj) dh0Var.k(i3);
                if (xwjVar.v(oxjVar8.b)) {
                    xwjVar.k.add(oxjVar8);
                    xwjVar.l.add(null);
                }
            }
            for (i4 = 0; i4 < dh0Var2.c; i4++) {
                oxj oxjVar9 = (oxj) dh0Var2.k(i4);
                if (xwjVar.v(oxjVar9.b)) {
                    xwjVar.l.add(oxjVar9);
                    xwjVar.k.add(null);
                }
            }
            dh0 p = xwj.p();
            int i16 = p.c;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i16 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) p.g(i5);
                if (animator != null && (nwjVar = (nwj) p.get(animator)) != null) {
                    xwj xwjVar2 = nwjVar.e;
                    View view8 = nwjVar.a;
                    if (view8 != null && windowId.equals(nwjVar.d)) {
                        oxj oxjVar10 = nwjVar.c;
                        boolean z5 = z4;
                        oxj r = xwjVar.r(view8, z5);
                        oxj n = xwjVar.n(view8, z5);
                        if (r == null && n == null) {
                            n = (oxj) ((dh0) xwjVar.h.b).get(view8);
                        }
                        if ((r != null || n != null) && xwjVar2.u(oxjVar10, n)) {
                            xwj o = xwjVar2.o();
                            ArrayList arrayList4 = xwjVar2.n;
                            if (o.y != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                p.i(i5);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(xwjVar2);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p.i(i5);
                            }
                        }
                    }
                }
                i5--;
                z4 = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                xwj xwjVar3 = (xwj) arrayList2.get(i6);
                xwjVar3.x(xwjVar3, ogj.d, false);
                if (!xwjVar3.r) {
                    xwjVar3.r = true;
                    xwjVar3.x(xwjVar3, ogj.c, false);
                }
            }
            xwjVar.l(viewGroup, xwjVar.g, xwjVar.h, xwjVar.k, xwjVar.l);
            if (xwjVar.y != null) {
                xwjVar.D();
                return true;
            }
            if (Build.VERSION.SDK_INT < 34) {
                return true;
            }
            xwjVar.z();
            swj swjVar = xwjVar.y;
            jxj jxjVar = swjVar.h;
            long j = jxjVar.x == 0 ? 1L : 0L;
            jxjVar.E(j, swjVar.a);
            swjVar.a = j;
            swj swjVar2 = xwjVar.y;
            swjVar2.b = true;
            int i17 = swjVar2.d;
            if (i17 == 1) {
                swjVar2.d = 0;
                swjVar2.g();
                return true;
            }
            if (i17 != 2) {
                return true;
            }
            swjVar2.d = 0;
            swjVar2.g = swjVar2.g;
            swjVar2.h();
            swjVar2.e.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return true;
        }
        arrayList = null;
        arrayList3.add(xwjVar);
        xwjVar.a(new fxj(this, b));
        i = 0;
        xwjVar.h(viewGroup, false);
        if (arrayList != null) {
        }
        xwjVar.k = new ArrayList();
        xwjVar.l = new ArrayList();
        ujg ujgVar3 = xwjVar.g;
        ujg ujgVar22 = xwjVar.h;
        dh0Var = new dh0((dh0) ujgVar3.b);
        dh0Var2 = new dh0((dh0) ujgVar22.b);
        i2 = 0;
        while (true) {
            iArr = xwjVar.j;
            if (i2 < iArr.length) {
            }
            i2 = i7 + 1;
            z3 = z;
            i = 0;
        }
        boolean z42 = z3;
        while (i3 < dh0Var.c) {
        }
        while (i4 < dh0Var2.c) {
        }
        dh0 p2 = xwj.p();
        int i162 = p2.c;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i162 - 1;
        while (i5 >= 0) {
        }
        while (i6 < arrayList2.size()) {
        }
        xwjVar.l(viewGroup, xwjVar.g, xwjVar.h, xwjVar.k, xwjVar.l);
        if (xwjVar.y != null) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        hxj.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) hxj.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((xwj) it.next()).C(viewGroup);
            }
        }
        this.a.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
