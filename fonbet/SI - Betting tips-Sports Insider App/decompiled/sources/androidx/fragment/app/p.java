package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends e2 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2020c;

    /* renamed from: d, reason: collision with root package name */
    public final f2 f2021d;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f2022e;

    /* renamed from: f, reason: collision with root package name */
    public final a2 f2023f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2024g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2025h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2026i;
    public final s.e j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2027k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2028l;

    /* renamed from: m, reason: collision with root package name */
    public final s.e f2029m;

    /* renamed from: n, reason: collision with root package name */
    public final s.e f2030n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2031o;

    /* renamed from: p, reason: collision with root package name */
    public final l0.d f2032p;
    public Object q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2033r;

    public p(ArrayList transitionInfos, f2 f2Var, f2 f2Var2, a2 transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, s.e sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, s.e firstOutViews, s.e lastInViews, boolean z5) {
        Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
        Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
        Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
        Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
        Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
        Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
        Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
        Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
        Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
        this.f2020c = transitionInfos;
        this.f2021d = f2Var;
        this.f2022e = f2Var2;
        this.f2023f = transitionImpl;
        this.f2024g = obj;
        this.f2025h = sharedElementFirstOutViews;
        this.f2026i = sharedElementLastInViews;
        this.j = sharedElementNameMapping;
        this.f2027k = enteringNames;
        this.f2028l = exitingNames;
        this.f2029m = firstOutViews;
        this.f2030n = lastInViews;
        this.f2031o = z5;
        this.f2032p = new l0.d();
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
        int i5 = androidx.core.view.b1.f1292a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                f(child, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.e2
    public final boolean a() {
        Object obj;
        a2 a2Var = this.f2023f;
        if (!a2Var.l()) {
            return false;
        }
        ArrayList arrayList = this.f2020c;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (Build.VERSION.SDK_INT < 34 || (obj = qVar.f2044b) == null || !a2Var.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.f2024g;
        return obj2 == null || a2Var.m(obj2);
    }

    @Override // androidx.fragment.app.e2
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f2032p.a();
    }

    @Override // androidx.fragment.app.e2
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f2020c;
        if (!isLaidOut || this.f2033r) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                f2 f2Var = qVar.f1994a;
                if (j1.L(2)) {
                    if (this.f2033r) {
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + f2Var);
                    } else {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + f2Var);
                    }
                }
                qVar.f1994a.c(this);
            }
            this.f2033r = false;
            return;
        }
        Object obj = this.q;
        a2 a2Var = this.f2023f;
        f2 f2Var2 = this.f2022e;
        f2 f2Var3 = this.f2021d;
        if (obj != null) {
            Intrinsics.checkNotNull(obj);
            a2Var.c(obj);
            if (j1.L(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + f2Var3 + " to " + f2Var2);
                return;
            }
            return;
        }
        Pair g10 = g(container, f2Var2, f2Var3);
        ArrayList arrayList2 = (ArrayList) g10.f19192a;
        Object obj2 = g10.f19193b;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((q) it2.next()).f1994a);
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            f2 f2Var4 = (f2) it3.next();
            a2Var.u(f2Var4.f1905c, obj2, this.f2032p, new m(f2Var4, this, 1));
        }
        i(arrayList2, container, new n(this, container, obj2));
        if (j1.L(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + f2Var3 + " to " + f2Var2);
        }
    }

    @Override // androidx.fragment.app.e2
    public final void d(e.a backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        Object obj = this.q;
        if (obj != null) {
            this.f2023f.r(obj, backEvent.f8390c);
        }
    }

    @Override // androidx.fragment.app.e2
    public final void e(ViewGroup container) {
        Object obj;
        Intrinsics.checkNotNullParameter(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f2020c;
        if (!isLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f2 f2Var = ((q) it.next()).f1994a;
                if (j1.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + f2Var);
                }
            }
            return;
        }
        boolean h10 = h();
        f2 f2Var2 = this.f2022e;
        f2 f2Var3 = this.f2021d;
        if (h10 && (obj = this.f2024g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + f2Var3 + " and " + f2Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (a() && h()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Pair g10 = g(container, f2Var2, f2Var3);
            ArrayList arrayList2 = (ArrayList) g10.f19192a;
            Object obj2 = g10.f19193b;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((q) it2.next()).f1994a);
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                f2 f2Var4 = (f2) it3.next();
                z zVar = new z(1, objectRef);
                Fragment fragment = f2Var4.f1905c;
                this.f2023f.v(obj2, this.f2032p, zVar, new m(f2Var4, this, 0));
            }
            i(arrayList2, container, new o(this, container, obj2, objectRef));
        }
    }

    public final Pair g(ViewGroup viewGroup, f2 f2Var, f2 f2Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        a2 a2Var;
        Object obj2;
        Object obj3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList5 = this.f2020c;
        Iterator it2 = arrayList5.iterator();
        View view2 = null;
        boolean z5 = false;
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = this.f2026i;
            arrayList2 = this.f2025h;
            obj = this.f2024g;
            a2Var = this.f2023f;
            if (!hasNext) {
                break;
            }
            if (((q) it2.next()).f2046d == null || f2Var2 == null || f2Var == null || this.j.isEmpty() || obj == null) {
                arrayList4 = arrayList5;
                it = it2;
            } else {
                Fragment inFragment = f2Var.f1905c;
                Fragment outFragment = f2Var2.f1905c;
                y1 y1Var = t1.f2090a;
                arrayList4 = arrayList5;
                Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                it = it2;
                s.e sharedElements = this.f2029m;
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                if (this.f2031o) {
                    outFragment.getEnterTransitionCallback();
                } else {
                    inFragment.getEnterTransitionCallback();
                }
                androidx.core.view.z.a(viewGroup, new d(f2Var, f2Var2, this, 1));
                arrayList2.addAll(sharedElements.values());
                ArrayList arrayList6 = this.f2028l;
                if (!arrayList6.isEmpty()) {
                    Object obj4 = arrayList6.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj4, "exitingNames[0]");
                    View view3 = (View) sharedElements.get((String) obj4);
                    a2Var.s(view3, obj);
                    view2 = view3;
                }
                s.e eVar = this.f2030n;
                arrayList.addAll(eVar.values());
                ArrayList arrayList7 = this.f2027k;
                if (!arrayList7.isEmpty()) {
                    Object obj5 = arrayList7.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj5, "enteringNames[0]");
                    View view4 = (View) eVar.get((String) obj5);
                    if (view4 != null) {
                        androidx.core.view.z.a(viewGroup, new d(a2Var, view4, rect, 2));
                        z5 = true;
                    }
                }
                a2Var.w(obj, view, arrayList2);
                Object obj6 = this.f2024g;
                a2Var.q(obj6, null, null, obj6, arrayList);
            }
            arrayList5 = arrayList4;
            it2 = it;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = new ArrayList();
        Iterator it3 = arrayList8.iterator();
        Object obj7 = null;
        Object obj8 = null;
        while (it3.hasNext()) {
            q qVar = (q) it3.next();
            Iterator it4 = it3;
            f2 f2Var3 = qVar.f1994a;
            boolean z7 = z5;
            Object h10 = a2Var.h(qVar.f2044b);
            if (h10 != null) {
                ArrayList arrayList10 = arrayList2;
                ArrayList arrayList11 = new ArrayList();
                obj2 = obj;
                Fragment fragment = f2Var3.f1905c;
                Object obj9 = obj8;
                View view5 = fragment.mView;
                Object obj10 = obj7;
                Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
                f(view5, arrayList11);
                if (obj2 != null && (f2Var3 == f2Var2 || f2Var3 == f2Var)) {
                    if (f2Var3 == f2Var2) {
                        arrayList11.removeAll(CollectionsKt.Z(arrayList10));
                    } else {
                        arrayList11.removeAll(CollectionsKt.Z(arrayList));
                    }
                }
                if (arrayList11.isEmpty()) {
                    a2Var.a(view, h10);
                    obj3 = h10;
                    arrayList3 = arrayList11;
                } else {
                    a2Var.b(h10, arrayList11);
                    a2Var.q(h10, h10, arrayList11, null, null);
                    obj3 = h10;
                    arrayList3 = arrayList11;
                    if (f2Var3.f1903a == i2.f1959c) {
                        f2Var3.f1911i = false;
                        ArrayList arrayList12 = new ArrayList(arrayList3);
                        arrayList12.remove(fragment.mView);
                        a2Var.p(obj3, fragment.mView, arrayList12);
                        androidx.core.view.z.a(viewGroup, new z(2, arrayList3));
                    }
                }
                if (f2Var3.f1903a == i2.f1958b) {
                    arrayList9.addAll(arrayList3);
                    if (z7) {
                        a2Var.t(obj3, rect);
                    }
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "Entering Transition: " + obj3);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            Object transitioningViews = it5.next();
                            Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                        }
                    }
                } else {
                    a2Var.s(view2, obj3);
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + obj3);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        Iterator it6 = arrayList3.iterator();
                        while (it6.hasNext()) {
                            Object transitioningViews2 = it6.next();
                            Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                        }
                    }
                }
                if (qVar.f2045c) {
                    obj7 = a2Var.o(obj10, obj3);
                    it3 = it4;
                    z5 = z7;
                    arrayList2 = arrayList10;
                    obj = obj2;
                    obj8 = obj9;
                } else {
                    obj8 = a2Var.o(obj9, obj3);
                    obj7 = obj10;
                    it3 = it4;
                    z5 = z7;
                    arrayList2 = arrayList10;
                }
            } else {
                obj2 = obj;
                it3 = it4;
                z5 = z7;
            }
            obj = obj2;
        }
        Object n9 = a2Var.n(obj7, obj8, obj);
        if (j1.L(2)) {
            Log.v("FragmentManager", "Final merged transition: " + n9 + " for container " + viewGroup);
        }
        return new Pair(arrayList9, n9);
    }

    public final boolean h() {
        ArrayList arrayList = this.f2020c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((q) it.next()).f1994a.f1905c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        t1.a(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f2026i;
        int size = arrayList3.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList3.get(i5);
            WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
            arrayList2.add(androidx.core.view.q0.f(view));
            androidx.core.view.q0.m(view, null);
        }
        boolean L = j1.L(2);
        ArrayList arrayList4 = this.f2025h;
        if (L) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object sharedElementFirstOutViews = it.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view2 = (View) sharedElementFirstOutViews;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view2);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap2 = androidx.core.view.z0.f1413a;
                sb2.append(androidx.core.view.q0.f(view2));
                Log.v("FragmentManager", sb2.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object sharedElementLastInViews = it2.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view3 = (View) sharedElementLastInViews;
                StringBuilder sb3 = new StringBuilder("View: ");
                sb3.append(view3);
                sb3.append(" Name: ");
                WeakHashMap weakHashMap3 = androidx.core.view.z0.f1413a;
                sb3.append(androidx.core.view.q0.f(view3));
                Log.v("FragmentManager", sb3.toString());
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i10 = 0; i10 < size2; i10++) {
            View view4 = (View) arrayList4.get(i10);
            WeakHashMap weakHashMap4 = androidx.core.view.z0.f1413a;
            String f6 = androidx.core.view.q0.f(view4);
            arrayList5.add(f6);
            if (f6 != null) {
                androidx.core.view.q0.m(view4, null);
                String str = (String) this.j.get(f6);
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i11))) {
                        androidx.core.view.q0.m((View) arrayList3.get(i11), f6);
                        break;
                    }
                    i11++;
                }
            }
        }
        androidx.core.view.z.a(viewGroup, new z1(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        t1.a(arrayList, 0);
        this.f2023f.x(this.f2024g, arrayList4, arrayList3);
    }
}
