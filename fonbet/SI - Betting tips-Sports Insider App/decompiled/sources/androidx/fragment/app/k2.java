package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1988a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1989b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1990c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1991d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1993f;

    public k2(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f1988a = container;
        this.f1989b = new ArrayList();
        this.f1990c = new ArrayList();
    }

    public static final k2 j(ViewGroup container, j1 fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        c1 factory = fragmentManager.J();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof k2) {
            return (k2) tag;
        }
        factory.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        s sVar = new s(container);
        Intrinsics.checkNotNullExpressionValue(sVar, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, sVar);
        return sVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z5;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z5 = true;
            while (it.hasNext()) {
                f2 f2Var = (f2) it.next();
                if (!f2Var.f1912k.isEmpty()) {
                    ArrayList arrayList2 = f2Var.f1912k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((e2) it2.next()).a()) {
                                break;
                            }
                        }
                    }
                }
                z5 = false;
            }
            break loop0;
        }
        if (z5) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                kotlin.collections.z.n(((f2) it3.next()).f1912k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(f2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.f1911i) {
            i2 i2Var = operation.f1903a;
            View requireView = operation.f1905c.requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "operation.fragment.requireView()");
            i2Var.a(requireView, this.f1988a);
            operation.f1911i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z5);

    public final void c(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            kotlin.collections.z.n(((f2) it.next()).f1912k, arrayList);
        }
        List W = CollectionsKt.W(CollectionsKt.Z(arrayList));
        int size = W.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((e2) W.get(i5)).c(this.f1988a);
        }
        int size2 = operations.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((f2) operations.get(i10));
        }
        List W2 = CollectionsKt.W(operations);
        int size3 = W2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            f2 f2Var = (f2) W2.get(i11);
            if (f2Var.f1912k.isEmpty()) {
                f2Var.b();
            }
        }
    }

    public final void d(i2 i2Var, g2 g2Var, p1 p1Var) {
        synchronized (this.f1989b) {
            try {
                Fragment fragment = p1Var.f2041c;
                Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                f2 g10 = g(fragment);
                if (g10 == null) {
                    Fragment fragment2 = p1Var.f2041c;
                    if (!fragment2.mTransitioning && !fragment2.mRemoving) {
                        g10 = null;
                    }
                    Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
                    g10 = h(fragment2);
                }
                if (g10 != null) {
                    g10.d(i2Var, g2Var);
                    return;
                }
                final f2 f2Var = new f2(i2Var, g2Var, p1Var);
                this.f1989b.add(f2Var);
                final int i5 = 0;
                Runnable listener = new Runnable(this) { // from class: androidx.fragment.app.d2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k2 f1890b;

                    {
                        this.f1890b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                k2 this$0 = this.f1890b;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                f2 operation = f2Var;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f1989b.contains(operation)) {
                                    i2 i2Var2 = operation.f1903a;
                                    View view = operation.f1905c.mView;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    i2Var2.a(view, this$0.f1988a);
                                    break;
                                }
                                break;
                            default:
                                k2 this$02 = this.f1890b;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                f2 operation2 = f2Var;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$02.f1989b.remove(operation2);
                                this$02.f1990c.remove(operation2);
                                break;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener, "listener");
                f2Var.f1906d.add(listener);
                final int i10 = 1;
                Runnable listener2 = new Runnable(this) { // from class: androidx.fragment.app.d2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k2 f1890b;

                    {
                        this.f1890b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k2 this$0 = this.f1890b;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                f2 operation = f2Var;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f1989b.contains(operation)) {
                                    i2 i2Var2 = operation.f1903a;
                                    View view = operation.f1905c.mView;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    i2Var2.a(view, this$0.f1988a);
                                    break;
                                }
                                break;
                            default:
                                k2 this$02 = this.f1890b;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                f2 operation2 = f2Var;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$02.f1989b.remove(operation2);
                                this$02.f1990c.remove(operation2);
                                break;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener2, "listener");
                f2Var.f1906d.add(listener2);
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(i2 finalState, p1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (j1.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f2041c);
        }
        d(finalState, g2.f1926b, fragmentStateManager);
    }

    public final void f() {
        boolean z5;
        if (this.f1993f) {
            return;
        }
        if (!this.f1988a.isAttachedToWindow()) {
            i();
            this.f1992e = false;
            return;
        }
        synchronized (this.f1989b) {
            try {
                ArrayList X = CollectionsKt.X(this.f1990c);
                this.f1990c.clear();
                Iterator it = X.iterator();
                while (true) {
                    z5 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    f2 f2Var = (f2) it.next();
                    if (this.f1989b.isEmpty() || !f2Var.f1905c.mTransitioning) {
                        z5 = false;
                    }
                    f2Var.f1909g = z5;
                }
                Iterator it2 = X.iterator();
                while (it2.hasNext()) {
                    f2 f2Var2 = (f2) it2.next();
                    if (this.f1991d) {
                        if (j1.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + f2Var2);
                        }
                        f2Var2.b();
                    } else {
                        if (j1.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + f2Var2);
                        }
                        f2Var2.a(this.f1988a);
                    }
                    this.f1991d = false;
                    if (!f2Var2.f1908f) {
                        this.f1990c.add(f2Var2);
                    }
                }
                if (!this.f1989b.isEmpty()) {
                    n();
                    ArrayList X2 = CollectionsKt.X(this.f1989b);
                    if (X2.isEmpty()) {
                        return;
                    }
                    this.f1989b.clear();
                    this.f1990c.addAll(X2);
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(X2, this.f1992e);
                    boolean k6 = k(X2);
                    Iterator it3 = X2.iterator();
                    boolean z7 = true;
                    while (it3.hasNext()) {
                        if (!((f2) it3.next()).f1905c.mTransitioning) {
                            z7 = false;
                        }
                    }
                    if (!z7 || k6) {
                        z5 = false;
                    }
                    this.f1991d = z5;
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + k6 + " \ntransition = " + z7);
                    }
                    if (!z7) {
                        m(X2);
                        c(X2);
                    } else if (k6) {
                        m(X2);
                        int size = X2.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            a((f2) X2.get(i5));
                        }
                    }
                    this.f1992e = false;
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final f2 g(Fragment fragment) {
        Object obj;
        Iterator it = this.f1989b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f2 f2Var = (f2) obj;
            if (Intrinsics.areEqual(f2Var.f1905c, fragment) && !f2Var.f1907e) {
                break;
            }
        }
        return (f2) obj;
    }

    public final f2 h(Fragment fragment) {
        Object obj;
        Iterator it = this.f1990c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f2 f2Var = (f2) obj;
            if (Intrinsics.areEqual(f2Var.f1905c, fragment) && !f2Var.f1907e) {
                break;
            }
        }
        return (f2) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (j1.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f1988a.isAttachedToWindow();
        synchronized (this.f1989b) {
            try {
                n();
                m(this.f1989b);
                ArrayList X = CollectionsKt.X(this.f1990c);
                Iterator it = X.iterator();
                while (it.hasNext()) {
                    ((f2) it.next()).f1909g = false;
                }
                Iterator it2 = X.iterator();
                while (it2.hasNext()) {
                    f2 f2Var = (f2) it2.next();
                    if (j1.L(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1988a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + f2Var);
                    }
                    f2Var.a(this.f1988a);
                }
                ArrayList X2 = CollectionsKt.X(this.f1989b);
                Iterator it3 = X2.iterator();
                while (it3.hasNext()) {
                    ((f2) it3.next()).f1909g = false;
                }
                Iterator it4 = X2.iterator();
                while (it4.hasNext()) {
                    f2 f2Var2 = (f2) it4.next();
                    if (j1.L(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1988a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + f2Var2);
                    }
                    f2Var2.a(this.f1988a);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        Object obj;
        i2 i2Var;
        synchronized (this.f1989b) {
            try {
                n();
                ArrayList arrayList = this.f1989b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    f2 f2Var = (f2) obj;
                    View view = f2Var.f1905c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        i2Var = i2.f1960d;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            i2Var = i2.f1958b;
                        } else if (visibility == 4) {
                            i2Var = i2.f1960d;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            i2Var = i2.f1959c;
                        }
                    }
                    i2 i2Var2 = f2Var.f1903a;
                    i2 i2Var3 = i2.f1958b;
                    if (i2Var2 == i2Var3 && i2Var != i2Var3) {
                        break;
                    }
                }
                f2 f2Var2 = (f2) obj;
                Fragment fragment = f2Var2 != null ? f2Var2.f1905c : null;
                this.f1993f = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            f2 f2Var = (f2) list.get(i5);
            p1 p1Var = f2Var.f1913l;
            if (!f2Var.f1910h) {
                f2Var.f1910h = true;
                g2 g2Var = f2Var.f1904b;
                if (g2Var == g2.f1926b) {
                    Fragment fragment = p1Var.f2041c;
                    Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                    View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        if (j1.L(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                        }
                    }
                    View requireView = f2Var.f1905c.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        if (j1.L(2)) {
                            Log.v("FragmentManager", "Adding fragment " + fragment + " view " + requireView + " to container in onStart");
                        }
                        p1Var.b();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        if (j1.L(2)) {
                            Log.v("FragmentManager", "Making view " + requireView + " INVISIBLE in onStart");
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + fragment.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (g2Var == g2.f1927c) {
                    Fragment fragment2 = p1Var.f2041c;
                    Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
                    View requireView2 = fragment2.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView2, "fragment.requireView()");
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.z.n(((f2) it.next()).f1912k, arrayList);
        }
        List W = CollectionsKt.W(CollectionsKt.Z(arrayList));
        int size2 = W.size();
        for (int i10 = 0; i10 < size2; i10++) {
            e2 e2Var = (e2) W.get(i10);
            e2Var.getClass();
            ViewGroup container = this.f1988a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!e2Var.f1898a) {
                e2Var.e(container);
            }
            e2Var.f1898a = true;
        }
    }

    public final void n() {
        i2 i2Var;
        Iterator it = this.f1989b.iterator();
        while (it.hasNext()) {
            f2 f2Var = (f2) it.next();
            if (f2Var.f1904b == g2.f1926b) {
                View requireView = f2Var.f1905c.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                int visibility = requireView.getVisibility();
                if (visibility == 0) {
                    i2Var = i2.f1958b;
                } else if (visibility == 4) {
                    i2Var = i2.f1960d;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(visibility, "Unknown visibility "));
                    }
                    i2Var = i2.f1959c;
                }
                f2Var.d(i2Var, g2.f1925a);
            }
        }
    }
}
