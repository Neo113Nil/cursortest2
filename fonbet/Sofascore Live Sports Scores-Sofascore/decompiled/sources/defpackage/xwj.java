package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class xwj implements Cloneable {
    public static final Animator[] A = new Animator[0];
    public static final int[] B = {2, 1, 3, 4};
    public static final wkf C = new wkf(4);
    public static final ThreadLocal D = new ThreadLocal();
    public ArrayList k;
    public ArrayList l;
    public wwj[] m;
    public nq8 v;
    public long x;
    public swj y;
    public long z;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public ujg g = new ujg(23);
    public ujg h = new ujg(23);
    public jxj i = null;
    public final int[] j = B;
    public final ArrayList n = new ArrayList();
    public Animator[] o = A;
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public xwj s = null;
    public ArrayList t = null;
    public ArrayList u = new ArrayList();
    public wkf w = C;

    public static void c(ujg ujgVar, View view, oxj oxjVar) {
        dh0 dh0Var = (dh0) ujgVar.b;
        dh0 dh0Var2 = (dh0) ujgVar.e;
        SparseArray sparseArray = (SparseArray) ujgVar.c;
        nkb nkbVar = (nkb) ujgVar.d;
        dh0Var.put(view, oxjVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = bsk.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (dh0Var2.containsKey(transitionName)) {
                dh0Var2.put(transitionName, null);
            } else {
                dh0Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (nkbVar.d(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    nkbVar.g(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) nkbVar.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    nkbVar.g(null, itemIdAtPosition);
                }
            }
        }
    }

    public static dh0 p() {
        ThreadLocal threadLocal = D;
        dh0 dh0Var = (dh0) threadLocal.get();
        if (dh0Var != null) {
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0(0);
        threadLocal.set(dh0Var2);
        return dh0Var2;
    }

    public static boolean w(oxj oxjVar, oxj oxjVar2, String str) {
        Object obj = oxjVar.a.get(str);
        Object obj2 = oxjVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public xwj A(wwj wwjVar) {
        xwj xwjVar;
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            if (!arrayList.remove(wwjVar) && (xwjVar = this.s) != null) {
                xwjVar.A(wwjVar);
            }
            if (this.t.size() == 0) {
                this.t = null;
            }
        }
        return this;
    }

    public void B(View view) {
        this.f.remove(view);
    }

    public void C(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = A;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                x(this, ogj.f, false);
            }
            this.q = false;
        }
    }

    public void D() {
        N();
        dh0 p = p();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p.containsKey(animator)) {
                N();
                if (animator != null) {
                    animator.addListener(new fz7(this, p, false, 3));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new eb(this, 12));
                    animator.start();
                }
            }
        }
        this.u.clear();
        m();
    }

    public void E(long j, long j2) {
        long j3 = this.x;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.r = false;
            x(this, ogj.b, z);
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = A;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.o = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.r = true;
        }
        x(this, ogj.c, z);
    }

    public void F(long j) {
        this.c = j;
    }

    public void G(nq8 nq8Var) {
        this.v = nq8Var;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void J(wkf wkfVar) {
        if (wkfVar == null) {
            this.w = C;
        } else {
            this.w = wkfVar;
        }
    }

    public void L(long j) {
        this.b = j;
    }

    public final void N() {
        if (this.p == 0) {
            x(this, ogj.b, false);
            this.r = false;
        }
        this.p++;
    }

    public String O(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(wwj wwjVar) {
        ArrayList arrayList = this.t;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.t = arrayList;
        }
        arrayList.add(wwjVar);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = A;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        x(this, ogj.d, false);
    }

    public abstract void d(oxj oxjVar);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            oxj oxjVar = new oxj(view);
            if (z) {
                g(oxjVar);
            } else {
                d(oxjVar);
            }
            oxjVar.c.add(this);
            f(oxjVar);
            if (z) {
                c(this.g, view, oxjVar);
            } else {
                c(this.h, view, oxjVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void g(oxj oxjVar);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                oxj oxjVar = new oxj(findViewById);
                if (z) {
                    g(oxjVar);
                } else {
                    d(oxjVar);
                }
                oxjVar.c.add(this);
                f(oxjVar);
                if (z) {
                    c(this.g, findViewById, oxjVar);
                } else {
                    c(this.h, findViewById, oxjVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            oxj oxjVar2 = new oxj(view);
            if (z) {
                g(oxjVar2);
            } else {
                d(oxjVar2);
            }
            oxjVar2.c.add(this);
            f(oxjVar2);
            if (z) {
                c(this.g, view, oxjVar2);
            } else {
                c(this.h, view, oxjVar2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((dh0) this.g.b).clear();
            ((SparseArray) this.g.c).clear();
            ((nkb) this.g.d).a();
        } else {
            ((dh0) this.h.b).clear();
            ((SparseArray) this.h.c).clear();
            ((nkb) this.h.d).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public xwj clone() {
        try {
            xwj xwjVar = (xwj) super.clone();
            xwjVar.u = new ArrayList();
            xwjVar.g = new ujg(23);
            xwjVar.h = new ujg(23);
            xwjVar.k = null;
            xwjVar.l = null;
            xwjVar.y = null;
            xwjVar.s = this;
            xwjVar.t = null;
            return xwjVar;
        } catch (CloneNotSupportedException e) {
            is8.h(e);
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, oxj oxjVar, oxj oxjVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, ujg ujgVar, ujg ujgVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        boolean z;
        View view;
        oxj oxjVar;
        Animator animator;
        oxj oxjVar2;
        dh0 p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = o().y != null;
        int i2 = 0;
        while (i2 < size) {
            oxj oxjVar3 = (oxj) arrayList.get(i2);
            oxj oxjVar4 = (oxj) arrayList2.get(i2);
            if (oxjVar3 != null && !oxjVar3.c.contains(this)) {
                oxjVar3 = null;
            }
            if (oxjVar4 != null && !oxjVar4.c.contains(this)) {
                oxjVar4 = null;
            }
            if ((oxjVar3 != null || oxjVar4 != null) && (oxjVar3 == null || oxjVar4 == null || u(oxjVar3, oxjVar4))) {
                Animator k = k(viewGroup, oxjVar3, oxjVar4);
                if (k != null) {
                    String str = this.a;
                    if (oxjVar4 != null) {
                        view = oxjVar4.b;
                        String[] q = q();
                        if (q != null && q.length > 0) {
                            oxjVar2 = new oxj(view);
                            oxj oxjVar5 = (oxj) ((dh0) ujgVar2.b).get(view);
                            i = size;
                            z = z2;
                            if (oxjVar5 != null) {
                                for (String str2 : q) {
                                    oxjVar2.a.put(str2, oxjVar5.a.get(str2));
                                }
                            }
                            int i3 = p.c;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    animator = k;
                                    break;
                                }
                                nwj nwjVar = (nwj) p.get((Animator) p.g(i4));
                                if (nwjVar.c != null && nwjVar.a == view && nwjVar.b.equals(str) && nwjVar.c.equals(oxjVar2)) {
                                    animator = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i = size;
                            z = z2;
                            animator = k;
                            oxjVar2 = null;
                        }
                        k = animator;
                        oxjVar = oxjVar2;
                    } else {
                        i = size;
                        z = z2;
                        view = oxjVar3.b;
                        oxjVar = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        nwj nwjVar2 = new nwj();
                        nwjVar2.a = view;
                        nwjVar2.b = str;
                        nwjVar2.c = oxjVar;
                        nwjVar2.d = windowId;
                        nwjVar2.e = this;
                        nwjVar2.f = k;
                        if (z) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(k);
                            k = animatorSet;
                        }
                        p.put(k, nwjVar2);
                        this.u.add(k);
                    }
                    i2++;
                    size = i;
                    z2 = z;
                }
            }
            i = size;
            z = z2;
            i2++;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                nwj nwjVar3 = (nwj) p.get((Animator) this.u.get(sparseIntArray.keyAt(i5)));
                nwjVar3.f.setStartDelay(nwjVar3.f.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            x(this, ogj.c, false);
            for (int i2 = 0; i2 < ((nkb) this.g.d).i(); i2++) {
                View view = (View) ((nkb) this.g.d).j(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((nkb) this.h.d).i(); i3++) {
                View view2 = (View) ((nkb) this.h.d).j(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    public final oxj n(View view, boolean z) {
        jxj jxjVar = this.i;
        if (jxjVar != null) {
            return jxjVar.n(view, z);
        }
        ArrayList arrayList = z ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            oxj oxjVar = (oxj) arrayList.get(i);
            if (oxjVar == null) {
                return null;
            }
            if (oxjVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (oxj) (z ? this.l : this.k).get(i);
        }
        return null;
    }

    public final xwj o() {
        jxj jxjVar = this.i;
        return jxjVar != null ? jxjVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final oxj r(View view, boolean z) {
        jxj jxjVar = this.i;
        if (jxjVar != null) {
            return jxjVar.r(view, z);
        }
        return (oxj) ((dh0) (z ? this.g : this.h).b).get(view);
    }

    public boolean s() {
        return !this.n.isEmpty();
    }

    public abstract boolean t();

    public final String toString() {
        return O("");
    }

    public boolean u(oxj oxjVar, oxj oxjVar2) {
        if (oxjVar != null && oxjVar2 != null) {
            String[] q = q();
            if (q != null) {
                for (String str : q) {
                    if (w(oxjVar, oxjVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = oxjVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (w(oxjVar, oxjVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void x(xwj xwjVar, ogj ogjVar, boolean z) {
        xwj xwjVar2 = this.s;
        if (xwjVar2 != null) {
            xwjVar2.x(xwjVar, ogjVar, z);
        }
        ArrayList arrayList = this.t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.t.size();
        wwj[] wwjVarArr = this.m;
        if (wwjVarArr == null) {
            wwjVarArr = new wwj[size];
        }
        this.m = null;
        wwj[] wwjVarArr2 = (wwj[]) this.t.toArray(wwjVarArr);
        for (int i = 0; i < size; i++) {
            wwj wwjVar = wwjVarArr2[i];
            switch (ogjVar.a) {
                case 9:
                    wwjVar.b(xwjVar);
                    break;
                case 10:
                    wwjVar.e(xwjVar);
                    break;
                case 11:
                    wwjVar.d(xwjVar);
                    break;
                case 12:
                    wwjVar.a();
                    break;
                default:
                    wwjVar.c();
                    break;
            }
            wwjVarArr2[i] = null;
        }
        this.m = wwjVarArr2;
    }

    public void y(View view) {
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = A;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.o = animatorArr;
        x(this, ogj.e, false);
        this.q = true;
    }

    public void z() {
        dh0 p = p();
        this.x = 0L;
        int i = 0;
        while (true) {
            int size = this.u.size();
            ArrayList arrayList = this.u;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            nwj nwjVar = (nwj) p.get(animator);
            if (animator != null && nwjVar != null) {
                Animator animator2 = nwjVar.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.n.add(animator);
                this.x = Math.max(this.x, animator.getTotalDuration());
            }
            i++;
        }
    }

    public void K() {
    }

    public void f(oxj oxjVar) {
    }
}
