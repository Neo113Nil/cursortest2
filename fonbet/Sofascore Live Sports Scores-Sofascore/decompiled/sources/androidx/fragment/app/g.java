package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.at4;
import defpackage.bsk;
import defpackage.dh0;
import defpackage.fsf;
import defpackage.gq8;
import defpackage.hk0;
import defpackage.ixh;
import defpackage.jtd;
import defpackage.k13;
import defpackage.lq8;
import defpackage.mc;
import defpackage.mc3;
import defpackage.mq8;
import defpackage.nx0;
import defpackage.p3;
import defpackage.rj2;
import defpackage.ssk;
import defpackage.wb3;
import defpackage.ys4;
import defpackage.zs4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g extends ixh {
    public final ArrayList c;
    public final y d;
    public final y e;
    public final mq8 f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final dh0 j;
    public final ArrayList k;
    public final ArrayList l;
    public final dh0 m;
    public final dh0 n;
    public final boolean o;
    public final rj2 p;
    public Object q;
    public boolean r;

    public g(ArrayList arrayList, y yVar, y yVar2, mq8 mq8Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, dh0 dh0Var, ArrayList arrayList4, ArrayList arrayList5, dh0 dh0Var2, dh0 dh0Var3, boolean z) {
        arrayList4.getClass();
        this.c = arrayList;
        this.d = yVar;
        this.e = yVar2;
        this.f = mq8Var;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = dh0Var;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = dh0Var2;
        this.n = dh0Var3;
        this.o = z;
        this.p = new rj2();
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = ssk.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // defpackage.ixh
    public final boolean a() {
        Object obj;
        mq8 mq8Var = this.f;
        if (!mq8Var.l()) {
            return false;
        }
        ArrayList arrayList = this.c;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                at4 at4Var = (at4) it.next();
                if (Build.VERSION.SDK_INT < 34 || (obj = at4Var.b) == null || !mq8Var.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.g;
        return obj2 == null || mq8Var.m(obj2);
    }

    @Override // defpackage.ixh
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.p.b();
    }

    @Override // defpackage.ixh
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        if (!isLaidOut || this.r) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                at4 at4Var = (at4) it.next();
                y yVar = at4Var.a;
                if (s.O(2)) {
                    if (this.r) {
                        Objects.toString(yVar);
                    } else {
                        viewGroup.toString();
                        Objects.toString(yVar);
                    }
                }
                at4Var.a.c(this);
            }
            this.r = false;
            return;
        }
        Object obj = this.q;
        mq8 mq8Var = this.f;
        y yVar2 = this.e;
        y yVar3 = this.d;
        if (obj != null) {
            mq8Var.c(obj);
            if (s.O(2)) {
                Objects.toString(yVar3);
                Objects.toString(yVar2);
                return;
            }
            return;
        }
        Pair g = g(viewGroup, yVar2, yVar3);
        ArrayList arrayList2 = (ArrayList) g.a;
        Object obj2 = g.b;
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((at4) it2.next()).a);
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            y yVar4 = (y) it3.next();
            mq8Var.u(yVar4.c, obj2, this.p, new ys4(yVar4, this, 1));
        }
        i(arrayList2, viewGroup, new zs4(this, viewGroup, obj2));
        if (s.O(2)) {
            Objects.toString(yVar3);
            Objects.toString(yVar2);
        }
    }

    @Override // defpackage.ixh
    public final void d(nx0 nx0Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.q;
        if (obj != null) {
            this.f.r(obj, nx0Var.c);
        }
    }

    @Override // defpackage.ixh
    public final void e(ViewGroup viewGroup) {
        Object obj;
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        if (!isLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y yVar = ((at4) it.next()).a;
                if (s.O(2)) {
                    viewGroup.toString();
                    Objects.toString(yVar);
                }
            }
            return;
        }
        boolean h = h();
        y yVar2 = this.e;
        y yVar3 = this.d;
        if (h && (obj = this.g) != null && !a()) {
            Objects.toString(obj);
            Objects.toString(yVar3);
            Objects.toString(yVar2);
        }
        if (a() && h()) {
            fsf fsfVar = new fsf();
            Pair g = g(viewGroup, yVar2, yVar3);
            ArrayList arrayList2 = (ArrayList) g.a;
            Object obj2 = g.b;
            ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((at4) it2.next()).a);
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                y yVar4 = (y) it3.next();
                wb3 wb3Var = new wb3(fsfVar, 10);
                Fragment fragment = yVar4.c;
                this.f.v(obj2, this.p, wb3Var, new ys4(yVar4, this, 0));
            }
            i(arrayList2, viewGroup, new mc(this, viewGroup, obj2, fsfVar, 2));
        }
    }

    public final Pair g(ViewGroup viewGroup, y yVar, y yVar2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        mq8 mq8Var;
        ArrayList arrayList3;
        y yVar3 = yVar;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = this.c;
        Iterator it = arrayList4.iterator();
        View view2 = null;
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.i;
            arrayList2 = this.h;
            obj = this.g;
            mq8Var = this.f;
            if (!hasNext) {
                break;
            }
            if (((at4) it.next()).d == null || yVar2 == null || yVar3 == null || this.j.isEmpty() || obj == null) {
                arrayList3 = arrayList4;
            } else {
                Fragment fragment = yVar3.c;
                Fragment fragment2 = yVar2.c;
                lq8 lq8Var = gq8.a;
                arrayList3 = arrayList4;
                if (this.o) {
                    fragment2.getEnterTransitionCallback();
                } else {
                    fragment.getEnterTransitionCallback();
                }
                jtd.a(viewGroup, new p3(15, yVar3, yVar2, this));
                dh0 dh0Var = this.m;
                arrayList2.addAll(dh0Var.values());
                ArrayList arrayList5 = this.l;
                if (!arrayList5.isEmpty()) {
                    Object obj2 = arrayList5.get(0);
                    obj2.getClass();
                    View view3 = (View) dh0Var.get((String) obj2);
                    mq8Var.s(view3, obj);
                    view2 = view3;
                }
                dh0 dh0Var2 = this.n;
                arrayList.addAll(dh0Var2.values());
                ArrayList arrayList6 = this.k;
                if (!arrayList6.isEmpty()) {
                    Object obj3 = arrayList6.get(0);
                    obj3.getClass();
                    View view4 = (View) dh0Var2.get((String) obj3);
                    if (view4 != null) {
                        jtd.a(viewGroup, new mc3(mq8Var, view4, rect));
                        z = true;
                    }
                }
                mq8Var.w(obj, view, arrayList2);
                Object obj4 = this.g;
                mq8Var.q(obj4, null, null, obj4, arrayList);
            }
            arrayList4 = arrayList3;
        }
        ArrayList arrayList7 = arrayList4;
        ArrayList arrayList8 = arrayList;
        ArrayList arrayList9 = new ArrayList();
        Iterator it2 = arrayList7.iterator();
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            ArrayList arrayList10 = arrayList8;
            if (!it2.hasNext()) {
                break;
            }
            at4 at4Var = (at4) it2.next();
            y yVar4 = at4Var.a;
            Iterator it3 = it2;
            Object h = mq8Var.h(at4Var.b);
            if (h != null) {
                boolean z2 = z;
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = arrayList2;
                Fragment fragment3 = yVar4.c;
                Object obj7 = obj;
                View view5 = fragment3.mView;
                view5.getClass();
                f(view5, arrayList11);
                if (obj7 != null && (yVar4 == yVar2 || yVar4 == yVar3)) {
                    if (yVar4 == yVar2) {
                        arrayList11.removeAll(CollectionsKt.W0(arrayList12));
                    } else {
                        arrayList11.removeAll(CollectionsKt.W0(arrayList10));
                    }
                }
                if (arrayList11.isEmpty()) {
                    mq8Var.a(view, h);
                } else {
                    mq8Var.b(h, arrayList11);
                    mq8Var.q(h, h, arrayList11, null, null);
                    if (yVar4.a == 3) {
                        yVar4.i = false;
                        ArrayList arrayList13 = new ArrayList(arrayList11);
                        arrayList13.remove(fragment3.mView);
                        mq8Var.p(h, fragment3.mView, arrayList13);
                        jtd.a(viewGroup, new wb3(arrayList11, 11));
                    }
                }
                if (yVar4.a == 2) {
                    arrayList9.addAll(arrayList11);
                    if (z2) {
                        mq8Var.t(h, rect);
                    }
                    if (s.O(2)) {
                        h.toString();
                        Iterator it4 = arrayList11.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            Objects.toString((View) next);
                        }
                    }
                } else {
                    mq8Var.s(view2, h);
                    if (s.O(2)) {
                        h.toString();
                        Iterator it5 = arrayList11.iterator();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            next2.getClass();
                            Objects.toString((View) next2);
                        }
                    }
                }
                if (at4Var.c) {
                    obj5 = mq8Var.o(obj5, h);
                } else {
                    obj6 = mq8Var.o(obj6, h);
                }
                yVar3 = yVar;
                arrayList8 = arrayList10;
                it2 = it3;
                z = z2;
                arrayList2 = arrayList12;
                obj = obj7;
            } else {
                yVar3 = yVar;
                arrayList8 = arrayList10;
                it2 = it3;
            }
        }
        Object n = mq8Var.n(obj5, obj6, obj);
        if (s.O(2)) {
            Objects.toString(n);
            viewGroup.toString();
        }
        return new Pair(arrayList9, n);
    }

    public final boolean h() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((at4) it.next()).a.c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        gq8.a(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = bsk.a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        boolean O = s.O(2);
        ArrayList arrayList4 = this.h;
        if (O) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                Objects.toString(view2);
                WeakHashMap weakHashMap2 = bsk.a;
                view2.getTransitionName();
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                Objects.toString(view3);
                WeakHashMap weakHashMap3 = bsk.a;
                view3.getTransitionName();
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = bsk.a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) this.j.get(transitionName);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        ((View) arrayList3.get(i3)).setTransitionName(transitionName);
                        break;
                    }
                    i3++;
                }
            }
        }
        jtd.a(viewGroup, new hk0(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        gq8.a(arrayList, 0);
        this.f.x(this.g, arrayList4, arrayList3);
    }
}
